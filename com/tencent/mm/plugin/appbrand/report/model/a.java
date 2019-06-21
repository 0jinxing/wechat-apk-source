package com.tencent.mm.plugin.appbrand.report.model;

import com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer;

public final class a
{
  public static String d(AppBrandLaunchReferrer paramAppBrandLaunchReferrer)
  {
    String str;
    if (paramAppBrandLaunchReferrer == null)
      str = null;
    while (true)
    {
      return str;
      str = "";
      if ((1 == paramAppBrandLaunchReferrer.hgQ) || (3 == paramAppBrandLaunchReferrer.hgQ))
        str = paramAppBrandLaunchReferrer.appId;
      else if (2 == paramAppBrandLaunchReferrer.hgQ)
        str = paramAppBrandLaunchReferrer.url;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.report.model.a
 * JD-Core Version:    0.6.2
 */