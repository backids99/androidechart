package id.bafika.echart.options.data;

import java.io.Serializable;

import id.bafika.echart.options.style.TextStyle;

public class LegendData implements Serializable {

    private static final long serialVersionUID = 7218201600361155091L;

    /**
     * 名称
     */
    private String name;
    /**
     * 文字样式
     *
     * @see TextStyle
     */
    private TextStyle textStyle;
    /**
     * 图标
     */
    private String icon;

    /**
     * 构造函数,参数:name
     *
     * @param name
     */
    public LegendData(String name) {
        this.name = name;
    }

    /**
     * 构造函数,参数:name,textStyle
     *
     * @param name
     * @param textStyle
     */
    public LegendData(String name, TextStyle textStyle) {
        this.name = name;
        this.textStyle = textStyle;
    }

    /**
     * 构造函数,参数:name,textStyle,icon
     *
     * @param name
     * @param textStyle
     * @param icon
     */
    public LegendData(String name, TextStyle textStyle, String icon) {
        this.name = name;
        this.textStyle = textStyle;
        this.icon = icon;
    }

    /**
     * 获取name值
     */
    public String name() {
        return this.name;
    }

    /**
     * 设置name值
     *
     * @param name
     */
    public LegendData name(String name) {
        this.name = name;
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
    public LegendData textStyle(TextStyle textStyle) {
        this.textStyle = textStyle;
        return this;
    }

    /**
     * 获取icon值
     */
    public String icon() {
        return this.icon;
    }

    /**
     * 设置icon值
     *
     * @param icon
     */
    public LegendData icon(String icon) {
        this.icon = icon;
        return this;
    }
}
