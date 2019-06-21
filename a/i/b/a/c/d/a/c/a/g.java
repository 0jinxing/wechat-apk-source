package a.i.b.a.c.d.a.c.a;

import a.a.v;
import a.f.a.b<-La.i.b.a.c.f.f;+Ljava.util.Collection<+La.i.b.a.c.b.al;>;>;
import a.i.b.a.c.b.a.g.a;
import a.i.b.a.c.b.ah;
import a.i.b.a.c.b.ak;
import a.i.b.a.c.b.al;
import a.i.b.a.c.b.am;
import a.i.b.a.c.b.ar;
import a.i.b.a.c.b.au;
import a.i.b.a.c.b.az;
import a.i.b.a.c.b.c.ad;
import a.i.b.a.c.b.c.p;
import a.i.b.a.c.b.c.y;
import a.i.b.a.c.b.t.a;
import a.i.b.a.c.d.a.e.n;
import a.i.b.a.c.d.a.e.q;
import a.i.b.a.c.d.a.e.x;
import a.i.b.a.c.d.a.m.a;
import a.i.b.a.c.d.a.o;
import a.i.b.a.c.d.a.s;
import a.i.b.a.c.d.b.r;
import a.i.b.a.c.i.j.a;
import a.i.b.a.c.i.j.a.a;
import a.i.b.a.c.l.an;
import a.i.b.a.c.l.ap;
import a.i.b.a.c.l.av;
import a.i.b.a.c.n.i.b;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class g extends k
{
  private final a.i.b.a.c.d.a.e.g BnJ;
  final a.i.b.a.c.k.f<List<a.i.b.a.c.b.d>> Bog;
  private final a.i.b.a.c.k.f<Set<a.i.b.a.c.f.f>> Boh;
  private final a.i.b.a.c.k.f<Map<a.i.b.a.c.f.f, n>> Boi;
  private final a.i.b.a.c.k.d<a.i.b.a.c.f.f, a.i.b.a.c.b.c.g> Boj;
  final a.i.b.a.c.b.e Bok;

  public g(a.i.b.a.c.d.a.c.h paramh, a.i.b.a.c.b.e parame, a.i.b.a.c.d.a.e.g paramg)
  {
    super(paramh);
    AppMethodBeat.i(119952);
    this.Bok = parame;
    this.BnJ = paramg;
    this.Bog = paramh.Bnv.Baf.i((a.f.a.a)new g.f(this, paramh));
    this.Boh = paramh.Bnv.Baf.i((a.f.a.a)new g.i(this));
    this.Boi = paramh.Bnv.Baf.i((a.f.a.a)new g.g(this));
    this.Boj = paramh.Bnv.Baf.g((a.f.a.b)new g.j(this, paramh));
    AppMethodBeat.o(119952);
  }

  private final al a(ah paramah, a.f.a.b<? super a.i.b.a.c.f.f, ? extends Collection<? extends al>> paramb)
  {
    AppMethodBeat.i(119927);
    Object localObject1 = paramah.dZI();
    Object localObject2;
    if (localObject1 != null)
    {
      localObject1 = (a.i.b.a.c.b.ai)a.i.b.a.c.d.a.t.n((a.i.b.a.c.b.b)localObject1);
      if (localObject1 == null)
        break label84;
      localObject2 = a.i.b.a.c.d.a.e.BkZ;
      localObject2 = a.i.b.a.c.d.a.e.m((a.i.b.a.c.b.b)localObject1);
      label45: if ((localObject2 == null) || (a.i.b.a.c.d.a.t.a(this.Bok, (a.i.b.a.c.b.a)localObject1)))
        break label90;
      paramah = a(paramah, (String)localObject2, paramb);
      AppMethodBeat.o(119927);
    }
    while (true)
    {
      return paramah;
      localObject1 = null;
      break;
      label84: localObject2 = null;
      break label45;
      label90: localObject1 = o.avJ(paramah.dZg().name);
      a.f.b.j.o(localObject1, "JvmAbi.getterName(name.asString())");
      paramah = a(paramah, (String)localObject1, paramb);
      AppMethodBeat.o(119927);
    }
  }

  private static al a(ah paramah, String paramString, a.f.a.b<? super a.i.b.a.c.f.f, ? extends Collection<? extends al>> paramb)
  {
    AppMethodBeat.i(119928);
    paramString = a.i.b.a.c.f.f.avX(paramString);
    a.f.b.j.o(paramString, "Name.identifier(getterName)");
    paramb = ((Iterable)paramb.am(paramString)).iterator();
    a.i.b.a.c.l.a.c localc;
    a.i.b.a.c.l.w localw;
    boolean bool;
    if (paramb.hasNext())
    {
      paramString = (al)paramb.next();
      if (paramString.dYV().size() == 0)
      {
        localc = a.i.b.a.c.l.a.c.BKs;
        localw = paramString.dYT();
        if (localw == null)
        {
          bool = false;
          label85: if (!bool)
            break label120;
          label90: if (paramString == null)
            break label123;
          AppMethodBeat.o(119928);
        }
      }
    }
    while (true)
    {
      return paramString;
      bool = localc.c(localw, paramah.dZS());
      break label85;
      label120: paramString = null;
      break label90;
      label123: break;
      AppMethodBeat.o(119928);
      paramString = null;
    }
  }

  private static al a(al paramal, a.f.a.b<? super a.i.b.a.c.f.f, ? extends Collection<? extends al>> paramb)
  {
    AppMethodBeat.i(119934);
    if (!paramal.dZv())
    {
      AppMethodBeat.o(119934);
      paramb = null;
    }
    while (true)
    {
      return paramb;
      Object localObject = paramal.dZg();
      a.f.b.j.o(localObject, "descriptor.name");
      localObject = ((Iterable)paramb.am(localObject)).iterator();
      label112: 
      while (true)
      {
        if (!((Iterator)localObject).hasNext())
          break label114;
        paramb = h((al)((Iterator)localObject).next());
        if (paramb != null)
          if (!b((a.i.b.a.c.b.a)paramb, (a.i.b.a.c.b.a)paramal));
        while (true)
        {
          if (paramb == null)
            break label112;
          AppMethodBeat.o(119934);
          break;
          paramb = null;
          continue;
          paramb = null;
        }
      }
      label114: AppMethodBeat.o(119934);
      paramb = null;
    }
  }

  private static al a(al paramal, a.i.b.a.c.b.a parama, Collection<? extends al> paramCollection)
  {
    AppMethodBeat.i(119935);
    paramCollection = (Iterable)paramCollection;
    int i;
    if ((!(paramCollection instanceof Collection)) || (!((Collection)paramCollection).isEmpty()))
    {
      paramCollection = paramCollection.iterator();
      if (paramCollection.hasNext())
      {
        al localal = (al)paramCollection.next();
        if (((a.f.b.j.j(paramal, localal) ^ true)) && (localal.dZq() == null) && (b((a.i.b.a.c.b.a)localal, parama)))
        {
          i = 1;
          label88: if (i == 0)
            break label112;
          i = 0;
          label96: if (i == 0)
            break label120;
          AppMethodBeat.o(119935);
        }
      }
    }
    while (true)
    {
      return paramal;
      i = 0;
      break label88;
      label112: break;
      i = 1;
      break label96;
      label120: paramal = paramal.dZw().dZA().dZC();
      if (paramal == null)
        a.f.b.j.dWJ();
      paramal = (al)paramal;
      AppMethodBeat.o(119935);
    }
  }

  private static al a(al paramal, a.i.b.a.c.f.f paramf)
  {
    AppMethodBeat.i(119924);
    paramal = paramal.dZw();
    paramal.e(paramf);
    paramal.dZx();
    paramal.dZy();
    paramal = paramal.dZC();
    if (paramal == null)
      a.f.b.j.dWJ();
    paramal = (al)paramal;
    AppMethodBeat.o(119924);
    return paramal;
  }

  private final void a(a.i.b.a.c.f.f paramf, Collection<? extends al> paramCollection1, Collection<? extends al> paramCollection2, Collection<al> paramCollection, a.f.a.b<? super a.i.b.a.c.f.f, ? extends Collection<? extends al>> paramb)
  {
    AppMethodBeat.i(119933);
    Iterator localIterator1 = paramCollection2.iterator();
    if (localIterator1.hasNext())
    {
      al localal = (al)localIterator1.next();
      paramCollection2 = (al)a.i.b.a.c.d.a.t.n((a.i.b.a.c.b.b)localal);
      label51: label52: label54: Object localObject1;
      if (paramCollection2 == null)
      {
        break label149;
        paramCollection2 = null;
        a.i.b.a.c.n.a.b(paramCollection, paramCollection2);
        localObject1 = a.i.b.a.c.d.a.d.e((a.i.b.a.c.b.t)localal);
        if (localObject1 != null)
          break label201;
        paramCollection2 = null;
      }
      while (true)
      {
        a.i.b.a.c.n.a.b(paramCollection, paramCollection2);
        a.i.b.a.c.n.a.b(paramCollection, a(localal, paramb));
        break;
        localObject1 = a.i.b.a.c.d.a.t.q((a.i.b.a.c.b.b)paramCollection2);
        if (localObject1 == null)
          a.f.b.j.dWJ();
        localObject1 = a.i.b.a.c.f.f.avX((String)localObject1);
        a.f.b.j.o(localObject1, "Name.identifier(nameInJava)");
        localObject1 = ((Collection)paramb.am(localObject1)).iterator();
        label149: if (!((Iterator)localObject1).hasNext())
          break label52;
        Object localObject2 = a((al)((Iterator)localObject1).next(), paramf);
        if (!a(paramCollection2, (a.i.b.a.c.b.t)localObject2))
          break label51;
        paramCollection2 = a((al)localObject2, (a.i.b.a.c.b.a)paramCollection2, paramCollection1);
        break label54;
        label201: paramCollection2 = ((a.i.b.a.c.b.t)localObject1).dZg();
        a.f.b.j.o(paramCollection2, "overridden.name");
        localObject2 = ((Iterable)paramb.am(paramCollection2)).iterator();
        do
        {
          if (!((Iterator)localObject2).hasNext())
            break;
          paramCollection2 = ((Iterator)localObject2).next();
        }
        while (!b((al)paramCollection2, (a.i.b.a.c.b.t)localObject1));
        while (true)
        {
          localObject2 = (al)paramCollection2;
          if (localObject2 == null)
            break label518;
          paramCollection2 = ((al)localObject2).dZw();
          localObject3 = ((a.i.b.a.c.b.t)localObject1).dYV();
          a.f.b.j.o(localObject3, "overridden.valueParameters");
          Object localObject4 = (Iterable)localObject3;
          localObject3 = (Collection)new ArrayList(a.a.j.d((Iterable)localObject4));
          Iterator localIterator2 = ((Iterable)localObject4).iterator();
          while (localIterator2.hasNext())
          {
            au localau = (au)localIterator2.next();
            a.f.b.j.o(localau, "it");
            localObject4 = localau.dZS();
            a.f.b.j.o(localObject4, "it.type");
            ((Collection)localObject3).add(new a.i.b.a.c.d.a.b.j((a.i.b.a.c.l.w)localObject4, localau.dZU()));
          }
          paramCollection2 = null;
        }
        Object localObject3 = (Collection)localObject3;
        localObject2 = ((al)localObject2).dYV();
        a.f.b.j.o(localObject2, "override.valueParameters");
        paramCollection2.fR(a.i.b.a.c.d.a.b.i.a((Collection)localObject3, (Collection)localObject2, (a.i.b.a.c.b.a)localObject1));
        paramCollection2.dZx();
        paramCollection2.dZy();
        paramCollection2 = (al)paramCollection2.dZC();
        label485: if (paramCollection2 != null)
        {
          if (((g)this).d(paramCollection2));
          while (true)
          {
            if (paramCollection2 == null)
              break label528;
            paramCollection2 = a(paramCollection2, (a.i.b.a.c.b.a)localObject1, paramCollection1);
            break;
            paramCollection2 = null;
            break label485;
            paramCollection2 = null;
          }
        }
        label518: label528: paramCollection2 = null;
      }
    }
    AppMethodBeat.o(119933);
  }

  private final void a(Collection<al> paramCollection, Collection<? extends al> paramCollection1, boolean paramBoolean)
  {
    AppMethodBeat.i(119932);
    paramCollection1 = a.i.b.a.c.d.a.a.a.a(paramCollection1, paramCollection, this.Bok, this.Bnn.Bnv.BmV);
    a.f.b.j.o(paramCollection1, "resolveOverridesForNonSt…s.errorReporter\n        )");
    if (!paramBoolean)
    {
      paramCollection.addAll(paramCollection1);
      AppMethodBeat.o(119932);
    }
    while (true)
    {
      return;
      List localList = a.a.j.b(paramCollection, (Iterable)paramCollection1);
      paramCollection1 = (Iterable)paramCollection1;
      Collection localCollection = (Collection)new ArrayList(a.a.j.d(paramCollection1));
      Iterator localIterator = paramCollection1.iterator();
      if (localIterator.hasNext())
      {
        paramCollection1 = (al)localIterator.next();
        al localal = (al)a.i.b.a.c.d.a.t.p((a.i.b.a.c.b.b)paramCollection1);
        if (localal == null);
        while (true)
        {
          localCollection.add(paramCollection1);
          break;
          a.f.b.j.o(paramCollection1, "resolvedOverride");
          paramCollection1 = a(paramCollection1, (a.i.b.a.c.b.a)localal, (Collection)localList);
        }
      }
      paramCollection.addAll((Collection)localCollection);
      AppMethodBeat.o(119932);
    }
  }

  private final void a(List<au> paramList, a.i.b.a.c.b.k paramk, int paramInt, q paramq, a.i.b.a.c.l.w paramw1, a.i.b.a.c.l.w paramw2)
  {
    AppMethodBeat.i(119943);
    a.i.b.a.c.b.a locala = (a.i.b.a.c.b.a)paramk;
    paramk = a.i.b.a.c.b.a.g.BfJ;
    a.i.b.a.c.b.a.g localg = g.a.eai();
    a.i.b.a.c.f.f localf = paramq.dZg();
    paramw1 = av.aA(paramw1);
    a.f.b.j.o(paramw1, "TypeUtils.makeNotNullable(returnType)");
    boolean bool = paramq.ebW();
    if (paramw2 != null);
    for (paramk = av.aA(paramw2); ; paramk = null)
    {
      paramList.add(new a.i.b.a.c.b.c.ai(locala, null, paramInt, localg, localf, paramw1, bool, false, false, paramk, (am)this.Bnn.Bnv.BmZ.a((a.i.b.a.c.d.a.e.l)paramq)));
      AppMethodBeat.o(119943);
      return;
    }
  }

  private final void a(Set<? extends ah> paramSet, Collection<ah> paramCollection, a.f.a.b<? super a.i.b.a.c.f.f, ? extends Collection<? extends al>> paramb)
  {
    AppMethodBeat.i(119938);
    paramSet = paramSet.iterator();
    while (paramSet.hasNext())
    {
      a.i.b.a.c.d.a.b.f localf = d((ah)paramSet.next(), paramb);
      if (localf != null)
      {
        paramCollection.add(localf);
        AppMethodBeat.o(119938);
      }
    }
    while (true)
    {
      return;
      AppMethodBeat.o(119938);
    }
  }

  private static boolean a(al paramal, a.i.b.a.c.b.t paramt)
  {
    AppMethodBeat.i(119925);
    a.i.b.a.c.d.a.c localc = a.i.b.a.c.d.a.c.Bky;
    if (a.i.b.a.c.d.a.c.c(paramal))
      paramt = paramt.dZp();
    while (true)
    {
      a.f.b.j.o(paramt, "if (superDescriptor.isRe…iginal else subDescriptor");
      boolean bool = b((a.i.b.a.c.b.a)paramt, (a.i.b.a.c.b.a)paramal);
      AppMethodBeat.o(119925);
      return bool;
    }
  }

  private static al b(ah paramah, a.f.a.b<? super a.i.b.a.c.f.f, ? extends Collection<? extends al>> paramb)
  {
    AppMethodBeat.i(119929);
    Object localObject1 = a.i.b.a.c.f.f.avX(o.avK(paramah.dZg().name));
    a.f.b.j.o(localObject1, "Name.identifier(JvmAbi.s…terName(name.asString()))");
    localObject1 = ((Iterable)paramb.am(localObject1)).iterator();
    Object localObject2;
    if (((Iterator)localObject1).hasNext())
    {
      paramb = (al)((Iterator)localObject1).next();
      if (paramb.dYV().size() == 1)
      {
        localObject2 = paramb.dYT();
        if (localObject2 != null);
      }
      else
      {
        label90: paramb = null;
        label92: if (paramb == null)
          break label172;
        AppMethodBeat.o(119929);
      }
    }
    while (true)
    {
      return paramb;
      if (!a.i.b.a.c.a.g.D((a.i.b.a.c.l.w)localObject2))
        break label90;
      localObject2 = a.i.b.a.c.l.a.c.BKs;
      Object localObject3 = paramb.dYV();
      a.f.b.j.o(localObject3, "descriptor.valueParameters");
      localObject3 = a.a.j.fN((List)localObject3);
      a.f.b.j.o(localObject3, "descriptor.valueParameters.single()");
      if (!((a.i.b.a.c.l.a.c)localObject2).d(((au)localObject3).dZS(), paramah.dZS()))
        break label90;
      break label92;
      label172: break;
      AppMethodBeat.o(119929);
      paramb = null;
    }
  }

  private static boolean b(a.i.b.a.c.b.a parama1, a.i.b.a.c.b.a parama2)
  {
    boolean bool = true;
    AppMethodBeat.i(119926);
    Object localObject = a.i.b.a.c.i.j.BEm.a(parama2, parama1, true);
    a.f.b.j.o(localObject, "OverridingUtil.DEFAULT.i…erDescriptor, this, true)");
    localObject = ((j.a)localObject).BEy;
    a.f.b.j.o(localObject, "OverridingUtil.DEFAULT.i…iptor, this, true).result");
    if (localObject == j.a.a.BEA)
    {
      localObject = a.i.b.a.c.d.a.m.Blf;
      if (!m.a.a(parama2, parama1))
        AppMethodBeat.o(119926);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(119926);
    }
  }

  private static boolean b(al paramal, a.i.b.a.c.b.t paramt)
  {
    AppMethodBeat.i(119942);
    String str = r.a((a.i.b.a.c.b.t)paramal, false, false, 2);
    a.i.b.a.c.b.t localt = paramt.dZp();
    a.f.b.j.o(localt, "builtinWithErasedParameters.original");
    boolean bool;
    if ((a.f.b.j.j(str, r.a(localt, false, false, 2))) && (!b((a.i.b.a.c.b.a)paramal, (a.i.b.a.c.b.a)paramt)))
    {
      bool = true;
      AppMethodBeat.o(119942);
    }
    while (true)
    {
      return bool;
      AppMethodBeat.o(119942);
      bool = false;
    }
  }

  private final boolean c(ah paramah, a.f.a.b<? super a.i.b.a.c.f.f, ? extends Collection<? extends al>> paramb)
  {
    boolean bool = false;
    AppMethodBeat.i(119930);
    if (c.e(paramah))
      AppMethodBeat.o(119930);
    while (true)
    {
      return bool;
      al localal = a(paramah, paramb);
      paramb = b(paramah, paramb);
      if (localal == null)
      {
        AppMethodBeat.o(119930);
      }
      else if (!paramah.dZZ())
      {
        AppMethodBeat.o(119930);
        bool = true;
      }
      else if ((paramb != null) && (paramb.dYd() == localal.dYd()))
      {
        AppMethodBeat.o(119930);
        bool = true;
      }
      else
      {
        AppMethodBeat.o(119930);
      }
    }
  }

  private final a.i.b.a.c.d.a.b.f d(ah paramah, a.f.a.b<? super a.i.b.a.c.f.f, ? extends Collection<? extends al>> paramb)
  {
    boolean bool = true;
    Object localObject1 = null;
    AppMethodBeat.i(119939);
    if (!c(paramah, paramb))
    {
      AppMethodBeat.o(119939);
      paramah = (ah)localObject1;
      return paramah;
    }
    al localal = a(paramah, paramb);
    if (localal == null)
      a.f.b.j.dWJ();
    int i;
    if (paramah.dZZ())
    {
      localObject1 = b(paramah, paramb);
      paramb = (a.f.a.b<? super a.i.b.a.c.f.f, ? extends Collection<? extends al>>)localObject1;
      if (localObject1 == null)
      {
        a.f.b.j.dWJ();
        paramb = (a.f.a.b<? super a.i.b.a.c.f.f, ? extends Collection<? extends al>>)localObject1;
      }
      if (paramb == null)
        break label212;
      if (paramb.dYd() != localal.dYd())
        break label206;
      i = 1;
      label100: if ((!a.aa.AUz) || (i != 0))
        break label223;
      localObject1 = new StringBuilder("Different accessors modalities when creating overrides for ").append(paramah).append(" in ").append(this.Bok).append("for getter is ").append(localal.dYd()).append(", but for setter is ");
      if (paramb == null)
        break label218;
    }
    label206: label212: label218: for (paramah = paramb.dYd(); ; paramah = null)
    {
      paramah = (Throwable)new AssertionError(paramah);
      AppMethodBeat.o(119939);
      throw paramah;
      paramb = null;
      break;
      i = 0;
      break label100;
      i = 1;
      break label100;
    }
    label223: localObject1 = (a.i.b.a.c.b.l)this.Bok;
    Object localObject2 = a.i.b.a.c.b.a.g.BfJ;
    a.i.b.a.c.b.a.g localg = g.a.eai();
    localObject2 = localal.dYd();
    az localaz = localal.dYf();
    if (paramb != null);
    while (true)
    {
      localObject1 = a.i.b.a.c.d.a.b.f.a((a.i.b.a.c.b.l)localObject1, localg, (a.i.b.a.c.b.w)localObject2, localaz, bool, paramah.dZg(), localal.dYo(), false);
      a.f.b.j.o(localObject1, "JavaPropertyDescriptor.c…inal = */ false\n        )");
      paramah = localal.dYT();
      if (paramah == null)
        a.f.b.j.dWJ();
      ((a.i.b.a.c.d.a.b.f)localObject1).a(paramah, (List)v.AUP, dYR(), null);
      localObject2 = a.i.b.a.c.i.c.a((ah)localObject1, localal.dYn(), false, localal.dYo());
      ((y)localObject2).Big = ((a.i.b.a.c.b.t)localal);
      ((a.i.b.a.c.b.c.aa)localObject2).K(((a.i.b.a.c.d.a.b.f)localObject1).dZS());
      a.f.b.j.o(localObject2, "DescriptorFactory.create…escriptor.type)\n        }");
      if (paramb == null)
        break label514;
      paramah = paramb.dYV();
      a.f.b.j.o(paramah, "setterMethod.valueParameters");
      paramah = (au)a.a.j.fK(paramah);
      if (paramah != null)
        break;
      paramah = (Throwable)new AssertionError("No parameter found for ".concat(String.valueOf(paramb)));
      AppMethodBeat.o(119939);
      throw paramah;
      bool = false;
    }
    paramah = a.i.b.a.c.i.c.a((ah)localObject1, paramb.dYn(), paramah.dYn(), false, paramb.dYf(), paramb.dYo());
    paramah.Big = ((a.i.b.a.c.b.t)paramb);
    while (true)
    {
      ((a.i.b.a.c.d.a.b.f)localObject1).a((a.i.b.a.c.b.c.aa)localObject2, (a.i.b.a.c.b.aj)paramah);
      AppMethodBeat.o(119939);
      paramah = (ah)localObject1;
      break;
      label514: paramah = null;
    }
  }

  private final boolean d(al paramal)
  {
    AppMethodBeat.i(119919);
    Object localObject1 = paramal.dZg();
    a.f.b.j.o(localObject1, "function.name");
    localObject1 = (Iterable)s.j((a.i.b.a.c.f.f)localObject1);
    label106: int i;
    label175: label183: label191: boolean bool;
    if ((!(localObject1 instanceof Collection)) || (!((Collection)localObject1).isEmpty()))
    {
      localObject1 = ((Iterable)localObject1).iterator();
      if (((Iterator)localObject1).hasNext())
      {
        Object localObject2 = (Iterable)n((a.i.b.a.c.f.f)((Iterator)localObject1).next());
        if ((!(localObject2 instanceof Collection)) || (!((Collection)localObject2).isEmpty()))
        {
          localObject2 = ((Iterable)localObject2).iterator();
          if (((Iterator)localObject2).hasNext())
          {
            ah localah = (ah)((Iterator)localObject2).next();
            if ((c(localah, (a.f.a.b)new g.h(this, paramal))) && ((localah.dZZ()) || (!o.avI(paramal.dZg().name))))
            {
              i = 1;
              if (i == 0)
                break label212;
              i = 1;
              if (i == 0)
                break label218;
              i = 1;
              if (i == 0)
                break label226;
              AppMethodBeat.o(119919);
              bool = false;
            }
          }
        }
      }
    }
    while (true)
    {
      return bool;
      i = 0;
      break label175;
      label212: break label106;
      i = 0;
      break label183;
      label218: break;
      i = 0;
      break label191;
      label226: if ((!f(paramal)) && (!e(paramal)) && (!g(paramal)))
      {
        AppMethodBeat.o(119919);
        bool = true;
      }
      else
      {
        AppMethodBeat.o(119919);
        bool = false;
      }
    }
  }

  private final boolean e(al paramal)
  {
    AppMethodBeat.i(119920);
    Object localObject1 = a.i.b.a.c.d.a.d.BkH;
    localObject1 = paramal.dZg();
    a.f.b.j.o(localObject1, "name");
    boolean bool;
    if (!a.i.b.a.c.d.a.d.h((a.i.b.a.c.f.f)localObject1))
    {
      AppMethodBeat.o(119920);
      bool = false;
    }
    while (true)
    {
      return bool;
      localObject1 = paramal.dZg();
      a.f.b.j.o(localObject1, "name");
      Object localObject2 = (Iterable)m((a.i.b.a.c.f.f)localObject1);
      localObject1 = (Collection)new ArrayList();
      localObject2 = ((Iterable)localObject2).iterator();
      while (((Iterator)localObject2).hasNext())
      {
        a.i.b.a.c.b.t localt = a.i.b.a.c.d.a.d.e((a.i.b.a.c.b.t)((Iterator)localObject2).next());
        if (localt != null)
          ((Collection)localObject1).add(localt);
      }
      localObject1 = (Iterable)localObject1;
      if (!((Collection)localObject1).isEmpty())
      {
        localObject1 = ((Iterable)localObject1).iterator();
        while (true)
          if (((Iterator)localObject1).hasNext())
            if (b(paramal, (a.i.b.a.c.b.t)((Iterator)localObject1).next()))
            {
              bool = true;
              AppMethodBeat.o(119920);
              break;
            }
      }
      AppMethodBeat.o(119920);
      bool = false;
    }
  }

  private final boolean f(al paramal)
  {
    AppMethodBeat.i(119921);
    Object localObject1 = a.i.b.a.c.d.a.c.Bky;
    localObject1 = paramal.dZg();
    a.f.b.j.o(localObject1, "name");
    localObject1 = (Iterable)a.i.b.a.c.d.a.c.g((a.i.b.a.c.f.f)localObject1);
    int i;
    if ((!(localObject1 instanceof Collection)) || (!((Collection)localObject1).isEmpty()))
    {
      localObject1 = ((Iterable)localObject1).iterator();
      if (((Iterator)localObject1).hasNext())
      {
        Object localObject2 = (a.i.b.a.c.f.f)((Iterator)localObject1).next();
        Object localObject3 = (Iterable)m((a.i.b.a.c.f.f)localObject2);
        Object localObject4 = (Collection)new ArrayList();
        localObject3 = ((Iterable)localObject3).iterator();
        while (((Iterator)localObject3).hasNext())
        {
          Object localObject5 = ((Iterator)localObject3).next();
          if (a.i.b.a.c.d.a.t.o((a.i.b.a.c.b.b)localObject5))
            ((Collection)localObject4).add(localObject5);
        }
        localObject4 = (List)localObject4;
        if (!((List)localObject4).isEmpty())
        {
          localObject2 = a(paramal, (a.i.b.a.c.f.f)localObject2);
          localObject4 = (Iterable)localObject4;
          if (!((Collection)localObject4).isEmpty())
          {
            localObject4 = ((Iterable)localObject4).iterator();
            while (((Iterator)localObject4).hasNext())
              if (a((al)((Iterator)localObject4).next(), (a.i.b.a.c.b.t)localObject2))
              {
                i = 1;
                label239: if (i == 0)
                  break label260;
                AppMethodBeat.o(119921);
              }
          }
        }
      }
    }
    for (boolean bool = true; ; bool = false)
    {
      return bool;
      i = 0;
      break label239;
      label260: break;
      AppMethodBeat.o(119921);
    }
  }

  private final boolean g(al paramal)
  {
    AppMethodBeat.i(119922);
    al localal1 = h(paramal);
    boolean bool;
    if (localal1 == null)
    {
      AppMethodBeat.o(119922);
      bool = false;
    }
    while (true)
    {
      return bool;
      paramal = paramal.dZg();
      a.f.b.j.o(paramal, "name");
      paramal = (Iterable)m(paramal);
      if (!((Collection)paramal).isEmpty())
      {
        paramal = paramal.iterator();
        label135: 
        while (true)
        {
          if (!paramal.hasNext())
            break label137;
          al localal2 = (al)paramal.next();
          if ((localal2.dZv()) && (b((a.i.b.a.c.b.a)localal1, (a.i.b.a.c.b.a)localal2)));
          for (int i = 1; ; i = 0)
          {
            if (i == 0)
              break label135;
            AppMethodBeat.o(119922);
            bool = true;
            break;
          }
        }
      }
      label137: AppMethodBeat.o(119922);
      bool = false;
    }
  }

  private static al h(al paramal)
  {
    AppMethodBeat.i(119923);
    Object localObject1 = paramal.dYV();
    a.f.b.j.o(localObject1, "valueParameters");
    Object localObject2 = (au)a.a.j.fM((List)localObject1);
    if (localObject2 != null)
    {
      localObject1 = ((au)localObject2).dZS().ejw().dYs();
      if (localObject1 == null)
        break label108;
      localObject1 = a.i.b.a.c.i.c.a.q((a.i.b.a.c.b.l)localObject1);
      if (localObject1 == null)
        break label108;
      if (((a.i.b.a.c.f.c)localObject1).ehH())
      {
        if (localObject1 == null)
          break label108;
        localObject1 = ((a.i.b.a.c.f.c)localObject1).ehI();
        label79: if (!a.i.b.a.c.a.k.a((a.i.b.a.c.f.b)localObject1, false))
          break label113;
        localObject1 = localObject2;
        label89: if (localObject1 != null)
          break label118;
      }
    }
    else
    {
      AppMethodBeat.o(119923);
      paramal = null;
    }
    while (true)
    {
      return paramal;
      localObject1 = null;
      break;
      label108: localObject1 = null;
      break label79;
      label113: localObject1 = null;
      break label89;
      label118: localObject2 = paramal.dZw();
      paramal = paramal.dYV();
      a.f.b.j.o(paramal, "valueParameters");
      paramal = (al)((t.a)localObject2).fR(a.a.j.fP(paramal)).I(((ap)((au)localObject1).dZS().ejt().get(0)).dZS()).dZC();
      localObject1 = (ad)paramal;
      if (localObject1 != null)
        ((p)localObject1).BhZ = true;
      AppMethodBeat.o(119923);
    }
  }

  private final Set<al> m(a.i.b.a.c.f.f paramf)
  {
    AppMethodBeat.i(119936);
    Object localObject1 = this.Bok.dXY();
    a.f.b.j.o(localObject1, "ownerDescriptor.typeConstructor");
    localObject1 = ((an)localObject1).eap();
    a.f.b.j.o(localObject1, "ownerDescriptor.typeConstructor.supertypes");
    Object localObject2 = (Iterable)localObject1;
    localObject1 = (Collection)new LinkedHashSet();
    localObject2 = ((Iterable)localObject2).iterator();
    while (((Iterator)localObject2).hasNext())
      a.a.j.a((Collection)localObject1, (Iterable)((a.i.b.a.c.l.w)((Iterator)localObject2).next()).dXR().b(paramf, (a.i.b.a.c.c.a.a)a.i.b.a.c.c.a.c.BjT));
    paramf = (Set)localObject1;
    AppMethodBeat.o(119936);
    return paramf;
  }

  private final Set<ah> n(a.i.b.a.c.f.f paramf)
  {
    AppMethodBeat.i(119940);
    Object localObject1 = this.Bok.dXY();
    a.f.b.j.o(localObject1, "ownerDescriptor.typeConstructor");
    localObject1 = ((an)localObject1).eap();
    a.f.b.j.o(localObject1, "ownerDescriptor.typeConstructor.supertypes");
    Object localObject2 = (Iterable)localObject1;
    localObject1 = (Collection)new ArrayList();
    Iterator localIterator = ((Iterable)localObject2).iterator();
    while (localIterator.hasNext())
    {
      Object localObject3 = (Iterable)((a.i.b.a.c.l.w)localIterator.next()).dXR().a(paramf, (a.i.b.a.c.c.a.a)a.i.b.a.c.c.a.c.BjT);
      localObject2 = (Collection)new ArrayList(a.a.j.d((Iterable)localObject3));
      localObject3 = ((Iterable)localObject3).iterator();
      while (((Iterator)localObject3).hasNext())
        ((Collection)localObject2).add((ah)((Iterator)localObject3).next());
      a.a.j.a((Collection)localObject1, (Iterable)localObject2);
    }
    paramf = a.a.j.o((Iterable)localObject1);
    AppMethodBeat.o(119940);
    return paramf;
  }

  protected final k.a a(q paramq, List<? extends ar> paramList, a.i.b.a.c.l.w paramw, List<? extends au> paramList1)
  {
    AppMethodBeat.i(119941);
    a.f.b.j.p(paramq, "method");
    a.f.b.j.p(paramList, "methodTypeParameters");
    a.f.b.j.p(paramw, "returnType");
    a.f.b.j.p(paramList1, "valueParameters");
    Object localObject = this.Bnn.Bnv.BmU.a(paramw, paramList1, paramList);
    a.f.b.j.o(localObject, "c.components.signaturePr…dTypeParameters\n        )");
    paramList = ((a.i.b.a.c.d.a.a.k.a)localObject).Bji;
    a.f.b.j.o(paramList, "propagated.returnType");
    paramq = ((a.i.b.a.c.d.a.a.k.a)localObject).Bms;
    paramList1 = ((a.i.b.a.c.d.a.a.k.a)localObject).Bmt;
    a.f.b.j.o(paramList1, "propagated.valueParameters");
    paramw = ((a.i.b.a.c.d.a.a.k.a)localObject).BeK;
    a.f.b.j.o(paramw, "propagated.typeParameters");
    boolean bool = ((a.i.b.a.c.d.a.a.k.a)localObject).Bia;
    localObject = ((a.i.b.a.c.d.a.a.k.a)localObject).Bmu;
    a.f.b.j.o(localObject, "propagated.errors");
    paramq = new k.a(paramList, paramq, paramList1, paramw, bool, (List)localObject);
    AppMethodBeat.o(119941);
    return paramq;
  }

  public final Collection<ah> a(a.i.b.a.c.f.f paramf, a.i.b.a.c.c.a.a parama)
  {
    AppMethodBeat.i(119947);
    a.f.b.j.p(paramf, "name");
    a.f.b.j.p(parama, "location");
    d(paramf, parama);
    paramf = super.a(paramf, parama);
    AppMethodBeat.o(119947);
    return paramf;
  }

  protected final Set<a.i.b.a.c.f.f> a(a.i.b.a.c.i.e.d paramd)
  {
    AppMethodBeat.i(119949);
    a.f.b.j.p(paramd, "kindFilter");
    if (this.BnJ.ebH())
    {
      paramd = eau();
      AppMethodBeat.o(119949);
    }
    while (true)
    {
      return paramd;
      paramd = new LinkedHashSet((Collection)((b)this.BoC.invoke()).ebo());
      Object localObject = this.Bok.dXY();
      a.f.b.j.o(localObject, "ownerDescriptor.typeConstructor");
      localObject = ((an)localObject).eap();
      a.f.b.j.o(localObject, "ownerDescriptor.typeConstructor.supertypes");
      localObject = ((Iterable)localObject).iterator();
      while (((Iterator)localObject).hasNext())
      {
        Iterable localIterable = (Iterable)((a.i.b.a.c.l.w)((Iterator)localObject).next()).dXR().eav();
        a.a.j.a((Collection)paramd, localIterable);
      }
      paramd = (Set)paramd;
      AppMethodBeat.o(119949);
    }
  }

  protected final void a(a.i.b.a.c.f.f paramf, Collection<ah> paramCollection)
  {
    AppMethodBeat.i(119937);
    a.f.b.j.p(paramf, "name");
    a.f.b.j.p(paramCollection, "result");
    Object localObject1;
    if (this.BnJ.ebH())
    {
      localObject1 = (q)a.a.j.i((Iterable)((b)this.BoC.invoke()).k(paramf));
      if (localObject1 != null);
    }
    else
    {
      paramf = n(paramf);
      if (!paramf.isEmpty())
        break label259;
      AppMethodBeat.o(119937);
    }
    while (true)
    {
      return;
      Object localObject2 = a.i.b.a.c.b.w.BeB;
      Object localObject3 = a.i.b.a.c.d.a.c.f.a(this.Bnn, (a.i.b.a.c.d.a.e.d)localObject1);
      localObject2 = a.i.b.a.c.d.a.b.f.a((a.i.b.a.c.b.l)this.Bok, (a.i.b.a.c.b.a.g)localObject3, (a.i.b.a.c.b.w)localObject2, ((q)localObject1).dYf(), false, ((q)localObject1).dZg(), (am)this.Bnn.Bnv.BmZ.a((a.i.b.a.c.d.a.e.l)localObject1), false);
      a.f.b.j.o(localObject2, "JavaPropertyDescriptor.c…inal = */ false\n        )");
      localObject3 = (ah)localObject2;
      g.a locala = a.i.b.a.c.b.a.g.BfJ;
      localObject3 = a.i.b.a.c.i.c.a((ah)localObject3, g.a.eai());
      a.f.b.j.o(localObject3, "DescriptorFactory.create…iptor, Annotations.EMPTY)");
      ((a.i.b.a.c.d.a.b.f)localObject2).a((a.i.b.a.c.b.c.aa)localObject3, null);
      localObject1 = a((q)localObject1, a.i.b.a.c.d.a.c.a.a(this.Bnn, (a.i.b.a.c.b.l)localObject2, (x)localObject1, 0));
      ((a.i.b.a.c.d.a.b.f)localObject2).a((a.i.b.a.c.l.w)localObject1, (List)v.AUP, dYR(), null);
      ((a.i.b.a.c.b.c.aa)localObject3).K((a.i.b.a.c.l.w)localObject1);
      paramCollection.add(localObject2);
      break;
      label259: localObject1 = a.i.b.a.c.n.i.BNv;
      localObject1 = i.b.ekD();
      a(paramf, paramCollection, (a.f.a.b)new d(this));
      a(paramf, (Collection)localObject1, (a.f.a.b)new g.e(this));
      paramf = a.i.b.a.c.d.a.a.a.a((Collection)a.a.aj.a(paramf, (Iterable)localObject1), paramCollection, this.Bok, this.Bnn.Bnv.BmV);
      a.f.b.j.o(paramf, "resolveOverridesForNonSt…rorReporter\n            )");
      paramCollection.addAll(paramf);
      AppMethodBeat.o(119937);
    }
  }

  protected final void a(Collection<al> paramCollection, a.i.b.a.c.f.f paramf)
  {
    AppMethodBeat.i(119931);
    a.f.b.j.p(paramCollection, "result");
    a.f.b.j.p(paramf, "name");
    Object localObject1 = m(paramf);
    Object localObject2 = a.i.b.a.c.d.a.c.Bky;
    if (!a.i.b.a.c.d.a.c.f(paramf))
    {
      localObject2 = a.i.b.a.c.d.a.d.BkH;
      if (!a.i.b.a.c.d.a.d.h(paramf))
      {
        localObject2 = (Iterable)localObject1;
        int i;
        if (!((Collection)localObject2).isEmpty())
        {
          localObject2 = ((Iterable)localObject2).iterator();
          while (((Iterator)localObject2).hasNext())
            if (((a.i.b.a.c.b.t)((Iterator)localObject2).next()).dZv())
              i = 0;
        }
        while (i != 0)
        {
          localObject1 = (Iterable)localObject1;
          paramf = (Collection)new ArrayList();
          localObject1 = ((Iterable)localObject1).iterator();
          while (true)
            if (((Iterator)localObject1).hasNext())
            {
              localObject2 = ((Iterator)localObject1).next();
              if (d((al)localObject2))
              {
                paramf.add(localObject2);
                continue;
                i = 1;
                break;
              }
            }
          a(paramCollection, (Collection)paramf, false);
          AppMethodBeat.o(119931);
        }
      }
    }
    while (true)
    {
      return;
      localObject2 = a.i.b.a.c.n.i.BNv;
      localObject2 = i.b.ekD();
      Object localObject3 = a.i.b.a.c.d.a.a.a.a((Collection)localObject1, (Collection)v.AUP, this.Bok, a.i.b.a.c.j.a.m.BHf);
      a.f.b.j.o(localObject3, "resolveOverridesForNonSt…rter.DO_NOTHING\n        )");
      a(paramf, paramCollection, (Collection)localObject3, paramCollection, (a.f.a.b)new g.b((g)this));
      a(paramf, paramCollection, (Collection)localObject3, (Collection)localObject2, (a.f.a.b)new g.c((g)this));
      localObject1 = (Iterable)localObject1;
      paramf = (Collection)new ArrayList();
      localObject1 = ((Iterable)localObject1).iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject3 = ((Iterator)localObject1).next();
        if (d((al)localObject3))
          paramf.add(localObject3);
      }
      a(paramCollection, (Collection)a.a.j.b((Collection)paramf, (Iterable)localObject2), true);
      AppMethodBeat.o(119931);
    }
  }

  protected final boolean a(a.i.b.a.c.d.a.b.e parame)
  {
    AppMethodBeat.i(119918);
    a.f.b.j.p(parame, "receiver$0");
    boolean bool;
    if (this.BnJ.ebH())
    {
      bool = false;
      AppMethodBeat.o(119918);
    }
    while (true)
    {
      return bool;
      bool = d((al)parame);
      AppMethodBeat.o(119918);
    }
  }

  public final Collection<al> b(a.i.b.a.c.f.f paramf, a.i.b.a.c.c.a.a parama)
  {
    AppMethodBeat.i(119946);
    a.f.b.j.p(paramf, "name");
    a.f.b.j.p(parama, "location");
    d(paramf, parama);
    paramf = super.b(paramf, parama);
    AppMethodBeat.o(119946);
    return paramf;
  }

  public final a.i.b.a.c.b.h c(a.i.b.a.c.f.f paramf, a.i.b.a.c.c.a.a parama)
  {
    AppMethodBeat.i(119945);
    a.f.b.j.p(paramf, "name");
    a.f.b.j.p(parama, "location");
    d(paramf, parama);
    paramf = (a.i.b.a.c.b.h)this.Boj.am(paramf);
    AppMethodBeat.o(119945);
    return paramf;
  }

  protected final Set<a.i.b.a.c.f.f> c(a.i.b.a.c.i.e.d paramd, a.f.a.b<? super a.i.b.a.c.f.f, Boolean> paramb)
  {
    AppMethodBeat.i(119948);
    a.f.b.j.p(paramd, "kindFilter");
    paramd = a.a.aj.a((Set)this.Boh.invoke(), (Iterable)((Map)this.Boi.invoke()).keySet());
    AppMethodBeat.o(119948);
    return paramd;
  }

  public final void d(a.i.b.a.c.f.f paramf, a.i.b.a.c.c.a.a parama)
  {
    AppMethodBeat.i(119950);
    a.f.b.j.p(paramf, "name");
    a.f.b.j.p(parama, "location");
    a.i.b.a.c.c.a.a(this.Bnn.Bnv.Bnc, parama, this.Bok, paramf);
    AppMethodBeat.o(119950);
  }

  protected final ak dYR()
  {
    AppMethodBeat.i(119944);
    ak localak = a.i.b.a.c.i.d.l((a.i.b.a.c.b.l)this.Bok);
    AppMethodBeat.o(119944);
    return localak;
  }

  public final String toString()
  {
    AppMethodBeat.i(119951);
    String str = "Lazy Java member scope for " + this.BnJ.dZF();
    AppMethodBeat.o(119951);
    return str;
  }

  static final class d extends a.f.b.k
    implements a.f.a.b<a.i.b.a.c.f.f, Collection<? extends al>>
  {
    d(g paramg)
    {
      super();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.d.a.c.a.g
 * JD-Core Version:    0.6.2
 */