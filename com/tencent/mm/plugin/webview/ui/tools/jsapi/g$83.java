package com.tencent.mm.plugin.webview.ui.tools.jsapi;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.model.aj;
import com.tencent.mm.plugin.webview.model.d.b;

final class g$83
  implements DialogInterface.OnCancelListener
{
  g$83(g paramg, d.b paramb, String paramString1, i parami, String paramString2)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(9147);
    com.tencent.mm.plugin.webview.modeltools.g.cYE().a(this.uHX);
    com.tencent.mm.plugin.webview.modeltools.g.cYE();
    aj.yC(this.ukG);
    g.a(this.uHd, this.uqf, this.ioH + ":fail", null);
    AppMethodBeat.o(9147);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.jsapi.g.83
 * JD-Core Version:    0.6.2
 */