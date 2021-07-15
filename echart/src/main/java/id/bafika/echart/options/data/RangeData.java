package id.bafika.echart.options.data;

import java.io.Serializable;

public class RangeData implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer start;
    private Integer end;

    private String label;
    private Object color;

    /**
     * 构造函数
     */
    public RangeData() {
    }

    /**
     * 构造函数,参数:start,end
     *
     * @param start
     * @param end
     */
    public RangeData(Integer start, Integer end) {
        this.start = start;
        this.end = end;
    }

    /**
     * 设置start值
     *
     * @param start
     */
    public RangeData start(Integer start) {
        this.start = start;
        return this;
    }

    /**
     * 获取start值
     */
    public Integer start() {
        return this.start;
    }

    /**
     * 设置end值
     *
     * @param end
     */
    public RangeData end(Integer end) {
        this.end = end;
        return this;
    }

    /**
     * 获取end值
     */
	public Integer end() {
        return this.end;
    }

    /**
     * 设置label值
     *
     * @param label
     */
    public RangeData label(String label) {
        this.label = label;
        return this;
    }

    /**
     * 获取label值
     */
    public String label() {
        return this.label;
    }

    /**
     * 设置color值
     *
     * @param color
     */
	public RangeData color(Object color) {
        this.color = color;
        return this;
    }

    /**
     * 获取color值
     */
    public Object color() {
        return this.color;
    }

}
