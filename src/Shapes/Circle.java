package Shapes;

import Interfaces.IShape;

/**
 * Created by andrey on 25.01.17.
 */
public class Circle implements IShape {
    protected double radius;

    public Circle(double radius){
        this.radius=radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI*Math.pow(radius,2);
    }

    @Override
    public double calculatePerimetr() {
        return 2*Math.PI*radius;
    }
    @Override
    public String toString(){
        return String.format("Circle:\n\tradius=%.2f",this.radius);
    }
}
