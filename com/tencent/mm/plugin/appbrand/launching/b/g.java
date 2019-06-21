package com.tencent.mm.plugin.appbrand.launching.b;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.loader.a;
import com.tencent.mm.plugin.appbrand.launching.AppBrandLaunchProxyUI;
import com.tencent.mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;

public final class g
  implements com.tencent.mm.plugin.appbrand.service.f
{
  private static final int[] ijo = { 1025, 1031, 1032 };
  private static final int[] ijp = { 1011, 1012, 1013, 1047, 1049, 1048, 1050, 1124, 1125, 1126 };
  private final d ijq;
  private final f ijr;
  private final c ijs;

  public g()
  {
    AppMethodBeat.i(132041);
    this.ijq = new d();
    this.ijr = new f();
    this.ijs = new c();
    AppMethodBeat.o(132041);
  }

  public final boolean Cl(String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(132042);
    if (bo.isNullOrNil(paramString))
    {
      AppMethodBeat.o(132042);
      return bool;
    }
    ab.i("MicroMsg.WeAppLinkOpener", "handle appLink = %s", new Object[] { paramString });
    Object localObject1 = b.values();
    int i = localObject1.length;
    int j = 0;
    Object localObject2;
    int k;
    if (j < i)
    {
      localObject2 = localObject1[j];
      if ((!bo.isNullOrNil(paramString)) && (paramString.startsWith(localObject2.fNY)))
      {
        k = 1;
        label82: if (k == 0)
          break label117;
      }
    }
    while (true)
    {
      while (true)
      {
        if (localObject2 == null)
          break label247;
        try
        {
          localObject1 = Uri.parse(paramString);
          paramString = (String)localObject1;
          if (paramString == null)
          {
            AppMethodBeat.o(132042);
            break;
            k = 0;
            break label82;
            label117: j++;
          }
        }
        catch (Exception localException)
        {
          while (true)
          {
            ab.e("MicroMsg.WeAppLinkOpener", "handle nativeLink = %s, exp = %s", new Object[] { paramString, localException });
            paramString = null;
          }
          String str = paramString.getQueryParameter("username");
          paramString = paramString.getQueryParameter("path");
          if ((bo.isNullOrNil(str)) || (!ad.mg(str)))
          {
            AppMethodBeat.o(132042);
            break;
          }
          AppBrandStatObject localAppBrandStatObject = new AppBrandStatObject();
          localAppBrandStatObject.scene = localObject2.scene;
          localAppBrandStatObject.cst = b.aHI();
          localAppBrandStatObject.cOq = 0;
          localAppBrandStatObject.cOr = b.aHJ();
          AppBrandLaunchProxyUI.a(null, str, paramString, 0, -1, localAppBrandStatObject, null, null);
          AppMethodBeat.o(132042);
          bool = true;
        }
      }
      break;
      label247: AppMethodBeat.o(132042);
      break;
      localObject2 = null;
    }
  }

  public final boolean b(Context paramContext, String paramString, int paramInt, Bundle paramBundle)
  {
    boolean bool = true;
    AppMethodBeat.i(132043);
    if (a.contains(ijo, paramInt))
      if (a.a.ijf == this.ijq.a(paramContext, paramString, paramInt, paramBundle))
        AppMethodBeat.o(132043);
    while (true)
    {
      return bool;
      AppMethodBeat.o(132043);
      bool = false;
      continue;
      if (a.contains(ijp, paramInt))
      {
        if (a.a.ijf == this.ijr.a(paramContext, paramString, paramInt, paramBundle))
        {
          AppMethodBeat.o(132043);
        }
        else
        {
          AppMethodBeat.o(132043);
          bool = false;
        }
      }
      else if ((1064 == paramInt) || (1078 == paramInt))
      {
        if (a.a.ijf == this.ijs.a(paramContext, paramString, paramInt, paramBundle))
        {
          AppMethodBeat.o(132043);
        }
        else
        {
          AppMethodBeat.o(132043);
          bool = false;
        }
      }
      else
      {
        ab.e("MicroMsg.WeAppLinkOpener", "handleScanCodeLink, unhandled case link[ %s ], scene[ %d ]", new Object[] { paramString, Integer.valueOf(paramInt) });
        AppMethodBeat.o(132043);
        bool = false;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.launching.b.g
 * JD-Core Version:    0.6.2
 */