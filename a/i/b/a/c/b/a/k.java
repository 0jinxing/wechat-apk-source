package a.i.b.a.c.b.a;

import a.a.e;
import a.j.h;
import a.j.i;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class k
  implements g
{
  private final List<g> BfS;

  public k(List<? extends g> paramList)
  {
    AppMethodBeat.i(119355);
    this.BfS = paramList;
    AppMethodBeat.o(119355);
  }

  public k(g[] paramArrayOfg)
  {
    this(e.Q(paramArrayOfg));
    AppMethodBeat.i(119356);
    AppMethodBeat.o(119356);
  }

  public final c i(a.i.b.a.c.f.b paramb)
  {
    AppMethodBeat.i(119353);
    a.f.b.j.p(paramb, "fqName");
    paramb = i.e(a.a.j.t((Iterable)this.BfS), (a.f.a.b)new a(paramb));
    a.f.b.j.p(paramb, "receiver$0");
    paramb = paramb.iterator();
    if (!paramb.hasNext());
    for (paramb = null; ; paramb = paramb.next())
    {
      paramb = (c)paramb;
      AppMethodBeat.o(119353);
      return paramb;
    }
  }

  public final boolean isEmpty()
  {
    AppMethodBeat.i(119351);
    Object localObject = (Iterable)this.BfS;
    boolean bool;
    if ((!(localObject instanceof Collection)) || (!((Collection)localObject).isEmpty()))
    {
      localObject = ((Iterable)localObject).iterator();
      while (((Iterator)localObject).hasNext())
        if (!((g)((Iterator)localObject).next()).isEmpty())
        {
          bool = false;
          AppMethodBeat.o(119351);
        }
    }
    while (true)
    {
      return bool;
      bool = true;
      AppMethodBeat.o(119351);
    }
  }

  public final Iterator<c> iterator()
  {
    AppMethodBeat.i(119354);
    Iterator localIterator = i.c(a.a.j.t((Iterable)this.BfS), (a.f.a.b)b.BfU).iterator();
    AppMethodBeat.o(119354);
    return localIterator;
  }

  public final boolean j(a.i.b.a.c.f.b paramb)
  {
    AppMethodBeat.i(119352);
    a.f.b.j.p(paramb, "fqName");
    Iterator localIterator = a.a.j.t((Iterable)this.BfS).iterator();
    boolean bool;
    while (localIterator.hasNext())
      if (((g)localIterator.next()).j(paramb))
      {
        bool = true;
        AppMethodBeat.o(119352);
      }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(119352);
    }
  }

  static final class a extends a.f.b.k
    implements a.f.a.b<g, c>
  {
    a(a.i.b.a.c.f.b paramb)
    {
      super();
    }
  }

  static final class b extends a.f.b.k
    implements a.f.a.b<g, h<? extends c>>
  {
    public static final b BfU;

    static
    {
      AppMethodBeat.i(119350);
      BfU = new b();
      AppMethodBeat.o(119350);
    }

    b()
    {
      super();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.b.a.k
 * JD-Core Version:    0.6.2
 */