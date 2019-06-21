package com.tencent.mm.plugin.e;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.k;
import com.tencent.mm.kernel.a.c.a;
import com.tencent.mm.kernel.b.g;

public final class d extends a
{
  public final void execute(g paramg)
  {
    AppMethodBeat.i(18524);
    k.a("wechatvoicereco", getClass().getClassLoader());
    AppMethodBeat.o(18524);
  }

  public final String name()
  {
    return "boot-load-wechatvoicereco-library";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.e.d
 * JD-Core Version:    0.6.2
 */