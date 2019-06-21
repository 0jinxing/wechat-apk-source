package com.tencent.mm.plugin.webview.ui.tools.jsapi;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.at.c;
import com.tencent.mm.at.o;

final class g$15
  implements DialogInterface.OnCancelListener
{
  g$15(g paramg, String paramString)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(9059);
    o.ahk().rZ(this.fEJ);
    g.a(this.uHd, g.j(this.uHd), "send_app_msg:cancel", null);
    AppMethodBeat.o(9059);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.jsapi.g.15
 * JD-Core Version:    0.6.2
 */