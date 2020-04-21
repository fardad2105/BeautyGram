package com.example.beautygram.views;

import android.graphics.Color;
import android.os.Build;
import android.view.View;
import android.view.Window;

import androidx.core.content.ContextCompat;

import com.example.beautygram.R;

public class UI {

    private Window window;

    public UI(Window window) {
        this.window = window;
    }

    public UI setFullScreen() {
        window.getDecorView().setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN);
        return this;
    }

    public UI setStatusBarColor(int color) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP)
            window.setStatusBarColor(window.getContext().getResources().getColor(color));
        return this;
    }

    public UI setStatusBarTransparent() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP)
            window.setStatusBarColor(Color.TRANSPARENT);
        return this;
    }

    public UI setStatusBarIconsDark() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M)
            window.getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
        return this;
    }

    public UI setStatusBarIconsLight(int color) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M)
            window.setStatusBarColor(ContextCompat.getColor(window.getContext(), color));
        return this;
    }
}
