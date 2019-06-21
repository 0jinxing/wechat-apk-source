package com.tencent.mm.pluginsdk.ui.e;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnDismissListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class l$6
  implements DialogInterface.OnCancelListener
{
  l$6(DialogInterface.OnDismissListener paramOnDismissListener)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(28136);
    if (this.vsb != null)
      this.vsb.onDismiss(null);
    AppMethodBeat.o(28136);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.e.l.6
 * JD-Core Version:    0.6.2
 */