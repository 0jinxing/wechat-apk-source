package com.tencent.mm.plugin.remittance.bankcard.ui;

import android.content.Intent;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.remittance.bankcard.model.TransferRecordParcel;
import com.tencent.mm.sdk.platformtools.ab;

final class BankRemitSelectPayeeUI$1
  implements AdapterView.OnItemClickListener
{
  BankRemitSelectPayeeUI$1(BankRemitSelectPayeeUI paramBankRemitSelectPayeeUI)
  {
  }

  public final void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    AppMethodBeat.i(44671);
    ab.d("MicroMsg.BankRemitSelectPayeeUI", "item click: %s", new Object[] { Integer.valueOf(paramInt) });
    paramAdapterView = (TransferRecordParcel)paramAdapterView.getAdapter().getItem(paramInt);
    if (paramAdapterView != null)
    {
      BankRemitSelectPayeeUI.a(this.pOo).putExtra("key_bank_card_seqno", paramAdapterView.pMd);
      this.pOo.setResult(-1, BankRemitSelectPayeeUI.a(this.pOo));
      this.pOo.finish();
    }
    AppMethodBeat.o(44671);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitSelectPayeeUI.1
 * JD-Core Version:    0.6.2
 */