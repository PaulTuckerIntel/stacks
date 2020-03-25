
package stacks;

import java.util.*;


public class Stacks {
    public static ArrayList<String> stack = new ArrayList<>();
    public static Scanner input = new Scanner(System.in);
    public static boolean flag = false;
    
    public static void main(String[] args) {
//        while(flag == false){
//            menu();
//        }
        GUI Main = new GUI();
        Main.setVisible(true);
        Main.setSize(750, 750);
        
        
    }
    //Old menu system, decided to add a GUI
//    public static void menu(){
//        System.out.println("Eneter your menu selection");
//        String selection = input.next();
//        switch(selection){
//            case("pop"):
//                System.out.println("Popping the top item");
//                pop();
//                break;
//            case("push"):
//                System.out.println("Adding an item");
//                System.out.println("What would you like to add?");
//                String inp = input.next();
//                push(inp);
//                break;
//            case("check"):
//                EmptyCheck();
//                break;
//            case("end"):
//                System.out.println("Ending....");
//                flag = true;
//                break;
//        }
 //   }
    public static String pop(){
        if (stack.isEmpty()) {
            System.out.println("Nothing in the list");
            System.out.println(stack);
        }else{
            stack.remove(stack.size()-1);
            System.out.println(stack);
            GUI.Output.setText(stack.toString());
        }
        return stack.toString();
    }
    public static String push(String item){ 
        stack.add(item);
        System.out.println(stack);
        GUI.Output.setText(stack.toString());
        return stack.toString();        
    }
    public static void EmptyCheck(){
        if (stack.isEmpty()) {
            System.out.println("The stack is empty");
            GUI.Output.setText("The stack is empty");
        }else if(!stack.contains("")){
            System.out.println("There are "+stack.size()+" items");
            GUI.Output.setText("There are "+stack.size()+" items");
        }
    }
}
