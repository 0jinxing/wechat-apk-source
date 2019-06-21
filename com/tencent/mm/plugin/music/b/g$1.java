package com.tencent.mm.plugin.music.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ax.a;

final class g$1
  implements ax.a
{
  g$1(g paramg)
  {
  }

  public final void ih(int paramInt)
  {
    AppMethodBeat.i(137346);
    switch (paramInt)
    {
    default:
    case 0:
    case 1:
    case 2:
    }
    while (true)
    {
      AppMethodBeat.o(137346);
      while (true)
      {
        return;
        if (!this.oKb.oJZ)
          break;
        this.oKb.oJZ = false;
        this.oKb.resume();
        AppMethodBeat.o(137346);
      }
      if (this.oKb.aie())
      {
        this.oKb.oJZ = true;
        this.oKb.pause();
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.music.b.g.1
 * JD-Core Version:    0.6.2
 */