public class RegisterCase implements RegisterLine{

	public RegisterCase(){

	}

	public void transmitRegister(Boolean status){
		if (status) {
			System.out.println("Tiket Terdaftar!");
		}else{
			System.out.println("Tiket Tidak Terdaftar!");
		}
		
	}


	
}