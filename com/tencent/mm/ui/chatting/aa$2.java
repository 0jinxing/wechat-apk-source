package com.tencent.mm.ui.chatting;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.platformtools.ah;
import com.tencent.mm.pluginsdk.g.a.a.m;
import com.tencent.mm.storage.z;

final class aa$2
  implements Runnable
{
  aa$2(aa paramaa)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(30917);
    if (!aw.RK())
      AppMethodBeat.o(30917);
    while (true)
    {
      return;
      m localm = new m(37);
      aw.Rg().a(localm, 0);
      aw.ZK();
      c.Ry().set(68108, Long.valueOf(ah.anT()));
      AppMethodBeat.o(30917);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.aa.2
 * JD-Core Version:    0.6.2
 */