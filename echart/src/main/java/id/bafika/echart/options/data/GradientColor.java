package id.bafika.echart.options.data;

public class GradientColor {
    private Double offset;
    private Object color;

    /**
     * 构造函数,参数:offset,color
     *
     * @param offset
     * @param color
     */
    public GradientColor(Double offset, Object color) {
        this.offset = offset;
        this.color = color;
    }

    /**
     * 获取offset值
     */
    public Double offset() {
        return this.offset;
    }

    /**
     * 设置offset值
     *
     * @param offset
     */
    public GradientColor offset(Double offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 获取color值
     */
    public Object color() {
        return this.color;
    }

    /**
     * 设置color值
     *
     * @param color
     */
    public GradientColor color(Object color) {
        this.color = color;
        return this;
    }
}
