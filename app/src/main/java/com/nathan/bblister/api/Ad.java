package com.nathan.bblister.api;


import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(strict=false)
public class Ad
{
    @Element(required = false)
    private String appPrivacyPolicyUrl;
    @Element
    private String averageRatingImageURL;
    @Element
    private String isRandomPick;
    @Element
    private String clickProxyURL;
    @Element
    private String numberOfDownloads;
    @Element
    private String tstiEligible;
    @Element
    private String rating;
    @Element
    private String bidRate;
    @Element
    private String categoryName;
    @Element
    private String creativeId;
    @Element
    private String productName;
    @Element
    private String callToAction;
    @Element
    private String campaignDisplayOrder;
    @Element
    private String appId;
    @Element
    private String numberOfRatings;
    @Element
    private String campaignTypeId;
    @Element
    private String stiEnabled;
    @Element
    private String productDescription;
    @Element
    private String productId;
    @Element
    private String campaignId;;
    @Element
    private String homeScreen;
    @Element
    private String impressionTrackingURL;
    @Element(required=false)
    private String postInstallActions;
    @Element
    private String billingTypeId;
    @Element
    private String productThumbnail;

    public String getAppPrivacyPolicyUrl() {
        return appPrivacyPolicyUrl;
    }

    public void setAppPrivacyPolicyUrl(String appPrivacyPolicyUrl) {
        this.appPrivacyPolicyUrl = appPrivacyPolicyUrl;
    }

    public String getAverageRatingImageURL ()
    {
        return averageRatingImageURL;
    }

    public void setAverageRatingImageURL (String averageRatingImageURL)
    {
        this.averageRatingImageURL = averageRatingImageURL;
    }


    public String getIsRandomPick ()
    {
        return isRandomPick;
    }

    public void setIsRandomPick (String isRandomPick)
    {
        this.isRandomPick = isRandomPick;
    }

    public String getClickProxyURL ()
    {
        return clickProxyURL;
    }

    public void setClickProxyURL (String clickProxyURL)
    {
        this.clickProxyURL = clickProxyURL;
    }

    public String getNumberOfDownloads ()
    {
        return numberOfDownloads;
    }

    public void setNumberOfDownloads (String numberOfDownloads)
    {
        this.numberOfDownloads = numberOfDownloads;
    }

    public String getTstiEligible ()
    {
        return tstiEligible;
    }

    public void setTstiEligible (String tstiEligible)
    {
        this.tstiEligible = tstiEligible;
    }

    public String getRating ()
    {
        return rating;
    }

    public void setRating (String rating)
    {
        this.rating = rating;
    }

    public String getBidRate ()
    {
        return bidRate;
    }

    public void setBidRate (String bidRate)
    {
        this.bidRate = bidRate;
    }

    public String getCategoryName ()
    {
        return categoryName;
    }

    public void setCategoryName (String categoryName)
    {
        this.categoryName = categoryName;
    }

    public String getCreativeId ()
    {
        return creativeId;
    }

    public void setCreativeId (String creativeId)
    {
        this.creativeId = creativeId;
    }

    public String getProductName ()
    {
        return productName;
    }

    public void setProductName (String productName)
    {
        this.productName = productName;
    }

    public String getCallToAction ()
    {
        return callToAction;
    }

    public void setCallToAction (String callToAction)
    {
        this.callToAction = callToAction;
    }

    public String getCampaignDisplayOrder ()
    {
        return campaignDisplayOrder;
    }

    public void setCampaignDisplayOrder (String campaignDisplayOrder)
    {
        this.campaignDisplayOrder = campaignDisplayOrder;
    }

    public String getAppId ()
    {
        return appId;
    }

    public void setAppId (String appId)
    {
        this.appId = appId;
    }

    public String getNumberOfRatings ()
    {
        return numberOfRatings;
    }

    public void setNumberOfRatings (String numberOfRatings)
    {
        this.numberOfRatings = numberOfRatings;
    }

    public String getCampaignTypeId ()
    {
        return campaignTypeId;
    }

    public void setCampaignTypeId (String campaignTypeId)
    {
        this.campaignTypeId = campaignTypeId;
    }

    public String getStiEnabled ()
    {
        return stiEnabled;
    }

    public void setStiEnabled (String stiEnabled)
    {
        this.stiEnabled = stiEnabled;
    }

    public String getProductDescription ()
    {
        return productDescription;
    }

    public void setProductDescription (String productDescription)
    {
        this.productDescription = productDescription;
    }

    public String getProductId ()
    {
        return productId;
    }

    public void setProductId (String productId)
    {
        this.productId = productId;
    }

    public String getCampaignId ()
    {
        return campaignId;
    }

    public void setCampaignId (String campaignId)
    {
        this.campaignId = campaignId;
    }


    public String getHomeScreen ()
    {
        return homeScreen;
    }

    public void setHomeScreen (String homeScreen)
    {
        this.homeScreen = homeScreen;
    }

    public String getImpressionTrackingURL ()
    {
        return impressionTrackingURL;
    }

    public void setImpressionTrackingURL (String impressionTrackingURL)
    {
        this.impressionTrackingURL = impressionTrackingURL;
    }

    public String getPostInstallActions ()
    {
        return postInstallActions;
    }

    public void setPostInstallActions (String postInstallActions)
    {
        this.postInstallActions = postInstallActions;
    }

    public String getBillingTypeId ()
    {
        return billingTypeId;
    }

    public void setBillingTypeId (String billingTypeId)
    {
        this.billingTypeId = billingTypeId;
    }

    public String getProductThumbnail ()
    {
        return productThumbnail;
    }

    public void setProductThumbnail (String productThumbnail)
    {
        this.productThumbnail = productThumbnail;
    }

    @Override
    public String toString()
    {
        return "averageRatingImageURL = above\nisRandomPick = "+isRandomPick+"\nclickProxyURL = in Button\nnumberOfDownloads = "+numberOfDownloads+"\ntstiEligible = "+tstiEligible+"\nrating = "+rating+"\nbidRate = "+bidRate+"\ncategoryName = "+categoryName+"\ncreativeId = "+creativeId+"\nproductName = "+productName+"\ncallToAction = text in Button above\ncampaignDisplayOrder = "+campaignDisplayOrder+"\nappId = "+appId+"\nnumberOfRatings = "+numberOfRatings+"\ncampaignTypeId = "+campaignTypeId+"\nstiEnabled = "+stiEnabled+"\nproductDescription = "+productDescription+"\nproductId = "+productId+"\ncampaignId = "+campaignId+"\nhomeScreen = "+homeScreen+"\nimpressionTrackingURL = displayed above \npostInstallActions = "+postInstallActions+"\nbillingTypeId = "+billingTypeId+"\nproductThumbnail = above";
    }
}
