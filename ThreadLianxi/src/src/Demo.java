package src;
//�̳�Thread��ʵ������
class Demo extends Thread  {  
    public void run()  {  
        for(int x=0;x<10;x++)  
            System.out.println("demo run:"+x);  
    }  
}  
