package com.facebook.internal;

import com.facebook.FacebookException;
import org.json.JSONObject;

public abstract interface Utility$GraphMeRequestWithCacheCallback
{
  public abstract void onFailure(FacebookException paramFacebookException);

  public abstract void onSuccess(JSONObject paramJSONObject);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.facebook.internal.Utility.GraphMeRequestWithCacheCallback
 * JD-Core Version:    0.6.2
 */