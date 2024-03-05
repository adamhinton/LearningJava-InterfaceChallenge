package dev.lpa;

public interface Mappable{

    String JSON_PROPERTY = """
            "properties": {%s}""";

    String getLabel();
    GeometryType getShape();
    String getMarker();

    default String toJson(){
        return """
                "type": "%s", "label": "%s", "marker": "%s" """
                .formatted(getShape(), getLabel(), getMarker());
    }

    static void mapIt(Mappable mappable){
        System.out.println(JSON_PROPERTY.formatted(mappable.toJson()));
    }
}