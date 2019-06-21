package com.tencent.mm.plugin.appbrand.ui;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.os.SystemClock;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC;
import com.tencent.mm.plugin.appbrand.p;
import com.tencent.mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.mm.ui.MMFragmentActivity.a;

public final class AppBrandEmbedUI extends AppBrandUI
{
  public final long iFU;

  public AppBrandEmbedUI()
  {
    AppMethodBeat.i(132928);
    this.iFU = SystemClock.elapsedRealtimeNanos();
    AppMethodBeat.o(132928);
  }

  static boolean I(Intent paramIntent)
  {
    boolean bool = true;
    AppMethodBeat.i(132927);
    if (paramIntent != null);
    try
    {
      if ((paramIntent.getComponent() != null) && (paramIntent.getComponent().getClassName().equals(AppBrandEmbedUI.class.getName())))
        AppMethodBeat.o(132927);
      while (true)
      {
        return bool;
        AppMethodBeat.o(132927);
        bool = false;
      }
    }
    catch (Exception paramIntent)
    {
      while (true)
      {
        com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.AppBrandEmbedUI", "isIntentForEmbedUI e=%s", new Object[] { paramIntent });
        AppMethodBeat.o(132927);
        bool = false;
      }
    }
  }

  private boolean aMd()
  {
    AppMethodBeat.i(132932);
    boolean bool;
    if ((this.iIP != null) && (p.l(this.iIP.atv())))
    {
      bool = true;
      AppMethodBeat.o(132932);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(132932);
    }
  }

  protected final void e(AppBrandInitConfigWC paramAppBrandInitConfigWC, AppBrandStatObject paramAppBrandStatObject)
  {
    AppMethodBeat.i(132930);
    if (aMd())
    {
      super.overridePendingTransition(MMFragmentActivity.a.ync, MMFragmentActivity.a.ynd);
      AppMethodBeat.o(132930);
    }
    while (true)
    {
      return;
      super.overridePendingTransition(2131034143, 2131034130);
      AppMethodBeat.o(132930);
    }
  }

  public final void finish()
  {
    AppMethodBeat.i(132929);
    if (isFinishing())
      AppMethodBeat.o(132929);
    while (true)
    {
      return;
      aMt();
      AppMethodBeat.o(132929);
    }
  }

  public final void initActivityCloseAnimation()
  {
    AppMethodBeat.i(132931);
    if (aMd())
    {
      super.overridePendingTransition(MMFragmentActivity.a.yne, MMFragmentActivity.a.ynf);
      AppMethodBeat.o(132931);
    }
    while (true)
    {
      return;
      overridePendingTransition(2131034130, 2131034141);
      AppMethodBeat.o(132931);
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.AppBrandEmbedUI
 * JD-Core Version:    0.6.2
 */