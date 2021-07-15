package id.bafika.echart.options.style;

import java.io.Serializable;

import id.bafika.echart.options.code.Baseline;
import id.bafika.echart.options.code.FontStyle;
import id.bafika.echart.options.code.X;

public class TextStyle implements Serializable {

    private static final long serialVersionUID = 5748410562515851843L;

    /**
     * 颜色
     */
    private String color;
    /**
     * 水平对齐方式，可选为：'left' | 'right' | 'center'
     *
     */
    private X align;
    /**
     * 垂直对齐方式
     */
    private Baseline baseline;
    /**
     * 修饰，仅对tooltip.textStyle生效
     */
    private String decoration;
    /**
     * 字号 ，单位px
     */
    private Integer fontSize;
    /**
     * 字体系列
     */
    private String fontFamily;
    /**
     * 字体系列
     * IE8- 字体模糊并且，不支持不同字体混排，额外指定一份
     */
    private String fontFamily2;
    /**
     * 样式，可选为：'normal' | 'italic' | 'oblique'
     */
    private FontStyle fontStyle;
    /**
     * 粗细，可选为：'normal' | 'bold' | 'bolder' | 'lighter' | 100 | 200 |... | 900
     *
     */
    private Object fontWeight;
    /**
     * 背景色
     */
    private String backgroundColor;
    /**
     * 文字块的圆角
     */
    private Object borderRadius;
    /**
     * 边距
     */
    private Object padding;


    /**
     * 获取baseline值
     */
    public Baseline baseline() {
        return this.baseline;
    }

    /**
     * 设置baseline值
     *
     * @param baseline
     */
    public TextStyle baseline(Baseline baseline) {
        this.baseline = baseline;
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
    public TextStyle color(String color) {
        this.color = color;
        return this;
    }

    /**
     * 获取decoration值
     */
    public String decoration() {
        return this.decoration;
    }

    /**
     * 设置decoration值
     *
     * @param decoration
     */
    public TextStyle decoration(String decoration) {
        this.decoration = decoration;
        return this;
    }

    /**
     * 获取align值
     */
    public X align() {
        return this.align;
    }

    /**
     * 设置align值
     *
     * @param align
     */
    public TextStyle align(X align) {
        this.align = align;
        return this;
    }

    /**
     * 获取fontSize值
     */
    public Integer fontSize() {
        return this.fontSize;
    }

    /**
     * 设置fontSize值
     *
     * @param fontSize
     */
    public TextStyle fontSize(Integer fontSize) {
        this.fontSize = fontSize;
        return this;
    }

    /**
     * 获取fontFamily值
     */
    public String fontFamily() {
        return this.fontFamily;
    }

    /**
     * 设置fontFamily值
     *
     * @param fontFamily
     */
    public TextStyle fontFamily(String fontFamily) {
        this.fontFamily = fontFamily;
        return this;
    }

    /**
     * 获取fontFamily2值
     */
    public String fontFamily2() {
        return this.fontFamily2;
    }

    /**
     * 设置fontFamily2值
     *
     * @param fontFamily2
     */
    public TextStyle fontFamily2(String fontFamily2) {
        this.fontFamily2 = fontFamily2;
        return this;
    }

    /**
     * 获取fontStyle值
     */
    public FontStyle fontStyle() {
        return this.fontStyle;
    }

    /**
     * 设置fontStyle值
     *
     * @param fontStyle
     */
    public TextStyle fontStyle(FontStyle fontStyle) {
        this.fontStyle = fontStyle;
        return this;
    }

    /**
     * 获取fontWeight值
     */
    public Object fontWeight() {
        return this.fontWeight;
    }

    /**
     * 设置fontWeight值
     *
     * @param fontWeight
     */
    public TextStyle fontWeight(Object fontWeight) {
        this.fontWeight = fontWeight;
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
     * 获取decoration值
     */
    public String getDecoration() {
        return decoration;
    }

    /**
     * 设置decoration值
     *
     * @param decoration
     */
    public void setDecoration(String decoration) {
        this.decoration = decoration;
    }

    /**
     * 获取align值
     */
    public X getAlign() {
        return align;
    }

    /**
     * 设置align值
     *
     * @param align
     */
    public void setAlign(X align) {
        this.align = align;
    }

    /**
     * 获取fontSize值
     */
    public Integer getFontSize() {
        return fontSize;
    }

    /**
     * 设置fontSize值
     *
     * @param fontSize
     */
    public void setFontSize(Integer fontSize) {
        this.fontSize = fontSize;
    }

    /**
     * 获取fontFamily值
     */
    public String getFontFamily() {
        return fontFamily;
    }

    /**
     * 设置fontFamily值
     *
     * @param fontFamily
     */
    public void setFontFamily(String fontFamily) {
        this.fontFamily = fontFamily;
    }

    /**
     * 获取fontFamily2值
     */
    public String getFontFamily2() {
        return fontFamily2;
    }

    /**
     * 设置fontFamily2值
     *
     * @param fontFamily2
     */
    public void setFontFamily2(String fontFamily2) {
        this.fontFamily2 = fontFamily2;
    }

    /**
     * 获取fontStyle值
     */
    public FontStyle getFontStyle() {
        return fontStyle;
    }

    /**
     * 设置fontStyle值
     *
     * @param fontStyle
     */
    public void setFontStyle(FontStyle fontStyle) {
        this.fontStyle = fontStyle;
    }

    /**
     * 获取fontWeight值
     */
    public Object getFontWeight() {
        return fontWeight;
    }

    /**
     * 设置fontWeight值
     *
     * @param fontWeight
     */
    public void setFontWeight(Object fontWeight) {
        this.fontWeight = fontWeight;
    }

    /**
     * 获取baseline值
     */
    public Baseline getBaseline() {
        return baseline;
    }

    /**
     * 设置baseline值
     *
     * @param baseline
     */
    public void setBaseline(Baseline baseline) {
        this.baseline = baseline;
    }

    /**
     * 背景色
     *
     * @param backgroundColor
     * @return
     */
    public TextStyle backgroundColor(String backgroundColor) {
        this.backgroundColor = backgroundColor;
        return this;
    }

    /**
     * 文字块的圆角
     *
     * @param borderRadius
     * @return
     */
    public TextStyle borderRadius(Object borderRadius) {
        this.borderRadius = borderRadius;
        return this;
    }

    /**
     * 边距
     *
     * @param padding
     * @return
     */
    public TextStyle padding(Object padding) {
        this.padding = padding;
        return this;
    }

}
