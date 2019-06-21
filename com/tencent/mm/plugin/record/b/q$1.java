package com.tencent.mm.plugin.record.b;

import android.os.SystemClock;
import android.util.SparseArray;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.messenger.foundation.a.a.h;
import com.tencent.mm.plugin.record.a.a;
import com.tencent.mm.sdk.g.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.bi;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

final class q$1
  implements Runnable
{
  q$1(q paramq, com.tencent.mm.plugin.record.a.j paramj)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(135722);
    Object localObject1;
    if (this.pJS != null)
    {
      if ((q.e)this.pJT.pJA.get(this.pJS.field_localId) == null)
      {
        ab.d("MicroMsg.RecordMsgSendService", "summerrecord do add job, localid %d, msgid %d", new Object[] { Integer.valueOf(this.pJS.field_localId), Long.valueOf(this.pJS.field_msgId) });
        localObject1 = new q.e((byte)0);
        this.pJT.pJA.put(this.pJS.field_localId, localObject1);
      }
      this.pJT.b(this.pJS);
    }
    q localq = this.pJT;
    if (localq.pJx)
    {
      ab.i("MicroMsg.RecordMsgSendService", "summerrecord is working, return");
      AppMethodBeat.o(135722);
    }
    while (true)
    {
      return;
      Object localObject2;
      Object localObject3;
      if (localq.pJB.isEmpty())
      {
        ab.w("MicroMsg.RecordMsgSendService", "summerrecord jobs list size is 0");
        localObject1 = ((a)com.tencent.mm.kernel.g.M(a.class)).getRecordMsgStorage().ceB().iterator();
        while (((Iterator)localObject1).hasNext())
        {
          localObject2 = (com.tencent.mm.plugin.record.a.j)((Iterator)localObject1).next();
          if (((com.tencent.mm.plugin.messenger.foundation.a.j)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).bOr().jf(((com.tencent.mm.plugin.record.a.j)localObject2).field_msgId).getType() != 49)
          {
            ab.w("MicroMsg.RecordMsgSendService", "summerrecord record msg not exist, delete record info, localid[%d], msgid[%d]", new Object[] { Integer.valueOf(((com.tencent.mm.plugin.record.a.j)localObject2).field_localId), Long.valueOf(((com.tencent.mm.plugin.record.a.j)localObject2).field_msgId) });
            ((a)com.tencent.mm.kernel.g.M(a.class)).getRecordMsgStorage().BF(((com.tencent.mm.plugin.record.a.j)localObject2).field_localId);
          }
          else
          {
            localObject3 = (q.e)localq.pJA.get(((com.tencent.mm.plugin.record.a.j)localObject2).field_localId);
            if (localObject3 != null)
            {
              if ((((q.e)localObject3).ghB >= 0) || (SystemClock.elapsedRealtime() - ((q.e)localObject3).pJE >= 300000L))
                if (((q.e)localObject3).ghB < 0)
                  ((q.e)localObject3).ghB = 3;
            }
            else
              while (true)
              {
                ab.d("MicroMsg.RecordMsgSendService", "summerrecord do add job from db, localid %d, msgid %d", new Object[] { Integer.valueOf(((com.tencent.mm.plugin.record.a.j)localObject2).field_localId), Long.valueOf(((com.tencent.mm.plugin.record.a.j)localObject2).field_msgId) });
                localq.b((com.tencent.mm.plugin.record.a.j)localObject2);
                break;
                localObject3 = new q.e((byte)0);
                localq.pJA.put(((com.tencent.mm.plugin.record.a.j)localObject2).field_localId, localObject3);
              }
          }
        }
      }
      if (localq.pJB.isEmpty())
      {
        ab.w("MicroMsg.RecordMsgSendService", "try to do job, but job list size is empty, return");
        localq.finish();
        AppMethodBeat.o(135722);
      }
      else
      {
        localObject3 = (com.tencent.mm.plugin.record.a.j)localq.pJB.removeFirst();
        localObject2 = (q.e)localq.pJA.get(((com.tencent.mm.plugin.record.a.j)localObject3).field_localId);
        localObject1 = localObject2;
        if (localObject2 == null)
        {
          localObject1 = new q.e((byte)0);
          localq.pJA.put(((com.tencent.mm.plugin.record.a.j)localObject3).field_localId, localObject1);
        }
        ((q.e)localObject1).ghB -= 1;
        int i;
        if (((q.e)localObject1).ghB < 0)
          if (300000L > SystemClock.elapsedRealtime() - ((q.e)localObject1).pJE)
            i = 0;
        while (true)
          if (i != 0)
          {
            localq.pJx = true;
            switch (((com.tencent.mm.plugin.record.a.j)localObject3).field_type)
            {
            default:
              localq.pJx = false;
              AppMethodBeat.o(135722);
              break;
              ((q.e)localObject1).ghB = 2;
              ((q.e)localObject1).pJE = SystemClock.elapsedRealtime();
              i = 1;
              break;
            case 1:
              d.post(new q.c(localq, (com.tencent.mm.plugin.record.a.j)localObject3), "RecordMsgSendService_favDataCopy");
              AppMethodBeat.o(135722);
              break;
            case 2:
              d.post(new q.a(localq, (com.tencent.mm.plugin.record.a.j)localObject3), "RecordMsgSendService_chatDataCopy");
              AppMethodBeat.o(135722);
              break;
            case 0:
              d.post(new q.d(localq, (com.tencent.mm.plugin.record.a.j)localObject3), "RecordMsgSendService_normalDataCopy");
              AppMethodBeat.o(135722);
              break;
            case 3:
              d.post(new q.b(localq, (com.tencent.mm.plugin.record.a.j)localObject3), "RecordMsgSendService_chatDataDownLoad");
              AppMethodBeat.o(135722);
              break;
            }
          }
        localq.a(null);
        AppMethodBeat.o(135722);
      }
    }
  }

  public final String toString()
  {
    AppMethodBeat.i(135723);
    String str = super.toString() + "|run";
    AppMethodBeat.o(135723);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.record.b.q.1
 * JD-Core Version:    0.6.2
 */