package com.tencent.mm.plugin.appbrand.ui;

import android.app.ActivityOptions;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.util.Pair;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.appbrand.compat.a.a;
import com.tencent.mm.plugin.websearch.api.m;
import com.tencent.mm.sdk.platformtools.ah;

final class AppBrandLauncherUI$3
  implements MenuItem.OnMenuItemClickListener
{
  AppBrandLauncherUI$3(AppBrandLauncherUI paramAppBrandLauncherUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(132973);
    ((m)g.K(m.class)).a(ah.getContext(), new Runnable()
    {
      public final void run()
      {
        AppMethodBeat.i(132972);
        if (Build.VERSION.SDK_INT >= 21);
        for (Bundle localBundle = ActivityOptions.makeSceneTransitionAnimation(AppBrandLauncherUI.3.this.iGN, new Pair[0]).toBundle(); ; localBundle = null)
        {
          if (AppBrandLauncherUI.b(AppBrandLauncherUI.3.this.iGN) == 13);
          for (int i = 52; ; i = 201)
          {
            AppBrandLauncherUI.3.this.iGN.startActivityForResult(((a)g.K(a.class)).D(AppBrandLauncherUI.3.this.iGN, i), 1, localBundle);
            AppMethodBeat.o(132972);
            return;
          }
        }
      }
    });
    AppMethodBeat.o(132973);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.AppBrandLauncherUI.3
 * JD-Core Version:    0.6.2
 */