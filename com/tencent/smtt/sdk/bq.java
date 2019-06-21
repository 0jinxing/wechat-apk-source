package com.tencent.smtt.sdk;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.smtt.sdk.a.d;

class bq
  implements android.webkit.DownloadListener
{
  bq(WebView paramWebView, DownloadListener paramDownloadListener)
  {
  }

  public void onDownloadStart(String paramString1, String paramString2, String paramString3, String paramString4, long paramLong)
  {
    AppMethodBeat.i(64835);
    if (this.a == null)
      if (WebView.a(this.b) == null)
      {
        paramString2 = null;
        if ((paramString2 == null) || (!"com.tencent.mm".equals(paramString2.packageName)))
          d.a(WebView.a(this.b), paramString1, null, null);
        AppMethodBeat.o(64835);
      }
    while (true)
    {
      return;
      paramString2 = WebView.a(this.b).getApplicationInfo();
      break;
      this.a.onDownloadStart(paramString1, paramString2, paramString3, paramString4, paramLong);
      AppMethodBeat.o(64835);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.smtt.sdk.bq
 * JD-Core Version:    0.6.2
 */