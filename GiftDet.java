import java.util.*;
import java.text.*;

public class GiftDet{
	
	private ArrayList<Babydet> gifts;

	//private String giftGiver;
	//private String giftDet;
	//private Date dateDet;
	
	//private SimpleDateFormat dayForm = new SimpleDateFormat("dd/MM/yyyy");

	//constructor 
	//public GiftDet(String giftGiver,String giftDet,Date date){
	//	
	//	this.giftGiver = giftGiver;
	//	this.giftDet = giftDet;
	//	this.dateDet = dateDet;		
	//
	//}

	public void setGifts(ArrayList<BabyDet> gifts){
		this.gifts = gifts;
	}

	public GiftDet(){
		gifts = new ArrayList<BabyDet>();
	}

	public void addGifts(BabyDet g){
		gifts.add(g);
	}

	public int theNoGifts(){
		return gifts.size();
	}

	public void sort(){
			for(int i = 0 ; i <
 
	public GiftDet() {
		// TODO Auto-generated constructor stub
	}

	public String getGifGiver(){
		return giftGiver;
	}

	public String getGiftDet(){
		return giftDet;
	}

	public Date getDateDet(){
		return dateDet;
	}
	
}
