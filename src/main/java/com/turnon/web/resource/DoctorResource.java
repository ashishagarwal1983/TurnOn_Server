package com.turnon.web.resource;

import java.lang.reflect.InvocationTargetException;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;

import com.turnon.core.services.DoctorService;
import com.turnon.web.model.DoctorProfile;

import io.swagger.annotations.Api;

@Path("/doctor")
@Api(value = "/doctor", description = "Operations about doctors")
public class DoctorResource {
    
	@Autowired
	private DoctorService doctorService;

	
	@Path("/test")
	@GET
	//@ApiOperation(value = "TestAPi")
	public String testMethod(){
		return "Hello";
	}
	
	@Path("/profile/registerdoctor")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	//@ApiOperation(value = "Add a Doctor", response = Response.class)
	//@ApiResponses(value = { @ApiResponse(code = 400, message = "Invalid ID supplied"), @ApiResponse(code = 404, message = "user not found") })
	public Response registerdoctor(@RequestBody DoctorProfile doctorProfile) throws IllegalAccessException, InvocationTargetException{
	com.turnon.core.model.DoctorProfile doctorModel = new com.turnon.core.model.DoctorProfile();
    BeanUtils.copyProperties(doctorProfile, doctorModel);
    doctorService.registerDoctor(doctorModel);
    return Response.ok("Done12132313").build();
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