package com.tencent.mm.plugin.wallet.balance.ui.lqt;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
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
public class WalletLqtCheckPwdInputDialogUI extends WalletBaseUI
{
  private String mTitle = "";
  private String tgj;
  private String tgx = "";
  private b tgy;

  private void showDialog()
  {
    AppMethodBeat.i(45520);
    if ((this.tgy != null) && (this.tgy.isShowing()))
      this.tgy.dismiss();
    this.tgx = e.G(bo.getDouble(this.tgx, 0.0D));
    this.tgy = new b(this.mController.ylL);
    this.tgy.aq(this.mTitle, this.tgx, "");
    this.tgy.tMA = new WalletLqtCheckPwdInputDialogUI.2(this);
    this.tgy.show();
    addDialog(this.tgy);
    AppMethodBeat.o(45520);
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
    AppMethodBeat.i(45519);
    super.onCreate(paramBundle);
    AM(4);
    this.mTitle = getIntent().getStringExtra("lqt_fetch_pwd_title");
    this.tgx = getIntent().getStringExtra("lqt_fetch_pwd_money");
    this.tgj = getIntent().getStringExtra("lqt_redeem_listid");
    ab.i("MicroMsg.WalletLqtCheckPwdInputDialogUI", "hy: money : %s, title : %s, redeemListId: %s", new Object[] { bo.nullAsNil(this.tgx), bo.nullAsNil(this.mTitle), this.tgj });
    if ((!bo.isNullOrNil(this.mTitle)) && (!bo.isNullOrNil(this.tgx)))
    {
      if (i != 0)
        break label151;
      h.a(this.mController.ylL, 2131305049, 0, new WalletLqtCheckPwdInputDialogUI.1(this));
      AppMethodBeat.o(45519);
    }
    while (true)
    {
      return;
      i = 0;
      break;
      label151: getWindow().setBackgroundDrawableResource(2131690597);
      showDialog();
      AppMethodBeat.o(45519);
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }

  public final void wU(int paramInt)
  {
    AppMethodBeat.i(45521);
    if (paramInt == 0)
    {
      finish();
      AppMethodBeat.o(45521);
    }
    while (true)
    {
      return;
      if (paramInt == 1)
        showDialog();
      AppMethodBeat.o(45521);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtCheckPwdInputDialogUI
 * JD-Core Version:    0.6.2
 */