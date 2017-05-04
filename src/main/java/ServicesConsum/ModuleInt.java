package ServicesConsum;

import javax.ejb.Remote;

import Models.Module;

@Remote
public interface ModuleInt {

	
	public String ModuleGetAllConsum();
	public  int ModuleCreateConsum(Module m);
	public  int ModuleEditConsum(Module m);
	public  int ModuleDeleteConsum(Module m);

}
