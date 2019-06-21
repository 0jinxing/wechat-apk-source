package com.tencent.mm.plugin.zero.tasks;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.k;
import com.tencent.mm.kernel.b.g;
import com.tencent.wcdb.support.Log;

public final class a extends com.tencent.mm.kernel.a.c.a
{
  public final void execute(g paramg)
  {
    AppMethodBeat.i(58779);
    if (!k.kx("wcdb"))
      k.a("wcdb", getClass().getClassLoader());
    Log.setLogger(new a.1(this));
    AppMethodBeat.o(58779);
  }

  public final String name()
  {
    return "boot-db-prepare";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.zero.tasks.a
 * JD-Core Version:    0.6.2
 */