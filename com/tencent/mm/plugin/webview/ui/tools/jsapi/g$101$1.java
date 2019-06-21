package com.tencent.mm.plugin.webview.ui.tools.jsapi;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.fq;
import com.tencent.mm.sdk.b.a;

final class g$101$1
  implements DialogInterface.OnCancelListener
{
  g$101$1(g.101 param101)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(9169);
    paramDialogInterface = new fq();
    paramDialogInterface.czB.czE = 3;
    a.xxA.m(paramDialogInterface);
    g.a(this.uIk.uHd, this.uIk.uqf, "translateVoice:fail", null);
    AppMethodBeat.o(9169);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.jsapi.g.101.1
 * JD-Core Version:    0.6.2
 */