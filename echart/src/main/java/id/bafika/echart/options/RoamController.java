package id.bafika.echart.options;

import java.util.HashMap;
import java.util.Map;

public class RoamController extends Basic<RoamController> implements Component {
    private String fillerColor;
    private String handleColor;
    private Integer step;
    private Map<String, Boolean> mapTypeControl;

    /**
     * 获取fillerColor值
     */
    public String fillerColor() {
        return this.fillerColor;
    }

    /**
     * 设置fillerColor值
     *
     * @param fillerColor
     */
    public RoamController fillerColor(String fillerColor) {
        this.fillerColor = fillerColor;
        return this;
    }

    /**
     * 获取handleColor值
     */
    public String handleColor() {
        return this.handleColor;
    }

    /**
     * 设置handleColor值
     *
     * @param handleColor
     */
    public RoamController handleColor(String handleColor) {
        this.handleColor = handleColor;
        return this;
    }

    /**
     * 获取step值
     */
    public Integer step() {
        return this.step;
    }

    /**
     * 设置step值
     *
     * @param step
     */
    public RoamController step(Integer step) {
        this.step = step;
        return this;
    }

    /**
     * 获取mapTypeControl值
     */
    public Map<String, Boolean> mapTypeControl() {
        return this.mapTypeControl;
    }

    /**
     * 设置mapTypeControl值
     *
     * @param key   地名
     * @param value true|false
     */
    public RoamController mapTypeControl(String key, Boolean value) {
        if (this.mapTypeControl == null) {
            this.mapTypeControl = new HashMap<String, Boolean>();
        }
        this.mapTypeControl.put(key, value);
        return this;
    }
}
