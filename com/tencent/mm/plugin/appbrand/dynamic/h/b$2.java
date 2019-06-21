package com.tencent.mm.plugin.appbrand.dynamic.h;

import android.os.Process;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class b$2
  implements Runnable
{
  public final void run()
  {
    AppMethodBeat.i(10946);
    Process.killProcess(Process.myPid());
    AppMethodBeat.o(10946);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.dynamic.h.b.2
 * JD-Core Version:    0.6.2
 */