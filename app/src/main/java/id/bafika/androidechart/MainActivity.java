package id.bafika.androidechart;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

import id.bafika.echart.ECharts;
import id.bafika.echart.options.Legend;
import id.bafika.echart.options.Theme;
import id.bafika.echart.options.Tooltip;
import id.bafika.echart.options.code.Align;
import id.bafika.echart.options.code.RoseType;
import id.bafika.echart.options.code.Trigger;
import id.bafika.echart.options.data.Data;
import id.bafika.echart.options.json.GsonOption;
import id.bafika.echart.options.series.Pie;
import id.bafika.echart.options.style.Color;
import id.bafika.echart.options.style.ItemStyle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Pie pie = new Pie("1");
        pie.name("Data 1")
            .radius("5%", "50%")
            .center("50%", "50%")
            .roseType(RoseType.area)
            .itemStyle(new ItemStyle().borderRadius(8));

        pie.data(new Data().value(40).name("Rose 1")
            .itemStyle(new ItemStyle().color("new echarts.graphic.LinearGradient(0, 0, 0, 1, [{offset: 0, color: '#000'},{offset: 1, color: '#fff'}] )")));
        ArrayList<Color.Item> colorItem = new ArrayList<>();
        colorItem.add(new Color.Item().offset(0).color("#000"));
        colorItem.add(new Color.Item().offset(1).color("#fae"));
        pie.data(new Data().value(30).name("Rose 2").itemStyle(new ItemStyle().color(Color.linearGradient(0, 0, 0, 1, colorItem))));
        pie.data(new Data().value(21).name("Rose 3"));
        pie.data(new Data().value(12).name("Rose 4"));
        pie.data(new Data().value(11).name("Rose 5"));
        pie.data(new Data().value(8).name("Rose 6"));

        GsonOption option = new GsonOption();
        option.title("Pie Chart")
                .backgroundColor("#00000000")
                .legend(new Legend().top(Align.bottom))
                .series(pie)
                .tooltip(new Tooltip().trigger(Trigger.item).formatter("<b>{b}</b> <br/>{c} (<i>{d}%</i>)"));

        ECharts eCharts = findViewById(R.id.chart);
        eCharts.setTheme(Theme.DARK);
        eCharts.setOptions(option);
        eCharts.build();

    }
}