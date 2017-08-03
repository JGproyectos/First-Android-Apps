package com.unique.jcellomarcano.tipcalc;

import android.app.Application;

/**
 * Created by Jesùs Marcano on 28/8/2016.
 */

//Como hacer que la opcion vaya a un URL
public class TipCalcApp extends Application {
    private final static String About_URL = "https://plus.google.com/+JesusMarcanojcellomarcano";

    public String getAboutUrl() {
        return About_URL;
    }
}

