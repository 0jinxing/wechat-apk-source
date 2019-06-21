package a.i.b.a.c.d.a.c.b;

import a.i.b.a.c.b.h;
import a.i.b.a.c.l.ad;
import a.i.b.a.c.l.an;
import a.i.b.a.c.l.ap;
import a.i.b.a.c.l.as;
import a.i.b.a.c.l.az;
import a.i.b.a.c.l.ba;
import a.i.b.a.c.l.p;
import a.i.b.a.c.l.t;
import a.i.b.a.c.l.w;
import a.i.b.a.c.l.x;
import a.i.b.a.c.l.y;
import a.m;
import a.o;
import a.u;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class e extends as
{
  private static final a Bpo;
  private static final a Bpp;
  public static final e Bpq;

  static
  {
    AppMethodBeat.i(120062);
    Bpq = new e();
    Bpo = d.a(a.i.b.a.c.d.a.a.l.Bmw, false, null, 3).a(b.Bpc);
    Bpp = d.a(a.i.b.a.c.d.a.a.l.Bmw, false, null, 3).a(b.Bpb);
    AppMethodBeat.o(120062);
  }

  private final w P(w paramw)
  {
    AppMethodBeat.i(120058);
    h localh;
    while (true)
    {
      localh = paramw.ejw().dYs();
      if (!(localh instanceof a.i.b.a.c.b.ar))
        break;
      paramw = d.b((a.i.b.a.c.b.ar)localh);
    }
    if ((localh instanceof a.i.b.a.c.b.e))
    {
      Object localObject = a(t.ak(paramw), (a.i.b.a.c.b.e)localh, Bpo);
      ad localad = (ad)((o)localObject).first;
      boolean bool1 = ((Boolean)((o)localObject).second).booleanValue();
      paramw = a(t.al(paramw), (a.i.b.a.c.b.e)localh, Bpp);
      localObject = (ad)paramw.first;
      boolean bool2 = ((Boolean)paramw.second).booleanValue();
      if ((bool1) || (bool2));
      for (paramw = (az)new g(localad, (ad)localObject); ; paramw = x.a(localad, (ad)localObject))
      {
        paramw = (w)paramw;
        AppMethodBeat.o(120058);
        return paramw;
      }
    }
    paramw = (Throwable)new IllegalStateException("Unexpected declaration kind: ".concat(String.valueOf(localh)).toString());
    AppMethodBeat.o(120058);
    throw paramw;
  }

  public static ap a(a.i.b.a.c.b.ar paramar, a parama, w paramw)
  {
    AppMethodBeat.i(120060);
    a.f.b.j.p(paramar, "parameter");
    a.f.b.j.p(parama, "attr");
    a.f.b.j.p(paramw, "erasedUpperBound");
    Object localObject = parama.BoX;
    switch (f.eQZ[localObject.ordinal()])
    {
    default:
      paramar = new m();
      AppMethodBeat.o(120060);
      throw paramar;
    case 1:
      paramar = (ap)new a.i.b.a.c.l.ar(ba.BKh, paramw);
      AppMethodBeat.o(120060);
    case 2:
    case 3:
    }
    while (true)
    {
      return paramar;
      if (!paramar.dZh().BKm)
      {
        paramar = (ap)new a.i.b.a.c.l.ar(ba.BKh, (w)a.i.b.a.c.i.c.a.G((a.i.b.a.c.b.l)paramar).dXL());
        AppMethodBeat.o(120060);
      }
      else
      {
        localObject = paramw.ejw().getParameters();
        a.f.b.j.o(localObject, "erasedUpperBound.constructor.parameters");
        if (!((Collection)localObject).isEmpty());
        for (int i = 1; ; i = 0)
        {
          if (i == 0)
            break label213;
          paramar = (ap)new a.i.b.a.c.l.ar(ba.BKj, paramw);
          AppMethodBeat.o(120060);
          break;
        }
        label213: paramar = d.a(paramar, parama);
        AppMethodBeat.o(120060);
      }
    }
  }

  private final o<ad, Boolean> a(ad paramad, a.i.b.a.c.b.e parame, a parama)
  {
    AppMethodBeat.i(120059);
    if (paramad.ejw().getParameters().isEmpty())
    {
      paramad = u.I(paramad, Boolean.FALSE);
      AppMethodBeat.o(120059);
    }
    while (true)
    {
      return paramad;
      if (a.i.b.a.c.a.g.n((w)paramad))
      {
        parama = (ap)paramad.ejt().get(0);
        parame = parama.ekq();
        parama = parama.dZS();
        a.f.b.j.o(parama, "componentTypeProjection.type");
        parame = a.a.j.listOf(new a.i.b.a.c.l.ar(parame, P(parama)));
        paramad = u.I(x.c(paramad.dYn(), paramad.ejw(), parame, paramad.eci()), Boolean.FALSE);
        AppMethodBeat.o(120059);
      }
      else if (y.an((w)paramad))
      {
        paramad = u.I(p.awn("Raw error type: " + paramad.ejw()), Boolean.FALSE);
        AppMethodBeat.o(120059);
      }
      else
      {
        a.i.b.a.c.b.a.g localg = paramad.dYn();
        an localan = paramad.ejw();
        Object localObject1 = paramad.ejw().getParameters();
        a.f.b.j.o(localObject1, "type.constructor.parameters");
        Object localObject2 = (Iterable)localObject1;
        localObject1 = (Collection)new ArrayList(a.a.j.d((Iterable)localObject2));
        localObject2 = ((Iterable)localObject2).iterator();
        while (((Iterator)localObject2).hasNext())
        {
          a.i.b.a.c.b.ar localar = (a.i.b.a.c.b.ar)((Iterator)localObject2).next();
          a.f.b.j.o(localar, "parameter");
          ((Collection)localObject1).add(b(localar, parama));
        }
        parama = (List)localObject1;
        boolean bool = paramad.eci();
        paramad = parame.a((as)Bpq);
        a.f.b.j.o(paramad, "declaration.getMemberScope(RawSubstitution)");
        paramad = u.I(x.a(localg, localan, parama, bool, paramad), Boolean.TRUE);
        AppMethodBeat.o(120059);
      }
    }
  }

  public final boolean isEmpty()
  {
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.d.a.c.b.e
 * JD-Core Version:    0.6.2
 */