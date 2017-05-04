package ServicesExpo;

import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import com.fasterxml.jackson.core.JsonProcessingException;

import Models.Homework;
import ServicesConsum.HomeworkConsum;
import ServicesConsum.ModuleRestConsum;

import java.io.IOException;

//-------------------------------------------------------------------------------------------
//These methods expose the result of the .Net Core application methods as RESTful WebServices 
//--[By Wissem Mahjoub]
//-------------------------------------------------------------------------------------------



@Path("/Homework" )
public class HomeworkExpo {
	
	@EJB
	HomeworkConsum HmwrkConsum ;
	//*****************************
	//*** Expo GetAll Homework method
	
	@GET
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String GetAllExpose ()
	{
		return HmwrkConsum.HomeworkGetAllConsum();
		
	}
	


	
	//*****************************
	//*** Expo Create Homwork method
	
	@POST()
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response createxp(Homework hmrk) throws JsonProcessingException, IOException
	{
		if (HmwrkConsum.HomeworkCreateConsum(hmrk) == 200)
			return Response.status(Status.CREATED).build();
			return Response.status(Status.NOT_FOUND).build();
	}
	
	//***************************
	//*** Expo Edit Homework method
		
		@PUT
		@Consumes(MediaType.APPLICATION_JSON)
		@Produces(MediaType.APPLICATION_JSON)
		public Response Editexp(Homework hmrk) throws JsonProcessingException, IOException
		{
			if (HmwrkConsum.HomeworkEditConsum(hmrk) == 200)
				return Response.status(Status.CREATED).build();
				return Response.status(Status.NOT_FOUND).build();
		}
		
		
	//***************************
	//*** Expo Delete Homework method
			
		@DELETE
		@Consumes(MediaType.APPLICATION_JSON)
		@Produces(MediaType.APPLICATION_JSON)
		public Response Deletexp(Homework hwmrk) throws JsonProcessingException, IOException
		{
			if (HmwrkConsum.HomeworkDeleteConsum(hwmrk) == 200)
					return Response.status(Status.CREATED).build();
					return Response.status(Status.NOT_FOUND).build();
		}
			
		
		
	
	
	

}
