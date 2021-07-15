package id.bafika.echart.options.feature;

public class SaveAsImage extends Feature {
    /**
     * 构造函数
     */
    public SaveAsImage() {
        this.show(true);
        this.title("保存为图片");
        this.type("png");
        this.lang(new String[]{"点击保存"});
    }
}
