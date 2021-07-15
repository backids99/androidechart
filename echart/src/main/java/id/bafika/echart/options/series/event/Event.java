package id.bafika.echart.options.series.event;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Event implements Serializable {

    private static final long serialVersionUID = 2936961594659788171L;

    private String name;
    private Integer weight;
    private List<Evolution> evolution;

    /**
     * 构造方法
     */
    public Event() {
    }

    /**
     * 构造方法
     *
     * @param name
     */
    public Event(String name) {
        this.name = name;
    }

    /**
     * 构造方法
     *
     * @param name
     * @param weight
     */
    public Event(String name, Integer weight) {
        this.name = name;
        this.weight = weight;
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
    public Event name(String name) {
        this.name = name;
        return this;
    }

    /**
     * 获取weight值
     */
    public Integer weight() {
        return this.weight;
    }

    /**
     * 设置weight值
     *
     * @param weight
     */
    public Event weight(Integer weight) {
        this.weight = weight;
        return this;
    }

    /**
     * 获取evolution值
     */
    public List<Evolution> evolution() {
        if (this.evolution == null) {
            this.evolution = new ArrayList<Evolution>();
        }
        return this.evolution;
    }

    /**
     * 设置evolution值
     *
     * @param evolution
     */
    public Event evolution(List<Evolution> evolution) {
        this.evolution = evolution;
        return this;
    }

    /**
     * 添加evolution值
     *
     * @param values
     * @return
     */
    public Event evolution(Evolution... values) {
        if (values == null || values.length == 0) {
            return this;
        }
        this.evolution().addAll(Arrays.asList(values));
        return this;
    }

}
