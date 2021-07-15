package id.bafika.echart.options.series;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import id.bafika.echart.options.code.Layout;
import id.bafika.echart.options.code.Roam;
import id.bafika.echart.options.code.SeriesType;
import id.bafika.echart.options.code.Symbol;
import id.bafika.echart.options.series.force.Category;
import id.bafika.echart.options.series.force.Link;
import id.bafika.echart.options.series.force.Node;
import id.bafika.echart.options.series.other.Force;

public class Graph extends Series<Graph> {
    /**
     * 图的布局
     */
    private Layout layout;
    /**
     * 力引导布局相关的配置项
     */
    private Force force;
    /**
     * 是否开启滚轮缩放和拖拽漫游，默认为false（关闭），其他有效输入为true（开启），'scale'（仅开启滚轮缩放），'move'（仅开启拖拽漫游）
     */
    private Object roam;
    /**
     * 鼠标漫游缩放时节点的相应缩放比例，当设为0时节点不随着鼠标的缩放而缩放
     */
    private Double nodeScaleRatio;
    /**
     * 力导向图中节点的分类
     */
    private List<Category> categories;
    /**
     * 力导向图的顶点数据
     */
    private List nodes;
    /**
     * 力导向图的边数据
     */
    private List<Link> links;
    /**
     * 力导向图的边数据
     */
    private List<Link> edges;
    /**
     * 布局中心，可以是绝对值或者相对百分比
     */
    private Object center;
    /**
     * 布局大小，可以是绝对值或者相对百分比
     */
    private Object size;
    /**
     * 防止节点和节点，节点和边之间的重叠
     */
    private Boolean preventOverlap;
    /**
     * 布局冷却因子，值越小结束时间越短，值越大时间越长但是结果也越收敛
     */
    private Object coolDown;
    /**
     * 是否根据屏幕比例拉伸
     */
    private Boolean ratioScaling;
    /**
     * 顶点数据映射成圆半径后的最小半径
     */
    private Integer minRadius;
    /**
     * 顶点数据映射成圆半径后的最大半径
     */
    private Integer maxRadius;
    /**
     * 力导向图的边两端图形样式，可指定为'arrow', 详见symbolList
     */
    private Object linkSymbol;
    /**
     * 力导向图的边两端图形大小
     */
    private Integer linkSymbolSize;
    /**
     * 布局缩放系数，并不完全精确, 效果跟布局大小类似
     */
    private Double scaling;
    /**
     * 向心力系数，系数越大则节点越往中心靠拢
     */
    private Double gravity;
    /**
     * 节点是否能被拖拽
     */
    private Boolean draggable;
    /**
     * 在 500+ 顶点的图上建议设置 large 为 true, 会使用 Barnes-Hut simulation, 同时开启 useWorker 并且把 steps 值调大
     */
    private Boolean large;
    /**
     * 是否在浏览器支持 web worker 的时候把布局计算放入 web worker 中
     */
    private Boolean useWorker;
    /**
     * 每一帧布局计算的迭代次数，因为每一帧绘制的时间经常会比布局时间长很多，所以在使用 web worker 的时候可以把 steps 调大来平衡两者的时间从而达到效率最优化
     */
    private Integer steps;

    /**
     * 构造函数
     */
    public Graph() {
        this.type(SeriesType.graph);
    }

    /**
     * 构造函数,参数:name
     *
     * @param name
     */
    public Graph(String name) {
        super(name);
        this.type(SeriesType.graph);
    }

    /**
     * 构造函数
     *
     * @param name
     * @param layout
     */
    public Graph(String name, Layout layout) {
        super(name);
        this.type(SeriesType.graph);
        this.layout = layout;
    }

    public Layout layout() {
        return this.layout;
    }

    public Graph layout(Layout layout) {
        this.layout = layout;
        return this;
    }

    public Force force() {
        if (this.force == null) {
            this.force = new Force();
        }
        return this.force;
    }

    public Graph force(Force force) {
        this.force = force;
        return this;
    }

    public Double nodeScaleRatio() {
        return this.nodeScaleRatio;
    }

    public Graph nodeScaleRatio(Double nodeScaleRatio) {
        this.nodeScaleRatio = nodeScaleRatio;
        return this;
    }

    /**
     * 获取coolDown值
     */
    public Object coolDown() {
        return this.coolDown;
    }

    /**
     * 设置coolDown值
     *
     * @param coolDown
     */
    public Graph coolDown(Object coolDown) {
        this.coolDown = coolDown;
        return this;
    }

    /**
     * 获取ratioScaling值
     */
    public Boolean ratioScaling() {
        return this.ratioScaling;
    }

    /**
     * 设置ratioScaling值
     *
     * @param ratioScaling
     */
    public Graph ratioScaling(Boolean ratioScaling) {
        this.ratioScaling = ratioScaling;
        return this;
    }


    /**
     * 获取preventOverlap值
     */
    public Boolean preventOverlap() {
        return this.preventOverlap;
    }

    /**
     * 设置preventOverlap值
     *
     * @param preventOverlap
     */
    public Graph preventOverlap(Boolean preventOverlap) {
        this.preventOverlap = preventOverlap;
        return this;
    }

    /**
     * 设置categories值
     *
     * @param categories
     */
    public Graph categories(List<Category> categories) {
        this.categories = categories;
        return this;
    }

    /**
     * 设置nodes值
     *
     * @param nodes
     */
    public Graph nodes(List nodes) {
        this.nodes = nodes;
        return this;
    }

    /**
     * 设置links值
     *
     * @param links
     */
    public Graph links(List<Link> links) {
        this.links = links;
        return this;
    }

    /**
     * 设置links值
     *
     * @param edges
     */
    public Graph edges(List<Link> edges) {
        this.edges = edges;
        return this;
    }

    /**
     * 力导向图中节点的分类
     */
    public List<Category> categories() {
        if (this.categories == null) {
            this.categories = new ArrayList<Category>();
        }
        return this.categories;
    }

    /**
     * 添加节点分类
     *
     * @param values
     * @return
     */
    public Graph categories(Category... values) {
        if (values == null || values.length == 0) {
            return this;
        }
        this.categories().addAll(Arrays.asList(values));
        return this;
    }

    /**
     * 添加节点分类，使用分类名
     *
     * @param names
     * @return
     */
    public Graph categories(String... names) {
        if (names == null || names.length == 0) {
            return this;
        }
        for (String name : names) {
            this.categories().add(new Category(name));
        }
        return this;
    }

    /**
     * 添加节点分类，使用分类名
     *
     * @param values
     * @return
     */
    public Graph categories(Object... values) {
        if (values == null || values.length == 0) {
            return this;
        }
        for (Object value : values) {
            if (value instanceof String) {
                this.categories().add(new Category((String) value));
            } else if (value instanceof Category) {
                this.categories().add((Category) value);
            }
            //其他忽略
        }
        return this;
    }

    /**
     * 力导向图的顶点数据
     */
    public List<Node> nodes() {
        if (this.nodes == null) {
            this.nodes = new ArrayList();
        }
        return this.nodes;
    }

    /**
     * 添加力导向图的顶点数据
     *
     * @param values
     * @return
     */
    public Graph nodes(Node... values) {
        if (values == null || values.length == 0) {
            return this;
        }
        this.nodes().addAll(Arrays.asList(values));
        return this;
    }

    /**
     * 力导向图的边数据
     */
    public List<Link> links() {
        if (this.links == null) {
            this.links = new ArrayList<Link>();
        }
        return this.links;
    }

    /**
     * 添加力导向图的边数据
     *
     * @param values
     * @return
     */
    public Graph links(Link... values) {
        if (values == null || values.length == 0) {
            return this;
        }
        this.links().addAll(Arrays.asList(values));
        return this;
    }

    /**
     * 力导向图的边数据
     */
    public List<Link> edges() {
        if (this.edges == null) {
            this.edges = new ArrayList<Link>();
        }
        return this.edges;
    }

    /**
     * 添加力导向图的边数据
     *
     * @param values
     * @return
     */
    public Graph edges(Link... values) {
        if (values == null || values.length == 0) {
            return this;
        }
        this.edges().addAll(Arrays.asList(values));
        return this;
    }

    /**
     * 获取center值
     */
    public Object center() {
        return this.center;
    }

    /**
     * 设置center值
     *
     * @param center
     */
    public Graph center(Object center) {
        this.center = center;
        return this;
    }

    /**
     * 获取size值
     */
    public Object size() {
        return this.size;
    }

    /**
     * 设置size值
     *
     * @param size
     */
    public Graph size(Object size) {
        this.size = size;
        return this;
    }

    /**
     * 获取minRadius值
     */
    public Integer minRadius() {
        return this.minRadius;
    }

    /**
     * 设置minRadius值
     *
     * @param minRadius
     */
    public Graph minRadius(Integer minRadius) {
        this.minRadius = minRadius;
        return this;
    }

    /**
     * 获取maxRadius值
     */
    public Integer maxRadius() {
        return this.maxRadius;
    }

    /**
     * 设置maxRadius值
     *
     * @param maxRadius
     */
    public Graph maxRadius(Integer maxRadius) {
        this.maxRadius = maxRadius;
        return this;
    }

    /**
     * 获取linkSymbol值
     */
    public Object linkSymbol() {
        return this.linkSymbol;
    }

    /**
     * 设置linkSymbol值
     *
     * @param linkSymbol
     */
    public Graph linkSymbol(Symbol linkSymbol) {
        this.linkSymbol = linkSymbol;
        return this;
    }

    /**
     * 设置linkSymbol值
     *
     * @param linkSymbol
     */
    public Graph linkSymbol(String linkSymbol) {
        this.linkSymbol = linkSymbol;
        return this;
    }

    /**
     * 获取linkSymbolSize值
     */
    public Integer linkSymbolSize() {
        return this.linkSymbolSize;
    }

    /**
     * 设置linkSymbolSize值
     *
     * @param linkSymbolSize
     */
    public Graph linkSymbolSize(Integer linkSymbolSize) {
        this.linkSymbolSize = linkSymbolSize;
        return this;
    }

    /**
     * 获取scaling值
     */
    public Double scaling() {
        return this.scaling;
    }

    /**
     * 设置scaling值
     *
     * @param scaling
     */
    public Graph scaling(Double scaling) {
        this.scaling = scaling;
        return this;
    }

    /**
     * 获取gravity值
     */
    public Double gravity() {
        return this.gravity;
    }

    /**
     * 设置gravity值
     *
     * @param gravity
     */
    public Graph gravity(Double gravity) {
        this.gravity = gravity;
        return this;
    }

    /**
     * 获取draggable值
     */
    public Boolean draggable() {
        return this.draggable;
    }

    /**
     * 设置draggable值
     *
     * @param draggable
     */
    public Graph draggable(Boolean draggable) {
        this.draggable = draggable;
        return this;
    }

    /**
     * 获取large值
     */
    public Boolean large() {
        return this.large;
    }

    /**
     * 设置large值
     *
     * @param large
     */
    public Graph large(Boolean large) {
        this.large = large;
        return this;
    }

    /**
     * 获取useWorker值
     */
    public Boolean useWorker() {
        return this.useWorker;
    }

    /**
     * 设置useWorker值
     *
     * @param useWorker
     */
    public Graph useWorker(Boolean useWorker) {
        this.useWorker = useWorker;
        return this;
    }

    /**
     * 获取steps值
     */
    public Integer steps() {
        return this.steps;
    }

    /**
     * 设置steps值
     *
     * @param steps
     */
    public Graph steps(Integer steps) {
        this.steps = steps;
        return this;
    }

    /**
     * 获取roam值
     */
    public Object roam() {
        return this.roam;
    }

    /**
     * 设置roam值
     *
     * @param roam
     */
    public Graph roam(Boolean roam) {
        this.roam = roam;
        return this;
    }

    /**
     * 设置roam值
     *
     * @param roam
     */
    public Graph roam(Roam roam) {
        this.roam = roam;
        return this;
    }
}
