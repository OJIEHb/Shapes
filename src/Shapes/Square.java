package Shapes;

/**
 * Created by andrey on 25.01.17.
 */
public class Square extends Rectangle {

    public Square(double side) {
        super(side, side);
    }

    @Override
    public String toString(){
        return String.format("Square:\n\tA =%.2f",sideA);
    }
}
