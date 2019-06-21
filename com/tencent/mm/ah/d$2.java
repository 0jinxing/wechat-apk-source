package com.tencent.mm.ah;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

final class d$2
  implements d.a
{
  d$2(d paramd)
  {
  }

  public final void qj(String paramString)
  {
    AppMethodBeat.i(77874);
    ab.d("MicroMsg.AvatarStorage", "notifyChanged user:%s clonesize:%d watchers:%d", new Object[] { paramString, Integer.valueOf(d.a(this.frC).size()), Integer.valueOf(d.a(this.frC).size()) });
    ArrayList localArrayList = new ArrayList();
    while (true)
    {
      Iterator localIterator;
      synchronized (d.a(this.frC))
      {
        localIterator = d.a(this.frC).iterator();
        if (!localIterator.hasNext())
          break;
        Object localObject2 = (WeakReference)localIterator.next();
        if (localObject2 == null)
          continue;
        localObject2 = (d.a)((WeakReference)localObject2).get();
        if (localObject2 != null)
          localArrayList.add(localObject2);
      }
      localIterator.remove();
    }
    ??? = localArrayList.iterator();
    while (((Iterator)???).hasNext())
      ((d.a)((Iterator)???).next()).qj(paramString);
    AppMethodBeat.o(77874);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ah.d.2
 * JD-Core Version:    0.6.2
 */