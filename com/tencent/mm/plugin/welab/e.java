package com.tencent.mm.plugin.welab;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.w;
import com.tencent.mm.kernel.g;
import com.tencent.mm.protocal.protobuf.adq;
import com.tencent.mm.protocal.protobuf.adr;
import com.tencent.mm.protocal.protobuf.za;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public final class e
{
  private static boolean DEBUG = false;
  private static boolean apg = false;

  static void aa(boolean paramBoolean1, boolean paramBoolean2)
  {
    AppMethodBeat.i(80544);
    ab.i("MicroMsg.WelabUpdater", "tryToUpdate isUpgrade %s, isManualAuth %s ", new Object[] { Boolean.valueOf(paramBoolean1), Boolean.valueOf(paramBoolean2) });
    if (!g.RN().QY())
    {
      ab.i("MicroMsg.WelabUpdater", "Update aborted, Account not ready.");
      AppMethodBeat.o(80544);
    }
    while (true)
    {
      return;
      if ((!DEBUG) && (!paramBoolean1) && (!paramBoolean2))
      {
        localObject = (Long)g.RP().Ry().get(ac.a.xRL, null);
        long l1;
        if (localObject == null)
        {
          l1 = 0L;
          label89: if (l1 != 0L)
            break label170;
          i = new Random().nextInt(86400);
          kM(i);
          abe();
          abg();
          ab.i("MicroMsg.WelabUpdater", "First update ignored. Next update: %d", new Object[] { Integer.valueOf(i) });
          i = 1;
        }
        while (true)
        {
          if (i != 0)
            break label309;
          ab.v("MicroMsg.WelabUpdater", "No need to update");
          AppMethodBeat.o(80544);
          break;
          l1 = ((Long)localObject).longValue();
          break label89;
          label170: localObject = (Integer)g.RP().Ry().get(ac.a.xRM, null);
          label202: long l2;
          long l3;
          if ((localObject == null) || (((Integer)localObject).intValue() == 0))
          {
            i = 86400;
            l2 = i;
            l3 = System.currentTimeMillis() / 1000L;
            if (l3 <= l1 + l2)
              break label297;
          }
          label297: for (boolean bool = true; ; bool = false)
          {
            ab.i("MicroMsg.WelabUpdater", "Need Update: %b, Last Update Time: %d, Update Interval: %d, Current Time: %d", new Object[] { Boolean.valueOf(bool), Long.valueOf(l1), Long.valueOf(l2), Long.valueOf(l3) });
            if (l3 <= l1 + l2)
              break label303;
            i = 1;
            break;
            i = ((Integer)localObject).intValue();
            break label202;
          }
          label303: i = 0;
        }
      }
      label309: if (!apg)
        break;
      ab.i("MicroMsg.WelabUpdater", "Updating");
      AppMethodBeat.o(80544);
    }
    apg = true;
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new adq();
    ((b.a)localObject).fsK = new adr();
    ((b.a)localObject).uri = "/cgi-bin/mmux-bin/getlabsinfo";
    ((b.a)localObject).fsI = 1816;
    localObject = ((b.a)localObject).acD();
    adq localadq = (adq)((b)localObject).fsG.fsP;
    Integer localInteger = (Integer)g.RP().Ry().get(ac.a.xRN, null);
    if (localInteger == null);
    for (int i = 0; ; i = localInteger.intValue())
    {
      localadq.wlM = i;
      localadq.wlN = ddl();
      localadq.wlO = ((int)bo.anT());
      if (paramBoolean1)
        localadq.bJt |= 1;
      if (paramBoolean2)
        localadq.bJt |= 2;
      ab.i("MicroMsg.WelabUpdater", "update abtest: %s", new Object[] { c(localadq.wlN) });
      w.a((b)localObject, new e.1());
      AppMethodBeat.o(80544);
      break;
    }
  }

  private static void abe()
  {
    AppMethodBeat.i(80547);
    long l = System.currentTimeMillis() / 1000L;
    g.RP().Ry().set(ac.a.xRL, Long.valueOf(l));
    AppMethodBeat.o(80547);
  }

  private static void abg()
  {
    AppMethodBeat.i(80549);
    g.RP().Ry().dsb();
    AppMethodBeat.o(80549);
  }

  private static String c(LinkedList<za> paramLinkedList)
  {
    AppMethodBeat.i(80545);
    Iterator localIterator = paramLinkedList.iterator();
    za localza;
    for (paramLinkedList = ""; localIterator.hasNext(); paramLinkedList = paramLinkedList + localza.wcM + ":" + localza.priority + "|")
      localza = (za)localIterator.next();
    AppMethodBeat.o(80545);
    return paramLinkedList;
  }

  private static LinkedList<za> ddl()
  {
    AppMethodBeat.i(80546);
    LinkedList localLinkedList = new LinkedList();
    try
    {
      Iterator localIterator = a.ddj().uLQ.dds().iterator();
      while (localIterator.hasNext())
      {
        com.tencent.mm.plugin.welab.d.a.a locala = (com.tencent.mm.plugin.welab.d.a.a)localIterator.next();
        if (!locala.ddw())
        {
          za localza = new com/tencent/mm/protocal/protobuf/za;
          localza.<init>();
          localza.wcM = bo.getInt(locala.field_expId, 0);
          localza.priority = locala.field_prioritylevel;
          localLinkedList.add(localza);
        }
      }
    }
    catch (Exception localException)
    {
      ab.printErrStackTrace("MicroMsg.WelabUpdater", localException, "", new Object[0]);
      AppMethodBeat.o(80546);
    }
    return localLinkedList;
  }

  private static void kM(int paramInt)
  {
    AppMethodBeat.i(80548);
    int i = 0;
    if (paramInt == 0);
    for (i = 86400; ; i = new Random().nextInt(126000) + 3600)
      do
      {
        g.RP().Ry().set(ac.a.xRM, Integer.valueOf(i));
        AppMethodBeat.o(80548);
        return;
      }
      while ((paramInt >= 3600) && (paramInt <= 129600));
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.welab.e
 * JD-Core Version:    0.6.2
 */