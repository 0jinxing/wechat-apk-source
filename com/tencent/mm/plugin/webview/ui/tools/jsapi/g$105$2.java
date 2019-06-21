package com.tencent.mm.plugin.webview.ui.tools.jsapi;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class g$105$2
  implements DialogInterface.OnClickListener
{
  g$105$2(g.105 param105)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(9178);
    g.a(this.uIm.uHd, this.uIm.uqf, "nfcCheckState:nfc_wechat_setting_off", null);
    AppMethodBeat.o(9178);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.jsapi.g.105.2
 * JD-Core Version:    0.6.2
 */