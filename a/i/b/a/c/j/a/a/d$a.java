package a.i.b.a.c.j.a.a;

import a.a.v;
import a.i.b.a.c.b.ah;
import a.i.b.a.c.b.al;
import a.i.b.a.c.b.e;
import a.i.b.a.c.b.l;
import a.i.b.a.c.j.a.k;
import a.i.b.a.c.l.an;
import a.i.b.a.c.l.w;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class d$a extends g
{
  private final a.i.b.a.c.k.f<Collection<l>> BhG = this.BHj.Brl.Baf.i((a.f.a.a)new d.a.b(this));

  public d$a()
  {
    super(localk, (Collection)localObject1, (Collection)localObject2, (Collection)localObject3, (a.f.a.a)new d.a.a((List)localCollection));
    AppMethodBeat.o(122361);
  }

  private final <D extends a.i.b.a.c.b.b> void a(Collection<? extends D> paramCollection, Collection<D> paramCollection1)
  {
    AppMethodBeat.i(122354);
    a.i.b.a.c.i.j.a(paramCollection, (Collection)new ArrayList(paramCollection1), (e)this.BHY, (a.i.b.a.c.i.i)new d.a.d(paramCollection1));
    AppMethodBeat.o(122354);
  }

  protected final a.i.b.a.c.f.a A(a.i.b.a.c.f.f paramf)
  {
    AppMethodBeat.i(122358);
    a.f.b.j.p(paramf, "name");
    paramf = d.c(this.BHY).p(paramf);
    a.f.b.j.o(paramf, "classId.createNestedClassId(name)");
    AppMethodBeat.o(122358);
    return paramf;
  }

  public final Collection<ah> a(a.i.b.a.c.f.f paramf, a.i.b.a.c.c.a.a parama)
  {
    AppMethodBeat.i(122351);
    a.f.b.j.p(paramf, "name");
    a.f.b.j.p(parama, "location");
    d(paramf, parama);
    paramf = super.a(paramf, parama);
    AppMethodBeat.o(122351);
    return paramf;
  }

  public final Collection<l> a(a.i.b.a.c.i.e.d paramd, a.f.a.b<? super a.i.b.a.c.f.f, Boolean> paramb)
  {
    AppMethodBeat.i(122349);
    a.f.b.j.p(paramd, "kindFilter");
    a.f.b.j.p(paramb, "nameFilter");
    paramd = (Collection)this.BhG.invoke();
    AppMethodBeat.o(122349);
    return paramd;
  }

  protected final void a(a.i.b.a.c.f.f paramf, Collection<ah> paramCollection)
  {
    AppMethodBeat.i(122353);
    a.f.b.j.p(paramf, "name");
    a.f.b.j.p(paramCollection, "descriptors");
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = this.BHY.dXY().eap().iterator();
    while (localIterator.hasNext())
      localArrayList.addAll(((w)localIterator.next()).dXR().a(paramf, (a.i.b.a.c.c.a.a)a.i.b.a.c.c.a.c.BjQ));
    a((Collection)localArrayList, paramCollection);
    AppMethodBeat.o(122353);
  }

  public final Collection<al> b(a.i.b.a.c.f.f paramf, a.i.b.a.c.c.a.a parama)
  {
    AppMethodBeat.i(122350);
    a.f.b.j.p(paramf, "name");
    a.f.b.j.p(parama, "location");
    d(paramf, parama);
    paramf = super.b(paramf, parama);
    AppMethodBeat.o(122350);
    return paramf;
  }

  protected final void b(a.i.b.a.c.f.f paramf, Collection<al> paramCollection)
  {
    AppMethodBeat.i(122352);
    a.f.b.j.p(paramf, "name");
    a.f.b.j.p(paramCollection, "functions");
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = this.BHY.dXY().eap().iterator();
    while (localIterator.hasNext())
      localArrayList.addAll(((w)localIterator.next()).dXR().b(paramf, (a.i.b.a.c.c.a.a)a.i.b.a.c.c.a.c.BjQ));
    a.a.j.a((Iterable)paramCollection, (a.f.a.b)new d.a.c(this));
    paramCollection.addAll(this.BHj.Brl.BGX.a(paramf, (e)this.BHY));
    a((Collection)localArrayList, paramCollection);
    AppMethodBeat.o(122352);
  }

  public final a.i.b.a.c.b.h c(a.i.b.a.c.f.f paramf, a.i.b.a.c.c.a.a parama)
  {
    AppMethodBeat.i(122357);
    a.f.b.j.p(paramf, "name");
    a.f.b.j.p(parama, "location");
    d(paramf, parama);
    Object localObject = d.b(this.BHY);
    if (localObject != null)
    {
      localObject = ((d.c)localObject).B(paramf);
      if (localObject != null)
      {
        paramf = (a.i.b.a.c.b.h)localObject;
        AppMethodBeat.o(122357);
      }
    }
    while (true)
    {
      return paramf;
      paramf = super.c(paramf, parama);
      AppMethodBeat.o(122357);
    }
  }

  protected final void c(Collection<l> paramCollection, a.f.a.b<? super a.i.b.a.c.f.f, Boolean> paramb)
  {
    AppMethodBeat.i(122359);
    a.f.b.j.p(paramCollection, "result");
    a.f.b.j.p(paramb, "nameFilter");
    Object localObject1 = d.b(this.BHY);
    if (localObject1 != null)
    {
      Object localObject2 = (Iterable)((d.c)localObject1).BIc.keySet();
      paramb = (Collection)new ArrayList();
      localObject2 = ((Iterable)localObject2).iterator();
      while (((Iterator)localObject2).hasNext())
      {
        e locale = ((d.c)localObject1).B((a.i.b.a.c.f.f)((Iterator)localObject2).next());
        if (locale != null)
          paramb.add(locale);
      }
    }
    for (paramb = (Collection)paramb; ; paramb = null)
    {
      localObject1 = paramb;
      if (paramb == null)
        localObject1 = (Collection)v.AUP;
      paramCollection.addAll((Collection)localObject1);
      AppMethodBeat.o(122359);
      return;
    }
  }

  public final void d(a.i.b.a.c.f.f paramf, a.i.b.a.c.c.a.a parama)
  {
    AppMethodBeat.i(122360);
    a.f.b.j.p(paramf, "name");
    a.f.b.j.p(parama, "location");
    a.i.b.a.c.c.a.a(this.BHj.Brl.Bnc, parama, (e)this.BHY, paramf);
    AppMethodBeat.o(122360);
  }

  protected final Set<a.i.b.a.c.f.f> ejY()
  {
    AppMethodBeat.i(122355);
    Object localObject1 = (Iterable)d.a(this.BHY).ekh();
    Object localObject2 = (Collection)new LinkedHashSet();
    localObject1 = ((Iterable)localObject1).iterator();
    while (((Iterator)localObject1).hasNext())
      a.a.j.a((Collection)localObject2, (Iterable)((w)((Iterator)localObject1).next()).dXR().eau());
    ((LinkedHashSet)localObject2).addAll(this.BHj.Brl.BGX.m((e)this.BHY));
    localObject2 = (Set)localObject2;
    AppMethodBeat.o(122355);
    return localObject2;
  }

  protected final Set<a.i.b.a.c.f.f> ejZ()
  {
    AppMethodBeat.i(122356);
    Object localObject1 = (Iterable)d.a(this.BHY).ekh();
    Object localObject2 = (Collection)new LinkedHashSet();
    localObject1 = ((Iterable)localObject1).iterator();
    while (((Iterator)localObject1).hasNext())
      a.a.j.a((Collection)localObject2, (Iterable)((w)((Iterator)localObject1).next()).dXR().eav());
    localObject2 = (Set)localObject2;
    AppMethodBeat.o(122356);
    return localObject2;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.j.a.a.d.a
 * JD-Core Version:    0.6.2
 */