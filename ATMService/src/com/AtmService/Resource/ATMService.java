package com.AtmService.Resource;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.AtmService.Bo.AccountDetails;
import com.AtmService.PreExceptions.NoSuchDataFound;


@Path("/atmService")
public class ATMService {
	
	public ATMService() {
		super();
		System.out.println("called");
	}

	@GET
	@Path("/account/{accNo}")
	@Produces(MediaType.APPLICATION_XML)
	public AccountDetails getAccountDetails(@PathParam("accNo") String accountNo){
		
		if(accountNo != null && accountNo.trim().length() == 0){
			NoSuchDataFound No = new NoSuchDataFound(101, "No Data Found");
			 throw new WebApplicationException(Response.status(503).entity(No).build());
		}
		
		AccountDetails ac = new AccountDetails();
		ac.setAccountName("Any");
		ac.setAccountNo(Integer.parseInt(accountNo));
		ac.setAdderss("Any");
		 return ac;
	}
}
