package com.tencent.mm.pluginsdk.g.a.c;

import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

final class p$1
  implements Runnable
{
  public final void run()
  {
    Object localObject1 = null;
    Object localObject2 = null;
    AppMethodBeat.i(79610);
    Object localObject3 = q.a.diy();
    int i = p.getNetworkType();
    ab.i("MicroMsg.ResDownloaderCore", "resumeAllAndEvictExpired, networkType = %d", new Object[] { Integer.valueOf(i) });
    if (i == 0)
    {
      ab.i("MicroMsg.ResDownloaderCore", "resumeAllAndEvictExpired, networkType is unavailable");
      AppMethodBeat.o(79610);
    }
    while (true)
    {
      return;
      if (!((q)localObject3).hrm)
      {
        ab.e("MicroMsg.ResDownloaderCore", "resumeAllAndEvictExpired, core can not work");
        AppMethodBeat.o(79610);
      }
      else
      {
        long l;
        if (((q)localObject3).hrm)
        {
          l = bo.anU();
          localObject3 = ((q)localObject3).vfx.baR();
          if (localObject3 != null)
            break label147;
          localObject1 = localObject2;
        }
        while (true)
        {
          ab.i("MicroMsg.ResDownloaderCore", "queryAll: cost = %d", new Object[] { Long.valueOf(bo.gb(l)) });
          if (!bo.ek((List)localObject1))
            break label221;
          ab.i("MicroMsg.ResDownloaderCore", "resumeAllAndEvictExpired, no record stored, skip this resumeAll-op");
          AppMethodBeat.o(79610);
          break;
          label147: if (((Cursor)localObject3).getCount() <= 0)
          {
            ((Cursor)localObject3).close();
            localObject1 = localObject2;
          }
          else
          {
            localObject1 = new LinkedList();
            ((Cursor)localObject3).moveToFirst();
            do
            {
              localObject2 = new s();
              ((s)localObject2).d((Cursor)localObject3);
              ((List)localObject1).add(localObject2);
            }
            while (((Cursor)localObject3).moveToNext());
            ((Cursor)localObject3).close();
          }
        }
        label221: localObject3 = ((List)localObject1).iterator();
        while (((Iterator)localObject3).hasNext())
        {
          localObject1 = (s)((Iterator)localObject3).next();
          if (!bo.isNullOrNil(((s)localObject1).field_groupId1))
          {
            int j = ((s)localObject1).field_groupId1.hashCode();
            localObject2 = r.diz().iterator();
            while (((Iterator)localObject2).hasNext())
            {
              g localg = (g)((Iterator)localObject2).next();
              if (j == bo.nullAsNil(localg.awa()).hashCode())
                localg.cYu().a((s)localObject1, i);
            }
          }
        }
        AppMethodBeat.o(79610);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.g.a.c.p.1
 * JD-Core Version:    0.6.2
 */