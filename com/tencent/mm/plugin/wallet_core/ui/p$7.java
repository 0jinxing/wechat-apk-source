package com.tencent.mm.plugin.wallet_core.ui;

import android.content.DialogInterface.OnCancelListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;

final class p$7
  implements View.OnClickListener
{
  p$7(p paramp, DialogInterface.OnCancelListener paramOnCancelListener)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(47564);
    if (this.tKj != null)
      this.tKj.onCancel(null);
    if (this.tKg.tJP != null)
      this.tKg.tJP.bXx();
    this.tKg.cancel();
    if (this.tKg.tJU.isShown())
    {
      h.pYm.e(11977, new Object[] { Integer.valueOf(1), Integer.valueOf(0), Integer.valueOf(1), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0) });
      AppMethodBeat.o(47564);
    }
    while (true)
    {
      return;
      h.pYm.e(11977, new Object[] { Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(1), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0) });
      AppMethodBeat.o(47564);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.p.7
 * JD-Core Version:    0.6.2
 */