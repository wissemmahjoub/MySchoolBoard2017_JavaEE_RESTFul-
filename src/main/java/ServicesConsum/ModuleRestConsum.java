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

import Models.Module;


//-------------------------------------------------------------------------------------------
//These methods return the result of the .Net Core application methods as RESTful WebServices 
//--[By Wissem Mahjoub]
//-------------------------------------------------------------------------------------------
@Stateless

public class ModuleRestConsum implements ModuleInt {

	//************* ModuleGetAllConsum Method ***************
	public String ModuleGetAllConsum()
	{
		//1- create a new JAX-RS client
		Client Client = ClientBuilder.newClient();
		
		//2- set a target to client 
		WebTarget target=Client.target("https://myschoolboard2017.mybluemix.net/Module/GetAllapi");
		
		//3- get Response 
		return target.request(javax.ws.rs.core.MediaType.APPLICATION_JSON).get(String.class);
		
		
	}
	
	//************* ModuleCreateConsum Method ***************
	
	public  int ModuleCreateConsum(Module m) 
	{
	
		
		Client Client = ClientBuilder.newClient();
		
		WebTarget target=Client.target("https://myschoolboard2017.mybluemix.net/Module/Create");	      
	     Response res =  target.request().post(Entity.entity(m,"application/json"));
		return res.getStatus();
		 
	}

	
	
	
	//************* ModuleEditConsum Method ***************
	
	public  int ModuleEditConsum(Module m) 
	{
	
		
		Client Client = ClientBuilder.newClient();
		
		WebTarget target=Client.target("https://myschoolboard2017.mybluemix.net/Module/EditApi");	      
	     Response res =  target.request().put(Entity.entity(m,"application/json"));
		return res.getStatus();
		 
	}
	//*********************************************************

	
	
	
	//************* ModuleDeleteConsum Method ***************
	
	public  int ModuleDeleteConsum(Module m) 
	{
	
		int id=m.getModuleId();
		Client Client = ClientBuilder.newClient();
		
		WebTarget target=Client.target("https://myschoolboard2017.mybluemix.net/Module/DeleteApiid"+id);	      
		return (target.request().delete().getStatus());
		
		 
	}
	//*********************************************************
	
	
	
	
	

}
