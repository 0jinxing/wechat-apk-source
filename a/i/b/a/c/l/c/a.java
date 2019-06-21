package a.i.b.a.c.l.c;

import a.i.b.a.c.l.a.c;
import a.i.b.a.c.l.a.e;
import a.i.b.a.c.l.a.k;
import a.i.b.a.c.l.ad;
import a.i.b.a.c.l.ah;
import a.i.b.a.c.l.an;
import a.i.b.a.c.l.ap;
import a.i.b.a.c.l.at;
import a.i.b.a.c.l.av;
import a.i.b.a.c.l.ax;
import a.i.b.a.c.l.az;
import a.i.b.a.c.l.ba;
import a.i.b.a.c.l.q;
import a.i.b.a.c.l.w;
import a.i.b.a.c.l.x;
import a.m;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class a
{
  public static final boolean A(w paramw)
  {
    AppMethodBeat.i(122819);
    a.f.b.j.p(paramw, "receiver$0");
    boolean bool = a.i.b.a.c.a.g.A(paramw);
    AppMethodBeat.o(122819);
    return bool;
  }

  public static final ap a(w paramw, ba paramba, a.i.b.a.c.b.ar paramar)
  {
    AppMethodBeat.i(122823);
    a.f.b.j.p(paramw, "type");
    a.f.b.j.p(paramba, "projectionKind");
    if (paramar != null);
    for (paramar = paramar.dZh(); ; paramar = null)
    {
      ba localba = paramba;
      if (paramar == paramba)
        localba = ba.BKh;
      paramw = (ap)new a.i.b.a.c.l.ar(localba, paramw);
      AppMethodBeat.o(122823);
      return paramw;
    }
  }

  public static final w a(w paramw, a.i.b.a.c.b.a.g paramg)
  {
    AppMethodBeat.i(122822);
    a.f.b.j.p(paramw, "receiver$0");
    a.f.b.j.p(paramg, "newAnnotations");
    if ((paramw.dYn().isEmpty()) && (paramg.isEmpty()))
      AppMethodBeat.o(122822);
    while (true)
    {
      return paramw;
      paramw = (w)paramw.ekn().b(paramg);
      AppMethodBeat.o(122822);
    }
  }

  public static final w aA(w paramw)
  {
    AppMethodBeat.i(122818);
    a.f.b.j.p(paramw, "receiver$0");
    paramw = av.aA(paramw);
    a.f.b.j.o(paramw, "TypeUtils.makeNotNullable(this)");
    AppMethodBeat.o(122818);
    return paramw;
  }

  public static final boolean aE(w paramw)
  {
    AppMethodBeat.i(122820);
    a.f.b.j.p(paramw, "receiver$0");
    boolean bool = av.aE(paramw);
    AppMethodBeat.o(122820);
    return bool;
  }

  public static final a.i.b.a.c.a.g aL(w paramw)
  {
    AppMethodBeat.i(122816);
    a.f.b.j.p(paramw, "receiver$0");
    paramw = paramw.ejw().dZD();
    a.f.b.j.o(paramw, "constructor.builtIns");
    AppMethodBeat.o(122816);
    return paramw;
  }

  public static final ap aM(w paramw)
  {
    AppMethodBeat.i(122824);
    a.f.b.j.p(paramw, "receiver$0");
    paramw = (ap)new a.i.b.a.c.l.ar(paramw);
    AppMethodBeat.o(122824);
    return paramw;
  }

  public static final w aN(w paramw)
  {
    AppMethodBeat.i(122825);
    a.f.b.j.p(paramw, "receiver$0");
    az localaz = paramw.ekn();
    ad localad;
    Object localObject1;
    if ((localaz instanceof q))
    {
      localad = ((q)localaz).BJx;
      paramw = localad;
      if (!localad.ejw().getParameters().isEmpty())
      {
        if (localad.ejw().dYs() == null)
          paramw = localad;
      }
      else
      {
        localad = ((q)localaz).BJy;
        if ((!localad.ejw().getParameters().isEmpty()) && (localad.ejw().dYs() != null))
          break label216;
      }
      while (true)
      {
        paramw = x.a(paramw, localad);
        paramw = (w)ax.a(paramw, (w)localaz);
        AppMethodBeat.o(122825);
        return paramw;
        paramw = localad.ejw().getParameters();
        a.f.b.j.o(paramw, "constructor.parameters");
        localObject1 = (Iterable)paramw;
        paramw = (Collection)new ArrayList(a.a.j.d((Iterable)localObject1));
        localObject1 = ((Iterable)localObject1).iterator();
        while (((Iterator)localObject1).hasNext())
          paramw.add(new ah((a.i.b.a.c.b.ar)((Iterator)localObject1).next()));
        paramw = at.a(localad, (List)paramw);
        break;
        label216: localObject1 = localad.ejw().getParameters();
        a.f.b.j.o(localObject1, "constructor.parameters");
        Object localObject2 = (Iterable)localObject1;
        localObject1 = (Collection)new ArrayList(a.a.j.d((Iterable)localObject2));
        localObject2 = ((Iterable)localObject2).iterator();
        while (((Iterator)localObject2).hasNext())
          ((Collection)localObject1).add(new ah((a.i.b.a.c.b.ar)((Iterator)localObject2).next()));
        localad = at.a(localad, (List)localObject1);
      }
    }
    if ((localaz instanceof ad))
    {
      localad = (ad)localaz;
      paramw = localad;
      if (!localad.ejw().getParameters().isEmpty())
        if (localad.ejw().dYs() != null)
          break label365;
      for (paramw = localad; ; paramw = at.a(localad, (List)paramw))
      {
        paramw = (az)paramw;
        break;
        label365: paramw = localad.ejw().getParameters();
        a.f.b.j.o(paramw, "constructor.parameters");
        localObject1 = (Iterable)paramw;
        paramw = (Collection)new ArrayList(a.a.j.d((Iterable)localObject1));
        localObject1 = ((Iterable)localObject1).iterator();
        while (((Iterator)localObject1).hasNext())
          paramw.add(new ah((a.i.b.a.c.b.ar)((Iterator)localObject1).next()));
      }
    }
    paramw = new m();
    AppMethodBeat.o(122825);
    throw paramw;
  }

  public static final w az(w paramw)
  {
    AppMethodBeat.i(122817);
    a.f.b.j.p(paramw, "receiver$0");
    paramw = av.az(paramw);
    a.f.b.j.o(paramw, "TypeUtils.makeNullable(this)");
    AppMethodBeat.o(122817);
    return paramw;
  }

  public static final boolean c(w paramw1, w paramw2)
  {
    AppMethodBeat.i(122821);
    a.f.b.j.p(paramw1, "receiver$0");
    a.f.b.j.p(paramw2, "superType");
    boolean bool = c.BKs.c(paramw1, paramw2);
    AppMethodBeat.o(122821);
    return bool;
  }

  public static final boolean h(az paramaz)
  {
    AppMethodBeat.i(122826);
    a.f.b.j.p(paramaz, "receiver$0");
    boolean bool;
    if (((paramaz.ejw() instanceof k)) || ((paramaz.ejw().dYs() instanceof a.i.b.a.c.b.ar)) || ((paramaz instanceof e)))
    {
      bool = true;
      AppMethodBeat.o(122826);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(122826);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.l.c.a
 * JD-Core Version:    0.6.2
 */