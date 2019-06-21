package com.tencent.mm.plugin.luckymoney.sns;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.g.a.rl;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.preference.CheckBoxPreference;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.f;
import com.tencent.mm.wallet_core.d.i;
import com.tencent.mm.wallet_core.ui.WalletPreferenceUI;

public class SnsLuckyMoneyFreePwdSetting extends WalletPreferenceUI
{
  protected f iFE;
  protected CheckBoxPreference obA;

  private void bMg()
  {
    boolean bool = true;
    AppMethodBeat.i(42502);
    if (com.tencent.mm.plugin.luckymoney.sns.b.a.bMi() == 1)
    {
      this.obA.uOT = bool;
      this.ehZ.edit().putBoolean("open_sns_pay_pref", bool).commit();
      if (TextUtils.isEmpty(com.tencent.mm.plugin.luckymoney.sns.b.a.bMj()))
        break label149;
      ab.i("MicroMsg.mmui.MMPreference", "SetSnsPayTitle:" + com.tencent.mm.plugin.luckymoney.sns.b.a.bMj());
      this.obA.setTitle(com.tencent.mm.plugin.luckymoney.sns.b.a.bMj());
      label87: if (TextUtils.isEmpty(com.tencent.mm.plugin.luckymoney.sns.b.a.bMk()))
        break label168;
      ab.i("MicroMsg.mmui.MMPreference", "SetSnsPayWording:" + com.tencent.mm.plugin.luckymoney.sns.b.a.bMk());
      this.obA.setSummary(com.tencent.mm.plugin.luckymoney.sns.b.a.bMk());
    }
    while (true)
    {
      this.iFE.notifyDataSetChanged();
      AppMethodBeat.o(42502);
      return;
      bool = false;
      break;
      label149: ab.i("MicroMsg.mmui.MMPreference", "SetSnsPayTitle is empty");
      this.obA.setTitle(2131301113);
      break label87;
      label168: ab.i("MicroMsg.mmui.MMPreference", "getSetSnsPayWording is empty");
      this.obA.setSummary(2131301112);
    }
  }

  private void iI(boolean paramBoolean)
  {
    AppMethodBeat.i(42503);
    this.ehZ.edit().putBoolean("open_sns_pay_pref", paramBoolean).commit();
    this.obA.uOT = paramBoolean;
    this.iFE.notifyDataSetChanged();
    AppMethodBeat.o(42503);
  }

  private static void xU(int paramInt)
  {
    AppMethodBeat.i(42498);
    rl localrl = new rl();
    localrl.cNu.key = paramInt;
    localrl.cNu.value = 1;
    localrl.cNu.cNv = true;
    com.tencent.mm.sdk.b.a.xxA.m(localrl);
    AppMethodBeat.o(42498);
  }

  public final int JC()
  {
    return 2131165298;
  }

  public final boolean a(f paramf, Preference paramPreference)
  {
    AppMethodBeat.i(42506);
    if ("open_sns_pay_pref".equals(paramPreference.mKey))
    {
      if ((this.obA.isChecked()) || (com.tencent.mm.plugin.luckymoney.sns.b.a.bMi() != 1))
        break label67;
      dOM().a(new com.tencent.mm.plugin.luckymoney.sns.a.a(0, "", ""), true, 1);
      xU(117);
    }
    while (true)
    {
      AppMethodBeat.o(42506);
      return false;
      label67: xU(120);
      com.tencent.mm.wallet_core.a.a(this, a.class, null, null);
    }
  }

  public final boolean f(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(42505);
    if ((paramm instanceof com.tencent.mm.plugin.luckymoney.sns.a.a))
    {
      ab.i("MicroMsg.mmui.MMPreference", "free pwd setting onWalletSceneEnd, errType:" + paramInt1 + " errCode:" + paramInt2 + " errMsg:" + paramString);
      if ((paramInt1 != 0) || (paramInt2 != 0))
        break label116;
      if (((com.tencent.mm.plugin.luckymoney.sns.a.a)paramm).obS != 1)
        break label96;
      ab.i("MicroMsg.mmui.MMPreference", "onWalletSceneEnd() NetSceneSnsPayManage is success, setIsOpenSnsPay with 1");
      xU(119);
      iI(true);
    }
    while (true)
    {
      AppMethodBeat.o(42505);
      return false;
      label96: iI(false);
      xU(118);
      ab.i("MicroMsg.mmui.MMPreference", "onWalletSceneEnd() NetSceneSnsPayManage is success, setIsOpenSnsPay with 0");
      continue;
      label116: xU(119);
      ab.i("MicroMsg.mmui.MMPreference", "onWalletSceneEnd() NetSceneSnsPayManage is failed, do nothing");
      bMg();
    }
  }

  public final void initView()
  {
    AppMethodBeat.i(42500);
    this.iFE = this.yCw;
    setBackBtn(new SnsLuckyMoneyFreePwdSetting.1(this));
    setMMTitle(2131301116);
    this.obA = ((CheckBoxPreference)this.iFE.aqO("open_sns_pay_pref"));
    bMg();
    AppMethodBeat.o(42500);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(42499);
    super.onCreate(paramBundle);
    initView();
    xU(116);
    AppMethodBeat.o(42499);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(42504);
    super.onDestroy();
    AppMethodBeat.o(42504);
  }

  public void onNewIntent(Intent paramIntent)
  {
    AppMethodBeat.i(42507);
    super.onNewIntent(paramIntent);
    AppMethodBeat.o(42507);
  }

  public void onResume()
  {
    AppMethodBeat.i(42501);
    bMg();
    super.onResume();
    AppMethodBeat.o(42501);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.sns.SnsLuckyMoneyFreePwdSetting
 * JD-Core Version:    0.6.2
 */