package a.i.b.a.c.a.b;

import a.i.b.a.c.a.g;
import a.i.b.a.c.a.g.a;
import a.i.b.a.c.d.b.t;
import a.i.b.a.c.f.a;
import a.i.b.a.c.f.b;
import a.i.b.a.c.f.f;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public final class f$a
{
  public static boolean d(a.i.b.a.c.f.c paramc)
  {
    boolean bool = false;
    AppMethodBeat.i(119210);
    a.f.b.j.p(paramc, "fqName");
    if (e(paramc))
    {
      bool = true;
      AppMethodBeat.o(119210);
    }
    while (true)
    {
      return bool;
      c localc = c.Bdq;
      paramc = c.c(paramc);
      if (paramc == null)
        AppMethodBeat.o(119210);
      else
        try
        {
          paramc = Class.forName(paramc.ehE().ByQ.ByV);
          bool = Serializable.class.isAssignableFrom(paramc);
          AppMethodBeat.o(119210);
        }
        catch (ClassNotFoundException paramc)
        {
          AppMethodBeat.o(119210);
        }
    }
  }

  static Set<String> dYO()
  {
    AppMethodBeat.i(119212);
    Object localObject1 = t.BrJ;
    Object localObject2 = (Iterable)a.a.j.listOf(new a.i.b.a.c.i.d.c[] { a.i.b.a.c.i.d.c.BFe, a.i.b.a.c.i.d.c.BFg, a.i.b.a.c.i.d.c.BFl, a.i.b.a.c.i.d.c.BFj, a.i.b.a.c.i.d.c.BFg, a.i.b.a.c.i.d.c.BFi, a.i.b.a.c.i.d.c.BFk, a.i.b.a.c.i.d.c.BFh });
    localObject1 = (Collection)new LinkedHashSet();
    Iterator localIterator = ((Iterable)localObject2).iterator();
    while (localIterator.hasNext())
    {
      String str = ((a.i.b.a.c.i.d.c)localIterator.next()).BFr.ByQ.ehK().name;
      a.f.b.j.o(str, "it.wrapperFqName.shortName().asString()");
      localObject2 = t.ad(new String[] { "Ljava/lang/String;" });
      a.a.j.a((Collection)localObject1, (Iterable)t.p(str, (String[])Arrays.copyOf((Object[])localObject2, localObject2.length)));
    }
    localObject1 = (Set)localObject1;
    AppMethodBeat.o(119212);
    return localObject1;
  }

  static boolean e(a.i.b.a.c.f.c paramc)
  {
    AppMethodBeat.i(119211);
    boolean bool;
    if ((a.f.b.j.j(paramc, g.Bag.Bat)) || (g.b(paramc)))
    {
      bool = true;
      AppMethodBeat.o(119211);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(119211);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.a.b.f.a
 * JD-Core Version:    0.6.2
 */