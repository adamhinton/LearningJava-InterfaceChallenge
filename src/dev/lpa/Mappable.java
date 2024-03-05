package dev.lpa;

public interface Mappable{

    public String label;
    public GeometryType type;
    public String marker;
    public String name;



    default String getLabel(){
        return label;
    };

    default GeometryType getType(){
        return type;
    }

    default String getMarker(){
        return marker;
    }

}