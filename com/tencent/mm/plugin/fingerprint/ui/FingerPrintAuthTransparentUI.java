package com.tencent.mm.plugin.fingerprint.ui;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.widget.CheckBox;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.compatible.e.s;
import com.tencent.mm.plugin.wallet_core.c.y;
import com.tencent.mm.plugin.wallet_core.model.ak;
import com.tencent.mm.pluginsdk.wallet.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.i;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import com.tencent.soter.a.g.f;

@com.tencent.mm.ui.base.a(7)
public class FingerPrintAuthTransparentUI extends WalletBaseUI
  implements com.tencent.mm.pluginsdk.wallet.a
{
  private com.tencent.mm.pluginsdk.wallet.c mrx;
  private int msA;
  private boolean msB;
  private i mst;
  Dialog msu;
  private j msv;
  private int msw;
  private Animation msx;
  private int msy;
  private boolean msz;
  View view;

  public FingerPrintAuthTransparentUI()
  {
    AppMethodBeat.i(41610);
    this.view = null;
    this.mst = null;
    this.msv = null;
    this.msw = -1;
    this.msy = 0;
    this.msz = false;
    this.msA = 0;
    this.msB = false;
    this.mrx = new FingerPrintAuthTransparentUI.1(this);
    AppMethodBeat.o(41610);
  }

  private void Mm(String paramString)
  {
    AppMethodBeat.i(41620);
    if (TextUtils.isEmpty(paramString))
      paramString = getString(-1);
    while (true)
    {
      com.tencent.mm.ui.base.h.a(this, paramString, "", getString(2131304829), false, new FingerPrintAuthTransparentUI.3(this));
      AppMethodBeat.o(41620);
      return;
    }
  }

  private static void bxQ()
  {
    AppMethodBeat.i(41616);
    ab.i("MicroMsg.FingerPrintAuthTransparentUI", "hy: user cancelled");
    com.tencent.mm.plugin.fingerprint.a.bwM();
    if (com.tencent.mm.plugin.fingerprint.a.bwN() != null)
      com.tencent.mm.plugin.fingerprint.b.c.bxk();
    AppMethodBeat.o(41616);
  }

  private void bxR()
  {
    AppMethodBeat.i(41618);
    com.tencent.mm.plugin.soter.d.a.fG(3, this.msA);
    Intent localIntent = getIntent();
    String str = "";
    if (localIntent != null)
      str = localIntent.getStringExtra("key_pwd1");
    this.msv.a(this, new FingerPrintAuthTransparentUI.11(this), str);
    fE(true);
    if ((this.mst != null) && (this.mst.isShowing()))
      this.mst.dismiss();
    AppMethodBeat.o(41618);
  }

  private void hw(boolean paramBoolean)
  {
    AppMethodBeat.i(41615);
    com.tencent.mm.plugin.fingerprint.a.bwM();
    com.tencent.mm.plugin.fingerprint.a.bwN();
    com.tencent.mm.plugin.fingerprint.b.c.abort();
    com.tencent.mm.plugin.fingerprint.b.c.release();
    if (!com.tencent.mm.plugin.fingerprint.b.c.bxl())
    {
      ab.e("MicroMsg.FingerPrintAuthTransparentUI", "no fingerprints enrolled, use settings to enroll fingerprints first");
      AppMethodBeat.o(41615);
    }
    while (true)
    {
      return;
      if (com.tencent.mm.plugin.fingerprint.b.c.a(this.mrx, paramBoolean) != 0)
        ab.e("MicroMsg.FingerPrintAuthTransparentUI", "startFingerprintAuth failed!");
      AppMethodBeat.o(41615);
    }
  }

  public final void aC(int paramInt, String paramString)
  {
    AppMethodBeat.i(41623);
    fE(false);
    if (paramInt == 0)
    {
      ab.i("MicroMsg.FingerPrintAuthTransparentUI", "open fingerprintpay success");
      a(new y(null, 19), false, false);
      com.tencent.mm.ui.base.h.a(this, getString(2131299876), getString(2131299872), getString(2131305147), false, new FingerPrintAuthTransparentUI.2(this));
      AppMethodBeat.o(41623);
      return;
    }
    if (paramInt == -2)
    {
      ab.e("MicroMsg.FingerPrintAuthTransparentUI", "open fingerprintpay failed");
      if (!TextUtils.isEmpty(paramString))
        break label172;
      paramString = getString(2131299873);
    }
    label172: 
    while (true)
    {
      com.tencent.mm.ui.base.h.a(this, paramString, "", getString(2131299881), getString(2131296868), false, new FingerPrintAuthTransparentUI.4(this), new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          AppMethodBeat.i(41601);
          FingerPrintAuthTransparentUI.this.finish();
          AppMethodBeat.o(41601);
        }
      });
      AppMethodBeat.o(41623);
      break;
      Mm(paramString);
      AppMethodBeat.o(41623);
      break;
    }
  }

  public final boolean c(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(41617);
    boolean bool = this.msv.c(paramInt1, paramInt2, paramString, paramm);
    AppMethodBeat.o(41617);
    return bool;
  }

  protected final void fE(boolean paramBoolean)
  {
    AppMethodBeat.i(41621);
    if (paramBoolean)
    {
      this.msu = com.tencent.mm.wallet_core.ui.g.a(this, false, null);
      AppMethodBeat.o(41621);
    }
    while (true)
    {
      return;
      if ((this.msu != null) && (this.msu.isShowing()))
      {
        this.msu.dismiss();
        this.msu = null;
      }
      AppMethodBeat.o(41621);
    }
  }

  public void finish()
  {
    AppMethodBeat.i(41619);
    if (this.msv != null)
      this.msv.clear();
    super.finish();
    AppMethodBeat.o(41619);
  }

  public final int getForceOrientation()
  {
    return 1;
  }

  public final int getLayoutId()
  {
    return -1;
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(41611);
    super.onCreate(paramBundle);
    ab.i("MicroMsg.FingerPrintAuthTransparentUI", "launch FingerPrintAuthTransparentUI");
    if (!com.tencent.mm.plugin.fingerprint.b.e.bxs())
    {
      ab.e("MicroMsg.FingerPrintAuthTransparentUI", "device is not support FingerPrintAuth or load fingerpringauth so failed, finish UI!");
      finish();
      AppMethodBeat.o(41611);
    }
    while (true)
    {
      return;
      if (com.tencent.mm.model.r.YM())
      {
        ab.e("MicroMsg.FingerPrintAuthTransparentUI", "now account is isPayUPay, finish UI!");
        finish();
        AppMethodBeat.o(41611);
      }
      else if (com.tencent.mm.plugin.fingerprint.b.e.bxG())
      {
        ab.e("MicroMsg.FingerPrintAuthTransparentUI", "getIsOpenFPFromLocal is true, finish UI!");
        finish();
        AppMethodBeat.o(41611);
      }
      else
      {
        com.tencent.mm.plugin.fingerprint.a.bwM();
        com.tencent.mm.plugin.fingerprint.a.bwN();
        if (!com.tencent.mm.plugin.fingerprint.b.c.bxl())
        {
          ab.e("MicroMsg.FingerPrintAuthTransparentUI", "isWxHasFingerPrint is false, finish UI!");
          finish();
          AppMethodBeat.o(41611);
        }
        else
        {
          if (com.tencent.mm.compatible.e.q.etg.etr != 1)
          {
            ab.e("MicroMsg.FingerPrintAuthTransparentUI", "hy: device config force to not support");
            finish();
          }
          paramBundle = com.tencent.mm.plugin.wallet_core.model.r.cPI();
          com.tencent.mm.plugin.fingerprint.a.bwM();
          com.tencent.mm.plugin.fingerprint.a.bwN();
          this.msv = com.tencent.mm.plugin.fingerprint.b.c.bxm();
          this.msB = com.tencent.mm.kernel.g.RP().Ry().getBoolean(ac.a.xKS, false);
          if ((paramBundle.cQg()) && (!com.tencent.mm.plugin.fingerprint.b.e.bxG()))
          {
            ab.e("MicroMsg.FingerPrintAuthTransparentUI", "show fingerprint auth open guide!");
            f.dRn().dRo();
            com.tencent.mm.plugin.report.service.h.pYm.e(12924, new Object[] { Integer.valueOf(1) });
            com.tencent.mm.plugin.soter.d.a.EB(0);
            if (getIntent().getBooleanExtra("key_show_guide", true))
            {
              if (com.tencent.mm.kernel.g.RP().Ry().getBoolean(ac.a.xKP, true))
              {
                ab.i("MicroMsg.FingerPrintAuthTransparentUI", "hy: first show. no check box");
                com.tencent.mm.kernel.g.RP().Ry().set(ac.a.xKP, Boolean.FALSE);
                com.tencent.mm.kernel.g.RP().Ry().set(ac.a.xKS, Boolean.FALSE);
                if (this.msB);
                for (paramBundle = getString(2131300428); ; paramBundle = getString(2131300427))
                {
                  com.tencent.mm.ui.base.h.a(this, paramBundle, "", getString(2131297758), getString(2131296868), false, new FingerPrintAuthTransparentUI.7(this), new FingerPrintAuthTransparentUI.8(this));
                  com.tencent.mm.kernel.g.RP().Ry().set(ac.a.xKR, Integer.valueOf(1));
                  this.msA = 1;
                  com.tencent.mm.plugin.soter.d.a.fG(1, this.msA);
                  AppMethodBeat.o(41611);
                  break;
                }
              }
              ab.i("MicroMsg.FingerPrintAuthTransparentUI", "hy: already shown before. show dialog with check box");
              View localView = LayoutInflater.from(this).inflate(2130969563, null);
              paramBundle = (CheckBox)localView.findViewById(2131824049);
              this.msA = (((Integer)com.tencent.mm.kernel.g.RP().Ry().get(ac.a.xKR, null)).intValue() + 1);
              com.tencent.mm.kernel.g.RP().Ry().set(ac.a.xKR, Integer.valueOf(this.msA));
              com.tencent.mm.plugin.soter.d.a.fG(1, this.msA);
              com.tencent.mm.ui.base.h.a(this, false, null, localView, getString(2131297758), getString(2131296868), new FingerPrintAuthTransparentUI.9(this), new FingerPrintAuthTransparentUI.10(this, paramBundle));
              AppMethodBeat.o(41611);
            }
            else
            {
              bxR();
              AppMethodBeat.o(41611);
            }
          }
          else
          {
            ab.i("MicroMsg.FingerPrintAuthTransparentUI", "isReg?:" + paramBundle.cQg() + ";isOpenTouch:" + com.tencent.mm.plugin.fingerprint.b.e.bxG());
            ab.e("MicroMsg.FingerPrintAuthTransparentUI", "finish FingerPrintAuthTransparentUI, not show the open guide!");
            finish();
            AppMethodBeat.o(41611);
          }
        }
      }
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(41622);
    if ((this.mst != null) && (this.mst.isShowing()))
    {
      this.mst.dismiss();
      this.mst = null;
    }
    if (this.msx != null)
      this.msx.cancel();
    fE(false);
    super.onDestroy();
    AppMethodBeat.o(41622);
  }

  public void onPause()
  {
    AppMethodBeat.i(41613);
    super.onPause();
    ab.i("MicroMsg.FingerPrintAuthTransparentUI", "alvinluo onPause");
    PowerManager.WakeLock localWakeLock = ((PowerManager)this.mController.ylL.getSystemService("power")).newWakeLock(536870913, "PostLocationService");
    if (localWakeLock != null)
      localWakeLock.acquire();
    bxQ();
    if (localWakeLock != null)
      localWakeLock.release();
    AppMethodBeat.o(41613);
  }

  public void onResume()
  {
    AppMethodBeat.i(41612);
    super.onResume();
    if (this.msz)
      hw(false);
    AppMethodBeat.o(41612);
  }

  public void onStop()
  {
    AppMethodBeat.i(41614);
    super.onStop();
    finish();
    AppMethodBeat.o(41614);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fingerprint.ui.FingerPrintAuthTransparentUI
 * JD-Core Version:    0.6.2
 */