package com.tencent.mm.plugin.appbrand.debugger;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.se;
import com.tencent.mm.g.a.se.a;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.appbrand.app.f;
import com.tencent.mm.plugin.appbrand.appcache.av.c;
import com.tencent.mm.plugin.appbrand.appcache.ax;
import com.tencent.mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.mm.plugin.appbrand.service.e;
import com.tencent.mm.plugin.appbrand.task.h;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Map;

public final class d
  implements av.c, DebuggerShell.a
{
  public final void A(Intent paramIntent)
  {
    AppMethodBeat.i(129944);
    String str = paramIntent.getStringExtra("appId");
    int i = paramIntent.getIntExtra("versionType", 0);
    paramIntent = new AppBrandStatObject();
    paramIntent.scene = 1030;
    ((e)g.K(e.class)).a(null, null, str, i, 0, null, paramIntent);
    AppMethodBeat.o(129944);
  }

  public final String name()
  {
    return "ForceOpenAppNotify";
  }

  public final void u(Map<String, String> paramMap)
  {
    AppMethodBeat.i(129943);
    String str1;
    String str2;
    int i;
    int j;
    String str3;
    String str4;
    String str5;
    String str6;
    String str7;
    String str8;
    if (DebuggerShell.ayT())
    {
      str1 = (String)paramMap.get(".sysmsg.ForceOpenAppNotify.OpenAppInfo.AppID");
      str2 = (String)paramMap.get(".sysmsg.ForceOpenAppNotify.OpenAppInfo.UserName");
      i = bo.getInt((String)paramMap.get(".sysmsg.ForceOpenAppNotify.OpenAppInfo.VersionType"), -1);
      j = bo.getInt((String)paramMap.get(".sysmsg.ForceOpenAppNotify.OpenAppInfo.AppVersion"), -1);
      str3 = (String)paramMap.get(".sysmsg.ForceOpenAppNotify.OpenAppInfo.Path");
      str4 = (String)paramMap.get(".sysmsg.ForceOpenAppNotify.OpenAppInfo.URL");
      str5 = (String)paramMap.get(".sysmsg.ForceOpenAppNotify.OpenAppInfo.MD5");
      str6 = (String)paramMap.get(".sysmsg.ForceOpenAppNotify.OpenAppInfo.ExtJsonInfo");
      str7 = (String)paramMap.get(".sysmsg.ForceOpenAppNotify.OpenAppInfo.SubUrls");
      str8 = (String)paramMap.get(".sysmsg.ForceOpenAppNotify.OpenAppInfo.WithoutCodeLibUrls");
      if (i < 0)
        AppMethodBeat.o(129943);
    }
    while (true)
    {
      return;
      if (i != 0)
      {
        if (f.auV() == null)
          AppMethodBeat.o(129943);
        else if ((bo.isNullOrNil(str4)) || (bo.isNullOrNil(str5)))
          AppMethodBeat.o(129943);
        else if (f.auV().a(str1, i, str4, str5, bo.anT(), bo.anT() + 432000L))
          h.bt(str1, i);
      }
      else
      {
        ab.i("MicroMsg.AppBrand.ForceOpenAppNotify", "before start weapp username[%s], appId[%s], versionType[%d]", new Object[] { str2, str1, Integer.valueOf(i) });
        paramMap = new se();
        paramMap.cOf.appId = str1;
        paramMap.cOf.userName = str2;
        paramMap.cOf.cOi = i;
        paramMap.cOf.cOh = str3;
        paramMap.cOf.axy = j;
        paramMap.cOf.cOj = str4;
        paramMap.cOf.cOk = str5;
        paramMap.cOf.cOl = false;
        paramMap.cOf.scene = 1030;
        paramMap.cOf.cOn.fpI = str6;
        paramMap.cOf.cOp = new d.1(this, str1, str7, i, str8);
        a.xxA.m(paramMap);
        AppMethodBeat.o(129943);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.debugger.d
 * JD-Core Version:    0.6.2
 */