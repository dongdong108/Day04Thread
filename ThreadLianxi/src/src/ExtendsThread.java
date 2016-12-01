package src;

public class ExtendsThread {

	public static void main(String[] args) {
		Demo d = new Demo();
        d.start();  
        for(int x=0;x<10;x++)  
            System.out.println("main run:--------"+x);  

	}
	

}
