package com.tencent.mm.plugin.address.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class QrcodeInvoiceUI$6
  implements View.OnClickListener
{
  QrcodeInvoiceUI$6(QrcodeInvoiceUI paramQrcodeInvoiceUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(16917);
    if ((paramView.getId() == 2131826095) && (QrcodeInvoiceUI.b(this.gKM) != null))
    {
      this.gKM.showPopupWindow(paramView);
      QrcodeInvoiceUI.d(this.gKM);
    }
    AppMethodBeat.o(16917);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.address.ui.QrcodeInvoiceUI.6
 * JD-Core Version:    0.6.2
 */