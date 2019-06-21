package com.tencent.mm.plugin.appbrand.ui.banner;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.al;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public final class AppBrandStickyBannerLogic$b
{
  static final Set<f> epg;

  static
  {
    AppMethodBeat.i(133298);
    epg = new HashSet();
    AppMethodBeat.o(133298);
  }

  public static void M(Intent paramIntent)
  {
    AppMethodBeat.i(133289);
    if ((paramIntent == null) || (!g.RK()))
      AppMethodBeat.o(133289);
    while (true)
    {
      return;
      g.RS().aa(new Runnable()
      {
        public final void run()
        {
          AppMethodBeat.i(133288);
          if (b.L(this.val$intent))
            AppBrandStickyBannerLogic.b.access$100();
          AppMethodBeat.o(133288);
        }
      });
      AppMethodBeat.o(133289);
    }
  }

  static void aMK()
  {
    AppMethodBeat.i(133291);
    AppBrandStickyBannerLogic.access$200();
    AppMethodBeat.o(133291);
  }

  public static boolean aMP()
  {
    AppMethodBeat.i(133295);
    AppBrandStickyBannerLogic.access$200();
    AppMethodBeat.o(133295);
    return false;
  }

  private static void aMQ()
  {
    AppMethodBeat.i(133292);
    ??? = BannerModel.aMS();
    String str1;
    if (??? == null)
    {
      str1 = null;
      if (??? != null)
        break label82;
    }
    label82: for (int i = -1; ; i = ((BannerModel)???).har)
    {
      synchronized (epg)
      {
        Iterator localIterator = epg.iterator();
        if (!localIterator.hasNext())
          break label90;
        ((f)localIterator.next()).bg(str1, i);
      }
      String str2 = ((BannerModel)???).appId;
      break;
    }
    label90: AppMethodBeat.o(133292);
  }

  public static void aMR()
  {
    AppMethodBeat.i(133296);
    AppBrandStickyBannerLogic.access$200();
    AppMethodBeat.o(133296);
  }

  static void b(AppBrandStickyBannerLogic.OperateTask paramOperateTask)
  {
    AppMethodBeat.i(133290);
    if (b.a(paramOperateTask))
      aMQ();
    AppMethodBeat.o(133290);
  }

  public static void c(f paramf)
  {
    AppMethodBeat.i(133294);
    if (paramf != null);
    while (true)
    {
      synchronized (epg)
      {
        epg.remove(paramf);
        AppMethodBeat.o(133294);
        return;
      }
      AppMethodBeat.o(133294);
    }
  }

  public static void d(f paramf)
  {
    AppMethodBeat.i(133293);
    if (paramf != null);
    while (true)
    {
      synchronized (epg)
      {
        epg.add(paramf);
        AppMethodBeat.o(133293);
        return;
      }
      AppMethodBeat.o(133293);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.banner.AppBrandStickyBannerLogic.b
 * JD-Core Version:    0.6.2
 */