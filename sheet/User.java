import java.util.*;
public class User implements Observer{
    HashMap<String, Sheet> sheets = new HashMap<String, Sheet>();
    Sheet sheet = new Sheet();
    @Override
    public void createUser(String userName){
        printUser(userName);
    }
    public void printUser(String userName){
        System.out.println("Create a user named " + userName);
    }
    @Override
    public void createSheet(String userName, String sheetName){
        System.out.println("Create a sheet named " + sheetName + " for " + userName);
        sheets.put(sheetName, sheet);
    }

    public void shareSheet(String userName, String sheetName, String shareUserName){
        sheets.put(sheetName, sheets.get(sheetName));
    }
}
