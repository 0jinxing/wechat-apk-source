package com.tencent.mm.plugin.webview.ui.tools;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.webkit.GeolocationPermissions.Callback;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.model.aq;
import com.tencent.mm.sdk.platformtools.ab;

final class WebViewUI$g$1
  implements DialogInterface.OnClickListener
{
  WebViewUI$g$1(WebViewUI.g paramg, GeolocationPermissions.Callback paramCallback, String paramString)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(7901);
    ab.i("MicroMsg.WebViewUI", "onGeolocationPermissionsShowPrompt ok");
    this.uxD.invoke(this.uxE, true, true);
    g.a(this.uxF.uxp.icy, 14340, new Object[] { this.uxF.uxp.cOG, this.uxF.uxp.dae(), Integer.valueOf(this.uxF.uxp.cSQ), this.uxF.uxp.getIntent().getStringExtra("geta8key_username"), Integer.valueOf(aq.aEn()), Integer.valueOf(1), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0) });
    AppMethodBeat.o(7901);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.WebViewUI.g.1
 * JD-Core Version:    0.6.2
 */