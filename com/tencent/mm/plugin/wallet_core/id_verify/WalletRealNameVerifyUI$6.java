package com.tencent.mm.plugin.wallet_core.id_verify;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wallet_core.model.ElementQuery;
import com.tencent.mm.ui.base.h;
import java.util.LinkedList;
import java.util.List;

final class WalletRealNameVerifyUI$6
  implements View.OnClickListener
{
  WalletRealNameVerifyUI$6(WalletRealNameVerifyUI paramWalletRealNameVerifyUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(46626);
    LinkedList localLinkedList = new LinkedList();
    paramView = new LinkedList();
    localLinkedList.add(this.tvy.getString(2131304629));
    paramView.add(Integer.valueOf(0));
    if ((WalletRealNameVerifyUI.e(this.tvy) != null) && (WalletRealNameVerifyUI.e(this.tvy).tyW))
    {
      localLinkedList.add(this.tvy.getString(2131304627));
      paramView.add(Integer.valueOf(1));
    }
    h.a(this.tvy, "", localLinkedList, paramView, "", new WalletRealNameVerifyUI.6.1(this));
    AppMethodBeat.o(46626);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.id_verify.WalletRealNameVerifyUI.6
 * JD-Core Version:    0.6.2
 */