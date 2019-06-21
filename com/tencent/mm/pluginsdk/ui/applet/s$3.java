package com.tencent.mm.pluginsdk.ui.applet;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.widget.a.c;

final class s$3
  implements DialogInterface.OnClickListener
{
  s$3(s params)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(79791);
    if (this.vlo.gud != null)
    {
      this.vlo.gud.dismiss();
      this.vlo.gud = null;
    }
    this.vlo.onStop();
    if (this.vlo.vlk != null)
      this.vlo.vlk.bD(false);
    AppMethodBeat.o(79791);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.applet.s.3
 * JD-Core Version:    0.6.2
 */