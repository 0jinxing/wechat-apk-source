package com.tencent.mm.plugin.address.ui;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;

final class InvoiceQrcodeTextView$2
  implements View.OnClickListener
{
  InvoiceQrcodeTextView$2(InvoiceQrcodeTextView paramInvoiceQrcodeTextView)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(16885);
    if (InvoiceQrcodeTextView.a(this.gKs).getVisibility() == 0)
      if ((this.gKs.gJL) && (InvoiceQrcodeTextView.b(this.gKs) != 2) && (!bo.isNullOrNil(this.gKs.getText())))
      {
        this.gKs.gKr.setText("");
        InvoiceQrcodeTextView.a(this.gKs, InvoiceQrcodeTextView.c(this.gKs).isFocused());
        AppMethodBeat.o(16885);
      }
    while (true)
    {
      return;
      if (InvoiceQrcodeTextView.d(this.gKs) != null)
        InvoiceQrcodeTextView.d(this.gKs);
      AppMethodBeat.o(16885);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.address.ui.InvoiceQrcodeTextView.2
 * JD-Core Version:    0.6.2
 */