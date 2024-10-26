package chapter6;

/*
 * Write a class that creates instances of the Rectangle class to find the
 * total area of two rooms in a house
 */

public class HomeAreaCalculator {
    public static void main(String[] args) {
        //Rectangle 1

        //Create instance of Rectangle class
        Rectangle roomOne = new Rectangle();
        roomOne.setLength(25);
        roomOne.setWidth(30);
        double areaOfRoomOne = roomOne.calculateArea();

        //Rectangle 2

        // Create instance of a Rectangle class
        Rectangle roomTow = new Rectangle(60, 75);
        double areaOfRoomTwo = roomTow.calculateArea();

        double totalArea = areaOfRoomOne + areaOfRoomTwo;

        System.out.println("Area of both rooms: " + totalArea);
    }
}
