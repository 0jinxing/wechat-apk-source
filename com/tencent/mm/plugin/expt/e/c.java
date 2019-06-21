package com.tencent.mm.plugin.expt.e;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.expt.a.a.a;
import com.tencent.mm.plugin.expt.a.a.b;
import com.tencent.mm.plugin.expt.d.a;
import com.tencent.mm.plugin.expt.d.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.as;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class c
{
  private static String TAG;
  private static c lOQ;
  private static HashSet<String> lOR;

  static
  {
    AppMethodBeat.i(73622);
    TAG = "MicroMsg.ExptMMKV";
    long l = bo.yz();
    lOR = new HashSet();
    for (a.b localb : a.b.values())
      lOR.add(localb.name());
    ab.i(TAG, "get mulit expt enum cost time [%d]", new Object[] { Long.valueOf(bo.az(l)) });
    AppMethodBeat.o(73622);
  }

  public static String a(a.a parama, String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(73617);
    parama = b.brr().b(parama.name(), paramString, paramBoolean, true);
    AppMethodBeat.o(73617);
    return parama;
  }

  private String aZm()
  {
    AppMethodBeat.i(73621);
    String str = hashCode();
    AppMethodBeat.o(73621);
    return str;
  }

  public static as brs()
  {
    AppMethodBeat.i(73616);
    as localas = b.brr().brs();
    AppMethodBeat.o(73616);
    return localas;
  }

  public static c bru()
  {
    AppMethodBeat.i(73615);
    if (lOQ == null)
      lOQ = new c();
    c localc = lOQ;
    AppMethodBeat.o(73615);
    return localc;
  }

  public final void bF(List<a> paramList)
  {
    AppMethodBeat.i(73618);
    if (!brv())
      AppMethodBeat.o(73618);
    long l;
    as localas;
    while (true)
    {
      return;
      if ((paramList == null) || (paramList.isEmpty()))
      {
        AppMethodBeat.o(73618);
      }
      else
      {
        l = bo.yz();
        localas = b.brr().brs();
        if (localas != null)
          break;
        AppMethodBeat.o(73618);
      }
    }
    Iterator localIterator = paramList.iterator();
    int i = 0;
    int j = 0;
    label78: 
    while (localIterator.hasNext())
    {
      a locala = (a)localIterator.next();
      if (locala != null)
      {
        Object localObject = locala.brq();
        if (localObject == null)
          break label296;
        localObject = ((HashMap)localObject).keySet().iterator();
        int k = 0;
        while (((Iterator)localObject).hasNext())
        {
          localas.putInt((String)((Iterator)localObject).next(), locala.field_exptId);
          k = 1;
          j++;
        }
        if (k == 0)
          break label293;
        localas.putString(locala.field_exptId, locala.field_exptContent);
        i++;
      }
    }
    label293: label296: 
    while (true)
    {
      break label78;
      boolean bool = localas.commit();
      ab.i(TAG, "%s replace expt param[%d] [%d %d] cost[%d] flag[%b]", new Object[] { aZm(), Integer.valueOf(paramList.size()), Integer.valueOf(j), Integer.valueOf(i), Long.valueOf(bo.az(l)), Boolean.valueOf(bool) });
      AppMethodBeat.o(73618);
      break;
    }
  }

  public final void bG(List<Integer> paramList)
  {
    AppMethodBeat.i(73619);
    if (!brv())
      AppMethodBeat.o(73619);
    long l;
    as localas;
    while (true)
    {
      return;
      if ((paramList == null) || (paramList.isEmpty()))
      {
        AppMethodBeat.o(73619);
      }
      else
      {
        l = bo.yz();
        localas = b.brr().brs();
        if (localas != null)
          break;
        AppMethodBeat.o(73619);
      }
    }
    HashSet localHashSet = new HashSet();
    Iterator localIterator = paramList.iterator();
    int i = 0;
    label84: int j;
    if (localIterator.hasNext())
    {
      j = ((Integer)localIterator.next()).intValue();
      if (!localas.contains(String.valueOf(j)))
        break label309;
      localas.remove(String.valueOf(j));
      localHashSet.add(Integer.valueOf(j));
      i++;
    }
    label161: label306: label309: 
    while (true)
    {
      break label84;
      localIterator = lOR.iterator();
      j = 0;
      if (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        int k = localas.getInt(str, 0);
        if ((k <= 0) || (!localHashSet.contains(Integer.valueOf(k))))
          break label306;
        localas.remove(str);
        j++;
      }
      while (true)
      {
        break label161;
        boolean bool = localas.commit();
        ab.i(TAG, "%s delete expt params[%d] delete [%d %d] cost[%d] flag [%b]", new Object[] { aZm(), Integer.valueOf(paramList.size()), Integer.valueOf(i), Integer.valueOf(j), Long.valueOf(bo.az(l)), Boolean.valueOf(bool) });
        AppMethodBeat.o(73619);
        break;
      }
    }
  }

  public final boolean brv()
  {
    boolean bool = true;
    AppMethodBeat.i(73620);
    if (ah.bqo())
      AppMethodBeat.o(73620);
    while (true)
    {
      return bool;
      ab.c(TAG, "%s only mm process can write expt info", new Object[] { aZm() });
      AppMethodBeat.o(73620);
      bool = false;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.expt.e.c
 * JD-Core Version:    0.6.2
 */