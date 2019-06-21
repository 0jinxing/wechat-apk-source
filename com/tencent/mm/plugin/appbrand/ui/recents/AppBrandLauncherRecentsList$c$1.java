package com.tencent.mm.plugin.appbrand.ui.recents;

import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.ui.n;
import com.tencent.mm.sdk.platformtools.ab;

final class AppBrandLauncherRecentsList$c$1
  implements Runnable
{
  AppBrandLauncherRecentsList$c$1(AppBrandLauncherRecentsList.c paramc, boolean paramBoolean)
  {
  }

  public final void run()
  {
    int i = 1;
    int j = 0;
    AppMethodBeat.i(133367);
    if ((!AppBrandLauncherRecentsList.b(this.iNl.iMV).isEmpty()) && (AppBrandLauncherRecentsList.b(this.iNl.iMV) != null));
    try
    {
      AppBrandLauncherRecentsList.b(this.iNl.iMV).cg(AppBrandLauncherRecentsList.b(this.iNl.iMV).getItemCount() - 1);
      if (AppBrandLauncherRecentsList.o(this.iNl.iMV) != null)
      {
        Object localObject = AppBrandLauncherRecentsList.o(this.iNl.iMV);
        if ((!this.iNk) && (!AppBrandLauncherRecentsList.b(this.iNl.iMV).isEmpty()))
        {
          localObject = ((e)localObject).iNC;
          if (i == 0)
            break label159;
          i = j;
          n.H((View)localObject, i);
        }
      }
      else
      {
        AppMethodBeat.o(133367);
        return;
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.e("MicroMsg.AppBrandLauncherRecentsList", "adjustListBottomDivider notifyItemChanged e=%s", new Object[] { localException });
        continue;
        i = 0;
        continue;
        label159: i = 4;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.recents.AppBrandLauncherRecentsList.c.1
 * JD-Core Version:    0.6.2
 */