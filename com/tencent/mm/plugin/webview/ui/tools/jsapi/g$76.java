package com.tencent.mm.plugin.webview.ui.tools.jsapi;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.model.aj;
import com.tencent.mm.plugin.webview.model.d.b;

final class g$76
  implements DialogInterface.OnCancelListener
{
  g$76(g paramg, d.b paramb, String paramString, i parami)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(9139);
    com.tencent.mm.plugin.webview.modeltools.g.cYE().a(this.uHX);
    com.tencent.mm.plugin.webview.modeltools.g.cYE();
    aj.aet(this.uHW);
    g.a(this.uHd, this.uqf, "downloadImage:fail", null);
    AppMethodBeat.o(9139);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.jsapi.g.76
 * JD-Core Version:    0.6.2
 */