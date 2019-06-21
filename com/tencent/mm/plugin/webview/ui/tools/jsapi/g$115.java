package com.tencent.mm.plugin.webview.ui.tools.jsapi;

import android.content.Context;
import android.content.res.Resources;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.aj.a.d;
import com.tencent.mm.aj.a.e;
import com.tencent.mm.aj.z;
import com.tencent.mm.at.o;
import com.tencent.mm.pluginsdk.model.app.f;
import com.tencent.mm.pluginsdk.ui.applet.q.a;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.h;

final class g$115
  implements q.a
{
  g$115(g paramg, String paramString1, long paramLong, f paramf, String paramString2, String paramString3, i parami)
  {
  }

  public final void a(boolean paramBoolean, String paramString, int paramInt)
  {
    AppMethodBeat.i(9192);
    com.tencent.mm.aj.a.c localc;
    if (paramBoolean)
      if (bo.isNullOrNil(this.fEJ))
        localc = z.aeT().aK(this.uHw);
    while (true)
    {
      synchronized (e.fxC)
      {
        String str = e.aae();
        e.d(localc);
        g.a(this.uHd, this.uHq, this.val$appId, this.cgl, this.fEJ, null, null, paramString, null);
        e.rx(str);
        g.a(this.uHd, this.uqf, "sendEnterpriseChat:ok", null);
        if (g.i(this.uHd) != null)
          h.bQ(g.i(this.uHd), g.i(this.uHd).getResources().getString(2131297050));
        AppMethodBeat.o(9192);
        return;
      }
      o.ahk().a(this.fEJ, new g.115.1(this, paramString));
      AppMethodBeat.o(9192);
      continue;
      g.a(this.uHd, this.uqf, "sendEnterpriseChat:cancel", null);
      AppMethodBeat.o(9192);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.jsapi.g.115
 * JD-Core Version:    0.6.2
 */