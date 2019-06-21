package com.tencent.mm.plugin.appbrand.menu;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo;
import com.tencent.mm.plugin.appbrand.config.h;
import com.tencent.mm.plugin.appbrand.g.d;
import com.tencent.mm.plugin.appbrand.i;
import com.tencent.mm.plugin.appbrand.menu.a.a;
import com.tencent.mm.plugin.appbrand.page.u;
import com.tencent.mm.plugin.appbrand.report.c;
import com.tencent.mm.plugin.appbrand.ui.banner.AppBrandStickyBannerLogic.a;
import com.tencent.mm.plugin.appbrand.widget.recentview.d;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.l;

public final class m extends a
{
  public m()
  {
    super(o.imV.ordinal());
    AppMethodBeat.i(132251);
    AppMethodBeat.o(132251);
  }

  public final void a(Context paramContext, u paramu, l paraml, String paramString)
  {
    AppMethodBeat.i(132252);
    com.tencent.mm.kernel.g.K(d.class);
    AppMethodBeat.o(132252);
  }

  public final void a(Context paramContext, u paramu, String paramString, n paramn)
  {
    AppMethodBeat.i(132253);
    paramn = paramu.getRuntime().ye();
    AppBrandStickyBannerLogic.a.aMP();
    com.tencent.mm.plugin.appbrand.g.a(paramString, g.d.gNp);
    AppBrandStickyBannerLogic.a.a(paramContext, paramn.appId, paramn.hhd.gVt, paramn.cwz, paramn.hgW);
    c.a(paramString, paramu.getURL(), 13, "", bo.anT(), 1, 0);
    AppMethodBeat.o(132253);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.menu.m
 * JD-Core Version:    0.6.2
 */