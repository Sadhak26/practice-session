package test;
interface function{
		void display(String[] dress);
}
class maininterface{
	public static void main(String...args)
	{
			String str[]={"Jeans","Formal Pants","Party wear","Sports T-shirts"};
			System.out.println("Welcome to Saravana Stores");
			function f=(String[] dress)->{
				for(String i:dress)
				{
					System.out.println(i);
				}
			};
			f.display(str);
	}
}