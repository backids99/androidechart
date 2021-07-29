package id.bafika.echart.options.style;

import java.io.Serializable;

public class AreaStyle implements Serializable {

    private static final long serialVersionUID = -6547716731700677234L;

    /**
     * opacity
     */
    private Double opacity;
    /**
     * 颜色
     */
    private Object color;
    /**
     * 填充样式，目前仅支持'default'(实填充)
     */
    private Object type;

    /**
     * opacity
     */
    public Object opacity() {
        return this.opacity;
    }

    /**
     * opacity
     *
     * @param opacity
     */
    public AreaStyle opacity(Double opacity) {
        this.opacity = opacity;
        return this;
    }

    /**
     * 获取color值
     */
    public Object color() {
        return this.color;
    }

    /**
     * 设置color值
     *
     * @param color
     */
    public AreaStyle color(Object color) {
        this.color = color;
        return this;
    }

    /**
     * 获取type值
     */
    public Object type() {
        return this.type;
    }

    /**
     * 设置type值
     *
     * @param type
     */
    public AreaStyle type(Object type) {
        this.type = type;
        return this;
    }

    /**
     * 获取typeDefault值
     */
    public AreaStyle typeDefault() {
        this.type = "default";
        return this;
    }

    /**
     * opacity
     */
    public Double getOpacity() {
        return opacity;
    }

    /**
     * opacity
     *
     * @param opacity
     */
    public void setOpacity(Double opacity) {
        this.opacity = opacity;
    }

    /**
     * 获取color值
     */
    public Object getColor() {
        return color;
    }

    /**
     * 设置color值
     *
     * @param color
     */
    public void setColor(Object color) {
        this.color = color;
    }

    /**
     * 获取type值
     */
    public Object getType() {
        return type;
    }

    /**
     * 设置type值
     *
     * @param type
     */
    public void setType(Object type) {
        this.type = type;
    }
}
