package com.tencent.mm.plugin.appbrand.launching;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.m.e;
import com.tencent.mm.m.g;
import com.tencent.mm.plugin.appbrand.v;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;

final class ad
{
  final String appId;

  ad(String paramString)
  {
    this.appId = paramString;
  }

  final boolean aHv()
  {
    boolean bool = true;
    AppMethodBeat.i(131945);
    if (g.Nu().getInt("WeAppForbiddenSwitch", 0) == 1)
    {
      ab.i("MicroMsg.AppBrand.PreLaunchCheckForOversea", "startApp, WeAppForbiddenSwitch == 1, go webview, appId %s", new Object[] { this.appId });
      Intent localIntent = new Intent().putExtra("rawUrl", v.xf(this.appId)).putExtra("forceHideShare", true);
      Context localContext = ah.getContext();
      if (!(localContext instanceof Activity))
        localIntent.addFlags(268435456);
      d.b(localContext, "webview", ".ui.tools.WebViewUI", localIntent);
      AppMethodBeat.o(131945);
    }
    while (true)
    {
      return bool;
      AppMethodBeat.o(131945);
      bool = false;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.launching.ad
 * JD-Core Version:    0.6.2
 */