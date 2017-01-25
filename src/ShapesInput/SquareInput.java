package ShapesInput;

import Interfaces.IInputVariables;
import java.io.BufferedReader;

/**
 * Created by andrey on 25.01.17.
 */
public class SquareInput extends ShapeInput implements IInputVariables {

    public double[] getParams(BufferedReader br) {
        do {
            System.out.print("Enter radius circle: ");
            double[] params = getProperties(inputString(br),1);
            if(params.length==1)
                return params;
            System.out.println("ERROR: Wrong  arguments.Try again");
        }while (true);
    }
}