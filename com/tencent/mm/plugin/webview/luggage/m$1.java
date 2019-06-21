package com.tencent.mm.plugin.webview.luggage;

import com.tencent.luggage.d.k;
import com.tencent.luggage.g.d;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class m$1
  implements Runnable
{
  m$1(k paramk)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(6215);
    try
    {
      this.mTO.destroy();
      AppMethodBeat.o(6215);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        d.printErrStackTrace("MicroMsg.LuggageWebCoreStash", localException, "", new Object[0]);
        AppMethodBeat.o(6215);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.luggage.m.1
 * JD-Core Version:    0.6.2
 */