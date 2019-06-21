package com.tencent.mm.console;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ap;

final class b$10
  implements Runnable
{
  public final void run()
  {
    AppMethodBeat.i(16091);
    new ap(new b.10.1(this), true).ae(10000L, 10000L);
    AppMethodBeat.o(16091);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.console.b.10
 * JD-Core Version:    0.6.2
 */