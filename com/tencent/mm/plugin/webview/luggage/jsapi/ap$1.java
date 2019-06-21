package com.tencent.mm.plugin.webview.luggage.jsapi;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.widget.snackbar.a.c;

final class ap$1
  implements a.c
{
  ap$1(ap paramap, bc.a parama)
  {
  }

  public final void cLd()
  {
  }

  public final void onHide()
  {
    AppMethodBeat.i(6367);
    ab.d("MicroMsg.JsApiSendAppMessage", "onHide");
    this.kOw.d(null, null);
    AppMethodBeat.o(6367);
  }

  public final void onShow()
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.luggage.jsapi.ap.1
 * JD-Core Version:    0.6.2
 */