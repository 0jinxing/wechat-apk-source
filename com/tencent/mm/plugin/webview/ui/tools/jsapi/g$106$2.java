package com.tencent.mm.plugin.webview.ui.tools.jsapi;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class g$106$2
  implements DialogInterface.OnClickListener
{
  g$106$2(g.106 param106)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(9181);
    g.a(this.uIn.uHd, this.uIn.uqf, "nfcCheckState:nfc_off", null);
    AppMethodBeat.o(9181);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.jsapi.g.106.2
 * JD-Core Version:    0.6.2
 */