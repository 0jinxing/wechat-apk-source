package com.tencent.mm.plugin.appbrand;

import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.xweb.WebView.c;

final class y$2$1
  implements WebView.c
{
  y$2$1(y.2 param2, ak paramak)
  {
  }

  public final void BH()
  {
    AppMethodBeat.i(129136);
    y.access$100();
    Looper.myLooper().quit();
    AppMethodBeat.o(129136);
  }

  public final void onCoreInitFinished()
  {
    AppMethodBeat.i(129135);
    this.gQq.post(this.gQr.gQp);
    AppMethodBeat.o(129135);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.y.2.1
 * JD-Core Version:    0.6.2
 */