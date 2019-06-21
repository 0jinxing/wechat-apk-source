package a.i.b.a.c.b.c;

import a.i.b.a.c.b.ab;
import a.i.b.a.c.b.ac;
import a.i.b.a.c.f.f;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public final class i
  implements ac
{
  private final List<ac> BhB;

  public i(List<? extends ac> paramList)
  {
    AppMethodBeat.i(119430);
    this.BhB = paramList;
    AppMethodBeat.o(119430);
  }

  public final Collection<a.i.b.a.c.f.b> a(a.i.b.a.c.f.b paramb, a.f.a.b<? super f, Boolean> paramb1)
  {
    AppMethodBeat.i(119429);
    a.f.b.j.p(paramb, "fqName");
    a.f.b.j.p(paramb1, "nameFilter");
    HashSet localHashSet = new HashSet();
    Iterator localIterator = this.BhB.iterator();
    while (localIterator.hasNext())
      localHashSet.addAll(((ac)localIterator.next()).a(paramb, paramb1));
    paramb = (Collection)localHashSet;
    AppMethodBeat.o(119429);
    return paramb;
  }

  public final List<ab> h(a.i.b.a.c.f.b paramb)
  {
    AppMethodBeat.i(119428);
    a.f.b.j.p(paramb, "fqName");
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = this.BhB.iterator();
    while (localIterator.hasNext())
      localArrayList.addAll((Collection)((ac)localIterator.next()).h(paramb));
    paramb = a.a.j.m((Iterable)localArrayList);
    AppMethodBeat.o(119428);
    return paramb;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.b.c.i
 * JD-Core Version:    0.6.2
 */