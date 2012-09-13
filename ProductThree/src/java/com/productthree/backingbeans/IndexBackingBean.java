package com.productthree.backingbeans;

import com.product.api.ServiceOne;

public class IndexBackingBean 
{
    private ServiceOne serviceOne;
    
    public String getMessage()
    {
        return serviceOne.invoke();
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
    //</editor-fold>
}
