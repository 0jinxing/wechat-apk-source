package com.tencent.mm.plugin.appbrand.h;

import android.webkit.ValueCallback;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.xweb.c.f;
import com.tencent.xweb.i;

final class u$1
  implements Runnable
{
  u$1(u paramu, String paramString, ValueCallback paramValueCallback)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(117454);
    i locali = u.a(this.ifi);
    String str = this.bOU;
    ValueCallback localValueCallback = this.ieW;
    if (!locali.iff)
      locali.AMb.evaluateJavascript(str, localValueCallback);
    AppMethodBeat.o(117454);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.h.u.1
 * JD-Core Version:    0.6.2
 */