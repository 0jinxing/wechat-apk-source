package com.tencent.mm.plugin.card.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import com.tencent.mm.x.a;
import com.tencent.mm.x.c;

final class k$1
  implements Runnable
{
  public final void run()
  {
    AppMethodBeat.i(87739);
    ab.i("MicroMsg.CardMsgManager", "begin to clearRedDotAndWording()");
    g.RP().Ry().set(ac.a.xKj, "");
    g.RP().Ry().set(ac.a.xKp, Integer.valueOf(0));
    g.RP().Ry().set(ac.a.xKm, "");
    g.RP().Ry().set(ac.a.xKn, "");
    g.RP().Ry().set(ac.a.xKo, "");
    g.RP().Ry().set(ac.a.xKA, "");
    g.RP().Ry().set(ac.a.xKB, Boolean.FALSE);
    if (c.PK().bY(262152, 266256))
      c.PK().y(262152, false);
    if (c.PK().bX(262152, 266256))
      c.PK().x(262152, false);
    if (c.PK().a(ac.a.xKd, ac.a.xKf))
      c.PK().a(ac.a.xKd, false);
    if (c.PK().a(ac.a.xKe, ac.a.xKg))
      c.PK().a(ac.a.xKe, false);
    ab.i("MicroMsg.CardMsgManager", "end to clearRedDotAndWording()");
    AppMethodBeat.o(87739);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.b.k.1
 * JD-Core Version:    0.6.2
 */