package a.i.b.a.c.i;

import a.f.a.b;
import a.i.b.a.c.b.a;
import a.i.b.a.c.n.i;
import a.i.b.a.c.n.i.b;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class k
{
  public static final <H> Collection<H> b(Collection<? extends H> paramCollection, b<? super H, ? extends a> paramb)
  {
    AppMethodBeat.i(122040);
    a.f.b.j.p(paramCollection, "receiver$0");
    a.f.b.j.p(paramb, "descriptorByHandle");
    if (paramCollection.size() <= 1)
      AppMethodBeat.o(122040);
    while (true)
    {
      return paramCollection;
      paramCollection = new LinkedList(paramCollection);
      Object localObject1 = i.BNv;
      localObject1 = i.b.ekD();
      int i;
      if (!((Collection)paramCollection).isEmpty())
        i = 1;
      while (true)
        if (i != 0)
        {
          Object localObject2 = a.a.j.fJ((List)paramCollection);
          Object localObject3 = i.BNv;
          localObject3 = i.b.ekD();
          Object localObject4 = j.a(localObject2, (Collection)paramCollection, paramb, (b)new k.b((i)localObject3));
          a.f.b.j.o(localObject4, "OverridingUtil.extractMe…nflictedHandles.add(it) }");
          if ((((Collection)localObject4).size() == 1) && (((i)localObject3).isEmpty()))
          {
            localObject3 = a.a.j.h((Iterable)localObject4);
            a.f.b.j.o(localObject3, "overridableGroup.single()");
            ((i)localObject1).add(localObject3);
            break;
            i = 0;
            continue;
          }
          localObject2 = j.a((Collection)localObject4, paramb);
          a.f.b.j.o(localObject2, "OverridingUtil.selectMos…roup, descriptorByHandle)");
          a locala = (a)paramb.am(localObject2);
          localObject4 = ((Iterable)localObject4).iterator();
          while (((Iterator)localObject4).hasNext())
          {
            Object localObject5 = ((Iterator)localObject4).next();
            a.f.b.j.o(localObject5, "it");
            if (!j.f(locala, (a)paramb.am(localObject5)))
              ((Collection)localObject3).add(localObject5);
          }
          if (!((Collection)localObject3).isEmpty());
          for (i = 1; ; i = 0)
          {
            if (i != 0)
              ((i)localObject1).addAll((Collection)localObject3);
            ((i)localObject1).add(localObject2);
            break;
          }
        }
      paramCollection = (Collection)localObject1;
      AppMethodBeat.o(122040);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.i.k
 * JD-Core Version:    0.6.2
 */