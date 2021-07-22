package id.bafika.echart;

import android.webkit.JavascriptInterface;

public class JsInterface {
    ItemClick itemClick;

    public JsInterface(ItemClick itemClick) {
        this.itemClick = itemClick;
    }

    @JavascriptInterface
    public void indexClick(int index)
    {
        if (itemClick != null) itemClick.index(index);
    }
}
