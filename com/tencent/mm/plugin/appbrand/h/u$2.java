package com.tencent.mm.plugin.appbrand.h;

import android.webkit.ValueCallback;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.xweb.c.f;
import com.tencent.xweb.i;
import java.net.URL;

final class u$2
  implements Runnable
{
  u$2(u paramu, URL paramURL, String paramString, ValueCallback paramValueCallback)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(117455);
    i locali = u.a(this.ifi);
    URL localURL = this.ifj;
    String str = this.bOU;
    ValueCallback localValueCallback = this.ieW;
    if (!locali.iff)
      locali.AMb.evaluateJavascript(str, localValueCallback, localURL);
    AppMethodBeat.o(117455);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.h.u.2
 * JD-Core Version:    0.6.2
 */