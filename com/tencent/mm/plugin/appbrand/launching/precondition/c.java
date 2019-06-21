package com.tencent.mm.plugin.appbrand.launching.precondition;

import android.app.Activity;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC;
import com.tencent.mm.plugin.appbrand.launching.AppBrandLaunchProxyUI;
import com.tencent.mm.plugin.appbrand.launching.params.LaunchParcel;
import com.tencent.mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.mm.plugin.appbrand.ui.AppBrandUI;
import com.tencent.mm.plugin.appbrand.ui.n;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Queue;

public final class c extends a
  implements g
{
  int huR;
  private Intent mIntent;

  public c(AppBrandLaunchProxyUI paramAppBrandLaunchProxyUI)
  {
    AppMethodBeat.i(132060);
    this.huR = 0;
    setBaseContext(paramAppBrandLaunchProxyUI);
    this.ijC = false;
    AppMethodBeat.o(132060);
  }

  private void aHP()
  {
    AppMethodBeat.i(132066);
    if ((isFinishing()) || (aHN()))
      AppMethodBeat.o(132066);
    while (true)
    {
      return;
      super.aHL();
      AppMethodBeat.o(132066);
    }
  }

  public final void E(Intent paramIntent)
  {
    AppMethodBeat.i(132061);
    if ((getBaseContext() != null) && ((getBaseContext() instanceof Activity)))
    {
      Activity localActivity = (Activity)getBaseContext();
      n.a(localActivity.getWindow());
      n.a(localActivity.getWindow(), true);
    }
    this.mIntent = paramIntent;
    paramIntent = (LaunchParcel)paramIntent.getParcelableExtra("extra_launch_parcel");
    if (paramIntent == null)
    {
      finish();
      AppMethodBeat.o(132061);
    }
    while (true)
    {
      return;
      a(paramIntent, com.tencent.mm.plugin.appbrand.report.quality.g.a(paramIntent));
      AppMethodBeat.o(132061);
    }
  }

  protected final String aHK()
  {
    AppMethodBeat.i(132064);
    String str = this.mIntent.getStringExtra("extra_launch_source_context");
    AppMethodBeat.o(132064);
    return str;
  }

  public final boolean aHO()
  {
    return true;
  }

  protected final void b(AppBrandInitConfigWC paramAppBrandInitConfigWC, AppBrandStatObject paramAppBrandStatObject)
  {
    AppMethodBeat.i(132065);
    super.b(paramAppBrandInitConfigWC, paramAppBrandStatObject);
    paramAppBrandInitConfigWC = new c.1(this);
    if ((getBaseContext() instanceof AppBrandLaunchProxyUI))
    {
      al.d(paramAppBrandInitConfigWC);
      AppMethodBeat.o(132065);
    }
    while (true)
    {
      return;
      this.ijD.offer(paramAppBrandInitConfigWC);
      AppMethodBeat.o(132065);
    }
  }

  protected final boolean c(AppBrandInitConfigWC paramAppBrandInitConfigWC, AppBrandStatObject paramAppBrandStatObject)
  {
    AppMethodBeat.i(132059);
    try
    {
      Class localClass = Class.forName(bo.nullAsNil(this.mIntent.getStringExtra("extra_launch_source_context")));
      if ((localClass != null) && (AppBrandUI.class.isAssignableFrom(localClass)))
      {
        bool = false;
        AppMethodBeat.o(132059);
        return bool;
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        Object localObject = null;
        continue;
        boolean bool = super.c(paramAppBrandInitConfigWC, paramAppBrandStatObject);
        AppMethodBeat.o(132059);
      }
    }
  }

  public final void onDestroy()
  {
  }

  public final void onPause()
  {
    AppMethodBeat.i(132063);
    aHP();
    AppMethodBeat.o(132063);
  }

  public final void onResume()
  {
    AppMethodBeat.i(132062);
    int i = this.huR + 1;
    this.huR = i;
    if (i > 1)
      aHP();
    AppMethodBeat.o(132062);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.launching.precondition.c
 * JD-Core Version:    0.6.2
 */