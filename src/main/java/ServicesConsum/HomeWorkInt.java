package ServicesConsum;

import javax.ejb.Remote;

import Models.Homework;

@Remote
public interface HomeWorkInt {

	
	public String HomeworkGetAllConsum();
	public int HomeworkCreateConsum(Homework hmwrk);
	public int HomeworkEditConsum(Homework hmwrk);
	public int HomeworkDeleteConsum(Homework hmwrk);

}
