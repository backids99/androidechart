package id.bafika.echart.options;

import java.io.Serializable;

import id.bafika.echart.options.code.Position;
import id.bafika.echart.options.style.TextStyle;

public abstract class AbstractLabel<T> implements Serializable {

    private static final long serialVersionUID = -6908403517815789999L;

    /**
     * 是否显示，在Timeline中默认true
     */
    private Boolean show;
    /**
     * 挑选间隔，默认为'auto'，可选为：'auto'（自动隐藏显示不下的） | 0（全部显示） | {number}
     */
    private Object interval;
    /**
     * rotate : 旋转角度，默认为0，不旋转，正值为逆时针，负值为顺时针，可选为：-90 ~ 90
     */
    private Integer rotate;
    /**
     * 间隔名称格式器：{string}（Template） | {Function}
     */
    private Object formatter;
    /**
     * 文字样式（详见）
     */
    private TextStyle textStyle;
    /**
     * 位置
     */
    private Object position;
    /**
     * [Axis有效]坐标轴文本标签是否可点击
     */
    private Boolean clickable;
    /**
     * 坐标轴文本标签与坐标轴的间距
     */
    private Integer margin;
    /**
     * 颜色
     */
    private String color;

    /**
     * 设置textStyle值
     *
     * @param textStyle
     */
    public T textStyle(TextStyle textStyle) {
        this.textStyle = textStyle;
        return (T) this;
    }

    /**
     * 获取show值
     */
    public Boolean show() {
        return this.show;
    }

    /**
     * 设置show值
     *
     * @param show
     */
    public T show(Boolean show) {
        this.show = show;
        return (T) this;
    }

    /**
     * 获取position值
     */
    public Object position() {
        return this.position;
    }

    /**
     * 设置position值
     *
     * @param position
     */
    public T position(Object position) {
        this.position = position;
        return (T) this;
    }

    /**
     * 设置position值
     *
     * @param position
     */
    public T position(Position position) {
        this.position = position;
        return (T) this;
    }

    /**
     * 获取interval值
     */
    public Object interval() {
        return this.interval;
    }

    /**
     * 设置interval值
     *
     * @param interval
     */
    public T interval(Object interval) {
        this.interval = interval;
        return (T) this;
    }

    /**
     * 获取rotate值
     */
    public Integer rotate() {
        return this.rotate;
    }

    /**
     * 设置rotate值
     *
     * @param rotate
     */
    public T rotate(Integer rotate) {
        this.rotate = rotate;
        return (T) this;
    }

    /**
     * 获取clickable值
     */
    public Boolean clickable() {
        return this.clickable;
    }

    /**
     * 设置clickable值
     *
     * @param clickable
     */
    public T clickable(Boolean clickable) {
        this.clickable = clickable;
        return (T) this;
    }

    /**
     * 获取formatter值
     */
    public Object formatter() {
        return this.formatter;
    }

    /**
     * 设置formatter值
     *
     * @param formatter
     */
    public T formatter(Object formatter) {
        this.formatter = formatter;
        return (T) this;
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
    public T color(String color) {
        this.color = color;
        return (T) this;
    }

    /**
     * 文字样式（详见）
     */
    public TextStyle textStyle() {
        if (this.textStyle == null) {
            this.textStyle = new TextStyle();
        }
        return this.textStyle;
    }

    /**
     * 获取margin值
     */
    public Integer margin() {
        return this.margin;
    }

    /**
     * 设置margin值
     *
     * @param margin
     */
    public T margin(Integer margin) {
        this.margin = margin;
        return (T) this;
    }
}
