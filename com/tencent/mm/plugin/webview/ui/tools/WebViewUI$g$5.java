package com.tencent.mm.plugin.webview.ui.tools;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class WebViewUI$g$5
  implements DialogInterface.OnClickListener
{
  WebViewUI$g$5(WebViewUI.g paramg, String paramString, com.tencent.xweb.h paramh)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(7905);
    com.tencent.mm.plugin.report.service.h.pYm.e(11683, new Object[] { this.val$url, Integer.valueOf(1), Integer.valueOf(WebViewUI.w(this.uxF.uxp)) });
    this.uxH.cancel();
    if (paramDialogInterface != null)
      paramDialogInterface.dismiss();
    this.uxF.uxp.finish();
    AppMethodBeat.o(7905);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.WebViewUI.g.5
 * JD-Core Version:    0.6.2
 */