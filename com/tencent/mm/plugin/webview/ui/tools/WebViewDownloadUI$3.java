package com.tencent.mm.plugin.webview.ui.tools;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.downloader.model.d;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;

final class WebViewDownloadUI$3
  implements View.OnClickListener
{
  WebViewDownloadUI$3(WebViewDownloadUI paramWebViewDownloadUI, String paramString1, String paramString2, String paramString3)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(7596);
    ab.i("MicroMsg.WebViewDownloadUI", "doCancelDownloadTask, downloadId = %d, state=%s", new Object[] { Long.valueOf(WebViewDownloadUI.c(this.utk)), WebViewDownloadUI.a(this.utk) });
    h.pYm.e(14217, new Object[] { this.val$appId, Integer.valueOf(3), this.utm, this.val$url, Integer.valueOf(0) });
    if (WebViewDownloadUI.c(this.utk) <= 0L)
    {
      ab.e("MicroMsg.WebViewDownloadUI", "doCancelDownloadTask fail, unexpected branch! ");
      Toast.makeText(this.utk.mController.ylL, this.utk.getString(2131305539), 1).show();
      AppMethodBeat.o(7596);
    }
    while (true)
    {
      return;
      int i = d.bij().hl(WebViewDownloadUI.c(this.utk));
      ab.i("MicroMsg.WebViewDownloadUI", "doCancelDownloadTask, ret = %d", new Object[] { Integer.valueOf(i) });
      if (i <= 0)
        break;
      Toast.makeText(this.utk.mController.ylL, this.utk.getString(2131305540), 1).show();
      this.utk.finish();
      AppMethodBeat.o(7596);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.WebViewDownloadUI.3
 * JD-Core Version:    0.6.2
 */