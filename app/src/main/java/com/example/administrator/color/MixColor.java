package com.example.administrator.color;

/**
 * Created by Administrator on 12/22/2017.
 */

public class MixColor {
    private int id;
    private String colorName;
    private String colorValue;
    private int colorSound;

    public MixColor(String colorName, String colorValue, int colorSound) {
        this.colorName = colorName;
        this.colorValue = colorValue;
        this.colorSound = colorSound;
    }

    public int getColorSound() {
        return colorSound;
    }

    public void setColorSound(int colorSound) {
        this.colorSound = colorSound;
    }

    public String getColorName() {
        return colorName;
    }

    public void setColorName(String colorName) {
        this.colorName = colorName;
    }

    public String getColorValue() {
        return colorValue;
    }

    public void setColorValue(String colorValue) {
        this.colorValue = colorValue;
    }
}
