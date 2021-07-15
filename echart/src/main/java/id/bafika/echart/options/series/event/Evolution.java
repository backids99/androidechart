package id.bafika.echart.options.series.event;

import android.annotation.SuppressLint;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Evolution implements Serializable {

    private static final long serialVersionUID = -3014023133802074740L;

    @SuppressLint("SimpleDateFormat")
    private static final SimpleDateFormat FORMAT = new SimpleDateFormat("yyyy-MM-dd");

    private String time;
    private Integer value;
    /**
     * 事件的详细信息
     */
    private Detail detail;

    /**
     * 构造方法
     */
    public Evolution() {
    }

    /**
     * 构造方法
     *
     * @param time
     * @param value
     */
    public Evolution(String time, Integer value) {
        this.time = time;
        this.value = value;
    }

    /**
     * 获取time值
     */
    public String time() {
        return this.time;
    }

    /**
     * 设置time值
     *
     * @param time
     */
    public Evolution time(String time) {
        this.time = time;
        return this;
    }

    /**
     * 设置time值，默认yyyy-MM-dd,其他情况建议使用字符串类型的时间
     *
     * @param time
     */
    public Evolution time(Date time) {
        this.time = FORMAT.format(time);
        return this;
    }

    /**
     * 获取value值
     */
    public Integer value() {
        return this.value;
    }

    /**
     * 设置value值
     *
     * @param value
     */
    public Evolution value(Integer value) {
        this.value = value;
        return this;
    }

    /**
     * 获取detail值
     */
    public Detail detail() {
        return this.detail;
    }

    /**
     * 设置detail值
     *
     * @param detail
     */
    public Evolution detail(Detail detail) {
        this.detail = detail;
        return this;
    }

    /**
     * 设置detail值
     *
     * @param link
     * @param text
     */
    public Evolution detail(String link, String text) {
        this.detail = new Detail(link, text);
        return this;
    }

    /**
     * 设置detail值
     *
     * @param link
     * @param text
     * @param img
     */
    public Evolution detail(String link, String text, String img) {
        this.detail = new Detail(link, text, img);
        return this;
    }
}
