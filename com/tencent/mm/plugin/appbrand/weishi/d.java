package com.tencent.mm.plugin.appbrand.weishi;

import android.app.Activity;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig;

public final class d
{
  public static boolean b(Activity paramActivity, AppBrandInitConfig paramAppBrandInitConfig)
  {
    boolean bool = false;
    AppMethodBeat.i(133640);
    if ("wxfe02ecfe70800f46".equalsIgnoreCase(paramAppBrandInitConfig.appId))
    {
      paramActivity.overridePendingTransition(0, 0);
      bool = true;
      AppMethodBeat.o(133640);
    }
    while (true)
    {
      return bool;
      AppMethodBeat.o(133640);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.weishi.d
 * JD-Core Version:    0.6.2
 */