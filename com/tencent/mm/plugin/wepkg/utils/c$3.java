package com.tencent.mm.plugin.wepkg.utils;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wepkg.model.i;
import java.util.List;

final class c$3
  implements Runnable
{
  c$3(c paramc, List paramList)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(63634);
    for (int i = 0; (i < this.uYa.size()) && (i < 5); i++)
    {
      String str = (String)this.uYa.get(i);
      i.dgD().bQ(str, false);
    }
    AppMethodBeat.o(63634);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wepkg.utils.c.3
 * JD-Core Version:    0.6.2
 */