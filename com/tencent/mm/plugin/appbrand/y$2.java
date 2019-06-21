package com.tencent.mm.plugin.appbrand;

import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cj.c;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.xweb.WebView;
import com.tencent.xweb.WebView.d;

final class y$2
  implements Runnable
{
  y$2(Runnable paramRunnable)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(129137);
    al.Ma(-2);
    if (WebView.hasInited())
    {
      this.gQp.run();
      AppMethodBeat.o(129137);
    }
    while (true)
    {
      return;
      ak localak = new ak(Looper.myLooper());
      c.a(WebView.d.ANb, new y.2.1(this, localak));
      AppMethodBeat.o(129137);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.y.2
 * JD-Core Version:    0.6.2
 */