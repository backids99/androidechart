package id.bafika.echart.options.data;

import java.io.Serializable;

public class RadarData implements Serializable {

    private static final long serialVersionUID = -2573889018261931162L;

    private Object value;
    private String name;

    /**
     * 构造函数,参数:name,value
     *
     * @param name
     * @param value
     */
    public RadarData(String name, Object value) {
        this.value = value;
        this.name = name;
    }

    /**
     * 获取value值
     */
    public Object value() {
        return this.value;
    }

    /**
     * 设置value值
     *
     * @param value
     */
    public RadarData value(Object value) {
        this.value = value;
        return this;
    }
}
