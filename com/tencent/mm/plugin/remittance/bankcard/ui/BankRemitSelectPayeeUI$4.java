package com.tencent.mm.plugin.remittance.bankcard.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.remittance.bankcard.model.TransferRecordParcel;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.h.b;

final class BankRemitSelectPayeeUI$4
  implements h.b
{
  BankRemitSelectPayeeUI$4(BankRemitSelectPayeeUI paramBankRemitSelectPayeeUI, TransferRecordParcel paramTransferRecordParcel)
  {
  }

  public final boolean s(CharSequence paramCharSequence)
  {
    AppMethodBeat.i(44674);
    if (((this.pOq.pMg == null) && (paramCharSequence == null)) || ((this.pOq.pMg != null) && (this.pOq.pMg.equals(paramCharSequence))))
    {
      ab.i("MicroMsg.BankRemitSelectPayeeUI", "no change: %s, %s", new Object[] { this.pOq.pMg, paramCharSequence });
      AppMethodBeat.o(44674);
    }
    while (true)
    {
      return true;
      BankRemitSelectPayeeUI.a(this.pOo, this.pOq.pMd, String.valueOf(paramCharSequence));
      AppMethodBeat.o(44674);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitSelectPayeeUI.4
 * JD-Core Version:    0.6.2
 */