package com.tencent.mm.plugin.wallet.balance.ui;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.plugin.wallet_core.model.Orders;
import com.tencent.mm.plugin.wallet_core.ui.cashier.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.a;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.q;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import com.tencent.mm.wallet_core.ui.e;

@a(3)
public class WalletBalanceFetchPwdInputUI extends WalletBaseUI
{
  private String mTitle = "";
  private String rMr;
  private String tgx = "";
  private b tgy;

  private void showDialog()
  {
    AppMethodBeat.i(45339);
    if ((this.tgy != null) && (this.tgy.isShowing()))
      this.tgy.dismiss();
    Object localObject = (Orders)this.mBundle.getParcelable("key_orders");
    if (((Orders)localObject).pPp > 0.0D)
    {
      String str = this.mBundle.getString("key_fetch_cashier_desc");
      if (!bo.isNullOrNil(str))
        localObject = String.format(str, new Object[] { e.e(((Orders)localObject).pPp, ((Orders)localObject).pcl) });
    }
    while (true)
    {
      this.tgy = new b(this.mController.ylL);
      this.tgy.aq(this.mTitle, this.tgx, (String)localObject);
      this.tgy.tMA = new WalletBalanceFetchPwdInputUI.2(this);
      this.tgy.show();
      addDialog(this.tgy);
      AppMethodBeat.o(45339);
      return;
      localObject = getResources().getString(2131304520, new Object[] { e.e(((Orders)localObject).pPp, ((Orders)localObject).pcl) });
      continue;
      localObject = "";
    }
  }

  public final boolean c(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    return false;
  }

  public final int getLayoutId()
  {
    return -1;
  }

  public void onCreate(Bundle paramBundle)
  {
    int i = 1;
    AppMethodBeat.i(45338);
    super.onCreate(paramBundle);
    AM(4);
    this.mTitle = this.mBundle.getString("key_pwd_cash_title");
    this.tgx = this.mBundle.getString("key_pwd_cash_money");
    this.rMr = this.mBundle.getString("key_report_session_id");
    ab.i("MicroMsg.WalletBalanceFetchPwdInputUI", "hy: money : %s, title : %s", new Object[] { bo.nullAsNil(this.tgx), bo.nullAsNil(this.mTitle) });
    if ((!bo.isNullOrNil(this.mTitle)) && (!bo.isNullOrNil(this.tgx)))
    {
      if (i != 0)
        break label144;
      h.a(this.mController.ylL, 2131305049, 0, new WalletBalanceFetchPwdInputUI.1(this));
      AppMethodBeat.o(45338);
    }
    while (true)
    {
      return;
      i = 0;
      break;
      label144: showDialog();
      AppMethodBeat.o(45338);
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }

  public final void wU(int paramInt)
  {
    AppMethodBeat.i(45340);
    if (paramInt == 0)
    {
      finish();
      AppMethodBeat.o(45340);
    }
    while (true)
    {
      return;
      if (paramInt == 1)
        showDialog();
      AppMethodBeat.o(45340);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceFetchPwdInputUI
 * JD-Core Version:    0.6.2
 */