package id.bafika.echart.options.data;

import java.io.Serializable;

import id.bafika.echart.options.style.TextStyle;

public class AxisData implements Serializable {

    private static final long serialVersionUID = -6515942952591477027L;

    /**
     * 值
     */
    private Object value;
    /**
     * 特殊样式
     *
     * @see TextStyle
     */
    private TextStyle textStyle;

    /**
     * 构造函数,参数:value
     *
     * @param value
     */
    public AxisData(Object value) {
        this.value = value;
    }

    /**
     * 构造函数,参数:value,textStyle
     *
     * @param value
     * @param textStyle
     */
    public AxisData(Object value, TextStyle textStyle) {
        this.value = value;
        this.textStyle = textStyle;
    }

    /**
     * 获取value值
     */
    public Object value() {
        return this.value;
    }

    /**
     * 设置value值
     *
     * @param value
     */
    public AxisData value(Object value) {
        this.value = value;
        return this;
    }

    /**
     * 获取textStyle值
     */
    public TextStyle textStyle() {
        if (this.textStyle == null) {
            this.textStyle = new TextStyle();
        }
        return this.textStyle;
    }

    /**
     * 设置textStyle值
     *
     * @param textStyle
     */
    public AxisData textStyle(TextStyle textStyle) {
        this.textStyle = textStyle;
        return this;
    }
}
