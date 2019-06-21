package com.tencent.mm.plugin.webview.ui.tools.jsapi;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class g$18
  implements DialogInterface.OnCancelListener
{
  g$18(g paramg, com.tencent.mm.plugin.webview.model.p paramp)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(9062);
    com.tencent.mm.kernel.g.Rg().c(this.uHu);
    AppMethodBeat.o(9062);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.jsapi.g.18
 * JD-Core Version:    0.6.2
 */