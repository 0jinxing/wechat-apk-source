package com.tencent.mm.plugin.sns;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.b;
import com.tencent.mm.kernel.g;
import com.tencent.mm.modelstat.i;

public final class a
  implements com.tencent.mm.plugin.sns.b.a
{
  public final void i(int paramInt1, String paramString, int paramInt2)
  {
    AppMethodBeat.i(35596);
    paramString = new i(paramInt1, paramString, paramInt2);
    g.RQ();
    g.RO().eJo.a(paramString, 0);
    AppMethodBeat.o(35596);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.a
 * JD-Core Version:    0.6.2
 */