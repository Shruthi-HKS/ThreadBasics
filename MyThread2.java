package mythreadsexample;

public class MyThread2 extends Thread{
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Inside run...");
		go();
	}
	
	private void go() {
		System.out.println("Inside go...");
		more();
	}
	
	private void more() {
		System.out.println("Inside more...");
	}
}
