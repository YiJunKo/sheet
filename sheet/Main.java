import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, User> users = new HashMap<String, User>();
        User user = new User();
        while(true){
            System.out.println("---------------Menu---------------\n" +
                    "1. Create a user\n" +
                    "2. Create a sheet\n" +
                    "3. Check a sheet\n" +
                    "4. Change a value in a sheet\n" +
                    "5. Change a sheet's access right\n" +
                    "6. Collaborate with an other user\n" +
                    "----------------------------------");

            String userName;
            String sheetName;
            switch(sc.nextLine()){
                case "1":
                    userName = sc.nextLine().replace(" ","");
                    users.put(userName, user);
                    user.createUser(userName);
                    break;
                case "2":
                    userName = sc.next();
                    sheetName = sc.nextLine().replace(" ","");
                    user.createSheet(userName, sheetName);
                    break;
                case "3":
                    userName = sc.next();
                    sheetName = sc.nextLine().replace(" ","");
                    users.get(userName).sheets.get(sheetName).printSheet();
                    break;
                case "4":
                    userName = sc.next();
                    sheetName = sc.nextLine().replace(" ","");
                    users.get(userName).sheets.get(sheetName).printSheet();
                    int colume = sc.nextInt();
                    int row = sc.nextInt();
                    String operation = sc.nextLine();
                    users.get(userName).sheets.get(sheetName).changeSheet(colume, row, operation);
                    break;
                case "5":
                    userName = sc.next();
                    sheetName = sc.next();
                    String readOnly = sc.nextLine().replace(" ","");
                    users.get(userName).sheets.get(sheetName).state(readOnly);
                    break;
                case "6":
                    userName = sc.next();
                    sheetName = sc.next();
                    String shareUserName = sc.nextLine().replace(" ","");
                    users.get(shareUserName).shareSheet(userName, sheetName, shareUserName);
                    break;
            }
        }
    }
}