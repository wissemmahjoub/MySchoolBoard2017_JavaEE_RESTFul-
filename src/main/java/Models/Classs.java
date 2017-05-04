package Models;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;


import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@JsonIgnoreProperties(ignoreUnknown=true)
public class Classs implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@JsonProperty("ClasssId")
	private int ClasssId ;
	
	@JsonProperty("NbreEtudiants")
	private int NbreEtudiants  ;
	
	@JsonProperty("ClasseName")
	private String ClasseName  ;
	
	@JsonProperty("Level")
	private String Level  ;

	@JsonProperty("Speciality")
	private String Speciality  ;

	public Classs ()
	{
		
	}

	public int getClasssId() {
		return ClasssId;
	}

	public void setClasssId(int classsId) {
		ClasssId = classsId;
	}

	public int getNbreEtudiants() {
		return NbreEtudiants;
	}

	public void setNbreEtudiants(int nbreEtudiants) {
		NbreEtudiants = nbreEtudiants;
	}

	public String getClasseName() {
		return ClasseName;
	}

	public void setClasseName(String classeName) {
		ClasseName = classeName;
	}

	public String getLevel() {
		return Level;
	}

	public void setLevel(String level) {
		Level = level;
	}

	public String getSpeciality() {
		return Speciality;
	}

	public void setSpeciality(String speciality) {
		Speciality = speciality;
	}
	
	

	
}
