package com.tencent.mm.plugin.webview.ui.tools;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.at;

final class WebViewUI$h$3
  implements Runnable
{
  WebViewUI$h$3(WebViewUI.h paramh, String paramString, int paramInt)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(7929);
    h localh = h.pYm;
    String str = this.uxK;
    int i = this.gIb;
    Object localObject = ah.getContext();
    if (at.isWifi((Context)localObject))
      localObject = "wifi";
    while (true)
    {
      localh.e(17082, new Object[] { str, Integer.valueOf(i), localObject, WebViewUI.h.afT("mp.weixin.qq.com") });
      AppMethodBeat.o(7929);
      return;
      if (at.is4G((Context)localObject))
        localObject = "4g";
      else if (at.is3G((Context)localObject))
        localObject = "3g";
      else if (at.is2G((Context)localObject))
        localObject = "2g";
      else
        localObject = "none";
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.WebViewUI.h.3
 * JD-Core Version:    0.6.2
 */