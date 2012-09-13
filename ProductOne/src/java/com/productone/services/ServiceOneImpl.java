package com.productone.services;

import com.product.api.ServiceOne;
import com.productone.entities.Customer;
import java.util.HashMap;
import java.util.Map;
import javax.persistence.TypedQuery;
import org.osgi.service.jpa.EntityManagerFactoryBuilder;

public class ServiceOneImpl implements ServiceOne
{
    private EntityManagerFactoryBuilder entityManagerFactoryBuilder;
    
    @Override
    public String invoke() 
    {
        Map props = new HashMap();
        props.put("javax.persistence.jdbc.driver", "org.apache.derby.jdbc.ClientDriver");
        props.put("javax.persistence.jdbc.url", "jdbc:derby://localhost:1527/sample");
        props.put("javax.persistence.jdbc.user", "app");
        props.put("javax.persistence.jdbc.password", "app");
        
        TypedQuery<Customer> q = entityManagerFactoryBuilder.createEntityManagerFactory(props).
            createEntityManager(props).createQuery("SELECT c FROM Customer c", Customer.class);
        
        return q.getResultList().get(0).getName() + " - ";
    } 

    //<editor-fold defaultstate="collapsed" desc="Accessors">
    public EntityManagerFactoryBuilder getEntityManagerFactoryBuilder()
    {
        return entityManagerFactoryBuilder;
    }
    
    public void setEntityManagerFactoryBuilder(EntityManagerFactoryBuilder entityManagerFactoryBuilder)
    {
        this.entityManagerFactoryBuilder = entityManagerFactoryBuilder;
    }
    //</editor-fold>
    
}
