package a.i.b.a.c.i.e;

import a.f.a.b;
import a.f.b.j;
import a.f.b.t;
import a.g;
import a.i.b.a.c.b.ah;
import a.i.b.a.c.b.al;
import a.i.b.a.c.b.ao;
import a.i.b.a.c.i.a.a.c;
import a.i.b.a.c.l.as;
import a.i.b.a.c.l.au;
import a.i.k;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public final class l
  implements h
{
  private final h BGb;
  private final au BGk;
  private Map<a.i.b.a.c.b.l, a.i.b.a.c.b.l> BGl;
  private final a.f BGm;

  static
  {
    AppMethodBeat.i(122208);
    eQB = new k[] { (k)a.f.b.v.a(new t(a.f.b.v.aN(l.class), "_allDescriptors", "get_allDescriptors()Ljava/util/Collection;")) };
    AppMethodBeat.o(122208);
  }

  public l(h paramh, au paramau)
  {
    AppMethodBeat.i(122217);
    this.BGb = paramh;
    paramh = paramau.Bik;
    j.o(paramh, "givenSubstitutor.substitution");
    this.BGk = c.c(paramh).ekr();
    this.BGm = g.g((a.f.a.a)new l.a(this));
    AppMethodBeat.o(122217);
  }

  private final <D extends a.i.b.a.c.b.l> D J(D paramD)
  {
    AppMethodBeat.i(122209);
    if (this.BGk.Bik.isEmpty())
      AppMethodBeat.o(122209);
    while (true)
    {
      return paramD;
      if (this.BGl == null)
        this.BGl = ((Map)new HashMap());
      Map localMap = this.BGl;
      if (localMap == null)
        j.dWJ();
      Object localObject1 = localMap.get(paramD);
      Object localObject2 = localObject1;
      if (localObject1 == null)
      {
        if ((paramD instanceof ao))
        {
          localObject2 = ((ao)paramD).f(this.BGk);
          if (localObject2 == null)
          {
            paramD = (Throwable)new AssertionError("We expect that no conflict should happen while substitution is guaranteed to generate invariant projection, but " + paramD + " substitution fails");
            AppMethodBeat.o(122209);
            throw paramD;
          }
          localObject2 = (a.i.b.a.c.b.l)localObject2;
          localMap.put(paramD, localObject2);
        }
      }
      else
      {
        paramD = (a.i.b.a.c.b.l)localObject2;
        if (paramD != null)
          break label213;
        paramD = new a.v("null cannot be cast to non-null type D");
        AppMethodBeat.o(122209);
        throw paramD;
      }
      paramD = (Throwable)new IllegalStateException("Unknown descriptor in scope: ".concat(String.valueOf(paramD)).toString());
      AppMethodBeat.o(122209);
      throw paramD;
      label213: AppMethodBeat.o(122209);
    }
  }

  private final <D extends a.i.b.a.c.b.l> Collection<D> o(Collection<? extends D> paramCollection)
  {
    AppMethodBeat.i(122210);
    if (this.BGk.Bik.isEmpty())
      AppMethodBeat.o(122210);
    while (true)
    {
      return paramCollection;
      if (paramCollection.isEmpty())
      {
        AppMethodBeat.o(122210);
      }
      else
      {
        LinkedHashSet localLinkedHashSet = new LinkedHashSet(a.i.b.a.c.n.a.UR(paramCollection.size()));
        paramCollection = paramCollection.iterator();
        while (paramCollection.hasNext())
          localLinkedHashSet.add(J((a.i.b.a.c.b.l)paramCollection.next()));
        paramCollection = (Collection)localLinkedHashSet;
        AppMethodBeat.o(122210);
      }
    }
  }

  public final Collection<ah> a(a.i.b.a.c.f.f paramf, a.i.b.a.c.c.a.a parama)
  {
    AppMethodBeat.i(122211);
    j.p(paramf, "name");
    j.p(parama, "location");
    paramf = o(this.BGb.a(paramf, parama));
    AppMethodBeat.o(122211);
    return paramf;
  }

  public final Collection<a.i.b.a.c.b.l> a(d paramd, b<? super a.i.b.a.c.f.f, Boolean> paramb)
  {
    AppMethodBeat.i(122214);
    j.p(paramd, "kindFilter");
    j.p(paramb, "nameFilter");
    paramd = (Collection)this.BGm.getValue();
    AppMethodBeat.o(122214);
    return paramd;
  }

  public final Collection<al> b(a.i.b.a.c.f.f paramf, a.i.b.a.c.c.a.a parama)
  {
    AppMethodBeat.i(122213);
    j.p(paramf, "name");
    j.p(parama, "location");
    paramf = o(this.BGb.b(paramf, parama));
    AppMethodBeat.o(122213);
    return paramf;
  }

  public final a.i.b.a.c.b.h c(a.i.b.a.c.f.f paramf, a.i.b.a.c.c.a.a parama)
  {
    AppMethodBeat.i(122212);
    j.p(paramf, "name");
    j.p(parama, "location");
    paramf = this.BGb.c(paramf, parama);
    if (paramf != null)
    {
      paramf = (a.i.b.a.c.b.h)J((a.i.b.a.c.b.l)paramf);
      AppMethodBeat.o(122212);
    }
    while (true)
    {
      return paramf;
      paramf = null;
      AppMethodBeat.o(122212);
    }
  }

  public final Set<a.i.b.a.c.f.f> eau()
  {
    AppMethodBeat.i(122215);
    Set localSet = this.BGb.eau();
    AppMethodBeat.o(122215);
    return localSet;
  }

  public final Set<a.i.b.a.c.f.f> eav()
  {
    AppMethodBeat.i(122216);
    Set localSet = this.BGb.eav();
    AppMethodBeat.o(122216);
    return localSet;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.i.e.l
 * JD-Core Version:    0.6.2
 */