package ShapesInput;

import java.io.BufferedReader;
import java.io.IOException;

/**
 * Created by andrey on 25.01.17.
 */
public class ShapeInput {
    protected String inputString(BufferedReader br){
        String inputString="";
        try {
            inputString=br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return inputString;
    }
    protected double[] getProperties(String strParams, int paramCount){
        if(strParams.matches("(\\d+(\\.\\d*)? ?){"+paramCount+"}")) {
            String[] paramsStr=strParams.split(" ");
            double[] params=new double[paramCount];
            byte i=0;
            for (String param:paramsStr){
                if(!param.isEmpty() && !param.equals("0")) {
                    params[i] = Double.parseDouble(param);
                    i++;
                }
            }
            return params;
        }
        return new double[0];
    }
}
