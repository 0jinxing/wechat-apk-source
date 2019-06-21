package com.tencent.mm.plugin.webview.modeltools;

import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.g.d;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.ak.a;
import com.tencent.mm.ui.widget.MMWebView;

public final class h
{
  ak iGP;
  MMWebView upq;
  public String upr;
  h.c ups;
  private ak.a upt;

  public h()
  {
    AppMethodBeat.i(7011);
    this.upt = new h.1(this);
    this.iGP = new ak(Looper.getMainLooper(), this.upt);
    AppMethodBeat.o(7011);
  }

  public final void a(MMWebView paramMMWebView, h.c paramc)
  {
    AppMethodBeat.i(7012);
    this.upq = paramMMWebView;
    this.ups = paramc;
    this.iGP.sendEmptyMessage(1);
    AppMethodBeat.o(7012);
  }

  public final void cYK()
  {
    AppMethodBeat.i(7013);
    d.post(new h.a(this, (byte)0), "ViewCaptureHelper_DeleteBitmap");
    AppMethodBeat.o(7013);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.modeltools.h
 * JD-Core Version:    0.6.2
 */