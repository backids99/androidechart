package id.bafika.echart.options.style;

import java.io.Serializable;

public class ShadowStyle implements Serializable {

    private static final long serialVersionUID = -1996366699438984171L;

    /**
     * 阴影颜色
     */
    private String color;
    /**
     * 默认auto，阴影大小
     */
    private Object width;
    /**
     * 填充方式，默认只有default
     */
    private String type;

    /**
     * 获取color值
     */
    public String color() {
        return this.color;
    }

    /**
     * 设置color值
     *
     * @param color
     */
    public ShadowStyle color(String color) {
        this.color = color;
        return this;
    }

    /**
     * 获取width值
     */
    public Object width() {
        return this.width;
    }

    /**
     * 设置width值
     *
     * @param width
     */
    public ShadowStyle width(Object width) {
        this.width = width;
        return this;
    }

    /**
     * 获取type值
     */
    public String type() {
        return this.type;
    }

    /**
     * 设置type值
     *
     * @param type
     */
    public ShadowStyle type(String type) {
        this.type = type;
        return this;
    }

    /**
     * 获取typeDefault值
     */
    public ShadowStyle typeDefault() {
        this.type = "default";
        return this;
    }

    /**
     * 获取color值
     */
    public String getColor() {
        return color;
    }

    /**
     * 设置color值
     *
     * @param color
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * 获取width值
     */
    public Object getWidth() {
        return width;
    }

    /**
     * 设置width值
     *
     * @param width
     */
    public void setWidth(Object width) {
        this.width = width;
    }

    /**
     * 获取type值
     */
    public String getType() {
        return type;
    }

    /**
     * 设置type值
     *
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }
}
