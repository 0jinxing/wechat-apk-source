package com.tencent.mm.plugin.webview.ui.tools;

import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pointers.PBool;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.xweb.h;

final class WebViewUI$g$3
  implements DialogInterface.OnDismissListener
{
  WebViewUI$g$3(WebViewUI.g paramg, PBool paramPBool, h paramh)
  {
  }

  public final void onDismiss(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(7903);
    ab.d("MicroMsg.WebViewUI", "onJsAlert, onDismiss");
    if (!this.uxG.value)
      this.uxH.cancel();
    AppMethodBeat.o(7903);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.WebViewUI.g.3
 * JD-Core Version:    0.6.2
 */