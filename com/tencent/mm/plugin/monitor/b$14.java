package com.tencent.mm.plugin.monitor;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

final class b$14
  implements Runnable
{
  final Map<String, Integer> oEX;

  b$14(b paramb, Map paramMap, a.a parama, com.tencent.mm.vfs.b paramb1, a parama1)
  {
    AppMethodBeat.i(84534);
    this.oEX = this.oEY;
    AppMethodBeat.o(84534);
  }

  public final void run()
  {
    AppMethodBeat.i(84535);
    ab.i("MicroMsg.SubCoreBaseMonitor", "summerhv true scan start fileScanResult[%s], subDirMap[%d]", new Object[] { this.oEZ, Integer.valueOf(this.oEY.size()) });
    long l = System.currentTimeMillis();
    b.a(this.oEL, this.oFa, this.oEZ, this.oEX);
    if (this.oEY.size() > 0)
    {
      Iterator localIterator = this.oEY.entrySet().iterator();
      while ((localIterator != null) && (localIterator.hasNext()))
      {
        Map.Entry localEntry = (Map.Entry)localIterator.next();
        this.oEZ.oEq.add(new a.b((String)localEntry.getKey(), ((Integer)localEntry.getValue()).intValue()));
      }
    }
    this.oEZ.ckF = (System.currentTimeMillis() - l);
    ab.i("MicroMsg.SubCoreBaseMonitor", "summerhv true scan end takes[%d], emptySubDir[%d], fileScanResult[%s], tid[%d]", new Object[] { Long.valueOf(this.oEZ.ckF), Integer.valueOf(this.oEY.values().size()), this.oEZ, Long.valueOf(Thread.currentThread().getId()) });
    this.oEW.a(0, this.oEZ);
    AppMethodBeat.o(84535);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.monitor.b.14
 * JD-Core Version:    0.6.2
 */