package com.tencent.mm.plugin.address.ui;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;

final class InvoiceEditView$4
  implements View.OnClickListener
{
  InvoiceEditView$4(InvoiceEditView paramInvoiceEditView)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(16833);
    if (InvoiceEditView.f(this.gKa).getVisibility() == 0)
      if ((this.gKa.gJL) && (InvoiceEditView.a(this.gKa) != 2) && (!bo.isNullOrNil(this.gKa.getText())))
      {
        this.gKa.gJF.setText("");
        InvoiceEditView.a(this.gKa, InvoiceEditView.e(this.gKa).isFocused());
        AppMethodBeat.o(16833);
      }
    while (true)
    {
      return;
      if (InvoiceEditView.g(this.gKa) != null)
        InvoiceEditView.g(this.gKa);
      AppMethodBeat.o(16833);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.address.ui.InvoiceEditView.4
 * JD-Core Version:    0.6.2
 */