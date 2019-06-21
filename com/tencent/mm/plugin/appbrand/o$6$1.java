package com.tencent.mm.plugin.appbrand;

import android.app.Activity;
import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.fakenative.OpenBusinessViewUtil;
import com.tencent.mm.plugin.appbrand.launching.AppBrandLaunchErrorAction;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.ui.MMActivity;

final class o$6$1
  implements Runnable
{
  o$6$1(o.6 param6, AppBrandLaunchErrorAction paramAppBrandLaunchErrorAction)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(128983);
    this.gPD.gPy.finish();
    if (this.gPC != null)
    {
      AppBrandLaunchErrorAction localAppBrandLaunchErrorAction = this.gPC;
      MMActivity localMMActivity = this.gPD.gPy.atM();
      Object localObject;
      if (localMMActivity != null)
      {
        localObject = localMMActivity;
        if (!localMMActivity.isFinishing());
      }
      else
      {
        localObject = ah.getContext();
      }
      localAppBrandLaunchErrorAction.cQ((Context)localObject);
      OpenBusinessViewUtil.m(this.gPD.gPy);
    }
    AppMethodBeat.o(128983);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.o.6.1
 * JD-Core Version:    0.6.2
 */