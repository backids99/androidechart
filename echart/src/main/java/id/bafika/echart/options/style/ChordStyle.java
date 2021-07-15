package id.bafika.echart.options.style;

import java.io.Serializable;

public class ChordStyle implements Serializable {

    private static final long serialVersionUID = -9135284895463659472L;

    /**
     * 贝塞尔曲线的宽度
     */
    private Integer width;
    /**
     * 贝塞尔曲线的颜色
     */
    private String color;
    /**
     * ribbon的描边颜色
     */
    private String borderColor;
    /**
     * ribbon的描边线宽
     */
    private Integer borderWidth;
    /**
     * 透明度
     */
    private Double opacity;

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
    public ChordStyle color(String color) {
        this.color = color;
        return this;
    }

    /**
     * 获取color值
     */
    public Double opacity() {
        return this.opacity;
    }

    /**
     * 设置color值
     *
     * @param opacity
     */
    public ChordStyle opacity(Double opacity) {
        this.opacity = opacity;
        return this;
    }

    /**
     * 获取borderColor值
     */
    public String borderColor() {
        return this.borderColor;
    }

    /**
     * 设置borderColor值
     *
     * @param borderColor
     */
    public ChordStyle borderColor(String borderColor) {
        this.borderColor = borderColor;
        return this;
    }

    /**
     * 获取width值
     */
    public Integer width() {
        return this.width;
    }

    /**
     * 设置width值
     *
     * @param width
     */
    public ChordStyle width(Integer width) {
        this.width = width;
        return this;
    }

    /**
     * 获取borderWidth值
     */
    public Integer borderWidth() {
        return this.borderWidth;
    }

    /**
     * 设置borderWidth值
     *
     * @param borderWidth
     */
    public ChordStyle borderWidth(Integer borderWidth) {
        this.borderWidth = borderWidth;
        return this;
    }

    /**
     * 获取borderColor值
     */
    public String getBorderColor() {
        return borderColor;
    }

    /**
     * 设置borderColor值
     *
     * @param borderColor
     */
    public void setBorderColor(String borderColor) {
        this.borderColor = borderColor;
    }

    /**
     * 获取borderWidth值
     */
    public Integer getBorderWidth() {
        return borderWidth;
    }

    /**
     * 设置borderWidth值
     *
     * @param borderWidth
     */
    public void setBorderWidth(Integer borderWidth) {
        this.borderWidth = borderWidth;
    }

    /**
     * 获取width值
     */
    public Integer getWidth() {
        return width;
    }

    /**
     * 设置width值
     *
     * @param width
     */
    public void setWidth(Integer width) {
        this.width = width;
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
     * 获取opacity值
     */
    public Double getOpacity() {
        return opacity;
    }

    /**
     * 设置opacity值
     *
     * @param opacity
     */
    public void setOpacity(Double opacity) {
        this.opacity = opacity;
    }
}
