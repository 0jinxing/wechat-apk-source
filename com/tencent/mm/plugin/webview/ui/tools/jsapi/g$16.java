package com.tencent.mm.plugin.webview.ui.tools.jsapi;

import android.app.ProgressDialog;
import android.content.Context;
import android.graphics.Bitmap;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.at.c.c;
import com.tencent.mm.pluginsdk.model.app.f;
import com.tencent.mm.ui.base.h;
import java.util.Map;

final class g$16
  implements c.c
{
  g$16(g paramg, ProgressDialog paramProgressDialog, f paramf, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, Map paramMap)
  {
  }

  public final void C(Bitmap paramBitmap)
  {
    AppMethodBeat.i(9060);
    if (this.uHp != null)
      this.uHp.dismiss();
    g.a(this.uHd, this.uHq, this.val$appId, this.cgl, this.fEJ, this.uHr, this.uHs, null, this.uHt);
    if (g.i(this.uHd) != null)
      h.bQ(g.i(this.uHd), g.i(this.uHd).getString(2131297039));
    g.a(this.uHd, g.j(this.uHd), "send_app_msg:ok", this.opJ);
    AppMethodBeat.o(9060);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.jsapi.g.16
 * JD-Core Version:    0.6.2
 */