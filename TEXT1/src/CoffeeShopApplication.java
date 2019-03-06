import  java.io.*;
import  java.util.*;

public class CoffeeShopApplication{

	private static BufferedReader  stdIn =
		new  BufferedReader(new  InputStreamReader(System.in));
	private static PrintWriter  stdOut =
		new  PrintWriter(System.out, true);
	private static PrintWriter  stdErr =
		new  PrintWriter(System.err, true);

	private CoffeeShop coffeeShop;

	private static final int MIN_NUMBER = 0;
	
	private static final int MAX_NUMBER = 50;

	private static final double MIN_COST = 2.0;
	
	private static final double MAX_COST = 50.0;

	public static void main(String[]  args) throws IOException  {

		CoffeeShopApplication application = new  CoffeeShopApplication();

		application.run();
	}

	/**
	 * the method to judge the next react
	 * 
	 * @throws IOException
	 *             if there are any errors in input or output
	 */
	private void run() throws IOException  {

		coffeeShop = new  CoffeeShop();

		int  choice = getChoice();

		while (choice != 0)  {

			if (choice == 1)  {
				coffeeShop.addCoffee(readCoffee());
			} else if (choice == 2)  {
				stdOut.println(coffeeShop.toString());
			} else if (choice == 3)  {
				stdOut.println("Total Cost: " + coffeeShop.getTotalCost());
			}

			choice = getChoice();
		}
	}
	/**
	 * the method to print menu and get the input
	 * 
	 * @return the input
	 * @throws IOException
	 *             if there are any errors in the input or output
	 */
	private int  getChoice() throws IOException  {
		int input ;
		do{
			try{
				stdOut.println();
				stdOut.print("[0] Terminates the program.\n" + "[1] Adds a coffee to the coffee shop.\n"
						+ "[2] Displays the information of all the coffees in coffee shop.\n"
						+ "[3] Displays the total cost of all the coffee in the shop.\n");
				stdOut.flush();
				input = Integer.parseInt(stdIn.readLine());
				stdOut.println();
				if(0<=input && input <= 3){
					break;
				}
				else {
					stdOut.println("Invaild choice "+ input);
				}
			}catch(NumberFormatException nfe){

				stdErr.println(nfe);
			}
		}while(true);
		return input; 
	}
	/**
	 * read the new Coffee from keyborad
	 * 
	 * @return the Coffee
	 * @throws IOException
	 *             if there are any errors in the input or output
	 */
	private Coffee readCoffee() throws IOException {
		int id = 0;
		String name = "";
		String taste = "";
		double cost = 0;
		while(true)
			{
				int flag = 0 ;
				int flag1 = 1 ;
				try{
					stdOut.println("Please input a new Coffee message\n");
					String message = stdIn.readLine();
					StringTokenizer st = new StringTokenizer(message,"_");
					if(st.countTokens()>4){
						stdOut.println("user enters more than four values\n");
						flag1 = 0;
						continue;
					}
					if(st.countTokens()<4){
						stdOut.println("user enters fewer than four values\n");
						flag1 = 0;
						continue;
					}
					for(int i = 0 ; st.hasMoreElements() ; i ++){
						switch(i){
						case 0 :
							id = Integer.valueOf(st.nextToken());
							flag = 1 ;
							if(id <= 0){
								stdOut.println("user enters a number that is negative or zero\n");
								flag1 = 0;
							}
							break;
						case 1 :
							name = st.nextToken();
							break;
						case 2 : 
							taste = st.nextToken();
							break;
						case 3 :
							cost = Double.valueOf(st.nextToken());
							if(cost <= 0){
								stdOut.println(" user enters a cost that is negative or zero\n");
								flag1 = 0;
								
							}
							break;
						default :
							break;
						}		
					}
				}catch(NumberFormatException nfe){
						flag1 = 0;	
						if(flag == 0) 
							stdOut.println("user enters a number that is not a valid integer\n");
						else 
							stdOut.println("user enters a cost that is not a valid double\n");
				}
			if(flag1 == 1) break;
			}
		stdOut.println("input successfully!\n");
		Coffee coffee = new Coffee(id,name,taste,cost);
		return coffee; 	
	}
		
}
