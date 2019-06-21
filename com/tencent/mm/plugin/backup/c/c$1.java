package com.tencent.mm.plugin.backup.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.backup.b.b.b;
import com.tencent.mm.plugin.backup.b.e;
import com.tencent.mm.plugin.backup.b.f.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ai;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.z;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.LinkedBlockingQueue;
import junit.framework.Assert;

final class c$1
  implements Runnable
{
  c$1(c paramc, LinkedList paramLinkedList, long paramLong, boolean paramBoolean)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(17174);
    if (this.jrI == null)
    {
      ab.e("MicroMsg.BackupPackAndSend", "backupChatRunnable backupSessionList is null.");
      if (this.jrL.jrE != null)
      {
        this.jrL.jrE.aSr();
        this.jrL.jrF.aSu().jqW = -21;
        this.jrL.jrE.rj(-21);
      }
      AppMethodBeat.o(17174);
    }
    while (true)
    {
      return;
      com.tencent.mm.plugin.backup.g.b.aTW();
      Object localObject1 = this.jrI;
      Object localObject2 = new HashSet();
      if (localObject1 == null);
      for (int i = 0; ; i = ((HashSet)localObject2).size())
      {
        this.jrL.jrF.aSu().O(14, 1, i);
        this.jrL.jrE.rj(14);
        localObject1 = (String)com.tencent.mm.plugin.backup.h.d.aUr().aUs().Ry().get(2, null);
        this.jrL.jrH = bo.anU();
        localObject2 = new c.c(this.jrL);
        Iterator localIterator = this.jrI.iterator();
        do
        {
          if (!localIterator.hasNext())
            break;
          f.a locala = (f.a)localIterator.next();
          this.jrL.a(locala, (c.c)localObject2, (String)localObject1, this.jrJ, this.jrK);
        }
        while (!this.jrL.jrD);
        if (!this.jrL.jrD)
          break label300;
        ab.e("MicroMsg.BackupPackAndSend", "backupChatRunnable cancel!");
        AppMethodBeat.o(17174);
        break;
        localObject1 = ((LinkedList)localObject1).iterator();
        while (((Iterator)localObject1).hasNext())
          ((HashSet)localObject2).add(((f.a)((Iterator)localObject1).next()).jrd);
      }
      label300: long l1 = bo.anU();
      long l2 = bo.anU();
      ((c.c)localObject2).jsk.offer(((c.c)localObject2).jsl);
      ((c.c)localObject2).jsl.block();
      ab.i("MicroMsg.BackupPackAndSend.TagQueueSucker", "waitFinish Finish Now:%d", new Object[] { Long.valueOf(bo.gb(l2)) });
      Assert.assertTrue(((c.c)localObject2).jsk.isEmpty());
      ab.i("MicroMsg.BackupPackAndSend", "backupChatRunnable finish, Session[%d], loopTime[%d], waitSendTime[%d]", new Object[] { Integer.valueOf(this.jrI.size()), Long.valueOf(bo.gb(this.jrL.jrH)), Long.valueOf(bo.gb(l1)) });
      this.jrL.aSI();
      this.jrL.jrF.aSu().O(15, i, i);
      this.jrL.jrE.rj(15);
      this.jrL.fj(true);
      com.tencent.mm.plugin.backup.g.b.aTV();
      com.tencent.mm.plugin.backup.g.b.aTX();
      this.jrL.jrE.aSq();
      ab.i("MicroMsg.BackupPackAndSend", "backupChatRunnable backupfinish, backupDataSize[%d], backupCostTime[%d], backupStartTime[%d]", new Object[] { Long.valueOf(this.jrL.jrG), Long.valueOf(bo.gb(this.jrL.jrH)), Long.valueOf(this.jrL.jrH) });
      AppMethodBeat.o(17174);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.c.c.1
 * JD-Core Version:    0.6.2
 */