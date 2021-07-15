package id.bafika.echart.options.series.gauge;

import java.io.Serializable;

public class Pointer implements Serializable {

    private static final long serialVersionUID = 2575834098541231673L;

    /**
     * 属性length控制线长，百分比相对的是仪表盘的外半径
     */
    private Object length;
    /**
     * 属性width控制指针最宽处，
     */
    private Object width;
    /**
     * 属性color控制指针颜色
     */
    private String color;

    /**
     * 获取length值
     */
    public Object length() {
        return this.length;
    }

    /**
     * 设置length值
     *
     * @param length
     */
    public Pointer length(Object length) {
        this.length = length;
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
    public Pointer width(Object width) {
        this.width = width;
        return this;
    }

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
    public Pointer color(String color) {
        this.color = color;
        return this;
    }

    /**
     * 获取length值
     */
    public Object getLength() {
        return length;
    }

    /**
     * 设置length值
     *
     * @param length
     */
    public void setLength(Object length) {
        this.length = length;
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
}
