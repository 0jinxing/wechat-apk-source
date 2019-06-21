package com.tencent.mm.plugin.music.b.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ag;
import java.util.HashMap;

final class c$2
  implements Runnable
{
  c$2(c paramc, String paramString1, String paramString2, boolean paramBoolean)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(104817);
    String str = this.oJX + "-" + ag.ck(this.oKE);
    while (true)
    {
      synchronized (c.bDq())
      {
        if (c.bDq().containsKey(str))
        {
          c.bDq().put(str, Integer.valueOf(((Integer)c.bDq().get(str)).intValue() + 1));
          if (!this.oKG)
          {
            c.alh();
            AppMethodBeat.o(104817);
          }
        }
        else
        {
          c.bDq().put(str, Integer.valueOf(1));
        }
      }
      c.Cd();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.music.b.a.c.2
 * JD-Core Version:    0.6.2
 */