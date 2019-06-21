package com.tencent.mm.plugin.websearch.api;

import android.content.Context;
import android.net.Uri;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.e;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.pluginsdk.ui.tools.u;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.widget.MMWebView;
import com.tencent.xweb.b;
import com.tencent.xweb.p;
import com.tencent.xweb.s;
import java.io.File;
import java.util.List;

final class ak$7
  implements Runnable
{
  ak$7(ak paramak, String paramString)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(124197);
    ak localak = this.uaN;
    String str = this.val$url;
    try
    {
      ab.i(localak.TAG, "preLoadWebView cached webview size %d", new Object[] { Integer.valueOf(localak.uaL.size()) });
      MMWebView localMMWebView;
      if (localak.uaL.size() <= 0)
      {
        localak.uaM = System.currentTimeMillis();
        localMMWebView = localak.aXX();
        if (localMMWebView != null)
          break label93;
        ab.w(localak.TAG, "create webview fail");
      }
      while (true)
      {
        this.uaN.done();
        AppMethodBeat.o(124197);
        return;
        label93: localak.uaK = false;
        ab.i(localak.TAG, "preload %s", new Object[] { localMMWebView.toString() });
        localMMWebView.setPreload(true);
        localMMWebView.setRandomStr(bo.Mb(16));
        localMMWebView.getSettings().setJavaScriptEnabled(true);
        localMMWebView.getSettings().setPluginsEnabled(true);
        localMMWebView.getSettings().dUh();
        localMMWebView.getSettings().setBuiltInZoomControls(false);
        localMMWebView.getSettings().setUseWideViewPort(true);
        localMMWebView.getSettings().setLoadWithOverviewMode(true);
        localMMWebView.getSettings().dUc();
        localMMWebView.getSettings().dUb();
        localMMWebView.getSettings().setGeolocationEnabled(true);
        localMMWebView.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        localMMWebView.getSettings().dUj();
        localMMWebView.getSettings().dUf();
        localMMWebView.getSettings().setAppCachePath(localMMWebView.getContext().getDir("webviewcache", 0).getAbsolutePath());
        localMMWebView.getSettings().dUe();
        localMMWebView.getSettings().dUg();
        Object localObject1 = localMMWebView.getSettings();
        Object localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        ((p)localObject1).setDatabasePath(e.eSi + "databases/");
        b.dTR().dTS();
        b.dTR().f(localMMWebView);
        localObject1 = u.bh(localMMWebView.getContext(), localMMWebView.getSettings().getUserAgentString());
        localMMWebView.getSettings().setUserAgentString((String)localObject1);
        localObject1 = new com/tencent/mm/plugin/websearch/api/ah;
        ((ah)localObject1).<init>();
        localMMWebView.addJavascriptInterface(localObject1, "__wx");
        localMMWebView.loadUrl(str);
        localObject2 = new com/tencent/mm/plugin/websearch/api/ak$2;
        ((ak.2)localObject2).<init>(localak, localMMWebView);
        localMMWebView.setWebViewClient((s)localObject2);
        localObject2 = Uri.parse(str);
        str = ((Uri)localObject2).getQueryParameter("sessionId");
        localObject2 = ((Uri)localObject2).getQueryParameter("subSessionId");
        al localal = new com/tencent/mm/plugin/websearch/api/al;
        localal.<init>(localMMWebView, str, (String)localObject2, (ah)localObject1);
        localak.uaL.add(localal);
        h.pYm.e(15005, new Object[] { Integer.valueOf(localak.uaJ), Integer.valueOf(1), Integer.valueOf(0) });
      }
    }
    catch (Exception localException)
    {
      while (true)
        ab.printErrStackTrace(localak.TAG, localException, "", new Object[0]);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.websearch.api.ak.7
 * JD-Core Version:    0.6.2
 */