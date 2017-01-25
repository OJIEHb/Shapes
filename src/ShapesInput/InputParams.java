package ShapesInput;

import Interfaces.IInputVariables;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by andrey on 25.01.17.
 */

public  class InputParams{
    IInputVariables iInputVaries;

    public InputParams(IInputVariables input){
        iInputVaries=input;
    }

    public double[] input(){
        return iInputVaries.getParams(read());
    }

    protected BufferedReader read(){
        return new BufferedReader(new InputStreamReader(System.in));
    }
}
