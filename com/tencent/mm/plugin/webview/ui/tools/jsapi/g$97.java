package com.tencent.mm.plugin.webview.ui.tools.jsapi;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.model.aj;
import com.tencent.mm.plugin.webview.model.d.b;

final class g$97
  implements DialogInterface.OnCancelListener
{
  g$97(g paramg, d.b paramb, String paramString, i parami)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(9165);
    com.tencent.mm.plugin.webview.modeltools.g.cYE().a(this.uHX);
    com.tencent.mm.plugin.webview.modeltools.g.cYE();
    aj.yC(this.ukG);
    g.a(this.uHd, this.uqf, "uploadVoice:fail", null);
    AppMethodBeat.o(9165);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.jsapi.g.97
 * JD-Core Version:    0.6.2
 */