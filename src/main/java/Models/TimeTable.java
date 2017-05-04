package Models;
import java.io.Serializable;
import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;


import javax.xml.bind.annotation.XmlRootElement;



@XmlRootElement
@JsonIgnoreProperties(ignoreUnknown=true)
public class TimeTable implements Serializable {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@JsonProperty("TimeTableId")
	private int TimeTableId ;
	
	@JsonProperty("DateDebut")
	private Date DateDebut  ;
	
	@JsonProperty("DateFin")
	private Date DateFin  ;
	
	@JsonProperty("filenamee")
	private String filenamee  ;

	@JsonProperty("filecode")
	private String filecode  ;

	
	public TimeTable()
	{
		
	}
	public int getTimeTableId() {
		return TimeTableId;
	}

	public void setTimeTableId(int timeTableId) {
		TimeTableId = timeTableId;
	}

	public Date getDateDebut() {
		return DateDebut;
	}

	public void setDateDebut(Date dateDebut) {
		DateDebut = dateDebut;
	}

	public Date getDateFin() {
		return DateFin;
	}

	public void setDateFin(Date dateFin) {
		DateFin = dateFin;
	}

	public String getFilenamee() {
		return filenamee;
	}

	public void setFilenamee(String filenamee) {
		this.filenamee = filenamee;
	}

	public String getFilecode() {
		return filecode;
	}

	public void setFilecode(String filecode) {
		this.filecode = filecode;
	}

	
	
	
	
	
	
	
	

}
