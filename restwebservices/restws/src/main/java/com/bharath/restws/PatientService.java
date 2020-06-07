package com.bharath.restws;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import com.bharath.restws.model.Patient;

@Consumes("application/xml,application/json")
@Produces("application/xml,application/json")
@Path("/patientservice")
public interface PatientService {

	@Path("/patients")
	@GET
	List<Patient> getPatients();

	@Path("/patients/{id}")
	@GET
	Patient getPatient(@PathParam("id") Long id);

	@Path("/patients")
	@POST
	Response createPatient(Patient patient);

	@Path("/patients")
	@PUT
	Response updatePatient(Patient patient);

	@Path("/patients/{id}")
	@DELETE
	Response deletePatient(@PathParam("id") Long id);

}
