package com.tencent.mm.modelrecovery;

import com.tencent.mars.smc.IDKey;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.recovery.model.RecoveryStatusItem;
import com.tencent.recovery.report.RecoveryReporter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

public final class b
{
  public static HashMap<String, Integer> fMI;

  static
  {
    AppMethodBeat.i(16552);
    HashMap localHashMap = new HashMap();
    fMI = localHashMap;
    localHashMap.put(ah.getPackageName(), Integer.valueOf(0));
    fMI.put(ah.getPackageName() + ":push", Integer.valueOf(20));
    fMI.put(ah.getPackageName() + ":tools", Integer.valueOf(40));
    fMI.put(ah.getPackageName() + ":exdevice", Integer.valueOf(60));
    fMI.put(ah.getPackageName() + ":sandbox", Integer.valueOf(80));
    AppMethodBeat.o(16552);
  }

  public static void aiA()
  {
    AppMethodBeat.i(16549);
    Object localObject = RecoveryReporter.a(ah.getContext(), "ProcessStatus", RecoveryStatusItem.class);
    ab.i("MicroMsg.Recovery.WXRecoveryReporter", "reportStatus " + ((List)localObject).size());
    HashMap localHashMap1 = new HashMap();
    HashMap localHashMap2 = new HashMap();
    Iterator localIterator = ((List)localObject).iterator();
    if (localIterator.hasNext())
    {
      RecoveryStatusItem localRecoveryStatusItem = (RecoveryStatusItem)localIterator.next();
      label111: b.b localb;
      label137: label166: int i;
      if (localHashMap1.containsKey(localRecoveryStatusItem.processName))
      {
        localObject = (b.a)localHashMap1.get(localRecoveryStatusItem.processName);
        if (!localHashMap2.containsKey(localRecoveryStatusItem.processName))
          break label249;
        localb = (b.b)localHashMap2.get(localRecoveryStatusItem.processName);
        ((b.a)localObject).enb += 1;
        if (localRecoveryStatusItem.AqZ != 1)
          break label261;
        ((b.a)localObject).fML += 1;
        i = 0;
        switch (localRecoveryStatusItem.Arb)
        {
        default:
        case 1:
        case 16:
        }
      }
      while (true)
      {
        if (i == 0)
          ab.i("MicroMsg.Recovery.WXRecoveryReporter", "recovery statics not set exception");
        localHashMap1.put(localRecoveryStatusItem.processName, localObject);
        localHashMap2.put(localRecoveryStatusItem.processName, localb);
        break;
        localObject = new b.a();
        break label111;
        label249: localb = new b.b();
        break label137;
        label261: ((b.a)localObject).fMM += 1;
        break label166;
        if (localRecoveryStatusItem.AqZ == 1)
        {
          localb.fMO += 1;
          switch (localRecoveryStatusItem.Arc)
          {
          default:
            break;
          case 4096:
            localb.fMW += 1;
            i = 1;
            break;
          case 65536:
          case 1048576:
            localb.fMS += 1;
            i = 1;
            break;
          }
        }
        else
        {
          localb.fMP += 1;
          switch (localRecoveryStatusItem.Arc)
          {
          default:
            break;
          case 4096:
            localb.fMX += 1;
            i = 1;
            break;
          case 65536:
          case 1048576:
            localb.fMT += 1;
            i = 1;
            continue;
            if (localRecoveryStatusItem.AqZ == 1)
            {
              localb.fMQ += 1;
              switch (localRecoveryStatusItem.Arc)
              {
              default:
                break;
              case 4096:
                localb.fMY += 1;
                i = 1;
                break;
              case 65536:
              case 1048576:
                localb.fMU += 1;
                i = 1;
                break;
              }
            }
            else
            {
              localb.fMR += 1;
              switch (localRecoveryStatusItem.Arc)
              {
              default:
                break;
              case 4096:
                localb.fMZ += 1;
                i = 1;
                break;
              case 65536:
              case 1048576:
                localb.fMV += 1;
                i = 1;
              }
            }
            break;
          }
        }
      }
    }
    i(localHashMap1);
    j(localHashMap2);
    RecoveryReporter.bX(ah.getContext(), "ProcessStatus");
    AppMethodBeat.o(16549);
  }

  private static void i(HashMap<String, b.a> paramHashMap)
  {
    AppMethodBeat.i(16550);
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = paramHashMap.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Object localObject = (Map.Entry)localIterator.next();
      if (fMI.containsKey(((Map.Entry)localObject).getKey()))
      {
        int i = ((Integer)fMI.get(((Map.Entry)localObject).getKey())).intValue();
        localObject = (b.a)((Map.Entry)localObject).getValue();
        IDKey localIDKey;
        if (((b.a)localObject).enb > 0)
        {
          localIDKey = new IDKey();
          localIDKey.SetID(424);
          localIDKey.SetKey(i + 0);
          localIDKey.SetValue(((b.a)localObject).enb);
          localArrayList.add(localIDKey);
        }
        if (((b.a)localObject).fMJ > 0)
        {
          localIDKey = new IDKey();
          localIDKey.SetID(424);
          localIDKey.SetKey(i + 1);
          localIDKey.SetValue(((b.a)localObject).fMJ);
          localArrayList.add(localIDKey);
        }
        if (((b.a)localObject).fMK > 0)
        {
          localIDKey = new IDKey();
          localIDKey.SetID(424);
          localIDKey.SetKey(i + 2);
          localIDKey.SetValue(((b.a)localObject).fMK);
          localArrayList.add(localIDKey);
        }
        if (((b.a)localObject).fML > 0)
        {
          localIDKey = new IDKey();
          localIDKey.SetID(424);
          localIDKey.SetKey(i + 3);
          localIDKey.SetValue(((b.a)localObject).fML);
          localArrayList.add(localIDKey);
        }
        if (((b.a)localObject).fMM > 0)
        {
          localIDKey = new IDKey();
          localIDKey.SetID(424);
          localIDKey.SetKey(i + 4);
          localIDKey.SetValue(((b.a)localObject).fMM);
          localArrayList.add(localIDKey);
        }
        if (((b.a)localObject).fMN > 0)
        {
          localIDKey = new IDKey();
          localIDKey.SetID(424);
          localIDKey.SetKey(i + 5);
          localIDKey.SetValue(((b.a)localObject).fMN);
          localArrayList.add(localIDKey);
        }
      }
    }
    if (localArrayList.size() > 0)
      h.pYm.b(localArrayList, true);
    ab.i("MicroMsg.Recovery.WXRecoveryReporter", "report recovery generalObj %s %s", new Object[] { ah.getProcessName(), paramHashMap.toString() });
    AppMethodBeat.o(16550);
  }

  private static void j(HashMap<String, b.b> paramHashMap)
  {
    AppMethodBeat.i(16551);
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = paramHashMap.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Object localObject = (Map.Entry)localIterator.next();
      if (fMI.containsKey(((Map.Entry)localObject).getKey()))
      {
        int i = ((Integer)fMI.get(((Map.Entry)localObject).getKey())).intValue();
        localObject = (b.b)((Map.Entry)localObject).getValue();
        IDKey localIDKey;
        if (((b.b)localObject).fMO > 0)
        {
          localIDKey = new IDKey();
          localIDKey.SetID(442);
          localIDKey.SetKey(i + 0);
          localIDKey.SetValue(((b.b)localObject).fMO);
          localArrayList.add(localIDKey);
        }
        if (((b.b)localObject).fMP > 0)
        {
          localIDKey = new IDKey();
          localIDKey.SetID(442);
          localIDKey.SetKey(i + 1);
          localIDKey.SetValue(((b.b)localObject).fMP);
          localArrayList.add(localIDKey);
        }
        if (((b.b)localObject).fMQ > 0)
        {
          localIDKey = new IDKey();
          localIDKey.SetID(442);
          localIDKey.SetKey(i + 2);
          localIDKey.SetValue(((b.b)localObject).fMQ);
          localArrayList.add(localIDKey);
        }
        if (((b.b)localObject).fMR > 0)
        {
          localIDKey = new IDKey();
          localIDKey.SetID(442);
          localIDKey.SetKey(i + 3);
          localIDKey.SetValue(((b.b)localObject).fMR);
          localArrayList.add(localIDKey);
        }
        if (((b.b)localObject).fMS > 0)
        {
          localIDKey = new IDKey();
          localIDKey.SetID(442);
          localIDKey.SetKey(i + 4);
          localIDKey.SetValue(((b.b)localObject).fMS);
          localArrayList.add(localIDKey);
        }
        if (((b.b)localObject).fMT > 0)
        {
          localIDKey = new IDKey();
          localIDKey.SetID(442);
          localIDKey.SetKey(i + 5);
          localIDKey.SetValue(((b.b)localObject).fMT);
          localArrayList.add(localIDKey);
        }
        if (((b.b)localObject).fMU > 0)
        {
          localIDKey = new IDKey();
          localIDKey.SetID(442);
          localIDKey.SetKey(i + 6);
          localIDKey.SetValue(((b.b)localObject).fMU);
          localArrayList.add(localIDKey);
        }
        if (((b.b)localObject).fMV > 0)
        {
          localIDKey = new IDKey();
          localIDKey.SetID(442);
          localIDKey.SetKey(i + 7);
          localIDKey.SetValue(((b.b)localObject).fMV);
          localArrayList.add(localIDKey);
        }
        if (((b.b)localObject).fMW > 0)
        {
          localIDKey = new IDKey();
          localIDKey.SetID(442);
          localIDKey.SetKey(i + 8);
          localIDKey.SetValue(((b.b)localObject).fMW);
          localArrayList.add(localIDKey);
        }
        if (((b.b)localObject).fMX > 0)
        {
          localIDKey = new IDKey();
          localIDKey.SetID(442);
          localIDKey.SetKey(i + 9);
          localIDKey.SetValue(((b.b)localObject).fMX);
          localArrayList.add(localIDKey);
        }
        if (((b.b)localObject).fMY > 0)
        {
          localIDKey = new IDKey();
          localIDKey.SetID(442);
          localIDKey.SetKey(i + 10);
          localIDKey.SetValue(((b.b)localObject).fMY);
          localArrayList.add(localIDKey);
        }
        if (((b.b)localObject).fMZ > 0)
        {
          localIDKey = new IDKey();
          localIDKey.SetID(442);
          localIDKey.SetKey(i + 11);
          localIDKey.SetValue(((b.b)localObject).fMZ);
          localArrayList.add(localIDKey);
        }
      }
    }
    if (localArrayList.size() > 0)
      h.pYm.b(localArrayList, true);
    ab.i("MicroMsg.Recovery.WXRecoveryReporter", "report recovery statusObj %s %s", new Object[] { ah.getProcessName(), paramHashMap.toString() });
    AppMethodBeat.o(16551);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelrecovery.b
 * JD-Core Version:    0.6.2
 */