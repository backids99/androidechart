package id.bafika.echart;

import android.content.Context;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class Utils {

    public static String getMain(Context context) {
        String str;
        String result       = "File gagal dimuat";
        StringBuilder sb    = new StringBuilder();
        InputStream is      = context.getResources().openRawResource(R.raw.main);
        BufferedReader br   = new BufferedReader(new InputStreamReader(is, StandardCharsets.UTF_8 ));

        try {
            while ((str = br.readLine()) != null) {
                sb.append(str);
            }
            br.close();

            if (!sb.toString().isEmpty()) result = sb.toString();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return result;
    }
}
