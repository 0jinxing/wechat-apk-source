package com.tencent.mm.plugin.appbrand.collector;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

public final class h
  implements b
{
  private Map<String, CollectSession> eGu;
  private Map<String, Set<CollectSession>> heK;

  public h()
  {
    AppMethodBeat.i(57045);
    this.eGu = new a();
    this.heK = new a();
    AppMethodBeat.o(57045);
  }

  private boolean a(String paramString, CollectSession paramCollectSession)
  {
    AppMethodBeat.i(57046);
    boolean bool;
    if ((paramString == null) || (paramString.length() == 0) || (paramCollectSession == null))
    {
      bool = false;
      AppMethodBeat.o(57046);
    }
    while (true)
    {
      return bool;
      Set localSet = (Set)this.heK.get(paramString);
      Object localObject = localSet;
      if (localSet == null)
      {
        localObject = new LinkedHashSet();
        this.heK.put(paramString, localObject);
      }
      bool = ((Set)localObject).add(paramCollectSession);
      AppMethodBeat.o(57046);
    }
  }

  private Set<CollectSession> yP(String paramString)
  {
    AppMethodBeat.i(57047);
    if ((paramString == null) || (paramString.length() == 0))
    {
      paramString = null;
      AppMethodBeat.o(57047);
    }
    while (true)
    {
      return paramString;
      paramString = (Set)this.heK.get(paramString);
      AppMethodBeat.o(57047);
    }
  }

  private CollectSession yQ(String paramString)
  {
    AppMethodBeat.i(57049);
    CollectSession localCollectSession1 = (CollectSession)this.eGu.get(paramString);
    CollectSession localCollectSession2 = localCollectSession1;
    if (localCollectSession1 == null)
    {
      localCollectSession2 = new CollectSession(paramString);
      this.eGu.put(paramString, localCollectSession2);
    }
    AppMethodBeat.o(57049);
    return localCollectSession2;
  }

  public final void a(CollectSession paramCollectSession)
  {
    AppMethodBeat.i(57050);
    String str = paramCollectSession.id;
    Object localObject1 = (CollectSession)this.eGu.get(str);
    if (localObject1 == null)
    {
      this.eGu.put(str, paramCollectSession);
      a(paramCollectSession.groupId, paramCollectSession);
      AppMethodBeat.o(57050);
    }
    while (true)
    {
      return;
      Object localObject2 = paramCollectSession.heA;
      paramCollectSession = (CollectSession)localObject2;
      if (((CollectSession)localObject1).heA == null)
      {
        ((CollectSession)localObject1).heA = ((TimePoint)localObject2);
        AppMethodBeat.o(57050);
      }
      else
      {
        if (paramCollectSession != null)
        {
          localObject2 = paramCollectSession.name;
          long l = paramCollectSession.heM.get();
          if ((str == null) || (str.length() == 0));
          while (true)
          {
            paramCollectSession = (TimePoint)paramCollectSession.heN.get();
            break;
            CollectSession localCollectSession = yQ(str);
            if (localCollectSession.heA == null)
            {
              localCollectSession.yF((String)localObject2);
              localCollectSession.heA.heM.set(l);
            }
            else
            {
              localObject1 = (TimePoint)localCollectSession.heC.get(localObject2);
              if (localObject1 == null)
              {
                localCollectSession.yG((String)localObject2);
                localCollectSession.heB.heM.set(l);
              }
              else
              {
                ((TimePoint)localObject1).heM.set((l + ((TimePoint)localObject1).heM.get() * ((TimePoint)localObject1).heL.get()) / (((TimePoint)localObject1).heL.get() + 1));
                ((TimePoint)localObject1).heL.getAndIncrement();
              }
            }
          }
        }
        AppMethodBeat.o(57050);
      }
    }
  }

  public final CollectSession bD(String paramString1, String paramString2)
  {
    AppMethodBeat.i(57051);
    if ((paramString1 == null) || (paramString1.length() == 0))
    {
      ab.i("MicroMsg.SumCostTimeCollector", "join(%s) failed, sessionId is null or nil.", new Object[] { paramString2 });
      paramString1 = null;
      AppMethodBeat.o(57051);
      return paramString1;
    }
    paramString1 = yQ(paramString1);
    if (paramString1.heA == null)
      paramString1.yF(paramString2);
    while (true)
    {
      AppMethodBeat.o(57051);
      break;
      paramString1.yG(paramString2);
    }
  }

  public final void bE(String paramString1, String paramString2)
  {
    AppMethodBeat.i(57056);
    if ((paramString1 == null) || (paramString1.length() == 0) || (paramString2 == null) || (paramString2.length() == 0))
    {
      ab.i("MicroMsg.SumCostTimeCollector", "setLastPointName(%s, %s) failed, sessionId is null or nil.", new Object[] { paramString1, paramString2 });
      AppMethodBeat.o(57056);
    }
    while (true)
    {
      return;
      CollectSession localCollectSession = (CollectSession)this.eGu.get(paramString1);
      if (localCollectSession == null)
      {
        ab.i("MicroMsg.SumCostTimeCollector", "setLastPointName(%s, %s) failed,", new Object[] { paramString1, paramString2 });
        AppMethodBeat.o(57056);
      }
      else
      {
        localCollectSession.heD = paramString2;
        AppMethodBeat.o(57056);
      }
    }
  }

  public final int bF(String paramString1, String paramString2)
  {
    int i = 0;
    AppMethodBeat.i(57059);
    Set localSet = yP(paramString1);
    int j;
    if ((localSet == null) || (localSet.isEmpty()))
    {
      ab.i("MicroMsg.SumCostTimeCollector", "printAverage failed, set(%s) is empty.", new Object[] { paramString1 });
      AppMethodBeat.o(57059);
      j = i;
    }
    while (true)
    {
      return j;
      paramString1 = new LinkedHashSet(localSet).iterator();
      int k = 0;
      j = 0;
      while (paramString1.hasNext())
      {
        int m = ((CollectSession)paramString1.next()).cBY.getInt(paramString2);
        if (m != 0)
        {
          j += m;
          k++;
        }
      }
      if (k == 0)
      {
        AppMethodBeat.o(57059);
        j = i;
      }
      else
      {
        j /= k;
        AppMethodBeat.o(57059);
      }
    }
  }

  public final void clear()
  {
    AppMethodBeat.i(57048);
    this.eGu.clear();
    this.heK.clear();
    AppMethodBeat.o(57048);
  }

  public final void d(String paramString1, String paramString2, String paramString3, boolean paramBoolean)
  {
    AppMethodBeat.i(57053);
    if (!paramBoolean)
      AppMethodBeat.o(57053);
    while (true)
    {
      return;
      if ((paramString2 == null) || (paramString2.length() == 0))
      {
        ab.i("MicroMsg.SumCostTimeCollector", "tryToJoin(%s) failed, sessionId is null or nil.", new Object[] { paramString3 });
        AppMethodBeat.o(57053);
      }
      else if ((paramString1 == null) || (paramString1.length() == 0))
      {
        ab.i("MicroMsg.SumCostTimeCollector", "tryToJoin(%s) failed, groupId is null or nil.", new Object[] { paramString3 });
        AppMethodBeat.o(57053);
      }
      else
      {
        paramString2 = yQ(paramString2);
        if (paramString2.heA == null)
        {
          paramString2.groupId = paramString1;
          a(paramString1, paramString2);
          paramString2.yF(paramString3);
          AppMethodBeat.o(57053);
        }
        else
        {
          paramString2.yG(paramString3);
          AppMethodBeat.o(57053);
        }
      }
    }
  }

  public final void l(String paramString1, String paramString2, boolean paramBoolean)
  {
    AppMethodBeat.i(57052);
    if (!paramBoolean)
      AppMethodBeat.o(57052);
    while (true)
    {
      return;
      if ((paramString1 == null) || (paramString1.length() == 0))
      {
        ab.i("MicroMsg.SumCostTimeCollector", "tryToJoin(%s) failed, sessionId is null or nil.", new Object[] { paramString2 });
        AppMethodBeat.o(57052);
      }
      else
      {
        paramString1 = yQ(paramString1);
        if (paramString1.heA == null)
        {
          paramString1.yF(paramString2);
          AppMethodBeat.o(57052);
        }
        else
        {
          paramString1.yG(paramString2);
          AppMethodBeat.o(57052);
        }
      }
    }
  }

  public final void print(String paramString)
  {
    AppMethodBeat.i(57057);
    CollectSession localCollectSession = (CollectSession)this.eGu.get(paramString);
    if (localCollectSession == null)
    {
      ab.i("MicroMsg.SumCostTimeCollector", "print failed, session(%s) is null", new Object[] { paramString });
      AppMethodBeat.o(57057);
    }
    while (true)
    {
      return;
      TimePoint localTimePoint = localCollectSession.heA;
      if (localTimePoint == null)
      {
        ab.i("MicroMsg.SumCostTimeCollector", "print failed, the session(%s) do not have any point.", new Object[] { paramString });
        AppMethodBeat.o(57057);
      }
      else
      {
        paramString = e.a(localTimePoint);
        paramString.insert(0, String.format("session : %s\n", new Object[] { localCollectSession.id }));
        ab.i("MicroMsg.SumCostTimeCollector", "%s", new Object[] { paramString.toString() });
        AppMethodBeat.o(57057);
      }
    }
  }

  public final CollectSession yH(String paramString)
  {
    AppMethodBeat.i(57054);
    if ((paramString == null) || (paramString.length() == 0))
    {
      paramString = null;
      AppMethodBeat.o(57054);
    }
    while (true)
    {
      return paramString;
      paramString = (CollectSession)this.eGu.get(paramString);
      AppMethodBeat.o(57054);
    }
  }

  public final CollectSession yI(String paramString)
  {
    AppMethodBeat.i(57055);
    if ((paramString == null) || (paramString.length() == 0))
    {
      paramString = null;
      AppMethodBeat.o(57055);
    }
    while (true)
    {
      return paramString;
      paramString = (CollectSession)this.eGu.remove(paramString);
      AppMethodBeat.o(57055);
    }
  }

  public final StringBuilder yJ(String paramString)
  {
    AppMethodBeat.i(57058);
    Object localObject = yP(paramString);
    if ((localObject == null) || (((Set)localObject).isEmpty()))
    {
      ab.i("MicroMsg.SumCostTimeCollector", "printAverage failed, set(%s) is empty.", new Object[] { paramString });
      paramString = new StringBuilder().append(String.format("GroupId : %s, size : 0\n", new Object[] { paramString }));
      AppMethodBeat.o(57058);
    }
    while (true)
    {
      return paramString;
      LinkedHashSet localLinkedHashSet = new LinkedHashSet((Collection)localObject);
      TimePoint localTimePoint1 = new TimePoint();
      Iterator localIterator = localLinkedHashSet.iterator();
      while (localIterator.hasNext())
      {
        localObject = (CollectSession)localIterator.next();
        if ((((CollectSession)localObject).heB == null) || ((((CollectSession)localObject).heD != null) && (!((CollectSession)localObject).heB.name.equals(((CollectSession)localObject).heD))))
        {
          ab.e("MicroMsg.SumCostTimeCollector", "error(%s), incorrect point count", new Object[] { ((CollectSession)localObject).id });
        }
        else
        {
          TimePoint localTimePoint2 = ((CollectSession)localObject).heA;
          for (localObject = localTimePoint1; localTimePoint2 != null; localObject = (TimePoint)((TimePoint)localObject).heN.get())
          {
            ((TimePoint)localObject).heM.set((((TimePoint)localObject).heM.get() * ((TimePoint)localObject).heL.get() + localTimePoint2.heM.get()) / ((TimePoint)localObject).heL.incrementAndGet());
            ((TimePoint)localObject).name = localTimePoint2.name;
            localTimePoint2 = (TimePoint)localTimePoint2.heN.get();
            if ((((TimePoint)localObject).heN.get() == null) && (localTimePoint2 != null))
              ((TimePoint)localObject).heN.set(new TimePoint());
          }
        }
      }
      localObject = e.a(localTimePoint1);
      ((StringBuilder)localObject).insert(0, String.format("GroupId : %s, size : %d\n", new Object[] { paramString, Integer.valueOf(localLinkedHashSet.size()) }));
      AppMethodBeat.o(57058);
      paramString = (String)localObject;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.collector.h
 * JD-Core Version:    0.6.2
 */