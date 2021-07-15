package id.bafika.echart.options.feature;

import java.util.HashMap;
import java.util.Map;

import id.bafika.echart.options.code.LineType;
import id.bafika.echart.options.style.LineStyle;

@SuppressWarnings("unchecked")
public class Mark extends Feature {
    /**
     * 构造函数
     */
    public Mark() {
        this.show(true);
        Map title = new HashMap<String, String>();
        title.put("mark", "辅助线开关");
        title.put("markUndo", "删除辅助线");
        title.put("markClear", "清空辅助线");
        this.title(title);
        this.lineStyle(new LineStyle());
        this.lineStyle().width(2);
        this.lineStyle().color("#1e90ff");
        this.lineStyle().type(LineType.dashed);
    }
}
