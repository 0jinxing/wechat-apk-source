package com.tencent.mm.plugin.zero.tasks;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.k;
import com.tencent.mm.kernel.a.c.a;
import com.tencent.mm.kernel.b.g;

public final class b extends a
{
  public final void execute(g paramg)
  {
    AppMethodBeat.i(58786);
    k.a("commonimgdec", getClass().getClassLoader());
    k.a("wechatcommon", getClass().getClassLoader());
    AppMethodBeat.o(58786);
  }

  public final String name()
  {
    return "boot-load-wechatcommon-library";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.zero.tasks.b
 * JD-Core Version:    0.6.2
 */