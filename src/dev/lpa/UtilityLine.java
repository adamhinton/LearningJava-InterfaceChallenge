package dev.lpa;

public class UtilityLine {

    private final GeometryType type = GeometryType.LINE;
    private String label;
    private String marker;

    public GeometryType getType() {
        return type;
    }

    public String getLabel() {
        return label;
    }

    public String getMarker() {
        return marker;
    }
}
