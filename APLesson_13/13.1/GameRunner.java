public class GameRunner 
{
    public static void main(String[]args)
	{
        GameSystem PCMR = new PC("PC");
        Console Xbone = new Xbox("Xbox");
        Console PS4 = new Playstation("PlayStation 4 Pro");
        System.out.println(PCMR);
        System.out.println(Xbone);
        System.out.println(PS4);
    }
}
