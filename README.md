# AppLister


Technologies used:
- Retrofit to wrap api call.
- Repository object uses suspend function to make call. 
- SimpleXmlConverter for tagged model objects. (though deprecated, seems to be the best option). 
- Glide used to load images without blocking main thread. 
- ViewModel shared between multiple fragments of same activity
- Navigation component between multiple fragments - also allows for back button or arrow navigation. 
- Recyclerview used on listing screen - adapter binds to Ads object 
- Data binding used in detail fragment - binds to Ad object. 
- One unit test used to check and debug function of Repository call.  

Data displayed:
- Display thumbnail, name, and description, as well as category. 
- Rating shown using either android rating bar (in list) or custom image (on detail page)
- Impressionurl assumed to be a blank image for tracking purposes - shown on detail page. 
- Button opens proxyurl
- Link opens to privacy policy if available, otherwise toasts warning. 
- Remaining data items shown in a list. 


