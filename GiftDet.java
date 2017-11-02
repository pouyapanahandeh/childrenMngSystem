import java.util.*;
import java.text.*;

public class GiftDet{

	private String giftGiver;
	private String giftDet;
	private Date dateDet;
	
	private SimpleDateFormat dayForm = new SimpleDateFormat("dd/MM/yyyy");

	//constructor 
	public GiftDet(String giftGiver,String giftDet,Date date){
		
		this.giftGiver = giftGiver;
		this.giftDet = giftDet;
		this.dateDet = dateDet;		
	
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

