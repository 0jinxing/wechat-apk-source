package com.tencent.mm.plugin.label;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.g.a.mp;
import com.tencent.mm.model.aw;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.z;

public final class d extends com.tencent.mm.sdk.b.c<mp>
{
  public d()
  {
    AppMethodBeat.i(22511);
    this.xxI = mp.class.getName().hashCode();
    AppMethodBeat.o(22511);
  }

  private static boolean aiv()
  {
    AppMethodBeat.i(22512);
    aw.ZK();
    long l = ((Long)com.tencent.mm.model.c.Ry().get(209408, Long.valueOf(0L))).longValue();
    if (System.currentTimeMillis() - l > 86400000L);
    for (int i = 1; ; i = 0)
    {
      if (i != 0)
      {
        ab.i("MicroMsg.Label.PostTaskGetContactLabelListener", "cpan[callback] get contact label list.");
        aw.Rg().a(new com.tencent.mm.plugin.label.b.c(), 0);
        aw.ZK();
        com.tencent.mm.model.c.Ry().set(209408, Long.valueOf(System.currentTimeMillis() - 86400000L + 1800000L));
      }
      AppMethodBeat.o(22512);
      return false;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.label.d
 * JD-Core Version:    0.6.2
 */