package com.tencent.mm.plugin.wallet.bind.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View.OnFocusChangeListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.plugin.wallet.pay.a.a.b;
import com.tencent.mm.plugin.wallet.pay.a.a.c;
import com.tencent.mm.plugin.wallet_core.model.Authen;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.plugin.wallet_core.model.ElementQuery;
import com.tencent.mm.plugin.wallet_core.model.Orders;
import com.tencent.mm.plugin.wallet_core.model.r;
import com.tencent.mm.plugin.wallet_core.ui.view.WalletPhoneInputView;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.wallet_core.tenpay.model.n;
import com.tencent.mm.wallet_core.ui.MMScrollView;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import com.tencent.mm.wallet_core.ui.formview.WalletFormView;
import com.tencent.mm.wallet_core.ui.formview.WalletFormView.a;

@com.tencent.mm.ui.base.a(19)
public class WalletResetInfoUI extends WalletBaseUI
  implements WalletFormView.a
{
  private Button gEZ;
  private TextView iqU;
  private Orders pWy;
  private Bankcard thJ;
  private WalletFormView tmn;
  private WalletFormView tmo;
  private WalletFormView tmp;
  private WalletFormView tmq;
  private WalletPhoneInputView tmr;
  private Authen tms;
  private ElementQuery tmt;

  private boolean arW()
  {
    AppMethodBeat.i(45827);
    if (!this.tmo.fx(null));
    for (boolean bool1 = false; ; bool1 = true)
    {
      boolean bool2 = bool1;
      if (this.tmr.getVisibility() == 0)
      {
        bool2 = bool1;
        if (this.tmr.cSA())
        {
          bool2 = bool1;
          if (!this.tmq.fx(null))
            bool2 = false;
        }
      }
      if (!this.tmp.fx(null))
        bool2 = false;
      if ((this.pWy == null) || (this.tms == null))
        bool2 = false;
      if (bool2)
      {
        this.gEZ.setEnabled(true);
        this.gEZ.setClickable(true);
      }
      while (true)
      {
        AppMethodBeat.o(45827);
        return bool2;
        this.gEZ.setEnabled(false);
        this.gEZ.setClickable(false);
      }
    }
  }

  private boolean cNA()
  {
    AppMethodBeat.i(45823);
    boolean bool;
    if ((this.mBundle.getInt("key_err_code", 408) == 408) && (this.tmt == null))
    {
      bool = true;
      AppMethodBeat.o(45823);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(45823);
    }
  }

  private void cNB()
  {
    AppMethodBeat.i(45824);
    switch (this.mBundle.getInt("key_err_code", 408))
    {
    default:
      if (this.mBundle.getBoolean("key_balance_change_phone_need_confirm_phone", true))
      {
        setMMTitle(2131305301);
        this.tmr.setVisibility(0);
        if (this.thJ != null)
        {
          ab.d("Micromsg.WalletResetInfoUI", "bankPhone: %s", new Object[] { this.thJ.field_bankPhone });
          this.iqU.setText(String.format(getString(2131305300), new Object[] { this.thJ.field_bankPhone }));
        }
        if ((this.tmt == null) && (this.thJ != null))
          this.tmt = r.cPQ().acy(this.thJ.field_bankcardType);
        if ((this.tmt != null) && (this.tmt.tyy))
          this.tmp.setVisibility(0);
        if ((this.tmt != null) && (this.tmt.tyz))
          this.tmo.setVisibility(0);
        label206: this.gEZ = ((Button)findViewById(2131822846));
        this.gEZ.setOnClickListener(new WalletResetInfoUI.1(this));
        arW();
        if (!cNA())
          break label318;
        AM(4);
        AppMethodBeat.o(45824);
      }
      break;
    case 402:
    case 403:
    }
    while (true)
    {
      return;
      setMMTitle(2131305297);
      this.tmp.setVisibility(0);
      this.iqU.setText(2131305296);
      break label206;
      setMMTitle(2131305304);
      this.tmo.setVisibility(0);
      this.iqU.setText(2131305303);
      break label206;
      setMMTitle(2131305299);
      break;
      label318: AM(0);
      AppMethodBeat.o(45824);
    }
  }

  private Bankcard cNz()
  {
    AppMethodBeat.i(45822);
    Bankcard localBankcard1 = (Bankcard)this.mBundle.getParcelable("key_switch_phone_reset_bank_card");
    Bankcard localBankcard2 = localBankcard1;
    if (localBankcard1 == null)
      localBankcard2 = (Bankcard)this.mBundle.getParcelable("key_bankcard");
    AppMethodBeat.o(45822);
    return localBankcard2;
  }

  public final boolean c(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    boolean bool1 = true;
    AppMethodBeat.i(45825);
    ab.d("Micromsg.WalletResetInfoUI", " errCode: " + paramInt2 + " errMsg :" + paramString);
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      paramString = this.mBundle;
      if (((paramm instanceof b)) || ((paramm instanceof c)))
      {
        paramm = (b)paramm;
        if (!paramm.tof)
        {
          bool2 = true;
          paramString.putBoolean("key_need_verify_sms", bool2);
          paramString.putString("kreq_token", paramm.token);
          if (paramm.tpw)
            paramString.putParcelable("key_orders", paramm.tog);
          paramm = paramm.oYc;
          if (paramm != null)
            paramString.putParcelable("key_realname_guide_helper", paramm);
          paramString.putInt("key_err_code", 0);
          com.tencent.mm.wallet_core.a.j(this, paramString);
          AppMethodBeat.o(45825);
        }
      }
    }
    for (boolean bool2 = bool1; ; bool2 = false)
    {
      return bool2;
      bool2 = false;
      break;
      if (((paramm instanceof com.tencent.mm.plugin.wallet_core.c.t)) && (this.thJ != null))
      {
        this.tmt = r.cPQ().acz(this.thJ.field_bindSerial);
        cNB();
      }
      AppMethodBeat.o(45825);
    }
  }

  public final int getLayoutId()
  {
    return 2130971162;
  }

  public final void hY(boolean paramBoolean)
  {
    AppMethodBeat.i(45828);
    arW();
    AppMethodBeat.o(45828);
  }

  public final void initView()
  {
    AppMethodBeat.i(45821);
    this.iqU = ((TextView)findViewById(2131829045));
    this.thJ = cNz();
    this.pWy = ((Orders)this.mBundle.getParcelable("key_orders"));
    this.tms = ((Authen)this.mBundle.getParcelable("key_authen"));
    if (TextUtils.isEmpty(this.mBundle.getString("key_pwd1", "")))
    {
      this.mBundle.putString("key_pwd1", this.tms.twc);
      ab.e("Micromsg.WalletResetInfoUI", "pwd is empty, reset it to input");
    }
    this.tmt = ((ElementQuery)this.mBundle.getParcelable("elemt_query"));
    this.tmr = ((WalletPhoneInputView)findViewById(2131828728));
    this.tmq = this.tmr.getPhoneNumberEt();
    if (this.thJ.txl == 1)
    {
      this.tmr.cSC();
      Object localObject = (EditText)this.tmr.findViewById(2131829013);
      e(this.tmr.getPhoneNumberEt(), 0, false);
      a(this.tmr.getPhoneNumberEt(), (EditText)localObject, 0, false, false, true);
      this.tmn = ((WalletFormView)findViewById(2131829046));
      this.tmo = ((WalletFormView)findViewById(2131826504));
      com.tencent.mm.wallet_core.ui.formview.a.a(this, this.tmo);
      this.tmp = ((WalletFormView)findViewById(2131826502));
      com.tencent.mm.wallet_core.ui.formview.a.b(this, this.tmp);
      this.tmo.setOnInputValidChangeListener(this);
      this.tmp.setOnInputValidChangeListener(this);
      this.tmq.setOnInputValidChangeListener(this);
      localObject = (MMScrollView)findViewById(2131823366);
      ((MMScrollView)localObject).a((ViewGroup)localObject, (View.OnFocusChangeListener)localObject);
      if (this.thJ == null)
        break label377;
      this.tmn.setText(this.thJ.field_desc);
    }
    while (true)
    {
      cNB();
      if (cNA())
        a(new com.tencent.mm.plugin.wallet_core.c.t("", "", null), true, false);
      AppMethodBeat.o(45821);
      return;
      this.tmr.cSB();
      break;
      label377: this.tmn.setVisibility(8);
    }
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(45826);
    if (this.tmr.e(paramInt1, paramInt2, paramIntent))
      AppMethodBeat.o(45826);
    while (true)
    {
      return;
      super.onActivityResult(paramInt1, paramInt2, paramIntent);
      AppMethodBeat.o(45826);
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(45819);
    super.onCreate(paramBundle);
    initView();
    AppMethodBeat.o(45819);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(45820);
    super.onDestroy();
    AppMethodBeat.o(45820);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.bind.ui.WalletResetInfoUI
 * JD-Core Version:    0.6.2
 */