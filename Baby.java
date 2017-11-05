import java.util.*;
import java.text.*;


public class Baby {
	
	private static ArrayList<BabyDet> babies = new ArrayList<>();
	public static String listByAge(){
		
		for(int i = babies.size()-1 ; i > 0 ; i--){
			for(int j = 0 ; j < i ; j++){
				
				if(babies.get(j+1).ageSort() > babies.get(j).ageSort()){
					BabyDet temp = babies.get(j);
					babies.set(j, babies.get(j+1));
					babies.set(j+1, temp);
					
					/* 
					 * 	Test one sorting
					 * 
					 *  private static String findMin(String[] list) {
    						String minState = list[0]; 
    						for(int i=1; i<list.length; i++){
        					String min=list[i];
        					minState=(min!=null&&min.compareTo(minState)<0)?min:minState;
    						
    						}
    							return minState;
						}
					 * 
					 * 
					 */
				}
			}
		}
		return babies.toString();
	}
	
	public static String listByName(){
			
			for(int i = babies.size()-1 ; i > 0 ; i--){
				for(int j = 0 ; j < i ; j++){
					
					if(babies.get(j+1).getName().compareTo(babies.get(j).getName())<0){
						
						BabyDet temp = babies.get(j);
						babies.set(j, babies.get(j+1));
						babies.set(j+1, temp);
					}
				}
			}
			
			return babies.toString();
	}
	
	public static String listBabys(){
	
		String str="";
		for(BabyDet b : babies){
			str+=b.getName()+" ";
		}
		
		return str;
	}
	
	public static String listGifts(){
	
		String str="";
		for(BabyDet b : babies){
			str += "Name of Baby who got Gift : "+ b.getName()+"\t Gift : " + b.showGifts();
		}
		
		return str;
	}
	
	public static void main(String[] args) {
			Scanner userInput = new Scanner(System.in);
			SimpleDateFormat dateFormat= new SimpleDateFormat("yyyy/MM/dd");
			String userCommand;
			
			
			do{
				
				System.out.println("Welcome to Baby  Management System");
				// baby management system
				System.out.println("1-Add new Baby." + "\n" +
				 "2-Add  new Gift for Baby." + "\n" +
				 "3-List of Gifts." + "\n" +
				 "4-List of Baby by Age." + "\n" +
				 "5-List of Baby by Name." + "\n" +
				 "6- exit()." + "\n");	

				System.out.println("please enter your choice : ");
				userCommand = userInput.next();

				switch(userCommand){
					case "1":
						
//						System.out.println("please add baby's name : ");
//						String name = userInput.next();
//					
//						System.out.println("please enter Birthday : ");
//						Date day = new Date();
//
//						boolean validDate = false;
//						while(!validDate)
						
						System.out.println("enter the name of Baby's : ");
						String name = userInput.next();

						System.out.println("enter the Birthday of Baby (yyyy/MM/dd) : ");
						Date day = new Date();

						boolean validDate = false;
						String getReturn = userInput.nextLine();
						while(!validDate){
							try{
								day = dateFormat.parse(userInput.nextLine());
								validDate = true;
							}catch(ParseException e){
								System.out.println("Invalid date, type it again");
								validDate = false;
							}
						}
						
						System.out.println("enter the sex of baby : \n" + 
						"m for male & f for female : \n");
						
						String str = userInput.nextLine();
						char gender=str.charAt(0);
						BabyDet b = new BabyDet(day, name, gender);
						babies.add(b);
						System.out.println("All Babies :" + babies.toString());
						break;
				
					case "2":
					
						System.out.println("Who do you want to give a gift as below?");
						System.out.println(listBabys());
						String babyname = userInput.next();
						Boolean child =false;
						for(BabyDet ba:babies){
							if(ba.getName().equals(babyname)){
								
								child = true;
								
							}
						}
						
						if(child){
							
//							BabyDet = new BabyDet(name, age, birthday);
//							BabyDet g;
//							giftDet.addGifts();
//							System.out.println("add succefully");
//							
							
							System.out.println("The name of Gift Giver ?");
							String giftFrom = userInput.next();
							
							System.out.println("enter explation for Gift ?");
							String exp = userInput.next();
							
							System.out.println("The date of recieving gift(yyyy/MM/dd)");
							boolean validDate2 = false;
							getReturn = userInput.nextLine();
							Date day2 = new Date();
							while(!validDate2){
							
								try{
								
									day = dateFormat.parse(userInput.nextLine());
									day2 = day;
									validDate2 = true;
								
								}catch(ParseException e){
								
									System.out.println("please try againe, you entered wrong date or invalid Type.");
									validDate2 = false;
								
								}
							}
							
							GiftDet gi = new GiftDet(giftFrom, exp, day2);
							for(BabyDet ba:babies){
								if(ba.getName().equals(babyname)){
									
									ba.addGift(gi);
									break;
									
								}
							}
							
							System.out.println("Gift added to List.");
						
						}else{
						
							System.out.println("please enter the name of baby againe, the name you entered is not exist.");
						
						}
						break;
						
					case "3":
						
						System.out.println("List of Gifts : " +listGifts());
						break;
						
					case "4":
						System.out.println("List of Baby by Age : " + listByAge());
					break;
					
					case "5":
						System.out.println("List of Baby by Name : " + listByName());
					break;
				
				}
			// here return number as String	
			}while(!userCommand.equals("6"));
		}
		
}