package com.tencent.mm.plugin.appbrand.j;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class h$2
  implements DialogInterface.OnCancelListener
{
  h$2(h paramh, String paramString)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(102152);
    paramDialogInterface.dismiss();
    h.a(this.inU, this.gPZ, a.d.inJ);
    AppMethodBeat.o(102152);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.j.h.2
 * JD-Core Version:    0.6.2
 */