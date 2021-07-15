package id.bafika.echart.options.series;

import id.bafika.echart.options.code.EffectType;
import id.bafika.echart.options.code.SeriesType;
import id.bafika.echart.options.code.ShowEffectOn;
import id.bafika.echart.options.series.other.RippleEffect;

public class EffectScatter extends Series<EffectScatter> {
    /**
     * 特效类型
     */
    private Object effectType;
    /**
     * 配置何时显示特效
     */
    private Object showEffectOn;
    /**
     * 涟漪特效相关配置
     */
    private RippleEffect rippleEffect;

    /**
     * 构造函数
     */
    public EffectScatter() {
        this.type(SeriesType.effectScatter);
    }

    /**
     * 构造函数,参数:name
     *
     * @param name
     */
    public EffectScatter(String name) {
        super(name);
        this.type(SeriesType.effectScatter);
    }

    public Object effectType() {
        return this.effectType;
    }

    public EffectScatter effectType(Object effectType) {
        this.effectType = effectType;
        return this;
    }

    public EffectScatter effectType(EffectType effectType) {
        this.effectType = effectType;
        return this;
    }

    public Object showEffectOn() {
        return this.showEffectOn;
    }

    public EffectScatter showEffectOn(Object showEffectOn) {
        this.showEffectOn = showEffectOn;
        return this;
    }

    public EffectScatter showEffectOn(ShowEffectOn showEffectOn) {
        this.showEffectOn = showEffectOn;
        return this;
    }

    public RippleEffect rippleEffect() {
        return this.rippleEffect;
    }

    public EffectScatter rippleEffect(RippleEffect rippleEffect) {
        this.rippleEffect = rippleEffect;
        return this;
    }

}
