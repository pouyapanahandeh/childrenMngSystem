import java.util.Date;
import java.text.*;
public class GiftDet {
	private String person;
	private String expl;
	private Date dateDet;
//	//private String GiftDetGiver;
//	//private String ;
//	//
	private SimpleDateFormat dateDetFormat = new SimpleDateFormat("yyyyMMdd");
	public GiftDet(){
		
	}
	public GiftDet(String person,String expl,Date dateDet){
		this.person = person;
		this.expl = expl;
		this.dateDet = dateDet;
	}
	public GiftDet(String person,String expl,String dateDet){
		try{
			this.person = person;
			this.expl = expl;
			this.dateDet = dateDetFormat.parse(dateDet);
			}catch(ParseException e){
				System.out.println(e);
			}
	}
	
//	public void sort(){
//    for(int i = 0 ; i < GiftDets.size() - 1 ; i++){
//	for(int j = i + 1 ; j < GiftDets.size() ; j++){
//		BabyDet numOne = GiftDets.get(i);
//		BabyDet numTWO = GiftDets.get(j);
//	if(numOne.getBabyName().compareTo(numTWO.getBabyName())>0)	  {
//	BabyDet temp = numOne;
//	GiftDets.set(j, temp);
//	GiftDets.set(i, numTWO);
//}
//}
//}
//}
//
//public void printAll(){
//	for(BabyDet g : GiftDets){
//		System.out.println(g);
//	}
//}
	@Override
	public String toString(){
		return this.person + this.expl + dateDetFormat.format(dateDet);
	}
}







//import java.util.*;
//import java.text.*;
//
//public class {
//	
//	private ArrayList<BabyDet> GiftDets;
//

//	
//	//private SimpledateDetFormat dayForm = new SimpledateDetFormat("dd/MM/yyyy");
//
//	//constructor 
//	//public (String GiftDetGiver,String ,dateDet dateDet){
//	//	
//	//	this.GiftDetGiver = GiftDetGiver;
//	//	this. = ;
//	//	this.dateDetDet = dateDetDet;		
//	//
//	//}
//
//	public void setGiftDets(ArrayList<BabyDet> GiftDets){
//		this.GiftDets = GiftDets;
//	}
//
//	public (){
//		GiftDets = new ArrayList<BabyDet>();
//	}
//
//	public void addGiftDets(BabyDet g){
//		GiftDets.add(g);
//	}
//
//	public int theNoGiftDets(){
//		return GiftDets.size();
//	}
//

//
//	public void addGiftDets() {
//		
//		
//	}	
			
	/* 
	public () {
		// TODO Auto-generated constructor stub
	}

	public String getGifGiver(){
		return GiftDetGiver;
	}

	public String get(){
		return ;
	}

	public dateDet getdateDetDet(){
		return dateDetDet;
	}
	*/	
//}
