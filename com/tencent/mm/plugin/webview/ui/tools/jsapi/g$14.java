package com.tencent.mm.plugin.webview.ui.tools.jsapi;

import android.app.ProgressDialog;
import android.graphics.Bitmap;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.at.c.c;
import com.tencent.mm.pluginsdk.model.app.f;

final class g$14
  implements c.c
{
  g$14(g paramg, ProgressDialog paramProgressDialog, f paramf, String paramString1, String paramString2, i parami)
  {
  }

  public final void C(Bitmap paramBitmap)
  {
    AppMethodBeat.i(9058);
    if (this.uHp != null)
      this.uHp.dismiss();
    g.a(this.uHd, this.uHq, "", this.cgl, this.fEJ, null, null, null, null);
    g.a(this.uHd, this.uqf, "send_service_app_msg:ok", null);
    g.ew(this.uHd, this.uqf);
    AppMethodBeat.o(9058);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.jsapi.g.14
 * JD-Core Version:    0.6.2
 */