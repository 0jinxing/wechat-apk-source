package com.tencent.mm.plugin.wallet_payu.pay.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.plugin.wallet.a.h;
import com.tencent.mm.plugin.wallet.a.s;
import com.tencent.mm.plugin.wallet.pay.ui.WalletChangeBankcardUI;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.plugin.wallet_core.model.FavorPayInfo;
import com.tencent.mm.plugin.wallet_core.model.Orders;
import com.tencent.mm.plugin.wallet_core.model.ak;
import com.tencent.mm.plugin.wallet_core.ui.i;
import com.tencent.mm.plugin.wallet_core.ui.q;
import com.tencent.mm.plugin.wallet_payu.pay.a.d;
import com.tencent.mm.pluginsdk.wallet.PayInfo;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;

@com.tencent.mm.ui.base.a(3)
public class WalletPayUChangeBankcardUI extends WalletChangeBankcardUI
{
  private String tUa;
  private c tUb;

  public WalletPayUChangeBankcardUI()
  {
    AppMethodBeat.i(48466);
    this.tUa = null;
    this.tUb = new WalletPayUChangeBankcardUI.4(this);
    AppMethodBeat.o(48466);
  }

  public final void acs(String paramString)
  {
    AppMethodBeat.i(48471);
    this.tms.twc = paramString;
    label168: Object localObject;
    boolean bool;
    if (this.tgC != null)
    {
      this.mBundle.putString("key_mobile", this.tgC.field_mobile);
      this.mBundle.putParcelable("key_bankcard", this.tgC);
      this.tms.pbo = this.tgC.field_bindSerial;
      this.tms.pbn = this.tgC.field_bankcardType;
      if (this.toH == null)
        break label338;
      this.tms.two = this.toH.tzb;
      if ((this.pWy != null) && (this.pWy.tAr != null))
        this.tms.twn = this.pWy.tAr.tmU;
      if ((this.pWy != null) && (this.pWy.tuo == 3))
      {
        if (!this.tgC.cPf())
          break label349;
        this.tms.bJt = 3;
        localObject = this.mBundle;
        if (this.tgC.cPf())
          break label361;
        bool = true;
        label185: ((Bundle)localObject).putBoolean("key_is_oversea", bool);
      }
    }
    this.mBundle.putParcelable("key_authen", this.tms);
    int i;
    if ((this.pVL.cIf == 32) || (this.pVL.cIf == 31))
      if (this.pVL.cIf == 32)
      {
        ab.d("MicroMsg.WalletPayUChangeBankcardUI", "hy: transfer ftf");
        i = 1;
        label251: a(new com.tencent.mm.plugin.wallet_payu.remittance.a.a(this.pVL.czZ, this.gHr, this.pVL.vwh.getDouble("total_fee"), this.pVL.vwh.getString("fee_type"), i, this.pVL.vwh.getString("extinfo_key_1"), this.tgC.field_bindSerial, this.pVL.vwh.getString("extinfo_key_4")), true, false);
        AppMethodBeat.o(48471);
      }
    while (true)
    {
      return;
      label338: this.tms.two = null;
      break;
      label349: this.tms.bJt = 6;
      break label168;
      label361: bool = false;
      break label185;
      i = 0;
      break label251;
      if (this.pVL.cIf == 11)
      {
        String str1 = this.gHr;
        localObject = this.tUa;
        String str2 = this.pVL.czZ;
        double d = this.pVL.vwh.getDouble("total_fee");
        String str3 = this.pVL.vwh.getString("fee_type");
        String str4 = this.tgC.field_bindSerial;
        paramString = this.tgC.field_bankcardType;
        s.cNC();
        a(new com.tencent.mm.plugin.wallet_payu.balance.a.b(str1, (String)localObject, str2, d, str3, str4, paramString, s.cND().thy.field_bindSerial), true, false);
        AppMethodBeat.o(48471);
      }
      else
      {
        a(new com.tencent.mm.plugin.wallet_payu.pay.a.b(this.pVL.czZ, this.pVL.vwh.getDouble("total_fee"), this.pVL.vwh.getString("fee_type"), this.tgC.field_bankcardType, this.tgC.field_bindSerial, this.tUa, paramString), true, true);
        AppMethodBeat.o(48471);
      }
    }
  }

  public final boolean c(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    boolean bool = false;
    AppMethodBeat.i(48472);
    if ((paramInt1 == 0) && (paramInt2 == 0) && (((paramm instanceof com.tencent.mm.plugin.wallet_payu.pay.a.b)) || ((paramm instanceof com.tencent.mm.plugin.wallet_payu.remittance.a.a)) || ((paramm instanceof com.tencent.mm.plugin.wallet_payu.balance.a.b))))
    {
      paramString = this.mBundle;
      if (!bo.isNullOrNil(this.gHr))
        paramString.putString("key_pwd1", this.gHr);
      paramString.putBoolean("key_need_verify_sms", false);
      paramString.putParcelable("key_pay_info", this.pVL);
      paramString.putInt("key_pay_flag", 3);
      if ((paramm instanceof com.tencent.mm.plugin.wallet_payu.pay.a.b))
      {
        com.tencent.mm.plugin.wallet_payu.pay.a.b localb = (com.tencent.mm.plugin.wallet_payu.pay.a.b)paramm;
        paramString.putString("transid", localb.kBE);
        paramString.putBoolean("key_should_redirect", localb.tTU);
        paramString.putString("key_gateway_code", localb.tSz);
        paramString.putString("key_gateway_reference", localb.tSy);
        paramString.putString("key_force_adjust_code", localb.tSB);
        paramString.putBoolean("key_should_force_adjust", localb.tTV);
        if (localb.isSuccess())
          paramString.putParcelable("key_orders", d.a(this.pWy, localb.tTW, localb.tTX, localb.timestamp, localb.tDT));
      }
      if ((paramm instanceof com.tencent.mm.plugin.wallet_payu.balance.a.b))
      {
        paramm = (com.tencent.mm.plugin.wallet_payu.balance.a.b)paramm;
        paramString.putString("transid", paramm.kBE);
        paramString.putBoolean("key_should_redirect", paramm.tSx);
        paramString.putString("key_gateway_code", paramm.tSz);
        paramString.putString("key_gateway_reference", paramm.tSy);
        paramString.putString("key_force_adjust_code", paramm.tSB);
        paramString.putBoolean("key_should_force_adjust", paramm.tSA);
      }
      com.tencent.mm.wallet_core.a.j(this, paramString);
      bool = true;
      AppMethodBeat.o(48472);
    }
    while (true)
    {
      return bool;
      AppMethodBeat.o(48472);
    }
  }

  public final i cNP()
  {
    AppMethodBeat.i(48469);
    a locala = new a(this, this.tgB, this.toE, this.pWy);
    AppMethodBeat.o(48469);
    return locala;
  }

  public final void cNQ()
  {
    AppMethodBeat.i(48470);
    ab.d("MicroMsg.WalletPayUChangeBankcardUI", "pay with old bankcard!");
    String str = this.mBundle.getString("key_pwd1");
    if (bo.isNullOrNil(str))
    {
      AM(4);
      this.toD = b.a(this, this.pWy, this.toH, this.tgC, new WalletPayUChangeBankcardUI.1(this), new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          AppMethodBeat.i(48462);
          if (WalletPayUChangeBankcardUI.b(WalletPayUChangeBankcardUI.this) != null)
            WalletPayUChangeBankcardUI.c(WalletPayUChangeBankcardUI.this).dismiss();
          WalletPayUChangeBankcardUI.e(WalletPayUChangeBankcardUI.this).f(WalletPayUChangeBankcardUI.d(WalletPayUChangeBankcardUI.this), true);
          WalletPayUChangeBankcardUI.b(WalletPayUChangeBankcardUI.this, (FavorPayInfo)paramAnonymousView.getTag());
          if (WalletPayUChangeBankcardUI.f(WalletPayUChangeBankcardUI.this) != null)
            WalletPayUChangeBankcardUI.g(WalletPayUChangeBankcardUI.this).tzf = "";
          WalletPayUChangeBankcardUI.this.mBundle.putParcelable("key_favor_pay_info", WalletPayUChangeBankcardUI.h(WalletPayUChangeBankcardUI.this));
          WalletPayUChangeBankcardUI.i(WalletPayUChangeBankcardUI.this);
          WalletPayUChangeBankcardUI.this.AM(0);
          AppMethodBeat.o(48462);
        }
      }
      , new WalletPayUChangeBankcardUI.3(this), "CREDITCARD_PAYU".equals(this.tgC.field_bankcardType));
      AppMethodBeat.o(48470);
    }
    while (true)
    {
      return;
      acs(str);
      AppMethodBeat.o(48470);
    }
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(48473);
    if (paramInt1 == 23351)
    {
      ab.d("MicroMsg.WalletPayUChangeBankcardUI", "hy: check otp done. resultcode: %d", new Object[] { Integer.valueOf(paramInt2) });
      if (paramInt2 == -1)
      {
        this.mBundle.putBoolean("key_should_redirect", false);
        com.tencent.mm.wallet_core.a.j(this, this.mBundle);
      }
      if (paramInt2 == 0)
        com.tencent.mm.wallet_core.a.b(this, this.mBundle, 0);
    }
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    AppMethodBeat.o(48473);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(48467);
    super.onCreate(paramBundle);
    com.tencent.mm.sdk.b.a.xxA.c(this.tUb);
    AppMethodBeat.o(48467);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(48468);
    super.onDestroy();
    com.tencent.mm.sdk.b.a.xxA.d(this.tUb);
    AppMethodBeat.o(48468);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_payu.pay.ui.WalletPayUChangeBankcardUI
 * JD-Core Version:    0.6.2
 */