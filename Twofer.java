import java.util.Scanner;

public class Twofer {
	
	
	public static void main (String args [])
	{
		
		String name = null;
		twofer(name);
	}
	
    static String twofer(String name) {
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();
        	if(name.isEmpty())
			{
				name = "you";
			}
        System.out.println("One for " + name + ",one for me");
        return name;
    }
}
