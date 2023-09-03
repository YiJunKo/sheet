import java.security.Permission;
import java.util.*;
public class Sheet implements Subject{
    double[][] sheetTable = new double[3][3];
    boolean readOnly = false;
    public void state(String permissions){
        if(permissions.equals("ReadOnly")){
            readOnly = true;
        }else if(permissions.equals("Writable")){
            readOnly = false;
        }
    }
    @Override
    public void printSheet(){
        for (int i = 0;i <= 2; i++){
            for (int j = 0; j <= 2; j++) {
                System.out.print(sheetTable[i][j] + ", ");
            }
            System.out.println();
        }
    }
    @Override
    public double changeSheet(int colume, int row, String operation){
        if(readOnly){
            System.out.println("This sheet is not accessible.");
        }else{
            double sum = 0;
            if(operation.contains("+")){
                for(String str: operation.split("\\+")){
                    sum += Double.parseDouble(str);
                }
            }

            if(operation.contains("-")){
                String y[] = operation.split("\\-");
                sum = 2*Double.parseDouble(y[0]);
                for(String str: operation.split("\\-")){
                    sum -= Double.parseDouble(str);
                }
            }

            if(operation.contains("*")){
                sum = 1;
                for(String str: operation.split("\\*")){
                    sum *= Double.parseDouble(str);
                }
            }

            if(operation.contains("/")){
                String y[] = operation.split("\\/");
                sum = Double.parseDouble(y[0]) * Double.parseDouble(y[0]);
                for(String str: operation.split("\\/")){
                    sum /= Double.parseDouble(str);
                }
            }
            sheetTable[colume][row] = sum;
            printSheet();
            return 0;
        }
        return 0;
    }
}
