package com.tencent.mm.plugin.e;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.e.m;
import com.tencent.mm.compatible.util.k;
import com.tencent.mm.kernel.a.c.a;
import com.tencent.mm.kernel.b.g;
import com.tencent.mm.sdk.platformtools.ab;
import junit.framework.Assert;

public final class f extends a
{
  public final void execute(g paramg)
  {
    AppMethodBeat.i(18528);
    int i = m.Lw();
    if ((i & 0x400) != 0)
    {
      ab.i("MicroMsg.SightInitTask", "load wechatsight_v7a, core number[%d]", new Object[] { Integer.valueOf(i >> 12) });
      k.a("wechatsight_v7a", getClass().getClassLoader());
      if (i >> 12 >= 4)
      {
        com.tencent.mm.plugin.sight.base.b.qwW = 3;
        com.tencent.mm.plugin.sight.base.b.qwY = 3;
        com.tencent.mm.plugin.sight.base.b.qwZ = 544000;
        AppMethodBeat.o(18528);
      }
    }
    while (true)
    {
      return;
      com.tencent.mm.plugin.sight.base.b.qwW = 1;
      com.tencent.mm.plugin.sight.base.b.qwY = 1;
      com.tencent.mm.plugin.sight.base.b.qwZ = 640000;
      AppMethodBeat.o(18528);
      continue;
      ab.i("MicroMsg.SightInitTask", "load wechatsight");
      k.a("wechatsight", getClass().getClassLoader());
      Assert.assertTrue("Can't remove libwechatsight.so yet.", false);
      com.tencent.mm.plugin.sight.base.b.qwW = 1;
      com.tencent.mm.plugin.sight.base.b.qwY = 1;
      com.tencent.mm.plugin.sight.base.b.qwZ = 640000;
      AppMethodBeat.o(18528);
    }
  }

  public final String name()
  {
    return "boot-sight-init";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.e.f
 * JD-Core Version:    0.6.2
 */