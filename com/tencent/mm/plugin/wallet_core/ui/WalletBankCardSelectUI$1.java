package com.tencent.mm.plugin.wallet_core.ui;

import android.content.Intent;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wallet_core.ui.view.BankCardSelectSortView.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.sortview.d;

final class WalletBankCardSelectUI$1
  implements AdapterView.OnItemClickListener
{
  WalletBankCardSelectUI$1(WalletBankCardSelectUI paramWalletBankCardSelectUI)
  {
  }

  public final void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    AppMethodBeat.i(47140);
    paramView = (d)paramAdapterView.getAdapter().getItem(paramInt);
    paramAdapterView = this.tEf;
    paramView = (BankCardSelectSortView.a)paramView.data;
    if (paramView != null)
    {
      paramAdapterView.aqX();
      Intent localIntent = new Intent();
      localIntent.putExtra("bank_name", paramView.pcj);
      ab.i("WalletBankCardSelectUI", "item bank: %s", new Object[] { paramView.pcj });
      paramAdapterView.setResult(-1, localIntent);
      paramAdapterView.finish();
    }
    AppMethodBeat.o(47140);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.WalletBankCardSelectUI.1
 * JD-Core Version:    0.6.2
 */