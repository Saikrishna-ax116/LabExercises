package lab_8;

public class Exercise2 {

	public static void main(String[] args) {
		MyRunnableThread mt = new MyRunnableThread();
		
		Thread t1 = new Thread(mt, "T1");
		
		t1.start();

	}

}

class MyRunnableThread implements Runnable {
	
	int i = 0;
	@Override
	public void run() {
		while(true) {
		System.out.println(i);
		i += 10;
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}
	
}