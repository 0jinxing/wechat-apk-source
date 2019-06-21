package com.tencent.mm.plugin.remittance.bankcard.ui;

import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemLongClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.atf;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.tools.j;

final class BankRemitHistoryUI$1
  implements AdapterView.OnItemLongClickListener
{
  BankRemitHistoryUI$1(BankRemitHistoryUI paramBankRemitHistoryUI)
  {
  }

  public final boolean onItemLongClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    AppMethodBeat.i(44606);
    ab.d("MicroMsg.BankRemitHistoryUI", "click item, %s", new Object[] { ((atf)paramAdapterView.getAdapter().getItem(paramInt)).title });
    BankRemitHistoryUI.a(this.pNs).a(paramView, paramInt, paramLong, this.pNs, this.pNs);
    AppMethodBeat.o(44606);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitHistoryUI.1
 * JD-Core Version:    0.6.2
 */