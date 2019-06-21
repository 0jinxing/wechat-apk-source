package com.tencent.mm.plugin.webview.ui.tools;

import android.content.Intent;
import android.net.Uri;
import android.webkit.DownloadListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.webview.ui.tools.jsapi.a;
import com.tencent.mm.protocal.JsapiPermissionWrapper;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Set;
import java.util.regex.Pattern;

final class WebViewUI$18
  implements DownloadListener
{
  WebViewUI$18(WebViewUI paramWebViewUI)
  {
  }

  public final void onDownloadStart(String paramString1, String paramString2, String paramString3, String paramString4, long paramLong)
  {
    int i = 1;
    AppMethodBeat.i(7837);
    ab.i("MicroMsg.WebViewUI", "edw onDownloadStart, url = " + paramString1 + ", mimetype = " + paramString4 + ", userAgent = " + paramString2);
    int j = this.uxp.getIntent().getIntExtra("key_download_restrict", 0);
    paramString2 = this.uxp.getIntent().getStringExtra("key_function_id");
    if (!bo.isNullOrNil(paramString2))
      h.pYm.e(14596, new Object[] { paramString2, Integer.valueOf(j), Integer.valueOf(0) });
    if (j == 1)
    {
      ab.e("MicroMsg.WebViewUI", "not allow download file : %s", new Object[] { paramString1 });
      AppMethodBeat.o(7837);
    }
    while (true)
    {
      return;
      if ((paramString4 != null) && (paramString4.equalsIgnoreCase("application/vnd.android.package-archive")))
      {
        ab.v("MicroMsg.WebViewUI", "edw onDownloadStart, report download url: %s", new Object[] { paramString1 });
        g.a(this.uxp.icy, 11154, new Object[] { paramString1 });
      }
      if ((this.uxp.icz != null) && (this.uxp.icz.cZS() != null))
        break;
      ab.e("MicroMsg.WebViewUI", "onDownloadStart fail, wvPerm is null");
      AppMethodBeat.o(7837);
    }
    int k;
    if (paramString4 != null)
    {
      boolean bool1 = WebViewUI.f(this.uxp);
      ab.i("MicroMsg.WebViewUI", "onDownloadStart configOpen:%s", new Object[] { Boolean.valueOf(bool1) });
      paramString2 = WebViewUI.afR(paramString3);
      if ((paramString2 != null) && (Pattern.matches("(?i).*\\.(doc|ppt|xls|docx|pptx|xlsx|wps|dps|et|txt|pdf)$", paramString2)))
      {
        k = 1;
        label288: boolean bool2 = a.uFa.contains(paramString4.toLowerCase());
        if (!bool1)
          break label381;
        j = i;
        if (k == 0)
        {
          if (!bool2)
            break label381;
          j = i;
        }
      }
    }
    while (true)
    {
      while (true)
      {
        if ((j == 0) && (!this.uxp.icz.cZS().jB(24)) && (!WebViewUI.g(this.uxp)))
        {
          ab.e("MicroMsg.WebViewUI", "onDownloadStart permission fail");
          AppMethodBeat.o(7837);
          break;
          k = 0;
          break label288;
          label381: j = 0;
          continue;
        }
        paramString1 = new Intent("android.intent.action.VIEW", Uri.parse(paramString1));
        paramString1.addFlags(268435456);
        try
        {
          this.uxp.startActivity(paramString1);
          AppMethodBeat.o(7837);
        }
        catch (Exception paramString1)
        {
          ab.e("MicroMsg.WebViewUI", "startActivity fail, e = " + paramString1.getMessage());
          AppMethodBeat.o(7837);
        }
      }
      break;
      j = 0;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.WebViewUI.18
 * JD-Core Version:    0.6.2
 */