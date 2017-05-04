package ServicesExpo;

import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import com.fasterxml.jackson.core.JsonProcessingException;

import Models.Classs;
import ServicesConsum.ClasssRestConsum;

import java.io.IOException;



@Path("/Class" )
public class ClasssRestExpo {

	
		
	@EJB
	ClasssRestConsum cr ;
	
		//*****************************
		
		@GET
		public String GetAllExpose ()
		{
			return cr.ClassGetAllConsum();
			
		}
		
		

		
		//*****************************
		
		@POST()
		@Consumes(MediaType.APPLICATION_JSON)
		public Response createxp(Classs c) throws JsonProcessingException, IOException
		{
			if (cr.ClassCreateConsum(c) == 200)
				return Response.status(Status.CREATED).build();
				return Response.status(Status.NOT_FOUND).build();
		}
		
		//***************************
			
			@PUT
			@Consumes(MediaType.APPLICATION_JSON)
			public Response Editexp(Classs cl) throws JsonProcessingException, IOException
			{
				if (cr.ClassEditConsum(cl)== 200)
					return Response.status(Status.CREATED).build();
					return Response.status(Status.NOT_FOUND).build();
			}
			
			
		//***************************
		
				
	
	
	
	
}
