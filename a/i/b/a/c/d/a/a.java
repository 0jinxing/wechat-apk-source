package a.i.b.a.c.d.a;

import a.a.v;
import a.i.b.a.c.k.d;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class a
{
  private final d<a.i.b.a.c.b.e, a.i.b.a.c.b.a.c> Bkd;
  public final boolean Bke;
  public final a.i.b.a.c.n.e Bkf;

  public a(a.i.b.a.c.k.i parami, a.i.b.a.c.n.e parame)
  {
    AppMethodBeat.i(119655);
    this.Bkf = parame;
    this.Bkd = parami.g((a.f.a.b)new a.c((a)this));
    this.Bke = this.Bkf.ekx();
    AppMethodBeat.o(119655);
  }

  private final List<a.a> a(a.i.b.a.c.i.b.f<?> paramf)
  {
    AppMethodBeat.i(119654);
    if ((paramf instanceof a.i.b.a.c.i.b.b))
    {
      Object localObject = (Iterable)((a.i.b.a.c.i.b.b)paramf).getValue();
      paramf = (Collection)new ArrayList();
      localObject = ((Iterable)localObject).iterator();
      while (((Iterator)localObject).hasNext())
        a.a.j.a(paramf, (Iterable)a((a.i.b.a.c.i.b.f)((Iterator)localObject).next()));
      paramf = (List)paramf;
      AppMethodBeat.o(119654);
    }
    while (true)
    {
      return paramf;
      if ((paramf instanceof a.i.b.a.c.i.b.i))
      {
        paramf = ((a.i.b.a.c.i.b.i)paramf).BES.ehN();
        switch (paramf.hashCode())
        {
        default:
          label152: paramf = null;
        case 66889946:
        case -2024225567:
        case 107598562:
        case 446088073:
        }
        while (true)
        {
          paramf = a.a.j.dm(paramf);
          AppMethodBeat.o(119654);
          break;
          if (!paramf.equals("FIELD"))
            break label152;
          paramf = a.a.Bki;
          continue;
          if (!paramf.equals("METHOD"))
            break label152;
          paramf = a.a.Bkg;
          continue;
          if (!paramf.equals("TYPE_USE"))
            break label152;
          paramf = a.a.Bkj;
          continue;
          if (!paramf.equals("PARAMETER"))
            break label152;
          paramf = a.a.Bkh;
        }
      }
      paramf = (List)v.AUP;
      AppMethodBeat.o(119654);
    }
  }

  private final a.i.b.a.c.n.g q(a.i.b.a.c.b.e parame)
  {
    Object localObject1 = null;
    AppMethodBeat.i(119653);
    parame = parame.dYn().i(b.eaT());
    Object localObject2;
    if (parame != null)
    {
      parame = a.i.b.a.c.i.c.a.m(parame);
      localObject2 = parame;
      if (!(parame instanceof a.i.b.a.c.i.b.i))
        localObject2 = null;
      localObject2 = (a.i.b.a.c.i.b.i)localObject2;
      if (localObject2 != null)
        break label65;
      AppMethodBeat.o(119653);
      parame = localObject1;
    }
    while (true)
    {
      return parame;
      parame = null;
      break;
      label65: parame = this.Bkf.BNa;
      if (parame != null)
      {
        AppMethodBeat.o(119653);
      }
      else
      {
        parame = ((a.i.b.a.c.i.b.i)localObject2).BES.name;
        switch (parame.hashCode())
        {
        default:
        case -1838656823:
        case -2137067054:
        case 2656902:
        }
        do
        {
          do
          {
            do
            {
              AppMethodBeat.o(119653);
              parame = localObject1;
              break;
            }
            while (!parame.equals("STRICT"));
            parame = a.i.b.a.c.n.g.BNl;
            AppMethodBeat.o(119653);
            break;
          }
          while (!parame.equals("IGNORE"));
          parame = a.i.b.a.c.n.g.BNj;
          AppMethodBeat.o(119653);
          break;
        }
        while (!parame.equals("WARN"));
        parame = a.i.b.a.c.n.g.BNk;
        AppMethodBeat.o(119653);
      }
    }
  }

  public final a.i.b.a.c.b.a.c d(a.i.b.a.c.b.a.c paramc)
  {
    AppMethodBeat.i(119649);
    a.f.b.j.p(paramc, "annotationDescriptor");
    if (this.Bkf.ekx())
    {
      AppMethodBeat.o(119649);
      paramc = null;
    }
    while (true)
    {
      return paramc;
      a.i.b.a.c.b.e locale = a.i.b.a.c.i.c.a.l(paramc);
      if (locale == null)
      {
        AppMethodBeat.o(119649);
        paramc = null;
      }
      else if (b.r(locale))
      {
        AppMethodBeat.o(119649);
      }
      else if (locale.dYc() != a.i.b.a.c.b.f.Bev)
      {
        AppMethodBeat.o(119649);
        paramc = null;
      }
      else
      {
        paramc = (a.i.b.a.c.b.a.c)this.Bkd.am(locale);
        AppMethodBeat.o(119649);
      }
    }
  }

  public final a.b e(a.i.b.a.c.b.a.c paramc)
  {
    Object localObject1 = null;
    AppMethodBeat.i(119650);
    a.f.b.j.p(paramc, "annotationDescriptor");
    if (this.Bkf.ekx())
    {
      AppMethodBeat.o(119650);
      paramc = localObject1;
    }
    while (true)
    {
      return paramc;
      Object localObject2 = a.i.b.a.c.i.c.a.l(paramc);
      if (localObject2 != null)
        if (!((a.i.b.a.c.b.e)localObject2).dYn().j(b.eaS()))
          break label75;
      while (true)
      {
        if (localObject2 != null)
          break label80;
        AppMethodBeat.o(119650);
        paramc = localObject1;
        break;
        label75: localObject2 = null;
      }
      label80: paramc = a.i.b.a.c.i.c.a.l(paramc);
      if (paramc == null)
        a.f.b.j.dWJ();
      paramc = paramc.dYn().i(b.eaS());
      if (paramc == null)
        a.f.b.j.dWJ();
      paramc = paramc.eah();
      Collection localCollection = (Collection)new ArrayList();
      Iterator localIterator = paramc.entrySet().iterator();
      if (localIterator.hasNext())
      {
        Object localObject3 = (Map.Entry)localIterator.next();
        paramc = (a.i.b.a.c.f.f)((Map.Entry)localObject3).getKey();
        localObject3 = (a.i.b.a.c.i.b.f)((Map.Entry)localObject3).getValue();
        if (a.f.b.j.j(paramc, p.Bln));
        for (paramc = a((a.i.b.a.c.i.b.f)localObject3); ; paramc = (List)v.AUP)
        {
          a.a.j.a(localCollection, (Iterable)paramc);
          break;
        }
      }
      paramc = ((Iterable)localCollection).iterator();
      for (int i = 0; paramc.hasNext(); i = 1 << ((a.a)paramc.next()).ordinal() | i);
      localObject2 = ((Iterable)((a.i.b.a.c.b.e)localObject2).dYn()).iterator();
      label294: int j;
      if (((Iterator)localObject2).hasNext())
      {
        paramc = ((Iterator)localObject2).next();
        if (d((a.i.b.a.c.b.a.c)paramc) != null)
        {
          j = 1;
          label324: if (j == 0)
            break label353;
        }
      }
      while (true)
      {
        paramc = (a.i.b.a.c.b.a.c)paramc;
        if (paramc != null)
          break label360;
        AppMethodBeat.o(119650);
        paramc = localObject1;
        break;
        j = 0;
        break label324;
        label353: break label294;
        paramc = null;
      }
      label360: paramc = new a.b(paramc, i);
      AppMethodBeat.o(119650);
    }
  }

  public final a.i.b.a.c.n.g f(a.i.b.a.c.b.a.c paramc)
  {
    AppMethodBeat.i(119651);
    a.f.b.j.p(paramc, "annotationDescriptor");
    paramc = g(paramc);
    if (paramc != null)
      AppMethodBeat.o(119651);
    while (true)
    {
      return paramc;
      paramc = this.Bkf.BMZ;
      AppMethodBeat.o(119651);
    }
  }

  public final a.i.b.a.c.n.g g(a.i.b.a.c.b.a.c paramc)
  {
    AppMethodBeat.i(119652);
    a.f.b.j.p(paramc, "annotationDescriptor");
    Map localMap = this.Bkf.BNb;
    Object localObject = paramc.dZF();
    if (localObject != null)
    {
      localObject = ((a.i.b.a.c.f.b)localObject).ByQ.ByV;
      localObject = (a.i.b.a.c.n.g)localMap.get(localObject);
      if (localObject == null)
        break label69;
      AppMethodBeat.o(119652);
      paramc = (a.i.b.a.c.b.a.c)localObject;
    }
    while (true)
    {
      return paramc;
      localObject = null;
      break;
      label69: paramc = a.i.b.a.c.i.c.a.l(paramc);
      if (paramc != null)
      {
        paramc = q(paramc);
        AppMethodBeat.o(119652);
      }
      else
      {
        AppMethodBeat.o(119652);
        paramc = null;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.d.a.a
 * JD-Core Version:    0.6.2
 */