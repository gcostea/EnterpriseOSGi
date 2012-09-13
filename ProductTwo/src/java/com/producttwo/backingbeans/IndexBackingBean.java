package com.producttwo.backingbeans;

import com.product.api.ServiceTwo;

public class IndexBackingBean 
{
    private ServiceTwo serviceTwo;
    
    public String getMessage()
    {
        return serviceTwo.invoke();
    }

    //<editor-fold defaultstate="collapsed" desc="Accessors">
    public ServiceTwo getServiceTwo()
    {
        return serviceTwo;
    }
    
    public void setServiceTwo(ServiceTwo serviceTwo)
    {
        this.serviceTwo = serviceTwo;
    }
    //</editor-fold>
}
