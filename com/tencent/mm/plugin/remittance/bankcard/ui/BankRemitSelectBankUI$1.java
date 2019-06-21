package com.tencent.mm.plugin.remittance.bankcard.ui;

import android.content.Intent;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.remittance.bankcard.model.BankcardElemParcel;
import com.tencent.mm.protocal.protobuf.hd;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.sortview.d;

final class BankRemitSelectBankUI$1
  implements AdapterView.OnItemClickListener
{
  BankRemitSelectBankUI$1(BankRemitSelectBankUI paramBankRemitSelectBankUI)
  {
  }

  public final void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    AppMethodBeat.i(44663);
    paramAdapterView = (hd)((d)paramAdapterView.getAdapter().getItem(paramInt)).data;
    if (paramAdapterView != null)
    {
      paramView = new BankcardElemParcel(paramAdapterView);
      paramAdapterView = new Intent();
      paramAdapterView.putExtra("key_bank_card_elem_parcel", paramView);
      this.pOe.setResult(-1, paramAdapterView);
      this.pOe.finish();
      AppMethodBeat.o(44663);
    }
    while (true)
    {
      return;
      ab.w("MicroMsg.BankRemitSelectBankUI", "bankcardelem is null, : %s", new Object[] { Integer.valueOf(paramInt) });
      AppMethodBeat.o(44663);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitSelectBankUI.1
 * JD-Core Version:    0.6.2
 */