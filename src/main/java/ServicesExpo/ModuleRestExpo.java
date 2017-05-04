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

import Models.Module;
import ServicesConsum.ModuleRestConsum;

import java.io.IOException;

//-------------------------------------------------------------------------------------------
//These methods expose the result of the .Net Core application methods as RESTful WebServices 
//--[By Wissem Mahjoub]
//-------------------------------------------------------------------------------------------



@Path("/Module" )
public class ModuleRestExpo {
	
	
	@EJB
	ModuleRestConsum ModulConsum ;
	//*****************************
	//*** Expo GetAll Module method
	
	@GET
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String GetAllExpose ()
	{
		return ModulConsum.ModuleGetAllConsum();
		
	}

	//*****************************
	//*** Expo Create Module method
	
	@POST()
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response createxp(Module me) throws JsonProcessingException, IOException
	{
		if (ModulConsum.ModuleCreateConsum(me) == 200)
			return Response.status(Status.CREATED).build();
			return Response.status(Status.NOT_FOUND).build();
	}
	
	//***************************
	//*** Expo Edit Module method
		
		@PUT
		@Consumes(MediaType.APPLICATION_JSON)
		@Produces(MediaType.APPLICATION_JSON)
		public Response Editexp(Module me) throws JsonProcessingException, IOException
		{
			if (ModulConsum.ModuleEditConsum(me) == 200)
				return Response.status(Status.CREATED).build();
				return Response.status(Status.NOT_FOUND).build();
		}
		
		
	//***************************
	//*** Expo Delete Module method
			
		@DELETE
		@Consumes(MediaType.APPLICATION_JSON)
		@Produces(MediaType.APPLICATION_JSON)
		public Response Deletexp(Module me) throws JsonProcessingException, IOException
		{
				if (ModulConsum.ModuleDeleteConsum(me)== 200)
					return Response.status(Status.CREATED).build();
					return Response.status(Status.NOT_FOUND).build();
		}
			
		
		
	
	
	

}
