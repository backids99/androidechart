package id.bafika.echart.options.axis;

import id.bafika.echart.options.code.AxisType;
import id.bafika.echart.options.code.NameLocation;
import id.bafika.echart.options.style.LineStyle;

public class ValueAxis extends Axis<ValueAxis> {
    /**
     * 坐标轴名称位置，默认为'end'，可选为：'start' | 'end'
     *
     * @see NameLocation
     */
    private NameLocation nameLocation;
    /**
     * 坐标轴名称文字样式，默认取全局配置，颜色跟随axisLine主色，可设
     */
    private LineStyle nameTextStyle;
    /**
     * 小数精度，默认为0，无小数点
     */
    private Integer precision;
    /**
     * 整数精度，默认为100，个位和百位为0
     */
    private Integer power;
    /**
     * 分割段数，默认为5
     */
    private Integer splitNumber;

    /**
     * 构造函数
     */
    public ValueAxis() {
        this.type(AxisType.value);
    }

    /**
     * 获取precision值
     */
    public Integer precision() {
        return this.precision;
    }

    /**
     * 设置precision值
     *
     * @param precision
     */
    public ValueAxis precision(Integer precision) {
        this.precision = precision;
        return this;
    }

    /**
     * 获取power值
     */
    public Integer power() {
        return this.power;
    }

    /**
     * 设置power值
     *
     * @param power
     */
    public ValueAxis power(Integer power) {
        this.power = power;
        return this;
    }

    /**
     * 获取splitNumber值
     */
    public Integer splitNumber() {
        return this.splitNumber;
    }

    /**
     * 设置splitNumber值
     *
     * @param splitNumber
     */
    public ValueAxis splitNumber(Integer splitNumber) {
        this.splitNumber = splitNumber;
        return this;
    }
    /**
     * 设置nameLocation值
     *
     * @param nameLocation
     */
    public ValueAxis nameLocation(NameLocation nameLocation) {
        this.nameLocation = nameLocation;
        return this;
    }

    /**
     * 坐标轴名称文字样式，默认取全局配置，颜色跟随axisLine主色，可设
     */
    public LineStyle nameTextStyle() {
        if (this.nameTextStyle == null) {
            this.nameTextStyle = new LineStyle();
        }
        return this.nameTextStyle;
    }

    /**
     * 设置style值
     *
     * @param style
     */
    public ValueAxis nameTextStyle(LineStyle style) {
        this.nameTextStyle = style;
        return this;
    }

}
