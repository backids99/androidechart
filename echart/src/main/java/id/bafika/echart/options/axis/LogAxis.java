package id.bafika.echart.options.axis;

import id.bafika.echart.options.code.AxisType;

public class LogAxis extends Axis<LogAxis> {
    /**
     * axis.type === 'log'时生效。指定时，axisLabel显示为指数形式，如指定为4时，axisLabel可显示为4²、4³。不指定时，显示为普通形式，如 1,000,000
     */
    private Integer logLabelBase;
    /**
     * axis.type === 'log'时生效。指明是否使用反向log数轴（从而支持value为负值）。默认自适应，即如果value全为负值，则logPositive自动设为false，否则为true
     */
    private Boolean logPositive;

    /**
     * 构造函数
     */
    public LogAxis() {
        this.type(AxisType.log);
    }

    /**
     * 设置logLabelBase值
     *
     * @param logLabelBase
     */
    public LogAxis logLabelBase(Integer logLabelBase) {
        this.logLabelBase = logLabelBase;
        return this;
    }

    /**
     * 获取logLabelBase值
     */
    public Integer logLabelBase() {
        return this.logLabelBase;
    }

    /**
     * 设置logPositive值
     *
     * @param logPositive
     */
    public LogAxis logPositive(Boolean logPositive) {
        this.logPositive = logPositive;
        return this;
    }

    /**
     * 获取logPositive值
     */
    public Boolean logPositive() {
        return this.logPositive;
    }
}
