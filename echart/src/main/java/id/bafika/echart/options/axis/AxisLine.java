package id.bafika.echart.options.axis;

import java.io.Serializable;

import id.bafika.echart.options.style.LineStyle;

public class AxisLine implements Serializable {

    private static final long serialVersionUID = -7486014114670118509L;

    /**
     * 默认显示，属性show控制显示与否
     */
    private Boolean show;
    /**
     * 定位到垂直方向的0值坐标上
     */
    private Boolean onZero;
    /**
     * {color: '#48b', width: 2, type: 'solid'}
     *
     * @see LineStyle
     */
    private LineStyle lineStyle;

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
    public AxisLine show(Boolean show) {
        this.show = show;
        return this;
    }

    /**
     * 获取onZero值
     */
    public Boolean onZero() {
        return this.onZero;
    }

    /**
     * 设置onZero值
     *
     * @param onZero
     */
    public AxisLine onZero(Boolean onZero) {
        this.onZero = onZero;
        return this;
    }

    /**
     * {color: '#48b', width: 2, type: 'solid'}
     *
     * @see LineStyle
     */
    public LineStyle lineStyle() {
        if (this.lineStyle == null) {
            this.lineStyle = new LineStyle();
        }
        return this.lineStyle;
    }

    /**
     * 设置lineStyle值
     *
     * @param lineStyle
     */
    public AxisLine lineStyle(LineStyle lineStyle) {
        this.lineStyle = lineStyle;
        return this;
    }
}
