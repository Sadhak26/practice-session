class College implements Runnable{
	String collegename;
	int collegeid;
	int capacity=52;
	int students=48;
	College(String collegename,int collegeid)
	{
		this.collegename=collegename;
		this.collegeid=collegeid;
	}
		
	public void run()
	{
		String name=Thread.currentThread().getName();
		synchronized(this){
		if(students<=capacity)
		{
			System.out.println(name+" got admission in "+collegename+" ("+collegeid+")");
			students++;
			try{
				Thread.sleep(1000);
			}catch(InterruptedException e){
			}
		}
		else
		{
			System.out.println("Sorry adimissions full");
		}
		}
	}
}
class Collegestrength{
	public static void main(String...args)
	{
		College c=new College("Anna university",2345);
		Thread t1=new Thread(c);
		Thread t2=new Thread(c);
		Thread t3=new Thread(c);
		Thread t4=new Thread(c);
		t1.setName("Sadhak");
		t2.setName("Aslam");
		t3.setName("Riyas");
		t4.setName("Sadam");
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}