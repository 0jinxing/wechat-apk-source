package com.tencent.mm.plugin.webview.ui.tools.jsapi;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.protocal.JsapiPermissionWrapper;

final class g$62
  implements DialogInterface.OnClickListener
{
  g$62(g paramg, String paramString1, String paramString2, String paramString3, i parami, JsapiPermissionWrapper paramJsapiPermissionWrapper)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(9123);
    h.pYm.e(14217, new Object[] { this.val$appId, Integer.valueOf(5), this.utm, this.val$url, Integer.valueOf(3) });
    g.et(this.uHd, this.uqf);
    paramDialogInterface.dismiss();
    AppMethodBeat.o(9123);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.jsapi.g.62
 * JD-Core Version:    0.6.2
 */