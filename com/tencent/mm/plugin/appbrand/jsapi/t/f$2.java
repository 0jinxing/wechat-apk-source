package com.tencent.mm.plugin.appbrand.jsapi.t;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.f.a;
import com.tencent.mm.plugin.appbrand.report.model.p;
import com.tencent.mm.ui.widget.MMWebView;

final class f$2
  implements f.a
{
  f$2(f paramf, a parama)
  {
  }

  public final boolean wY()
  {
    boolean bool = true;
    AppMethodBeat.i(131670);
    a locala = this.icZ;
    if (locala.getWebView().canGoBack())
    {
      locala.getReporter().a(locala.hyU, true);
      locala.getWebView().goBack();
      locala.icn = true;
      AppMethodBeat.o(131670);
    }
    while (true)
    {
      return bool;
      locala.getReporter().a(locala.hyU, false);
      AppMethodBeat.o(131670);
      bool = false;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.t.f.2
 * JD-Core Version:    0.6.2
 */