package com.tencent.mm.plugin.address.ui;

import android.content.ClipboardManager;
import android.content.Context;
import android.view.MenuItem;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.n.d;

final class InvoiceQrcodeTextView$1$2
  implements n.d
{
  InvoiceQrcodeTextView$1$2(InvoiceQrcodeTextView.1 param1, ClipboardManager paramClipboardManager, TextView paramTextView)
  {
  }

  public final void onMMMenuItemSelected(MenuItem paramMenuItem, int paramInt)
  {
    AppMethodBeat.i(16882);
    if (paramInt == 0)
    {
      this.gKu.setText(this.ekn.getText().toString());
      h.bP(this.ekn.getContext(), this.ekn.getContext().getString(2131296876));
    }
    AppMethodBeat.o(16882);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.address.ui.InvoiceQrcodeTextView.1.2
 * JD-Core Version:    0.6.2
 */