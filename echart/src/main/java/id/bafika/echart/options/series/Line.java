package id.bafika.echart.options.series;

import id.bafika.echart.options.code.DataFilter;
import id.bafika.echart.options.code.SeriesType;
import id.bafika.echart.options.style.AreaStyle;
import id.bafika.echart.options.style.LineStyle;

public class Line extends Series<Line> {
    /**
     * 平滑曲线
     */
    private Boolean smooth;
    /**
     * ECharts 会在折线图的数据数量大于实际显示的像素宽度（高度）的时候会启用优化，对显示在一个像素宽度内的数据做筛选，该选项是指明数据筛选的策略
     *
     */
    private Object dataFilter;
    /**
     * 区域填充样式。
     */
    private AreaStyle areaStyle;

    /**
     * lineStyle
     */
    private LineStyle lineStyle;

    /**
     * 构造函数
     */
    public Line() {
        this.type(SeriesType.line);
    }

    /**
     * 构造函数,参数:name
     *
     * @param name
     */
    public Line(String name) {
        super(name);
        this.type(SeriesType.line);
    }

    /**
     * 获取dataFilter值
     */
    public Object dataFilter() {
        return this.dataFilter;
    }

    /**
     * 设置dataFilter值
     *
     * @param dataFilter
     */
    public Line dataFilter(Object dataFilter) {
        this.dataFilter = dataFilter;
        return this;
    }

    /**
     * 设置dataFilter值
     *
     * @param dataFilter
     */
    public Line dataFilter(DataFilter dataFilter) {
        this.dataFilter = dataFilter;
        return this;
    }

    /**
     * 获取smooth值
     */
    public Boolean smooth() {
        return this.smooth;
    }

    /**
     * 设置smooth值
     *
     * @param smooth
     */
    public Line smooth(Boolean smooth) {
        this.smooth = smooth;
        return this;
    }

    /**
     * 新建并返回areaStyle
     *
     * @return
     */
    public AreaStyle areaStyle() {
        if (this.areaStyle == null) {
            this.areaStyle = new AreaStyle();
        }
        return this.areaStyle;
    }

    /**
     * 设置areaStyle
     *
     * @param areaStyle
     * @return
     */
    public Line areaStyle(AreaStyle areaStyle) {
        this.areaStyle = areaStyle;
        return this;
    }

    /**
     * 新建并返回lineStyle
     *
     * @return
     */
    public LineStyle lineStyle() {
        if (this.lineStyle == null) {
            this.lineStyle = new LineStyle();
        }
        return this.lineStyle;
    }

    /**
     * 设置lineStyle
     *
     * @param lineStyle
     * @return
     */
    public Line lineStyle(LineStyle lineStyle) {
        this.lineStyle = lineStyle;
        return this;
    }
}
