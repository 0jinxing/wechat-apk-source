package a.i.b.a.c.a;

import a.i.b.a.c.b.e;
import a.i.b.a.c.b.l;
import a.i.b.a.c.f.b;
import a.i.b.a.c.f.c;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public final class d
{
  private static final LinkedHashSet<a.i.b.a.c.f.a> AZP;
  public static final d AZQ;

  static
  {
    AppMethodBeat.i(119074);
    AZQ = new d();
    Object localObject1 = h.BbY;
    a.f.b.j.o(localObject1, "PrimitiveType.NUMBER_TYPES");
    Object localObject2 = (Iterable)localObject1;
    localObject1 = (Collection)new ArrayList(a.a.j.d((Iterable)localObject2));
    localObject2 = ((Iterable)localObject2).iterator();
    while (((Iterator)localObject2).hasNext())
      ((Collection)localObject1).add(g.c((h)((Iterator)localObject2).next()));
    localObject2 = (Iterable)a.a.j.a((Collection)a.a.j.a((Collection)a.a.j.a((Collection)localObject1, g.Bag.Bas.ehI()), g.Bag.Bau.ehI()), g.Bag.BaD.ehI());
    localObject1 = (Collection)new LinkedHashSet();
    localObject2 = ((Iterable)localObject2).iterator();
    while (((Iterator)localObject2).hasNext())
      ((Collection)localObject1).add(a.i.b.a.c.f.a.n((b)((Iterator)localObject2).next()));
    AZP = (LinkedHashSet)localObject1;
    AppMethodBeat.o(119074);
  }

  public static boolean b(e parame)
  {
    AppMethodBeat.i(119073);
    a.f.b.j.p(parame, "classDescriptor");
    boolean bool;
    if (a.i.b.a.c.i.d.u((l)parame))
    {
      Iterable localIterable = (Iterable)AZP;
      parame = a.i.b.a.c.i.c.a.c((a.i.b.a.c.b.h)parame);
      if (parame != null)
      {
        parame = parame.ehC();
        if (!a.a.j.a(localIterable, parame))
          break label67;
        bool = true;
        AppMethodBeat.o(119073);
      }
    }
    while (true)
    {
      return bool;
      parame = null;
      break;
      label67: bool = false;
      AppMethodBeat.o(119073);
    }
  }

  public static Set<a.i.b.a.c.f.a> dXF()
  {
    AppMethodBeat.i(119072);
    Set localSet = Collections.unmodifiableSet((Set)AZP);
    a.f.b.j.o(localSet, "Collections.unmodifiableSet(classIds)");
    AppMethodBeat.o(119072);
    return localSet;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.a.d
 * JD-Core Version:    0.6.2
 */