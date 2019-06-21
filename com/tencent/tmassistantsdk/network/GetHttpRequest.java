package com.tencent.tmassistantsdk.network;

import android.text.TextUtils;
import org.apache.http.client.methods.HttpGet;
import org.json.JSONObject;

public abstract class GetHttpRequest
{
  protected static final String REQUEST_SERVER_URL = "http://appicsh.qq.com/cgi-bin/appstage/yyb_get_userapp_info";
  protected static final String TAG = "NetworkTask";
  protected HttpGet mHttpGet = null;

  protected abstract void onFinished(JSONObject paramJSONObject, int paramInt);

  protected boolean sendData(String paramString)
  {
    try
    {
      boolean bool = TextUtils.isEmpty(paramString);
      if (bool);
      while (true)
      {
        return false;
        if (this.mHttpGet == null)
        {
          Thread localThread = new java/lang/Thread;
          GetHttpRequest.1 local1 = new com/tencent/tmassistantsdk/network/GetHttpRequest$1;
          local1.<init>(this, paramString);
          localThread.<init>(local1);
          localThread.start();
        }
      }
    }
    finally
    {
    }
    throw paramString;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.tmassistantsdk.network.GetHttpRequest
 * JD-Core Version:    0.6.2
 */