package com.producttwo.services;

import com.product.api.ServiceOne;
import com.product.api.ServiceThree;
import com.product.api.ServiceTwo;

public class ServiceTwoImpl implements ServiceTwo
{
    private ServiceOne serviceOne;
    private ServiceThree serviceThree;
    
    @Override
    public String invoke() 
    {
        try
        {
            return serviceOne.invoke().concat(serviceThree.invoke());
        }
        catch(Exception ex)
        {
            return "Service unavailable!";
        }
    } 

    //<editor-fold defaultstate="collapsed" desc="Accessors">
    public ServiceOne getServiceOne()
    {
        return serviceOne;
    }
    
    public void setServiceOne(ServiceOne serviceOne)
    {
        this.serviceOne = serviceOne;
    }
    
    public ServiceThree getServiceThree()
    {
        return serviceThree;
    }
    
    public void setServiceThree(ServiceThree serviceThree)
    {
        this.serviceThree = serviceThree;
    }
    //</editor-fold>
}
