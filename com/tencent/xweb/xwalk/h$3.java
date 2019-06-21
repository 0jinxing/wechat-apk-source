package com.tencent.xweb.xwalk;

import android.webkit.ValueCallback;
import com.tencent.matrix.trace.core.AppMethodBeat;
import org.xwalk.core.XWalkV8;

final class h$3
  implements Runnable
{
  h$3(h paramh, String paramString, ValueCallback paramValueCallback)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(85239);
    if (this.ASe.ASa == null)
      AppMethodBeat.o(85239);
    while (true)
    {
      return;
      this.ASe.ASa.evaluateJavascript(this.ASf, this.ASg);
      AppMethodBeat.o(85239);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.xweb.xwalk.h.3
 * JD-Core Version:    0.6.2
 */