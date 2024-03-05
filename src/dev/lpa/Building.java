package dev.lpa;

import java.awt.*;

enum UsageType { ENTERTAINMENT, GOVERNMENT, RESIDENTIAL, SPORTS }

public class Building implements Mappable{

    private String name;
    private UsageType usage;

    public Building(String name, UsageType usage) {
        this.name = name;
        this.usage = usage;
    }

    @Override
    public String getLabel() {
        return name + " (" + usage + ")";
    }

    @Override
    public GeometryType getShape() {
        return GeometryType.POINT;
    }

    @Override
    public String getMarker() {
        return switch(usage){
            case ENTERTAINMENT -> Color.GREEN + " " + PointMarker.TRIANGLE;
            case GOVERNMENT -> Color.RED + " " + PointMarker.STAR;
            case RESIDENTIAL -> Color.BLUE + " " + PointMarker.SQUARE;
            case SPORTS -> Color.ORANGE + " " + PointMarker.PUSH_PIN;
            default -> Color.BLACK + " " + PointMarker.CIRCLE;
        };
    }
}