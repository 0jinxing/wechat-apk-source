package a.i.b.a.c.j.a.a;

import a.a.ad;
import a.f.a.a;
import a.f.a.b;
import a.i.b.a.c.e.a.c;
import a.i.b.a.c.e.a.k;
import a.i.b.a.c.e.a.c;
import a.i.b.a.c.j.a.k;
import a.i.b.a.c.j.a.r;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

final class d$c
{
  final Map<a.i.b.a.c.f.f, a.k> BIc;
  private final a.i.b.a.c.k.d<a.i.b.a.c.f.f, a.i.b.a.c.b.e> BId;
  final a.i.b.a.c.k.f<Set<a.i.b.a.c.f.f>> BhD;

  public d$c()
  {
    AppMethodBeat.i(122371);
    Object localObject2 = localObject1.BGD.Btz;
    a.f.b.j.o(localObject2, "classProto.enumEntryList");
    Object localObject3 = (Iterable)localObject2;
    localObject2 = (Map)new LinkedHashMap(a.h.e.im(ad.SI(a.a.j.d((Iterable)localObject3)), 16));
    Iterator localIterator = ((Iterable)localObject3).iterator();
    while (localIterator.hasNext())
    {
      localObject3 = localIterator.next();
      a.k localk = (a.k)localObject3;
      c localc = this.BHY.BHj.AWq;
      a.f.b.j.o(localk, "it");
      ((Map)localObject2).put(r.b(localc, localk.Buf), localObject3);
    }
    this.BIc = ((Map)localObject2);
    this.BId = localObject1.BHj.Brl.Baf.g((b)new d.c.a(this));
    this.BhD = localObject1.BHj.Brl.Baf.i((a)new d.c.b(this));
    AppMethodBeat.o(122371);
  }

  public final a.i.b.a.c.b.e B(a.i.b.a.c.f.f paramf)
  {
    AppMethodBeat.i(122370);
    a.f.b.j.p(paramf, "name");
    paramf = (a.i.b.a.c.b.e)this.BId.am(paramf);
    AppMethodBeat.o(122370);
    return paramf;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.j.a.a.d.c
 * JD-Core Version:    0.6.2
 */