package com.tencent.mm.plugin.appbrand.widget.desktop;

import android.support.v7.widget.RecyclerView.a;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.appbrand.appusage.LocalUsageInfo;
import com.tencent.mm.plugin.appbrand.appusage.af;
import com.tencent.mm.plugin.appbrand.appusage.ag;
import com.tencent.mm.plugin.appbrand.widget.recentview.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.ArrayList;

final class AppBrandDesktopView$1
  implements AppBrandDesktopDragView.b
{
  AppBrandDesktopView$1(AppBrandDesktopView paramAppBrandDesktopView)
  {
  }

  public final void bI(Object paramObject)
  {
    AppMethodBeat.i(133821);
    if (paramObject == null)
      AppMethodBeat.o(133821);
    while (true)
    {
      return;
      if ((paramObject instanceof AppBrandDesktopView.c))
      {
        AppBrandDesktopView.c localc = (AppBrandDesktopView.c)paramObject;
        if (localc.iXW != null)
        {
          AppBrandDesktopView.a(this.iXS);
          ab.i("MicroMsg.AppBrandDesktopView", "alvinluo usage to collection reorderCollection result: %b", new Object[] { Boolean.valueOf(AppBrandDesktopView.b(this.iXS)) });
          if ((AppBrandDesktopView.c(this.iXS) != null) && (!bo.isNullOrNil(localc.iXW.appId)))
            AppBrandDesktopView.c(this.iXS).ET(localc.iXW.appId);
          AppBrandDesktopView.a(this.iXS, ((AppBrandDesktopView.c)paramObject).position);
        }
      }
      AppMethodBeat.o(133821);
    }
  }

  public final void bJ(Object paramObject)
  {
    AppMethodBeat.i(133822);
    if (paramObject == null)
      AppMethodBeat.o(133822);
    while (true)
    {
      return;
      if ((paramObject instanceof AppBrandDesktopView.c))
      {
        AppBrandDesktopView.c localc = (AppBrandDesktopView.c)paramObject;
        if ((localc.type == 1) && (localc.iXW != null))
        {
          AppBrandDesktopView.a(this.iXS);
          af localaf = (af)g.K(af.class);
          if (localaf == null)
          {
            AppMethodBeat.o(133822);
            continue;
          }
          if (localaf.aD(localc.iXW.username, localc.iXW.har))
            AppBrandDesktopView.a(this.iXS, ((AppBrandDesktopView.c)paramObject).position);
          if ((AppBrandDesktopView.c(this.iXS) != null) && (!bo.isNullOrNil(localc.iXW.appId)))
            AppBrandDesktopView.c(this.iXS).ES(localc.iXW.appId);
        }
      }
      else
      {
        AppMethodBeat.o(133822);
      }
    }
  }

  public final void bK(Object paramObject)
  {
    AppMethodBeat.i(133823);
    if (paramObject == null)
    {
      AppMethodBeat.o(133823);
      return;
    }
    paramObject = (AppBrandDesktopView.c)paramObject;
    ag localag;
    if (paramObject.iXW != null)
    {
      ab.d("MicroMsg.AppBrandDesktopView", "alvinluo AppBrandDesktopView removeUsage username: %s, versionType: %d", new Object[] { paramObject.iXW.username, Integer.valueOf(paramObject.iXW.har) });
      AppBrandDesktopView.a(this.iXS);
      localag = (ag)g.K(ag.class);
      if (localag == null)
        break label261;
    }
    label261: for (boolean bool = localag.aE(paramObject.iXW.username, paramObject.iXW.har); ; bool = false)
    {
      if ((AppBrandDesktopView.c(this.iXS) != null) && (paramObject.iXW != null) && (!bo.isNullOrNil(paramObject.iXW.appId)))
        AppBrandDesktopView.c(this.iXS).ER(paramObject.iXW.appId);
      if (AppBrandDesktopView.d(this.iXS) != null)
      {
        if (bool)
        {
          AppBrandDesktopView.b(this.iXS, paramObject.position);
          AppMethodBeat.o(133823);
          break;
        }
        ab.e("MicroMsg.AppBrandDesktopView", "alvinluo removeUsage failed");
        paramObject.type = 2;
        AppBrandDesktopView.e(this.iXS).add(paramObject.position, paramObject);
        AppBrandDesktopView.d(this.iXS).setDataList(AppBrandDesktopView.e(this.iXS));
        if (AppBrandDesktopView.f(this.iXS) != null)
          AppBrandDesktopView.f(this.iXS).getAdapter().cg(paramObject.position);
      }
      AppMethodBeat.o(133823);
      break;
    }
  }

  public final void e(int paramInt1, int paramInt2, Object paramObject)
  {
    AppMethodBeat.i(133824);
    AppBrandDesktopView.a(this.iXS);
    ab.i("MicroMsg.AppBrandDesktopView", "alvinluo collection reorderCollection result: %b, startPos: %d, endPos: %d", new Object[] { Boolean.valueOf(AppBrandDesktopView.b(this.iXS)), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    b localb;
    if (((paramObject instanceof AppBrandDesktopView.c)) && (AppBrandDesktopView.c(this.iXS) != null) && (((AppBrandDesktopView.c)paramObject).iXW != null) && (!bo.isNullOrNil(((AppBrandDesktopView.c)paramObject).iXW.appId)))
    {
      if (paramInt1 >= paramInt2)
        break label193;
      localb = AppBrandDesktopView.c(this.iXS);
      paramObject = ((AppBrandDesktopView.c)paramObject).iXW.appId;
      ab.v("MicroMsg.AppBrandRecentViewReporter", "alvinluo moveCollectionBackward id: %s", new Object[] { paramObject });
      localb.jnc += 1;
      localb.jnj.append(paramObject + ":");
    }
    while (true)
    {
      AppBrandDesktopView.a(this.iXS, AppBrandDesktopView.g(this.iXS));
      AppMethodBeat.o(133824);
      return;
      label193: if (paramInt1 > paramInt2)
      {
        localb = AppBrandDesktopView.c(this.iXS);
        paramObject = ((AppBrandDesktopView.c)paramObject).iXW.appId;
        ab.v("MicroMsg.AppBrandRecentViewReporter", "alvinluo moveCollectionForward id: %s", new Object[] { paramObject });
        localb.jnb += 1;
        localb.jnh.append(paramObject + ":");
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.desktop.AppBrandDesktopView.1
 * JD-Core Version:    0.6.2
 */