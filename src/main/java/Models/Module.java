package Models;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

@XmlRootElement
@JsonIgnoreProperties(ignoreUnknown=true)

public class Module implements Serializable {

	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
   
	@JsonProperty("ModuleId")
	private int ModuleId ;
	
	  @JsonProperty("ModuleName")
	private String ModuleName  ;
	  
	  @JsonProperty("ModuleCoeif")
	private int ModuleCoeif  ;
	
	
	public int getModuleId() {
		return ModuleId;
	}
	public void setModuleId(int moduleId) {
		ModuleId = moduleId;
	}
	public String getModuleName() {
		return ModuleName;
	}
	public void setModuleName(String moduleName) {
		ModuleName = moduleName;
	}
	public int getModuleCoeif() {
		return ModuleCoeif;
	}
	public void setModuleCoeif(int moduleCoeif) {
		ModuleCoeif = moduleCoeif;
	}
	
	
	public Module ()
	{
		
	}
	
	
	
}
