package com.tencent.mm.plugin.wallet_core.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wallet_core.model.ElementQuery;
import com.tencent.mm.ui.base.h;
import java.util.LinkedList;
import java.util.List;

final class WalletCardImportUI$5
  implements View.OnClickListener
{
  WalletCardImportUI$5(WalletCardImportUI paramWalletCardImportUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(47270);
    LinkedList localLinkedList = new LinkedList();
    paramView = new LinkedList();
    localLinkedList.add(this.tGt.getString(2131304629));
    paramView.add(Integer.valueOf(0));
    if ((WalletCardImportUI.c(this.tGt) != null) && (WalletCardImportUI.c(this.tGt).tyW))
    {
      localLinkedList.add(this.tGt.getString(2131304627));
      paramView.add(Integer.valueOf(1));
    }
    h.a(this.tGt, "", localLinkedList, paramView, "", new WalletCardImportUI.5.1(this));
    AppMethodBeat.o(47270);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.WalletCardImportUI.5
 * JD-Core Version:    0.6.2
 */