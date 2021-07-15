package id.bafika.echart.options.series.force;

import java.io.Serializable;
import java.util.HashMap;

import id.bafika.echart.options.style.ItemStyle;


public class Node extends HashMap<String, Object> implements Serializable {

    private static final long serialVersionUID = 4254895945303983318L;

    /**
     * 构造函数
     */
    public Node() {
        super();
    }

    /**
     * 构造函数,参数:category,name,value
     *
     * @param category
     * @param name
     * @param value
     */
    public Node(Integer category, String name, Integer value) {
        super();
        put("category", category);
        put("name", name);
        put("value", value);
    }

    /**
     * 获取name值
     */
    public String name() {
        return (String) get("name");
    }

    /**
     * 设置name值
     *
     * @param name
     */
    public Node name(String name) {
        put("name", name);
        return this;
    }

    /**
     * 获取label值
     *
     * @since 2.1.9
     */
    public String label() {
        return (String) get("label");
    }

    /**
     * 设置label值
     *
     * @param label
     * @since 2.1.9
     */
    public Node label(String label) {
        put("label", label);
        return this;
    }

    /**
     * 获取value值
     */
    public Integer value() {
        return (Integer) get("value");
    }

    /**
     * 设置value值
     *
     * @param value
     */
    public Node value(Integer value) {
        put("value", value);
        return this;
    }

    /**
     * 获取initial值
     */
    public Object initial() {
        return get("initial");
    }

    /**
     * 设置initial值
     *
     * @param initial
     */
    public Node initial(Object initial) {
        put("initial", initial);
        return this;
    }

    /**
     * 获取fixX值
     */
    public Boolean fixX() {
        return (Boolean) get("fixX");
    }

    /**
     * 设置fixX值
     *
     * @param fixX
     */
    public Node fixX(Boolean fixX) {
        put("fixX", fixX);
        return this;
    }

    /**
     * 获取fixY值
     */
    public Boolean fixY() {
        return (Boolean) get("fixY");
    }

    /**
     * 设置fixY值
     *
     * @param fixY
     */
    public Node fixY(Boolean fixY) {
        put("fixY", fixY);
        return this;
    }

    /**
     * 获取ignore值
     */
    public Boolean ignore() {
        return (Boolean) get("ignore");
    }

    /**
     * 设置ignore值
     *
     * @param ignore
     */
    public Node ignore(Boolean ignore) {
        put("ignore", ignore);
        return this;
    }

    /**
     * 获取symbol值
     */
    public Object symbol() {
        return get("symbol");
    }

    /**
     * 设置symbol值
     *
     * @param symbol
     */
    public Node symbol(Object symbol) {
        put("symbol", symbol);
        return this;
    }

    /**
     * 获取symbolSize值
     */
    public Object symbolSize() {
        return get("symbolSize");
    }

    /**
     * 设置symbolSize值
     *
     * @param symbolSize
     */
    public Node symbolSize(Object symbolSize) {
        put("symbolSize", symbolSize);
        return this;
    }

    /**
     * 获取draggable值
     */
    public Boolean draggable() {
        return (Boolean) get("draggable");
    }

    /**
     * 设置draggable值
     *
     * @param draggable
     */
    public Node draggable(Boolean draggable) {
        put("draggable", draggable);
        return this;
    }

    /**
     * 获取category值
     */
    public Integer category() {
        return (Integer) get("category");
    }

    /**
     * 设置category值
     *
     * @param category
     */
    public Node category(Integer category) {
        put("category", category);
        return this;
    }

    /**
     * 详见 itemStyle
     *
     */
    public ItemStyle itemStyle() {
        if (get("itemStyle") == null) {
            put("itemStyle", new ItemStyle());
        }
        return (ItemStyle) get("itemStyle");
    }
}
