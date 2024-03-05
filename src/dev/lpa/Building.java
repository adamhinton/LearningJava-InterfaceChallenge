package dev.lpa;

public class Building implements Mappable {


    private String label;
    private final GeometryType type = GeometryType.POINT;
    private String marker;

    public Building(String label, String marker) {
        this.label = label;
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
