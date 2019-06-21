package com.tencent.mm.az;

import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.cd.h;
import com.tencent.mm.kernel.g;
import com.tencent.mm.openim.b.l;
import com.tencent.mm.plugin.messenger.foundation.a.a.j.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ap.a;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

final class n$1
  implements ap.a
{
  n$1(n paramn)
  {
  }

  public final boolean BI()
  {
    AppMethodBeat.i(991);
    ab.d("MicroMsg.OplogService", "summeroplog pusherTry onTimerExpired tryStartNetscene");
    n localn = this.fLK;
    long l = bo.anU();
    if ((localn.frc) && (l - localn.frn > 10000L))
      localn.frc = false;
    if (localn.frc)
      ab.d("MicroMsg.OplogService", "summeroplog tryStartNetscene netSceneRunning, return.");
    while (true)
    {
      AppMethodBeat.o(991);
      return false;
      Object localObject1 = localn.fLJ;
      ArrayList localArrayList = new ArrayList();
      localObject1 = ((i)localObject1).fni.a("select oplog2.id,oplog2.inserTime,oplog2.cmdId,oplog2.buffer,oplog2.reserved1,oplog2.reserved2,oplog2.reserved3,oplog2.reserved4 from oplog2  order by inserTime asc limit ?", new String[] { "200" }, 0);
      if (localObject1 == null);
      Object localObject2;
      while (true)
      {
        if (localArrayList.size() != 0)
          break label307;
        ab.d("MicroMsg.OplogService", "summeroplog tryStartNetscene list null ret");
        break;
        int i = ((Cursor)localObject1).getCount();
        if (i > 0)
          for (int j = 0; j < i; j++)
          {
            ((Cursor)localObject1).moveToPosition(j);
            localObject2 = new j.b(0);
            ((j.b)localObject2).id = ((Cursor)localObject1).getInt(0);
            ((j.b)localObject2).fCv = ((Cursor)localObject1).getLong(1);
            ((j.b)localObject2).cmdId = ((Cursor)localObject1).getInt(2);
            ((j.b)localObject2).buffer = ((Cursor)localObject1).getBlob(3);
            ((j.b)localObject2).oqP = ((Cursor)localObject1).getInt(4);
            ((j.b)localObject2).oqQ = ((Cursor)localObject1).getLong(5);
            ((j.b)localObject2).oqR = ((Cursor)localObject1).getString(6);
            ((j.b)localObject2).oqS = ((Cursor)localObject1).getString(7);
            localArrayList.add(localObject2);
          }
        ((Cursor)localObject1).close();
      }
      label307: if ((!localn.frc) && (localArrayList.size() > 0))
      {
        localn.frn = l;
        localn.frc = true;
        localObject1 = new LinkedList();
        Iterator localIterator = localArrayList.iterator();
        while (localIterator.hasNext())
        {
          localObject2 = (j.b)localIterator.next();
          if ((((j.b)localObject2).getCmdId() == 0) && (((j.b)localObject2).oqP > 0))
            ((List)localObject1).add(localObject2);
        }
        localArrayList.removeAll((Collection)localObject1);
        localObject2 = ((List)localObject1).iterator();
        while (((Iterator)localObject2).hasNext())
        {
          localObject1 = (j.b)((Iterator)localObject2).next();
          if ("@openim".equals(((j.b)localObject1).oqR))
          {
            g.RQ();
            g.RO().eJo.a(new l((j.b)localObject1), 0);
          }
          else
          {
            localn.fLJ.b((j.b)localObject1);
          }
        }
        if (!localArrayList.isEmpty())
        {
          g.RQ();
          g.RO().eJo.a(new b(localArrayList), 0);
        }
      }
      ab.d("MicroMsg.OplogService", "summeroplog tryStartNetscene ret ok lastNetscene: %d,  netSceneRunning:%B, take:%d ms. size %s", new Object[] { Long.valueOf(localn.frn), Boolean.valueOf(localn.frc), Long.valueOf(System.currentTimeMillis() - l), Integer.valueOf(localArrayList.size()) });
    }
  }

  public final String toString()
  {
    AppMethodBeat.i(992);
    String str = super.toString() + "|pusherTry";
    AppMethodBeat.o(992);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.az.n.1
 * JD-Core Version:    0.6.2
 */