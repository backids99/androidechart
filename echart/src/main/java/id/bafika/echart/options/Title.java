package id.bafika.echart.options;

import id.bafika.echart.options.code.X;
import id.bafika.echart.options.style.TextStyle;

public class Title extends Basic<Title> implements Component {
    /**
     * 主标题文本，'\n'指定换行
     */
    private String text;
    /**
     * 主标题文本超链接
     */
    private String link;
    /**
     * 指定窗口打开主标题超链接，支持'self' | 'blank'，不指定等同为'blank'（新窗口）
     */
    private String target;
    /**
     * 副标题文本，'\n'指定换行
     */
    private String subtext;
    /**
     * 副标题文本超链接
     */
    private String sublink;
    /**
     * 指定窗口打开副标题超链接，支持'self' | 'blank'，不指定等同为'blank'（新窗口）
     */
    private String subtarget;
    /**
     * 水平对齐方式，默认根据x设置自动调整，可选为： left' | 'right' | 'center
     *
     */
    private X textAlign;
    /**
     * 主标题文本样式（详见textStyle）
     *
     */
    private TextStyle textStyle;
    /**
     * 默认值{color: '#aaa'}，副标题文本样式
     *
     */
    private TextStyle subtextStyle;
    /**
     * 属性offsetCenter用于详情定位，数组为横纵相对仪表盘圆心坐标偏移，支持百分比（相对外半径）
     */
    private Object offsetCenter;

    /**
     * 设置textStyle值
     *
     * @param textStyle
     */
    public Title textStyle(TextStyle textStyle) {
        this.textStyle = textStyle;
        return this;
    }

    /**
     * 设置subtextStyle值
     *
     * @param subtextStyle
     */
    public Title subtextStyle(TextStyle subtextStyle) {
        this.subtextStyle = subtextStyle;
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
    public Title text(String text) {
        this.text = text;
        return this;
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
    public Title link(String link) {
        this.link = link;
        return this;
    }

    /**
     * 获取target值
     */
    public String target() {
        return this.target;
    }

    /**
     * 设置target值
     *
     * @param target
     */
    public Title target(String target) {
        this.target = target;
        return this;
    }

    /**
     * 获取subtext值
     */
    public String subtext() {
        return this.subtext;
    }

    /**
     * 设置subtext值
     *
     * @param subtext
     */
    public Title subtext(String subtext) {
        this.subtext = subtext;
        return this;
    }

    /**
     * 获取sublink值
     */
    public String sublink() {
        return this.sublink;
    }

    /**
     * 设置sublink值
     *
     * @param sublink
     */
    public Title sublink(String sublink) {
        this.sublink = sublink;
        return this;
    }

    /**
     * 获取subtarget值
     */
    public String subtarget() {
        return this.subtarget;
    }

    /**
     * 设置subtarget值
     *
     * @param subtarget
     */
    public Title subtarget(String subtarget) {
        this.subtarget = subtarget;
        return this;
    }

    /**
     * 获取textAlign值
     */
    public X textAlign() {
        return this.textAlign;
    }

    /**
     * 设置textAlign值
     *
     * @param textAlign
     */
    public Title textAlign(X textAlign) {
        this.textAlign = textAlign;
        return this;
    }

    /**
     * 主标题文本样式（详见textStyle）
     *
     */
    public TextStyle textStyle() {
        if (this.textStyle == null) {
            this.textStyle = new TextStyle();
        }
        return this.textStyle;
    }

    /**
     * 默认值{color: '#aaa'}，副标题文本样式
     *
     */
    public TextStyle subtextStyle() {
        if (this.subtextStyle == null) {
            this.subtextStyle = new TextStyle();
        }
        return this.subtextStyle;
    }

    /**
     * 获取offsetCenter值
     */
    public Object offsetCenter() {
        return this.offsetCenter;
    }

    /**
     * 设置offsetCenter值
     *
     * @param offsetCenter
     */
    public Title offsetCenter(Object offsetCenter) {
        this.offsetCenter = offsetCenter;
        return this;
    }
}
