package com.tencent.mm.plugin.fingerprint.ui;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.animation.Animation;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.plugin.fingerprint.b.c;
import com.tencent.mm.plugin.fingerprint.b.e;
import com.tencent.mm.plugin.wallet_core.c.y;
import com.tencent.mm.pluginsdk.wallet.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.q;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import com.tencent.soter.a.g.f;

public class FingerPrintAuthUI extends WalletBaseUI
  implements com.tencent.mm.pluginsdk.wallet.a
{
  private boolean isPaused = false;
  private TextView msD;
  private c msE;
  private FingerPrintAuthUI.a msF;
  private boolean msG = false;
  private final int msH = 1;
  private Dialog msu = null;
  private j msv = null;
  private Animation msx;
  private int msy = 0;

  private void cg(String paramString, int paramInt)
  {
    AppMethodBeat.i(41648);
    this.msG = false;
    al.d(new FingerPrintAuthUI.4(this, paramString, paramInt));
    AppMethodBeat.o(41648);
  }

  private void hw(boolean paramBoolean)
  {
    AppMethodBeat.i(41644);
    com.tencent.mm.plugin.fingerprint.a.bwM();
    com.tencent.mm.plugin.fingerprint.a.bwN();
    c.abort();
    c.release();
    if (!c.bxl())
    {
      ab.e("MicroMsg.FingerPrintAuthUI", "no fingerprints enrolled, use settings to enroll fingerprints first");
      AppMethodBeat.o(41644);
    }
    while (true)
    {
      return;
      if (this.msF == null)
        this.msF = new FingerPrintAuthUI.a(this, this);
      if (c.a(this.msF, paramBoolean) != 0)
        ab.e("MicroMsg.FingerPrintAuthUI", "startFingerprintAuth failed!");
      AppMethodBeat.o(41644);
    }
  }

  public final void aC(int paramInt, String paramString)
  {
    AppMethodBeat.i(41649);
    if (paramInt == 0)
    {
      ab.i("MicroMsg.FingerPrintAuthUI", "open fingerprintpay success");
      a(new y(null, 19), false, false);
      AppMethodBeat.o(41649);
    }
    while (true)
    {
      return;
      fE(false);
      ab.e("MicroMsg.FingerPrintAuthUI", "open fingerprintpay failed");
      h.a(this, getString(2131299873), "", new FingerPrintAuthUI.5(this));
      AppMethodBeat.o(41649);
    }
  }

  public final boolean c(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    boolean bool = true;
    AppMethodBeat.i(41647);
    if (this.msv.c(paramInt1, paramInt2, paramString, paramm))
      AppMethodBeat.o(41647);
    while (true)
    {
      return bool;
      if ((paramm instanceof y))
      {
        fE(false);
        com.tencent.mm.wallet_core.a.b(this, new Bundle(), 0);
        Toast.makeText(this, 2131299874, 0).show();
        AppMethodBeat.o(41647);
      }
      else
      {
        AppMethodBeat.o(41647);
        bool = false;
      }
    }
  }

  protected final void fE(boolean paramBoolean)
  {
    AppMethodBeat.i(41642);
    al.d(new FingerPrintAuthUI.2(this, paramBoolean));
    AppMethodBeat.o(41642);
  }

  public final int getForceOrientation()
  {
    return 1;
  }

  public final int getLayoutId()
  {
    return 2130969561;
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(41641);
    super.onCreate(paramBundle);
    setMMTitle(getString(2131301875));
    this.msD = ((TextView)findViewById(2131824043));
    com.tencent.mm.plugin.fingerprint.a.bwM();
    this.msE = com.tencent.mm.plugin.fingerprint.a.bwN();
    this.msv = c.bxm();
    paramBundle = com.tencent.mm.wallet_core.a.aD(this);
    if (paramBundle != null)
    {
      paramBundle = paramBundle.getString("pwd");
      if (!TextUtils.isEmpty(paramBundle))
        break label158;
      ab.e("MicroMsg.FingerPrintAuthUI", "get user pwd error");
      cg(getString(2131299873), -1);
      com.tencent.mm.plugin.soter.d.a.d(1000, -1000223, -1, "get user pwd error");
      AppMethodBeat.o(41641);
    }
    while (true)
    {
      return;
      ab.e("MicroMsg.FingerPrintAuthUI", "contextdata is null,for that reason program can't get user pwd");
      cg(getString(2131299873), -1);
      com.tencent.mm.plugin.soter.d.a.d(1000, -1000223, -1, "contextdata is null,for that reason program can't get user pwd");
      AppMethodBeat.o(41641);
      continue;
      label158: if (e.bxs())
      {
        fE(true);
        f.dRn().dRo();
        this.msv.a(this, new FingerPrintAuthUI.1(this), paramBundle);
        AppMethodBeat.o(41641);
      }
      else
      {
        ab.e("MicroMsg.FingerPrintAuthUI", "device is not support FingerPrintAuth");
        AppMethodBeat.o(41641);
      }
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(41646);
    ab.i("MicroMsg.FingerPrintAuthUI", "hy: fingerprint auth ui on destroy");
    if (this.msx != null)
      this.msx.cancel();
    this.msF = null;
    super.onDestroy();
    AppMethodBeat.o(41646);
  }

  public void onPause()
  {
    AppMethodBeat.i(41645);
    super.onPause();
    this.isPaused = true;
    PowerManager.WakeLock localWakeLock = ((PowerManager)this.mController.ylL.getSystemService("power")).newWakeLock(536870913, "PostLocationService");
    if (localWakeLock != null)
      localWakeLock.acquire();
    ab.i("MicroMsg.FingerPrintAuthUI", "hy: user cancelled");
    com.tencent.mm.plugin.fingerprint.a.bwM();
    if (com.tencent.mm.plugin.fingerprint.a.bwN() != null)
      c.bxk();
    if (localWakeLock != null)
      localWakeLock.release();
    AppMethodBeat.o(41645);
  }

  public void onResume()
  {
    AppMethodBeat.i(41643);
    super.onResume();
    this.isPaused = false;
    if (this.msG)
      hw(false);
    AppMethodBeat.o(41643);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fingerprint.ui.FingerPrintAuthUI
 * JD-Core Version:    0.6.2
 */