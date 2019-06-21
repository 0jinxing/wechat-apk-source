package com.tencent.mm.modelgeo;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

final class d$3
  implements Runnable
{
  d$3(d paramd, b.a parama)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(78129);
    Object localObject1 = new ArrayList();
    Iterator localIterator = this.fBV.bkF.iterator();
    while (localIterator.hasNext())
    {
      localObject2 = (WeakReference)localIterator.next();
      if ((localObject2 == null) || (((WeakReference)localObject2).get() == null) || (((b.a)((WeakReference)localObject2).get()).equals(this.fCf)))
        ((List)localObject1).add(localObject2);
    }
    Object localObject2 = ((List)localObject1).iterator();
    while (((Iterator)localObject2).hasNext())
    {
      localObject1 = (WeakReference)((Iterator)localObject2).next();
      this.fBV.bkF.remove(localObject1);
    }
    ab.i("MicroMsg.LocationGeo", "stop listeners size %d", new Object[] { Integer.valueOf(this.fBV.bkF.size()) });
    if ((this.fBV.bkF.size() == 0) && (this.fBV.fBE != null))
      h.agE();
    AppMethodBeat.o(78129);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelgeo.d.3
 * JD-Core Version:    0.6.2
 */