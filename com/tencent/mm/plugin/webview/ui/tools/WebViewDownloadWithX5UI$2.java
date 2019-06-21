package com.tencent.mm.plugin.webview.ui.tools;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.f;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.at;

final class WebViewDownloadWithX5UI$2
  implements View.OnClickListener
{
  WebViewDownloadWithX5UI$2(WebViewDownloadWithX5UI paramWebViewDownloadWithX5UI, long paramLong, String paramString1, String paramString2)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(7615);
    if (!at.isNetworkConnected(WebViewDownloadWithX5UI.a(this.utu)))
    {
      Toast.makeText(WebViewDownloadWithX5UI.a(this.utu), this.utu.getString(2131300251), 0).show();
      ab.i("MicroMsg.WebViewDownloadWithX5UI", "startDownload fail, network not ready");
      AppMethodBeat.o(7615);
    }
    while (true)
    {
      return;
      if (!g.RP().isSDCardAvailable())
      {
        Toast.makeText(WebViewDownloadWithX5UI.a(this.utu), this.utu.getString(2131300255), 0).show();
        ab.i("MicroMsg.WebViewDownloadWithX5UI", "startDownload fail, sdcard not ready");
        AppMethodBeat.o(7615);
      }
      else if ((this.utv > 0L) && (!f.eW(this.utv)))
      {
        Toast.makeText(WebViewDownloadWithX5UI.a(this.utu), this.utu.getString(2131300252), 0).show();
        ab.i("MicroMsg.WebViewDownloadWithX5UI", "startDownload fail, not enough space, require size = " + this.utv);
        AppMethodBeat.o(7615);
      }
      else if (at.isWifi(WebViewDownloadWithX5UI.a(this.utu)))
      {
        WebViewDownloadWithX5UI.a(this.utu, this.val$url, this.utm);
        AppMethodBeat.o(7615);
      }
      else
      {
        com.tencent.mm.plugin.report.service.h.pYm.e(14217, new Object[] { "", Integer.valueOf(4), this.utm, this.val$url, Integer.valueOf(1) });
        com.tencent.mm.ui.base.h.a(this.utu, this.utu.getString(2131305542), this.utu.getString(2131305543), this.utu.getString(2131305537), this.utu.getString(2131296868), false, new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            AppMethodBeat.i(7613);
            com.tencent.mm.plugin.report.service.h.pYm.e(14217, new Object[] { "", Integer.valueOf(5), WebViewDownloadWithX5UI.2.this.utm, WebViewDownloadWithX5UI.2.this.val$url, Integer.valueOf(1) });
            WebViewDownloadWithX5UI.a(WebViewDownloadWithX5UI.2.this.utu, WebViewDownloadWithX5UI.2.this.val$url, WebViewDownloadWithX5UI.2.this.utm);
            paramAnonymousDialogInterface.dismiss();
            AppMethodBeat.o(7613);
          }
        }
        , new WebViewDownloadWithX5UI.2.2(this), 2131690683);
        AppMethodBeat.o(7615);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.WebViewDownloadWithX5UI.2
 * JD-Core Version:    0.6.2
 */