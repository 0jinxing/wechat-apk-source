package a.i.b.a.c.l.a;

import a.i.b.a.c.l.ad;
import a.i.b.a.c.l.az;
import a.i.b.a.c.l.n;
import a.i.b.a.c.l.p;
import a.i.b.a.c.l.q;
import a.i.b.a.c.l.t;
import a.i.b.a.c.l.w;
import a.i.b.a.c.l.x;
import a.i.b.a.c.l.y;
import a.m;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.List<+La.i.b.a.c.l.az;>;

public final class b
{
  public static final az gb(List<? extends az> paramList)
  {
    AppMethodBeat.i(122714);
    a.f.b.j.p(paramList, "types");
    Object localObject1;
    Object localObject2;
    Iterator localIterator;
    int i;
    int j;
    switch (paramList.size())
    {
    default:
      localObject1 = (Iterable)paramList;
      localObject2 = (Collection)new ArrayList(a.a.j.d((Iterable)localObject1));
      localIterator = ((Iterable)localObject1).iterator();
      i = 0;
      j = 0;
    case 0:
    case 1:
    }
    while (true)
      if (localIterator.hasNext())
      {
        localObject1 = (az)localIterator.next();
        if ((i != 0) || (y.an((w)localObject1)))
        {
          i = 1;
          if (!(localObject1 instanceof ad))
            break label177;
          localObject1 = (ad)localObject1;
          label122: ((Collection)localObject2).add(localObject1);
          continue;
          paramList = (Throwable)new IllegalStateException("Expected some types".toString());
          AppMethodBeat.o(122714);
          throw paramList;
          paramList = (az)a.a.j.fN(paramList);
          AppMethodBeat.o(122714);
        }
      }
    while (true)
    {
      return paramList;
      i = 0;
      break;
      label177: if ((localObject1 instanceof q))
      {
        if (n.ag((w)localObject1))
        {
          AppMethodBeat.o(122714);
          paramList = (List<? extends az>)localObject1;
          continue;
        }
        localObject1 = ((q)localObject1).BJx;
        j = 1;
        break label122;
      }
      paramList = new m();
      AppMethodBeat.o(122714);
      throw paramList;
      localObject1 = (List)localObject2;
      if (i != 0)
      {
        paramList = p.awn("Intersection of error types: ".concat(String.valueOf(paramList)));
        a.f.b.j.o(paramList, "ErrorUtils.createErrorTy… of error types: $types\")");
        paramList = (az)paramList;
        AppMethodBeat.o(122714);
      }
      else if (j == 0)
      {
        paramList = s.BLd;
        paramList = (az)s.gc((List)localObject1);
        AppMethodBeat.o(122714);
      }
      else
      {
        localObject2 = (Iterable)paramList;
        paramList = (Collection)new ArrayList(a.a.j.d((Iterable)localObject2));
        localObject2 = ((Iterable)localObject2).iterator();
        while (((Iterator)localObject2).hasNext())
          paramList.add(t.al((w)((Iterator)localObject2).next()));
        paramList = (List)paramList;
        localObject2 = s.BLd;
        localObject1 = s.gc((List)localObject1);
        localObject2 = s.BLd;
        paramList = x.a((ad)localObject1, s.gc(paramList));
        AppMethodBeat.o(122714);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.l.a.b
 * JD-Core Version:    0.6.2
 */