package Shapes;

import Interfaces.IShape;

/**
 * Created by andrey on 25.01.17.
 */
public class Triangle implements IShape {
    protected double sideA;
    protected double sideB;
    protected double sideC;

    public Triangle(double sideA, double sideB, double sideC){
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public double calculateArea() {
        double p = calculatePerimetr()/2;
        return Math.sqrt(p*(p-sideA)*(p-sideB)*(p-sideC));
    }

    @Override
    public double calculatePerimetr() {
        return sideA+sideB+sideC;
    }

    @Override
    public String toString(){
        return String.format("Triangle:\n\tA =%.2f\n\tB =%.2f\n\tB =%.2f",sideA,sideB,sideC);
    }

    public static boolean isExist(double a, double b, double c){
        return ((a+b)>c && (a+c)>b && (c+b)>a)?true:false;
    }
}
