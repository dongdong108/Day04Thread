package src2;

public class ImpRunnable {
	public static void main(String[] args) {
		Ticket t = new Ticket();  
        new Thread(t).start();  
        
	}

}
