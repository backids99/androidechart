package id.bafika.echart.options.feature;

import java.util.HashMap;
import java.util.Map;

@SuppressWarnings("unchecked")
public class DataZoom extends Feature {

    /**
     * 当不指定时默认控制所有纵向类目，可通过数组指定多个需要控制的纵向类目坐标轴Index，仅一个时可直接为数字
     */
    private Object yAxisIndex;

    /**
     * 构造函数
     */
    public DataZoom() {
        this.show(true);
        Map title = new HashMap<String, String>();
        title.put("dataZoom", "区域缩放");
        title.put("dataZoomReset", "区域缩放后退");
        this.title(title);
    }

    /**
     * 获取yAxisIndex值
     */
    public Object yAxisIndex() {
        return this.yAxisIndex;
    }

    /**
     * 设置yAxisIndex值
     *
     * @param yAxisIndex
     */
    public DataZoom yAxisIndex(Object yAxisIndex) {
        this.yAxisIndex = yAxisIndex;
        return this;
    }

}
