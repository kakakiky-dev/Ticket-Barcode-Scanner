public class Scanner implements Receiver{
	private RegisterLine statusRegister;
	private String idScanner;

	public Scanner(String idScanner){
		statusRegister = null;
		this.idScanner = idScanner;
	}
	
	public void connectTo(RegisterLine caseRegister){
		statusRegister = caseRegister;
	}

	public void scanning(String id){
		System.out.println("Scanning Ticket ...");
		if (statusRegister != null && idScanner.equals(id)) {
			System.out.println("Receive Barcode ID");
			statusRegister.transmitRegister(true);
		}else{
			System.out.println("Tiket Ditolak!");
		}

	}

}