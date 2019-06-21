package a.i.b.a.c.d.a.c.b;

import a.f.a.b;
import a.f.b.k;
import a.i.b.a.c.h.c;
import a.i.b.a.c.l.ap;
import a.i.b.a.c.l.w;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

final class g$b extends k
  implements b<w, List<? extends String>>
{
  g$b(c paramc)
  {
    super(1);
  }

  public final List<String> Q(w paramw)
  {
    AppMethodBeat.i(120067);
    a.f.b.j.p(paramw, "type");
    Object localObject = (Iterable)paramw.ejt();
    paramw = (Collection)new ArrayList(a.a.j.d((Iterable)localObject));
    localObject = ((Iterable)localObject).iterator();
    while (((Iterator)localObject).hasNext())
    {
      ap localap = (ap)((Iterator)localObject).next();
      paramw.add(this.Bps.a(localap));
    }
    paramw = (List)paramw;
    AppMethodBeat.o(120067);
    return paramw;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.d.a.c.b.g.b
 * JD-Core Version:    0.6.2
 */