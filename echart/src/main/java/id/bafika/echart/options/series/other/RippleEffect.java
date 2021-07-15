package id.bafika.echart.options.series.other;

import java.io.Serializable;

import id.bafika.echart.options.code.BrushType;

public class RippleEffect implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 动画的时间
     */
    private Integer period;
    /**
     * 动画中波纹的最大缩放比例
     */
    private Double scale;
    /**
     * 波纹的填充方式，可选 'stroke' 和 'fill'
     */
    private BrushType brushType;

    public Integer period() {
        return this.period;
    }

    public RippleEffect period(Integer period) {
        this.period = period;
        return this;
    }

    public Double scale() {
        return this.scale;
    }

    public RippleEffect scale(Double scale) {
        this.scale = scale;
        return this;
    }

    public BrushType brushType() {
        return this.brushType;
    }

    public RippleEffect brushType(BrushType brushType) {
        this.brushType = brushType;
        return this;
    }

    public Integer getPeriod() {
        return period;
    }

    public void setPeriod(Integer period) {
        this.period = period;
    }

    public Double getScale() {
        return scale;
    }

    public void setScale(Double scale) {
        this.scale = scale;
    }

    public BrushType getBrushType() {
        return brushType;
    }

    public void setBrushType(BrushType brushType) {
        this.brushType = brushType;
    }
}
