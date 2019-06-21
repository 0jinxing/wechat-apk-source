package com.tencent.mm.performance.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class a$1
  implements Runnable
{
  a$1(a parama)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(76868);
    ab.i("MicroMsg.MemoryWatchDog", "[dumpMemoryAsync] %s", new Object[] { this.ggf.df(true) });
    AppMethodBeat.o(76868);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.performance.a.a.1
 * JD-Core Version:    0.6.2
 */