package service;

import java.util.List;
import java.util.UUID;

import javax.ws.rs.Produces; 
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.google.gson.Gson;

import dao.dao.impl.CompanyImpl;
import entities.Company;

@Path("company-service")
public class CompanyService {
    Gson son = new Gson();

    @GET
	@Path("login")
    @Produces(MediaType.APPLICATION_JSON)
	public String getCompany() {
        List<Company> listAcc = new CompanyImpl().getAllCompanies();
		UUID id = UUID.randomUUID();
		listAcc.add(id, "BVSC","BVS","231003912932","8 Le Thai To","img.jpg",2020);

		String data = son.toJson(listAcc);
		return data;
	}
}