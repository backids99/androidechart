package id.bafika.echart.options.data;

public class PointData extends BasicData<PointData> {
    /**
     * 构造函数
     */
    public PointData() {
        super();
    }

    /**
     * 构造函数,参数:name,value
     *
     * @param name
     * @param value
     */
    public PointData(String name, Object value) {
        super(name, value);
    }

    /**
     * 构造函数,参数:name,symbol,symbolSize
     *
     * @param name
     * @param symbol
     * @param symbolSize
     */
    public PointData(String name, Object symbol, Object symbolSize) {
        super(name, symbol, symbolSize);
    }

    /**
     * 构造函数,参数:value,symbol
     *
     * @param value
     * @param symbol
     */
    public PointData(Object value, Object symbol) {
        super(value, symbol);
    }

    /**
     * 构造函数,参数:value,symbol,symbolSize
     *
     * @param value
     * @param symbol
     * @param symbolSize
     */
    public PointData(Object value, Object symbol, Object symbolSize) {
        super(value, symbol, symbolSize);
    }
}
