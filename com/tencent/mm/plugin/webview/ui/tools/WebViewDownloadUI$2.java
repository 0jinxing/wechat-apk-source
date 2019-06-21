package com.tencent.mm.plugin.webview.ui.tools;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.at;

final class WebViewDownloadUI$2
  implements View.OnClickListener
{
  WebViewDownloadUI$2(WebViewDownloadUI paramWebViewDownloadUI, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, String paramString8, int paramInt)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(7595);
    ab.i("MicroMsg.WebViewDownloadUI", "downloadOpBtn.onClick state=%s", new Object[] { WebViewDownloadUI.a(this.utk) });
    switch (WebViewDownloadUI.5.utp[WebViewDownloadUI.a(this.utk).ordinal()])
    {
    default:
      ab.e("MicroMsg.WebViewDownloadUI", "downloadOpBtn.onClick unexpected download state");
      AppMethodBeat.o(7595);
    case 1:
    }
    while (true)
    {
      return;
      if (!at.isNetworkConnected(WebViewDownloadUI.b(this.utk)))
      {
        Toast.makeText(WebViewDownloadUI.b(this.utk), this.utk.getString(2131300251), 0).show();
        ab.i("MicroMsg.WebViewDownloadUI", "startDownload fail, network not ready");
        AppMethodBeat.o(7595);
      }
      else if (at.isWifi(WebViewDownloadUI.b(this.utk)))
      {
        WebViewDownloadUI.a(this.utk, this.val$url, this.iRf, this.hxj, this.val$appId, this.utl, this.utm, this.hxx, this.val$packageName, this.utn);
        AppMethodBeat.o(7595);
      }
      else
      {
        com.tencent.mm.plugin.report.service.h.pYm.e(14217, new Object[] { this.val$appId, Integer.valueOf(4), this.utm, this.val$url, Integer.valueOf(0) });
        com.tencent.mm.ui.base.h.a(this.utk, this.utk.getString(2131305542), this.utk.getString(2131305543), this.utk.getString(2131305537), this.utk.getString(2131296868), false, new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            AppMethodBeat.i(7593);
            com.tencent.mm.plugin.report.service.h.pYm.e(14217, new Object[] { WebViewDownloadUI.2.this.val$appId, Integer.valueOf(5), WebViewDownloadUI.2.this.utm, WebViewDownloadUI.2.this.val$url, Integer.valueOf(0) });
            WebViewDownloadUI.a(WebViewDownloadUI.2.this.utk, WebViewDownloadUI.2.this.val$url, WebViewDownloadUI.2.this.iRf, WebViewDownloadUI.2.this.hxj, WebViewDownloadUI.2.this.val$appId, WebViewDownloadUI.2.this.utl, WebViewDownloadUI.2.this.utm, WebViewDownloadUI.2.this.hxx, WebViewDownloadUI.2.this.val$packageName, WebViewDownloadUI.2.this.utn);
            paramAnonymousDialogInterface.dismiss();
            AppMethodBeat.o(7593);
          }
        }
        , new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            AppMethodBeat.i(7594);
            com.tencent.mm.plugin.report.service.h.pYm.e(14217, new Object[] { WebViewDownloadUI.2.this.val$appId, Integer.valueOf(6), WebViewDownloadUI.2.this.utm, WebViewDownloadUI.2.this.val$url, Integer.valueOf(0) });
            paramAnonymousDialogInterface.dismiss();
            AppMethodBeat.o(7594);
          }
        }
        , 2131690683);
        AppMethodBeat.o(7595);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.WebViewDownloadUI.2
 * JD-Core Version:    0.6.2
 */