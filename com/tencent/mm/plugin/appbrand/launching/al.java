package com.tencent.mm.plugin.appbrand.launching;

import android.content.res.Resources;
import com.tencent.luggage.sdk.launching.ActivityStarterIpcDelegate;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.app.f;
import com.tencent.mm.plugin.appbrand.appcache.at;
import com.tencent.mm.plugin.appbrand.appcache.ax;
import com.tencent.mm.plugin.appbrand.config.WxaAttributes;
import com.tencent.mm.plugin.appbrand.config.WxaAttributes.e;
import com.tencent.mm.plugin.appbrand.report.c;
import com.tencent.mm.plugin.appbrand.ui.AppBrand404PageUI;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.vfs.e;

final class al
{
  static boolean a(WxaAttributes paramWxaAttributes, ActivityStarterIpcDelegate paramActivityStarterIpcDelegate)
  {
    boolean bool = true;
    AppMethodBeat.i(131991);
    if (1 == paramWxaAttributes.ayL().bQl)
    {
      AppBrand404PageUI.a(paramActivityStarterIpcDelegate);
      c.K(paramWxaAttributes.field_appId, 14, 1);
      bool = false;
      AppMethodBeat.o(131991);
    }
    while (true)
    {
      return bool;
      AppMethodBeat.o(131991);
    }
  }

  static boolean an(String paramString, boolean paramBoolean)
  {
    boolean bool = false;
    AppMethodBeat.i(131993);
    int i = new am(paramString, bp(paramString, 2), bp(paramString, 10001), paramBoolean).aAa();
    ab.i("MicroMsg.AppBrand.PrepareStepOpBan", "checkDemoInfo, appId %s, ret %d, ignoreCgiError %b", new Object[] { paramString, Integer.valueOf(i), Boolean.valueOf(paramBoolean) });
    am.a locala = am.a.pa(i);
    if (locala == null)
      switch (i)
      {
      default:
        if (paramBoolean)
        {
          AppMethodBeat.o(131993);
          paramBoolean = true;
        }
        break;
      case -13002:
      case -13003:
      }
    while (true)
    {
      return paramBoolean;
      ag.oZ(2131296594);
      c.K(paramString, 13, 3);
      AppMethodBeat.o(131993);
      paramBoolean = bool;
      continue;
      ag.oZ(2131296595);
      c.K(paramString, 12, 3);
      AppMethodBeat.o(131993);
      paramBoolean = bool;
      continue;
      ag.Ck(ah.getResources().getString(2131296772, new Object[] { Integer.valueOf(3), Integer.valueOf(i) }));
      AppMethodBeat.o(131993);
      paramBoolean = bool;
      continue;
      if (paramBoolean)
      {
        AppMethodBeat.o(131993);
        paramBoolean = true;
      }
      else
      {
        switch (al.1.iiJ[locala.ordinal()])
        {
        default:
          ag.oZ(2131296592);
          c.K(paramString, 13, 3);
          AppMethodBeat.o(131993);
          paramBoolean = bool;
          break;
        case 1:
          AppMethodBeat.o(131993);
          paramBoolean = true;
          break;
        case 2:
          ag.oZ(2131296593);
          c.K(paramString, 13, 3);
          AppMethodBeat.o(131993);
          paramBoolean = bool;
        }
      }
    }
  }

  private static String bp(String paramString, int paramInt)
  {
    AppMethodBeat.i(131992);
    Object localObject = null;
    at localat = f.auV().a(paramString, paramInt, new String[] { "versionMd5", "pkgPath" });
    paramString = localObject;
    if (localat != null)
    {
      paramString = localObject;
      if (!bo.isNullOrNil(localat.field_pkgPath))
      {
        paramString = localObject;
        if (e.ct(localat.field_pkgPath))
        {
          paramString = localObject;
          if (!bo.isNullOrNil(localat.field_versionMd5))
          {
            paramString = localObject;
            if (localat.field_pkgPath.equals(e.atg(localat.field_pkgPath)))
              paramString = localat.field_versionMd5;
          }
        }
      }
    }
    AppMethodBeat.o(131992);
    return paramString;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.launching.al
 * JD-Core Version:    0.6.2
 */