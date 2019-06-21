package com.tencent.mm.plugin.webview.ui.tools.jsapi;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.widget.snackbar.a.c;

final class g$70
  implements a.c
{
  g$70(g paramg)
  {
  }

  public final void cLd()
  {
  }

  public final void onHide()
  {
    AppMethodBeat.i(9132);
    g.a(this.uHd, g.j(this.uHd), "send_app_msg:ok", null);
    AppMethodBeat.o(9132);
  }

  public final void onShow()
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.jsapi.g.70
 * JD-Core Version:    0.6.2
 */