package id.bafika.echart.options;

import java.io.Serializable;

import id.bafika.echart.options.code.PointerType;
import id.bafika.echart.options.style.CrossStyle;
import id.bafika.echart.options.style.LineStyle;
import id.bafika.echart.options.style.ShadowStyle;
import id.bafika.echart.options.style.TextStyle;

public class AxisPointer implements Serializable {

    private static final long serialVersionUID = 6421899185681683630L;

    /**
     * 是否显示
     */
    private Boolean show;

    /**
     * 默认为直线，可选为：'line' | 'shadow' | 'cross'
     *
     */
    private PointerType type;
    /**
     * 设置直线指示器
     *
     */
    private LineStyle lineStyle;
    /**
     * 设置十字准星指示器
     */
    private CrossStyle crossStyle;
    /**
     * 设置阴影指示器
     */
    private ShadowStyle shadowStyle;
    /**
     * 文本样式
     */
    private TextStyle textStyle;

    /**
     * 获取textStyle值
     */
    public TextStyle textStyle() {
        return this.textStyle;
    }

    /**
     * 设置textStyle值
     *
     * @param textStyle
     */
    public AxisPointer textStyle(TextStyle textStyle) {
        if (this.textStyle == null) {
            this.textStyle = new TextStyle();
        }
        this.textStyle = textStyle;
        return this;
    }

    /**
     * 设置lineStyle值
     *
     * @param lineStyle
     */
    public AxisPointer lineStyle(LineStyle lineStyle) {
        this.lineStyle = lineStyle;
        return this;
    }

    /**
     * 设置crossStyle值
     *
     * @param crossStyle
     */
    public AxisPointer crossStyle(CrossStyle crossStyle) {
        this.crossStyle = crossStyle;
        return this;
    }

    /**
     * 设置shadowStyle值
     *
     * @param shadowStyle
     */
    public AxisPointer shadowStyle(ShadowStyle shadowStyle) {
        this.shadowStyle = shadowStyle;
        return this;
    }

    /**
     * 获取type值
     */
    public PointerType type() {
        return this.type;
    }

    /**
     * 设置type值
     *
     * @param type
     */
    public AxisPointer type(PointerType type) {
        this.type = type;
        return this;
    }

    /**
     * 是否显示
     */
    public Boolean show(){
        return this.show;
    }

    /**
     * 设置是否显示
     */
    public AxisPointer show(Boolean show){
        this.show = show;
        return this;
    }

    /**
     * 设置直线指示器
     *
     */
    public LineStyle lineStyle() {
        if (this.lineStyle == null) {
            this.lineStyle = new LineStyle();
        }
        return this.lineStyle;
    }

    /**
     * 设置十字准星指示器
     */
    public CrossStyle crossStyle() {
        if (this.crossStyle == null) {
            this.crossStyle = new CrossStyle();
        }
        return this.crossStyle;
    }

    /**
     * 设置阴影指示器
     */
    public ShadowStyle shadowStyle() {
        if (this.shadowStyle == null) {
            this.shadowStyle = new ShadowStyle();
        }
        return this.shadowStyle;
    }
}
