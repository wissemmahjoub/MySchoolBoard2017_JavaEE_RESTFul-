package ServicesConsum;

import java.awt.PageAttributes.MediaType;
import java.io.IOException;

import javax.ejb.Stateless;
import javax.print.attribute.standard.Media;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import Models.TimeTable;

@Stateless

public class TimeTableRestConsum implements TimeTableInt{

	public String TimeTableGetAllConsum()
	{
		//1- create a new JAX-RS client
		Client Client = ClientBuilder.newClient();
		
		//2- set a target to client 
		WebTarget target=Client.target("https://myschoolboard2017.mybluemix.net/TimeTable/GetAllapi");
		
		//3- get Response 
		return target.request(javax.ws.rs.core.MediaType.APPLICATION_JSON).get(String.class);
		
		
	}
	
	//**********************************
	
	public  int TimeTableCreateConsum(TimeTable t) 
	{
	
		
		Client Client = ClientBuilder.newClient();
		
		WebTarget target=Client.target("https://myschoolboard2017.mybluemix.net/TimeTable/CreateApi");	      
	     Response res =  target.request().post(Entity.entity(t,"application/json"));
		return res.getStatus();
		 
	}

	
	
	
	//************************************
	
	public  int TimeTableEditConsum(TimeTable t) 
	{
	
		
		Client Client = ClientBuilder.newClient();
		
		WebTarget target=Client.target("https://myschoolboard2017.mybluemix.net/TimeTable/EditApi");	      
	     Response res =  target.request().put(Entity.entity(t,"application/json"));
		return res.getStatus();
		 
	}
	//*********************************************************

	
	
	
	


	
	
}
