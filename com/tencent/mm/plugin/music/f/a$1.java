package com.tencent.mm.plugin.music.f;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ax.a;

final class a$1
  implements ax.a
{
  a$1(a parama)
  {
  }

  public final void ih(int paramInt)
  {
    AppMethodBeat.i(137547);
    switch (paramInt)
    {
    default:
    case 0:
    case 1:
    case 2:
    }
    while (true)
    {
      AppMethodBeat.o(137547);
      while (true)
      {
        return;
        if (!this.oNv.oJZ)
          break;
        this.oNv.oJZ = false;
        this.oNv.resume();
        AppMethodBeat.o(137547);
      }
      if (this.oNv.aie())
      {
        this.oNv.oJZ = true;
        this.oNv.pause();
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.music.f.a.1
 * JD-Core Version:    0.6.2
 */