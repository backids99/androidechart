package id.bafika.echart.options.data;

import java.io.Serializable;

public class MapData implements Serializable {

    private static final long serialVersionUID = 7814199168511760158L;

    private String name;
    private Object value;
    private Boolean selected;

    /**
     * 构造函数,参数:name,value
     *
     * @param name
     * @param value
     */
    public MapData(String name, Object value) {
        this.name = name;
        this.value = value;
    }

    /**
     * 构造函数,参数:name,value,selected
     *
     * @param name
     * @param value
     * @param selected
     */
    public MapData(String name, Object value, Boolean selected) {
        this.name = name;
        this.value = value;
        this.selected = selected;
    }

    /**
     * 获取name值
     */
    public String name() {
        return this.name;
    }

    /**
     * 设置name值
     *
     * @param name
     */
    public MapData name(String name) {
        this.name = name;
        return this;
    }

    /**
     * 获取value值
     */
    public Object value() {
        return this.value;
    }

    /**
     * 设置value值
     *
     * @param value
     */
    public MapData value(Object value) {
        this.value = value;
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
    public MapData selected(Boolean selected) {
        this.selected = selected;
        return this;
    }
}
