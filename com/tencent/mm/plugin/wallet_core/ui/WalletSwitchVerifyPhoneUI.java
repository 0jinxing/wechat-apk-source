package com.tencent.mm.plugin.wallet_core.ui;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.SpannableString;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.plugin.wallet_core.c.e;
import com.tencent.mm.plugin.wallet_core.model.Authen;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.plugin.wallet_core.model.ElementQuery;
import com.tencent.mm.plugin.wallet_core.model.r;
import com.tencent.mm.plugin.wallet_core.ui.view.SwitchPhoneItemGroupView;
import com.tencent.mm.plugin.wallet_core.ui.view.SwitchPhoneItemView;
import com.tencent.mm.protocal.protobuf.aey;
import com.tencent.mm.protocal.protobuf.gz;
import com.tencent.mm.protocal.protobuf.um;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import com.tencent.mm.wallet_core.c;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import java.util.Collections;
import java.util.List;

@com.tencent.mm.ui.base.a(19)
public class WalletSwitchVerifyPhoneUI extends WalletBaseUI
{
  private SwitchPhoneItemGroupView tKM;
  private List<gz> tKN;
  public boolean tKO = false;

  private void cNI()
  {
    AppMethodBeat.i(47677);
    ab.i("MicroMsg.WalletSwitchVerifyPhoneUI", "directToNext()");
    Authen localAuthen = (Authen)this.mBundle.getParcelable("key_authen");
    Bankcard localBankcard = (Bankcard)this.mBundle.getParcelable("key_bankcard");
    if ((localAuthen == null) || (localBankcard == null))
    {
      ab.w("MicroMsg.WalletSwitchVerifyPhoneUI", "authen or bankcard is null");
      AppMethodBeat.o(47677);
    }
    while (true)
    {
      return;
      ElementQuery localElementQuery = r.cPQ().acy(localBankcard.field_bankcardType);
      this.mBundle.putParcelable("elemt_query", localElementQuery);
      localAuthen.pbn = localBankcard.field_bankcardType;
      localAuthen.pbo = localBankcard.field_bindSerial;
      localBankcard.field_bankPhone = localElementQuery.tyH;
      this.mBundle.putBoolean("key_balance_change_phone_need_confirm_phone", true);
      this.mBundle.putBoolean("key_is_changing_balance_phone_num", true);
      this.mBundle.putInt("key_err_code", 418);
      com.tencent.mm.wallet_core.a.j(this, this.mBundle);
      AppMethodBeat.o(47677);
    }
  }

  public final boolean c(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(47676);
    if ((paramInt1 == 0) && (paramInt2 == 0))
      if ((paramm instanceof e))
      {
        paramString = (e)paramm;
        this.tKN = ((e)paramm).ttO.wmz;
        if (this.tKN != null)
          Collections.sort(this.tKN, new WalletSwitchVerifyPhoneUI.2(this));
        if (paramString.ttO.wmA != null)
        {
          paramString = paramString.ttO.wmA;
          this.mBundle.putString("key_true_name", paramString.twd);
          this.mBundle.putString("key_cre_name", paramString.wca);
          this.mBundle.putString("key_cre_type", paramString.tCl);
        }
        if ((this.tKN == null) || (this.tKN.isEmpty()))
        {
          ab.i("MicroMsg.WalletSwitchVerifyPhoneUI", "empty mobile info");
          AppMethodBeat.o(47676);
        }
      }
    for (boolean bool = true; ; bool = false)
    {
      return bool;
      paramInt1 = this.tKN.size() - 1;
      label170: if (paramInt1 >= 0)
      {
        paramm = (gz)this.tKN.get(paramInt1);
        if (!paramm.vJB.equals("cft"))
          break label461;
        SwitchPhoneItemView localSwitchPhoneItemView = new SwitchPhoneItemView(this.mController.ylL);
        if (!paramm.vJC.equals("1"))
          break label324;
        paramString = getString(2131305374);
        label240: paramString = getString(2131305372, new Object[] { paramm.nuL, paramString, paramm.vJD });
        if (!this.tKO)
          break label335;
        paramString = new SpannableString(paramString);
        localSwitchPhoneItemView.setTag(Integer.valueOf(paramInt1));
        localSwitchPhoneItemView.a(paramm.tuk, paramString);
        this.tKM.a(localSwitchPhoneItemView, 0);
      }
      while (true)
      {
        label288: paramInt1--;
        break label170;
        break;
        label324: paramString = getString(2131305373);
        break label240;
        label335: String str1 = getString(2131305377);
        j localj = new j(this);
        String str2 = paramString + "，";
        localj.mColor = getResources().getColor(2131689769);
        paramString = new SpannableString(str2 + str1);
        paramString.setSpan(localj, str2.length(), str2.length() + str1.length(), 33);
        localj.tHw = new WalletSwitchVerifyPhoneUI.3(this, paramm);
        break label288;
        label461: paramString = new SwitchPhoneItemView(this.mController.ylL);
        paramString.setTag(Integer.valueOf(paramInt1));
        paramString.a(paramm.tuk, getString(2131305378));
        this.tKM.a(paramString, 0);
      }
      if ((paramm instanceof com.tencent.mm.plugin.wallet_core.c.t))
        cNI();
      AppMethodBeat.o(47676);
    }
  }

  public final boolean cNR()
  {
    return true;
  }

  public final int getLayoutId()
  {
    return 2130971174;
  }

  public final void initView()
  {
    AppMethodBeat.i(47674);
    this.tKM = ((SwitchPhoneItemGroupView)findViewById(2131829069));
    this.tKM.setOnItemSelectListener(new WalletSwitchVerifyPhoneUI.1(this));
    AppMethodBeat.o(47674);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(47673);
    overridePendingTransition(2131034229, 2131034130);
    super.onCreate(paramBundle);
    setMMTitle(getString(2131305375));
    initView();
    this.tKO = this.mBundle.getBoolean("key_block_bind_new_card", false);
    if (!this.tKO)
    {
      paramBundle = new SwitchPhoneItemView(this.mController.ylL);
      paramBundle.setTag(Integer.valueOf(-1));
      paramBundle.a(getString(2131305371), null);
      this.tKM.a(paramBundle, -1);
    }
    if ((dOD() != null) && (dOD().bxP().equals("PayProcess")) && (this.mBundle.getInt("key_can_verify_tail", 0) == 1))
    {
      ab.i("MicroMsg.WalletSwitchVerifyPhoneUI", "show verify id card item");
      String str = getString(2131304830);
      paramBundle = new SwitchPhoneItemView(this.mController.ylL, 2130971172);
      paramBundle.setTag(Integer.valueOf(-2));
      paramBundle.a(str, null);
      this.tKM.a(paramBundle, -1);
    }
    nf(1667);
    nf(461);
    nf(1505);
    a(new e(cNH()), true, true);
    AppMethodBeat.o(47673);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(47675);
    super.onDestroy();
    ng(1667);
    ng(461);
    ng(1505);
    AppMethodBeat.o(47675);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.WalletSwitchVerifyPhoneUI
 * JD-Core Version:    0.6.2
 */