package com.tencent.mm.plugin.appbrand.j;

import android.content.DialogInterface;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.r.j;

final class h$3$1$1
  implements Runnable
{
  h$3$1$1(h.3.1 param1)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(102153);
    if (this.inZ.inY.inW.value != null)
      ((DialogInterface)this.inZ.inY.inW.value).dismiss();
    AppMethodBeat.o(102153);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.j.h.3.1.1
 * JD-Core Version:    0.6.2
 */