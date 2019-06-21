package a.i.b.a.c.d.a.c;

import a.i.b.a.c.a.g.a;
import a.i.b.a.c.b.a.g.b;
import a.i.b.a.c.d.a.e.a;
import a.j.f;
import a.j.l.a;
import a.j.l.b;
import a.j.p;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Collection;
import java.util.Iterator;

public final class e
  implements a.i.b.a.c.b.a.g
{
  private final a.i.b.a.c.k.d<a, a.i.b.a.c.b.a.c> Bnm;
  private final h Bnn;
  private final a.i.b.a.c.d.a.e.d Bno;

  public e(h paramh, a.i.b.a.c.d.a.e.d paramd)
  {
    AppMethodBeat.i(119832);
    this.Bnn = paramh;
    this.Bno = paramd;
    this.Bnm = this.Bnn.Bnv.Baf.g((a.f.a.b)new e.a(this));
    AppMethodBeat.o(119832);
  }

  public final a.i.b.a.c.b.a.c i(a.i.b.a.c.f.b paramb)
  {
    AppMethodBeat.i(119829);
    a.f.b.j.p(paramb, "fqName");
    Object localObject = this.Bno.m(paramb);
    if (localObject != null)
    {
      a.i.b.a.c.b.a.c localc = (a.i.b.a.c.b.a.c)((a.f.a.b)this.Bnm).am(localObject);
      localObject = localc;
      if (localc != null);
    }
    else
    {
      localObject = a.i.b.a.c.d.a.a.c.Bmf;
      localObject = a.i.b.a.c.d.a.a.c.a(paramb, this.Bno, this.Bnn);
    }
    AppMethodBeat.o(119829);
    return localObject;
  }

  public final boolean isEmpty()
  {
    AppMethodBeat.i(119831);
    boolean bool;
    if (this.Bno.ebC().isEmpty())
    {
      bool = true;
      AppMethodBeat.o(119831);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(119831);
    }
  }

  public final Iterator<a.i.b.a.c.b.a.c> iterator()
  {
    AppMethodBeat.i(119830);
    Object localObject1 = a.j.i.d(a.a.j.t((Iterable)this.Bno.ebC()), (a.f.a.b)this.Bnm);
    Object localObject2 = a.i.b.a.c.d.a.a.c.Bmf;
    localObject2 = a.i.b.a.c.a.g.Bag.BaK;
    a.f.b.j.o(localObject2, "KotlinBuiltIns.FQ_NAMES.deprecated");
    localObject2 = a.i.b.a.c.d.a.a.c.a((a.i.b.a.c.f.b)localObject2, this.Bno, this.Bnn);
    a.f.b.j.p(localObject1, "receiver$0");
    localObject2 = a.j.i.Z(new a.j.h[] { localObject1, a.j.i.Z(new Object[] { localObject2 }) });
    a.f.b.j.p(localObject2, "receiver$0");
    localObject1 = (a.f.a.b)l.a.BOG;
    if ((localObject2 instanceof p))
    {
      localObject2 = (p)localObject2;
      a.f.b.j.p(localObject1, "iterator");
    }
    for (localObject1 = (a.j.h)new f(((p)localObject2).BOr, ((p)localObject2).BOz, (a.f.a.b)localObject1); ; localObject1 = (a.j.h)new f((a.j.h)localObject2, (a.f.a.b)l.b.BOH, (a.f.a.b)localObject1))
    {
      localObject1 = a.j.i.b((a.j.h)localObject1).iterator();
      AppMethodBeat.o(119830);
      return localObject1;
    }
  }

  public final boolean j(a.i.b.a.c.f.b paramb)
  {
    AppMethodBeat.i(119833);
    a.f.b.j.p(paramb, "fqName");
    boolean bool = g.b.b(this, paramb);
    AppMethodBeat.o(119833);
    return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.d.a.c.e
 * JD-Core Version:    0.6.2
 */