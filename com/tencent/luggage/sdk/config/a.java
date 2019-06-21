package com.tencent.luggage.sdk.config;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.config.WxaAttributes;
import com.tencent.mm.plugin.appbrand.config.WxaAttributes.a;
import com.tencent.mm.plugin.appbrand.config.WxaAttributes.e;
import com.tencent.mm.plugin.appbrand.config.s;
import com.tencent.mm.sdk.e.k.a;
import com.tencent.mm.sdk.e.m;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Map;

public class a
  implements k.a
{
  public static a bPZ;
  private static String[] bQc = { "username", "appId", "versionInfo", "appInfo", "smallHeadURL", "nickname" };
  private final Map<String, AppBrandInitConfigLU> bQa;
  private final Map<String, String> bQb;

  protected a()
  {
    AppMethodBeat.i(101602);
    this.bQa = new android.support.v4.f.a();
    this.bQb = new android.support.v4.f.a();
    AppMethodBeat.o(101602);
  }

  private AppBrandInitConfigLU bL(String paramString)
  {
    AppMethodBeat.i(101605);
    if (bo.isNullOrNil(paramString))
    {
      ??? = null;
      AppMethodBeat.o(101605);
      return ???;
    }
    Object localObject2;
    synchronized (this.bQb)
    {
      localObject2 = (String)this.bQb.get(paramString);
      if (bo.isNullOrNil((String)localObject2))
      {
        s.ayO();
        localObject2 = a(s.f(String.format("%s=?", new Object[] { "username" }), new String[] { paramString }));
        ??? = localObject2;
        if (localObject2 == null);
      }
    }
    while (true)
    {
      synchronized (this.bQb)
      {
        this.bQb.put(paramString, ((AppBrandInitConfigLU)localObject2).appId);
        ??? = localObject2;
        AppMethodBeat.o(101605);
        break;
        paramString = finally;
        AppMethodBeat.o(101605);
        throw paramString;
      }
      ??? = bM((String)localObject2);
    }
  }

  public static void release()
  {
    try
    {
      bPZ = null;
      return;
    }
    finally
    {
    }
  }

  public static a xw()
  {
    try
    {
      a locala = bPZ;
      return locala;
    }
    finally
    {
    }
  }

  public AppBrandInitConfigLU a(WxaAttributes paramWxaAttributes)
  {
    AppMethodBeat.i(101606);
    Object localObject = null;
    if (paramWxaAttributes != null)
    {
      AppBrandInitConfigLU localAppBrandInitConfigLU = new AppBrandInitConfigLU();
      localAppBrandInitConfigLU.username = paramWxaAttributes.field_username;
      localAppBrandInitConfigLU.appId = paramWxaAttributes.field_appId;
      localAppBrandInitConfigLU.cwz = paramWxaAttributes.field_nickname;
      localAppBrandInitConfigLU.iconUrl = paramWxaAttributes.field_smallHeadURL;
      localAppBrandInitConfigLU.bQe = paramWxaAttributes.ayJ().fmr;
      localAppBrandInitConfigLU.hgD = paramWxaAttributes.ayJ().hgD;
      localAppBrandInitConfigLU.hgE = paramWxaAttributes.ayJ().hgE;
      localObject = localAppBrandInitConfigLU;
      if (paramWxaAttributes.ayL() != null)
      {
        localAppBrandInitConfigLU.bQl = paramWxaAttributes.ayL().bQl;
        localAppBrandInitConfigLU.axy = paramWxaAttributes.ayL().axy;
        localObject = localAppBrandInitConfigLU;
      }
    }
    AppMethodBeat.o(101606);
    return localObject;
  }

  public final void a(String paramString, AppBrandInitConfigLU paramAppBrandInitConfigLU)
  {
    AppMethodBeat.i(101608);
    if ((paramAppBrandInitConfigLU == null) || (bo.isNullOrNil(paramAppBrandInitConfigLU.appId)))
      AppMethodBeat.o(101608);
    while (true)
    {
      return;
      synchronized (this.bQa)
      {
        this.bQa.put(paramAppBrandInitConfigLU.appId, paramAppBrandInitConfigLU);
        if (bo.isNullOrNil(paramString))
          break label108;
      }
      synchronized (this.bQb)
      {
        this.bQb.put(paramString, paramAppBrandInitConfigLU.appId);
        AppMethodBeat.o(101608);
        continue;
        paramString = finally;
        AppMethodBeat.o(101608);
        throw paramString;
      }
      label108: AppMethodBeat.o(101608);
    }
  }

  public final void a(String arg1, m paramm)
  {
    AppMethodBeat.i(101603);
    if ("single".equals(???))
    {
      if (String.class.isInstance(paramm.obj))
      {
        ??? = String.valueOf(paramm.obj);
        if (!bo.isNullOrNil(???))
          bL(???);
      }
      AppMethodBeat.o(101603);
    }
    while (true)
    {
      return;
      if ("batch".equals(???))
        synchronized (this.bQa)
        {
          this.bQa.clear();
          AppMethodBeat.o(101603);
        }
      AppMethodBeat.o(101603);
    }
  }

  public final String bK(String paramString)
  {
    AppMethodBeat.i(101604);
    if (bo.isNullOrNil(paramString))
    {
      paramString = null;
      AppMethodBeat.o(101604);
    }
    while (true)
    {
      return paramString;
      synchronized (this.bQb)
      {
        paramString = (String)this.bQb.get(paramString);
        AppMethodBeat.o(101604);
      }
    }
  }

  public AppBrandInitConfigLU bM(String paramString)
  {
    AppMethodBeat.i(101607);
    if (bo.isNullOrNil(paramString))
    {
      ??? = null;
      AppMethodBeat.o(101607);
    }
    while (true)
    {
      return ???;
      synchronized (this.bQa)
      {
        AppBrandInitConfigLU localAppBrandInitConfigLU = (AppBrandInitConfigLU)this.bQa.remove(paramString);
        ??? = localAppBrandInitConfigLU;
        if (localAppBrandInitConfigLU == null)
        {
          s.ayO();
          ??? = a(s.zB(paramString));
        }
        AppMethodBeat.o(101607);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.luggage.sdk.config.a
 * JD-Core Version:    0.6.2
 */