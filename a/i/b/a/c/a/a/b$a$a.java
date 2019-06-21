package a.i.b.a.c.a.a;

import a.f.a.m;
import a.f.b.k;
import a.i.b.a.c.b.a.g;
import a.i.b.a.c.b.a.g.a;
import a.i.b.a.c.b.ab;
import a.i.b.a.c.b.e;
import a.i.b.a.c.c.a.a;
import a.i.b.a.c.c.a.c;
import a.i.b.a.c.f.f;
import a.i.b.a.c.i.e.h;
import a.i.b.a.c.l.an;
import a.i.b.a.c.l.w;
import a.i.b.a.c.l.x;
import a.y;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

final class b$a$a extends k
  implements m<ab, f, y>
{
  b$a$a(b.a parama, ArrayList paramArrayList)
  {
    super(2);
  }

  public final void a(ab paramab, f paramf)
  {
    AppMethodBeat.i(119139);
    a.f.b.j.p(paramab, "packageFragment");
    a.f.b.j.p(paramf, "name");
    Object localObject1 = paramab.dXR().c(paramf, (a)c.BjI);
    Object localObject2 = localObject1;
    if (!(localObject1 instanceof e))
      localObject2 = null;
    localObject2 = (e)localObject2;
    if (localObject2 == null)
    {
      paramab = (Throwable)new IllegalStateException(("Class " + paramf + " not found in " + paramab).toString());
      AppMethodBeat.o(119139);
      throw paramab;
    }
    paramab = ((e)localObject2).dXY();
    a.f.b.j.o(paramab, "descriptor.typeConstructor");
    paramf = (Iterable)a.a.j.y(this.BcQ.getParameters(), paramab.getParameters().size());
    paramab = (Collection)new ArrayList(a.a.j.d(paramf));
    paramf = paramf.iterator();
    while (paramf.hasNext())
      paramab.add(new a.i.b.a.c.l.ar((w)((a.i.b.a.c.b.ar)paramf.next()).dZf()));
    localObject1 = (List)paramab;
    paramf = this.BcP;
    paramab = g.BfJ;
    paramf.add(x.a(g.a.eai(), (e)localObject2, (List)localObject1));
    AppMethodBeat.o(119139);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.a.a.b.a.a
 * JD-Core Version:    0.6.2
 */