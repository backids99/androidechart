package id.bafika.echart.options.style;

import java.io.Serializable;

public class ControlStyle implements Serializable {

    private static final long serialVersionUID = -3442438026749918760L;
    /**
     * 按钮大小
     */
    private Integer itemSize;
    /**
     * 按钮间隔
     */
    private Integer itemGap;
    /**
     * 正常
     */
    private Color normal;
    /**
     * 高亮
     */
    private Color emphasis;

    /**
     * 构造函数
     */
    public ControlStyle() {
    }

    /**
     * 获取itemSize值
     */
    public Integer itemSize() {
        return this.itemSize;
    }

    /**
     * 设置itemSize值
     *
     * @param itemSize
     */
    public ControlStyle itemSize(Integer itemSize) {
        this.itemSize = itemSize;
        return this;
    }

    /**
     * 获取itemGap值
     */
    public Integer itemGap() {
        return this.itemGap;
    }

    /**
     * 设置itemGap值
     *
     * @param itemGap
     */
    public ControlStyle itemGap(Integer itemGap) {
        this.itemGap = itemGap;
        return this;
    }

    /**
     * 获取normal值
     */
    public Color normal() {
        if (this.normal == null) {
            this.normal = new Color();
        }
        return this.normal;
    }

    /**
     * 设置normal值
     *
     * @param normal
     */
    public ControlStyle normal(Color normal) {
        this.normal = normal;
        return this;
    }

    /**
     * 获取emphasis值
     */
    public Color emphasis() {
        if (this.emphasis == null) {
            this.emphasis = new Color();
        }
        return this.emphasis;
    }

    /**
     * 设置emphasis值
     *
     * @param emphasis
     */
    public ControlStyle emphasis(Color emphasis) {
        this.emphasis = emphasis;
        return this;
    }

    /**
     * 获取normal值
     */
    public Color getNormal() {
        return normal;
    }

    /**
     * 设置normal值
     *
     * @param normal
     */
    public void setNormal(Color normal) {
        this.normal = normal;
    }

    /**
     * 获取emphasis值
     */
    public Color getEmphasis() {
        return emphasis;
    }

    /**
     * 设置emphasis值
     *
     * @param emphasis
     */
    public void setEmphasis(Color emphasis) {
        this.emphasis = emphasis;
    }

    /**
     * 获取itemSize值
     */
    public Integer getItemSize() {
        return itemSize;
    }

    /**
     * 设置itemSize值
     *
     * @param itemSize
     */
    public void setItemSize(Integer itemSize) {
        this.itemSize = itemSize;
    }

    /**
     * 获取itemGap值
     */
	public Integer getItemGap() {
        return itemGap;
    }

    /**
     * 设置itemGap值
     *
     * @param itemGap
     */
    public void setItemGap(Integer itemGap) {
        this.itemGap = itemGap;
    }

    public class Color {
        /**
         * 时间轴控制器样式颜色
         */
        private String color;

        /**
         * 获取color值
         */
        public String color() {
            return this.color;
        }

        /**
         * 设置color值
         *
         * @param color
         */
        public Color color(String color) {
            this.color = color;
            return this;
        }

        /**
         * 获取color值
         */
        public String getColor() {
            return color;
        }

        /**
         * 设置color值
         *
         * @param color
         */
        public void setColor(String color) {
            this.color = color;
        }
    }
}
