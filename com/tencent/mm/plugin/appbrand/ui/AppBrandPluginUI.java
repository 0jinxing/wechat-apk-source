package com.tencent.mm.plugin.appbrand.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Looper;
import android.os.MessageQueue;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.ab;
import com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC;
import com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.k;
import com.tencent.mm.plugin.appbrand.p;
import com.tencent.mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.mm.ui.MMFragmentActivity.a;
import com.tencent.mm.ui.base.a;
import com.tencent.mm.ui.base.b;

@a(1)
public class AppBrandPluginUI extends AppBrandUI
  implements r
{
  private boolean iHc = false;

  protected final void J(Intent paramIntent)
  {
    AppMethodBeat.i(133008);
    super.J(paramIntent);
    if (this.iIP == null);
    for (paramIntent = null; ; paramIntent = this.iIP.atv())
    {
      if (p.l(paramIntent))
        paramIntent.gNS = true;
      AppMethodBeat.o(133008);
      return;
    }
  }

  public final boolean apx()
  {
    return true;
  }

  protected void e(AppBrandInitConfigWC paramAppBrandInitConfigWC, AppBrandStatObject paramAppBrandStatObject)
  {
    AppMethodBeat.i(133005);
    if (k.a(this, paramAppBrandInitConfigWC, paramAppBrandStatObject))
    {
      b.a(this, null);
      AppMethodBeat.o(133005);
    }
    while (true)
    {
      return;
      super.overridePendingTransition(MMFragmentActivity.a.ync, MMFragmentActivity.a.ynd);
      AppMethodBeat.o(133005);
    }
  }

  public void initActivityCloseAnimation()
  {
    AppMethodBeat.i(133006);
    if (this.iHc)
      AppMethodBeat.o(133006);
    while (true)
    {
      return;
      super.overridePendingTransition(MMFragmentActivity.a.yne, MMFragmentActivity.a.ynf);
      AppMethodBeat.o(133006);
    }
  }

  public void onEnterAnimationComplete()
  {
    AppMethodBeat.i(133004);
    super.onEnterAnimationComplete();
    b.a(this, null);
    AppMethodBeat.o(133004);
  }

  public void onResume()
  {
    AppMethodBeat.i(133003);
    super.onResume();
    if (Build.VERSION.SDK_INT < 21)
      Looper.myQueue().addIdleHandler(new AppBrandPluginUI.1(this));
    AppMethodBeat.o(133003);
  }

  public void onSwipeBack()
  {
    AppMethodBeat.i(133007);
    super.onSwipeBack();
    this.iHc = true;
    AppMethodBeat.o(133007);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.AppBrandPluginUI
 * JD-Core Version:    0.6.2
 */