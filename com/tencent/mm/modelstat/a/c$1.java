package com.tencent.mm.modelstat.a;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

public final class c$1
  implements Runnable
{
  public c$1(Bundle paramBundle)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(78810);
    try
    {
      String str = this.cgJ.getString("mm_event_class");
      a locala = (a)Class.forName(str).newInstance();
      ab.i("MicroMsg.WebViewMMReportUtil", "webview callback report className[%s]", new Object[] { str });
      locala.callback(this.cgJ);
      AppMethodBeat.o(78810);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.WebViewMMReportUtil", localException, "receiveWebViewCallback error", new Object[0]);
        AppMethodBeat.o(78810);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelstat.a.c.1
 * JD-Core Version:    0.6.2
 */