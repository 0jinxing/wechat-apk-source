package com.tencent.mm.ui.widget.a;

import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import android.view.View;
import android.view.ViewTreeObserver;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class d$3
  implements DialogInterface.OnDismissListener
{
  d$3(d paramd)
  {
  }

  public final void onDismiss(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(112649);
    if (d.m(this.zQE) != null)
    {
      if (!d.m(this.zQE).isAlive())
        d.a(this.zQE, d.n(this.zQE).getViewTreeObserver());
      d.m(this.zQE).removeGlobalOnLayoutListener(this.zQE);
      d.a(this.zQE, null);
    }
    d.o(this.zQE);
    AppMethodBeat.o(112649);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.widget.a.d.3
 * JD-Core Version:    0.6.2
 */