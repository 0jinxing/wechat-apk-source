package com.tencent.mm.plugin.appbrand.appusage;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.config.j.a;
import com.tencent.mm.plugin.appbrand.config.r;
import com.tencent.mm.protocal.protobuf.anx;
import com.tencent.mm.protocal.protobuf.bzq;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

final class am$3
  implements Runnable
{
  am$3(am paramam, anx paramanx)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(129729);
    if (!bo.ek(this.haZ.wss))
    {
      LinkedList localLinkedList = new LinkedList();
      Iterator localIterator = this.haZ.wss.iterator();
      while (localIterator.hasNext())
        localLinkedList.add(((bzq)localIterator.next()).username);
      r.a(localLinkedList, j.a.hhk);
    }
    AppMethodBeat.o(129729);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.appusage.am.3
 * JD-Core Version:    0.6.2
 */