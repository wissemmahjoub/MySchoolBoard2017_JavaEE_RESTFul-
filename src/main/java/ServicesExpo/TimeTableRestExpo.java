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

import Models.TimeTable;
import ServicesConsum.TimeTableRestConsum;

import java.io.IOException;



@Path("/TimeTable" )
public class TimeTableRestExpo {

	
	@EJB
	TimeTableRestConsum tr ;
		
		//*****************************
		
		@GET
		public String GetAllExpose ()
		{
			return tr.TimeTableGetAllConsum();
			
		}
		
		

		
		//*****************************
		
		@POST()
		@Consumes(MediaType.APPLICATION_JSON)
		public Response createxp(TimeTable t) throws JsonProcessingException, IOException
		{
			if (tr.TimeTableCreateConsum(t) == 200)
				return Response.status(Status.CREATED).build();
				return Response.status(Status.NOT_FOUND).build();
		}
		
		//***************************
			
			@PUT
			@Consumes(MediaType.APPLICATION_JSON)
			public Response Editexp(TimeTable t) throws JsonProcessingException, IOException
			{
				if (tr.TimeTableEditConsum(t)== 200)
					return Response.status(Status.CREATED).build();
					return Response.status(Status.NOT_FOUND).build();
			}
			
			
		//***************************
		
				
	
	
	
	
}
