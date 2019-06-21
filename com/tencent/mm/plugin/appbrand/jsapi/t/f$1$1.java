package com.tencent.mm.plugin.appbrand.jsapi.t;

import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.page.w;
import com.tencent.mm.ui.widget.MMWebView;

final class f$1$1
  implements com.tencent.mm.plugin.appbrand.widget.actionbar.a
{
  f$1$1(f.1 param1)
  {
  }

  public final void aGw()
  {
    AppMethodBeat.i(131668);
    a locala = this.icY.hIw.aJS();
    if (locala != null)
      locala.fow.getView().scrollTo(locala.fow.getWebScrollX(), 0);
    AppMethodBeat.o(131668);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.t.f.1.1
 * JD-Core Version:    0.6.2
 */