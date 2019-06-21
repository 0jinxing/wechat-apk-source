package com.tencent.mm.plugin.remittance.bankcard.ui;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemLongClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.tools.j;

final class BankRemitSelectPayeeUI$3
  implements AdapterView.OnItemLongClickListener
{
  BankRemitSelectPayeeUI$3(BankRemitSelectPayeeUI paramBankRemitSelectPayeeUI)
  {
  }

  public final boolean onItemLongClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    AppMethodBeat.i(44673);
    BankRemitSelectPayeeUI.b(this.pOo).a(paramView, paramInt, paramLong, this.pOo, this.pOo);
    AppMethodBeat.o(44673);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitSelectPayeeUI.3
 * JD-Core Version:    0.6.2
 */