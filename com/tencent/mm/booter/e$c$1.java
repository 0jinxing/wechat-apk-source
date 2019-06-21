package com.tencent.mm.booter;

import android.os.Process;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class e$c$1
  implements Runnable
{
  e$c$1(e.c paramc)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(15842);
    Process.killProcess(Process.myPid());
    AppMethodBeat.o(15842);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.booter.e.c.1
 * JD-Core Version:    0.6.2
 */