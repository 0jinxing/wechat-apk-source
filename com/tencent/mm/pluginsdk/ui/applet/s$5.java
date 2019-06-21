package com.tencent.mm.pluginsdk.ui.applet;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class s$5
  implements DialogInterface.OnCancelListener
{
  s$5(s params)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(79793);
    this.vlo.onStop();
    if (this.vlo.vlk != null)
      this.vlo.vlk.bD(false);
    AppMethodBeat.o(79793);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.applet.s.5
 * JD-Core Version:    0.6.2
 */