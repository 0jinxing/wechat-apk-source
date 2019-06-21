package com.tencent.mm.plugin.music.b.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ag;
import java.util.HashMap;

final class c$1
  implements Runnable
{
  c$1(c paramc, String paramString1, String paramString2)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(104816);
    String str = this.oJX + "-" + ag.ck(this.oKE);
    synchronized (c.bDq())
    {
      if (c.Nx().containsKey(str))
      {
        c.Nx().put(str, Integer.valueOf(((Integer)c.Nx().get(str)).intValue() + 1));
        c.bTn();
        AppMethodBeat.o(104816);
        return;
      }
      c.Nx().put(str, Integer.valueOf(1));
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.music.b.a.c.1
 * JD-Core Version:    0.6.2
 */