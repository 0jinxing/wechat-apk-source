package com.tencent.mm.plugin.wallet.balance.ui;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.g.a.uq;
import com.tencent.mm.plugin.wallet.a.s;
import com.tencent.mm.plugin.wallet.balance.a.c;
import com.tencent.mm.plugin.wallet.balance.b;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.plugin.wallet_core.model.Orders;
import com.tencent.mm.plugin.wallet_core.model.Orders.Commodity;
import com.tencent.mm.pluginsdk.wallet.PayInfo;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.wallet_core.d.g;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import com.tencent.mm.wallet_core.ui.e;
import java.util.List;

@com.tencent.mm.ui.base.a(19)
public class WalletBalanceResultUI extends WalletBaseUI
{
  protected Button gHn;
  protected TextView nSC;
  protected TextView pMc;
  protected Orders pWy;
  protected TextView rOI;
  protected TextView thG;
  protected TextView thH;
  protected CheckBox thI;
  protected Bankcard thJ;

  private void cNc()
  {
    AppMethodBeat.i(45463);
    String str1;
    if (this.thI.getVisibility() == 0)
      if (this.thI.isChecked())
      {
        str1 = "0";
        int i = this.mBundle.getInt("key_pay_flag", 0);
        String str2 = this.mBundle.getString("key_pwd1");
        String str3 = this.mBundle.getString("key_verify_code");
        PayInfo localPayInfo = (PayInfo)this.mBundle.getParcelable("key_pay_info");
        if (localPayInfo != null)
          a(new c(i, str2, str3, localPayInfo.czZ, localPayInfo.cIf, str1), true, true);
        AppMethodBeat.o(45463);
      }
    while (true)
    {
      return;
      str1 = "1";
      break;
      dY();
      AppMethodBeat.o(45463);
    }
  }

  public final boolean c(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(45466);
    boolean bool;
    if ((paramm instanceof c))
    {
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        s.cNC();
        s.cND().tDa = bo.anT();
        paramString = new uq();
        paramString.cQP.scene = 15;
        paramString.callback = new WalletBalanceResultUI.4(this);
        com.tencent.mm.sdk.b.a.xxA.m(paramString);
      }
      dY();
      bool = true;
      AppMethodBeat.o(45466);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(45466);
    }
  }

  protected void cu()
  {
    AppMethodBeat.i(45464);
    Object localObject;
    if (this.pWy != null)
    {
      this.thG.setText(e.e(this.pWy.pTN, this.pWy.pcl));
      if ((this.pWy.tAq != null) && (this.pWy.tAq.size() > 0))
      {
        localObject = (Orders.Commodity)this.pWy.tAq.get(0);
        if (!bo.isNullOrNil(((Orders.Commodity)localObject).tAT))
          this.pMc.setText(((Orders.Commodity)localObject).pcj + " " + getString(2131305177) + ((Orders.Commodity)localObject).tAT);
      }
      else
      {
        if (!(dOD() instanceof b))
          break label233;
        if (this.pWy.pPp <= 0.0D)
          break label224;
        findViewById(2131828639).setVisibility(0);
        localObject = (TextView)findViewById(2131828640);
        ((TextView)localObject).setText(e.e(this.pWy.pPp, this.pWy.pcl));
        ((TextView)localObject).setVisibility(0);
        AppMethodBeat.o(45464);
      }
    }
    while (true)
    {
      return;
      this.pMc.setText(((Orders.Commodity)localObject).pcj);
      break;
      label224: ab.i("MicroMsg.WalletBalanceResultUI", "fetch_fee is 0");
      label233: AppMethodBeat.o(45464);
    }
  }

  public final void dY()
  {
    AppMethodBeat.i(45465);
    if (!dOE().p(new Object[] { this.pWy }))
      super.dY();
    AppMethodBeat.o(45465);
  }

  public final int getLayoutId()
  {
    return 2130971052;
  }

  public void initView()
  {
    AppMethodBeat.i(45462);
    setMMTitle((String)dOE().Au(0));
    this.rOI = ((TextView)findViewById(2131828632));
    this.rOI.setText(dOE().Au(1));
    this.thH = ((TextView)findViewById(2131828633));
    this.nSC = ((TextView)findViewById(2131828634));
    Object localObject = dOE().Au(2);
    if (!bo.ac((CharSequence)localObject))
    {
      this.thH.setVisibility(0);
      this.nSC.setVisibility(0);
      this.nSC.setText((CharSequence)localObject);
      localObject = (ImageView)findViewById(2131828631);
      int i = this.mBundle.getInt("key_balance_result_logo", -1);
      if (i <= 0)
        break label326;
      ((ImageView)localObject).setImageResource(i);
      label150: this.pMc = ((TextView)findViewById(2131828636));
      this.thG = ((TextView)findViewById(2131828638));
      localObject = (TextView)findViewById(2131828637);
      if ((dOD() instanceof b))
        ((TextView)localObject).setText(getString(2131304569));
      this.thI = ((CheckBox)findViewById(2131828641));
      this.thJ = ((Bankcard)this.mBundle.getParcelable("key_bankcard"));
      if (this.thJ == null)
        break label336;
      this.thI.setVisibility(8);
    }
    while (true)
    {
      this.gHn = ((Button)findViewById(2131822846));
      this.gHn.setOnClickListener(new WalletBalanceResultUI.1(this));
      setBackBtn(new WalletBalanceResultUI.2(this));
      AppMethodBeat.o(45462);
      return;
      this.thH.setVisibility(8);
      this.nSC.setVisibility(8);
      break;
      label326: ((ImageView)localObject).setImageResource(2131231868);
      break label150;
      label336: this.thI.setVisibility(0);
    }
  }

  public void onBackPressed()
  {
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(45461);
    super.onCreate(paramBundle);
    this.pWy = ((Orders)this.mBundle.getParcelable("key_orders"));
    initView();
    cu();
    AppMethodBeat.o(45461);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceResultUI
 * JD-Core Version:    0.6.2
 */