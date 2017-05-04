package ServicesConsum;

import javax.ejb.Remote;

import Models.TimeTable;

@Remote
public interface TimeTableInt {
	
	public String TimeTableGetAllConsum();
	public  int TimeTableCreateConsum(TimeTable t);
	public  int TimeTableEditConsum(TimeTable t);


}
