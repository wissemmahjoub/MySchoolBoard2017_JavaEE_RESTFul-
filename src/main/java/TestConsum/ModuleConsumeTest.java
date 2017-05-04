package TestConsum;

import ServicesConsum.ModuleRestConsum;

public class ModuleConsumeTest {

	public static void main(String[] args) 
	{

		ModuleRestConsum mdl= new ModuleRestConsum();
		System.out.println( mdl.ModuleGetAllConsum());
		
	}

}
