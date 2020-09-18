package com.nathan.bblister.api;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.util.List;

@Root(strict = false)
public class Ads
{

    @ElementList(name = "ad",inline = true)
    private List<Ad> ad;

    @Element
    private String totalCampaignsRequested;

    @Element
    private String responseTime;
    @Element
    private String version;

    public String getTotalCampaignsRequested ()
    {
        return totalCampaignsRequested;
    }

    public void setTotalCampaignsRequested (String totalCampaignsRequested)
    {
        this.totalCampaignsRequested = totalCampaignsRequested;
    }


    public List<Ad> getAd ()
    {
        return ad;
    }

    public void setAd (List<Ad> ad)
    {
        this.ad = ad;
    }

    public String getResponseTime ()
    {
        return responseTime;
    }

    public void setResponseTime (String responseTime)
    {
        this.responseTime = responseTime;
    }

    public String getVersion ()
    {
        return version;
    }

    public void setVersion (String version)
    {
        this.version = version;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [totalCampaignsRequested = "+totalCampaignsRequested+", ad = "+ad+", responseTime = "+responseTime+", version = "+version+"]";
    }
}