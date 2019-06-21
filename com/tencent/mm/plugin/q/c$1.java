package com.tencent.mm.plugin.q;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.at;
import com.tencent.mm.plugin.backup.i.k;
import com.tencent.mm.plugin.backup.i.l;
import com.tencent.mm.plugin.messenger.foundation.a.a.h;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.pointers.PLong;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.be;
import com.tencent.mm.storage.z;
import com.tencent.mm.vfs.e;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

final class c$1
  implements Runnable
{
  c$1(c paramc, LinkedList paramLinkedList, d paramd, long paramLong1, long paramLong2, int paramInt)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(22893);
    long l1 = bo.anU();
    int i;
    if ((this.oFq == null) || (this.oFq.size() <= 0))
      if (this.oFq == null)
      {
        i = -1;
        ab.e("MicroMsg.MsgSynchronizePack", "startSynchronizePack MsgSynchronizeSessionList is null or zero, msgSynchronizeSessionList size:%d.", new Object[] { Integer.valueOf(i) });
        if (this.oFt.oFp != null)
          this.oFt.oFp.onCancel();
        AppMethodBeat.o(22893);
      }
    while (true)
    {
      return;
      i = this.oFq.size();
      break;
      e.N(g.bQY(), true);
      e.N(g.bQZ(), true);
      Object localObject1 = new StringBuilder();
      com.tencent.mm.model.aw.ZK();
      e.N(com.tencent.mm.model.c.getAccPath() + "msgsynchronize/", true);
      localObject1 = new StringBuilder();
      com.tencent.mm.model.aw.ZK();
      e.N(com.tencent.mm.model.c.getAccPath() + "msgsynchronize.zip", true);
      Object localObject2 = new LinkedList();
      String str = (String)com.tencent.mm.plugin.backup.h.d.aUr().aUs().Ry().get(2, null);
      PInt localPInt1 = new PInt();
      PInt localPInt2 = new PInt();
      localObject1 = new PLong();
      Object localObject3 = this.oFq.iterator();
      while (true)
      {
        c.a locala;
        if (((Iterator)localObject3).hasNext())
        {
          locala = (c.a)((Iterator)localObject3).next();
          if (!this.oFt.oFo)
            break label307;
          ab.e("MicroMsg.MsgSynchronizePack", "startSynchronizePack has been canceled!");
        }
        label281: label307: 
        do
        {
          if (!this.oFt.oFo)
            break label563;
          ab.e("MicroMsg.MsgSynchronizePack", "MsgSynchronizePack canceled!");
          AppMethodBeat.o(22893);
          break;
          localObject4 = com.tencent.mm.plugin.backup.h.d.aUr().aUs().XR().aoZ(locala.jrd);
          if (localObject4 != null);
          for (i = ((at)localObject4).field_unReadCount; ; i = 0)
          {
            if (!this.oFr.action.equals(b.oFd))
              break label431;
            this.oFt.a(this.oFr, locala, this.fEG, this.fWv, str, i, localPInt1, (PLong)localObject1, this.oFs);
            if (((PLong)localObject1).value < b.oFn)
              break;
            ab.e("MicroMsg.MsgSynchronizePack", "startSynchronizePack getMore has reach the max pack number, msgCount:%d", new Object[] { Long.valueOf(((PLong)localObject1).value) });
            break label281;
          }
        }
        while (localPInt2.value >= b.oFj);
        label431: Object localObject4 = new k();
        ((k)localObject4).jBB = locala.jrd;
        ((k)localObject4).jBz = ((int)(com.tencent.mm.plugin.backup.h.d.aUr().aUs().XO().Rt(locala.jrd) / 1000L));
        ((k)localObject4).jBA = i;
        ((LinkedList)localObject2).add(localObject4);
        localPInt2.value += 1;
        if (localPInt1.value < b.oFh)
          this.oFt.a(this.oFr, locala, this.fEG, this.fWv, str, i, localPInt1, (PLong)localObject1, this.oFs);
      }
      label563: if (!this.oFr.action.equals(b.oFd))
      {
        localObject3 = new l();
        ((l)localObject3).jBC = ((LinkedList)localObject2);
        ((l)localObject3).jBD = com.tencent.mm.bi.d.akP().dtd();
      }
      try
      {
        localObject2 = ((l)localObject3).toByteArray();
        g.f(g.bQX(), "sessionlist", (byte[])localObject2);
        ab.i("MicroMsg.MsgSynchronizePack", "BackupSessionInfoList pack finish.");
        localObject3 = g.bQY();
        localObject2 = g.bQZ();
        if ((localObject3 == null) || (((String)localObject3).isEmpty()))
        {
          long l2 = e.asZ(g.bQZ());
          ab.i("MicroMsg.MsgSynchronizePack", "startSynchronizePack finish, sessionCount:%d, msgCount:%d, fileLen:%d KB, backupCostTime[%d]", new Object[] { Integer.valueOf(localPInt1.value), Long.valueOf(((PLong)localObject1).value), Long.valueOf(l2 / 1024L), Long.valueOf(bo.gb(l1)) });
          localObject2 = this.oFr;
          long l3 = localPInt1.value;
          l1 = ((PLong)localObject1).value;
          l2 /= 1024L;
          ((d)localObject2).oFv = l3;
          ((d)localObject2).oFw = l1;
          ((d)localObject2).oFx = l2;
          ((d)localObject2).ecX = new String(str);
          if (this.oFt.oFp != null)
            this.oFt.oFp.a(this.oFr, g.bQZ(), this.oFq.size());
          AppMethodBeat.o(22893);
        }
      }
      catch (Exception localException)
      {
        while (true)
        {
          ab.e("MicroMsg.MsgSynchronizePack", "ERROR: BackupSessionInfoList to Buffer, list:%d :%s", new Object[] { Integer.valueOf(((l)localObject3).jBC.size()), localException.getMessage() });
          continue;
          e.m(Collections.singletonList(localObject3), localException);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.q.c.1
 * JD-Core Version:    0.6.2
 */