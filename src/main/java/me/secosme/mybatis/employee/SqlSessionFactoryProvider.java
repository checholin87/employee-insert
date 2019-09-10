package me.secosme.mybatis.employee;

import java.io.IOException;
import java.io.InputStream;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.mybatis.cdi.SessionFactoryProvider;

@ApplicationScoped
public class SqlSessionFactoryProvider {

    @Produces
    @ApplicationScoped
    @SessionFactoryProvider
    public SqlSessionFactory produceFactory() throws IOException {

        InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);

        return factory;
    }

}
