package com.tencent.mm.plugin.appbrand.launching.precondition;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import com.tencent.luggage.sdk.launching.a;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer;
import com.tencent.mm.plugin.appbrand.launching.AppBrandLaunchProxyUI;
import com.tencent.mm.plugin.appbrand.launching.params.LaunchParcel;
import com.tencent.mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.mm.plugin.appbrand.ui.AppBrandInToolsUI;
import com.tencent.mm.plugin.appbrand.ui.AppBrandPluginUI;
import com.tencent.mm.plugin.appbrand.ui.AppBrandUI;

final class b extends a
{
  public final boolean b(Context paramContext, LaunchParcel paramLaunchParcel)
  {
    int i = 0;
    AppMethodBeat.i(132056);
    Intent localIntent = new Intent(paramContext, AppBrandLaunchProxyUI.class);
    if (!(paramContext instanceof Activity))
      localIntent.addFlags(268435456);
    localIntent.putExtra("extra_from_mm", false);
    localIntent.putExtra("extra_launch_parcel", paramLaunchParcel);
    localIntent.putExtra("extra_launch_source_context", paramContext.getClass().getName());
    int j;
    if (!(paramContext instanceof AppBrandUI))
      j = i;
    while (true)
    {
      if (j != 0)
        localIntent.putExtra("extra_result_receiver", new ClientLaunchEntry.1(this, new Handler(Looper.getMainLooper()), paramContext));
      paramContext.startActivity(localIntent);
      AppMethodBeat.o(132056);
      return true;
      j = i;
      if (!(paramContext instanceof AppBrandPluginUI))
      {
        j = i;
        if (!(paramContext instanceof AppBrandInToolsUI))
          if (paramLaunchParcel.hgF != null)
          {
            j = i;
            if (paramLaunchParcel.hgF.hgQ == 1);
          }
          else
          {
            j = i;
            if (paramLaunchParcel.ijy.scene != 1085)
              j = 1;
          }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.launching.precondition.b
 * JD-Core Version:    0.6.2
 */