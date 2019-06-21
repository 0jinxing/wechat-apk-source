package com.tencent.wework.api.model;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Bundle;
import android.os.SystemClock;

public abstract class WWBaseMessage extends BaseMessage
{
  public String appId;
  public String hgS;
  public String transaction;

  public boolean checkArgs()
  {
    return true;
  }

  public void toBundle(Bundle paramBundle)
  {
    String str = String.valueOf(SystemClock.uptimeMillis());
    this.transaction = str;
    paramBundle.putString("_wwapi_basereq_transaction", str);
    paramBundle.putString("_wwapi_basereq_openid", this.appId);
    paramBundle.putString("_wwapi_basereq_agentid", this.hgS);
    try
    {
      paramBundle.putString("_wwapi_basereq_appbundle", this.mContext.getPackageName());
      paramBundle.putString("_wwapi_basereq_appname", this.mContext.getString(this.mContext.getApplicationInfo().labelRes));
      label75: paramBundle.putInt("_wwobject_sdkVer", 2);
      return;
    }
    catch (Throwable localThrowable)
    {
      break label75;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.wework.api.model.WWBaseMessage
 * JD-Core Version:    0.6.2
 */