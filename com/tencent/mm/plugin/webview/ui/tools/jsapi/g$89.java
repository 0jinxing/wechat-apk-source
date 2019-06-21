package com.tencent.mm.plugin.webview.ui.tools.jsapi;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.fn;
import com.tencent.mm.g.a.fn.b;
import com.tencent.mm.plugin.webview.model.WebViewJSSDKFileItem;
import com.tencent.mm.plugin.webview.stub.e;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Map;

final class g$89
  implements Runnable
{
  g$89(g paramg, WebViewJSSDKFileItem paramWebViewJSSDKFileItem, i parami)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(9155);
    final fn localfn = new fn();
    localfn.czm.op = 1;
    localfn.czm.filePath = this.uId.heo;
    localfn.czm.duration = bo.getInt((String)this.uqf.puc.get("duration"), 60);
    localfn.czm.chj = new Runnable()
    {
      public final void run()
      {
        AppMethodBeat.i(9154);
        ab.i("MicroMsg.MsgHandler", "onVoiceRecordEnd, localId(%s).", new Object[] { g.89.this.uId.czD });
        try
        {
          g.G(g.89.this.uHd);
          Bundle localBundle = new android/os/Bundle;
          localBundle.<init>();
          localBundle.putString("localId", g.89.this.uId.czD);
          StringBuilder localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>("onVoiceRecordEnd:");
          String str;
          if ((localfn.czn.czo != 2) || (localfn.czn.czo == 3))
          {
            str = "ok";
            localBundle.putString("recordResult", str);
            if (g.k(g.89.this.uHd) == null)
              break label166;
            g.k(g.89.this.uHd).c(2008, localBundle);
            AppMethodBeat.o(9154);
          }
          while (true)
          {
            return;
            str = "fail";
            break;
            label166: ab.e("MicroMsg.MsgHandler", "callbacker is null");
            AppMethodBeat.o(9154);
          }
        }
        catch (Exception localException)
        {
          while (true)
          {
            ab.e("MicroMsg.MsgHandler", "callback stop record failed");
            AppMethodBeat.o(9154);
          }
        }
      }
    };
    a.xxA.m(localfn);
    AppMethodBeat.o(9155);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.jsapi.g.89
 * JD-Core Version:    0.6.2
 */