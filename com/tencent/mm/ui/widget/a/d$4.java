package com.tencent.mm.ui.widget.a;

import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class d$4
  implements DialogInterface.OnDismissListener
{
  d$4(d paramd)
  {
  }

  public final void onDismiss(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(112650);
    if (!d.p(this.zQE))
      this.zQE.zQf.onDismiss();
    AppMethodBeat.o(112650);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.widget.a.d.4
 * JD-Core Version:    0.6.2
 */