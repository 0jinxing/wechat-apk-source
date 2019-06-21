package com.tencent.mm.plugin.appbrand.ui.banner;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.a;
import com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo;
import com.tencent.mm.plugin.appbrand.config.h;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandMainProcessService;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class AppBrandStickyBannerLogic$a
{
  private static final AppBrandStickyBannerLogic.Watcher iKH;
  private static final Set<f> iKI;
  private static final HashMap<String, Boolean> iKJ;
  private static final HashMap<String, f> iKK;
  private static final c iKL;
  private static final Map<String, String> iKM;

  static
  {
    AppMethodBeat.i(133287);
    iKH = new AppBrandStickyBannerLogic.Watcher();
    iKI = new HashSet();
    iKJ = new HashMap();
    iKK = new HashMap();
    iKL = new c();
    iKM = new HashMap();
    AppMethodBeat.o(133287);
  }

  public static void a(Context paramContext, String paramString1, int paramInt, String paramString2, String paramString3)
  {
    AppMethodBeat.i(133281);
    if (bo.isNullOrNil(paramString1))
    {
      AppMethodBeat.o(133281);
      return;
    }
    if (paramContext == null)
      paramContext = ah.getContext();
    while (true)
    {
      while (true)
      {
        Intent localIntent = new Intent().setClassName(paramContext, "com.tencent.mm.ui.LauncherUI").addFlags(268435456).addFlags(67108864).addFlags(536870912);
        synchronized (iKM)
        {
          String str = (String)iKM.get(paramString1);
          b.a(localIntent, paramString1, paramInt, paramString2, paramString3, bo.nullAsNil(str));
          paramContext.startActivity(localIntent);
          if (!(paramContext instanceof Activity))
            break label156;
        }
        try
        {
          ((Activity)paramContext).moveTaskToBack(false);
          AppMethodBeat.o(133281);
          break;
          paramContext = finally;
          AppMethodBeat.o(133281);
          throw paramContext;
        }
        catch (Exception paramContext)
        {
          ab.e("MicroMsg.AppBrandStickyBannerLogic.ClientLogic", "stickOnChatting e = %s", new Object[] { paramContext.getMessage() });
        }
      }
      label156: AppMethodBeat.o(133281);
      break;
    }
  }

  public static boolean aMP()
  {
    AppMethodBeat.i(133282);
    AppBrandStickyBannerLogic.access$200();
    AppMethodBeat.o(133282);
    return false;
  }

  static void bw(String paramString, int paramInt)
  {
    AppMethodBeat.i(133280);
    synchronized (iKI)
    {
      Iterator localIterator = iKI.iterator();
      if (localIterator.hasNext())
        ((f)localIterator.next()).bg(paramString, paramInt);
    }
    AppMethodBeat.o(133280);
  }

  public static void c(f paramf)
  {
    AppMethodBeat.i(133283);
    if (paramf != null);
    while (true)
    {
      synchronized (iKI)
      {
        iKI.remove(paramf);
        AppMethodBeat.o(133283);
        return;
      }
      AppMethodBeat.o(133283);
    }
  }

  public static void cQ(String paramString1, String paramString2)
  {
    AppMethodBeat.i(133286);
    if (bo.isNullOrNil(paramString1))
      AppMethodBeat.o(133286);
    while (true)
    {
      return;
      synchronized (iKM)
      {
        iKM.put(paramString1, bo.nullAsNil(paramString2));
        ??? = a.wJ(paramString1);
        if (??? == null)
          AppMethodBeat.o(133286);
      }
      AppBrandMainProcessService.a(AppBrandStickyBannerLogic.OperateTask.o(paramString1, ((h)???).hhd.gVt, paramString2));
      AppMethodBeat.o(133286);
    }
  }

  public static void d(f paramf)
  {
    AppMethodBeat.i(133284);
    iKH.iKQ = ah.getProcessName();
    AppBrandMainProcessService.a(iKH);
    if (paramf != null);
    while (true)
    {
      synchronized (iKI)
      {
        iKI.add(paramf);
        AppMethodBeat.o(133284);
        return;
      }
      AppMethodBeat.o(133284);
    }
  }

  public static void release(String paramString)
  {
    AppMethodBeat.i(133285);
    iKJ.remove(paramString);
    ab.i("MicroMsg.AppBrandStickyBannerLogic", "release(%s)", new Object[] { paramString });
    AppMethodBeat.o(133285);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.banner.AppBrandStickyBannerLogic.a
 * JD-Core Version:    0.6.2
 */