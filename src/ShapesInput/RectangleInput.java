package ShapesInput;

import Interfaces.IInputVariables;
import java.io.BufferedReader;

/**
 * Created by andrey on 25.01.17.
 */
public class RectangleInput extends ShapeInput implements IInputVariables {
    @Override
    public double[] getParams(BufferedReader br) {
        do {
            System.out.print("Enter rectangle sides a b: ");
            double[] params = getProperties(inputString(br),2);
            if(params.length==2)
                return params;
            System.out.println("ERROR: Wrong  arguments.Try again!");
        }while (true);
    }

}