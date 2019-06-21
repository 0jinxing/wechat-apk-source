package com.tencent.mm.plugin.remittance.bankcard.ui;

import android.widget.ListView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.plugin.remittance.bankcard.a.i;
import com.tencent.mm.protocal.protobuf.boa;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.wallet_core.c.p.a;
import java.util.LinkedList;
import java.util.List;

final class BankRemitHistoryUI$5
  implements p.a
{
  BankRemitHistoryUI$5(BankRemitHistoryUI paramBankRemitHistoryUI, i parami)
  {
  }

  public final void e(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(44610);
    if (this.pNt.pLA.wvw != null)
    {
      ab.i("MicroMsg.BankRemitHistoryUI", "history size: %s", new Object[] { Integer.valueOf(this.pNt.pLA.wvw.size()) });
      if (this.pNt.pLA.wvw.size() < this.pNt.limit)
      {
        ab.i("MicroMsg.BankRemitHistoryUI", "is last: %s", new Object[] { Integer.valueOf(BankRemitHistoryUI.f(this.pNs)) });
        BankRemitHistoryUI.g(this.pNs);
        BankRemitHistoryUI.b(this.pNs).removeFooterView(BankRemitHistoryUI.h(this.pNs));
      }
      if (this.pNt.pLA.wvw == null)
        break label235;
      BankRemitHistoryUI.a(this.pNs, BankRemitHistoryUI.f(this.pNs) + this.pNt.pLA.wvw.size());
      BankRemitHistoryUI.i(this.pNs).addAll(this.pNt.pLA.wvw);
      BankRemitHistoryUI.j(this.pNs).notifyDataSetChanged();
      AppMethodBeat.o(44610);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.BankRemitHistoryUI", "return history is null");
      BankRemitHistoryUI.g(this.pNs);
      BankRemitHistoryUI.b(this.pNs).removeFooterView(BankRemitHistoryUI.h(this.pNs));
      label235: AppMethodBeat.o(44610);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitHistoryUI.5
 * JD-Core Version:    0.6.2
 */