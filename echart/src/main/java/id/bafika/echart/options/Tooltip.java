package id.bafika.echart.options;

import id.bafika.echart.options.code.Position;
import id.bafika.echart.options.code.Trigger;
import id.bafika.echart.options.code.TriggerOn;
import id.bafika.echart.options.style.TextStyle;

public class Tooltip extends Basic<Tooltip> implements Component {
    /**
     * tooltip主体内容显示策略，只需tooltip触发事件或显示axisPointer而不需要显示内容时可配置该项为falase，
     * 可选为：true（显示） | false（隐藏）
     */
    private Boolean showContent;
    /**
     * 触发类型，默认数据触发，见下图，可选为：'item' | 'axis'
     *
     */
    private Trigger trigger;
    /**
     * 提示框触发的条件
     */
    private TriggerOn triggerOn;
    /**
     * 提示框浮层的位置，默认不设置时位置会跟随鼠标的位置
     */
    private Object position;
    /**
     * 位置指定，传入{Array}，如[x, y]， 固定位置[x, y]；传入{Function}，如function([x, y]) {return [newX,newY]}，默认显示坐标为输入参数，用户指定的新坐标为输出返回。
     */
    private Object formatter;
    /**
     * 内容格式器：{string}（Template） | {Function}，支持异步回调见表格下方
     */
    private String islandFormatter;
    /**
     * 默认20，显示延迟，添加显示延迟可以避免频繁切换，特别是在详情内容需要异步获取的场景，单位ms
     */
    private Integer showDelay;
    /**
     * 默认100，隐藏延迟，单位ms
     */
    private Integer hideDelay;
    /**
     * 动画变换时长，单位s，如果你希望tooltip的跟随实时响应，showDelay设置为0是关键，同时transitionDuration设0也会有交互体验上的差别
     */
    private Double transitionDuration;
    /**
     * 2.1.9新增属性，默认true，鼠标是否可进入详情气泡中，默认为false，如需详情内交互，如添加链接，按钮，可设置为true。
     *
     * @since 2.1.9
     */
    private Boolean enterable;
    /**
     * 提示边框圆角，单位px，默认为4
     */
    private Integer borderRadius;
    /**
     * 坐标轴指示器，坐标轴触发有效
     */
    private AxisPointer axisPointer;
    /**
     * 文本样式，默认为白色字体
     *
     */
    private TextStyle textStyle;
    /**
     * 是否永远显示提示框内容，默认情况下在移出可触发提示框区域后 一定时间 后隐藏，设置为 true 可以保证一直显示提示框内容
     *
     * @since 3.0
     */
    private Boolean alwaysShowContent;

    public Boolean alwaysShowContent() {
        return this.alwaysShowContent;
    }

    public Tooltip alwaysShowContent(Boolean alwaysShowContent) {
        this.alwaysShowContent = alwaysShowContent;
        return this;
    }
    public TriggerOn triggerOn() {
        return this.triggerOn;
    }

    public Tooltip triggerOn(TriggerOn triggerOn) {
        this.triggerOn = triggerOn;
        return this;
    }
    /**
     * 设置axisPointer值
     *
     * @param axisPointer
     */
    public Tooltip axisPointer(AxisPointer axisPointer) {
        this.axisPointer = axisPointer;
        return this;
    }

    /**
     * 设置textStyle值
     *
     * @param textStyle
     */
    public Tooltip textStyle(TextStyle textStyle) {
        this.textStyle = textStyle;
        return this;
    }

    /**
     * 获取showContent值
     */
    public Boolean showContent() {
        return this.showContent;
    }

    /**
     * 设置showContent值
     *
     * @param showContent
     */
    public Tooltip showContent(Boolean showContent) {
        this.showContent = showContent;
        return this;
    }

    /**
     * 获取trigger值
     */
    public Trigger trigger() {
        return this.trigger;
    }

    /**
     * 设置trigger值
     *
     * @param trigger
     */
    public Tooltip trigger(Trigger trigger) {
        this.trigger = trigger;
        return this;
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
    public Tooltip position(Object position) {
        this.position = position;
        return this;
    }

    /**
     * 设置position值
     *
     * @param position
     */
    public Tooltip position(Position position) {
        this.position = position;
        return this;
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
    public Tooltip formatter(Object formatter) {
        this.formatter = formatter;
        return this;
    }

    /**
     * 获取islandFormatter值
     */
    public String islandFormatter() {
        return this.islandFormatter;
    }

    /**
     * 设置islandFormatter值
     *
     * @param islandFormatter
     */
    public Tooltip islandFormatter(String islandFormatter) {
        this.islandFormatter = islandFormatter;
        return this;
    }

    /**
     * 获取showDelay值
     */
    public Integer showDelay() {
        return this.showDelay;
    }

    /**
     * 设置showDelay值
     *
     * @param showDelay
     */
    public Tooltip showDelay(Integer showDelay) {
        this.showDelay = showDelay;
        return this;
    }

    /**
     * 获取hideDelay值
     */
    public Integer hideDelay() {
        return this.hideDelay;
    }

    /**
     * 设置hideDelay值
     *
     * @param hideDelay
     */
    public Tooltip hideDelay(Integer hideDelay) {
        this.hideDelay = hideDelay;
        return this;
    }

    /**
     * 获取transitionDuration值
     */
    public Double transitionDuration() {
        return this.transitionDuration;
    }

    /**
     * 设置transitionDuration值
     *
     * @param transitionDuration
     */
    public Tooltip transitionDuration(Double transitionDuration) {
        this.transitionDuration = transitionDuration;
        return this;
    }

    /**
     * 获取enterable值
     */
    public Boolean enterable() {
        return this.enterable;
    }

    /**
     * 设置enterable值
     *
     * @param enterable
     */
    public Tooltip enterable(Boolean enterable) {
        this.enterable = enterable;
        return this;
    }

    /**
     * 获取borderRadius值
     */
    public Integer borderRadius() {
        return this.borderRadius;
    }

    /**
     * 设置borderRadius值
     *
     * @param borderRadius
     */
    public Tooltip borderRadius(Integer borderRadius) {
        this.borderRadius = borderRadius;
        return this;
    }

    /**
     * 坐标轴指示器，坐标轴触发有效
     */
    public AxisPointer axisPointer() {
        if (this.axisPointer == null) {
            this.axisPointer = new AxisPointer();
        }
        return this.axisPointer;
    }

    /**
     * 文本样式，默认为白色字体
     *
     */
    public TextStyle textStyle() {
        if (this.textStyle == null) {
            this.textStyle = new TextStyle();
        }
        return this.textStyle;
    }
}
