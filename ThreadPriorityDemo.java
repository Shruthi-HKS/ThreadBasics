package mythreadsexample;


public class ThreadPriorityDemo {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread());
		EmailCampaign emailCampaign = new EmailCampaign();
		DataAggreagator dataAgg = new DataAggreagator();
		
		Thread t1 = new Thread(emailCampaign);
		Thread t2 = new Thread(dataAgg);
		t1.setName("emailCapaign");
		t2.setName("dataAggreagator");
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.MIN_PRIORITY);
		t1.start();
		t2.start();
		
		try {
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Inside main");
	}

}

class EmailCampaign implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("running Emailcampaign");
	}
	
}

class DataAggreagator implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("runnin data aggregator");
	}
	
}
