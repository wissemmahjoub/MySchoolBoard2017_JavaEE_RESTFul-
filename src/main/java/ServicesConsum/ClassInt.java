package ServicesConsum;

import javax.ejb.Remote;

import Models.Classs;

@Remote
public interface ClassInt {

	public  String ClassGetAllConsum();

	public  int ClassCreateConsum(Classs c);
	public  int ClassEditConsum(Classs c);
	
}
