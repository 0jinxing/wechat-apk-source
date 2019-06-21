package com.tencent.mm.plugin.webview.ui.tools.jsapi;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.at.c;
import com.tencent.mm.at.o;

final class g$12
  implements DialogInterface.OnCancelListener
{
  g$12(g paramg, String paramString, i parami)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(9057);
    o.ahk().rZ(this.fEJ);
    g.a(this.uHd, this.uqf, "send_service_app_msg:fail", null);
    AppMethodBeat.o(9057);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.jsapi.g.12
 * JD-Core Version:    0.6.2
 */