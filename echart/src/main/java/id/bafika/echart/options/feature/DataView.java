package id.bafika.echart.options.feature;

public class DataView extends Feature {
    /**
     * 构造函数
     */
    public DataView() {
        this.show(true);
        this.title("数据视图");
        this.readOnly(false);
        this.lang(new String[]{"数据视图", "关闭", "刷新"});
    }
}
