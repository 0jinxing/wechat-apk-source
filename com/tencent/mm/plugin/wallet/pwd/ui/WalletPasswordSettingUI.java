package com.tencent.mm.plugin.wallet.pwd.ui;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.bp.d;
import com.tencent.mm.g.a.on;
import com.tencent.mm.g.a.se;
import com.tencent.mm.g.a.um;
import com.tencent.mm.g.b.a.bi;
import com.tencent.mm.g.b.a.bj;
import com.tencent.mm.plugin.expt.a.a.a;
import com.tencent.mm.plugin.wallet.pwd.a.j;
import com.tencent.mm.plugin.wallet_core.model.ad;
import com.tencent.mm.pluginsdk.l;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.preference.CheckBoxPreference;
import com.tencent.mm.ui.base.preference.IconPreference;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.q;

public class WalletPasswordSettingUI extends MMPreference
  implements com.tencent.mm.ai.f
{
  private boolean eFu;
  private com.tencent.mm.ui.base.preference.f ehK;
  private Dialog gII;
  private com.tencent.mm.sdk.platformtools.ak handler;
  c tmk;
  CheckBoxPreference tsg;
  RightBelowPreference tsh;
  private boolean tsi;
  private IconPreference tsj;
  private Preference tsk;
  private String tsl;
  private String tsm;
  private String tsn;
  private ad tso;
  private ad tsp;
  private ad tsq;
  private boolean tsr;
  private int tss;
  private int tst;

  public WalletPasswordSettingUI()
  {
    AppMethodBeat.i(46361);
    this.tsi = false;
    this.tsr = false;
    this.tss = 0;
    this.tst = 0;
    this.handler = new com.tencent.mm.sdk.platformtools.ak(new WalletPasswordSettingUI.1(this));
    this.tmk = new c()
    {
    };
    AppMethodBeat.o(46361);
  }

  private void a(ad paramad)
  {
    AppMethodBeat.i(46371);
    switch (paramad.field_jump_type)
    {
    case 6:
    case 7:
    default:
    case 1:
    case 2:
    case 3:
    case 4:
    case 5:
    case 8:
    }
    while (true)
    {
      AppMethodBeat.o(46371);
      while (true)
      {
        return;
        ab.i("MicroMsg.WalletPasswordSettingUI", "jump type h5, url: %s", new Object[] { paramad.field_pref_url });
        if (bo.isNullOrNil(paramad.field_pref_url))
          break;
        com.tencent.mm.wallet_core.ui.e.n(this, paramad.field_pref_url, false);
        AppMethodBeat.o(46371);
        continue;
        if (bo.isNullOrNil(paramad.field_tinyapp_username))
          break;
        se localse = new se();
        localse.cOf.userName = paramad.field_tinyapp_username;
        localse.cOf.cOh = bo.bc(paramad.field_tinyapp_path, "");
        localse.cOf.scene = 1066;
        localse.cOf.cOi = 0;
        com.tencent.mm.sdk.b.a.xxA.m(localse);
        AppMethodBeat.o(46371);
        continue;
        ab.i("MicroMsg.WalletPasswordSettingUI", "jump type payment management");
        d.H(this, "wallet", ".pwd.ui.WalletPasswordSettingUI");
        AppMethodBeat.o(46371);
        continue;
        ab.i("MicroMsg.WalletPasswordSettingUI", "jump type payment security");
        paramad = new Intent();
        paramad.putExtra("wallet_lock_jsapi_scene", 1);
        d.b(this, "wallet", ".pwd.ui.WalletSecuritySettingUI", paramad);
        new bj();
        AppMethodBeat.o(46371);
        continue;
        ab.i("MicroMsg.WalletPasswordSettingUI", "jump type wallet switch");
        d.c(this, "wallet_core", ".ui.WalletSwitchWalletCurrencyUI", 65281);
        AppMethodBeat.o(46371);
      }
      ab.i("MicroMsg.WalletPasswordSettingUI", "jump type honey pay");
      d.H(this, "honey_pay", ".ui.HoneyPayMainUI");
    }
  }

  private void cOE()
  {
    AppMethodBeat.i(46364);
    com.tencent.mm.kernel.g.RQ();
    String str1 = (String)com.tencent.mm.kernel.g.RP().Ry().get(ac.a.xTp, "");
    com.tencent.mm.kernel.g.RQ();
    String str2 = (String)com.tencent.mm.kernel.g.RP().Ry().get(ac.a.xTq, "");
    ab.i("MicroMsg.WalletPasswordSettingUI", "updateUnRegPref unreg_title %s unreg_url %s", new Object[] { str1, str2 });
    if ((!bo.isNullOrNil(str1)) && (!bo.isNullOrNil(str2)))
    {
      this.ehK.ce("wallet_password_setting_un_reg", false);
      AppMethodBeat.o(46364);
    }
    while (true)
    {
      return;
      this.ehK.ce("wallet_password_setting_un_reg", true);
      AppMethodBeat.o(46364);
    }
  }

  private void gK(String paramString1, String paramString2)
  {
    AppMethodBeat.i(46363);
    this.tsj.setTitle(paramString1);
    if (!bo.isNullOrNil(paramString2))
    {
      this.ehK.ce("wallet_open_auto_pay", false);
      AppMethodBeat.o(46363);
    }
    while (true)
    {
      return;
      this.ehK.ce("wallet_open_auto_pay", true);
      ab.e("MicroMsg.WalletPasswordSettingUI", "deduct_url is null");
      AppMethodBeat.o(46363);
    }
  }

  private void nb(boolean paramBoolean)
  {
    AppMethodBeat.i(46369);
    this.ehZ.edit().putBoolean("wallet_fingerprint_switch", paramBoolean).commit();
    this.tsg.uOT = paramBoolean;
    this.ehK.notifyDataSetChanged();
    AppMethodBeat.o(46369);
  }

  private void nc(boolean paramBoolean)
  {
    AppMethodBeat.i(46374);
    j localj = new j();
    com.tencent.mm.kernel.g.RQ();
    com.tencent.mm.kernel.g.RO().eJo.a(localj, 0);
    this.tsr = true;
    if (paramBoolean)
      this.gII = com.tencent.mm.wallet_core.ui.g.a(this, false, new WalletPasswordSettingUI.4(this));
    AppMethodBeat.o(46374);
  }

  public final int JC()
  {
    return -1;
  }

  public final boolean a(com.tencent.mm.ui.base.preference.f paramf, Preference paramPreference)
  {
    AppMethodBeat.i(46370);
    boolean bool;
    if ("wallet_modify_password".equals(paramPreference.mKey))
    {
      cOG();
      com.tencent.mm.wallet_core.ui.e.QS(24);
      AppMethodBeat.o(46370);
      bool = true;
    }
    while (true)
    {
      return bool;
      if ("wallet_forget_password".equals(paramPreference.mKey))
      {
        com.tencent.mm.kernel.g.RQ();
        paramf = (String)com.tencent.mm.kernel.g.RP().Ry().get(ac.a.xNM, "");
        if (!bo.isNullOrNil(paramf))
        {
          ab.i("MicroMsg.WalletPasswordSettingUI", "jump to forget_url %s", new Object[] { paramf });
          paramPreference = new Intent();
          paramPreference.putExtra("rawUrl", paramf);
          paramPreference.putExtra("showShare", false);
          d.b(this, "webview", ".ui.tools.WebViewUI", paramPreference);
          paramf = new bi();
          paramf.dck = 2L;
          paramf.dcl = 2L;
          paramf.ajK();
          AppMethodBeat.o(46370);
          bool = true;
        }
        else
        {
          paramf = com.tencent.mm.plugin.wallet_core.model.r.cPI().cQu();
          if (!bo.isNullOrNil(paramf))
          {
            ab.i("MicroMsg.WalletPasswordSettingUI", "jump to forget url: %s", new Object[] { paramf });
            com.tencent.mm.wallet_core.ui.e.n(this, paramf, false);
            AppMethodBeat.o(46370);
            bool = true;
          }
          else
          {
            cOH();
            paramf = new bi();
            paramf.dck = 2L;
            paramf.dcl = 1L;
            paramf.ajK();
            com.tencent.mm.wallet_core.ui.e.QS(25);
            AppMethodBeat.o(46370);
            bool = true;
          }
        }
      }
      else
      {
        if ("wallet_realname_verify".equals(paramPreference.mKey))
        {
          if (com.tencent.mm.plugin.wallet_core.model.r.cPI().cQg())
            if (!bo.isNullOrNil(this.tsm))
            {
              ab.i("MicroMsg.WalletPasswordSettingUI", "jump to mRealnameUrl");
              paramf = new Intent();
              paramf.putExtra("rawUrl", this.tsm);
              paramf.putExtra("showShare", false);
              d.b(this, "webview", ".ui.tools.WebViewUI", paramf);
            }
          while (true)
          {
            AppMethodBeat.o(46370);
            bool = true;
            break;
            ab.e("MicroMsg.WalletPasswordSettingUI", "mRealnameUrl is null");
            continue;
            ab.i("MicroMsg.WalletPasswordSettingUI", "go to RealNameVerifyProcess");
            paramf = new Bundle();
            paramf.putInt("real_name_verify_mode", 0);
            paramf.putString("realname_verify_process_jump_plugin", "wallet");
            paramf.putString("realname_verify_process_jump_activity", ".pwd.ui.WalletPasswordSettingUI");
            com.tencent.mm.wallet_core.a.a(this, com.tencent.mm.plugin.wallet_core.id_verify.a.class, paramf, new WalletPasswordSettingUI.7(this));
          }
        }
        if ("wallet_biometric_pay".equals(paramPreference.mKey))
        {
          startActivity(new Intent(this, WalletBiometricPaySettingsUI.class));
          AppMethodBeat.o(46370);
          bool = true;
        }
        else if ("wallet_open_auto_pay".equals(paramPreference.mKey))
        {
          if (!bo.isNullOrNil(this.tsl))
          {
            ab.i("MicroMsg.WalletPasswordSettingUI", "mDeductUrl is not null,jump!");
            paramf = new Intent();
            paramf.putExtra("rawUrl", this.tsl);
            paramf.putExtra("showShare", false);
            d.b(this, "webview", ".ui.tools.WebViewUI", paramf);
            this.tsj.NM(8);
            AppMethodBeat.o(46370);
            bool = true;
          }
          else
          {
            ab.e("MicroMsg.WalletPasswordSettingUI", "mDeductUrl is null");
          }
        }
        else if ("wallet_digitalcert".equals(paramPreference.mKey))
        {
          if (!this.tsr)
          {
            paramf = new j();
            com.tencent.mm.kernel.g.RQ();
            com.tencent.mm.kernel.g.RO().eJo.a(paramf, 0);
          }
          d.b(this, "wallet", ".pwd.ui.WalletDigitalCertUI", new Intent());
          AppMethodBeat.o(46370);
          bool = true;
        }
        else if ("wallet_delay_transfer_date".equals(paramPreference.mKey))
        {
          startActivity(new Intent(this, WalletDelayTransferSettingUI.class));
          AppMethodBeat.o(46370);
          bool = true;
        }
        else
        {
          if ("wallet_password_setting_un_reg".equals(paramPreference.mKey))
          {
            com.tencent.mm.kernel.g.RQ();
            paramf = (String)com.tencent.mm.kernel.g.RP().Ry().get(ac.a.xTq, "");
            Intent localIntent = new Intent();
            localIntent.putExtra("rawUrl", paramf);
            localIntent.putExtra("showShare", false);
            d.b(this, "webview", ".ui.tools.WebViewUI", localIntent);
          }
          if ("wallet_switch_currency".equals(paramPreference.mKey))
          {
            a(this.tsp);
            AppMethodBeat.o(46370);
            bool = true;
          }
          else if ("wallet_im_mch".equals(paramPreference.mKey))
          {
            a(this.tsq);
            AppMethodBeat.o(46370);
            bool = true;
          }
          else if ("wallet_universal_pay_order".equals(paramPreference.mKey))
          {
            startActivity(new Intent(this.mController.ylL, WalletUniversalPayOrderUI.class));
            AppMethodBeat.o(46370);
            bool = true;
          }
          else if ("wallet_function_settings".equals(paramPreference.mKey))
          {
            d.H(this.mController.ylL, "mall", ".ui.MallFunctionSettingsUI");
            AppMethodBeat.o(46370);
            bool = true;
          }
          else
          {
            AppMethodBeat.o(46370);
            bool = false;
          }
        }
      }
    }
  }

  protected int cOF()
  {
    return 2131165313;
  }

  protected void cOG()
  {
    AppMethodBeat.i(46367);
    com.tencent.mm.wallet_core.a.a(this, com.tencent.mm.plugin.wallet.pwd.b.class, null, null);
    AppMethodBeat.o(46367);
  }

  protected void cOH()
  {
    AppMethodBeat.i(46368);
    Bundle localBundle = new Bundle();
    localBundle.putBoolean("key_is_paymanager", true);
    localBundle.putInt("key_forgot_scene", 2);
    com.tencent.mm.wallet_core.a.a(this, com.tencent.mm.plugin.wallet.pwd.a.class, localBundle, null);
    AppMethodBeat.o(46368);
  }

  protected void cOI()
  {
    AppMethodBeat.i(46373);
    Object localObject;
    boolean bool1;
    label240: boolean bool2;
    label321: label368: long l;
    int i;
    if ((com.tencent.mm.plugin.wallet_core.model.r.cPI().cQi()) || (com.tencent.mm.plugin.wallet_core.model.r.cPI().cQh()))
    {
      this.ehK.ce("wallet_modify_password", true);
      this.ehK.ce("wallet_forget_password", true);
      this.ehK.ce("wallet_realname_verify", false);
      this.ehK.aqO("wallet_realname_verify").setSummary(2131305140);
      this.ehK.ce("wallet_universal_pay_order", true);
      this.ehK.ce("wallet_switch_currency", true);
      this.ehK.ce("wallet_switch_category", true);
      this.ehK.ce("wallet_biometric_pay", true);
      this.ehK.ce("wallet_universal_pay_order", true);
      this.ehK.ce("wallet_digitalcert", true);
      this.tsp = com.tencent.mm.plugin.wallet_core.model.r.cPH().acO("wallet_switch_currency");
      if ((this.tsp == null) || (this.tsp.field_is_show != 1))
        break label872;
      this.ehK.ce("wallet_switch_currency", false);
      localObject = this.ehK.aqO("wallet_switch_currency");
      ((Preference)localObject).setTitle(this.tsp.field_pref_title);
      ((Preference)localObject).setSummary(this.tsp.field_pref_desc);
      bool1 = false;
      this.tsq = com.tencent.mm.plugin.wallet_core.model.r.cPH().acO("wallet_im_mch");
      if ((this.tsq == null) || (this.tsq.field_is_show != 1))
        break label890;
      this.ehK.ce("wallet_im_mch", false);
      localObject = this.ehK.aqO("wallet_im_mch");
      ((Preference)localObject).setTitle(this.tsq.field_pref_title);
      ((Preference)localObject).setSummary(this.tsq.field_pref_desc);
      bool2 = false;
      ab.i("MicroMsg.WalletPasswordSettingUI", "hideSwitch: %s, hideImMch: %s", new Object[] { Boolean.valueOf(bool1), Boolean.valueOf(bool2) });
      if ((!bool1) || (!bool2))
        break label908;
      this.ehK.ce("wallet_switch_category", true);
      com.tencent.mm.kernel.g.RQ();
      l = ((Long)com.tencent.mm.kernel.g.RP().Ry().get(147457, Long.valueOf(0L))).longValue();
      i = 2131304773;
      if ((0x10 & l) == 0L)
        break label924;
      i = 2131304772;
      label417: this.ehK.aqO("wallet_delay_transfer_date").setSummary(i);
      if (((com.tencent.mm.plugin.expt.a.a)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.expt.a.a.class)).a(a.a.lJj, 0) != 0)
        break label943;
      this.ehK.ce("wallet_function_settings", true);
    }
    while (true)
    {
      this.ehK.notifyDataSetChanged();
      AppMethodBeat.o(46373);
      return;
      if (com.tencent.mm.plugin.wallet_core.model.r.cPI().cQg())
      {
        this.ehK.ce("wallet_modify_password", false);
        this.ehK.ce("wallet_forget_password", false);
        this.ehK.ce("wallet_realname_verify", false);
        this.ehK.aqO("wallet_realname_verify").setSummary(2131305146);
        this.ehK.ce("wallet_universal_pay_order", true);
        if ((com.tencent.mm.plugin.wallet_core.model.r.cPI().cQi()) || (com.tencent.mm.plugin.wallet_core.model.r.cPI().cQh()))
        {
          this.ehK.ce("wallet_biometric_pay", true);
          break;
        }
        localObject = (l)com.tencent.mm.kernel.g.K(l.class);
        if ((com.tencent.mm.plugin.wallet.b.a.cOQ()) && (com.tencent.mm.plugin.wallet.b.a.cOR()))
        {
          this.tsh.setTitle(2131305130);
          this.tsh.setSummary(2131305129);
          if (((l)localObject).bxh())
          {
            this.tsh.L(getString(2131304621));
            break;
          }
          if (((l)localObject).bxe())
          {
            this.tsh.L(getString(2131304622));
            break;
          }
          this.tsh.L(getString(2131303987));
          break;
        }
        if (com.tencent.mm.plugin.wallet.b.a.cOQ())
        {
          this.tsh.setTitle(2131305128);
          this.tsh.setSummary(2131305127);
          if (((l)localObject).bxe())
          {
            this.tsh.L(getString(2131303976));
            break;
          }
          this.tsh.L(getString(2131303987));
          break;
        }
        if (com.tencent.mm.plugin.wallet.b.a.cOR())
        {
          this.tsh.setTitle(2131305126);
          this.tsh.setSummary(2131305125);
          if (((l)localObject).bxh())
          {
            this.tsh.L(getString(2131303976));
            break;
          }
          this.tsh.L(getString(2131303987));
          break;
        }
        this.ehK.ce("wallet_biometric_pay", true);
        break;
      }
      ab.e("MicroMsg.WalletPasswordSettingUI", "unknow reg state");
      break;
      label872: this.ehK.ce("wallet_switch_currency", true);
      bool1 = true;
      break label240;
      label890: this.ehK.ce("wallet_im_mch", true);
      bool2 = true;
      break label321;
      label908: this.ehK.ce("wallet_switch_category", false);
      break label368;
      label924: if ((l & 0x20) == 0L)
        break label417;
      i = 2131304771;
      break label417;
      label943: this.ehK.ce("wallet_function_settings", false);
    }
  }

  public final void initView()
  {
    AppMethodBeat.i(46366);
    setMMTitle(com.tencent.mm.wallet_core.c.ae.is(this));
    com.tencent.mm.wallet_core.ui.e.dOJ();
    this.ehK = this.yCw;
    this.ehK.addPreferencesFromResource(cOF());
    this.tsj = ((IconPreference)this.ehK.aqO("wallet_open_auto_pay"));
    this.tsk = this.ehK.aqO("wallet_delay_transfer_date");
    com.tencent.mm.kernel.g.RQ();
    if (!((Boolean)com.tencent.mm.kernel.g.RP().Ry().get(ac.a.xNu, Boolean.FALSE)).booleanValue())
    {
      this.tsj.ez(getString(2131296988), 2130839673);
      this.tsj.NM(0);
      com.tencent.mm.kernel.g.RQ();
      com.tencent.mm.kernel.g.RP().Ry().set(ac.a.xNu, Boolean.TRUE);
    }
    this.tsg = ((CheckBoxPreference)this.ehK.aqO("wallet_fingerprint_switch"));
    this.tsh = ((RightBelowPreference)this.ehK.aqO("wallet_biometric_pay"));
    cOI();
    this.ehK.ce("nfc_idpay", true);
    this.ehK.ce("wallet_open_auto_pay", true);
    this.ehK.ce("wallet_universal_pay_order", true);
    cOE();
    setBackBtn(new WalletPasswordSettingUI.6(this));
    if (com.tencent.mm.plugin.wallet.b.a.cOR())
      com.tencent.mm.plugin.report.service.h.pYm.e(15817, new Object[] { Integer.valueOf(0) });
    AppMethodBeat.o(46366);
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(46372);
    if ((paramInt1 == 65281) && (paramInt2 == -1))
    {
      if (!com.tencent.mm.model.r.YN())
        break label41;
      finish();
    }
    while (true)
    {
      super.onActivityResult(paramInt1, paramInt2, paramIntent);
      AppMethodBeat.o(46372);
      return;
      label41: finish();
      on localon = new on();
      localon.cKQ.context = this.mController.ylL;
      com.tencent.mm.sdk.b.a.xxA.m(localon);
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(46362);
    this.yll = true;
    super.onCreate(paramBundle);
    xE(this.mController.dyj());
    com.tencent.mm.kernel.g.RQ();
    com.tencent.mm.kernel.g.RO().eJo.a(385, this);
    com.tencent.mm.sdk.b.a.xxA.c(this.tmk);
    this.eFu = getIntent().getBooleanExtra("key_is_from_system", false);
    this.tsi = getIntent().getBooleanExtra("key_default_show_currency", false);
    if (this.eFu)
    {
      ab.i("MicroMsg.WalletPasswordSettingUI", "hy: enter password setting from system setting");
      ((com.tencent.mm.plugin.walletlock.a.b)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.walletlock.a.b.class)).a(this, null);
    }
    initView();
    if (j.bxX())
    {
      nc(false);
      com.tencent.mm.kernel.g.RQ();
      this.tss = ((Integer)com.tencent.mm.kernel.g.RP().Ry().get(ac.a.xPR, Integer.valueOf(0))).intValue();
      com.tencent.mm.kernel.g.RQ();
      this.tsn = ((String)com.tencent.mm.kernel.g.RP().Ry().get(ac.a.xPM, ""));
      if (!bo.isNullOrNil(this.tsn))
        break label406;
      com.tencent.mm.plugin.wallet_core.c.ae.a(true, null);
    }
    while (true)
    {
      if (this.tss == 0)
        this.ehK.ce("wallet_delay_transfer_date", true);
      AppMethodBeat.o(46362);
      return;
      com.tencent.mm.kernel.g.RQ();
      this.tsm = ((String)com.tencent.mm.kernel.g.RP().Ry().get(ac.a.xND, ""));
      this.tso = com.tencent.mm.plugin.wallet_core.model.r.cPH().acO("wallet_open_auto_pay");
      if ((this.tso != null) && (this.tso.field_is_show == 1) && (!bo.isNullOrNil(this.tso.field_pref_url)))
      {
        ab.i("MicroMsg.WalletPasswordSettingUI", "deduct info from cache is not null");
        this.tsl = this.tso.field_pref_url;
        gK(this.tso.field_pref_title, this.tso.field_pref_url);
        break;
      }
      if (this.tso == null)
      {
        ab.i("MicroMsg.WalletPasswordSettingUI", "deduct info from cache is null");
        break;
      }
      ab.i("MicroMsg.WalletPasswordSettingUI", "mOpenAutoPayPrefInfo.field_is_show = " + this.tso.field_is_show + " and mOpenAutoPayPrefInfo.field_pref_url is null?" + bo.isNullOrNil(this.tso.field_pref_url));
      break;
      label406: this.tsk.setTitle(this.tsn);
      com.tencent.mm.plugin.wallet_core.c.ae.a(false, null);
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(46376);
    super.onDestroy();
    com.tencent.mm.sdk.b.a.xxA.d(this.tmk);
    com.tencent.mm.kernel.g.RQ();
    com.tencent.mm.kernel.g.RO().eJo.b(385, this);
    AppMethodBeat.o(46376);
  }

  public void onResume()
  {
    AppMethodBeat.i(46365);
    super.onResume();
    if (((com.tencent.mm.plugin.walletlock.a.b)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.walletlock.a.b.class)).cTk())
    {
      finish();
      AppMethodBeat.o(46365);
    }
    while (true)
    {
      return;
      cOI();
      AppMethodBeat.o(46365);
    }
  }

  public void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(46375);
    if ((paramInt1 == 0) && (paramInt2 == 0))
      if ((paramm instanceof j))
      {
        cOI();
        paramString = (j)paramm;
        ab.i("MicroMsg.WalletPasswordSettingUI", "isShowDeduct=" + paramString.tqB);
        this.tsm = paramString.tqF;
        if (paramString.tqB == 1)
        {
          this.tsl = paramString.tqC;
          gK(bo.bc(paramString.tqE, getString(2131305179)), paramString.tqC);
          cOE();
          if (this.gII != null)
            this.gII.dismiss();
          AppMethodBeat.o(46375);
        }
      }
    while (true)
    {
      return;
      this.ehK.ce("wallet_open_auto_pay", true);
      break;
      if ((paramm instanceof com.tencent.mm.plugin.wallet_core.c.ae))
      {
        this.tsn = ((com.tencent.mm.plugin.wallet_core.c.ae)paramm).tuB;
        this.tss = ((com.tencent.mm.plugin.wallet_core.c.ae)paramm).tuG;
        if (this.tss == 0)
        {
          this.ehK.ce("wallet_delay_transfer_date", true);
          AppMethodBeat.o(46375);
        }
        else
        {
          if (!bo.isNullOrNil(this.tsn))
            this.tsk.setTitle(this.tsn);
          while (true)
          {
            this.ehK.ce("wallet_delay_transfer_date", false);
            AppMethodBeat.o(46375);
            break;
            ab.i("MicroMsg.WalletPasswordSettingUI", "use hardcode wording");
          }
          if ((paramm instanceof com.tencent.mm.plugin.wallet_core.c.ae))
            ab.i("MicroMsg.WalletPasswordSettingUI", "net error, use hardcode wording");
        }
      }
      else
      {
        AppMethodBeat.o(46375);
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
 * Qualified Name:     com.tencent.mm.plugin.wallet.pwd.ui.WalletPasswordSettingUI
 * JD-Core Version:    0.6.2
 */