package id.bafika.echart.options.series;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.HashMap;

public class GeoCoord extends HashMap<String, BigDecimal[]> implements Serializable {

    private static final long serialVersionUID = 7548362611708057870L;

    /**
     * 设置key,x,y值
     *
     * @param key
     * @param x
     * @param y
     */
    public GeoCoord put(String key, String x, String y) {
        super.put(key, new BigDecimal[]{new BigDecimal(x), new BigDecimal(y)});
        return this;
    }

}
