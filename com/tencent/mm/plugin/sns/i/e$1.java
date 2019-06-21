package com.tencent.mm.plugin.sns.i;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.y;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

final class e$1
  implements Runnable
{
  e$1(e parame, LinkedHashMap paramLinkedHashMap)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(36880);
    long l = bo.yz();
    int i = this.qTm.size();
    if (i >= e.a(this.qTn))
    {
      int j = e.a(this.qTn);
      Iterator localIterator = this.qTm.keySet().iterator();
      for (int k = 0; (localIterator.hasNext()) && (k < i - j); k++)
      {
        localIterator.next();
        localIterator.remove();
      }
      al.d(new e.1.1(this));
    }
    e.c(this.qTn).set(6, this.qTm);
    ab.i("MicroMsg.SnsReportHelper", "save exposure feed id for cgi [%d] oriSize[%d] cost[%d]", new Object[] { Integer.valueOf(this.qTm.size()), Integer.valueOf(i), Long.valueOf(bo.az(l)) });
    AppMethodBeat.o(36880);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.i.e.1
 * JD-Core Version:    0.6.2
 */