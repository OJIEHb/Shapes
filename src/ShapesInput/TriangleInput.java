package ShapesInput;

import Interfaces.IInputVariables;
import Shapes.Triangle;
import java.io.BufferedReader;

/**
 * Created by andrey on 25.01.17.
 */
public class TriangleInput extends ShapeInput implements IInputVariables {
    @Override
    public double[] getParams(BufferedReader br) {
        do {
            System.out.print("Enter triangle sides a b c: ");
            double[] params = getProperties(inputString(br),3);
            boolean isExist = Triangle.isExist(params[0],params[1],params[2]);
            if(params.length==3&&isExist)
                return params;
            System.out.println("ERROR: Wrong  arguments.Try again");
        }while (true);
    }


}
