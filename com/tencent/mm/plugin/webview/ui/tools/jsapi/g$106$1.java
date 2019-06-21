package com.tencent.mm.plugin.webview.ui.tools.jsapi;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class g$106$1
  implements DialogInterface.OnClickListener
{
  g$106$1(g.106 param106)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(9180);
    g.i(this.uIn.uHd).startActivity(new Intent("android.settings.NFC_SETTINGS"));
    g.a(this.uIn.uHd, this.uIn.uqf, "nfcCheckState:nfc_off", null);
    AppMethodBeat.o(9180);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.jsapi.g.106.1
 * JD-Core Version:    0.6.2
 */