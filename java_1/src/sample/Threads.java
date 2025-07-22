package sample;


class MyTheard extends Thread{ //thread class
	
	public void start() {
//		System.out.println("Thread is Starting.........");
		for(int i = 0;i<5;i++) {
		
			System.out.println("Thread is Starting........."+i);
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				System.out.println("Thread is not Starting.........");
			}
			
		}
	}
}
public class Threads { // main class 
	
	public static void main(String[]args) {
		MyTheard m1 = new MyTheard();
		m1.start();
		
	}

}
