package com.tencent.xweb.xwalk;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class c$b$1
  implements DialogInterface.OnCancelListener
{
  c$b$1(c.b paramb)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(85176);
    this.ARH.ARk.aAe();
    AppMethodBeat.o(85176);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.xweb.xwalk.c.b.1
 * JD-Core Version:    0.6.2
 */