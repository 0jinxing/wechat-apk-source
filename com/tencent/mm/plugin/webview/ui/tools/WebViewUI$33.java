package com.tencent.mm.plugin.webview.ui.tools;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.SparseArray;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.modelcache.p;
import com.tencent.mm.plugin.webview.modelcache.p.a;
import com.tencent.mm.plugin.webview.modeltools.c;
import com.tencent.mm.plugin.webview.stub.d;
import com.tencent.mm.plugin.webview.stub.d.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

final class WebViewUI$33
  implements ServiceConnection
{
  WebViewUI$33(WebViewUI paramWebViewUI)
  {
  }

  public final void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
  {
    AppMethodBeat.i(7854);
    ab.i("MicroMsg.WebViewUI", "edw onServiceConnected");
    if (this.uxp.pzf == null)
    {
      ab.e("MicroMsg.WebViewUI", "onServiceConnected, activity destroyed");
      AppMethodBeat.o(7854);
    }
    while (true)
    {
      return;
      this.uxp.icy = d.a.G(paramIBinder);
      try
      {
        this.uxp.icy.a(this.uxp.umI, this.uxp.hashCode());
        if (this.uxp.icy == null)
        {
          bool = true;
          ab.i("MicroMsg.WebViewUI", "onServiceConnected, invoker == null ? %b", new Object[] { Boolean.valueOf(bool) });
          m.uuj.icy = this.uxp.icy;
          if (!bo.isNullOrNil(this.uxp.getIntent().getStringExtra("ad_info")))
          {
            localm = m.uuj;
            str = this.uxp.getIntent().getStringExtra("ad_info");
            paramIBinder = "";
            paramComponentName = paramIBinder;
            if (localm.icy == null);
          }
        }
      }
      catch (Exception paramComponentName)
      {
        try
        {
          while (true)
          {
            m localm;
            String str;
            paramComponentName = localm.icy.g(23, null).getString("config_info_username");
            localm.hg(str, paramComponentName);
            if (this.uxp.icy != null)
              break label275;
            ab.f("MicroMsg.WebViewUI", "service connect success, while invoker is null");
            this.uxp.finish();
            AppMethodBeat.o(7854);
            break;
            paramComponentName = paramComponentName;
            ab.e("MicroMsg.WebViewUI", "addCallback fail, ex = %s", new Object[] { paramComponentName.getMessage() });
          }
          boolean bool = false;
        }
        catch (RemoteException paramComponentName)
        {
          while (true)
          {
            ab.e("MicroMsg.WebViewReportUtil", "setTraceId getConfigInfo exp:%s", new Object[] { paramComponentName });
            paramComponentName = paramIBinder;
          }
          label275: this.uxp.aMh();
          AppMethodBeat.o(7854);
        }
      }
    }
  }

  public final void onServiceDisconnected(ComponentName paramComponentName)
  {
    AppMethodBeat.i(7855);
    ab.i("MicroMsg.WebViewUI", "edw onServiceDisconnected");
    if (((this.uxp.uwA) && (WebViewUI.uwz <= 0)) || ((!this.uxp.uwA) && (WebViewUI.uwz <= 1)))
    {
      c.c(this.uxp.icy);
      paramComponentName = p.a.cYp();
      for (int i = 0; i < paramComponentName.unZ.size(); i++)
        paramComponentName.unZ.valueAt(i);
      paramComponentName.unZ.clear();
      paramComponentName.uoa.clear();
    }
    if ((!this.uxp.uwA) && (!WebViewUI.a(this.uxp)) && (!this.uxp.isFinishing()))
    {
      ab.i("MicroMsg.WebViewUI", "maybe mm process crash, try rebind service");
      WebViewUI.b(this.uxp);
      AppMethodBeat.o(7855);
    }
    while (true)
    {
      return;
      this.uxp.icy = null;
      AppMethodBeat.o(7855);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.WebViewUI.33
 * JD-Core Version:    0.6.2
 */