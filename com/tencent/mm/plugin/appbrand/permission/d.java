package com.tencent.mm.plugin.appbrand.permission;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo;
import com.tencent.mm.plugin.appbrand.i;
import com.tencent.mm.plugin.appbrand.r.m;
import com.tencent.mm.protocal.protobuf.avi;
import com.tencent.mm.protocal.protobuf.awh;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.vending.c.a;
import java.util.HashMap;
import java.util.LinkedList;

public final class d
{
  private static final LinkedList<Runnable> iwm;
  private static final d.a iwn;
  private static boolean iwo;
  private final int cBc;
  private final d.b iwj;
  private final com.tencent.mm.plugin.appbrand.jsapi.h iwk;
  private final String iwl;
  private final String mAppId;

  static
  {
    AppMethodBeat.i(102272);
    iwm = new LinkedList();
    iwn = new d.a((byte)0);
    iwo = false;
    AppMethodBeat.o(102272);
  }

  private d(d.b paramb, com.tencent.mm.plugin.appbrand.jsapi.h paramh, String paramString)
  {
    AppMethodBeat.i(102264);
    this.iwj = paramb;
    this.iwk = paramh;
    this.mAppId = paramh.getAppId();
    this.iwl = paramString;
    this.cBc = this.iwk.getRuntime().ye().hhd.gVt;
    AppMethodBeat.o(102264);
  }

  public static void Dp(String paramString)
  {
    AppMethodBeat.i(102268);
    d.a locala = iwn;
    if (!bo.isNullOrNil(paramString));
    while (true)
    {
      try
      {
        locala.iwD.remove(paramString);
        return;
      }
      finally
      {
        AppMethodBeat.o(102268);
      }
      AppMethodBeat.o(102268);
    }
  }

  public static void a(com.tencent.mm.plugin.appbrand.jsapi.h paramh, String paramString, d.b paramb)
  {
    AppMethodBeat.i(102267);
    String str = paramh.getAppId();
    if ((bo.isNullOrNil(str)) || (bo.isNullOrNil(paramString)))
      AppMethodBeat.o(102267);
    while (true)
    {
      return;
      paramh = new d.6(paramh, paramString, paramb);
      m.aNS().aa(new d.7(paramh, str, paramString));
      AppMethodBeat.o(102267);
    }
  }

  public static boolean a(com.tencent.mm.plugin.appbrand.jsapi.h paramh, String paramString)
  {
    boolean bool1 = false;
    AppMethodBeat.i(138531);
    boolean bool2;
    if (paramString.equals("getWifiList"))
    {
      paramh = paramh.getRuntime().ye();
      if (!paramh.hha)
      {
        bool2 = true;
        ab.i("MicroMsg.AppBrandJsApiUserAuth", "getWifiList jump userauth:%b", new Object[] { Boolean.valueOf(bool2) });
        if (paramh.hha)
          break label78;
        AppMethodBeat.o(138531);
        bool2 = true;
      }
    }
    while (true)
    {
      return bool2;
      bool2 = false;
      break;
      label78: AppMethodBeat.o(138531);
      bool2 = bool1;
      continue;
      AppMethodBeat.o(138531);
      bool2 = bool1;
    }
  }

  public static boolean cK(String paramString1, String paramString2)
  {
    AppMethodBeat.i(102265);
    boolean bool = iwn.cL(paramString1, paramString2);
    AppMethodBeat.o(102265);
    return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.permission.d
 * JD-Core Version:    0.6.2
 */