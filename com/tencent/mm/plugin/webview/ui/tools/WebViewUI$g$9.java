package com.tencent.mm.plugin.webview.ui.tools;

import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pointers.PBool;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.xweb.h;

final class WebViewUI$g$9
  implements DialogInterface.OnDismissListener
{
  WebViewUI$g$9(WebViewUI.g paramg, PBool paramPBool, h paramh)
  {
  }

  public final void onDismiss(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(7909);
    ab.d("MicroMsg.WebViewUI", "onJsConfirm, onDismiss");
    if (!this.uxG.value)
      this.uxH.cancel();
    AppMethodBeat.o(7909);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.WebViewUI.g.9
 * JD-Core Version:    0.6.2
 */