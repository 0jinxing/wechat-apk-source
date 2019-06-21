package com.tencent.mm.plugin.webview.ui.tools.jsapi;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;

final class g$63
  implements DialogInterface.OnClickListener
{
  g$63(g paramg, String paramString1, String paramString2, String paramString3, i parami)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(9124);
    h.pYm.e(14217, new Object[] { this.val$appId, Integer.valueOf(6), this.utm, this.val$url, Integer.valueOf(3) });
    paramDialogInterface.dismiss();
    g.a(this.uHd, this.uqf, "doResumeDownloadTask:fail_network_not_wifi", null);
    AppMethodBeat.o(9124);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.jsapi.g.63
 * JD-Core Version:    0.6.2
 */