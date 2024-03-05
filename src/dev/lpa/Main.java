package dev.lpa;

public class Main {
    public static void main(String[] args) {

    }
}



// Creating a geoJSON mapping program

// Make a string for every feature htat'll be mapped
// "properties": { "name" : "Sydney Opera House", "usage": "Entertainment"}

// First, create a Mappable interface
// Forces three methods:
// one returns a label (how item desc on map)
// One returns a geometry type (POINT or LINE) : what the type looks like on the map
// Last returns an icon type (sometimes called a map marker)
// Also includes:
// Const str called JSON_PROPERTY. Equals "properties":{%s}
    // Using a text block will help maintain quot marks in output
// Default method toJSON() which prints type, label and marker
//Static method that takes in Mappable as arg. Prints properties of each Mappable type

// Two classses:

// Building class
// Geometry type of POINT
// Shown on city map as a point with the icon and label specified

// UtilityLine class
// Geometry type of Line
// Shown on a map as a line

// Final output:
// Geometry type, icon info, and label