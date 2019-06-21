package com.tencent.mm.plugin.wallet_core.ui;

import android.content.DialogInterface.OnCancelListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;

final class q$10
  implements View.OnClickListener
{
  q$10(q paramq, DialogInterface.OnCancelListener paramOnCancelListener)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(47603);
    if (this.tKj != null)
      this.tKj.onCancel(null);
    if (this.tKq.tKm != null)
      this.tKq.tKm.bXx();
    this.tKq.cancel();
    if (this.tKq.tJU.isShown())
    {
      h.pYm.e(11977, new Object[] { Integer.valueOf(1), Integer.valueOf(0), Integer.valueOf(1), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0) });
      AppMethodBeat.o(47603);
    }
    while (true)
    {
      return;
      h.pYm.e(11977, new Object[] { Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(1), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0) });
      AppMethodBeat.o(47603);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.q.10
 * JD-Core Version:    0.6.2
 */