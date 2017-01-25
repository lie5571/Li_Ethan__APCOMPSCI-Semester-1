import java.util.*;
public class HumanRunner 
{
     
    public static void main(String args[]){
        Scanner user_input = new Scanner(System.in);
        System.out.print("Enter your hair: ");
        String hair = user_input.nextLine();
        System.out.print("Enter your eyes:: ");
        String eyes = user_input.nextLine();
        System.out.print("Enter your skin:: ");
        String skin = user_input.nextLine();
        Human Yifan = new Human(hair, eyes, skin);
        System.out.println("Your Info \nHair: "+ Yifan.getHair());
        System.out.println("Eyes: "+ Yifan.getEyes());
        System.out.println("Skin: "+ Yifan.getSkin());
        System.out.print("Enter someone else's hair:: ");
        hair = user_input.nextLine();
        System.out.print("Enter their eyes:: ");
        eyes = user_input.nextLine();
        System.out.print("Enter their skin:: ");
        skin = user_input.nextLine();
        Yifan.setHair(hair);
        Yifan.setEyes(eyes);
        Yifan.setSkin(skin);
        System.out.println("Someone else's Info \nHair: "+ Yifan.getHair());
        System.out.println("Eyes: "+ Yifan.getEyes());
        System.out.println("Skin: "+ Yifan.getSkin());
    }
}