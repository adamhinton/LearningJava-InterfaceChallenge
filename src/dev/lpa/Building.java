package dev.lpa;

public class Building implements Mappable {


    public String label;
    public GeometryType type = GeometryType.POINT;
    public String marker;

    public Building(String label, GeometryType type, String marker) {
        this.label = label;
        this.type = type;
        this.marker = marker;
    }

    @Override
    public String getLabel() {
        return label;
    }

    @Override
    public GeometryType getType() {
        return type;
    }

    @Override
    public String getMarker() {
        return marker;
    }
}

// Building class
// Geometry type of POINT
// Shown on city map as a point with the icon and label specified
