package com.tencent.mm.plugin.backup.g;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.plugin.backup.i.x;

final class c$1
  implements f
{
  c$1(c paramc, c.b paramb)
  {
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(17641);
    paramString = (c)paramm;
    this.jxt.g(c.a.a(c.b(paramString), paramString), paramString.jxp.jCx, paramString.aUj());
    AppMethodBeat.o(17641);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.g.c.1
 * JD-Core Version:    0.6.2
 */