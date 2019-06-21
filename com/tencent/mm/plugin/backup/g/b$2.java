package com.tencent.mm.plugin.backup.g;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

final class b$2
  implements Runnable
{
  b$2(b paramb, int paramInt1, int paramInt2, String paramString)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(17639);
    synchronized (b.aje())
    {
      Set localSet = (Set)b.aje().get(Integer.valueOf(this.jxn.getType()));
      if ((localSet != null) && (localSet.size() > 0))
      {
        ??? = new HashSet();
        ((Set)???).addAll(localSet);
        Iterator localIterator = ((Set)???).iterator();
        while (localIterator.hasNext())
        {
          ??? = (f)localIterator.next();
          if ((??? != null) && (localSet.contains(???)))
            ((f)???).onSceneEnd(this.crc, this.crd, this.ftO, this.jxn);
        }
      }
    }
    AppMethodBeat.o(17639);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.g.b.2
 * JD-Core Version:    0.6.2
 */