package com.tencent.mm.plugin.wallet.pay.ui;

import android.support.v7.app.AppCompatActivity;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.plugin.wallet_core.ui.j.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.q;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

final class WalletPayDeductUI$3
  implements j.a
{
  WalletPayDeductUI$3(WalletPayDeductUI paramWalletPayDeductUI, List paramList)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(46020);
    AppCompatActivity localAppCompatActivity = this.tpn.mController.ylL;
    Object localObject = this.tpo;
    String str = WalletPayDeductUI.a(this.tpn);
    Bankcard localBankcard1 = WalletPayDeductUI.b(this.tpn);
    paramView = new WalletPayDeductUI.3.1(this);
    LinkedList localLinkedList = new LinkedList();
    if (((localObject == null) || (((List)localObject).size() == 0)) && (bo.isNullOrNil(null)))
    {
      ab.w("MicroMsg.WalletDialogHelper", "hy: bankcard list is null and should not show new");
      AppMethodBeat.o(46020);
      return;
    }
    int i;
    if ((localObject != null) && (((List)localObject).size() != 0))
    {
      localObject = ((List)localObject).iterator();
      i = 0;
      for (int j = 0; ((Iterator)localObject).hasNext(); j = k)
      {
        Bankcard localBankcard2 = (Bankcard)((Iterator)localObject).next();
        localLinkedList.add(localBankcard2.field_desc);
        k = j;
        if (localBankcard1 != null)
        {
          k = j;
          if (localBankcard1.equals(localBankcard2))
            k = i;
        }
        i++;
      }
      k = j;
      if (!bo.isNullOrNil(null))
      {
        localLinkedList.add(null);
        k = j;
        if (localBankcard1 != null);
      }
    }
    for (int k = i; ; k = 0)
    {
      h.a(localAppCompatActivity, str, localLinkedList, k, paramView);
      AppMethodBeat.o(46020);
      break;
      ab.i("MicroMsg.WalletDialogHelper", "hy: no bankcard show new only");
      localLinkedList.add(null);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.pay.ui.WalletPayDeductUI.3
 * JD-Core Version:    0.6.2
 */