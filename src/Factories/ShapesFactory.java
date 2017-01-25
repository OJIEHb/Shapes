package Factories;

import Enums.Shapes;
import Interfaces.IShape;
import ShapesInput.*;
import Shapes.*;

/**
 * Created by andrey on 25.01.17.
 */
public class ShapesFactory {
        public static IShape getShape(Shapes defShape, double[] properties){
            switch (defShape) {
                case CIRCLE:
                    return new Circle(properties[0]);
                case RECTANGLE:
                    return new Rectangle(properties[0],properties[1]);
                case SQUARE:
                    return new Square(properties[0]);
                case TRIANGLE:
                    return new Triangle(properties[0],properties[1],properties[2]);
            }
            return null;
        }

    public static InputParams getProperties(Shapes defShape){
        switch (defShape) {
            case CIRCLE:
                return new InputParams(new CircleInput());
            case RECTANGLE:
                return new InputParams(new RectangleInput());
            case SQUARE:
                return new InputParams(new SquareInput());
            case TRIANGLE:
                return new InputParams(new TriangleInput());
        }
        return null;
    }
    }