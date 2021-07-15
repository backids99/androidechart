package id.bafika.echart.options.style;

import id.bafika.echart.options.code.X;

public class GraphicStyle {

    /**
     * 文本
     */
    private String text;

    /**
     * 文本排列
     */
    private X textAlign;

    /**
     *文本填充颜色
     */
    private String fill;

    /**
     * 宽
     */
    private Object width;

    /**
     * 高
     */
    private Object height;

    
    public GraphicStyle text(String text) {
        this.text = text;
        return this;
    }

    
    public GraphicStyle textAlign(X textAlign) {
        this.textAlign = textAlign;
        return this;
    }

    
    public GraphicStyle fill(String fill) {
        this.fill = fill;
        return this;
    }

    
    public GraphicStyle width(Object width) {
        this.width = width;
        return this;
    }

    
    public GraphicStyle height(Object height) {
        this.height = height;
        return this;
    }
    
}
