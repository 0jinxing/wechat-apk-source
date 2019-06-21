package com.tencent.mm.plugin.appbrand;

import android.graphics.Bitmap;
import com.tencent.luggage.sdk.config.AppBrandInitConfigLU;
import com.tencent.magicbrush.MBRuntime;
import com.tencent.magicbrush.handler.MBCanvasHandler;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC;
import com.tencent.mm.plugin.appbrand.page.as;
import com.tencent.mm.plugin.appbrand.page.q;
import com.tencent.mm.plugin.appbrand.ui.e;
import com.tencent.mm.sdk.platformtools.ab;

public final class ad
{
  static Bitmap n(i parami)
  {
    AppMethodBeat.i(129154);
    if (p.k(parami))
      parami = ((com.tencent.mm.plugin.appbrand.game.b)parami.xT()).getMBRuntime();
    while (true)
    {
      try
      {
        parami = parami.getCanvasHandler().a(null, false);
        AppMethodBeat.o(129154);
        return parami;
      }
      catch (Exception parami)
      {
        parami = null;
        continue;
      }
      parami = as.cq(parami.asV().getCurrentPage());
      AppMethodBeat.o(129154);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ad
 * JD-Core Version:    0.6.2
 */