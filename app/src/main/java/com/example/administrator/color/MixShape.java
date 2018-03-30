package com.example.administrator.color;

/**
 * Created by Administrator on 1/2/2018.
 */

public class MixShape {
    private int id;
    private String shapeName;
    private int shapeValue;
    private int shapeSound;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getShapeName() {
        return shapeName;
    }

    public void setShapeName(String shapeName) {
        this.shapeName = shapeName;
    }

    public int getShapeValue() {
        return shapeValue;
    }

    public void setShapeValue(int shapeValue) {
        this.shapeValue = shapeValue;
    }

    public int getShapeSound() {
        return shapeSound;
    }

    public void setShapeSound(int shapeSound) {
        this.shapeSound = shapeSound;
    }

    public MixShape(String shapeName, int shapeValue, int shapeSound) {

        this.shapeName = shapeName;
        this.shapeValue = shapeValue;
        this.shapeSound = shapeSound;
    }
}
