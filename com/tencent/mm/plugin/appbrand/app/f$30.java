package com.tencent.mm.plugin.appbrand.app;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.appbrand.appusage.s.a;
import com.tencent.mm.plugin.appbrand.backgroundfetch.h;
import com.tencent.mm.sdk.e.k.a;
import com.tencent.mm.sdk.e.m;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

final class f$30
  implements k.a
{
  f$30(f paramf)
  {
  }

  public final void a(String paramString, m paramm)
  {
    AppMethodBeat.i(129283);
    int i;
    if ((paramm != null) && (!bo.isNullOrNil(paramm.ctq)) && (paramm.ctq.equalsIgnoreCase("single")) && (paramm.hsh == 5) && (paramm.obj != null) && ((paramm.obj instanceof s.a)))
    {
      paramString = ((s.a)paramm.obj).field_username;
      i = ((s.a)paramm.obj).field_versionType;
      if (bo.isNullOrNil(paramString))
      {
        ab.w("MicroMsg.AppBrand.AppBrandBackgroundFetchDataHandler", "handleStarAppChangeEvent, username is null");
        AppMethodBeat.o(129283);
      }
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.AppBrand.AppBrandBackgroundFetchDataHandler", "handleRemoveStarAppEvent, delete star app(%s_v%d)", new Object[] { paramString, Integer.valueOf(i) });
      ((h)g.K(h.class)).ao(paramString, 0);
      ((h)g.K(h.class)).ao(paramString, 1);
      AppMethodBeat.o(129283);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.app.f.30
 * JD-Core Version:    0.6.2
 */