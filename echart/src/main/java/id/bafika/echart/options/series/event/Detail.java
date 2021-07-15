package id.bafika.echart.options.series.event;

import java.io.Serializable;

public class Detail implements Serializable {

    private static final long serialVersionUID = 680903438457621422L;

    private String link;
    private String text;
    private String img;

    /**
     * 构造方法
     */
    public Detail() {
    }

    /**
     * 构造方法
     *
     * @param link
     * @param text
     */
    public Detail(String link, String text) {
        this.link = link;
        this.text = text;
    }

    /**
     * 构造方法
     *
     * @param link
     * @param text
     * @param img
     */
    public Detail(String link, String text, String img) {
        this.link = link;
        this.text = text;
        this.img = img;
    }

    /**
     * 获取link值
     */
    public String link() {
        return this.link;
    }

    /**
     * 设置link值
     *
     * @param link
     */
    public Detail link(String link) {
        this.link = link;
        return this;
    }

    /**
     * 获取text值
     */
    public String text() {
        return this.text;
    }

    /**
     * 设置text值
     *
     * @param text
     */
    public Detail text(String text) {
        this.text = text;
        return this;
    }

    /**
     * 获取img值
     */
    public String img() {
        return this.img;
    }

    /**
     * 设置img值
     *
     * @param img
     */
    public Detail img(String img) {
        this.img = img;
        return this;
    }
}
