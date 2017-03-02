public class TicketDriver 
{
    public static void main(String[]args) 
	{
        Ticket Bob = new Advance(5);
        Ticket Ayan = new Advance(10);
        Ticket Nutty = new StudentAdvance(5);
        Ticket Jill = new StudentAdvance(10);
        Ticket Ryan = new Walkup();

        System.out.println(Bob);
        System.out.println(Ayan);
        System.out.println(Nutty);
        System.out.println(Jill);
        System.out.println(Ryan);


    }
}
