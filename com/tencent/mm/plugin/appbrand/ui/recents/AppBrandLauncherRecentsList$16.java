package com.tencent.mm.plugin.appbrand.ui.recents;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.e.k.a;
import com.tencent.mm.sdk.e.m;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.concurrent.atomic.AtomicLong;

final class AppBrandLauncherRecentsList$16
  implements k.a
{
  AppBrandLauncherRecentsList$16(AppBrandLauncherRecentsList paramAppBrandLauncherRecentsList)
  {
  }

  public final void a(String paramString, m paramm)
  {
    AppMethodBeat.i(133352);
    if ("single".equals(paramString))
    {
      if (((5 != paramm.hsh) || (!AppBrandLauncherRecentsList.i(this.iMV))) && (2 != paramm.hsh) && (3 != paramm.hsh))
        break label164;
      ab.d("MicroMsg.AppBrandLauncherRecentsList", "onStarRecordModified, event %d", new Object[] { Integer.valueOf(paramm.hsh) });
      AppBrandLauncherRecentsList.a(this.iMV, false, -1L, true);
      AppMethodBeat.o(133352);
    }
    while (true)
    {
      return;
      if (("batch".equals(paramString)) && (3 == paramm.hsh))
      {
        paramString = paramm.obj;
        if (((paramString instanceof Long)) && (((Long)paramString).longValue() == AppBrandLauncherRecentsList.j(this.iMV).get()))
        {
          AppMethodBeat.o(133352);
        }
        else
        {
          ab.d("MicroMsg.AppBrandLauncherRecentsList", "onStarRecordModified, batch update");
          AppBrandLauncherRecentsList.a(this.iMV, false, 9223372036854775807L, true);
        }
      }
      else
      {
        label164: AppMethodBeat.o(133352);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.recents.AppBrandLauncherRecentsList.16
 * JD-Core Version:    0.6.2
 */