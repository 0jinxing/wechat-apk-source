package com.tencent.mm.plugin.address.b.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.j.a.b;
import java.util.Iterator;
import java.util.LinkedList;

public final class a
{
  public com.tencent.mm.plugin.j.a.a gIF;

  public a()
  {
    AppMethodBeat.i(16719);
    this.gIF = new com.tencent.mm.plugin.j.a.a();
    AppMethodBeat.o(16719);
  }

  public final b nd(int paramInt)
  {
    AppMethodBeat.i(16720);
    Iterator localIterator = this.gIF.nuG.iterator();
    b localb;
    while (localIterator.hasNext())
    {
      localb = (b)localIterator.next();
      if (localb.nuH == paramInt)
        AppMethodBeat.o(16720);
    }
    while (true)
    {
      return localb;
      localb = null;
      AppMethodBeat.o(16720);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.address.b.a.a
 * JD-Core Version:    0.6.2
 */