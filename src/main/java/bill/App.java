package bill;

import java.util.logging.*;
import java.util.Scanner;

public class App {
	static Logger logger;
	static String plan;
	static int traffic;
	static int num;
	
   private App(){
      
   }
   
   public static void input() {
	   logger = Logger.getLogger("Bill");
	   @SuppressWarnings("resource")
	   Scanner scan = new Scanner(System.in);
	   plan = scan.nextLine();
	   traffic = scan.nextInt();
	   num = scan.nextInt();
   }
   public static void main(String[] args) {
	   input();
	   Cost cost = new Cost(plan, traffic, num);
	   logger.log(Level.INFO, cost.toString());
   }
}
