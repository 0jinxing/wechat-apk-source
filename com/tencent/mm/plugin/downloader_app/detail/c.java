package com.tencent.mm.plugin.downloader_app.detail;

import android.os.Bundle;
import android.view.View;
import com.tencent.luggage.d.a.a;
import com.tencent.luggage.d.g;
import com.tencent.luggage.d.k;
import com.tencent.luggage.d.n;
import com.tencent.luggage.d.n.a;
import com.tencent.luggage.g.i;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.luggage.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.ui.widget.MMWebView;

public final class c extends n
{
  private MMWebView fow;
  boolean kOh;
  private n.a kOi;

  public c(g paramg, k paramk, Bundle paramBundle)
  {
    super(paramg, paramk, paramBundle);
    AppMethodBeat.i(136046);
    this.kOh = false;
    this.kOi = new c.2(this);
    if (paramk != null)
      this.kOh = true;
    ab.i("MicroMsg.DownloadDetailWebPage", "preload = %b", new Object[] { Boolean.valueOf(this.kOh) });
    a(this.kOi);
    this.bPN.bPC = a.bPT;
    h.b(this);
    AppMethodBeat.o(136046);
  }

  private void IB(String paramString)
  {
    AppMethodBeat.i(136053);
    this.bPN.a(new c.1(this, paramString));
    AppMethodBeat.o(136053);
  }

  public final void g(String paramString, Bundle paramBundle)
  {
    AppMethodBeat.i(136051);
    if (!this.kOh)
      this.bPN.loadUrl(paramString);
    AppMethodBeat.o(136051);
  }

  public final void onDestroy()
  {
    AppMethodBeat.i(136050);
    ab.i("MicroMsg.DownloadDetailWebPage", "onDestroy");
    IB("onDestroy");
    h.c(this);
    AppMethodBeat.o(136050);
  }

  public final View wR()
  {
    AppMethodBeat.i(136047);
    this.fow = ((MMWebView)this.bPN.xr());
    View localView = super.wR();
    AppMethodBeat.o(136047);
    return localView;
  }

  public final void wU()
  {
    AppMethodBeat.i(136048);
    ab.i("MicroMsg.DownloadDetailWebPage", "onForeground");
    IB("onResume");
    this.fow.onResume();
    AppMethodBeat.o(136048);
  }

  public final void wW()
  {
    AppMethodBeat.i(136049);
    ab.i("MicroMsg.DownloadDetailWebPage", "onBackground");
    IB("onPause");
    this.fow.onPause();
    AppMethodBeat.o(136049);
  }

  public final String xt()
  {
    AppMethodBeat.i(136052);
    String str = i.p(ah.getContext(), "luggage_mm_adapter.js");
    AppMethodBeat.o(136052);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.downloader_app.detail.c
 * JD-Core Version:    0.6.2
 */