import java.util.Date;
import java.text.*;

public class GiftDet {
	
	private String person;
	private String comment;
	private Date date;
	
//	public String getPerson() {
//		return person;
//	}
//	public void setPerson(String person) {
//		this.person = person;
//	}
//	public String getComment() {
//		return comment;
//	}
//	public void setComment(String comment) {
//		this.comment = comment;
//	}
//	public Date getDate() {
//		return date;
//	}
//	public void setDate(Date date) {
//		this.date = date;
//	}
	
	private SimpleDateFormat myFormat = new SimpleDateFormat("yyyy/MM/dd");
	public GiftDet() {
		// not deleted
	}
	public GiftDet(String person, String comment, Date date){
		
		this.person = person;
		this.comment = comment;
		this.date = date;

	}
	
	public GiftDet(String person,String comment,String date){
		try{
	
			this.person = person;
			this.comment = comment;
			this.date = myFormat.parse(date);
			
		}catch(ParseException e){
				System.out.println("there is error (202).");
			}
	}
//	public String toString(){
//		return name+"\n"+birthday.toString();
//	}
	
	@Override
	public String toString(){
		return this.person+ " " + this.comment + " " + myFormat.format(date);
	}
}