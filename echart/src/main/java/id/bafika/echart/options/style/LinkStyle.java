package id.bafika.echart.options.style;

import java.io.Serializable;

import id.bafika.echart.options.code.LinkType;

public class LinkStyle implements Serializable {

    private static final long serialVersionUID = -547421614869188616L;

    /**
     * 线条类型，可选为：'curve'（曲线） | 'line'（直线）
     */
    private LinkType type;
    /**
     * 线条颜色
     */
    private String borderColor;
    /**
     * 线宽
     */
    private Integer borderWidth;

    /**
     * 获取type值
     */
    public LinkType type() {
        return this.type;
    }

    /**
     * 设置type值
     *
     * @param type
     */
    public LinkStyle type(LinkType type) {
        this.type = type;
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
    public LinkStyle borderColor(String borderColor) {
        this.borderColor = borderColor;
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
    public LinkStyle borderWidth(Integer borderWidth) {
        this.borderWidth = borderWidth;
        return this;
    }

    /**
     * 获取type值
     */
    public LinkType getType() {
        return type;
    }

    /**
     * 设置type值
     *
     * @param type
     */
    public void setType(LinkType type) {
        this.type = type;
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
}
