package a.i.b.a.c.b;

import a.f.b.k;
import a.i.b.a.c.f.f;
import a.i.b.a.c.i.e.h;
import a.j.i;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Iterator;
import java.util.List;

public final class s
{
  public static final e a(y paramy, a.i.b.a.c.f.a parama)
  {
    Object localObject1 = null;
    AppMethodBeat.i(119273);
    a.f.b.j.p(paramy, "receiver$0");
    a.f.b.j.p(parama, "classId");
    Object localObject2 = parama.BcW;
    a.f.b.j.o(localObject2, "classId.packageFqName");
    paramy = paramy.g((a.i.b.a.c.f.b)localObject2);
    localObject2 = parama.ByN.ByQ.ehM();
    a.f.b.j.o(localObject2, "classId.relativeClassName.pathSegments()");
    paramy = paramy.dXR();
    parama = a.a.j.fJ((List)localObject2);
    a.f.b.j.o(parama, "segments.first()");
    parama = paramy.c((f)parama, (a.i.b.a.c.c.a.a)a.i.b.a.c.c.a.c.BjW);
    paramy = parama;
    if (!(parama instanceof e))
      paramy = null;
    paramy = (e)paramy;
    if (paramy == null)
    {
      AppMethodBeat.o(119273);
      paramy = localObject1;
    }
    while (true)
    {
      return paramy;
      localObject2 = ((List)localObject2).subList(1, ((List)localObject2).size()).iterator();
      while (true)
      {
        if (!((Iterator)localObject2).hasNext())
          break label217;
        parama = (f)((Iterator)localObject2).next();
        paramy = paramy.dZk();
        a.f.b.j.o(parama, "name");
        parama = paramy.c(parama, (a.i.b.a.c.c.a.a)a.i.b.a.c.c.a.c.BjW);
        paramy = parama;
        if (!(parama instanceof e))
          paramy = null;
        paramy = (e)paramy;
        if (paramy == null)
        {
          AppMethodBeat.o(119273);
          paramy = localObject1;
          break;
        }
      }
      label217: AppMethodBeat.o(119273);
    }
  }

  public static final e a(y paramy, a.i.b.a.c.f.a parama, aa paramaa)
  {
    AppMethodBeat.i(119274);
    a.f.b.j.p(paramy, "receiver$0");
    a.f.b.j.p(parama, "classId");
    a.f.b.j.p(paramaa, "notFoundClasses");
    paramy = a(paramy, parama);
    if (paramy != null)
      AppMethodBeat.o(119274);
    while (true)
    {
      return paramy;
      paramy = paramaa.a(parama, i.c(i.d(i.a(parama, (a.f.a.b)s.a.Bez), (a.f.a.b)b.BeA)));
      AppMethodBeat.o(119274);
    }
  }

  static final class b extends k
    implements a.f.a.b<a.i.b.a.c.f.a, Integer>
  {
    public static final b BeA;

    static
    {
      AppMethodBeat.i(119272);
      BeA = new b();
      AppMethodBeat.o(119272);
    }

    b()
    {
      super();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.b.s
 * JD-Core Version:    0.6.2
 */