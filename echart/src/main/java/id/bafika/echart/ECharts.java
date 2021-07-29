package id.bafika.echart;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;

import androidx.annotation.RequiresApi;

import id.bafika.echart.options.json.GsonOption;

public class ECharts extends RelativeLayout {

    private final Context context;

    private ItemClick itemClick;

    private WebView webView;
    private ProgressBar progressBar;

    private String theme;
    private GsonOption options;

    private boolean progressEnabled = true;
    private Drawable progressDrawable;

    public ECharts(Context context) {
        super(context);
        this.context = context;
        initView();
    }

    public ECharts(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.context    = context;
        initView();
    }

    public ECharts(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.context    = context;
        initView();
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public ECharts(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        this.context    = context;
        initView();
    }

    public void initView() {
        inflate(context, R.layout.echarts, this);

        webView     = findViewById(R.id.webView);
        progressBar = findViewById(R.id.progressBar);
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    public void build() {
        progressBar.setEnabled(progressEnabled);
        progressBar.setProgressDrawable(progressDrawable);

        String content  = Utils.getMain(getContext());
        content         = content.replace("%theme%", theme);
        content         = content.replace("%options%", options.toString());

        WebSettings settings = webView.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setLoadWithOverviewMode(true);
        settings.setDomStorageEnabled(true);

        webView.requestFocusFromTouch();
        webView.setBackgroundColor(0);
        webView.loadDataWithBaseURL("file:///android_asset/", content, "text/html", "utf-8", null);
        webView.setWebViewClient(new WebViewClient() {
            @Override
            public void onPageStarted(WebView view, String url, Bitmap favicon) {
                super.onPageStarted(view, url, favicon);
                progressBar.setVisibility(VISIBLE);
            }

            @Override
            public void onPageFinished(WebView view, String url) {
                super.onPageFinished(view, url);
                progressBar.setVisibility(GONE);
            }
        });
        webView.addJavascriptInterface(new JsInterface(itemClick), "BAFIKA");
        webView.reload();
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public void setOptions(GsonOption options) {
        this.options = options;
    }

    public void setProgressEnabled(boolean progressEnabled) {
        this.progressEnabled = progressEnabled;
    }

    public void setProgressDrawable(Drawable progressDrawable) {
        this.progressDrawable = progressDrawable;
    }

    public void setListener(ItemClick itemClick) {
        this.itemClick = itemClick;
    }

    @SuppressLint("DefaultLocale")
    public void setHighlight(int seriesIndex, int dataIndex) {
        webView.evaluateJavascript(String.format("setHighlight(%d, %d)", seriesIndex, dataIndex), null);
    }
}
