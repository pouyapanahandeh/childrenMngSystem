import java.util.*;
import java.text.*;


public class Baby{
	private static ArrayList<Baby> babys=new ArrayList<>();
	public static String listBabysByAge(){
		
		for(int i=babys.size()-1;i>0;i--){
			for(int j=0;j<i;j++){
				
				if(babys.get(j+1).howOld()>babys.get(j).howOld()){
					Baby temp = babys.get(j);
					babys.set(j, babys.get(j+1));
					babys.set(j+1, temp);
				}
			}
		}
		return babys.toString();
	}
	public static String listBabysByName(){
			
			for(int i=babys.size()-1;i>0;i--){
				for(int j=0;j<i;j++){
					
					if(babys.get(j+1).getName().compareTo(babys.get(j).getName())<0){
						Baby temp = babys.get(j);
						babys.set(j, babys.get(j+1));
						babys.set(j+1, temp);
					}
				}
			}
			return babys.toString();
	}
	public static String listBabys(){
		String str="";
		for(Baby b : babys){
			str+=b.getName()+" ";
		}
		return str;
	}
	public static String listGifts(){
		String str="";
		for(Baby b : babys){
			str += "Baby: "+b.getName()+"\n Gifts: " +b.showGifts();
		}
		return str;
	}	
	public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			SimpleDateFormat dateFormat= new SimpleDateFormat("dd/MM/yyyy hh:mm");
			String userCommand;

			do{
				System.out.println("Menu:\n  1 - 'addBaby' , 2 - 'addGift' , 3 - 'listGifts', 4 - 'listBabysByAge' , 5 - 'listBabysByName' or 6 - 'exit' ");
				userCommand = scanner.next();

				switch(userCommand){
					case "1":

						System.out.println("what is his/her name");
						String name = scanner.next();

						System.out.println("Birthday(dd/MM/yyyy hh:mm)");
						Date day = new Date();

						boolean validDate = false;
						String getReturn = scanner.nextLine();
						while(!validDate){
							try{
								day = dateFormat.parse(scanner.nextLine());
								validDate = true;
							}catch(ParseException e){
								System.out.println("Invalid date, type it again");
								validDate = false;
							}
						}
						System.out.println("Gender(M/F)");
						String str=scanner.nextLine();
						char gender=str.charAt(0);
						Baby b = new Baby(day, name, gender);
						babys.add(b);
						System.out.println("All Babies :"+babys.toString());
						break;
					case "2":
						System.out.println("Who do you want to give a gift as below?");
						System.out.println(listBabys());
						String babyname = scanner.next();
						Boolean hasChild=false;
						for(Baby ba:babys){
							if(ba.getName().equals(babyname)){
								
								hasChild=true;
								
							}
						}
						if(hasChild){
							System.out.println("Who gives this gift?");
							String giftFrom = scanner.next();
							System.out.println("some description?");
							String des = scanner.next();
							System.out.println("date of this gift(dd/MM/yyyy hh:mm)");
							boolean validDate2 = false;
							getReturn = scanner.nextLine();
							Date day2 = new Date();
							while(!validDate2){
								try{
									day = dateFormat.parse(scanner.nextLine());
									day2 = day;
									validDate2 = true;
								}catch(ParseException e){
									System.out.println("Invalid date, type it again");
									validDate2 = false;
								}
							}
							GiftDet gi = new GiftDet(giftFrom,des,day2);
							for(BabyDet ba:babys){
								if(ba.getName().equals(babyname)){
									
									ba.addGiftDet(gi);
									break;
									
								}
							}
							System.out.println("Gift added successful!");
						}else{
							System.out.println("There is no that baby.");
						}
						break;
					case "3":
						System.out.println(listGifts());
						break;
					case "4":
						System.out.println(listBabysByAge());
					break;
					case "5":
						System.out.println(listBabysByName());
					break;
				}
				
			}while(!userCommand.equals("6"));
		}
		
}