package com.tencent.mm.plugin.emoji.e;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.jt;
import com.tencent.mm.g.a.jt.a;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;

final class c$3 extends com.tencent.mm.sdk.b.c<jt>
{
  c$3(c paramc)
  {
    AppMethodBeat.i(52830);
    this.xxI = jt.class.getName().hashCode();
    AppMethodBeat.o(52830);
  }

  private static boolean a(jt paramjt)
  {
    AppMethodBeat.i(52831);
    if ((paramjt != null) && ((paramjt instanceof jt)))
    {
      ab.i("MicroMsg.emoji.EmojiEventMgr", "manualAuthEventListener callback");
      if (paramjt.cER.csN)
      {
        g.RP().Ry().set(ac.a.xJk, Boolean.TRUE);
        g.RP().Ry().set(ac.a.xJl, Boolean.TRUE);
      }
    }
    AppMethodBeat.o(52831);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.e.c.3
 * JD-Core Version:    0.6.2
 */