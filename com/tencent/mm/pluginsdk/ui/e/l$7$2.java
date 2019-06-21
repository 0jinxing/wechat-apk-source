package com.tencent.mm.pluginsdk.ui.e;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnDismissListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class l$7$2
  implements DialogInterface.OnCancelListener
{
  l$7$2(l.7 param7)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(28138);
    if (this.vsg.vsb != null)
      this.vsg.vsb.onDismiss(null);
    AppMethodBeat.o(28138);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.e.l.7.2
 * JD-Core Version:    0.6.2
 */