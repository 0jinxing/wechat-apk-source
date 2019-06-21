package com.tencent.mm.plugin.appbrand;

import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.l.n;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

final class y$1
  implements Runnable
{
  public final void run()
  {
    AppMethodBeat.i(129134);
    long l = bo.anU();
    new n().init();
    ab.d("MicroMsg.AppBrandXWebPreloader", "x509 init cost %d", new Object[] { Long.valueOf(bo.anU() - l) });
    y.access$000();
    Looper.myLooper().quit();
    AppMethodBeat.o(129134);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.y.1
 * JD-Core Version:    0.6.2
 */