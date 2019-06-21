package com.tencent.mm.plugin.webview.ui.tools.jsapi;

import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Map;

final class g$39
  implements DialogInterface.OnDismissListener
{
  g$39(g paramg, i parami, Map paramMap)
  {
  }

  public final void onDismiss(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(9092);
    g.a(this.uHd, this.uqf, this.uqf.uIJ + ":dismiss", this.uHA);
    AppMethodBeat.o(9092);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.jsapi.g.39
 * JD-Core Version:    0.6.2
 */