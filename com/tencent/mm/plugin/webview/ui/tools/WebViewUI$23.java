package com.tencent.mm.plugin.webview.ui.tools;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.qg;
import com.tencent.mm.plugin.webview.stub.d;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.ab;

final class WebViewUI$23 extends c<qg>
{
  WebViewUI$23(WebViewUI paramWebViewUI)
  {
    AppMethodBeat.i(7843);
    this.xxI = qg.class.getName().hashCode();
    AppMethodBeat.o(7843);
  }

  private boolean daK()
  {
    AppMethodBeat.i(7844);
    if (this.uxp.icy == null)
    {
      ab.e("MicroMsg.WebViewUI", "Cli Event, invoker is null");
      AppMethodBeat.o(7844);
    }
    while (true)
    {
      return false;
      if ((this.uxp.uwM == null) || (this.uxp.uwM.length() == 0))
      {
        ab.e("MicroMsg.WebViewUI", "Cli Event, tid is null");
        AppMethodBeat.o(7844);
        continue;
      }
      try
      {
        long l = System.currentTimeMillis();
        ab.i("MicroMsg.WebViewUI", "Cli Event, tid = %s, stime = %d, etime = %d", new Object[] { this.uxp.uwM, Long.valueOf(this.uxp.uwN), Long.valueOf(l) });
        Bundle localBundle = new android/os/Bundle;
        localBundle.<init>();
        String str = new java/lang/String;
        str.<init>(this.uxp.uwM);
        localBundle.putString("service_click_tid", str);
        localBundle.putLong("service_click_stime", this.uxp.uwN);
        localBundle.putLong("service_click_etime", l);
        this.uxp.icy.s(2836, localBundle);
        this.uxp.uwM = null;
        AppMethodBeat.o(7844);
      }
      catch (Exception localException)
      {
        while (true)
          ab.e("MicroMsg.WebViewUI", "Cli Event Exception, msg = %s", new Object[] { localException.getMessage() });
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.WebViewUI.23
 * JD-Core Version:    0.6.2
 */