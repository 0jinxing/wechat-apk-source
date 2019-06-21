package com.tencent.mm.plugin.webview;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.vz;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.brandservice.a.b;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.xweb.WebView.c;

final class PluginWebView$1
  implements WebView.c
{
  PluginWebView$1(PluginWebView paramPluginWebView)
  {
  }

  public final void BH()
  {
    AppMethodBeat.i(5613);
    ab.i("MPToolsMinifiedBootStep", "onCoreInitFailed");
    vz localvz = new vz();
    localvz.cTk.success = false;
    a.xxA.m(localvz);
    AppMethodBeat.o(5613);
  }

  public final void onCoreInitFinished()
  {
    AppMethodBeat.i(5612);
    ab.i("MPToolsMinifiedBootStep", "onCoreInitFinished");
    vz localvz = new vz();
    localvz.cTk.success = true;
    a.xxA.m(localvz);
    if (((b)g.K(b.class)).rW(20))
      ((b)g.K(b.class)).aVR();
    AppMethodBeat.o(5612);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.PluginWebView.1
 * JD-Core Version:    0.6.2
 */