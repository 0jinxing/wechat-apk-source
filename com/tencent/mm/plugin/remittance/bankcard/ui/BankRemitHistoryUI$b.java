package com.tencent.mm.plugin.remittance.bankcard.ui;

import android.view.View;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.ui.applet.CdnImageView;

final class BankRemitHistoryUI$b
{
  TextView gnf;
  TextView hrg;
  TextView pNv;
  TextView pNw;
  TextView pNx;
  CdnImageView pNy;

  public BankRemitHistoryUI$b(BankRemitHistoryUI paramBankRemitHistoryUI, View paramView)
  {
    AppMethodBeat.i(44619);
    this.pNv = ((TextView)paramView.findViewById(2131821664));
    this.hrg = ((TextView)paramView.findViewById(2131821667));
    this.pNw = ((TextView)paramView.findViewById(2131821668));
    this.gnf = ((TextView)paramView.findViewById(2131821669));
    this.pNx = ((TextView)paramView.findViewById(2131821670));
    this.pNy = ((CdnImageView)paramView.findViewById(2131821666));
    AppMethodBeat.o(44619);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitHistoryUI.b
 * JD-Core Version:    0.6.2
 */