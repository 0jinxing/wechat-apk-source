package com.tencent.mm.plugin.appbrand.jsapi.p;

import android.content.res.Configuration;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.c;
import com.tencent.mm.plugin.appbrand.s.t.a;
import com.tencent.mm.sdk.platformtools.ab;

public final class h
{
  private static String hVR;
  private static String hVS;
  private static g hVT;
  private static t.a hVU;
  private static t.a hVV;
  private static boolean mEnable;

  static
  {
    AppMethodBeat.i(126390);
    mEnable = false;
    hVR = "";
    hVS = "";
    hVT = new g();
    hVU = t.a.iRN;
    hVV = t.a.iRN;
    AppMethodBeat.o(126390);
  }

  public static void a(Configuration paramConfiguration, String paramString)
  {
    AppMethodBeat.i(126388);
    if (paramConfiguration.orientation == 2)
      if (hVU == t.a.iRR)
      {
        hVV = t.a.iRR;
        ab.i("MicroMsg.OrientationConfigListenerHelper", "onConfigurationChanged mAppid:" + hVR + "; appid:" + paramString + "; mOrientation:" + hVV.name());
        if ((hVR.equalsIgnoreCase("")) || (!hVR.equalsIgnoreCase(paramString)) || (!mEnable))
          break label151;
        hVT.a(hVV);
        AppMethodBeat.o(126388);
      }
    while (true)
    {
      return;
      hVV = t.a.iRP;
      break;
      if (paramConfiguration.orientation == 1)
      {
        hVV = t.a.iRO;
        break;
      }
      hVV = t.a.iRN;
      break;
      label151: hVS = paramString;
      AppMethodBeat.o(126388);
    }
  }

  public static void b(t.a parama)
  {
    AppMethodBeat.i(126389);
    hVU = parama;
    if ((mEnable) && (hVV == t.a.iRP) && ((parama == t.a.iRR) || (parama == t.a.iRP)))
    {
      hVT.a(parama);
      ab.i("MicroMsg.OrientationConfigListenerHelper", "onFourOrientationsChange mAppid:" + hVR + "; mOrientation:" + parama.name());
    }
    AppMethodBeat.o(126389);
  }

  public static void s(c paramc)
  {
    AppMethodBeat.i(126386);
    hVR = paramc.getAppId();
    mEnable = true;
    hVT.j(paramc);
    if ((hVV != t.a.iRN) && (hVS.equalsIgnoreCase(hVR)))
      hVT.a(hVV);
    while (true)
    {
      ab.i("MicroMsg.OrientationConfigListenerHelper", "init mJsAppid:" + hVR + "; mEnable:" + mEnable);
      AppMethodBeat.o(126386);
      return;
      hVV = t.a.iRN;
    }
  }

  public static void t(c paramc)
  {
    AppMethodBeat.i(126387);
    if (paramc.getAppId().equalsIgnoreCase(hVR))
    {
      ab.i("MicroMsg.OrientationConfigListenerHelper", "unInit mAppid:" + hVR);
      hVR = "";
      mEnable = false;
      hVV = t.a.iRN;
    }
    AppMethodBeat.o(126387);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.p.h
 * JD-Core Version:    0.6.2
 */