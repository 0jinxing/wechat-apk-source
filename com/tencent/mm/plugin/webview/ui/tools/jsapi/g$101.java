package com.tencent.mm.plugin.webview.ui.tools.jsapi;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.fq;
import com.tencent.mm.plugin.webview.model.WebViewJSSDKFileItem;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.b.b;
import com.tencent.mm.ui.base.h;

final class g$101
  implements Runnable
{
  g$101(g paramg, boolean paramBoolean, i parami, String paramString, WebViewJSSDKFileItem paramWebViewJSSDKFileItem)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(9171);
    if (this.uIb)
    {
      g localg = this.uHd;
      localObject = g.i(this.uHd);
      g.i(this.uHd).getString(2131297061);
      g.a(localg, h.b((Context)localObject, g.i(this.uHd).getString(2131305731), true, new g.101.1(this)));
    }
    Object localObject = new fq();
    ((fq)localObject).czB.czD = this.riM;
    ((fq)localObject).czB.fileName = this.uId.fileName;
    ((fq)localObject).czB.czE = 0;
    ((fq)localObject).czB.scene = 8;
    ((fq)localObject).czB.czF = new g.101.2(this, (fq)localObject);
    a.xxA.m((b)localObject);
    AppMethodBeat.o(9171);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.jsapi.g.101
 * JD-Core Version:    0.6.2
 */