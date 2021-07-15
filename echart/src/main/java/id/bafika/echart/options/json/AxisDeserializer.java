package id.bafika.echart.options.json;

import com.google.gson.*;

import java.lang.reflect.Type;

import id.bafika.echart.options.axis.Axis;
import id.bafika.echart.options.axis.CategoryAxis;
import id.bafika.echart.options.axis.TimeAxis;
import id.bafika.echart.options.axis.ValueAxis;
import id.bafika.echart.options.code.AxisType;

public class AxisDeserializer implements JsonDeserializer<Axis> {
    /**
     * 设置json,typeOfT,context值
     *
     * @param json
     * @param typeOfT
     * @param context
     */
    @Override
    public Axis deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        final JsonObject jsonObject = json.getAsJsonObject();
        String _type = jsonObject.get("type").getAsString();
        AxisType type = AxisType.valueOf(_type);
        Axis axis = null;
        switch (type) {
            case category:
                axis = context.deserialize(jsonObject, CategoryAxis.class);
                break;
            case value:
                axis = context.deserialize(jsonObject, ValueAxis.class);
                break;
            case time:
                axis = context.deserialize(jsonObject, TimeAxis.class);
                break;
        }
        return axis;
    }
}
