public class Ticket{
	private Receiver transmitSignal;
	private String id;

	public Ticket(String id){
		transmitSignal = null;
		this.id = id;
	}

	public void connectTo(Receiver conDev) { 
        transmitSignal = conDev; 
    }

    public void ticketSignal(){
    	if(transmitSignal != null){
	    	transmitSignal.scanning(id);
    	}else{
    		System.out.println("Hubungkan tiket pada barcode!");
    	}
    }
	
}