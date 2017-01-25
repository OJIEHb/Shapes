import Enums.Shapes;
import Factories.ShapesFactory;
import Interfaces.IShape;
import ShapesInput.InputParams;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;


/**
 * Created by andrey on 25.01.17.
 */
public class Main {
    public static void main(String[] args){
        boolean isExit=true;
        IShape shape;
        Shapes inputShapeType;
        do{
            System.out.print("Please enter shape type(Circle, Triangle, Square,Rectangle) or 'exit': ");
            String inputStr=input();
            if(inputStr.equals("exit")) {
                isExit=false;
            }else{
                try {
                    inputShapeType = Shapes.valueOf(inputStr.toUpperCase());
                }catch (IllegalArgumentException e) {
                    System.out.println("ERROR:Invalid command. Try again!");
                    inputShapeType=null;
                }
                if(inputShapeType!=null){
                    InputParams inputParams= ShapesFactory.getProperties(inputShapeType);
                    double[] properties=inputParams.input();
                    shape=ShapesFactory.getShape(inputShapeType,properties);
                    double perimetr = shape.calculatePerimetr();
                    double area =shape.calculateArea();
                    System.out.println(shape.toString());
                    System.out.println("Perimetr = "+perimetr);
                    System.out.println("Area = "+area);
                }
            }
        }while (isExit);
    }

    public static String input(){
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String inputStr= null;
        try {
            inputStr = br.readLine().trim();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return inputStr;
    }
}
