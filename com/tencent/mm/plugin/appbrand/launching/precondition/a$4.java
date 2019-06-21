package com.tencent.mm.plugin.appbrand.launching.precondition;

import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class a$4
  implements Runnable
{
  a$4(a parama)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(132054);
    Looper.myLooper().quit();
    AppMethodBeat.o(132054);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.launching.precondition.a.4
 * JD-Core Version:    0.6.2
 */