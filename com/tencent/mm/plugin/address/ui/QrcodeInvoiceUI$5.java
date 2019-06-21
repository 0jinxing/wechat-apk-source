package com.tencent.mm.plugin.address.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.o;

final class QrcodeInvoiceUI$5
  implements View.OnClickListener
{
  QrcodeInvoiceUI$5(QrcodeInvoiceUI paramQrcodeInvoiceUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(16916);
    if ((paramView.getId() == 2131825034) && (QrcodeInvoiceUI.b(this.gKM) != null) && (QrcodeInvoiceUI.b(this.gKM).isShowing()))
      QrcodeInvoiceUI.b(this.gKM).dismiss();
    AppMethodBeat.o(16916);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.address.ui.QrcodeInvoiceUI.5
 * JD-Core Version:    0.6.2
 */