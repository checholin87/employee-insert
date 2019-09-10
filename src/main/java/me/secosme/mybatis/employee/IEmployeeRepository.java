package me.secosme.mybatis.employee;

import org.mybatis.cdi.Mapper;

@Mapper
public interface IEmployeeRepository {

    public void insert(EmployeeDTO employee);

}
