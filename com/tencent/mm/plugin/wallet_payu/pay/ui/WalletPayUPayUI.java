package com.tencent.mm.plugin.wallet_payu.pay.ui;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.g.a.uu;
import com.tencent.mm.plugin.wallet.a.s;
import com.tencent.mm.plugin.wallet.pay.ui.WalletPayUI;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.plugin.wallet_core.model.FavorPayInfo;
import com.tencent.mm.plugin.wallet_core.model.Orders;
import com.tencent.mm.plugin.wallet_core.model.Orders.Commodity;
import com.tencent.mm.plugin.wallet_core.model.ak;
import com.tencent.mm.plugin.wallet_payu.pay.a.c;
import com.tencent.mm.plugin.wallet_payu.pay.a.e;
import com.tencent.mm.pluginsdk.wallet.PayInfo;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@com.tencent.mm.ui.base.a(3)
public class WalletPayUPayUI extends WalletPayUI
{
  private String tUa = null;

  public final void Q(Bundle paramBundle)
  {
    boolean bool = true;
    AppMethodBeat.i(48492);
    this.tpx = true;
    if (this.pWy != null)
      paramBundle.putInt("key_support_bankcard", this.pWy.tuo);
    if (!cOc());
    while (true)
    {
      paramBundle.putBoolean("key_is_oversea", bool);
      com.tencent.mm.wallet_core.a.a(this, e.class, paramBundle);
      AppMethodBeat.o(48492);
      return;
      bool = false;
    }
  }

  public final boolean c(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(48494);
    label208: boolean bool;
    if ((paramInt1 == 0) && (paramInt2 == 0))
      if ((paramm instanceof c))
      {
        this.pWy = ((c)paramm).pWy;
        if (this.pWy != null)
        {
          paramInt1 = this.pWy.tAq.size();
          this.mCount = paramInt1;
          paramm = new StringBuilder("get mOrders! bankcardTag : ");
          if (this.pWy == null)
            break label208;
        }
        for (paramString = Integer.valueOf(this.pWy.tuo); ; paramString = "")
        {
          ab.d("MicroMsg.WalletPayUPayUI", paramString);
          arW();
          if ((this.pWy == null) || (this.pWy.tAq == null))
            break label295;
          paramString = new LinkedList();
          paramm = this.pWy.tAq.iterator();
          while (paramm.hasNext())
          {
            Orders.Commodity localCommodity = (Orders.Commodity)paramm.next();
            if (bo.isNullOrNil(localCommodity.cAa))
              localCommodity.cAa = this.pVL.czZ;
            paramString.add(localCommodity.cAa);
          }
          paramInt1 = 0;
          break;
        }
        if (paramString.size() > 0)
        {
          paramm = new uu();
          paramm.cRC.cRE = paramString;
          com.tencent.mm.sdk.b.a.xxA.m(paramm);
        }
        paramString = new Bundle();
        paramString.putDouble("total_fee", this.pWy.pTN);
        paramString.putString("fee_type", "ZAR");
        if (this.pVL.vwh == null)
        {
          this.pVL.vwh = paramString;
          label295: cu();
          bool = true;
          AppMethodBeat.o(48494);
        }
      }
    while (true)
    {
      return bool;
      this.pVL.vwh.putAll(paramString);
      break;
      if ((paramm instanceof com.tencent.mm.plugin.wallet_core.c.b.a))
      {
        s.cNC();
        this.tgB = s.cND().ng(cOk());
        s.cNC();
        this.tgC = s.cND().a(null, null, cOk(), false);
        this.pTi.setClickable(true);
        if ((this.pWy == null) || (this.tgB == null) || (this.pVL == null))
          break;
        com.tencent.mm.plugin.wallet_core.utils.d.a(this.pVL, this.pWy);
        paramString = com.tencent.mm.plugin.report.service.h.pYm;
        paramInt2 = this.pVL.cIf;
        s.cNC();
        if (s.cND().cQg());
        for (paramInt1 = 2; ; paramInt1 = 1)
        {
          paramString.e(10690, new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(0), Integer.valueOf(paramInt1), Integer.valueOf((int)(this.pWy.pTN * 100.0D)), this.pWy.pcl });
          break;
        }
      }
      if ((paramm instanceof com.tencent.mm.plugin.wallet_payu.pay.a.b))
      {
        paramString = (com.tencent.mm.plugin.wallet_payu.pay.a.b)paramm;
        paramm = this.mBundle;
        paramm.putParcelable("key_pay_info", this.pVL);
        paramm.putParcelable("key_bankcard", this.tgC);
        paramm.putString("key_bank_type", this.tgC.field_bankcardType);
        if (!bo.isNullOrNil(this.gHr))
          paramm.putString("key_pwd1", this.gHr);
        paramm.putString("kreq_token", paramString.getToken());
        paramm.putParcelable("key_authen", cOb());
        paramm.putBoolean("key_need_verify_sms", false);
        paramm.putString("key_mobile", this.tgC.field_mobile);
        if (paramString.isSuccess())
          paramm.putParcelable("key_orders", com.tencent.mm.plugin.wallet_payu.pay.a.d.a(this.pWy, paramString.tTW, paramString.tTX, paramString.timestamp, paramString.tDT));
        this.mBundle.putBoolean("key_should_redirect", paramString.tTU);
        this.mBundle.putString("key_gateway_code", paramString.tSz);
        this.mBundle.putString("key_gateway_reference", paramString.tSy);
        this.mBundle.putBoolean("key_should_force_adjust", paramString.tTV);
        this.mBundle.putString("key_force_adjust_code", paramString.tSB);
        paramm.putInt("key_pay_flag", 3);
        Q(paramm);
        bool = true;
        AppMethodBeat.o(48494);
      }
      else
      {
        if (!(paramm instanceof com.tencent.mm.plugin.wallet_payu.remittance.a.a))
          break;
        paramm = (com.tencent.mm.plugin.wallet_payu.remittance.a.a)paramm;
        paramString = this.mBundle;
        paramString.putParcelable("key_pay_info", this.pVL);
        paramString.putParcelable("key_bankcard", this.tgC);
        paramString.putString("key_bank_type", this.tgC.field_bankcardType);
        if (!bo.isNullOrNil(this.gHr))
          paramString.putString("key_pwd1", this.gHr);
        paramString.putString("kreq_token", paramm.getToken());
        paramString.putParcelable("key_authen", cOb());
        paramString.putBoolean("key_need_verify_sms", false);
        paramString.putString("key_mobile", this.tgC.field_mobile);
        paramString.putParcelable("key_orders", this.pWy);
        paramString.putInt("key_pay_flag", 3);
        Q(paramString);
        bool = true;
        AppMethodBeat.o(48494);
        continue;
        if ((paramm instanceof com.tencent.mm.plugin.wallet_payu.pay.a.b));
        switch (paramInt2)
        {
        case 405:
        case 406:
        case 407:
        default:
          label976: bool = false;
          AppMethodBeat.o(48494);
        case 402:
        case 403:
        case 408:
        case 404:
        }
      }
    }
    paramm = (com.tencent.mm.plugin.wallet_payu.pay.a.b)paramm;
    this.tpC = this.mBundle;
    this.tpC.putParcelable("key_pay_info", this.pVL);
    this.tpC.putParcelable("key_bankcard", this.tgC);
    if (!bo.isNullOrNil(this.gHr))
      this.tpC.putString("key_pwd1", this.gHr);
    this.tpC.putString("kreq_token", paramm.getToken());
    this.tpC.putString("key_mobile", this.tgC.field_mobile);
    this.tpC.putInt("key_err_code", paramInt2);
    this.tpC.putParcelable("key_orders", this.pWy);
    if (bo.isNullOrNil(paramString))
      paramString = getString(2131305201);
    while (true)
    {
      com.tencent.mm.ui.base.h.d(this, paramString, "", getString(2131305200), getString(2131296868), new WalletPayUPayUI.4(this), new WalletPayUPayUI.5(this));
      bool = true;
      AppMethodBeat.o(48494);
      break;
      if ((this.tgC == null) || (this.pWy == null))
        break label976;
      this.tgC.twR = this.pWy.czZ;
      if ((this.tgB != null) && (this.tgB.size() > 1))
        c(true, 4, paramString);
      while (true)
      {
        bool = true;
        AppMethodBeat.o(48494);
        break;
        b(true, 4, paramString);
      }
    }
  }

  public final void cNQ()
  {
    AppMethodBeat.i(48491);
    if (!arW())
      AppMethodBeat.o(48491);
    while (true)
    {
      return;
      ab.d("MicroMsg.WalletPayUPayUI", "pay with old bankcard!");
      this.tpP = b.a(this, this.pWy, this.toH, this.tgC, new WalletPayUPayUI.1(this), new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          AppMethodBeat.i(48484);
          WalletPayUPayUI.a(WalletPayUPayUI.this, (FavorPayInfo)paramAnonymousView.getTag());
          if (WalletPayUPayUI.a(WalletPayUPayUI.this) != null)
            WalletPayUPayUI.b(WalletPayUPayUI.this).tzf = "";
          WalletPayUPayUI.c(WalletPayUPayUI.this, "");
          WalletPayUPayUI.c(WalletPayUPayUI.this).dismiss();
          WalletPayUPayUI.d(WalletPayUPayUI.this);
          WalletPayUPayUI.e(WalletPayUPayUI.this);
          AppMethodBeat.o(48484);
        }
      }
      , new WalletPayUPayUI.3(this), "CREDITCARD_PAYU".equals(this.tgC.field_bankcardType));
      AppMethodBeat.o(48491);
    }
  }

  public final void cNX()
  {
    AppMethodBeat.i(48490);
    a(new c(cOl().czZ), cOl().vwf, false);
    a(new com.tencent.mm.plugin.wallet_core.c.b.a(cOl().czZ), cOl().vwf, false);
    AppMethodBeat.o(48490);
  }

  public final void na(boolean paramBoolean)
  {
    AppMethodBeat.i(48493);
    int i;
    if ((this.pVL.cIf == 32) || (this.pVL.cIf == 31))
      if (this.pVL.cIf == 32)
      {
        ab.d("MicroMsg.WalletPayUPayUI", "hy: transfer ftf");
        i = 1;
        a(new com.tencent.mm.plugin.wallet_payu.remittance.a.a(this.pVL.czZ, this.gHr, this.pVL.vwh.getDouble("total_fee"), this.pVL.vwh.getString("fee_type"), i, this.pVL.vwh.getString("extinfo_key_1"), this.tgC.field_bindSerial, this.pVL.vwh.getString("extinfo_key_4")), true, false);
        AppMethodBeat.o(48493);
      }
    while (true)
    {
      return;
      i = 0;
      break;
      if (this.pVL.cIf == 11)
      {
        String str1 = this.gHr;
        String str2 = this.tUa;
        String str3 = this.pVL.czZ;
        double d = this.pVL.vwh.getDouble("total_fee");
        String str4 = this.pVL.vwh.getString("fee_type");
        String str5 = this.tgC.field_bindSerial;
        String str6 = this.tgC.field_bankcardType;
        s.cNC();
        a(new com.tencent.mm.plugin.wallet_payu.balance.a.b(str1, str2, str3, d, str4, str5, str6, s.cND().thy.field_bindSerial), true, false);
        AppMethodBeat.o(48493);
      }
      else
      {
        a(new com.tencent.mm.plugin.wallet_payu.pay.a.b(this.pVL.czZ, this.pVL.vwh.getDouble("total_fee"), this.pVL.vwh.getString("fee_type"), this.tgC.field_bankcardType, this.tgC.field_bindSerial, this.tUa, this.gHr), true, true);
        AppMethodBeat.o(48493);
      }
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(48488);
    super.onCreate(paramBundle);
    AppMethodBeat.o(48488);
  }

  public void onNewIntent(Intent paramIntent)
  {
    AppMethodBeat.i(48489);
    ab.i("MicroMsg.WalletPayUPayUI", "hy: onNewIntent");
    super.onNewIntent(paramIntent);
    AppMethodBeat.o(48489);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_payu.pay.ui.WalletPayUPayUI
 * JD-Core Version:    0.6.2
 */