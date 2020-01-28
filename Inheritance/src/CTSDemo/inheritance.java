package CTSDemo;

public class inheritance {
public class app {
		
		{
		machine p=new machine();
		p.start();
		p.stop();
		car q=new car();
		q.start();
		q.wipewindshield();
		q.showinfo();
		q.stop();
	}
	}
	public class car extends machine  {
		public void start()
	{
		System.out.println("start the car");
	}
	public void wipewindshield() 
	{
		System.out.println("wipewindshield");
			}
	public void showinfo()
	{
		System.out.println("showinfo");
			}
	public void stop()
	{
		System.out.println("stop");
			}
}
	
	public class machine {
		protected String name="AP273328";
		public void start() {
			System.out.println(" machine has started");
		}
	public void stop()
	{
		System.out.println(" machine has stopped");
	}
	}

}



