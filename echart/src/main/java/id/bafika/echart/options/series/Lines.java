package id.bafika.echart.options.series;

import id.bafika.echart.options.code.SeriesType;

public class Lines extends Series<Lines> {

    private Effect effect;

    /**
     * 构造函数
     */
    public Lines() {
        this.type(SeriesType.lines);
    }

    /**
     * 构造函数,参数:name
     *
     * @param name
     */
    public Lines(String name) {
        super(name);
        this.type(SeriesType.lines);
    }

    public Effect effect() {
        if (this.effect == null) {
            this.effect = new Effect();
        }
        return this.effect;
    }

    public Lines effect(Effect effect) {
        this.effect = effect;
        return this;
    }
}
