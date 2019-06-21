package com.tencent.mm.plugin.webview.ui.tools.jsapi;

import android.app.ProgressDialog;
import android.content.Context;
import android.graphics.Bitmap;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.aj.a.c;
import com.tencent.mm.aj.a.d;
import com.tencent.mm.aj.a.e;
import com.tencent.mm.aj.z;
import com.tencent.mm.at.c.c;
import com.tencent.mm.pluginsdk.model.app.f;
import com.tencent.mm.ui.base.h;

final class g$21
  implements c.c
{
  g$21(g paramg, long paramLong, f paramf, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7)
  {
  }

  public final void C(Bitmap arg1)
  {
    AppMethodBeat.i(9065);
    if (g.H(this.uHd) != null)
      g.H(this.uHd).dismiss();
    c localc;
    if (this.uHw >= 0L)
      localc = z.aeT().aK(this.uHw);
    while (true)
    {
      synchronized (e.fxC)
      {
        String str = e.aae();
        e.d(localc);
        g.a(this.uHd, this.uHq, this.val$appId, this.cgl, this.fEJ, this.uHr, this.uHs, this.uHx, this.uHt);
        e.rx(str);
        if (g.i(this.uHd) != null)
          h.bQ(g.i(this.uHd), g.i(this.uHd).getString(2131298422));
        g.a(this.uHd, g.j(this.uHd), "send_app_msg:ok", null);
        AppMethodBeat.o(9065);
        return;
      }
      g.a(this.uHd, this.uHq, this.val$appId, this.cgl, this.fEJ, this.uHr, this.uHs, this.uHx, this.uHt);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.jsapi.g.21
 * JD-Core Version:    0.6.2
 */