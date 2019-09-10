package me.secosme.mybatis.employee;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("employee")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class EmployeeService {

    @Inject
    private IEmployeeRepository repository;

    @POST
    @Path("/")
    public EmployeeDTO list(EmployeeDTO employee) {
        repository.insert(employee);
        return employee;
    }

}
