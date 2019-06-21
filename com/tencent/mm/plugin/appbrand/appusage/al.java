package com.tencent.mm.plugin.appbrand.appusage;

import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.appbrand.appcache.am;
import com.tencent.mm.plugin.appbrand.appcache.ax;
import com.tencent.mm.plugin.appbrand.appcache.ay;
import com.tencent.mm.plugin.appbrand.appcache.ba;
import com.tencent.mm.plugin.appbrand.appcache.j.a;
import com.tencent.mm.plugin.appbrand.appcache.r;
import com.tencent.mm.plugin.appbrand.config.WxaAttributes;
import com.tencent.mm.plugin.appbrand.config.c;
import com.tencent.mm.plugin.appbrand.config.q;
import com.tencent.mm.plugin.appbrand.launching.l;
import com.tencent.mm.plugin.appbrand.launching.z;
import com.tencent.mm.plugin.appbrand.task.h;
import com.tencent.mm.plugin.appbrand.ui.banner.AppBrandStickyBannerLogic.b;
import com.tencent.mm.sdk.g.a.e;
import com.tencent.mm.sdk.g.d;
import com.tencent.mm.sdk.platformtools.ab;

public enum al
{
  public static void j(String paramString1, String paramString2, int paramInt)
  {
    AppMethodBeat.i(129719);
    d.xDG.b(new al.1(paramString1, paramString2, paramInt), "MicroMsg.AppBrand.RemoveUsageTask");
    AppMethodBeat.o(129719);
  }

  public static void k(String paramString1, String paramString2, int paramInt)
  {
    AppMethodBeat.i(129720);
    l(paramString1, paramString2, paramInt);
    AppMethodBeat.o(129720);
  }

  private static void l(String paramString1, String paramString2, int paramInt)
  {
    AppMethodBeat.i(129721);
    ab.i("MicroMsg.AppBrand.RemoveUsageTask", "removeImpl with username(%s) appId(%s) type(%d)", new Object[] { paramString1, paramString2, Integer.valueOf(paramInt) });
    if (com.tencent.mm.sdk.platformtools.bo.isNullOrNil(paramString1))
      AppMethodBeat.o(129721);
    while (true)
    {
      return;
      com.tencent.mm.plugin.appbrand.app.f.auT().aL(paramString1, paramInt);
      String str1 = paramString2;
      if (TextUtils.isEmpty(paramString2))
        str1 = com.tencent.mm.plugin.appbrand.config.p.zm(paramString1);
      if (TextUtils.isEmpty(str1))
      {
        AppMethodBeat.o(129721);
        continue;
      }
      ay.awp();
      h.bt(str1, paramInt);
      int i = com.tencent.mm.plugin.appbrand.app.f.auV().ax(str1, paramInt);
      paramString2 = new com.tencent.mm.g.b.a.bo();
      paramString2.dcY = 1L;
      paramString2 = paramString2.gk(str1);
      paramString2.dda = paramInt;
      paramString2.ddb = i;
      if (r.avG());
      boolean bool4;
      for (long l = 1L; ; l = 0L)
      {
        paramString2.dcW = l;
        paramString2.ajK();
        com.tencent.mm.plugin.appbrand.app.f.avc().clear(str1);
        com.tencent.mm.plugin.appbrand.app.f.avd();
        ba.clear(str1);
        if (paramInt == 0)
          ((com.tencent.mm.plugin.appbrand.appcache.b.d.a)com.tencent.mm.plugin.appbrand.app.f.E(com.tencent.mm.plugin.appbrand.appcache.b.d.a.class)).pI(str1);
        boolean bool1 = com.tencent.mm.plugin.appbrand.app.f.auV().as(str1, 0);
        boolean bool2 = com.tencent.mm.plugin.appbrand.app.f.auV().as(str1, 2);
        boolean bool3 = com.tencent.mm.plugin.appbrand.app.f.auV().as(str1, 1);
        bool4 = ((s)com.tencent.mm.plugin.appbrand.app.f.E(s.class)).aF(paramString1, paramInt);
        ab.i("MicroMsg.AppBrand.RemoveUsageTask", "removeImpl, with username(%s) appId(%s) type(%d) hasRelease(%B), hasPreview(%B), hasDebug(%B), isCollection(%B)", new Object[] { paramString1, str1, Integer.valueOf(paramInt), Boolean.valueOf(bool1), Boolean.valueOf(bool2), Boolean.valueOf(bool3), Boolean.valueOf(bool4) });
        if ((bool1) || (bool2) || (bool3))
          break label435;
        Object localObject = com.tencent.mm.plugin.appbrand.app.f.auO().d(paramString1, new String[] { "smallHeadURL", "bigHeadURL", "brandIconURL", "roundedSquareIconURL" });
        if (localObject == null)
          break;
        String str2 = ((WxaAttributes)localObject).field_smallHeadURL;
        paramString2 = ((WxaAttributes)localObject).field_bigHeadURL;
        String str3 = ((WxaAttributes)localObject).field_brandIconURL;
        localObject = ((WxaAttributes)localObject).field_roundedSquareIconURL;
        for (i = 0; i < 4; i++)
        {
          String str4 = new String[] { str2, paramString2, str3, localObject }[i];
          com.tencent.mm.modelappbrand.a.b.abR().pF(str4);
        }
      }
      if (bool4)
      {
        com.tencent.mm.plugin.appbrand.config.p.zp(paramString1);
        label435: com.tencent.mm.plugin.appbrand.app.f.xG().xR(str1);
        paramString1 = com.tencent.mm.plugin.appbrand.appstorage.f.gXv;
        com.tencent.mm.plugin.appbrand.appstorage.f.xR(str1);
        AppBrandStickyBannerLogic.b.aMR();
        com.tencent.mm.plugin.appbrand.app.f.xH().yW(str1);
        com.tencent.mm.plugin.appbrand.app.f.auP().pI(str1);
        paramString2 = com.tencent.mm.a.p.getString(((com.tencent.mm.plugin.appbrand.appstorage.a.a)g.K(com.tencent.mm.plugin.appbrand.appstorage.a.a.class)).ys(str1));
      }
      try
      {
        com.tencent.mm.plugin.appbrand.jsapi.file.al.cg(paramString2, str1).awP();
      }
      catch (Exception paramString1)
      {
        try
        {
          while (true)
          {
            com.tencent.mm.plugin.appbrand.jsapi.file.al.ch(paramString2, str1).awP();
            if (j.a.kR(paramInt))
              ((l)com.tencent.mm.plugin.appbrand.app.f.E(l.class)).n(str1, paramInt, "{}");
            AppMethodBeat.o(129721);
            break;
            com.tencent.mm.plugin.appbrand.app.f.auO().zg(paramString1);
            break label435;
            paramString1 = paramString1;
            ab.e("MicroMsg.AppBrand.RemoveUsageTask", "clean NonFlatten appId=%s e=%s", new Object[] { str1, paramString1 });
          }
        }
        catch (Exception paramString1)
        {
          while (true)
            ab.e("MicroMsg.AppBrand.RemoveUsageTask", "clean OpenDataNonFlatten appId=%s e=%s", new Object[] { str1, paramString1 });
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.appusage.al
 * JD-Core Version:    0.6.2
 */