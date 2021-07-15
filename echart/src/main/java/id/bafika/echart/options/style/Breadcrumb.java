package id.bafika.echart.options.style;

import java.io.Serializable;

import id.bafika.echart.options.code.X;
import id.bafika.echart.options.code.Y;

public class Breadcrumb implements Serializable {
    private static final long serialVersionUID = 1L;
    private Boolean show;
    /**
     * treemap 组件离容器左侧的距离
     */
    private Object left;
    /**
     * treemap 组件离容器上侧的距离
     */
    private Object top;
    /**
     * treemap 组件离容器右侧的距离
     */
    private Object right;
    /**
     * treemap 组件离容器下侧的距离
     */
    private Object bottom;
    /**
     * treemap 组件的宽度
     */
    private Object width;
    /**
     * treemap 组件的高度
     */
    private Object height;
    /**
     * 图形样式
     *
     */
    private ItemStyle itemStyle;
    /**
     * 样式
     */
    private TextStyle textStyle;

    /**
     * 构造函数
     */
    public Breadcrumb() {
    }

    /**
     * 构造函数,参数:show
     *
     * @param show
     */
    public Breadcrumb(Boolean show) {
        this.show = show;
    }

    /**
     * 构造函数,参数:show,textStyle
     *
     * @param show
     * @param textStyle
     */
    public Breadcrumb(Boolean show, TextStyle textStyle) {
        this.show = show;
        this.textStyle = textStyle;
    }

    public ItemStyle itemStyle() {
        if (this.itemStyle == null) {
            this.itemStyle = new ItemStyle();
        }
        return this.itemStyle;
    }

    public Breadcrumb itemStyle(ItemStyle itemStyle) {
        this.itemStyle = itemStyle;
        return this;
    }

    /**
     * 设置show值
     *
     * @param show
     */
    public Breadcrumb show(Boolean show) {
        this.show = show;
        return this;
    }

    /**
     * 获取show值
     */
    public Boolean show() {
        return this.show;
    }

    /**
     * 设置textStyle值
     *
     * @param textStyle
     */
    public Breadcrumb textStyle(TextStyle textStyle) {
        this.textStyle = textStyle;
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

    public Object left() {
        return this.left;
    }

    public Breadcrumb left(Object left) {
        this.left = left;
        return this;
    }

    public Breadcrumb left(Integer left) {
        this.left = left;
        return this;
    }

    public Breadcrumb left(X left) {
        this.left = left;
        return this;
    }

    public Object top() {
        return this.top;
    }

    public Breadcrumb top(Object top) {
        this.top = top;
        return this;
    }

    public Breadcrumb top(Integer top) {
        this.top = top;
        return this;
    }

    public Breadcrumb top(Y top) {
        this.top = top;
        return this;
    }

    public Object right() {
        return this.right;
    }

    public Breadcrumb right(Object right) {
        this.right = right;
        return this;
    }

    public Breadcrumb right(Integer right) {
        this.right = right;
        return this;
    }

    public Object bottom() {
        return this.bottom;
    }

    public Breadcrumb bottom(Object bottom) {
        this.bottom = bottom;
        return this;
    }

    public Breadcrumb bottom(Integer bottom) {
        this.bottom = bottom;
        return this;
    }

    public Object width() {
        return this.width;
    }

    public Breadcrumb width(Object width) {
        this.width = width;
        return this;
    }

    public Breadcrumb width(Integer width) {
        this.width = width;
        return this;
    }

    public Object height() {
        return this.height;
    }

    public Breadcrumb height(Object height) {
        this.height = height;
        return this;
    }

    public Breadcrumb height(Integer height) {
        this.height = height;
        return this;
    }

    public Boolean getShow() {
        return show;
    }

    public void setShow(Boolean show) {
        this.show = show;
    }

    public Object getLeft() {
        return left;
    }

    public void setLeft(Object left) {
        this.left = left;
    }

    public Object getTop() {
        return top;
    }

    public void setTop(Object top) {
        this.top = top;
    }

    public Object getRight() {
        return right;
    }

    public void setRight(Object right) {
        this.right = right;
    }

    public Object getBottom() {
        return bottom;
    }

    public void setBottom(Object bottom) {
        this.bottom = bottom;
    }

    public Object getWidth() {
        return width;
    }

    public void setWidth(Object width) {
        this.width = width;
    }

    public Object getHeight() {
        return height;
    }

    public void setHeight(Object height) {
        this.height = height;
    }

    public ItemStyle getItemStyle() {
        return itemStyle;
    }

    public void setItemStyle(ItemStyle itemStyle) {
        this.itemStyle = itemStyle;
    }

    public TextStyle getTextStyle() {
        return textStyle;
    }

    public void setTextStyle(TextStyle textStyle) {
        this.textStyle = textStyle;
    }
}
