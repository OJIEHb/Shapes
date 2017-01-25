package Shapes;

import Interfaces.IShape;

/**
 * Created by andrey on 25.01.17.
 */
public class Rectangle implements IShape {
    protected double sideA;
    protected double sideB;

    public Rectangle(double sideA, double sideB){
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double calculateArea() {
        return sideA * sideB;
    }

    @Override
    public double calculatePerimetr() {
        return sideA*2+sideB*2;
    }

    @Override
    public String toString(){
        return String.format("Rectangle:\n\tA =%.2f\n\tB =%.2f",sideA,sideB);
    }
}
