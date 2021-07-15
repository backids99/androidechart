package id.bafika.echart.options.data;

import id.bafika.echart.options.Tooltip;

public class Data extends BasicData<Data> {
    /**
     * 可以通过valueIndex:0指定为横轴特殊点
     */
    private Integer valueIndex;

    private Object min;
    private Object max;
    /**
     * 图标
     */
    private String icon;
    private Boolean selected;
    private Tooltip tooltip;

    /**
     * 平滑曲线弧度，smooth为true时有效，指定平滑曲线弧度
     */
    private Double smoothRadian;

    /**
     * 构造函数
     */
    public Data() {
    }

    /**
     * 构造函数,参数:name
     *
     * @param name
     */
    public Data(String name) {
        super(name);
    }

    /**
     * 构造函数,参数:name,value
     *
     * @param name
     * @param value
     */
    public Data(String name, Object value) {
        super(name, value);
    }

    /**
     * 构造函数,参数:name,symbol,symbolSize
     *
     * @param name
     * @param symbol
     * @param symbolSize
     */
    public Data(String name, Object symbol, Object symbolSize) {
        super(name, symbol, symbolSize);
    }

    /**
     * 构造函数,参数:value,symbol
     *
     * @param value
     * @param symbol
     */
    public Data(Object value, Object symbol) {
        super(value, symbol);
    }

    /**
     * 构造函数,参数:value,symbol,symbolSize
     *
     * @param value
     * @param symbol
     * @param symbolSize
     */
    public Data(Object value, Object symbol, Object symbolSize) {
        super(value, symbol, symbolSize);
    }

    /**
     * 获取平滑曲线弧度
     */
    public Double smoothRadian() {
        return this.smoothRadian;
    }

    /**
     * 设置平滑曲线弧度
     *
     * @param smoothRadian
     */
    public Data smoothRadian(Double smoothRadian) {
        this.smoothRadian = smoothRadian;
        return this;
    }

    /**
     * 获取tooltip值
     */
    public Tooltip tooltip() {
        if (this.tooltip == null) {
            this.tooltip = new Tooltip();
        }
        return this.tooltip;
    }

    /**
     * 设置tooltip值
     *
     * @param tooltip
     */
    public Data tooltip(Tooltip tooltip) {
        this.tooltip = tooltip;
        return this;
    }

    /**
     * 获取selected值
     */
    public Boolean selected() {
        return this.selected;
    }

    /**
     * 设置selected值
     *
     * @param selected
     */
    public Data selected(Boolean selected) {
        this.selected = selected;
        return this;
    }

    /**
     * 获取icon值
     */
    public String icon() {
        return this.icon;
    }

    /**
     * 设置icon值
     *
     * @param icon
     */
    public Data icon(String icon) {
        this.icon = icon;
        return this;
    }

    /**
     * 获取min值
     */
    public Object min() {
        return this.min;
    }

    /**
     * 设置min值
     *
     * @param min
     */
    public Data min(Object min) {
        this.min = min;
        return this;
    }

    /**
     * 获取max值
     */
    public Object max() {
        return this.max;
    }

    /**
     * 设置max值
     *
     * @param max
     */
    public Data max(Object max) {
        this.max = max;
        return this;
    }

    /**
     * 获取valueIndex值
     */
    public Integer valueIndex() {
        return this.valueIndex;
    }

    /**
     * 设置valueIndex值
     *
     * @param valueIndex
     */
    public Data valueIndex(Integer valueIndex) {
        this.valueIndex = valueIndex;
        return this;
    }

    /**
     * 获取valueIndex值
     */
    public Integer getValueIndex() {
        return valueIndex;
    }

    /**
     * 设置valueIndex值
     *
     * @param valueIndex
     */
    public Data setValueIndex(Integer valueIndex) {
        this.valueIndex = valueIndex;
        return this;
    }
}
