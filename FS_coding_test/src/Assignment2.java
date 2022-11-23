
import java.util.Scanner;
import service.ItemService;

public class Assignment2 {
    //2.takes in a serial number and writes information on a given item
    public static void main(String[] args) {
        ItemService itemService = new ItemService();
        try (Scanner sc = new Scanner(System.in)) {
            int option = 0;
            do {
                System.out.println("Press number to select funtion:");
                System.out.println(
                    "1. Add new item to data. \n"
                  + "2. Show all info of items. \n"
                  + "3. Get item info by serial number. \n"
                  + "0. Exit program");
                option = sc.nextInt();
                sc.nextLine();
                if(option == 1){
                //1. Add new item to data.
                    System.out.println("What kind of item do you want to add? ()");
                    System.out.println("Press V for video, B for Book on tap, F for furniture");
                    itemService.addNewItem(sc.nextLine().trim());
                }
                else if(option == 2){
                    //2. Show all info of items
                    System.out.println("Show all info of:");
                    System.out.println("Press V for video, B for Book on tap, F for furniture or A for all items");
                    itemService.getItemInfos(sc.nextLine().trim());
                }
                else if(option == 3){
                    //3. Get item info by serial number
                    System.out.print("Enter serial number:");
                    itemService.getItemInfoBySerial(sc.nextLine().trim());
                }
                System.out.println("-----------------------");
                sc.nextLine();
            } while (option != 0);
        }
    }
}
