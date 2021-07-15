package id.bafika.echart.options.series;

import id.bafika.echart.options.code.SeriesType;

public class Bar extends Series<Bar> {
    /**
     * 柱条最小高度，可用于防止某item的值过小而影响交互
     */
    private Integer barMinHeight;
    /**
     * 柱条（K线蜡烛）宽度，不设时自适应
     */
  //  private Integer barWidth;
    private Object barWidth;
    /**
     * 柱条（K线蜡烛）最大宽度，不设时自适应
     */
    private Integer barMaxWidth;
    /**
     * 柱间距离，默认为柱形宽度的30%，可设固定值
     */
    private String barGap;
    /**
     * 类目间柱形距离，默认为类目间距的20%，可设固定值
     */
    private String barCategoryGap;

    /**
     * 构造函数
     */
    public Bar() {
        this.type(SeriesType.bar);
    }

    /**
     * 构造函数,参数:name
     *
     * @param name
     */
    public Bar(String name) {
        super(name);
        this.type(SeriesType.bar);
    }

    /**
     * 获取barMinHeight值
     */
    public Integer barMinHeight() {
        return this.barMinHeight;
    }

    /**
     * 设置barMinHeight值
     *
     * @param barMinHeight
     */
    public Bar barMinHeight(Integer barMinHeight) {
        this.barMinHeight = barMinHeight;
        return this;
    }

    /**
     * 获取barWidth值
     */
    public Object barWidth() {
        return this.barWidth;
    }

    /**
     * 设置barWidth值
     *
     * @param barWidth
     */
    public Bar barWidth(Object barWidth) {
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
    public Bar barMaxWidth(Integer barMaxWidth) {
        this.barMaxWidth = barMaxWidth;
        return this;
    }

    /**
     * 获取barGap值
     */
    public String barGap() {
        return this.barGap;
    }

    /**
     * 设置barGap值
     *
     * @param barGap
     */
    public Bar barGap(String barGap) {
        this.barGap = barGap;
        return this;
    }

    /**
     * 获取barCategoryGap值
     */
    public String barCategoryGap() {
        return this.barCategoryGap;
    }

    /**
     * 设置barCategoryGap值
     *
     * @param barCategoryGap
     */
    public Bar barCategoryGap(String barCategoryGap) {
        this.barCategoryGap = barCategoryGap;
        return this;
    }
}
