package a.i.b.a.c.d.a.c.a;

import a.i.b.a.c.a.g;
import a.i.b.a.c.b.am;
import a.i.b.a.c.b.ar;
import a.i.b.a.c.b.y;
import a.i.b.a.c.d.a.c.b.c;
import a.i.b.a.c.d.a.c.e;
import a.i.b.a.c.d.a.c.h;
import a.i.b.a.c.d.a.e.v;
import a.i.b.a.c.l.ad;
import a.i.b.a.c.l.ba;
import a.i.b.a.c.l.x;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class n extends a.i.b.a.c.b.c.b
{
  private final h Bnn;
  private final e BoU;
  private final a.i.b.a.c.d.a.e.w BoV;

  public n(h paramh, a.i.b.a.c.d.a.e.w paramw, int paramInt, a.i.b.a.c.b.l paraml)
  {
    super(paramh.Bnv.Baf, paraml, paramw.dZg(), ba.BKh, false, paramInt, am.BeR, paramh.Bnv.Bhr);
    AppMethodBeat.i(120021);
    this.Bnn = paramh;
    this.BoV = paramw;
    this.BoU = new e(this.Bnn, (a.i.b.a.c.d.a.e.d)this.BoV);
    AppMethodBeat.o(120021);
  }

  public final void J(a.i.b.a.c.l.w paramw)
  {
    AppMethodBeat.i(120020);
    a.f.b.j.p(paramw, "type");
    AppMethodBeat.o(120020);
  }

  public final List<a.i.b.a.c.l.w> eaq()
  {
    AppMethodBeat.i(120019);
    Object localObject1 = this.BoV.ecb();
    Object localObject2;
    if (((Collection)localObject1).isEmpty())
    {
      localObject1 = this.Bnn.Bnv.BcH.dZD().dXM();
      a.f.b.j.o(localObject1, "c.module.builtIns.anyType");
      localObject2 = this.Bnn.Bnv.BcH.dZD().dXN();
      a.f.b.j.o(localObject2, "c.module.builtIns.nullableAnyType");
      localObject1 = a.a.j.listOf(x.a((ad)localObject1, (ad)localObject2));
      AppMethodBeat.o(120019);
    }
    while (true)
    {
      return localObject1;
      localObject2 = (Iterable)localObject1;
      localObject1 = (Collection)new ArrayList(a.a.j.d((Iterable)localObject2));
      Iterator localIterator = ((Iterable)localObject2).iterator();
      while (localIterator.hasNext())
      {
        localObject2 = (a.i.b.a.c.d.a.e.j)localIterator.next();
        ((Collection)localObject1).add(this.Bnn.Bnu.a((v)localObject2, a.i.b.a.c.d.a.c.b.d.a(a.i.b.a.c.d.a.a.l.Bmw, false, (ar)this, 1)));
      }
      localObject1 = (List)localObject1;
      AppMethodBeat.o(120019);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.d.a.c.a.n
 * JD-Core Version:    0.6.2
 */