package com.example;

public class AreaObject {

    private String type;
    private Integer radius;
    private Integer width;
    private Integer height;

    public AreaObject(String type, Integer radius, Integer width, Integer height) {
        this.type = type;
        this.radius = radius;
        this.width = width;
        this.height = height;
    }

    public AreaObject() {
        this.type = null;
        this.radius = null;
        this.width = null;
        this.height = null;
    }

    // Getters
    public String getType() {
        return type;
    }
    public Integer getRadius() {
        return radius;
    }
    public Integer getWidth() {
        return width;
    }
    public Integer getHeight() {
        return height;
    }

    // Setters
    public void setType(String type) {
        this.type = type;
    }
    public void setRadius(Integer radius) {
        this.radius = radius;
    }
    public void setWidth(Integer width) {
        this.width = width;
    }
    public void setHeight(Integer height) {
        this.height = height;
    }

    @Override public String toString() {
        switch (getType()) {
            case "circle":
                //Area of a circle with a radius of 4 is 50.26548
                if (getRadius() != null) {
                    return String.format("Area of a circle with a radius of %s is %.5f", getRadius(),
                            Math.PI * Math.pow(getRadius(), 2));
                }
                break;
            case "rectangle":
                //Area of a 4x7 rectangle is 28
                if (getWidth() != null && getHeight() != null) {
                    return String.format("Area of a %sx%s rectangle is %s", getWidth(), getHeight(),
                            getWidth() * getHeight());
                }
                break;
            default:
                return "Not a valid 'type' please choose either 'circle' or 'rectangle'.";
        }
        return "Invalid";
    }
}
