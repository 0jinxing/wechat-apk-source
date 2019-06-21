package a.i.b.a.c.a.b;

import a.a.ad;
import a.aa;
import a.i.b.a.c.b.ar;
import a.i.b.a.c.b.e;
import a.i.b.a.c.l.ao;
import a.i.b.a.c.l.ao.a;
import a.i.b.a.c.l.c.a;
import a.i.b.a.c.l.w;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class h
{
  public static final ao a(e parame1, e parame2)
  {
    AppMethodBeat.i(119243);
    a.f.b.j.p(parame1, "from");
    a.f.b.j.p(parame2, "to");
    if (parame1.dYq().size() == parame2.dYq().size());
    for (int i = 1; (aa.AUz) && (i == 0); i = 0)
    {
      parame1 = (Throwable)new AssertionError(parame1 + " and " + parame2 + " should have same number of type parameters, but " + parame1.dYq().size() + " / " + parame2.dYq().size() + " found");
      AppMethodBeat.o(119243);
      throw parame1;
    }
    Object localObject1 = ao.BJQ;
    parame1 = parame1.dYq();
    a.f.b.j.o(parame1, "from.declaredTypeParameters");
    localObject1 = (Iterable)parame1;
    parame1 = (Collection)new ArrayList(a.a.j.d((Iterable)localObject1));
    localObject1 = ((Iterable)localObject1).iterator();
    while (((Iterator)localObject1).hasNext())
      parame1.add(((ar)((Iterator)localObject1).next()).dXY());
    parame1 = (Iterable)parame1;
    parame2 = parame2.dYq();
    a.f.b.j.o(parame2, "to.declaredTypeParameters");
    localObject1 = (Iterable)parame2;
    parame2 = (Collection)new ArrayList(a.a.j.d((Iterable)localObject1));
    localObject1 = ((Iterable)localObject1).iterator();
    while (((Iterator)localObject1).hasNext())
    {
      Object localObject2 = (ar)((Iterator)localObject1).next();
      a.f.b.j.o(localObject2, "it");
      localObject2 = ((ar)localObject2).dZf();
      a.f.b.j.o(localObject2, "it.defaultType");
      parame2.add(a.aM((w)localObject2));
    }
    parame1 = ao.a.bf(ad.v((Iterable)a.a.j.a(parame1, (Iterable)parame2)));
    AppMethodBeat.o(119243);
    return parame1;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.a.b.h
 * JD-Core Version:    0.6.2
 */