package com.nathan.bblister.api

import org.simpleframework.xml.Element
import org.simpleframework.xml.Root

/*

@Root
data class Ads (
	@Element val ad: List<Ad>,
	@TextContent val responseTime: String,
	@TextContent val totalCampaignsRequested: String,
	@TextContent val version: String
)

@Xml
data class Ad (
	@Element val appID: String,
	@Element val averageRatingImageURL: String,
	@Element val bidRate: String,
	@Element val billingTypeID: String,
	@Element val callToAction: String,
	@Element val campaignDisplayOrder: String,
	@Element val campaignID: String,
	@Element val campaignTypeID: String,
	@Element val categoryName: String,
	@Element val clickProxyURL: String,
	@Element val creativeID: String,
	@Element val homeScreen: String,
	@Element val impressionTrackingURL: String,
	@Element val isRandomPick: String,
	@Element val numberOfRatings: String,
	@Element val productDescription: String,
	@Element val productID: String,
	@Element val productName: String,
	@Element val productThumbnail: String,
	@Element val rating: String,
	@Element val numberOfDownloads: String,
	@Element val tstiEligible: String,
	@Element val stiEnabled: String,
	@Element val postInstallActions: String,
	@Element val appPrivacyPolicyURL: String? = null,
	@Element val minOSVersion: String? = null
)

enum class CallToAction(val value: String) {
	InstallNow("Install Now");

	companion object {
		public fun fromValue(value: String): CallToAction = when (value) {
			"Install Now" -> InstallNow
			else          -> throw IllegalArgumentException()
		}
	}
}



enum class NumberOf(val value: String) {
	The10000("10,000+");

	companion object {
		public fun fromValue(value: String): NumberOf = when (value) {
			"10,000+" -> The10000
			else      -> throw IllegalArgumentException()
		}
	}
}
*/
