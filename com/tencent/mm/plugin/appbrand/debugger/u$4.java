package com.tencent.mm.plugin.appbrand.debugger;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class u$4
  implements DialogInterface.OnClickListener
{
  u$4(u paramu)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(101919);
    if (u.d(this.hkS) != null)
      u.d(this.hkS).azf();
    AppMethodBeat.o(101919);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.debugger.u.4
 * JD-Core Version:    0.6.2
 */