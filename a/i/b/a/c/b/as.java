package a.i.b.a.c.b;

import a.a.v;
import a.aa;
import a.f.a.b;
import a.i.b.a.c.i.d;
import a.i.b.a.c.l.an;
import a.i.b.a.c.l.p;
import a.i.b.a.c.l.w;
import a.j.h;
import a.j.o;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class as
{
  public static final af a(w paramw, i parami, int paramInt)
  {
    Object localObject = null;
    AppMethodBeat.i(119300);
    if ((parami == null) || (p.L((l)parami)))
    {
      AppMethodBeat.o(119300);
      paramw = localObject;
    }
    while (true)
    {
      return paramw;
      int i = parami.dYq().size() + paramInt;
      if (!parami.dYh())
      {
        if ((i == paramw.ejt().size()) || (d.m((l)parami)));
        for (int j = 1; (aa.AUz) && (j == 0); j = 0)
        {
          paramw = (Throwable)new AssertionError(paramw.ejt().size() - i + " trailing arguments were found in " + paramw + " type");
          AppMethodBeat.o(119300);
          throw paramw;
        }
        paramw = new af(parami, paramw.ejt().subList(paramInt, paramw.ejt().size()), null);
        AppMethodBeat.o(119300);
      }
      else
      {
        List localList = paramw.ejt().subList(paramInt, i);
        l locall = parami.dXW();
        localObject = locall;
        if (!(locall instanceof i))
          localObject = null;
        paramw = new af(parami, localList, a(paramw, (i)localObject, i));
        AppMethodBeat.o(119300);
      }
    }
  }

  public static final List<ar> a(i parami)
  {
    Object localObject1 = null;
    AppMethodBeat.i(119299);
    a.f.b.j.p(parami, "receiver$0");
    List localList = parami.dYq();
    a.f.b.j.o(localList, "declaredTypeParameters");
    if ((!parami.dYh()) && (!(parami.dXW() instanceof a)))
    {
      AppMethodBeat.o(119299);
      parami = localList;
    }
    while (true)
    {
      return parami;
      Object localObject2 = a.i.b.a.c.i.c.a.H((l)parami);
      Object localObject3 = (b)as.a.BeU;
      a.f.b.j.p(localObject2, "receiver$0");
      a.f.b.j.p(localObject3, "predicate");
      localObject2 = a.j.i.c(a.j.i.c((h)new o((h)localObject2, (b)localObject3), (b)as.b.BeV));
      Object localObject4 = a.i.b.a.c.i.c.a.H((l)parami).iterator();
      do
      {
        if (!((Iterator)localObject4).hasNext())
          break;
        localObject3 = ((Iterator)localObject4).next();
      }
      while (!(localObject3 instanceof e));
      while (true)
      {
        localObject4 = (e)localObject3;
        localObject3 = localObject1;
        if (localObject4 != null)
        {
          localObject4 = ((e)localObject4).dXY();
          localObject3 = localObject1;
          if (localObject4 != null)
            localObject3 = ((an)localObject4).getParameters();
        }
        localObject1 = localObject3;
        if (localObject3 == null)
          localObject1 = (List)v.AUP;
        if ((!((List)localObject2).isEmpty()) || (!((List)localObject1).isEmpty()))
          break label253;
        parami = parami.dYq();
        a.f.b.j.o(parami, "declaredTypeParameters");
        AppMethodBeat.o(119299);
        break;
        localObject3 = null;
      }
      label253: localObject1 = (Iterable)a.a.j.b((Collection)localObject2, (Iterable)localObject1);
      localObject3 = (Collection)new ArrayList(a.a.j.d((Iterable)localObject1));
      localObject2 = ((Iterable)localObject1).iterator();
      while (((Iterator)localObject2).hasNext())
      {
        localObject1 = (ar)((Iterator)localObject2).next();
        a.f.b.j.o(localObject1, "it");
        ((Collection)localObject3).add(new c((ar)localObject1, (l)parami, localList.size()));
      }
      parami = (List)localObject3;
      parami = a.a.j.b((Collection)localList, (Iterable)parami);
      AppMethodBeat.o(119299);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.b.as
 * JD-Core Version:    0.6.2
 */