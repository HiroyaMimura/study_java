package study;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

public class PrintingThread extends Thread {
	final AtomicBoolean stopReq = new AtomicBoolean(false);

	public void run() {
		for(int i = 9; i >= 0; i--) {
			if(this.stopReq.get()) {
				break;
			}
			System.out.println(i + "..");
			try {
				TimeUnit.SECONDS.sleep(1);
			} catch(InterruptedException e) {;}
		}
	}
}
