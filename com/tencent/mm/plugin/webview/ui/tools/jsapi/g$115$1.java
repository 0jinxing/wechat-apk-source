package com.tencent.mm.plugin.webview.ui.tools.jsapi;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.aj.a.c;
import com.tencent.mm.aj.a.d;
import com.tencent.mm.aj.a.e;
import com.tencent.mm.aj.z;
import com.tencent.mm.at.c.c;
import com.tencent.mm.ui.base.h;

final class g$115$1
  implements c.c
{
  g$115$1(g.115 param115, String paramString)
  {
  }

  public final void C(Bitmap arg1)
  {
    AppMethodBeat.i(9191);
    if (g.H(this.uIs.uHd) != null)
      g.H(this.uIs.uHd).dismiss();
    c localc = z.aeT().aK(this.uIs.uHw);
    synchronized (e.fxC)
    {
      String str = e.aae();
      e.d(localc);
      g.a(this.uIs.uHd, this.uIs.uHq, this.uIs.val$appId, this.uIs.cgl, this.uIs.fEJ, null, null, this.uHx, null);
      e.rx(str);
      g.a(this.uIs.uHd, this.uIs.uqf, "sendEnterpriseChat:ok", null);
      if (g.i(this.uIs.uHd) != null)
        h.bQ(g.i(this.uIs.uHd), g.i(this.uIs.uHd).getResources().getString(2131297050));
      AppMethodBeat.o(9191);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.jsapi.g.115.1
 * JD-Core Version:    0.6.2
 */