package dev.lpa;

public interface Mappable{


    String getLabel();
    GeometryType getType();
    String getMarker();

    public final String JSON_PROPERTY = """
            "properties":{%s}
            """;

    default void toJson() {
        System.out.println(String.format(JSON_PROPERTY,
                "\"type\": \"" + getType().toString() + "\", " +
                        "\"label\": \"" + getLabel() + "\", " +
                        "\"marker\": \"" + getMarker() + "\""));
    }
}
// "properties": {"type": "POINT", "label": "Sydney Town Hall (GOVERNMENT)", "marker": "RED STAR", "name": Sydney Town Hall, "usage": "GOVERNMENT" }