public class Main{

	public static void main(String[] args){

		Scanner scanner = new Scanner("111123778");
		RegisterCase registercase = new RegisterCase();

		Ticket ticket = new Ticket("111123778");
		scanner.connectTo(registercase);
		ticket.connectTo(scanner);
		ticket.ticketSignal();

		System.out.println(".........");
		ticket.connectTo(null);
		ticket.ticketSignal();

		System.out.println("============================");

		Ticket ticket2 = new Ticket("111123799");
		ticket2.connectTo(scanner);
		ticket2.ticketSignal();

	}

}