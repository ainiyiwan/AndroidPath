package com.zy.xxl.androidpath;

import android.os.Bundle;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {


    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.tv);
    }

    public void click(View view) {
        String path = Environment.getDownloadCacheDirectory().getAbsolutePath();
        String path1 = Environment.getDataDirectory().getAbsolutePath();
        String path2 = Environment.getDownloadCacheDirectory().getAbsolutePath();
        String path3 = Environment.getExternalStorageDirectory().getAbsolutePath();
        String path4 = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_MUSIC).getAbsolutePath();
        String path5 = Environment.getExternalStorageState();
        String path6 = Environment.getRootDirectory().getAbsolutePath();
        boolean path7 = Environment.isExternalStorageEmulated();
        boolean path8 = Environment.isExternalStorageRemovable();
        textView.setText(path);
    }

    public void click1(View view) {
        String path = this.getCacheDir().getPath();
        String path1 = this.getCacheDir().getAbsolutePath();
        try {
            String path2 = this.getCacheDir().getCanonicalPath();
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP) {
            String path3 = this.getCodeCacheDir().getAbsolutePath();
        }
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
            String path4 = this.getDataDir().getAbsolutePath();
        }
        String path5 = this.getExternalCacheDir().getAbsolutePath();
        textView.setText(path5);
    }
}
