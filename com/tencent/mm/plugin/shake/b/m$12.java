package com.tencent.mm.plugin.shake.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.sdk.platformtools.bo;

final class m$12
  implements Runnable
{
  m$12(m paramm)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(24487);
    if (!aw.RK())
      AppMethodBeat.o(24487);
    while (true)
    {
      return;
      aw.ZK();
      bo.o(c.Yc(), "Sk", 604800000L);
      AppMethodBeat.o(24487);
    }
  }

  public final String toString()
  {
    AppMethodBeat.i(24488);
    String str = super.toString() + "|onAccountPostReset";
    AppMethodBeat.o(24488);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.shake.b.m.12
 * JD-Core Version:    0.6.2
 */