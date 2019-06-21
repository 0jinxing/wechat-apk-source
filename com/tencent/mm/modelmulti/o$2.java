package com.tencent.mm.modelmulti;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Queue;

final class o$2
  implements Runnable
{
  o$2(o paramo, o.c paramc)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(58397);
    if (this.fJm != null)
    {
      if (!(this.fJm instanceof o.f))
        break label53;
      o.b(this.fJl).add(this.fJm);
    }
    while (true)
    {
      o.a(this.fJl, null);
      AppMethodBeat.o(58397);
      return;
      label53: o.c(this.fJl).add(this.fJm);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelmulti.o.2
 * JD-Core Version:    0.6.2
 */