package com.turnon.web.resource;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

import java.lang.reflect.InvocationTargetException;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import com.turnon.core.services.DoctorService;
import com.turnon.web.model.UserProfile;

@Path("/doctor")
@Api(value = "/doctor", description = "Operations about pets")
@Produces("application/json")
public class DoctorResource {
    
	@Autowired
	private DoctorService doctorService;

	
	@Path("/test")
	@GET
	public String testMethod(){
		return "Hello World";
	}
	
	@Path("/profile/registerdoctor")
	@POST
	@ApiOperation(value = "Find pet by ID", notes = "Returns a user when 0 < ID <= 10. ID > 10 or nonintegers will simulate API error conditions", response = Response.class)
	@ApiResponses(value = { @ApiResponse(code = 400, message = "Invalid ID supplied"), @ApiResponse(code = 404, message = "user not found") })
	public Response registerdoctor(@ApiParam(value = "ID of pet that needs to be fetched", allowableValues = "range[1,10]", required = true)UserProfile userProfile) throws IllegalAccessException, InvocationTargetException{
	com.turnon.core.model.UserProfile doctorModel = new com.turnon.core.model.UserProfile();
    BeanUtils.copyProperties(userProfile, doctorModel);
    doctorService.registerDoctor(doctorModel);
    return Response.ok().build();
	}

	/*public void setDoctorService(DoctorService doctorService) {
		this.doctorService = doctorService;
	}*/
	
//	@Path("/info/{mobile}/{category}")
//    @GET
//	public User getUserInfoByPhone(@PathParam("mobile") String mobile, @PathParam("category") String category ) {
//	    User user = new User();
//	    userService.getUserInfoByPhone(mobile, category);
//	    return user;
//	}
//	
//	@Path("/account/registration")
//    @POST
//	public User createAccount(com.turnon.web.model.User user) {
//        return user;
//	}
//	
//	@Path("/doctors/{mobile}")
//    @GET
//	public List<String> getMyDoctors(@PathParam("mobile") String mobile ) {
//	    return null;
//	}
//	
//	@Path("/user/{mobile}")
//    @GET
//    public List<String> getMyUsers(@PathParam("mobile") String mobile ) {
//        return null;
//    }
//	
//	@Path("/user/appointment/details/{mobile}")
//    @GET
//    public List<String> getMyAppointmentDetails(@PathParam("mobile") String mobile ) {
//        return null;
//    }
	
	
}