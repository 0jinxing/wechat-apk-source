package a.i.b.a.c.i.e;

import a.i.b.a.c.b.ah;
import a.i.b.a.c.b.al;
import a.i.b.a.c.b.l;
import a.i.b.a.c.f.f;
import a.i.b.a.c.i.k;
import a.i.b.a.c.l.w;
import a.o;
import a.v;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class m extends a
{
  public static final a BGp;
  private final b BGo;

  static
  {
    AppMethodBeat.i(122228);
    BGp = new a((byte)0);
    AppMethodBeat.o(122228);
  }

  private m(b paramb)
  {
    this.BGo = paramb;
  }

  public static final h a(String paramString, Collection<? extends w> paramCollection)
  {
    AppMethodBeat.i(122229);
    a.f.b.j.p(paramString, "message");
    a.f.b.j.p(paramCollection, "types");
    Object localObject = (Iterable)paramCollection;
    Collection localCollection = (Collection)new ArrayList(a.a.j.d((Iterable)localObject));
    localObject = ((Iterable)localObject).iterator();
    while (((Iterator)localObject).hasNext())
      localCollection.add(((w)((Iterator)localObject).next()).dXR());
    paramString = new b(paramString, (List)localCollection);
    if (paramCollection.size() <= 1)
    {
      paramString = (h)paramString;
      AppMethodBeat.o(122229);
    }
    while (true)
    {
      return paramString;
      paramString = (h)new m(paramString, (byte)0);
      AppMethodBeat.o(122229);
    }
  }

  public final Collection<ah> a(f paramf, a.i.b.a.c.c.a.a parama)
  {
    AppMethodBeat.i(122226);
    a.f.b.j.p(paramf, "name");
    a.f.b.j.p(parama, "location");
    paramf = k.b(super.a(paramf, parama), (a.f.a.b)m.d.BGs);
    AppMethodBeat.o(122226);
    return paramf;
  }

  public final Collection<l> a(d paramd, a.f.a.b<? super f, Boolean> paramb)
  {
    AppMethodBeat.i(122227);
    a.f.b.j.p(paramd, "kindFilter");
    a.f.b.j.p(paramb, "nameFilter");
    Object localObject1 = (Iterable)super.a(paramd, paramb);
    paramd = new ArrayList();
    paramb = new ArrayList();
    localObject1 = ((Iterable)localObject1).iterator();
    while (((Iterator)localObject1).hasNext())
    {
      Object localObject2 = ((Iterator)localObject1).next();
      if (((l)localObject2 instanceof a.i.b.a.c.b.a))
        paramd.add(localObject2);
      else
        paramb.add(localObject2);
    }
    paramb = new o(paramd, paramb);
    paramd = (List)paramb.first;
    paramb = (List)paramb.second;
    if (paramd == null)
    {
      paramd = new v("null cannot be cast to non-null type kotlin.collections.Collection<org.jetbrains.kotlin.descriptors.CallableDescriptor>");
      AppMethodBeat.o(122227);
      throw paramd;
    }
    paramd = (Collection)a.a.j.b(k.b((Collection)paramd, (a.f.a.b)m.b.BGq), (Iterable)paramb);
    AppMethodBeat.o(122227);
    return paramd;
  }

  public final Collection<al> b(f paramf, a.i.b.a.c.c.a.a parama)
  {
    AppMethodBeat.i(122225);
    a.f.b.j.p(paramf, "name");
    a.f.b.j.p(parama, "location");
    paramf = k.b(super.b(paramf, parama), (a.f.a.b)m.c.BGr);
    AppMethodBeat.o(122225);
    return paramf;
  }

  public static final class a
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.i.e.m
 * JD-Core Version:    0.6.2
 */