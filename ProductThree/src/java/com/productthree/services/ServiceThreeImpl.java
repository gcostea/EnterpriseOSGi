package com.productthree.services;

import com.product.api.ServiceThree;
import com.productthree.entities.Manufacturer;
import java.util.HashMap;
import java.util.Map;
import javax.persistence.TypedQuery;
import org.osgi.service.jpa.EntityManagerFactoryBuilder;

public class ServiceThreeImpl implements ServiceThree {

    private EntityManagerFactoryBuilder entityManagerFactoryBuilder;

    @Override
    public String invoke() {
        Map props = new HashMap();
        props.put("javax.persistence.jdbc.driver", "org.apache.derby.jdbc.ClientDriver");
        props.put("javax.persistence.jdbc.url", "jdbc:derby://localhost:1527/sample");
        props.put("javax.persistence.jdbc.user", "app");
        props.put("javax.persistence.jdbc.password", "app");
        
        TypedQuery<Manufacturer> q = entityManagerFactoryBuilder.createEntityManagerFactory(props).
            createEntityManager(props).createQuery("SELECT m FROM Manufacturer m", Manufacturer.class);
        
        return q.getResultList().get(0).getName();
    }

    //<editor-fold defaultstate="collapsed" desc="Accessors">
    public EntityManagerFactoryBuilder getEntityManagerFactoryBuilder() {
        return entityManagerFactoryBuilder;
    }

    public void setEntityManagerFactoryBuilder(EntityManagerFactoryBuilder entityManagerFactoryBuilder) {
        this.entityManagerFactoryBuilder = entityManagerFactoryBuilder;
    }
    //</editor-fold>
}
