package com.tencent.mm.model.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.w;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.protocal.protobuf.adq;
import com.tencent.mm.protocal.protobuf.adr;
import com.tencent.mm.protocal.protobuf.za;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.d;
import com.tencent.mm.storage.z;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;

public final class b
{
  private static boolean apg = false;

  static void abc()
  {
    int i = 1;
    AppMethodBeat.i(118161);
    if (!g.RK())
    {
      ab.i("MicroMsg.ABTestUpdater", "Update aborted, Account not ready.");
      AppMethodBeat.o(118161);
    }
    while (true)
    {
      return;
      Object localObject = (Long)g.RP().Ry().get(ac.a.xKU, null);
      if (localObject == null);
      int j;
      for (long l1 = 0L; ; l1 = ((Long)localObject).longValue())
      {
        if (l1 != 0L)
          break label130;
        j = new Random().nextInt(86400);
        kM(j);
        abe();
        abg();
        ab.i("MicroMsg.ABTestUpdater", "First update ignored. Next update: %d", new Object[] { Integer.valueOf(j) });
        j = i;
        if (j != 0)
          break label265;
        ab.v("MicroMsg.ABTestUpdater", "No need to update");
        AppMethodBeat.o(118161);
        break;
      }
      label130: localObject = (Integer)g.RP().Ry().get(ac.a.xKV, null);
      label162: long l2;
      long l3;
      if ((localObject == null) || (((Integer)localObject).intValue() == 0))
      {
        j = 86400;
        l2 = j;
        l3 = System.currentTimeMillis() / 1000L;
        if (l3 <= l1 + l2)
          break label259;
      }
      label259: for (boolean bool = true; ; bool = false)
      {
        ab.i("MicroMsg.ABTestUpdater", "Need Update: %b, Last Update Time: %d, Update Interval: %d, Current Time: %d", new Object[] { Boolean.valueOf(bool), Long.valueOf(l1), Long.valueOf(l2), Long.valueOf(l3) });
        j = i;
        if (l3 > l1 + l2)
          break;
        j = 0;
        break;
        j = ((Integer)localObject).intValue();
        break label162;
      }
      label265: if (apg)
      {
        ab.i("MicroMsg.ABTestUpdater", "Updating");
        AppMethodBeat.o(118161);
      }
      else
      {
        update();
        AppMethodBeat.o(118161);
      }
    }
  }

  static void abd()
  {
    AppMethodBeat.i(118162);
    if (!g.RK())
    {
      ab.i("MicroMsg.ABTestUpdater", "UpdateWithoutIntervalLimit aborted, Account not ready.");
      AppMethodBeat.o(118162);
    }
    while (true)
    {
      return;
      if (apg)
      {
        ab.i("MicroMsg.ABTestUpdater", "UpdateWithoutIntervalLimit, Already Updating");
        AppMethodBeat.o(118162);
      }
      else
      {
        ab.i("MicroMsg.ABTestUpdater", "UpdateWithoutIntervalLimit, before do update");
        update();
        AppMethodBeat.o(118162);
      }
    }
  }

  private static void abe()
  {
    AppMethodBeat.i(118165);
    long l = System.currentTimeMillis() / 1000L;
    g.RP().Ry().set(ac.a.xKU, Long.valueOf(l));
    AppMethodBeat.o(118165);
  }

  private static int abf()
  {
    AppMethodBeat.i(118167);
    Integer localInteger = (Integer)g.RP().Ry().get(ac.a.xKT, null);
    int i;
    if (localInteger == null)
    {
      i = 0;
      AppMethodBeat.o(118167);
    }
    while (true)
    {
      return i;
      i = localInteger.intValue();
      AppMethodBeat.o(118167);
    }
  }

  private static void abg()
  {
    AppMethodBeat.i(118168);
    g.RP().Ry().dsb();
    AppMethodBeat.o(118168);
  }

  private static String c(LinkedList<za> paramLinkedList)
  {
    AppMethodBeat.i(118163);
    Iterator localIterator = paramLinkedList.iterator();
    za localza;
    for (paramLinkedList = ""; localIterator.hasNext(); paramLinkedList = paramLinkedList + localza.wcM + ":" + localza.priority + "|")
      localza = (za)localIterator.next();
    AppMethodBeat.o(118163);
    return paramLinkedList;
  }

  private static void kM(int paramInt)
  {
    AppMethodBeat.i(118166);
    int i = 0;
    if (paramInt == 0);
    for (i = 86400; ; i = new Random().nextInt(126000) + 3600)
      do
      {
        g.RP().Ry().set(ac.a.xKV, Integer.valueOf(i));
        AppMethodBeat.o(118166);
        return;
      }
      while ((paramInt >= 3600) && (paramInt <= 129600));
  }

  private static void update()
  {
    AppMethodBeat.i(118164);
    apg = true;
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new adq();
    ((b.a)localObject).fsK = new adr();
    ((b.a)localObject).uri = "/cgi-bin/mmux-bin/getabtest";
    ((b.a)localObject).fsI = 1801;
    localObject = ((b.a)localObject).acD();
    adq localadq = (adq)((com.tencent.mm.ai.b)localObject).fsG.fsP;
    localadq.wlM = abf();
    localadq.wlN = c.abi().drs();
    localadq.wlN.addAll(c.abj().drs());
    ab.i("MicroMsg.ABTestUpdater", "update abtest: %s", new Object[] { c(localadq.wlN) });
    w.a((com.tencent.mm.ai.b)localObject, new b.1(), true);
    AppMethodBeat.o(118164);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.model.c.b
 * JD-Core Version:    0.6.2
 */