package com.tencent.mm.plugin.shake.c.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelgeo.b.a;
import com.tencent.mm.plugin.shake.b.m;
import com.tencent.mm.sdk.platformtools.ab;

final class g$1
  implements b.a
{
  g$1(g paramg)
  {
  }

  public final boolean a(boolean paramBoolean, float paramFloat1, float paramFloat2, int paramInt, double paramDouble1, double paramDouble2, double paramDouble3)
  {
    AppMethodBeat.i(24528);
    if (!paramBoolean)
    {
      paramBoolean = true;
      AppMethodBeat.o(24528);
    }
    while (true)
    {
      return paramBoolean;
      if ((g.a(this.qsM) == -85.0F) && (g.b(this.qsM) == -1000.0F))
      {
        g.a(this.qsM, paramFloat2);
        g.b(this.qsM, paramFloat1);
        m.cjY().ecs = g.a(this.qsM);
        m.cjY().ect = g.b(this.qsM);
        if (g.c(this.qsM))
        {
          ab.i("MicroMsg.ShakeCardService", "ShakeCardService do netscen from onGetLocation()");
          g.d(this.qsM);
        }
      }
      paramBoolean = false;
      AppMethodBeat.o(24528);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.shake.c.a.g.1
 * JD-Core Version:    0.6.2
 */