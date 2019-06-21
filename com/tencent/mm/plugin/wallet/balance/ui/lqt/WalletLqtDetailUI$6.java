package com.tencent.mm.plugin.wallet.balance.ui.lqt;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.platformtools.ae;
import com.tencent.mm.plugin.wallet.balance.a.a.r;
import com.tencent.mm.plugin.wallet.balance.a.a.r.c;
import com.tencent.mm.protocal.protobuf.bnr;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.wallet_core.ui.e;

final class WalletLqtDetailUI$6
  implements View.OnClickListener
{
  WalletLqtDetailUI$6(WalletLqtDetailUI paramWalletLqtDetailUI)
  {
  }

  public final void onClick(View paramView)
  {
    boolean bool1 = true;
    AppMethodBeat.i(45527);
    boolean bool2;
    if (ae.gjv)
    {
      Intent localIntent = new Intent(this.tiH, WalletLqtSaveFetchUI.class);
      if (WalletLqtDetailUI.c(this.tiH) != null)
      {
        paramView = WalletLqtDetailUI.c(this.tiH).wPv;
        localIntent.putExtra("lqt_save_fund_code", paramView);
        localIntent.putExtra("lqt_save_fetch_mode", 1);
        if (WalletLqtDetailUI.c(this.tiH).cRh != 1)
          break label166;
        bool2 = true;
        label81: localIntent.putExtra("lqt_is_show_protocol", bool2);
        if (WalletLqtDetailUI.c(this.tiH).wQw != 1)
          break label172;
        bool2 = bool1;
        label107: localIntent.putExtra("lqt_is_agree_protocol", bool2);
        localIntent.putStringArrayListExtra("lqt_protocol_list", WalletLqtDetailUI.e(this.tiH));
        localIntent.putExtra("lqt_profile_wording", WalletLqtDetailUI.c(this.tiH).wQp);
        this.tiH.startActivity(localIntent);
        AppMethodBeat.o(45527);
      }
    }
    while (true)
    {
      return;
      paramView = null;
      break;
      label166: bool2 = false;
      break label81;
      label172: bool2 = false;
      break label107;
      WalletLqtDetailUI.f(this.tiH).tfF.ge(WalletLqtDetailUI.c(this.tiH).wao, 1);
      if (!bo.isNullOrNil(WalletLqtDetailUI.c(this.tiH).wQC))
      {
        ab.i("MicroMsg.WalletLqtDetailUI", "click save button, go to block url: %s", new Object[] { WalletLqtDetailUI.c(this.tiH).wQC });
        e.n(this.tiH, WalletLqtDetailUI.c(this.tiH).wQC, false);
        AppMethodBeat.o(45527);
      }
      else
      {
        WalletLqtDetailUI.a(this.tiH, true, WalletLqtDetailUI.c(this.tiH).wQP);
        AppMethodBeat.o(45527);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtDetailUI.6
 * JD-Core Version:    0.6.2
 */