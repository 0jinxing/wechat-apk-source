package a.i.b.a.c.l;

import a.i.b.a.c.b.am;
import a.i.b.a.c.b.c.ah;
import a.i.b.a.c.b.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class k
{
  public static au a(List<a.i.b.a.c.b.ar> paramList1, as paramas, l paraml, List<a.i.b.a.c.b.ar> paramList2)
  {
    AppMethodBeat.i(122517);
    paramList1 = a(paramList1, paramas, paraml, paramList2, null);
    if (paramList1 == null)
    {
      paramList1 = new AssertionError("Substitution failed");
      AppMethodBeat.o(122517);
      throw paramList1;
    }
    AppMethodBeat.o(122517);
    return paramList1;
  }

  public static au a(List<a.i.b.a.c.b.ar> paramList1, as paramas, l paraml, List<a.i.b.a.c.b.ar> paramList2, boolean[] paramArrayOfBoolean)
  {
    AppMethodBeat.i(122518);
    HashMap localHashMap1 = new HashMap();
    HashMap localHashMap2 = new HashMap();
    int i = 0;
    Object localObject1 = paramList1.iterator();
    Object localObject2;
    while (((Iterator)localObject1).hasNext())
    {
      a.i.b.a.c.b.ar localar = (a.i.b.a.c.b.ar)((Iterator)localObject1).next();
      localObject2 = ah.a(paraml, localar.dYn(), localar.dZi(), localar.dZh(), localar.dZg(), i, am.BeR);
      localHashMap1.put(localar.dXY(), new ar(((ah)localObject2).dZf()));
      localHashMap2.put(localar, localObject2);
      paramList2.add(localObject2);
      i++;
    }
    paramas = au.b(paramas, ao.be(localHashMap1));
    paramList1 = paramList1.iterator();
    if (paramList1.hasNext())
    {
      paramList2 = (a.i.b.a.c.b.ar)paramList1.next();
      paraml = (ah)localHashMap2.get(paramList2);
      localObject2 = paramList2.dWP().iterator();
      label210: if (((Iterator)localObject2).hasNext())
      {
        localObject1 = (w)((Iterator)localObject2).next();
        paramList2 = paramas.c((w)localObject1, ba.BKi);
        if (paramList2 == null)
        {
          paramList1 = null;
          AppMethodBeat.o(122518);
        }
      }
    }
    while (true)
    {
      return paramList1;
      if ((paramList2 != localObject1) && (paramArrayOfBoolean != null))
        paramArrayOfBoolean[0] = true;
      paraml.L(paramList2);
      break label210;
      paraml.setInitialized();
      break;
      AppMethodBeat.o(122518);
      paramList1 = paramas;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.l.k
 * JD-Core Version:    0.6.2
 */