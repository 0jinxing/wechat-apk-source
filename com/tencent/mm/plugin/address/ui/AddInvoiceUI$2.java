package com.tencent.mm.plugin.address.ui;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.Button;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class AddInvoiceUI$2
  implements View.OnTouchListener
{
  AddInvoiceUI$2(AddInvoiceUI paramAddInvoiceUI)
  {
  }

  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    boolean bool = true;
    AppMethodBeat.i(16788);
    if (paramMotionEvent.getAction() == 0)
      AppMethodBeat.o(16788);
    while (true)
    {
      return bool;
      if (paramMotionEvent.getAction() != 1)
      {
        AppMethodBeat.o(16788);
        bool = false;
      }
      else
      {
        if (!AddInvoiceUI.b(this.gJA).isActivated())
          AddInvoiceUI.b(this.gJA).setActivated(true);
        if (AddInvoiceUI.b(this.gJA).isActivated())
        {
          AddInvoiceUI.a(this.gJA).setActivated(false);
          AddInvoiceUI.c(this.gJA).type = "1";
        }
        AddInvoiceUI.d(this.gJA);
        AppMethodBeat.o(16788);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.address.ui.AddInvoiceUI.2
 * JD-Core Version:    0.6.2
 */