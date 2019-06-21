package com.tencent.mm.d.a;

import com.eclipsesource.v8.MultiContextNodeJS;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class i$2
  implements j.a
{
  i$2(i parami)
  {
  }

  public final boolean Cw()
  {
    AppMethodBeat.i(113813);
    boolean bool = i.a(this.chE).handleMessage();
    AppMethodBeat.o(113813);
    return bool;
  }

  public final void closeUVLoop()
  {
    AppMethodBeat.i(113815);
    if (i.a(this.chE) != null)
      i.a(this.chE).closeUVLoop();
    AppMethodBeat.o(113815);
  }

  public final void wakeUpUVLoop()
  {
    AppMethodBeat.i(113814);
    if (i.a(this.chE) != null)
      i.a(this.chE).wakeUpUVLoop();
    AppMethodBeat.o(113814);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.d.a.i.2
 * JD-Core Version:    0.6.2
 */