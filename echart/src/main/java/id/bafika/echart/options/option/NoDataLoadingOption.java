package id.bafika.echart.options.option;

import id.bafika.echart.options.code.LoadingEffect;
import id.bafika.echart.options.style.TextStyle;

public class NoDataLoadingOption {
    private String text;
    private Object x;
    private Object y;
    /**
     * 显示话术的文本样式
     */
    private TextStyle textStyle;
    /**
     * loading效果，可以参考LoadingEffect
     */
    private Object effect;
    /**
     * loading效果选项，详见zrender
     */
    private EffectOption effectOption;
    /**
     * 指定当前进度[0~1]，个别效果有效
     */
    private Integer progress;

    /**
     * 获取text值
     */
    public String text() {
        return this.text;
    }

    /**
     * 设置text值
     *
     * @param text
     */
    public NoDataLoadingOption text(String text) {
        this.text = text;
        return this;
    }

    /**
     * 获取x值
     */
    public Object x() {
        return this.x;
    }

    /**
     * 设置x值
     *
     * @param x
     */
    public NoDataLoadingOption x(Object x) {
        this.x = x;
        return this;
    }

    /**
     * 获取y值
     */
    public Object y() {
        return this.y;
    }

    /**
     * 设置y值
     *
     * @param y
     */
    public NoDataLoadingOption y(Object y) {
        this.y = y;
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

    /**
     * 设置textStyle值
     *
     * @param textStyle
     */
    public NoDataLoadingOption textStyle(TextStyle textStyle) {
        this.textStyle = textStyle;
        return this;
    }

    /**
     * 获取effect值
     */
    public Object effect() {
        return this.effect;
    }

    /**
     * 设置effect值
     *
     * @param effect
     */
    public NoDataLoadingOption effect(Object effect) {
        this.effect = effect;
        return this;
    }

    /**
     * 设置effect值
     *
     * @param effect
     */
    public NoDataLoadingOption effect(LoadingEffect effect) {
        this.effect = effect;
        return this;
    }

    /**
     * 获取effectOption值
     */
    public EffectOption effectOption() {
        if (this.effectOption == null) {
            this.effectOption = new EffectOption();
        }
        return this.effectOption;
    }

    /**
     * 设置effectOption值
     *
     * @param effectOption
     */
    public NoDataLoadingOption effectOption(EffectOption effectOption) {
        this.effectOption = effectOption;
        return this;
    }

    /**
     * 获取progress值
     */
    public Integer progress() {
        return this.progress;
    }

    /**
     * 设置progress值
     *
     * @param progress
     */
    public NoDataLoadingOption progress(Integer progress) {
        this.progress = progress;
        return this;
    }
}
