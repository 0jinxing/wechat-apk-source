package a.i.b.a.c.d.a.b;

import a.aa;
import a.i.b.a.c.b.am;
import a.i.b.a.c.b.au;
import a.i.b.a.c.b.c.ai;
import a.i.b.a.c.b.e;
import a.i.b.a.c.b.y;
import a.i.b.a.c.f.f;
import a.i.b.a.c.i.e.h;
import a.i.b.a.c.l.w;
import a.o;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class i
{
  public static final List<au> a(Collection<j> paramCollection, Collection<? extends au> paramCollection1, a.i.b.a.c.b.a parama)
  {
    AppMethodBeat.i(119813);
    a.f.b.j.p(paramCollection, "newValueParametersTypes");
    a.f.b.j.p(paramCollection1, "oldValueParameters");
    a.f.b.j.p(parama, "newOwner");
    if (paramCollection.size() == paramCollection1.size());
    for (int i = 1; (aa.AUz) && (i == 0); i = 0)
    {
      paramCollection = (Throwable)new AssertionError("Different value parameters sizes: Enhanced = " + paramCollection.size() + ", Old = " + paramCollection1.size());
      AppMethodBeat.o(119813);
      throw paramCollection;
    }
    paramCollection = (Iterable)a.a.j.a((Iterable)paramCollection, (Iterable)paramCollection1);
    paramCollection1 = (Collection)new ArrayList(a.a.j.d(paramCollection));
    Iterator localIterator = paramCollection.iterator();
    if (localIterator.hasNext())
    {
      Object localObject1 = (o)localIterator.next();
      paramCollection = (j)((o)localObject1).first;
      Object localObject2 = (au)((o)localObject1).second;
      i = ((au)localObject2).getIndex();
      a.i.b.a.c.b.a.g localg = ((au)localObject2).dYn();
      f localf = ((au)localObject2).dZg();
      a.f.b.j.o(localf, "oldParameter.name");
      localObject1 = paramCollection.AYl;
      boolean bool1 = paramCollection.BmM;
      boolean bool2 = ((au)localObject2).dZX();
      boolean bool3 = ((au)localObject2).dZY();
      if (((au)localObject2).dZV() != null);
      for (paramCollection = a.i.b.a.c.i.c.a.F((a.i.b.a.c.b.l)parama).dZD().l(paramCollection.AYl); ; paramCollection = null)
      {
        localObject2 = ((au)localObject2).dYo();
        a.f.b.j.o(localObject2, "oldParameter.source");
        paramCollection1.add(new ai(parama, null, i, localg, localf, (w)localObject1, bool1, bool2, bool3, paramCollection, (am)localObject2));
        break;
      }
    }
    paramCollection = (List)paramCollection1;
    AppMethodBeat.o(119813);
    return paramCollection;
  }

  public static final a.i.b.a.c.d.a.c.a.l s(e parame)
  {
    AppMethodBeat.i(119814);
    a.f.b.j.p(parame, "receiver$0");
    parame = a.i.b.a.c.i.c.a.z(parame);
    if (parame == null)
    {
      parame = null;
      AppMethodBeat.o(119814);
    }
    while (true)
    {
      return parame;
      h localh = parame.dXX();
      a.f.b.j.o(localh, "superClassDescriptor.staticScope");
      if (!(localh instanceof a.i.b.a.c.d.a.c.a.l))
        break;
      parame = (a.i.b.a.c.d.a.c.a.l)localh;
      AppMethodBeat.o(119814);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.d.a.b.i
 * JD-Core Version:    0.6.2
 */