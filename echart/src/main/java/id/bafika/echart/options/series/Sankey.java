package id.bafika.echart.options.series;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import id.bafika.echart.options.code.SeriesType;
import id.bafika.echart.options.series.force.Link;
import id.bafika.echart.options.series.force.Node;

@SuppressWarnings("unchecked")
public class Sankey extends Series<Sankey> {
    /**
     * 图中每个矩形节点的宽度
     */
    private Integer nodeWidth;
    /**
     * 图中每一列任意两个矩形节点之间的间隔
     */
    private Integer nodeGap;
    /**
     * 布局的迭代次数，用来不断优化图中节点的位置，以减少节点和边之间的相互遮盖
     * 默认布局迭代次数：32
     * 经测试，布局迭代次数不要低于默认值
     */
    private Integer layoutIterations;
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
     * 构造函数
     */
    public Sankey() {
        this.type(SeriesType.sankey);
    }

    /**
     * 构造函数,参数:name
     *
     * @param name
     */
    public Sankey(String name) {
        super(name);
        this.type(SeriesType.sankey);
    }

    public Integer nodeWidth() {
        return this.nodeWidth;
    }

    public Sankey nodeWidth(Integer nodeWidth) {
        this.nodeWidth = nodeWidth;
        return this;
    }

    public Integer nodeGap() {
        return this.nodeGap;
    }

    public Sankey nodeGap(Integer nodeGap) {
        this.nodeGap = nodeGap;
        return this;
    }

    public Integer layoutIterations() {
        return this.layoutIterations;
    }

    public Sankey layoutIterations(Integer layoutIterations) {
        this.layoutIterations = layoutIterations;
        return this;
    }

    /**
     * 设置nodes值
     *
     * @param nodes
     */
    public Sankey nodes(List nodes) {
        this.nodes = nodes;
        return this;
    }

    /**
     * 设置links值
     *
     * @param links
     */
    public Sankey links(List<Link> links) {
        this.links = links;
        return this;
    }

    /**
     * 设置links值
     *
     * @param edges
     */
    public Sankey edges(List<Link> edges) {
        this.edges = edges;
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
    public Sankey nodes(Node... values) {
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
    public Sankey links(Link... values) {
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
    public Sankey edges(Link... values) {
        if (values == null || values.length == 0) {
            return this;
        }
        this.edges().addAll(Arrays.asList(values));
        return this;
    }
}
