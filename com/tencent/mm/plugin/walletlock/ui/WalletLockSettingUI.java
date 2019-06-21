package com.tencent.mm.plugin.walletlock.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.b.a.bj;
import com.tencent.mm.plugin.soter.d.m;
import com.tencent.mm.plugin.walletlock.a.b;
import com.tencent.mm.sdk.g.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.preference.IconPreference;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.f;
import com.tencent.mm.ui.q;
import com.tencent.mm.ui.widget.a.c;

public class WalletLockSettingUI extends MMPreference
{
  private f ehK;
  private int emC = 0;
  private int gOW = -1;
  private c ggF;
  private IconPreference tXi;
  private IconPreference tXj;
  private IconPreference tXk;
  private IconPreference tXl;
  private boolean tXm = false;
  private boolean tXn = true;
  private boolean tXo = true;
  private boolean tXp = true;

  private void JN(String paramString)
  {
    AppMethodBeat.i(51763);
    this.ggF = com.tencent.mm.ui.base.h.a(this, paramString, "", new WalletLockSettingUI.4(this));
    this.ggF.setCanceledOnTouchOutside(false);
    this.ggF.show();
    AppMethodBeat.o(51763);
  }

  private void a(Preference paramPreference, boolean paramBoolean1, boolean paramBoolean2)
  {
    AppMethodBeat.i(51759);
    if ((paramPreference instanceof IconPreference))
    {
      paramPreference = (IconPreference)paramPreference;
      paramPreference.hn(com.tencent.mm.bz.a.fromDPToPix(this, 20), com.tencent.mm.bz.a.fromDPToPix(this, 20));
      if (paramBoolean1)
        if (paramBoolean2)
        {
          paramPreference.NO(2131231853);
          paramPreference.NP(0);
          AppMethodBeat.o(51759);
        }
    }
    while (true)
    {
      return;
      paramPreference.NO(2131231851);
      break;
      paramPreference.NO(2131231852);
      paramPreference.NP(0);
      AppMethodBeat.o(51759);
    }
  }

  private void cUh()
  {
    AppMethodBeat.i(51754);
    cUl();
    ab.i("MicroMsg.WalletLockSettingUI", "alvinluo current wallet lock type: %d", new Object[] { Integer.valueOf(com.tencent.mm.plugin.walletlock.c.g.tWY.cTV()) });
    cUi();
    cUj();
    cUk();
    AppMethodBeat.o(51754);
  }

  private void cUi()
  {
    AppMethodBeat.i(51755);
    com.tencent.mm.plugin.walletlock.c.g localg = com.tencent.mm.plugin.walletlock.c.g.tWY;
    if (!com.tencent.mm.plugin.walletlock.c.g.cTZ())
    {
      ab.w("MicroMsg.WalletLockSettingUI", "alvinluo FingerprintLock entry is not opened and don't show FingerprintLock entry");
      this.ehK.ce("wallet_lock_fingerprint", true);
      AppMethodBeat.o(51755);
    }
    while (true)
    {
      return;
      boolean bool = m.eT(this.mController.ylL);
      localg = com.tencent.mm.plugin.walletlock.c.g.tWY;
      if (com.tencent.mm.plugin.walletlock.c.g.cTn())
      {
        if (!bool)
        {
          this.ehK.ce("wallet_lock_fingerprint", false);
          this.tXi.setDesc(getString(2131304879));
          this.tXi.dAy();
          a(this.tXi, true, false);
          this.tXi.setEnabled(false);
          this.tXi.yBZ = true;
          this.tXo = false;
          AppMethodBeat.o(51755);
        }
        else if (this.tXn)
        {
          this.ehK.ce("wallet_lock_fingerprint", false);
          a(this.tXi, true, true);
          AppMethodBeat.o(51755);
        }
      }
      else if (!bool)
      {
        this.ehK.ce("wallet_lock_fingerprint", true);
        AppMethodBeat.o(51755);
      }
      else
      {
        this.ehK.ce("wallet_lock_fingerprint", false);
        a(this.tXi, false, true);
        AppMethodBeat.o(51755);
      }
    }
  }

  private void cUj()
  {
    AppMethodBeat.i(51756);
    com.tencent.mm.plugin.walletlock.c.g localg = com.tencent.mm.plugin.walletlock.c.g.tWY;
    ab.i("MicroMsg.WalletLockSettingUI", "alvinluo isUserSetGesturePwd: %b", new Object[] { Boolean.valueOf(com.tencent.mm.plugin.walletlock.c.g.cTz()) });
    if ((com.tencent.mm.plugin.walletlock.c.g.tWY.cTV() == 2) || (com.tencent.mm.plugin.walletlock.c.g.tWY.cTV() == 3))
    {
      a(this.tXj, false, true);
      this.ehK.ce("wallet_lock_modify_gesture", true);
      AppMethodBeat.o(51756);
    }
    while (true)
    {
      return;
      if (com.tencent.mm.plugin.walletlock.c.g.tWY.cTV() == 1)
      {
        if (this.tXn)
        {
          a(this.tXj, true, true);
          this.ehK.ce("wallet_lock_modify_gesture", false);
          AppMethodBeat.o(51756);
        }
      }
      else
      {
        a(this.tXj, false, true);
        this.ehK.ce("wallet_lock_modify_gesture", true);
        AppMethodBeat.o(51756);
      }
    }
  }

  private void cUk()
  {
    AppMethodBeat.i(51757);
    if (com.tencent.mm.plugin.walletlock.c.g.tWY.cTV() == 0)
    {
      if (!this.tXn)
        break label47;
      a(this.tXk, true, true);
      AppMethodBeat.o(51757);
    }
    while (true)
    {
      return;
      a(this.tXk, false, true);
      label47: AppMethodBeat.o(51757);
    }
  }

  private void cUl()
  {
    AppMethodBeat.i(51758);
    if ((this.tXi != null) && (this.tXo))
      a(this.tXi, false, this.tXo);
    if ((this.tXl != null) && (this.tXp))
      a(this.tXl, false, this.tXp);
    if (this.tXj != null)
      a(this.tXj, false, true);
    if (this.tXk != null)
      a(this.tXk, false, true);
    AppMethodBeat.o(51758);
  }

  private void cUm()
  {
    AppMethodBeat.i(51761);
    this.ggF = com.tencent.mm.ui.base.h.a(this, getString(2131304897), "", new WalletLockSettingUI.2(this));
    this.ggF.setCanceledOnTouchOutside(false);
    AppMethodBeat.o(51761);
  }

  private void j(int paramInt, Intent paramIntent)
  {
    AppMethodBeat.i(51753);
    setResult(paramInt, paramIntent);
    finish();
    AppMethodBeat.o(51753);
  }

  private void w(int paramInt1, int paramInt2, String paramString)
  {
    AppMethodBeat.i(51752);
    Intent localIntent = new Intent();
    localIntent.putExtra("key_err_code", paramInt2);
    localIntent.putExtra("key_err_msg", paramString);
    j(paramInt1, localIntent);
    AppMethodBeat.o(51752);
  }

  public final int JC()
  {
    return 2131165312;
  }

  public final boolean a(f paramf, Preference paramPreference)
  {
    AppMethodBeat.i(51760);
    boolean bool;
    if ("wallet_lock_fingerprint".equals(paramPreference.mKey))
    {
      cUl();
      a(paramPreference, true, true);
      if ((this.tXo) && ((!this.tXn) || (com.tencent.mm.plugin.walletlock.c.g.tWY.cTV() != 2)))
      {
        if (!com.tencent.soter.core.a.iR(this))
          cUm();
      }
      else
      {
        AppMethodBeat.o(51760);
        bool = true;
      }
    }
    while (true)
    {
      return bool;
      if ((this.tXn) && (com.tencent.mm.plugin.walletlock.c.g.tWY.cTV() == 2))
        break;
      ab.i("MicroMsg.WalletLockSettingUI", "alvinluo request open fingerprint lock");
      ((b)com.tencent.mm.kernel.g.K(b.class)).b(this, 2, 1);
      break;
      if ("wallet_lock_faceid".equals(paramPreference.mKey))
      {
        cUl();
        a(paramPreference, true, true);
        if ((this.tXp) && ((!this.tXn) || (com.tencent.mm.plugin.walletlock.c.g.tWY.cTV() != 3)))
        {
          if (com.tencent.soter.core.a.iS(this))
            break label189;
          cUm();
        }
        while (true)
        {
          AppMethodBeat.o(51760);
          bool = true;
          break;
          label189: if ((!this.tXn) || (com.tencent.mm.plugin.walletlock.c.g.tWY.cTV() == 3))
          {
            ab.i("MicroMsg.WalletLockSettingUI", "request open faceid lock");
            ((b)com.tencent.mm.kernel.g.K(b.class)).b(this, 3, 4);
          }
        }
      }
      if ("wallet_lock_gesture".equals(paramPreference.mKey))
      {
        cUl();
        a(paramPreference, true, true);
        if (com.tencent.mm.plugin.walletlock.c.g.tWY.cTV() != 1)
        {
          ab.i("MicroMsg.WalletLockSettingUI", "alvinluo request open gesture lock");
          ((b)com.tencent.mm.kernel.g.K(b.class)).b(this, 1, 2);
        }
        AppMethodBeat.o(51760);
        bool = true;
      }
      else if ("wallet_lock_close".equals(paramPreference.mKey))
      {
        cUl();
        a(paramPreference, true, true);
        if (com.tencent.mm.plugin.walletlock.c.g.tWY.cTV() != 0)
        {
          ab.i("MicroMsg.WalletLockSettingUI", "alvinluo request close wallet lock");
          ((b)com.tencent.mm.kernel.g.K(b.class)).i(this, 3);
          paramf = new bj();
          paramf.cVT = 14L;
          paramf.dcm = 1L;
          paramf.ajK();
        }
        AppMethodBeat.o(51760);
        bool = true;
      }
      else if ("wallet_lock_modify_gesture".equals(paramPreference.mKey))
      {
        ((b)com.tencent.mm.kernel.g.K(b.class)).ad(this);
        AppMethodBeat.o(51760);
        bool = true;
      }
      else
      {
        bool = false;
        AppMethodBeat.o(51760);
      }
    }
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(51762);
    ab.i("MicroMsg.WalletLockSettingUI", "alvinluo onActivityResult requestCode: %d, resultCode: %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if (paramIntent == null)
    {
      ab.e("MicroMsg.WalletLockSettingUI", "alvinluo data is null");
      AppMethodBeat.o(51762);
    }
    while (true)
    {
      return;
      int i = paramIntent.getIntExtra("key_err_code", -1);
      ab.i("MicroMsg.WalletLockSettingUI", "alvinluo wallet lock setting onActivityResult errCode: %d", new Object[] { Integer.valueOf(i) });
      if (paramInt1 == 1)
      {
        ab.i("MicroMsg.WalletLockSettingUI", "alvinluo request open fingerprint lock onActivityResult");
        if (i == 0)
        {
          if (this.tXm)
          {
            j(paramInt2, paramIntent);
            AppMethodBeat.o(51762);
          }
        }
        else if (i != 4)
        {
          ab.i("MicroMsg.WalletLockSettingUI", "alvinluo open fingerprint lock failed");
          JN(getString(2131304882));
          AppMethodBeat.o(51762);
        }
      }
      else if (paramInt1 == 2)
      {
        ab.i("MicroMsg.WalletLockSettingUI", "alvinluo request open gesture onActivityResult");
        if (i == 0)
        {
          if (this.tXm)
            j(paramInt2, paramIntent);
          d.post(new WalletLockSettingUI.3(this), "WalletLockRemoveAuthKey");
          AppMethodBeat.o(51762);
        }
        else if (i != 4)
        {
          ab.i("MicroMsg.WalletLockSettingUI", "alvinluo open gesture lock failed");
          JN(getString(2131304894));
          AppMethodBeat.o(51762);
        }
      }
      else if (paramInt1 == 3)
      {
        if (i == 0)
        {
          ((b)com.tencent.mm.kernel.g.K(b.class)).HB(0);
          paramIntent = com.tencent.mm.plugin.walletlock.c.g.tWY;
          com.tencent.mm.plugin.walletlock.c.g.cTq();
          cUh();
          Toast.makeText(this, getString(2131304876), 0).show();
          com.tencent.mm.plugin.walletlock.c.h.cUb();
          if (this.tXm)
            w(-1, 0, "close wallet lock ok");
          d.post(new WalletLockSettingUI.5(this), "WalletLockRemoveAuthKey");
          paramIntent = new bj();
          paramIntent.cVT = 14L;
          paramIntent.dcm = 2L;
          paramIntent.ajK();
          AppMethodBeat.o(51762);
        }
        else if (i != 4)
        {
          JN(getString(2131304877));
        }
      }
      else
      {
        AppMethodBeat.o(51762);
      }
    }
  }

  public void onBackPressed()
  {
    AppMethodBeat.i(51751);
    ab.i("MicroMsg.WalletLockSettingUI", "alvinluo onBackPressed");
    if (this.tXm)
    {
      w(0, 4, "user cancel setting wallet lock");
      AppMethodBeat.o(51751);
    }
    while (true)
    {
      return;
      finish();
      AppMethodBeat.o(51751);
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(51748);
    super.onCreate(paramBundle);
    setBackBtn(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        AppMethodBeat.i(51744);
        if (WalletLockSettingUI.a(WalletLockSettingUI.this))
          WalletLockSettingUI.a(WalletLockSettingUI.this, "user cancel setting wallet lock");
        while (true)
        {
          AppMethodBeat.o(51744);
          return false;
          WalletLockSettingUI.this.finish();
        }
      }
    });
    setMMTitle(2131304901);
    this.ehK = this.yCw;
    this.ehK = this.yCw;
    this.tXi = ((IconPreference)this.ehK.aqO("wallet_lock_fingerprint"));
    this.tXj = ((IconPreference)this.ehK.aqO("wallet_lock_gesture"));
    this.tXk = ((IconPreference)this.ehK.aqO("wallet_lock_close"));
    this.tXl = ((IconPreference)this.ehK.aqO("wallet_lock_faceid"));
    this.tXi.NW(8);
    this.tXj.NW(8);
    this.tXk.NW(8);
    this.tXl.NW(8);
    this.ehK.ce("wallet_lock_faceid", true);
    this.emC = getIntent().getIntExtra("wallet_lock_jsapi_scene", 0);
    this.gOW = getIntent().getIntExtra("key_wallet_lock_setting_scene", -1);
    if (this.gOW == 1)
    {
      this.tXm = true;
      this.tXn = false;
    }
    paramBundle = new bj();
    paramBundle.cVT = 13L;
    paramBundle.dcm = 1L;
    paramBundle.dcn = this.emC;
    paramBundle.ajK();
    ab.i("MicroMsg.WalletLockSettingUI", "alvinluo isNeedFinish: %b, isNeedShowOpenIcon: %b", new Object[] { Boolean.valueOf(this.tXm), Boolean.valueOf(this.tXn) });
    AppMethodBeat.o(51748);
  }

  public void onPause()
  {
    AppMethodBeat.i(51750);
    super.onPause();
    if ((this.ggF != null) && (this.ggF.isShowing()))
      this.ggF.dismiss();
    AppMethodBeat.o(51750);
  }

  public void onResume()
  {
    AppMethodBeat.i(51749);
    super.onResume();
    cUh();
    AppMethodBeat.o(51749);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.walletlock.ui.WalletLockSettingUI
 * JD-Core Version:    0.6.2
 */