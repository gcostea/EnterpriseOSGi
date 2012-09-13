package com.productone.backingbeans;

import com.product.api.ServiceThree;

public class IndexBackingBean 
{
    private ServiceThree serviceThree;
    
    public String getMessage()
    {
        return serviceThree.invoke();
    }

    //<editor-fold defaultstate="collapsed" desc="Accessors">
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
