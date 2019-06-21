package com.tencent.mm.plugin.appbrand.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class c$3
  implements Runnable
{
  c$3(c paramc)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(132936);
    c.f(this.iGs);
    ab.i("MicroMsg.AppBrandGameUILoadingSplash", "mCustomSplashScreenDelayTimeEnd");
    if (c.g(this.iGs))
      c.d(this.iGs);
    AppMethodBeat.o(132936);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.c.3
 * JD-Core Version:    0.6.2
 */