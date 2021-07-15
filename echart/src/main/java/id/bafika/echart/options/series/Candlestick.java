package id.bafika.echart.options.series;

import id.bafika.echart.options.code.Orient;
import id.bafika.echart.options.code.SeriesType;

public class Candlestick extends Series<Candlestick> {
    /**
     * 柱条（K线蜡烛）宽度，不设时自适应
     */
    private Integer barWidth;
    /**
     * 柱条（K线蜡烛）最大宽度，不设时自适应
     */
    private Integer barMaxWidth;
    /**
     * 布局方式
     */
    private Orient layout;

    /**
     * 构造函数
     */
    public Candlestick() {
        this.type(SeriesType.candlestick);
    }

    /**
     * 构造函数,参数:name
     *
     * @param name
     */
    public Candlestick(String name) {
        super(name);
        this.type(SeriesType.candlestick);
    }

    /**
     * 设置open,close,min,max值
     *
     * @param open
     * @param close
     * @param min
     * @param max
     */
    public Candlestick data(Double open, Double close, Double min, Double max) {
        Object[] kData = new Object[]{open, close, min, max};
        super.data(kData);
        return this;
    }

    /**
     * 获取barWidth值
     */
    public Integer barWidth() {
        return this.barWidth;
    }

    /**
     * 设置barWidth值
     *
     * @param barWidth
     */
    public Candlestick barWidth(Integer barWidth) {
        this.barWidth = barWidth;
        return this;
    }

    /**
     * 获取barMaxWidth值
     */
    public Integer barMaxWidth() {
        return this.barMaxWidth;
    }

    /**
     * 设置barMaxWidth值
     *
     * @param barMaxWidth
     */
    public Candlestick barMaxWidth(Integer barMaxWidth) {
        this.barMaxWidth = barMaxWidth;
        return this;
    }

    public Orient layout() {
        return this.layout;
    }

    public Candlestick layout(Orient layout) {
        this.layout = layout;
        return this;
    }
}
