package a.i.b.a.c.l.a;

import a.aa;
import a.i.b.a.c.l.ad;
import a.i.b.a.c.l.an;
import a.i.b.a.c.l.az;
import a.i.b.a.c.l.t;
import a.i.b.a.c.l.w;
import a.i.b.a.c.l.x;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.List<+La.i.b.a.c.l.ad;>;
import java.util.Set;

public final class s
{
  public static final s BLd;

  static
  {
    AppMethodBeat.i(122808);
    BLd = new s();
    AppMethodBeat.o(122808);
  }

  public static ad gc(List<? extends ad> paramList)
  {
    AppMethodBeat.i(122806);
    a.f.b.j.p(paramList, "types");
    if (paramList.size() > 1);
    for (int i = 1; (aa.AUz) && (i == 0); i = 0)
    {
      paramList = (Throwable)new AssertionError("Size should be at least 2, but it is " + paramList.size());
      AppMethodBeat.o(122806);
      throw paramList;
    }
    Object localObject1 = new ArrayList();
    Iterator localIterator1 = paramList.iterator();
    Object localObject2;
    while (localIterator1.hasNext())
    {
      localObject2 = (ad)localIterator1.next();
      if ((((ad)localObject2).ejw() instanceof a.i.b.a.c.l.v))
      {
        paramList = ((ad)localObject2).ejw().eap();
        a.f.b.j.o(paramList, "type.constructor.supertypes");
        paramList = (Iterable)paramList;
        Collection localCollection = (Collection)new ArrayList(a.a.j.d(paramList));
        Iterator localIterator2 = paramList.iterator();
        while (localIterator2.hasNext())
        {
          paramList = (w)localIterator2.next();
          a.f.b.j.o(paramList, "it");
          localObject3 = t.al(paramList);
          paramList = (List<? extends ad>)localObject3;
          if (((ad)localObject2).eci())
            paramList = ((ad)localObject3).rL(true);
          localCollection.add(paramList);
        }
        ((ArrayList)localObject1).addAll((Collection)localCollection);
      }
      else
      {
        ((ArrayList)localObject1).add(localObject2);
      }
    }
    paramList = (Iterable)localObject1;
    Object localObject3 = s.a.BLe;
    paramList = paramList.iterator();
    while (paramList.hasNext())
      localObject3 = ((s.a)localObject3).f((az)paramList.next());
    paramList = (Iterable)localObject1;
    localObject1 = (Collection)new LinkedHashSet();
    localIterator1 = paramList.iterator();
    if (localIterator1.hasNext())
    {
      paramList = (ad)localIterator1.next();
      if (localObject3 == s.a.BLh)
      {
        a.f.b.j.p(paramList, "receiver$0");
        localObject2 = a.i.b.a.c.l.g.BJi;
        localObject2 = a.i.b.a.c.l.g.a.a((az)paramList);
        if (localObject2 != null)
          paramList = (ad)localObject2;
      }
      while (true)
      {
        ((Collection)localObject1).add(paramList);
        break;
        paramList = paramList.rL(false);
      }
    }
    paramList = p((Set)localObject1);
    AppMethodBeat.o(122806);
    return paramList;
  }

  private static ad p(Set<? extends ad> paramSet)
  {
    AppMethodBeat.i(122807);
    if (paramSet.size() == 1)
    {
      paramSet = (ad)a.a.j.h((Iterable)paramSet);
      AppMethodBeat.o(122807);
    }
    while (true)
    {
      return paramSet;
      Object localObject1 = new ArrayList((Collection)paramSet);
      Object localObject2 = ((ArrayList)localObject1).iterator();
      a.f.b.j.o(localObject2, "filteredSuperAndEqualTypes.iterator()");
      Object localObject3;
      label103: label243: label247: label253: 
      while (((Iterator)localObject2).hasNext())
      {
        localObject3 = (ad)((Iterator)localObject2).next();
        Object localObject4 = (Iterable)localObject1;
        if (!((Collection)localObject4).isEmpty())
        {
          localObject4 = ((Iterable)localObject4).iterator();
          if (((Iterator)localObject4).hasNext())
          {
            ad localad = (ad)((Iterator)localObject4).next();
            if (localad != localObject3)
            {
              a.f.b.j.o(localad, "lower");
              w localw1 = (w)localad;
              a.f.b.j.o(localObject3, "upper");
              w localw2 = (w)localObject3;
              h localh = h.BKA;
              if ((localh.c(localw1, localw2)) && (!localh.c(localw2, localw1)))
              {
                i = 1;
                if ((i == 0) && (!h.BKA.d((w)localad, (w)localObject3)))
                  break label243;
                i = 1;
                if (i == 0)
                  break label247;
              }
            }
          }
        }
        for (i = 1; ; i = 0)
        {
          if (i == 0)
            break label253;
          ((Iterator)localObject2).remove();
          break;
          i = 0;
          break label189;
          i = 0;
          break label215;
          break label103;
        }
      }
      label189: label215: if (!((Collection)localObject1).isEmpty());
      for (int i = 1; (aa.AUz) && (i == 0); i = 0)
      {
        paramSet = (Throwable)new AssertionError("This collections cannot be empty! input types: " + a.a.j.a((Iterable)paramSet, null, null, null, 0, null, null, 63));
        AppMethodBeat.o(122807);
        throw paramSet;
      }
      if (((ArrayList)localObject1).size() < 2)
      {
        paramSet = a.a.j.fN((List)localObject1);
        a.f.b.j.o(paramSet, "filteredSuperAndEqualTypes.single()");
        paramSet = (ad)paramSet;
        AppMethodBeat.o(122807);
      }
      else
      {
        paramSet = new a.i.b.a.c.l.v((Collection)paramSet);
        localObject3 = a.i.b.a.c.b.a.g.BfJ;
        localObject2 = a.i.b.a.c.b.a.g.a.eai();
        localObject1 = (an)paramSet;
        localObject3 = (List)a.a.v.AUP;
        paramSet = paramSet.ekm();
        a.f.b.j.o(paramSet, "constructor.createScopeForKotlinType()");
        paramSet = x.a((a.i.b.a.c.b.a.g)localObject2, (an)localObject1, (List)localObject3, false, paramSet);
        AppMethodBeat.o(122807);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.l.a.s
 * JD-Core Version:    0.6.2
 */