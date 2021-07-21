package id.bafika.echart.options;

import java.util.*;

import id.bafika.echart.options.code.Align;
import id.bafika.echart.options.code.LegendIcon;
import id.bafika.echart.options.code.LegendType;
import id.bafika.echart.options.code.Orient;
import id.bafika.echart.options.style.TextStyle;

@SuppressWarnings("unchecked")
public class Legend extends Basic<Legend> implements Data<Legend>, Component {
    /**
     * 布局方式，默认为水平布局，可选为：'horizontal' | 'vertical'
     *
     */
    private Orient orient;

    /**
     * 设置分页方式
     */
    private LegendType type ;

    private LegendIcon icon;

    /**
     * 图例图形宽度
     */
    private Integer itemWidth;
    /**
     * 图例图形高度
     */
    private Integer itemHeight;
    /**
     * 文字样式
     *
     */
    private TextStyle textStyle;
    /**
     * 选择模式，默认开启图例开关
     *
     */
    private Object selectedMode;
    /**
     * 配置默认选中状态，可配合LEGEND.SELECTED事件做动态数据载入
     */
    private Map<String, Boolean> selected;
    /**
     * 图例内容数组，数组项通常为{string}，每一项代表一个系列的name。
     *
     */
    private List data;

    private Align align;
    private String formatter;

    private String pageIconColor;
    private String pageIconInactiveColor;
    private TextStyle pageTextStyle;

    /**
     * 构造函数
     */
    public Legend() {
    }

    /**
     * 构造函数,参数:values
     *
     * @param values
     */
    public Legend(Object... values) {
        this.data(values);
    }

    public LegendType type(){
        return this.type;
    }

    public Legend type(LegendType type) {
        this.type = type;
        return this;
    }

    public LegendIcon icon(){
        return this.icon;
    }

    public Legend icon(LegendIcon icon) {
        this.icon = icon;
        return this;
    }

    public Align align() {
        return this.align;
    }

    public Legend align(Align align) {
        this.align = align;
        return this;
    }

    public String formatter() {
        return this.formatter;
    }

    public Legend formatter(String formatter) {
        this.formatter = formatter;
        return this;
    }

    public String pageIconColor() {
        return this.pageIconColor;
    }

    public Legend pageIconColor(String pageIconColor) {
        this.pageIconColor = pageIconColor;
        return this;
    }

    public String pageIconInactiveColor() {
        return this.pageIconInactiveColor;
    }

    public Legend pageIconInactiveColor(String pageIconInactiveColor) {
        this.pageIconInactiveColor = pageIconInactiveColor;
        return this;
    }

    /**
     * 设置pageTextStyle值
     *
     * @param pageTextStyle
     */
    public Legend pageTextStyle(TextStyle pageTextStyle) {
        this.pageTextStyle = pageTextStyle;
        return this;
    }

    /**
     * 设置textStyle值
     *
     * @param textStyle
     */
    public Legend textStyle(TextStyle textStyle) {
        this.textStyle = textStyle;
        return this;
    }

    /**
     * 设置data值
     *
     * @param data
     */
    public Legend data(List data) {
        this.data = data;
        return this;
    }

    /**
     * 获取orient值
     */
    public Orient orient() {
        return this.orient;
    }

    /**
     * 设置orient值
     *
     * @param orient
     */
    public Legend orient(Orient orient) {
        this.orient = orient;
        return this;
    }

    /**
     * 获取itemWidth值
     */
    public Integer itemWidth() {
        return this.itemWidth;
    }

    /**
     * 设置itemWidth值
     *
     * @param itemWidth
     */
    public Legend itemWidth(Integer itemWidth) {
        this.itemWidth = itemWidth;
        return this;
    }

    /**
     * 获取itemHeight值
     */
    public Integer itemHeight() {
        return this.itemHeight;
    }

    /**
     * 设置itemHeight值
     *
     * @param itemHeight
     */
    public Legend itemHeight(Integer itemHeight) {
        this.itemHeight = itemHeight;
        return this;
    }

    /**
     * 文字样式
     *
     */
    public TextStyle textStyle() {
        if (this.textStyle == null) {
            this.textStyle = new TextStyle();
        }
        return this.textStyle;
    }

    /**
     * 文字样式
     *
     */
    public TextStyle pageTextStyle() {
        if (this.pageTextStyle == null) {
            this.pageTextStyle = new TextStyle();
        }
        return this.pageTextStyle;
    }

    /**
     * 获取selectedMode值
     */
    public Object selectedMode() {
        return this.selectedMode;
    }

    /**
     * 设置selectedMode值
     *
     * @param selectedMode
     */
    public Legend selectedMode(Object selectedMode) {
        this.selectedMode = selectedMode;
        return this;
    }


    /**
     * 获取selected值
     *
     * @param name
     */
    public Boolean selected(String name) {
        if (this.selected == null) {
            return null;
        } else {
            return selected.get(name);
        }
    }

    /**
     * 设置默认选中状态
     *
     * @param name
     * @param selected
     * @return
     */
    public Legend selected(String name, Boolean selected) {
        if (!this.data.contains(name)) {
            throw new RuntimeException("Legend中不包含name为" + name + "的图例");
        }
        if (this.selected == null) {
            this.selected = new LinkedHashMap<String, Boolean>();
        }
        this.selected.put(name, selected);
        return this;
    }

    /**
     * 获取data值
     */
    public List data() {
        if (this.data == null) {
            this.data = new ArrayList();
        }
        return this.data;
    }

    /**
     * 添加图例属性
     *
     * @param values
     * @return
     */
    public Legend data(Object... values) {
        if (values == null || values.length == 0) {
            return this;
        }
        this.data().addAll(Arrays.asList(values));
        return this;
    }
}
