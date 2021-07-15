package id.bafika.echart.options.axis;

import id.bafika.echart.options.code.AxisType;
import id.bafika.echart.options.code.NameLocation;
import id.bafika.echart.options.style.AreaSelectStyle;
import id.bafika.echart.options.style.NameTextStyle;

public class ParallelAxis extends Axis<ParallelAxis> {
    /**
     * 坐标轴的维度号
     */
    private Integer dim;
    /**
     * 用于定义『坐标轴』对应到哪个『坐标系』中
     */
    private Integer parallelIndex;
    /**
     * 坐标轴的分割段数，需要注意的是这个分割段数只是个预估值，最后实际显示的段数会在这个基础上根据分割后坐标轴刻度显示的易读程度作调整
     */
    private Integer splitNumber;
    /**
     * 坐标轴名称显示位置
     */
    private NameLocation nameLocation;
    /**
     * 在坐标轴上可以进行框选，这里是一些框选的设置
     */
    private AreaSelectStyle areaSelectStyle;
    /**
     * 坐标轴名称的文字样式
     */
    private NameTextStyle nameTextStyle;

    /**
     * 构造函数
     */
    public ParallelAxis() {
        this.type(AxisType.value);
    }

    public Integer dim() {
        return this.dim;
    }

    public ParallelAxis dim(Integer dim) {
        this.dim = dim;
        return this;
    }

    public Integer parallelIndex() {
        return this.parallelIndex;
    }

    public ParallelAxis parallelIndex(Integer parallelIndex) {
        this.parallelIndex = parallelIndex;
        return this;
    }

    public Integer splitNumber() {
        return this.splitNumber;
    }

    public ParallelAxis splitNumber(Integer splitNumber) {
        this.splitNumber = splitNumber;
        return this;
    }

    public NameLocation nameLocation() {
        return this.nameLocation;
    }

    public ParallelAxis nameLocation(NameLocation nameLocation) {
        this.nameLocation = nameLocation;
        return this;
    }
    public AreaSelectStyle areaSelectStyle() {
        if (this.areaSelectStyle == null) {
            this.areaSelectStyle = new AreaSelectStyle();
        }
        return this.areaSelectStyle;
    }

    public ParallelAxis areaSelectStyle(AreaSelectStyle areaSelectStyle) {
        this.areaSelectStyle = areaSelectStyle;
        return this;
    }

    public NameTextStyle nameTextStyle() {
        if (this.nameTextStyle == null) {
            this.nameTextStyle = new NameTextStyle();
        }
        return this.nameTextStyle;
    }

    public ParallelAxis nameTextStyle(NameTextStyle nameTextStyle) {
        this.nameTextStyle = nameTextStyle;
        return this;
    }
}
