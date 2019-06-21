package com.tencent.mm.modelmulti;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.a;
import com.tencent.mm.plugin.report.e;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.protocal.t.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Queue;
import java.util.Queue<Lcom.tencent.mm.modelmulti.o.c;>;

final class o$d
  implements o.c
{
  o$d(o paramo)
  {
  }

  public final boolean c(Queue<o.c> paramQueue)
  {
    AppMethodBeat.i(58402);
    paramQueue = new PInt();
    com.tencent.mm.kernel.g.RQ();
    com.tencent.mm.kernel.g.RN();
    Object localObject = com.tencent.mm.booter.g.a(paramQueue, a.QF());
    int i = paramQueue.value;
    final int j;
    boolean bool;
    if (localObject != null)
    {
      j = localObject.length;
      ab.i("MicroMsg.SyncService", "%s index:%d, buf.len:%d ", new Object[] { this, Integer.valueOf(i), Integer.valueOf(j) });
      if ((paramQueue.value != 0) && (!bo.cb((byte[])localObject)))
        break label103;
      bool = false;
      AppMethodBeat.o(58402);
    }
    while (true)
    {
      return bool;
      j = -1;
      break;
      label103: j = paramQueue.value;
      paramQueue = null;
      try
      {
        t.b localb = new com/tencent/mm/protocal/t$b;
        localb.<init>();
        localb.P((byte[])localObject);
        localObject = localb.vyH;
        paramQueue = (Queue<o.c>)localObject;
        if (paramQueue == null)
        {
          bool = false;
          AppMethodBeat.o(58402);
        }
      }
      catch (Exception localException)
      {
        while (true)
        {
          e.pXa.a(99L, 38L, 1L, false);
          ab.e("MicroMsg.SyncService", "%s index:%s Resp fromProtoBuf failed e[%s]", new Object[] { this, Integer.valueOf(j), localException.getMessage() });
          com.tencent.mm.kernel.g.RQ();
          com.tencent.mm.kernel.g.RN();
          com.tencent.mm.booter.g.bO(j, a.QF());
        }
      }
      catch (Error localError)
      {
        while (true)
        {
          e.pXa.a(99L, 39L, 1L, false);
          long l1 = Runtime.getRuntime().freeMemory() / 1000L;
          long l2 = Runtime.getRuntime().totalMemory() / 1000L;
          ab.i("MicroMsg.SyncService", "%s index:%s memoryInfo avail/total, dalvik[%dk, %dk, user:%dk] Error[%s]", new Object[] { this, Integer.valueOf(j), Long.valueOf(l1), Long.valueOf(l2), Long.valueOf(l2 - l1), localError.getMessage() });
          com.tencent.mm.kernel.g.RQ();
          com.tencent.mm.kernel.g.RN();
          com.tencent.mm.booter.g.bO(j, a.QF());
        }
        e.pXa.a(99L, 20L, 1L, false);
        new o.a(this.fJl, this, true, paramQueue, new o.b()
        {
          public final boolean lO(int paramAnonymousInt)
          {
            AppMethodBeat.i(58401);
            ab.i("MicroMsg.SyncService", "%s onFinishCmd index:%s ", new Object[] { o.d.this, Integer.valueOf(j) });
            paramAnonymousInt = j;
            com.tencent.mm.kernel.g.RQ();
            com.tencent.mm.kernel.g.RN();
            com.tencent.mm.booter.g.bO(paramAnonymousInt, a.QF());
            o.a(o.d.this.fJl, o.d.this);
            AppMethodBeat.o(58401);
            return true;
          }
        }
        , (byte)0);
        bool = true;
        AppMethodBeat.o(58402);
      }
    }
  }

  public final String toString()
  {
    AppMethodBeat.i(58403);
    String str = "LightPush[" + hashCode() + "]";
    AppMethodBeat.o(58403);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelmulti.o.d
 * JD-Core Version:    0.6.2
 */