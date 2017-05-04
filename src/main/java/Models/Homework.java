package Models;

import java.io.Serializable;
import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

@XmlRootElement
@JsonIgnoreProperties(ignoreUnknown=true)
public class Homework implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@JsonProperty("HomeworkId")
	private int HomeworkId ;
	
	@JsonProperty("Label")
	private String Label  ;
	
	@JsonProperty("HomeworkDescription")
	private String HomeworkDescription  ;
	
	@JsonProperty("DateLimit")
	private Date DateLimit  ;

	@JsonProperty("difficulty")
	private String difficulty  ;

	public Homework()
	{
		
	}

	public int getHomeworkId() {
		return HomeworkId;
	}

	public void setHomeworkId(int homeworkId) {
		HomeworkId = homeworkId;
	}

	public String getLabel() {
		return Label;
	}

	public void setLabel(String label) {
		Label = label;
	}

	public String getHomeworkDescription() {
		return HomeworkDescription;
	}

	public void setHomeworkDescription(String homeworkDescription) {
		HomeworkDescription = homeworkDescription;
	}

	public Date getDateLimit() {
		return DateLimit;
	}

	public void setDateLimit(Date dateLimit) {
		DateLimit = dateLimit;
	}

	public String getDifficulty() {
		return difficulty;
	}

	public void setDifficulty(String difficulty) {
		this.difficulty = difficulty;
	}

	
}
