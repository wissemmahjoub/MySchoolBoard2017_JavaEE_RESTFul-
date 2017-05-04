package ServicesConsum;


import javax.ejb.Stateless;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;

import Models.Homework;


@Stateless

public class HomeworkConsum implements HomeWorkInt {
	
	//************* HomeworkGetAllConsum Method ***************
		public String HomeworkGetAllConsum()
		{
			//1- create a new JAX-RS client
			Client Client = ClientBuilder.newClient();
			
			//2- set a target to client 
			WebTarget target=Client.target("https://myschoolboard2017.mybluemix.net/Homework/GetAllapi");
			
			//3- get Response 
			return target.request(javax.ws.rs.core.MediaType.APPLICATION_JSON).get(String.class);
			
			
		}
		
		//************* HomeworkCreateConsum Method ***************
		
		public int HomeworkCreateConsum(Homework hmwrk)
		{
		
			
			Client Client = ClientBuilder.newClient();
			
			WebTarget target=Client.target("https://myschoolboard2017.mybluemix.net/Homework/Create");	      
		     Response res =  target.request().post(Entity.entity(hmwrk,"application/json"));
			return res.getStatus();
			 
		}

		
		
		
		//************* HomeworkEditConsum Method ***************
		
		public int HomeworkEditConsum(Homework hmwrk)
		{
		
			
			Client Client = ClientBuilder.newClient();

			WebTarget target=Client.target("https://myschoolboard2017.mybluemix.net/Homework/EditApi");	      
		    Response res =  target.request().put(Entity.entity(hmwrk,"application/json"));
			return res.getStatus();
			 
		}
		//*********************************************************

		
		
		
		//************* ModuleDeleteConsum Method ***************
		
		public int HomeworkDeleteConsum(Homework hmwrk) 
		{

			Client Client = ClientBuilder.newClient();
			
			WebTarget target=Client.target("https://myschoolboard2017.mybluemix.net/Homework/DeleteApi");	      
			return (target.request().delete().getStatus());
			
			 
		}
		//*********************************************************
		
		
		
		
		

}
