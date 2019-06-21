package com.tencent.mm.plugin.u.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

final class b$3
  implements Runnable
{
  b$3(b paramb, d paramd)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(80752);
    b localb = this.pAu;
    Object localObject1 = this.pAv;
    ab.i("MicroMsg.FileScanQueueService", "onFinishScan fileUri: %s, result: %s", new Object[] { localb.pAp, localObject1 });
    Object localObject2 = (List)localb.ce.get(localb.pAp);
    if ((localObject2 != null) && (localObject1 != null))
    {
      ab.d("MicroMsg.FileScanQueueService", "onFinishScan, callback size: %d", new Object[] { Integer.valueOf(((List)localObject2).size()) });
      localObject2 = ((List)localObject2).iterator();
    }
    while (((Iterator)localObject2).hasNext())
    {
      ((b.a)((Iterator)localObject2).next()).a(localb.pAp, ((d)localObject1).result, ((d)localObject1).rawData, ((d)localObject1).cvn, ((d)localObject1).cvo);
      continue;
      if (localObject2 != null)
      {
        localObject1 = ((List)localObject2).iterator();
        while (((Iterator)localObject1).hasNext())
          ((b.a)((Iterator)localObject1).next()).Vv(localb.pAp);
      }
    }
    localb.ce.remove(localb.pAp);
    localb.pAo.remove(localb.pAp);
    localb.pAp = null;
    localb.pAq = null;
    localb.cdv();
    AppMethodBeat.o(80752);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.u.a.b.3
 * JD-Core Version:    0.6.2
 */