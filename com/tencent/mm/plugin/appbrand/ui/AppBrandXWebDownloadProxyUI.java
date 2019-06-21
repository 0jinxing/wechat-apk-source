package com.tencent.mm.plugin.appbrand.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cj.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.a;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.p;
import com.tencent.mm.ui.q;
import com.tencent.xweb.k;
import com.tencent.xweb.w;
import com.tencent.xweb.xwalk.b;

@a(7)
public final class AppBrandXWebDownloadProxyUI extends MMActivity
{
  private static boolean iII;
  private Runnable iIH;
  private b iJA = null;
  private Handler mHandler;
  p tipDialog;

  static
  {
    AppMethodBeat.i(133188);
    c.iw(ah.getContext());
    iII = false;
    AppMethodBeat.o(133188);
  }

  private void startTimer()
  {
    AppMethodBeat.i(133184);
    this.mHandler = new Handler();
    this.iIH = new AppBrandXWebDownloadProxyUI.2(this);
    this.mHandler.postDelayed(this.iIH, 20000L);
    AppMethodBeat.o(133184);
  }

  public final int getLayoutId()
  {
    return -1;
  }

  public final void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(133183);
    super.onCreate(paramBundle);
    ab.i("MicroMsg.AppBrandXWebDownloadProxyUI", "onCreate");
    this.tipDialog = h.b(this.mController.ylL, null, true, null);
    this.tipDialog.setOnCancelListener(new AppBrandXWebDownloadProxyUI.3(this));
    n.a(getWindow());
    ab.i("MicroMsg.AppBrandXWebDownloadProxyUI", "onCreate, kill tool");
    c.atD("com.tencent.mm.intent.ACTION_KILL_TOOLS_PROCESS");
    boolean bool = k.isBusy();
    ab.i("MicroMsg.AppBrandXWebDownloadProxyUI", "now status, downloading = %b", new Object[] { Boolean.valueOf(bool) });
    if (bool)
    {
      ab.i("MicroMsg.AppBrandXWebDownloadProxyUI", "is foreground download");
      if (iII)
      {
        setResult(0, new Intent());
        finish();
        AppMethodBeat.o(133183);
      }
    }
    while (true)
    {
      return;
      if (this.iJA == null)
        this.iJA = new AppBrandXWebDownloadProxyUI.a(this, (byte)0);
      w.a(this.iJA);
      ab.i("MicroMsg.AppBrandXWebDownloadProxyUI", "is foreground download xweb already downloading, ignore duplicated request");
      paramBundle = this.mController.ylL;
      this.mController.ylL.getString(2131297061);
      this.tipDialog = h.b(paramBundle, this.mController.ylL.getString(2131296866), true, null);
      if (this.tipDialog.getWindow() != null)
      {
        paramBundle = this.tipDialog.getWindow().getAttributes();
        paramBundle.dimAmount = 0.0F;
        this.tipDialog.getWindow().setAttributes(paramBundle);
      }
      this.tipDialog.setOnCancelListener(new AppBrandXWebDownloadProxyUI.1(this));
      startTimer();
      AppMethodBeat.o(133183);
      continue;
      if (this.iJA == null)
        this.iJA = new AppBrandXWebDownloadProxyUI.a(this, (byte)0);
      w.a(this.iJA);
      k.dTX();
      AppMethodBeat.o(133183);
    }
  }

  public final void onDestroy()
  {
    AppMethodBeat.i(133185);
    ab.i("MicroMsg.AppBrandXWebDownloadProxyUI", "onDestroy");
    this.iJA = null;
    w.a(this.iJA);
    if ((this.mHandler != null) && (this.iIH != null))
      this.mHandler.removeCallbacks(this.iIH);
    super.onDestroy();
    AppMethodBeat.o(133185);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.AppBrandXWebDownloadProxyUI
 * JD-Core Version:    0.6.2
 */