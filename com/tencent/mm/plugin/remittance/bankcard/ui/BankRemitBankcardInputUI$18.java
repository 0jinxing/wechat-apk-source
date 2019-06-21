package com.tencent.mm.plugin.remittance.bankcard.ui;

import android.support.v7.widget.ListPopupWindow;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.remittance.bankcard.model.TransferRecordParcel;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;

final class BankRemitBankcardInputUI$18
  implements AdapterView.OnItemClickListener
{
  BankRemitBankcardInputUI$18(BankRemitBankcardInputUI paramBankRemitBankcardInputUI)
  {
  }

  public final void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    AppMethodBeat.i(44533);
    ab.i("MicroMsg.BankRemitBankcardInputUI", "popup window click: %d", new Object[] { Integer.valueOf(paramInt) });
    BankRemitBankcardInputUI.a(this.pMO, false);
    BankRemitBankcardInputUI.a(this.pMO, (TransferRecordParcel)paramAdapterView.getAdapter().getItem(paramInt));
    BankRemitBankcardInputUI.R(this.pMO);
    BankRemitBankcardInputUI.a(this.pMO, BankRemitBankcardInputUI.S(this.pMO).pMd, BankRemitBankcardInputUI.L(this.pMO), BankRemitBankcardInputUI.S(this.pMO).pbn);
    al.n(new BankRemitBankcardInputUI.18.1(this), 500L);
    BankRemitBankcardInputUI.f(this.pMO).dismiss();
    this.pMO.aqX();
    AppMethodBeat.o(44533);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitBankcardInputUI.18
 * JD-Core Version:    0.6.2
 */