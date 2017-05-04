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

import Models.Classs;

@Stateless
public class ClasssRestConsum implements ClassInt {

	public String ClassGetAllConsum()
	{
		//1- create a new JAX-RS client
		Client Client = ClientBuilder.newClient();
		
		//2- set a target to client 
		WebTarget target=Client.target("https://myschoolboard2017.mybluemix.net/Class/GetAllapi");
		
		//3- get Response 
		return target.request(javax.ws.rs.core.MediaType.APPLICATION_JSON).get(String.class);
		
		
	}
	
	//**********************************
	
	public  int ClassCreateConsum(Classs c)
	{
	
		
		Client Client = ClientBuilder.newClient();
		
		WebTarget target=Client.target("https://myschoolboard2017.mybluemix.net/Class/Create");	      
	     Response res =  target.request().post(Entity.entity(c,"application/json"));
		return res.getStatus();
		 
	}

	
	
	
	//************************************
	
	public  int ClassEditConsum(Classs c)
	{
	
		
		Client Client = ClientBuilder.newClient();
		
		WebTarget target=Client.target("https://myschoolboard2017.mybluemix.net/Class/EditApi");	      
	     Response res =  target.request().put(Entity.entity(c,"application/json"));
		return res.getStatus();
		 
	}
	//*********************************************************

	
	
	
	


	
	
}
