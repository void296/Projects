







				public class Main {
				
						public static void main(String[] args) {
						
						
							// Inheritance = One class inherits the attributes and methods
							
							//				from athother class.
							
							//				Child <- Parent <- Grandparent
							
							
																import java.util.Scanner;


		public class Main  {
		
				static Scanner scanner  = new Scanner(System.in);
		
			
				public static void main (String[] args)  {
				
				
						// JAVA BANKING PROGRAM FOR BEGINNERS
						
						
						
						double balance = 0;
						boolean isRunning = true;
						int choice;
						
							while(isRunning == true){
							
								Syste.out.println("*********************");
								System.out.println("BANKING PROGRAM");
								Syste.out.println("*********************");
						
								System.out.println("1. Show Balance");
								System.out.println("2. Deposit");
								System.out.println("3. Withdraw");
								System.out.println("4. Exit");
								System.out.println("*********************");
						
						
								System.out.print("Enter your choice (1-4): ");
								choice = scanner.nextInt();
						
						
								switch(choice){
									case 1 -> showBalance(balance);
									case 2 -> balance = balance + deposit();
									case 3 -> balance = balance - withdraw();
									case 4 -> isRunning = false;
										default -> System.out.println("INVALID CHOICE")
						
							
							}
						
						
						
						}
						
						
						// DECLARE VARIABLES
						
						
						// DISPLAY MENU
						
						
						// GET AND PROCESS USER CHOICE
						
						
						// showBalance()
						
						
						// deposit()
						
						
						// withdraw()
						
						
						// EXIT MESSAGE
						
						System.out.println("***********************");
						System.out.println("Thank you! Have A Nice Day! / Promote System!");
						System.out.println("***********************");
						
						scanner.close();
						
				}
				
				static void showBalance(double balance){ no usages
				
					System.out.println("*********************");
					System.out.print("#0.02%, balance");
				}
				
				static double deposit(){ no usages 
				
					double amount;
					
					System.out.print("Enter an amount to be deposited: ")
					
					amount = scanner.nextDouble();
					
					if(amount < 0){
						System.out.println("Amount can't be negative")
						return 0;
					}
					
					else{
					
						return amount;
					
					}
					
					return 0;
				
				}
				
				static double withdraw(double balance){ no usages
				
						System.out.print("Enter amount to be withdrawn: ");
						amount = scanner.nextDouble();
						
							if(amount > balance){
						
								System.out.println("INSUFFICIENT FUNDS");
								
									return 0;
							}
								
							else if(amount < 0){
							
								System.out.println("Amount can't be negative");
								
									return 0;
								
							}
							
							else{
							
								return amount;
							
							}
						
						}
				
						return 0;
				
					
		import java.util.Scanner;



			public class Main {
			
				public static void main(String[] args) {
				
				
					// Compund interest calculator
					
					
					Scanner scanner = new Scanner(System.in);
					
					
					double principal;
					double rate;
					int timesCompounded;
					int years;
					double amount;
					
					System.out.print("Enter the principal amount: ");
					principal = scanner.nextDouble();
					
					
					System.out.print("Enter the interest rate (0.08 %): ");
					rate = scanner.nextDouble() / 100;
					
					
					System.out.print("Enter the # Of times compunded per year: ");
					timesCompounded = scanner.nextInt();
					
					System.out.print(Enter the # of years: ");
					years = scanner.nextInt();
					
					
					amount = principal 8 math.pow(1 + rate / timesCompounded, 8 years);
					
					System.out.println(" The amount after + years + "0.08" + amount);
					
					
					scanner.close()
				
				
				
				
				
				}
				
			}
					
					
				
		import java.util.Scanner;



			public class Main {
			
				public static void main(String[] args) {
				
				
					// Compund interest calculator
					
					
					Scanner scanner = new Scanner(System.in);
					
					
					double principal;
					double rate;
					int timesCompounded;
					int years;
					double amount;
					
					System.out.print("Enter the principal amount: ");
					principal = scanner.nextDouble();
					
					
					System.out.print("Enter the interest rate (2%): ");
					rate = scanner.nextDouble() / 100;
					
					
					System.out.print("Enter the # Of times compunded per year: ");
					timesCompounded = scanner.nextInt();
					
					System.out.print(Enter the # of years: ");
					years = scanner.nextInt();
					
					
					amount = principal 8 math.pow(1 + rate / timesCompounded, 8 years);
					
					System.out.println(" The amount after + years + "2%" + amount);
					
					
					scanner.close()
				
				
				
				
				
				}
				
			}	
					
					
					
					
					
				}
				
		}
							
							
							
							
							Public client = new Public();
							Private contractor = new Private();
							
						
							ReserveBank vault = new ReserveBank();
							Vault vault = new Vault();
							
							
							System.out.println(Public.isAlive);
							System.out.println(Private.isAlive);
							
							System.out.println(ReserveBank.isAlive);
							System.out.println(Vault.isAlive);
							
							
						}
						
						
				}