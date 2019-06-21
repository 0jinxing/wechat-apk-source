package com.tencent.mm.plugin.wallet.pwd.ui;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.kernel.g;
import com.tencent.mm.pluginsdk.l;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.f;
import com.tencent.mm.wallet_core.ui.WalletPreferenceUI;

@com.tencent.mm.ui.base.a(0)
public class WalletBiometricPaySettingsUI extends WalletPreferenceUI
{
  private l mrm;
  private Preference tqU;
  private Preference tqV;
  private Preference tqW;
  private Preference tqX;
  private int tqY = 0;
  private boolean tqZ;
  private boolean tra;
  private boolean trb;
  private boolean trc;

  private void Hh(int paramInt)
  {
    AppMethodBeat.i(46232);
    ab.i("MicroMsg.WalletBiometricPaySettingsUI", "start open process: %s", new Object[] { Integer.valueOf(paramInt) });
    Bundle localBundle = new Bundle();
    localBundle.putInt("open_scene", 1);
    localBundle.putInt("key_open_biometric_type", paramInt);
    com.tencent.mm.wallet_core.a.b(this, "FingerprintAuth", localBundle);
    AppMethodBeat.o(46232);
  }

  private void Hi(int paramInt)
  {
    AppMethodBeat.i(46233);
    ab.i("MicroMsg.WalletBiometricPaySettingsUI", "show enroll biometric guide: %s", new Object[] { Integer.valueOf(paramInt) });
    String str = getString(2131305148);
    if (paramInt == 1)
      str = getString(2131305150);
    com.tencent.mm.ui.base.h.a(this, str, "", getString(2131305147), new DialogInterface.OnClickListener()
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
      }
    });
    AppMethodBeat.o(46233);
  }

  private static void a(Preference paramPreference, boolean paramBoolean)
  {
    AppMethodBeat.i(46227);
    if (paramBoolean);
    for (int i = 2130970197; ; i = 2130970198)
    {
      paramPreference.setWidgetLayoutResource(i);
      AppMethodBeat.o(46227);
      return;
    }
  }

  private static boolean a(Preference paramPreference)
  {
    if (paramPreference.yDl == 2130970197);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  private void cOp()
  {
    AppMethodBeat.i(46228);
    if (this.tqY == 1)
    {
      a(this.tqW, false);
      a(this.tqX, false);
    }
    while (true)
    {
      a(this.tqU, true);
      AppMethodBeat.o(46228);
      return;
      a(this.tqV, false);
    }
  }

  private void cOq()
  {
    AppMethodBeat.i(46229);
    if ((this.tqY == 2) || (this.tqY == 3))
    {
      a(this.tqV, true);
      a(this.tqU, false);
    }
    AppMethodBeat.o(46229);
  }

  private void cOr()
  {
    AppMethodBeat.i(46230);
    if (this.tqY == 1)
    {
      a(this.tqW, true);
      a(this.tqX, false);
      a(this.tqU, false);
    }
    AppMethodBeat.o(46230);
  }

  private void cOs()
  {
    AppMethodBeat.i(46231);
    if (this.tqY == 1)
    {
      a(this.tqW, false);
      a(this.tqX, true);
      a(this.tqU, false);
    }
    AppMethodBeat.o(46231);
  }

  private void cOt()
  {
    AppMethodBeat.i(46234);
    ab.i("MicroMsg.WalletBiometricPaySettingsUI", "on click open fingerprint");
    if (this.mrm.bxo())
    {
      Hh(1);
      if (this.tqY == 1)
      {
        cOr();
        AppMethodBeat.o(46234);
      }
    }
    while (true)
    {
      return;
      cOq();
      AppMethodBeat.o(46234);
      continue;
      Hi(1);
      AppMethodBeat.o(46234);
    }
  }

  private void cOu()
  {
    AppMethodBeat.i(46235);
    ab.i("MicroMsg.WalletBiometricPaySettingsUI", "on click open faceid");
    if (this.mrm.bxB())
    {
      Hh(2);
      if (this.tqY == 1)
      {
        cOs();
        AppMethodBeat.o(46235);
      }
    }
    while (true)
    {
      return;
      cOq();
      AppMethodBeat.o(46235);
      continue;
      Hi(2);
      AppMethodBeat.o(46235);
    }
  }

  public final int JC()
  {
    return 2131165310;
  }

  public final boolean a(f paramf, Preference paramPreference)
  {
    AppMethodBeat.i(46226);
    ab.i("MicroMsg.WalletBiometricPaySettingsUI", "click key: %s", new Object[] { paramPreference.mKey });
    this.trc = a(this.tqU);
    if (this.tqY == 1)
    {
      this.tra = a(this.tqX);
      this.trb = a(this.tqW);
    }
    while (true)
    {
      ab.i("MicroMsg.WalletBiometricPaySettingsUI", "is checked: %s", new Object[] { Boolean.valueOf(a(paramPreference)) });
      if (!a(paramPreference))
        break;
      AppMethodBeat.o(46226);
      return false;
      this.tqZ = a(this.tqV);
    }
    if ("biometric_pay_close".equals(paramPreference.mKey))
    {
      paramPreference = getString(2131299868);
      if (this.mrm.bxh())
        paramPreference = getString(2131299555);
      com.tencent.mm.ui.base.h.a(this, false, paramPreference, "", getString(2131296994), getString(2131296868), new WalletBiometricPaySettingsUI.2(this, paramf), new WalletBiometricPaySettingsUI.3(this));
    }
    while (true)
    {
      paramf.notifyDataSetChanged();
      AppMethodBeat.o(46226);
      break;
      if ("key_single_open".equals(paramPreference.mKey))
      {
        if (this.tqY == 2)
          cOt();
        else if (this.tqY == 3)
          cOu();
      }
      else if ("key_fingerprint_open".equals(paramPreference.mKey))
        cOt();
      else if ("key_faceid_open".equals(paramPreference.mKey))
        cOu();
    }
  }

  public final boolean f(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    return false;
  }

  public final void initView()
  {
    AppMethodBeat.i(46224);
    com.tencent.mm.ui.base.preference.h localh = this.yCw;
    this.tqU = localh.aqO("biometric_pay_close");
    this.tqU.NW(8);
    ab.i("MicroMsg.WalletBiometricPaySettingsUI", "fingerprint: %s, faceid: %s", new Object[] { Boolean.valueOf(this.mrm.bxe()), Boolean.valueOf(this.mrm.bxh()) });
    if ((this.tqY == 2) || (this.tqY == 3))
    {
      this.tqV = new Preference(this);
      this.tqV.setKey("key_single_open");
      this.tqV.setTitle(2131304618);
      this.tqV.yDf = false;
      localh.a(this.tqV, 0);
      this.tqV.NW(8);
      AppMethodBeat.o(46224);
    }
    while (true)
    {
      return;
      if (this.tqY == 1)
      {
        this.tqX = new Preference(this);
        this.tqX.setKey("key_faceid_open");
        this.tqX.setTitle(2131304619);
        localh.a(this.tqX, 0);
        this.tqW = new Preference(this);
        this.tqW.setKey("key_fingerprint_open");
        this.tqW.setTitle(2131304620);
        localh.a(this.tqW, 1);
        this.tqX.NW(8);
        this.tqW.NW(8);
      }
      AppMethodBeat.o(46224);
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(46223);
    super.onCreate(paramBundle);
    if ((com.tencent.mm.plugin.wallet.b.a.cOR()) && (com.tencent.mm.plugin.wallet.b.a.cOQ()))
    {
      this.tqY = 1;
      if (this.tqY != 1)
        break label143;
      setMMTitle(2131304617);
    }
    while (true)
    {
      setBackBtn(new WalletBiometricPaySettingsUI.1(this));
      this.mrm = ((l)g.K(l.class));
      ab.i("MicroMsg.WalletBiometricPaySettingsUI", "biometric mode: %s", new Object[] { Integer.valueOf(this.tqY) });
      initView();
      AppMethodBeat.o(46223);
      return;
      if (com.tencent.mm.plugin.wallet.b.a.cOQ())
      {
        this.tqY = 2;
        break;
      }
      if (com.tencent.mm.plugin.wallet.b.a.cOR())
      {
        this.tqY = 3;
        break;
      }
      ab.w("MicroMsg.WalletBiometricPaySettingsUI", "device not support biometric pay!");
      finish();
      break;
      label143: if (this.tqY == 2)
        setMMTitle(2131305135);
      else
        setMMTitle(2131305133);
    }
  }

  public void onResume()
  {
    AppMethodBeat.i(46225);
    super.onResume();
    ab.i("MicroMsg.WalletBiometricPaySettingsUI", "update pref check state: %s, %s", new Object[] { Boolean.valueOf(this.mrm.bxe()), Boolean.valueOf(this.mrm.bxh()) });
    if (this.tqY == 1)
      if (this.mrm.bxe())
        cOr();
    while (true)
    {
      this.yCw.notifyDataSetChanged();
      AppMethodBeat.o(46225);
      return;
      if (this.mrm.bxh())
      {
        cOs();
      }
      else
      {
        cOp();
        continue;
        if ((this.mrm.bxe()) || (this.mrm.bxh()))
          cOq();
        else
          cOp();
      }
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.pwd.ui.WalletBiometricPaySettingsUI
 * JD-Core Version:    0.6.2
 */