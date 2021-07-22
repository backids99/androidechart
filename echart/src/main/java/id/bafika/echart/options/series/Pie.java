package id.bafika.echart.options.series;

import id.bafika.echart.options.code.RoseType;
import id.bafika.echart.options.code.SelectMode;
import id.bafika.echart.options.code.SeriesType;

public class Pie extends Series<Pie> {
    /**
     * 圆心坐标，支持绝对值（px）和百分比，百分比计算min(width, height) * 50%
     */
    private Object[] center;
    /**
     * 半径，支持绝对值（px）和百分比，百分比计算比，min(width, height) / 2 * 75%，
     * 传数组实现环形图，[内半径，外半径]
     */
    private Object radius;
    /**
     * 开始角度, 饼图（90）、仪表盘（225），有效输入范围：[-360,360]
     */
    private Integer startAngle;
    /**
     * 最小角度，可用于防止某item的值过小而影响交互
     */
    private Integer minAngle;
    /**
     * 显示是否顺时针
     */
    private Boolean clockWise;
    /**
     * 南丁格尔玫瑰图模式，'radius'（半径） | 'area'（面积）
     *
     */
    private RoseType roseType;
    /**
     * 选中是扇区偏移量
     */
    private Integer selectedOffset;
    /**
     * 选中模式，默认关闭，可选single，multiple
     *
     */
    private Object selectMode;

    /**
     * 是否启用防止标签重叠策略，默认开启
     */
    private Boolean avoidLabelOverlap;

    /**
     * 构造函数
     */
    public Pie() {
        this.type(SeriesType.pie);
    }

    /**
     * 构造函数,参数:name
     *
     * @param name
     */
    public Pie(String name) {
        super(name);
        this.type(SeriesType.pie);
    }

    /**
     * 获取center值
     */
    public Object[] center() {
        return this.center;
    }

    /**
     * 设置center值
     *
     * @param center
     */
    public Pie center(Object[] center) {
        this.center = center;
        return this;
    }

    /**
     * 获取radius值
     */
    public Object radius() {
        return this.radius;
    }

    /**
     * 圆心坐标，支持绝对值（px）和百分比，百分比计算min(width, height) * 50%
     *
     * @param width
     * @param height
     * @return
     */
    public Pie center(Object width, Object height) {
        this.center = new Object[]{width, height};
        return this;
    }

    /**
     * 半径，支持绝对值（px）和百分比，百分比计算比，min(width, height) / 2 * 75%，
     * 传数组实现环形图，[内半径，外半径]
     *
     * @param radius
     * @return
     */
    public Pie radius(Object radius) {
        this.radius = radius;
        return this;
    }

    /**
     * 半径，支持绝对值（px）和百分比，百分比计算比，min(width, height) / 2 * 75%，
     * 传数组实现环形图，[内半径，外半径]
     *
     * @param width  内半径
     * @param height 外半径
     * @return
     */
    public Pie radius(Object width, Object height) {
        radius = new Object[]{width, height};
        return this;
    }

    /**
     * 获取startAngle值
     */
    public Integer startAngle() {
        return this.startAngle;
    }

    /**
     * 设置startAngle值
     *
     * @param startAngle
     */
    public Pie startAngle(Integer startAngle) {
        this.startAngle = startAngle;
        return this;
    }

    /**
     * 获取minAngle值
     */
    public Integer minAngle() {
        return this.minAngle;
    }

    /**
     * 设置minAngle值
     *
     * @param minAngle
     */
    public Pie minAngle(Integer minAngle) {
        this.minAngle = minAngle;
        return this;
    }

    /**
     * 获取clockWise值
     */
    public Boolean clockWise() {
        return this.clockWise;
    }

    /**
     * 设置clockWise值
     *
     * @param clockWise
     */
    public Pie clockWise(Boolean clockWise) {
        this.clockWise = clockWise;
        return this;
    }

    /**
     * 获取roseType值
     */
    public RoseType roseType() {
        return this.roseType;
    }

    /**
     * 设置roseType值
     *
     * @param roseType
     */
    public Pie roseType(RoseType roseType) {
        this.roseType = roseType;
        return this;
    }

    public Object selectMode() {
        return this.selectMode;
    }

    public Pie selectMode(boolean selectMode) {
        this.selectMode = selectMode;
        return this;
    }

    public Pie selectMode(SelectMode selectMode) {
        this.selectMode = selectMode;
        return this;
    }

    /**
     * 设置 avoidLabelOverlap
     *
     * @param avoidLabelOverlap
     * @return
     */
    public Pie avoidLabelOverlap(Boolean avoidLabelOverlap) {
        this.avoidLabelOverlap = avoidLabelOverlap;
        return this;
    }
}
