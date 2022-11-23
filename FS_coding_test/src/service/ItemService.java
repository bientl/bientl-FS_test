package service;

import java.util.ArrayList;
import java.util.Scanner;

import model.BookOnTape;
import model.Furniture;
import model.Thing;
import model.Video;


public class ItemService {
    private ArrayList<Thing> listItem;
    Scanner sc = new Scanner(System.in);

    public ItemService() {
        Thing video1 = new Video("The Peripheral", "VD3128", 12);
        Thing video2 = new Video("Top Gun: Maverick", "VD8178", 10);
        Thing video3 = new Video("Overdose", "VD7239", 11);
        Thing video4 = new Video("Run Sweetheart Run", "VD5423", 15);

        Thing book1 = new BookOnTape("Things We Never Got Over", "BOT8721", 19, "Lucy Score");
        Thing book2 = new BookOnTape("The Prophet", "BOT6422", 17, "Kahlil Gibran");
        Thing book3 = new BookOnTape("A Gentleman in Moscow", "BOT4712", 20, "Audible Audiobook");
        Thing book4 = new BookOnTape("His Wicked Embrace", "BOT1232", 22, "Lauren Smith");

        Thing furniture1 = new Furniture("Chill Sack Bean Bag", "F6718", 30, "chair");
        Thing furniture2 = new Furniture("Lokase Home", "F8462", 37, "sofa");
        Thing furniture3 = new Furniture("ZINUS Josh Loveseat", "F1242", 35, "sofa");
        Thing furniture4 = new Furniture("Christopher Home", "F2543", 40, "bed");

        ArrayList<Thing> itemData = new ArrayList<>();
        itemData.add(video1);
        itemData.add(video2);
        itemData.add(video3);
        itemData.add(video4);
        itemData.add(book1);
        itemData.add(book2);
        itemData.add(book3);
        itemData.add(book4);
        itemData.add(furniture1);
        itemData.add(furniture2);
        itemData.add(furniture3);
        itemData.add(furniture4);
   
        this.listItem = itemData;
    }

    public ItemService(ArrayList<Thing> listItem) {
        this.listItem = listItem;
    }

    //1. Add Items to Data
    public void addItem(Thing item){
        this.listItem.add(item);
    }

    public void addNewItem(String itemType){
        if(itemType.equalsIgnoreCase("V")){
            System.out.print("Enter video name:"); String name = sc.nextLine();
            System.out.print("Enter serial number:"); String serialNum = sc.nextLine();
            System.out.print("Enter retal price (number):"); long rentPrice = sc.nextLong();
            Video newVideo = new Video(name, serialNum, rentPrice);
            this.addItem(newVideo); 
            System.out.println("Add new item successfully!"); 
        } else if(itemType.equalsIgnoreCase("B")){
            System.out.print("Enter book name:"); String name = sc.nextLine();
            System.out.print("Enter author name:"); String author = sc.nextLine();
            System.out.print("Enter serial number:"); String serialNum = sc.nextLine();
            System.out.print("Enter retal price(number):"); long rentPrice = sc.nextLong();
            BookOnTape newBook = new BookOnTape(name, serialNum, rentPrice, author);
            this.addItem(newBook);
            System.out.println("Add new item successfully!");
        } else if(itemType.equalsIgnoreCase("F")){
            System.out.print("Enter furniture name:"); String name = sc.nextLine();
            System.out.print("Enter furniture type:"); String type = sc.nextLine();
            System.out.print("Enter serial number:"); String serialNum = sc.nextLine();
            System.out.print("Enter retal price(number):"); long rentPrice = sc.nextLong();
            Furniture newFurniture = new Furniture(name, serialNum, rentPrice, type);
            this.addItem(newFurniture);
            System.out.println("Add new item successfully!");
        } else {
            System.out.println("Not found!");
        }
    }

    //2. Show all info of items
    public void getItemInfos(String itemType){
        if(itemType.equalsIgnoreCase("V")){
            for (Thing thing : this.listItem) {
                if(thing instanceof Video){
                    System.out.println(thing.getDescription());
                }
            }
        }
        if(itemType.equalsIgnoreCase("B")){
            for (Thing thing : this.listItem) {
                if(thing instanceof BookOnTape){
                    System.out.println(thing.getDescription());
                }
            }
        }
        if(itemType.equalsIgnoreCase("F")){
            for (Thing thing : this.listItem) {
                if(thing instanceof Furniture){
                    System.out.println(thing.getDescription());
                }
            }
        }
        if(itemType.equalsIgnoreCase("A")){
            for (Thing thing : this.listItem) {
                    System.out.println(thing.getDescription());
            }
        }
    }

    //3. Get item info by serial number
    public void getItemInfoBySerial(String serialNumer){
        int check = 0;
        for (Thing thing : this.listItem) {
            if(serialNumer.equalsIgnoreCase(thing.getSerialNumber())){
                System.out.println("Item found!");
                System.out.println(thing.getDescription());
                check ++;
            } 
        }
        if(check == 0){
            System.out.println("Not found item with this serial number!");
        }
    }

    //Getter Setter
    public ArrayList<Thing> getListItem() {
        return listItem;
    }

    public void setListItem(ArrayList<Thing> listItem) {
        this.listItem = listItem;
    }
}
