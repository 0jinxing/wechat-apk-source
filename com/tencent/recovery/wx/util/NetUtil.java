package com.tencent.recovery.wx.util;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

public class NetUtil
{
  public static String iF(Context paramContext)
  {
    paramContext = (ConnectivityManager)paramContext.getSystemService("connectivity");
    if (paramContext == null)
      paramContext = "NOT_NETWORK";
    while (true)
    {
      return paramContext;
      paramContext = paramContext.getActiveNetworkInfo();
      if (paramContext == null)
        paramContext = "NOT_NETWORK";
      else if (!paramContext.isConnected())
        paramContext = "NOT_NETWORK";
      else if (paramContext.getType() == 1)
        paramContext = "WIFI";
      else if (paramContext.getSubtype() >= 13)
        paramContext = "4G";
      else if ((paramContext.getSubtype() >= 5) && (paramContext.getSubtype() < 13))
        paramContext = "3G";
      else
        paramContext = "other";
    }
  }

  public static boolean isConnected(Context paramContext)
  {
    if (!iF(paramContext).equals("NOT_NETWORK"));
    for (boolean bool = true; ; bool = false)
      return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.recovery.wx.util.NetUtil
 * JD-Core Version:    0.6.2
 */