package com.tencent.mm.pluginsdk.g.a.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Iterator;
import java.util.List;

final class i$2
  implements Runnable
{
  i$2(i parami, List paramList, m paramm, String paramString)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(79572);
    Iterator localIterator = this.vff.iterator();
    while (localIterator.hasNext())
    {
      d locald = (d)localIterator.next();
      if (bo.nullAsNil(locald.awa()).equals(this.gUA.groupId))
        locald.a(this.vdU, this.gUA);
    }
    AppMethodBeat.o(79572);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.g.a.c.i.2
 * JD-Core Version:    0.6.2
 */