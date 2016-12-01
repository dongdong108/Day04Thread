package src2;
//实现runnable接口，实现买票功能
public class Ticket implements Runnable{

	private int tick = 10;  
    public void run()  {  
        while(true)  
        {  
            if(tick > 0)  
            {  
                try{Thread.sleep(1000);}catch(Exception e){}  
                
                System.out.println(Thread.currentThread().getName()+"::"+tick);  
                tick--;
            }  
        }  
    }  
}
