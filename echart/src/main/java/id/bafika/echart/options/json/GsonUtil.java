package id.bafika.echart.options.json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import id.bafika.echart.options.Option;
import id.bafika.echart.options.axis.Axis;
import id.bafika.echart.options.series.Series;

public class GsonUtil {

    /**
     * 格式化对象为Json
     *
     * @param object
     * @return
     */
    public static String format(Object object) {
        Gson gson = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
        String prettyJsonString = gson.toJson(object);
        //简单处理function
        String[] lines = prettyJsonString.split("\n");
        lines = replaceEchartQuote(lines);
        lines = replaceFunctionQuote(lines);
        StringBuilder stringBuilder = new StringBuilder();
        for (String line : lines) {
            stringBuilder.append(line);
        }
        return stringBuilder.toString().replaceAll("\\\\\"", "\"");
    }

    /**
     * 格式化对象为Json
     *
     * @param object
     * @return
     */
    public static String prettyFormat(Object object) {
        Gson gson = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
        String prettyJsonString = gson.toJson(object);
        //简单处理function
        String[] lines = prettyJsonString.split("\n");
        lines = replaceEchartQuote(lines);
        lines = replaceFunctionQuote(lines);
        StringBuilder stringBuilder = new StringBuilder();
        for (String line : lines) {
            stringBuilder.append(line + "\n");
        }
        return stringBuilder.toString();
    }

    public static String[] replaceEchartQuote(String[] lines) {
        boolean echart = false;
        for (int i = 0; i < lines.length; i++) {
            String line = lines[i].trim();
            if (!echart && line.contains("\"new")) {
                echart = true;
                line = line.replaceAll("\"new", "new");
            }
            if (echart && line.contains(")\"")) {
                echart = false;
                line = line.replaceAll("\\)\"", "\\)");
            }

            lines[i] = line;
        }
        return lines;
    }

    /**
     * 处理字符串中的function和(function(){})()，除{}中的代码外，其他地方不允许有空格
     *
     * @param lines
     * @return
     */
    public static String[] replaceFunctionQuote(String[] lines) {
        boolean function = false;
        boolean immediately = false;
        for (int i = 0; i < lines.length; i++) {
            String line = lines[i].trim();
            if (!function && line.contains("\"function")) {
                function = true;
                line = line.replaceAll("\"function", "function");
            }
            if (function && line.contains("}\"")) {
                function = false;
                line = line.replaceAll("\\}\"", "\\}");
            }

            if (!immediately && line.contains("\"(function")) {
                immediately = true;
                line = line.replaceAll("\"\\(function", "\\(function");
            }
            if (immediately && line.contains("})()\"")) {
                immediately = false;
                line = line.replaceAll("\\}\\)\\(\\)\"", "\\}\\)\\(\\)");
            }
            lines[i] = line;
        }
        return lines;
    }

    /**
     * 反序列化
     *
     * @param json
     * @param type
     * @param <T>
     * @return
     */
    public static <T extends Option> T fromJSON(String json, Class<T> type) {
        Gson gson = new GsonBuilder().setPrettyPrinting().
                registerTypeAdapter(Series.class, new SeriesDeserializer()).
                registerTypeAdapter(Axis.class, new AxisDeserializer()).create();
        return gson.fromJson(json, type);
    }

    /**
     * 反序列化
     *
     * @param json
     * @return
     */
    public static Option fromJSON(String json) {
        Gson gson = new GsonBuilder().setPrettyPrinting().
                registerTypeAdapter(Series.class, new SeriesDeserializer()).
                registerTypeAdapter(Axis.class, new AxisDeserializer()).create();
        return gson.fromJson(json, Option.class);
    }

    /**
     * 输出Json
     *
     * @param object
     * @return
     */
    public static void print(Object object) {
        System.out.println(format(object));
    }

    /**
     * 输出Json
     *
     * @param object
     * @return
     */
    public static void printPretty(Object object) {
        System.out.println(prettyFormat(object));
    }


}
