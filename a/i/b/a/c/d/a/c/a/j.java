package a.i.b.a.c.d.a.c.a;

import a.a.v;
import a.a.x;
import a.i.b.a.c.b.ah;
import a.i.b.a.c.b.al;
import a.i.b.a.c.b.e;
import a.i.b.a.c.b.l;
import a.i.b.a.c.c.a.c;
import a.i.b.a.c.d.a.e.aa;
import a.i.b.a.c.d.a.e.t;
import a.i.b.a.c.f.f;
import a.i.b.a.c.k.i;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public final class j extends m
{
  private final t Bot;
  private final a.i.b.a.c.k.g<Set<String>> Bov;
  private final a.i.b.a.c.k.d<j.a, e> Bow;
  final h Box;

  public j(a.i.b.a.c.d.a.c.h paramh, t paramt, h paramh1)
  {
    super(paramh);
    AppMethodBeat.i(119984);
    this.Bot = paramt;
    this.Box = paramh1;
    this.Bov = paramh.Bnv.Baf.j((a.f.a.a)new j.d(this, paramh));
    this.Bow = paramh.Bnv.Baf.g((a.f.a.b)new j.c(this, paramh));
    AppMethodBeat.o(119984);
  }

  final e a(f paramf, a.i.b.a.c.d.a.e.g paramg)
  {
    AppMethodBeat.i(119977);
    if (!a.i.b.a.c.f.h.x(paramf))
    {
      AppMethodBeat.o(119977);
      paramf = null;
    }
    while (true)
    {
      return paramf;
      Set localSet = (Set)this.Bov.invoke();
      if ((paramg == null) && (localSet != null) && (!localSet.contains(paramf.name)))
      {
        AppMethodBeat.o(119977);
        paramf = null;
      }
      else
      {
        paramf = (e)this.Bow.am(new j.a(paramf, paramg));
        AppMethodBeat.o(119977);
      }
    }
  }

  public final Collection<ah> a(f paramf, a.i.b.a.c.c.a.a parama)
  {
    AppMethodBeat.i(119978);
    a.f.b.j.p(paramf, "name");
    a.f.b.j.p(parama, "location");
    paramf = (Collection)v.AUP;
    AppMethodBeat.o(119978);
    return paramf;
  }

  public final Collection<l> a(a.i.b.a.c.i.e.d paramd, a.f.a.b<? super f, Boolean> paramb)
  {
    AppMethodBeat.i(119983);
    a.f.b.j.p(paramd, "kindFilter");
    a.f.b.j.p(paramb, "nameFilter");
    paramd = (Collection)a(paramd, paramb, (a.i.b.a.c.c.a.a)c.BjR);
    AppMethodBeat.o(119983);
    return paramd;
  }

  protected final Set<f> a(a.i.b.a.c.i.e.d paramd)
  {
    AppMethodBeat.i(119982);
    a.f.b.j.p(paramd, "kindFilter");
    paramd = (Set)x.AUR;
    AppMethodBeat.o(119982);
    return paramd;
  }

  protected final void a(Collection<al> paramCollection, f paramf)
  {
    AppMethodBeat.i(119981);
    a.f.b.j.p(paramCollection, "result");
    a.f.b.j.p(paramf, "name");
    AppMethodBeat.o(119981);
  }

  protected final Set<f> b(a.i.b.a.c.i.e.d paramd, a.f.a.b<? super f, Boolean> paramb)
  {
    AppMethodBeat.i(119980);
    a.f.b.j.p(paramd, "kindFilter");
    paramd = (Set)x.AUR;
    AppMethodBeat.o(119980);
    return paramd;
  }

  protected final Set<f> c(a.i.b.a.c.i.e.d paramd, a.f.a.b<? super f, Boolean> paramb)
  {
    AppMethodBeat.i(119979);
    a.f.b.j.p(paramd, "kindFilter");
    Object localObject = a.i.b.a.c.i.e.d.BFX;
    if (!paramd.UI(a.i.b.a.c.i.e.d.ejD()))
    {
      paramd = (Set)x.AUR;
      AppMethodBeat.o(119979);
    }
    while (true)
    {
      return paramd;
      paramd = (Set)this.Bov.invoke();
      if (paramd != null)
      {
        paramb = (Iterable)paramd;
        paramd = (Collection)new HashSet();
        paramb = paramb.iterator();
        while (paramb.hasNext())
          paramd.add(f.avX((String)paramb.next()));
        paramd = (Set)paramd;
        AppMethodBeat.o(119979);
      }
      else
      {
        localObject = this.Bot;
        paramd = paramb;
        if (paramb == null)
          paramd = a.i.b.a.c.n.d.eku();
        paramd = (Iterable)((t)localObject).d(paramd);
        paramb = (Collection)new LinkedHashSet();
        localObject = paramd.iterator();
        label220: 
        while (((Iterator)localObject).hasNext())
        {
          paramd = (a.i.b.a.c.d.a.e.g)((Iterator)localObject).next();
          if (aa.Bpv == null);
          for (paramd = null; ; paramd = paramd.dZg())
          {
            if (paramd == null)
              break label220;
            paramb.add(paramd);
            break;
          }
        }
        paramd = (Set)paramb;
        AppMethodBeat.o(119979);
      }
    }
  }

  public final e e(f paramf, a.i.b.a.c.c.a.a parama)
  {
    AppMethodBeat.i(119975);
    a.f.b.j.p(paramf, "name");
    a.f.b.j.p(parama, "location");
    paramf = a(paramf, null);
    AppMethodBeat.o(119975);
    return paramf;
  }

  protected final b ebt()
  {
    return (b)b.a.BnM;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.d.a.c.a.j
 * JD-Core Version:    0.6.2
 */