package a.i.b.a.c.d.a.c.a;

import a.f.b.t;
import a.f.b.v;
import a.i.b.a.c.b.a.g.a;
import a.i.b.a.c.b.au;
import a.i.b.a.c.d.a.c.b.d;
import a.i.b.a.c.d.a.e.m;
import a.i.b.a.c.i.b.q;
import a.i.b.a.c.l.ad;
import a.i.b.a.c.l.ar;
import a.i.b.a.c.l.av;
import a.i.b.a.c.l.ba;
import a.i.b.a.c.l.w;
import a.i.b.a.c.l.x;
import a.i.k;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class e
  implements a.i.b.a.c.b.a.c
{
  private final a.i.b.a.c.k.f BlR;
  private final a.i.b.a.c.k.f Bmk;
  private final a.i.b.a.c.k.g BnR;
  private final a.i.b.a.c.d.a.d.a BnS;
  private final a.i.b.a.c.d.a.e.a BnT;
  private final a.i.b.a.c.d.a.c.h Bnn;

  static
  {
    AppMethodBeat.i(119877);
    eQB = new k[] { (k)v.a(new t(v.aN(e.class), "fqName", "getFqName()Lorg/jetbrains/kotlin/name/FqName;")), (k)v.a(new t(v.aN(e.class), "type", "getType()Lorg/jetbrains/kotlin/types/SimpleType;")), (k)v.a(new t(v.aN(e.class), "allValueArguments", "getAllValueArguments()Ljava/util/Map;")) };
    AppMethodBeat.o(119877);
  }

  public e(a.i.b.a.c.d.a.c.h paramh, a.i.b.a.c.d.a.e.a parama)
  {
    AppMethodBeat.i(119884);
    this.Bnn = paramh;
    this.BnT = parama;
    this.BnR = this.Bnn.Bnv.Baf.j((a.f.a.a)new e.b(this));
    this.BlR = this.Bnn.Bnv.Baf.i((a.f.a.a)new e.c(this));
    this.BnS = this.Bnn.Bnv.BmZ.a((a.i.b.a.c.d.a.e.l)this.BnT);
    this.Bmk = this.Bnn.Bnv.Baf.i((a.f.a.a)new e.a(this));
    AppMethodBeat.o(119884);
  }

  private final a.i.b.a.c.i.b.f<?> b(a.i.b.a.c.d.a.e.b paramb)
  {
    AppMethodBeat.i(119882);
    if ((paramb instanceof a.i.b.a.c.d.a.e.o))
    {
      paramb = a.i.b.a.c.i.b.g.BEO.dQ(((a.i.b.a.c.d.a.e.o)paramb).getValue());
      AppMethodBeat.o(119882);
    }
    Object localObject1;
    while (true)
    {
      return paramb;
      if (!(paramb instanceof m))
        break;
      localObject1 = ((m)paramb).ebQ();
      paramb = ((m)paramb).ebR();
      if ((localObject1 == null) || (paramb == null))
      {
        AppMethodBeat.o(119882);
        paramb = null;
      }
      else
      {
        paramb = (a.i.b.a.c.i.b.f)new a.i.b.a.c.i.b.i((a.i.b.a.c.f.a)localObject1, paramb);
        AppMethodBeat.o(119882);
      }
    }
    Object localObject2;
    if ((paramb instanceof a.i.b.a.c.d.a.e.e))
    {
      localObject2 = paramb.dZg();
      localObject1 = localObject2;
      if (localObject2 == null)
      {
        localObject1 = a.i.b.a.c.d.a.p.Bln;
        a.f.b.j.o(localObject1, "DEFAULT_ANNOTATION_MEMBER_NAME");
      }
      localObject2 = ((a.i.b.a.c.d.a.e.e)paramb).ebD();
      paramb = ebq();
      a.f.b.j.o(paramb, "type");
      if (a.i.b.a.c.l.y.an((w)paramb))
        break label479;
      paramb = a.i.b.a.c.i.c.a.l(this);
      if (paramb == null)
        a.f.b.j.dWJ();
      paramb = a.i.b.a.c.d.a.a.a.b((a.i.b.a.c.f.f)localObject1, paramb);
      if (paramb != null)
      {
        paramb = paramb.dZS();
        if (paramb != null)
          break label535;
      }
      paramb = (w)this.Bnn.Bnv.BcH.dZD().a(ba.BKh, (w)a.i.b.a.c.l.p.awn("Unknown array element type"));
    }
    label535: 
    while (true)
    {
      a.f.b.j.o(paramb, "DescriptorResolverUtils.…e\")\n                    )");
      localObject1 = (Iterable)localObject2;
      Collection localCollection = (Collection)new ArrayList(a.a.j.d((Iterable)localObject1));
      Iterator localIterator = ((Iterable)localObject1).iterator();
      while (localIterator.hasNext())
      {
        localObject2 = b((a.i.b.a.c.d.a.e.b)localIterator.next());
        localObject1 = localObject2;
        if (localObject2 == null)
          localObject1 = (a.i.b.a.c.i.b.f)new q();
        localCollection.add(localObject1);
      }
      localObject2 = (List)localCollection;
      localObject1 = a.i.b.a.c.i.b.g.BEO;
      paramb = (a.i.b.a.c.i.b.f)a.i.b.a.c.i.b.g.a((List)localObject2, paramb);
      AppMethodBeat.o(119882);
      break;
      if ((paramb instanceof a.i.b.a.c.d.a.e.c))
      {
        paramb = ((a.i.b.a.c.d.a.e.c)paramb).ebB();
        paramb = (a.i.b.a.c.i.b.f)new a.i.b.a.c.i.b.a((a.i.b.a.c.b.a.c)new e(this.Bnn, paramb));
        AppMethodBeat.o(119882);
        break;
      }
      if ((paramb instanceof a.i.b.a.c.d.a.e.h))
      {
        paramb = ((a.i.b.a.c.d.a.e.h)paramb).ebK();
        localObject1 = av.aA(this.Bnn.Bnu.a(paramb, d.a(a.i.b.a.c.d.a.a.l.Bmw, false, null, 3)));
        a.f.b.j.o(localObject1, "TypeUtils.makeNotNullabl…toAttributes())\n        )");
        paramb = a.i.b.a.c.i.c.a.b(this.Bnn.Bnv.BcH, new a.i.b.a.c.f.b("java.lang.Class"), (a.i.b.a.c.c.a.a)a.i.b.a.c.c.a.c.BjU);
        if (paramb != null);
      }
      else
      {
        label479: AppMethodBeat.o(119882);
        paramb = null;
        break;
      }
      localObject1 = a.a.j.listOf(new ar((w)localObject1));
      localObject2 = a.i.b.a.c.b.a.g.BfJ;
      paramb = (a.i.b.a.c.i.b.f)new a.i.b.a.c.i.b.o((w)x.a(g.a.eai(), paramb, (List)localObject1));
      AppMethodBeat.o(119882);
      break;
    }
  }

  private ad ebq()
  {
    AppMethodBeat.i(119879);
    ad localad = (ad)a.i.b.a.c.k.h.a(this.BlR, eQB[1]);
    AppMethodBeat.o(119879);
    return localad;
  }

  public final a.i.b.a.c.f.b dZF()
  {
    AppMethodBeat.i(119878);
    Object localObject = this.BnR;
    k localk = eQB[0];
    a.f.b.j.p(localObject, "receiver$0");
    a.f.b.j.p(localk, "p");
    localObject = (a.i.b.a.c.f.b)((a.i.b.a.c.k.g)localObject).invoke();
    AppMethodBeat.o(119878);
    return localObject;
  }

  public final Map<a.i.b.a.c.f.f, a.i.b.a.c.i.b.f<?>> eah()
  {
    AppMethodBeat.i(119881);
    Map localMap = (Map)a.i.b.a.c.k.h.a(this.Bmk, eQB[2]);
    AppMethodBeat.o(119881);
    return localMap;
  }

  public final String toString()
  {
    AppMethodBeat.i(119883);
    String str = a.i.b.a.c.h.c.a(a.i.b.a.c.h.c.BBL, (a.i.b.a.c.b.a.c)this);
    AppMethodBeat.o(119883);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.d.a.c.a.e
 * JD-Core Version:    0.6.2
 */