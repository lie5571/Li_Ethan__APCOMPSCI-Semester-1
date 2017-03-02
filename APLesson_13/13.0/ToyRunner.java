public class ToyRunner 
{
    public static void main(String[]args)
	{
        String toys = "Hotwheel, Car, G.I.Joe, Action Figure, PennyRacer, Car, Matchbox, Car, Star Wars, Action Figure, Pullback, Car, Star Wars, Action Figure";
        ToyStore dankStore = new ToyStore(toys);
        System.out.println(dankStore);
        System.out.println(dankStore.getMostFrequentToy());
        System.out.println(dankStore.getMostFrequentType());
    }
}
