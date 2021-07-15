package id.bafika.echart.options;

import id.bafika.echart.options.code.GraphicType;
import id.bafika.echart.options.style.GraphicStyle;

public class Graphic extends Basic<Graphic> implements Component {

    /**
     * id 用于在更新图形元素时指定更新哪个图形元素，如果不需要用可以忽略
     */
    private String id;

    /**
     * 这个字段在第一次设置时不能忽略，取值见上方『支持的图形元素』
     */
    private GraphicType type;

    // 下面的各个属性如果不需要设置都可以忽略，忽略则取默认值

    /**
     * 指定本次 setOption 对此图形元素进行的操作。默认是 'merge'，还可以 'replace' 或 'remove'
     */
    private String $action;

    /**
     * 定位、形状相关的设置，如 x, y, cx, cy, width, height, r, points 等
     * 注意，如果设置了 left/right/top/bottom，这里的定位用的 x/y/cx/cy 会失效
     */
    private Object shape;

    /**
     * 样式相关的设置，如 fill, stroke, lineWidth, shadowBlur 等
     */
    private GraphicStyle style;

    /**
     * 表示不响应事件
     */
    private Boolean silent;

    /**
     * 表示节点不显示
     */
    private Boolean invisible;

    /**
     * 设置是否整体限制在父节点范围内。可选值：'raw', 'all'
     */
    private String bouding;

    /**
     * 是否可以被拖拽
     */
    private Boolean draggable;

    /**
     * 事件的监听器，还可以是 onmousemove, ondrag 等
     */
    private String onclick;

    public Graphic id(String id) {
        this.id = id;
        return this;
    }

    public Graphic type(GraphicType type) {
        this.type = type;
        return this;
    }

    public Graphic $action(String $action) {
        this.$action = $action;
        return this;
    }

    public Graphic shape(Object shape) {
        this.shape = shape;
        return this;
    }

    public Graphic style(GraphicStyle style) {
        this.style = style;
        return this;
    }

    public Graphic silent(Boolean silent) {
        this.silent = silent;
        return this;
    }

    public Graphic invisible(Boolean invisible) {
        this.invisible = invisible;
        return this;
    }

    public Graphic bouding(String bouding) {
        this.bouding = bouding;
        return this;
    }

    public Graphic draggable(Boolean draggable) {
        this.draggable = draggable;
        return this;
    }

    public Graphic onclick(String onclick) {
        this.onclick = onclick;
        return this;
    }

}
