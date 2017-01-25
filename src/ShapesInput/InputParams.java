package ShapesInput;

import Interfaces.IInputVaries;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by andrey on 25.01.17.
 */

public  class InputParams{
    IInputVaries iInputVaries;

    public InputParams(IInputVaries input){
        iInputVaries=input;
    }

    public double[] input(){
        return iInputVaries.getParams(read());
    }

    protected BufferedReader read(){
        return new BufferedReader(new InputStreamReader(System.in));
    }
}
