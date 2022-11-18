import java.util.ArrayList;
import java.util.Scanner;

class Inventory {
//The relevant items for an Inventory object will be the Name, Serial Number, and Value.
 public String name, serialNum;
 public int value;
  
  public Inventory(String name, String serialNum, int value){
    this.name = name;
    this.serialNum = serialNum;
    this.value = value;
  }
  @Override
  public String toString(){
    return name+","+serialNum+","+value;
  }
}

class Main {
	public static void main(String[] args) {

    ArrayList<Inventory> item = new ArrayList<Inventory>();
    Scanner input = new Scanner(System.in);
    
    int userInput = 0;
    int value;
    String name, serialNum;
    
    while(userInput < 5){

      System.out.println("Press 1 to add an item.");
			System.out.println("Press 2 to delete an item.");
			System.out.println("Press 3 to update an item.");
			System.out.println("Press 4 to show all the items.");
			System.out.println("Press 5 to quit the program.");
			userInput = input.nextInt();

      switch(userInput){
          
        case(1):
          System.out.println("Enter the name:");
          name = input.next();
          System.out.println("Enter the serial number:");
          serialNum = input.next();
          System.out.println("Enter the value in dollars (whole number):");
          value = input.nextInt();

          item.add(new Inventory(name,serialNum,value));

          break;

        case(2):
          System.out.println("Enter the serial number:");
          serialNum = input.next();
  
          for (int i = 0; i < item.size(); i++){
            if(serialNum.equals(item.get(i).serialNum)){  
              item.remove(i);
              break;
          }
          }
          break;

        case(3):
          System.out.println("Enter the serial number of the item to change:");
          serialNum = input.next();
          System.out.println("Enter the new name:");
          name = input.next();
          System.out.println("Enter the new value in dollars (whole number):");
          value = input.nextInt();

          for (int i = 0; i < item.size(); i++){
            if(serialNum.equals(item.get(i).serialNum)){ 
              
            item.get(i).name = name;
            item.get(i).value = value;
              break;
          }
          }
          break;

        case(4):
          for (int i = 0; i < item.size(); i++){
            System.out.println(item.get(i));
          }
          break;

        case(5):
          break;
     }
    }
	}
}