package com.example.administrator.color;

/**
 * Created by Administrator on 12/25/2017.
 */

public class ObjectModel {
    private String category;
    private int categorySound;
    private String categoryColor;
    private String objectName;
    private int objectSound;
    private int objectImg;

    public ObjectModel(String category, int categorySound, String categoryColor, String objectName, int objectSound, int objectImg) {
        this.category = category;
        this.categorySound = categorySound;
        this.categoryColor = categoryColor;
        this.objectName = objectName;
        this.objectSound = objectSound;
        this.objectImg = objectImg;
    }

    public String getCategory() {
        return category;
    }

    public int getCategorySound() {
        return categorySound;
    }

    public String getCategoryColor() {
        return categoryColor;
    }

    public String getObjectName() {
        return objectName;
    }

    public int getObjectSound() {
        return objectSound;
    }

    public int getObjectImg() {
        return objectImg;
    }
}
