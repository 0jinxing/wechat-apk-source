package a.i.b.a.c.h;

import a.aa;
import a.i.b.a.c.a.g.b;
import a.i.b.a.c.b.aa.b;
import a.i.b.a.c.b.ab;
import a.i.b.a.c.b.af;
import a.i.b.a.c.b.ak;
import a.i.b.a.c.b.am;
import a.i.b.a.c.b.aq;
import a.i.b.a.c.b.ar;
import a.i.b.a.c.b.as;
import a.i.b.a.c.b.au;
import a.i.b.a.c.b.aw;
import a.i.b.a.c.b.b.a;
import a.i.b.a.c.b.l;
import a.i.b.a.c.l.ag;
import a.i.b.a.c.l.an;
import a.i.b.a.c.l.ap;
import a.i.b.a.c.l.av;
import a.i.b.a.c.l.ba;
import a.i.b.a.c.l.bb;
import a.i.b.a.c.l.p.d;
import a.i.k;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class e extends c
  implements i
{
  private final a.f BCa;
  private final a.f BCb;
  final j BCc;

  static
  {
    AppMethodBeat.i(121758);
    eQB = new k[] { (k)a.f.b.v.a(new a.f.b.t(a.f.b.v.aN(e.class), "functionTypeAnnotationsRenderer", "getFunctionTypeAnnotationsRenderer()Lorg/jetbrains/kotlin/renderer/DescriptorRendererImpl;")), (k)a.f.b.v.a(new a.f.b.t(a.f.b.v.aN(e.class), "functionTypeParameterTypesRenderer", "getFunctionTypeParameterTypesRenderer()Lorg/jetbrains/kotlin/renderer/DescriptorRenderer;")) };
    AppMethodBeat.o(121758);
  }

  public e(j paramj)
  {
    AppMethodBeat.i(121817);
    this.BCc = paramj;
    boolean bool = this.BCc.aCf;
    if ((aa.AUz) && (!bool))
    {
      paramj = (Throwable)new AssertionError("Assertion failed");
      AppMethodBeat.o(121817);
      throw paramj;
    }
    this.BCa = a.g.g((a.f.a.a)new e.c(this));
    this.BCb = a.g.g((a.f.a.a)new e.d(this));
    AppMethodBeat.o(121817);
  }

  private static boolean W(a.i.b.a.c.l.w paramw)
  {
    AppMethodBeat.i(121774);
    int i;
    if (a.i.b.a.c.a.f.f(paramw))
    {
      paramw = (Iterable)paramw.ejt();
      if ((!(paramw instanceof Collection)) || (!((Collection)paramw).isEmpty()))
      {
        paramw = paramw.iterator();
        while (paramw.hasNext())
          if (((ap)paramw.next()).ekp())
          {
            i = 0;
            if (i == 0)
              break label92;
            AppMethodBeat.o(121774);
          }
      }
    }
    for (boolean bool = true; ; bool = false)
    {
      return bool;
      i = 1;
      break;
      label92: AppMethodBeat.o(121774);
    }
  }

  private static boolean X(a.i.b.a.c.l.w paramw)
  {
    AppMethodBeat.i(121785);
    boolean bool;
    if ((a.i.b.a.c.a.f.e(paramw)) || (!paramw.dYn().isEmpty()))
    {
      bool = true;
      AppMethodBeat.o(121785);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(121785);
    }
  }

  private String a(an paraman)
  {
    AppMethodBeat.i(121781);
    a.f.b.j.p(paraman, "typeConstructor");
    a.i.b.a.c.b.h localh = paraman.dYs();
    if (((localh instanceof ar)) || ((localh instanceof a.i.b.a.c.b.e)) || ((localh instanceof aq)))
    {
      paraman = b(localh);
      AppMethodBeat.o(121781);
    }
    while (true)
    {
      return paraman;
      if (localh != null)
        break;
      paraman = paraman.toString();
      AppMethodBeat.o(121781);
    }
    paraman = (Throwable)new IllegalStateException(("Unexpected classifier: " + localh.getClass()).toString());
    AppMethodBeat.o(121781);
    throw paraman;
  }

  private final void a(a.i.b.a.c.b.a parama, StringBuilder paramStringBuilder)
  {
    AppMethodBeat.i(121803);
    if (!((Boolean)this.BCc.BCW.b(j.eQB[25])).booleanValue())
      AppMethodBeat.o(121803);
    while (true)
    {
      return;
      ak localak = parama.dYQ();
      if (localak != null)
      {
        parama = paramStringBuilder.append(" on ");
        paramStringBuilder = localak.dZS();
        a.f.b.j.o(paramStringBuilder, "receiver.type");
        parama.append(b(paramStringBuilder));
      }
      AppMethodBeat.o(121803);
    }
  }

  private final void a(ar paramar, StringBuilder paramStringBuilder, boolean paramBoolean)
  {
    AppMethodBeat.i(121800);
    if (paramBoolean)
      paramStringBuilder.append(escape("<"));
    if (this.BCc.eiZ())
      paramStringBuilder.append("/*").append(paramar.getIndex()).append("*/ ");
    a(paramStringBuilder, paramar.dZi(), "reified");
    Object localObject = paramar.dZh().label;
    boolean bool;
    if (((CharSequence)localObject).length() > 0)
    {
      bool = true;
      a(paramStringBuilder, bool, (String)localObject);
      a(paramStringBuilder, (a.i.b.a.c.b.a.a)paramar, null);
      a((l)paramar, paramStringBuilder, paramBoolean);
      i = paramar.dWP().size();
      if (((i <= 1) || (paramBoolean)) && (i != 1))
        break label235;
      paramar = (a.i.b.a.c.l.w)paramar.dWP().iterator().next();
      if (!a.i.b.a.c.a.g.C(paramar))
      {
        localObject = paramStringBuilder.append(" : ");
        a.f.b.j.o(paramar, "upperBound");
        ((StringBuilder)localObject).append(b(paramar));
      }
    }
    label235: 
    while (!paramBoolean)
    {
      if (paramBoolean)
        paramStringBuilder.append(escape(">"));
      AppMethodBeat.o(121800);
      return;
      bool = false;
      break;
    }
    localObject = paramar.dWP().iterator();
    int i = 1;
    label255: if (((Iterator)localObject).hasNext())
    {
      paramar = (a.i.b.a.c.l.w)((Iterator)localObject).next();
      if (a.i.b.a.c.a.g.C(paramar))
        break label330;
      if (i == 0)
        break label319;
      paramStringBuilder.append(" : ");
      a.f.b.j.o(paramar, "upperBound");
      paramStringBuilder.append(b(paramar));
      i = 0;
    }
    label296: label319: label330: 
    while (true)
    {
      break label255;
      break;
      paramStringBuilder.append(" & ");
      break label296;
    }
  }

  private final void a(au paramau, boolean paramBoolean1, StringBuilder paramStringBuilder, boolean paramBoolean2)
  {
    AppMethodBeat.i(121807);
    if (paramBoolean2)
      paramStringBuilder.append(awe("value-parameter")).append(" ");
    if (this.BCc.eiZ())
      paramStringBuilder.append("/*").append(paramau.getIndex()).append("*/ ");
    a(paramStringBuilder, (a.i.b.a.c.b.a.a)paramau, null);
    a(paramStringBuilder, paramau.dZX(), "crossinline");
    a(paramStringBuilder, paramau.dZY(), "noinline");
    a((aw)paramau, paramBoolean1, paramStringBuilder, paramBoolean2);
    if (this.BCc.ejd() != null)
      if (this.BCc.eiS())
      {
        paramBoolean1 = paramau.dZU();
        if (!paramBoolean1)
          break label219;
      }
    label219: for (int i = 1; ; i = 0)
    {
      if (i != 0)
      {
        StringBuilder localStringBuilder = new StringBuilder(" = ");
        a.f.a.b localb = this.BCc.ejd();
        if (localb == null)
          a.f.b.j.dWJ();
        paramStringBuilder.append((String)localb.am(paramau));
      }
      AppMethodBeat.o(121807);
      return;
      paramBoolean1 = a.i.b.a.c.i.c.a.b(paramau);
      break;
    }
  }

  private final void a(aw paramaw, StringBuilder paramStringBuilder)
  {
    AppMethodBeat.i(121808);
    if (!(paramaw instanceof au))
      if (!paramaw.dZZ())
        break label49;
    label49: for (paramaw = "var"; ; paramaw = "val")
    {
      paramStringBuilder.append(awe(paramaw)).append(" ");
      AppMethodBeat.o(121808);
      return;
    }
  }

  private final void a(aw paramaw, boolean paramBoolean1, StringBuilder paramStringBuilder, boolean paramBoolean2)
  {
    AppMethodBeat.i(121809);
    a.i.b.a.c.l.w localw = paramaw.dZS();
    a.f.b.j.o(localw, "variable.type");
    if (!(paramaw instanceof au));
    for (Object localObject1 = null; ; localObject1 = paramaw)
    {
      localObject1 = (au)localObject1;
      if (localObject1 != null)
      {
        localObject1 = ((au)localObject1).dZV();
        if (localObject1 != null)
          break label198;
      }
      label198: for (Object localObject2 = localw; ; localObject2 = localObject1)
      {
        if (localObject1 != null);
        for (boolean bool = true; ; bool = false)
        {
          a(paramStringBuilder, bool, "vararg");
          if ((paramBoolean2) && (!this.BCc.eiX()))
            a(paramaw, paramStringBuilder);
          if (paramBoolean1)
          {
            a((l)paramaw, paramStringBuilder, paramBoolean2);
            paramStringBuilder.append(": ");
          }
          paramStringBuilder.append(b((a.i.b.a.c.l.w)localObject2));
          b(paramaw, paramStringBuilder);
          if ((this.BCc.eiZ()) && (localObject1 != null))
            paramStringBuilder.append(" /*").append(b(localw)).append("*/");
          AppMethodBeat.o(121809);
          return;
          localObject1 = null;
          break;
        }
      }
    }
  }

  private final void a(a.i.b.a.c.b.az paramaz, StringBuilder paramStringBuilder)
  {
    AppMethodBeat.i(121791);
    if (!this.BCc.eiW().contains(h.BCi))
      AppMethodBeat.o(121791);
    while (true)
    {
      return;
      a.i.b.a.c.b.az localaz = paramaz;
      if (((Boolean)this.BCc.BCJ.b(j.eQB[12])).booleanValue())
        localaz = paramaz.eag();
      if ((!((Boolean)this.BCc.BCK.b(j.eQB[13])).booleanValue()) && (a.f.b.j.j(localaz, a.i.b.a.c.b.ay.Bfh)))
      {
        AppMethodBeat.o(121791);
      }
      else
      {
        paramStringBuilder.append(awe(localaz.getDisplayName())).append(" ");
        AppMethodBeat.o(121791);
      }
    }
  }

  private final void a(a.i.b.a.c.b.b paramb, StringBuilder paramStringBuilder)
  {
    AppMethodBeat.i(121793);
    if ((!a.i.b.a.c.i.d.r((l)paramb)) || (paramb.dYd() != a.i.b.a.c.b.w.BeB))
      if ((this.BCc.ejf() == m.BDu) && (paramb.dYd() == a.i.b.a.c.b.w.BeD) && (t(paramb)))
        AppMethodBeat.o(121793);
    while (true)
    {
      return;
      paramb = paramb.dYd();
      a.f.b.j.o(paramb, "callable.modality");
      a(paramb, paramStringBuilder);
      AppMethodBeat.o(121793);
    }
  }

  private final void a(a.i.b.a.c.b.i parami, StringBuilder paramStringBuilder)
  {
    AppMethodBeat.i(121811);
    List localList = parami.dYq();
    a.f.b.j.o(localList, "classifier.declaredTypeParameters");
    Object localObject = parami.dXY();
    a.f.b.j.o(localObject, "classifier.typeConstructor");
    localObject = ((an)localObject).getParameters();
    a.f.b.j.o(localObject, "classifier.typeConstructor.parameters");
    if ((this.BCc.eiZ()) && (parami.dYh()) && (((List)localObject).size() > localList.size()))
    {
      paramStringBuilder.append(" /*captured type parameters: ");
      b(paramStringBuilder, ((List)localObject).subList(localList.size(), ((List)localObject).size()));
      paramStringBuilder.append("*/");
    }
    AppMethodBeat.o(121811);
  }

  private final void a(l paraml, StringBuilder paramStringBuilder, boolean paramBoolean)
  {
    AppMethodBeat.i(121766);
    paraml = paraml.dZg();
    a.f.b.j.o(paraml, "descriptor.name");
    paramStringBuilder.append(b(paraml, paramBoolean));
    AppMethodBeat.o(121766);
  }

  private final void a(a.i.b.a.c.b.t paramt, StringBuilder paramStringBuilder)
  {
    AppMethodBeat.i(121798);
    a(paramStringBuilder, paramt.dZv(), "suspend");
    AppMethodBeat.o(121798);
  }

  private final void a(a.i.b.a.c.b.v paramv, StringBuilder paramStringBuilder)
  {
    boolean bool1 = true;
    AppMethodBeat.i(121797);
    a(paramStringBuilder, paramv.dYm(), "external");
    if ((this.BCc.eiW().contains(h.BCq)) && (paramv.dYk()))
    {
      bool2 = true;
      a(paramStringBuilder, bool2, "expect");
      if ((!this.BCc.eiW().contains(h.BCr)) || (!paramv.dYl()))
        break label115;
    }
    label115: for (boolean bool2 = bool1; ; bool2 = false)
    {
      a(paramStringBuilder, bool2, "actual");
      AppMethodBeat.o(121797);
      return;
      bool2 = false;
      break;
    }
  }

  private final void a(a.i.b.a.c.b.w paramw, StringBuilder paramStringBuilder)
  {
    AppMethodBeat.i(121792);
    boolean bool = this.BCc.eiW().contains(h.BCj);
    paramw = paramw.name();
    if (paramw == null)
    {
      paramw = new a.v("null cannot be cast to non-null type java.lang.String");
      AppMethodBeat.o(121792);
      throw paramw;
    }
    paramw = paramw.toLowerCase();
    a.f.b.j.o(paramw, "(this as java.lang.String).toLowerCase()");
    a(paramStringBuilder, bool, paramw);
    AppMethodBeat.o(121792);
  }

  private final void a(a.i.b.a.c.f.b paramb, String paramString, StringBuilder paramStringBuilder)
  {
    AppMethodBeat.i(121812);
    paramStringBuilder.append(awe(paramString));
    paramb = paramb.ByQ;
    a.f.b.j.o(paramb, "fqName.toUnsafe()");
    paramb = f(paramb);
    if (((CharSequence)paramb).length() > 0);
    for (int i = 1; ; i = 0)
    {
      if (i != 0)
      {
        paramStringBuilder.append(" ");
        paramStringBuilder.append(paramb);
      }
      AppMethodBeat.o(121812);
      return;
    }
  }

  private final void a(StringBuilder paramStringBuilder, a.i.b.a.c.b.a.a parama, a.i.b.a.c.b.a.e parame)
  {
    AppMethodBeat.i(121786);
    if (!this.BCc.eiW().contains(h.BCl))
      AppMethodBeat.o(121786);
    while (true)
    {
      return;
      Set localSet;
      a.f.a.b localb;
      if ((parama instanceof a.i.b.a.c.l.w))
      {
        localSet = this.BCc.eiU();
        localb = (a.f.a.b)this.BCc.BDd.b(j.eQB[32]);
        parama = parama.dYn().iterator();
      }
      while (true)
      {
        if (!parama.hasNext())
          break label227;
        a.i.b.a.c.b.a.c localc = (a.i.b.a.c.b.a.c)parama.next();
        if ((!a.a.j.a((Iterable)localSet, localc.dZF())) && ((localb == null) || (((Boolean)localb.am(localc)).booleanValue())))
        {
          paramStringBuilder.append(a(localc, parame));
          if (((Boolean)this.BCc.BDa.b(j.eQB[29])).booleanValue())
          {
            a.k.m.i(paramStringBuilder);
            continue;
            localSet = (Set)this.BCc.BDb.b(j.eQB[30]);
            break;
          }
          paramStringBuilder.append(" ");
        }
      }
      label227: AppMethodBeat.o(121786);
    }
  }

  private final void a(StringBuilder paramStringBuilder, af paramaf)
  {
    AppMethodBeat.i(121780);
    Object localObject = paramaf.BeQ;
    if (localObject != null)
    {
      a(paramStringBuilder, (af)localObject);
      paramStringBuilder.append('.');
      localObject = paramaf.BeO.dZg();
      a.f.b.j.o(localObject, "possiblyInnerType.classifierDescriptor.name");
      if (paramStringBuilder.append(b((a.i.b.a.c.f.f)localObject, false)) != null);
    }
    else
    {
      localObject = paramaf.BeO.dXY();
      a.f.b.j.o(localObject, "possiblyInnerType.classi…escriptor.typeConstructor");
      paramStringBuilder.append(a((an)localObject));
    }
    paramStringBuilder.append(fY(paramaf.BeP));
    AppMethodBeat.o(121780);
  }

  private final void a(StringBuilder paramStringBuilder, a.i.b.a.c.l.a parama)
  {
    AppMethodBeat.i(121771);
    if (this.BCc.ejh() == p.BDH)
      paramStringBuilder.append("<font color=\"808080\"><i>");
    paramStringBuilder.append(" /* = ");
    c(paramStringBuilder, (a.i.b.a.c.l.w)parama.BpK);
    paramStringBuilder.append(" */");
    if (this.BCc.ejh() == p.BDH)
      paramStringBuilder.append("</i></font>");
    AppMethodBeat.o(121771);
  }

  private final void a(StringBuilder paramStringBuilder, a.i.b.a.c.l.ad paramad)
  {
    AppMethodBeat.i(121773);
    if ((a.f.b.j.j(paramad, av.BKd)) || (av.ay((a.i.b.a.c.l.w)paramad)))
    {
      paramStringBuilder.append("???");
      AppMethodBeat.o(121773);
    }
    while (true)
    {
      return;
      if (a.i.b.a.c.l.p.ah((a.i.b.a.c.l.w)paramad))
      {
        if (this.BCc.eja())
        {
          paramad = paramad.ejw();
          if (paramad == null)
          {
            paramStringBuilder = new a.v("null cannot be cast to non-null type org.jetbrains.kotlin.types.ErrorUtils.UninferredParameterTypeConstructor");
            AppMethodBeat.o(121773);
            throw paramStringBuilder;
          }
          paramad = ((p.d)paramad).BJv;
          a.f.b.j.o(paramad, "(type.constructor as Uni…).typeParameterDescriptor");
          paramad = paramad.dZg().toString();
          a.f.b.j.o(paramad, "(type.constructor as Uni…escriptor.name.toString()");
          paramStringBuilder.append(awf(paramad));
          AppMethodBeat.o(121773);
        }
        else
        {
          paramStringBuilder.append("???");
          AppMethodBeat.o(121773);
        }
      }
      else if (a.i.b.a.c.l.y.an((a.i.b.a.c.l.w)paramad))
      {
        d(paramStringBuilder, (a.i.b.a.c.l.w)paramad);
        AppMethodBeat.o(121773);
      }
      else if (W((a.i.b.a.c.l.w)paramad))
      {
        e(paramStringBuilder, (a.i.b.a.c.l.w)paramad);
        AppMethodBeat.o(121773);
      }
      else
      {
        d(paramStringBuilder, (a.i.b.a.c.l.w)paramad);
        AppMethodBeat.o(121773);
      }
    }
  }

  private final void a(StringBuilder paramStringBuilder, a.i.b.a.c.l.w paramw, an paraman)
  {
    AppMethodBeat.i(121778);
    a.f.b.j.p(paramw, "receiver$0");
    a.i.b.a.c.b.h localh = paramw.ejw().dYs();
    Object localObject = localh;
    if (!(localh instanceof a.i.b.a.c.b.i))
      localObject = null;
    localObject = as.a(paramw, (a.i.b.a.c.b.i)localObject, 0);
    if (localObject == null)
    {
      paramStringBuilder.append(a(paraman));
      paramStringBuilder.append(fY(paramw.ejt()));
      AppMethodBeat.o(121778);
    }
    while (true)
    {
      return;
      a(paramStringBuilder, (af)localObject);
      AppMethodBeat.o(121778);
    }
  }

  private final void a(StringBuilder paramStringBuilder, List<? extends ap> paramList)
  {
    AppMethodBeat.i(121783);
    a.a.j.a((Iterable)paramList, (Appendable)paramStringBuilder, (CharSequence)", ", null, null, 0, null, (a.f.a.b)new e.b(this), 60);
    AppMethodBeat.o(121783);
  }

  private final void a(StringBuilder paramStringBuilder, boolean paramBoolean, String paramString)
  {
    AppMethodBeat.i(121796);
    if (paramBoolean)
    {
      paramStringBuilder.append(awe(paramString));
      paramStringBuilder.append(" ");
    }
    AppMethodBeat.o(121796);
  }

  private final void a(Collection<? extends au> paramCollection, boolean paramBoolean, StringBuilder paramStringBuilder)
  {
    boolean bool1 = true;
    AppMethodBeat.i(121806);
    Object localObject = (n)this.BCc.BCV.b(j.eQB[24]);
    boolean bool2 = bool1;
    switch (g.BCf[localObject.ordinal()])
    {
    default:
      paramCollection = new a.m();
      AppMethodBeat.o(121806);
      throw paramCollection;
    case 2:
      if (!paramBoolean)
        bool2 = bool1;
      break;
    case 1:
    case 3:
    }
    while (true)
    {
      int i = paramCollection.size();
      this.BCc.ejg().e(paramStringBuilder);
      localObject = ((Iterable)paramCollection).iterator();
      for (int j = 0; ((Iterator)localObject).hasNext(); j++)
      {
        paramCollection = (au)((Iterator)localObject).next();
        this.BCc.ejg().a(paramCollection, paramStringBuilder);
        a(paramCollection, bool2, paramStringBuilder, false);
        this.BCc.ejg().a(paramCollection, j, i, paramStringBuilder);
      }
      bool2 = false;
      continue;
      bool2 = false;
    }
    this.BCc.ejg().f(paramStringBuilder);
    AppMethodBeat.o(121806);
  }

  private final void a(List<? extends ar> paramList, StringBuilder paramStringBuilder)
  {
    AppMethodBeat.i(121805);
    if (this.BCc.ejc())
      AppMethodBeat.o(121805);
    while (true)
    {
      return;
      ArrayList localArrayList = new ArrayList(0);
      paramList = paramList.iterator();
      while (paramList.hasNext())
      {
        ar localar = (ar)paramList.next();
        Object localObject1 = localar.dWP();
        a.f.b.j.o(localObject1, "typeParameter.upperBounds");
        localObject1 = ((Iterable)a.a.j.j((Iterable)localObject1)).iterator();
        while (((Iterator)localObject1).hasNext())
        {
          Object localObject2 = ((Iterator)localObject1).next();
          Collection localCollection = (Collection)localArrayList;
          localObject2 = (a.i.b.a.c.l.w)localObject2;
          StringBuilder localStringBuilder = new StringBuilder();
          Object localObject3 = localar.dZg();
          a.f.b.j.o(localObject3, "typeParameter.name");
          localObject3 = localStringBuilder.append(b((a.i.b.a.c.f.f)localObject3, false)).append(" : ");
          a.f.b.j.o(localObject2, "it");
          localCollection.add(b((a.i.b.a.c.l.w)localObject2));
        }
      }
      if (!localArrayList.isEmpty())
      {
        paramStringBuilder.append(" ").append(awe("where")).append(" ");
        a.a.j.a((Iterable)localArrayList, (Appendable)paramStringBuilder, (CharSequence)", ", null, null, 0, null, null, 124);
      }
      AppMethodBeat.o(121805);
    }
  }

  private final void a(List<? extends ar> paramList, StringBuilder paramStringBuilder, boolean paramBoolean)
  {
    AppMethodBeat.i(121801);
    if (this.BCc.ejc())
      AppMethodBeat.o(121801);
    while (true)
    {
      return;
      if (!paramList.isEmpty())
      {
        paramStringBuilder.append(escape("<"));
        b(paramStringBuilder, paramList);
        paramStringBuilder.append(escape(">"));
        if (paramBoolean)
          paramStringBuilder.append(" ");
      }
      AppMethodBeat.o(121801);
    }
  }

  private final String awe(String paramString)
  {
    AppMethodBeat.i(121761);
    p localp = this.BCc.ejh();
    switch (g.eQZ[localp.ordinal()])
    {
    default:
      paramString = new a.m();
      AppMethodBeat.o(121761);
      throw paramString;
    case 1:
      AppMethodBeat.o(121761);
    case 2:
    }
    while (true)
    {
      return paramString;
      if (this.BCc.ejp())
      {
        AppMethodBeat.o(121761);
      }
      else
      {
        paramString = "<b>" + paramString + "</b>";
        AppMethodBeat.o(121761);
      }
    }
  }

  private final String awf(String paramString)
  {
    AppMethodBeat.i(121762);
    p localp = this.BCc.ejh();
    switch (g.pCY[localp.ordinal()])
    {
    default:
      paramString = new a.m();
      AppMethodBeat.o(121762);
      throw paramString;
    case 1:
      AppMethodBeat.o(121762);
    case 2:
    }
    while (true)
    {
      return paramString;
      paramString = "<font color=red><b>" + paramString + "</b></font>";
      AppMethodBeat.o(121762);
    }
  }

  private String b(a.i.b.a.c.b.h paramh)
  {
    AppMethodBeat.i(121768);
    a.f.b.j.p(paramh, "klass");
    if (a.i.b.a.c.l.p.L((l)paramh))
    {
      paramh = paramh.dXY().toString();
      AppMethodBeat.o(121768);
    }
    while (true)
    {
      return paramh;
      paramh = this.BCc.eiV().a(paramh, (c)this);
      AppMethodBeat.o(121768);
    }
  }

  private final String b(a.i.b.a.c.i.b.f<?> paramf)
  {
    AppMethodBeat.i(121790);
    if ((paramf instanceof a.i.b.a.c.i.b.b))
    {
      paramf = a.a.j.a((Iterable)((a.i.b.a.c.i.b.b)paramf).getValue(), (CharSequence)", ", (CharSequence)"{", (CharSequence)"}", 0, null, (a.f.a.b)new e.e(this), 24);
      AppMethodBeat.o(121790);
    }
    while (true)
    {
      return paramf;
      if ((paramf instanceof a.i.b.a.c.i.b.a))
      {
        paramf = a.k.m.b(a((a.i.b.a.c.b.a.c)((a.i.b.a.c.i.b.a)paramf).getValue(), null), (CharSequence)"@");
        AppMethodBeat.o(121790);
      }
      else if ((paramf instanceof a.i.b.a.c.i.b.o))
      {
        paramf = b(((a.i.b.a.c.i.b.o)paramf).ejy()) + "::class";
        AppMethodBeat.o(121790);
      }
      else
      {
        paramf = paramf.toString();
        AppMethodBeat.o(121790);
      }
    }
  }

  private final void b(a.i.b.a.c.b.a parama, StringBuilder paramStringBuilder)
  {
    AppMethodBeat.i(121804);
    parama = parama.dYQ();
    if (parama != null)
    {
      a(paramStringBuilder, (a.i.b.a.c.b.a.a)parama, a.i.b.a.c.b.a.e.Bfw);
      a.i.b.a.c.l.w localw = parama.dZS();
      a.f.b.j.o(localw, "receiver.type");
      String str = b(localw);
      parama = str;
      if (W(localw))
      {
        parama = str;
        if (!av.aB(localw))
          parama = "(" + str + ')';
      }
      paramStringBuilder.append(parama).append(".");
    }
    AppMethodBeat.o(121804);
  }

  private final void b(aw paramaw, StringBuilder paramStringBuilder)
  {
    AppMethodBeat.i(121810);
    if (this.BCc.ejb())
    {
      paramaw = paramaw.eaa();
      if (paramaw != null)
      {
        paramStringBuilder = paramStringBuilder.append(" = ");
        a.f.b.j.o(paramaw, "constant");
        paramStringBuilder.append(escape(b(paramaw)));
        AppMethodBeat.o(121810);
      }
    }
    while (true)
    {
      return;
      AppMethodBeat.o(121810);
    }
  }

  private final void b(a.i.b.a.c.b.b paramb, StringBuilder paramStringBuilder)
  {
    AppMethodBeat.i(121794);
    if (!this.BCc.eiW().contains(h.BCk))
      AppMethodBeat.o(121794);
    while (true)
    {
      return;
      if ((t(paramb)) && (this.BCc.ejf() != m.BDv))
      {
        a(paramStringBuilder, true, "override");
        if (this.BCc.eiZ())
          paramStringBuilder.append("/*").append(paramb.dYX().size()).append("*/ ");
      }
      AppMethodBeat.o(121794);
    }
  }

  private final void b(StringBuilder paramStringBuilder, a.i.b.a.c.l.w paramw)
  {
    AppMethodBeat.i(121770);
    a.i.b.a.c.l.az localaz = paramw.ekn();
    Object localObject = localaz;
    if (!(localaz instanceof a.i.b.a.c.l.a))
      localObject = null;
    localObject = (a.i.b.a.c.l.a)localObject;
    if (localObject != null)
    {
      c(paramStringBuilder, (a.i.b.a.c.l.w)((a.i.b.a.c.l.a)localObject).BJa);
      if (this.BCc.ejl())
        a(paramStringBuilder, (a.i.b.a.c.l.a)localObject);
      AppMethodBeat.o(121770);
    }
    while (true)
    {
      return;
      c(paramStringBuilder, paramw);
      AppMethodBeat.o(121770);
    }
  }

  private final void b(StringBuilder paramStringBuilder, List<? extends ar> paramList)
  {
    AppMethodBeat.i(121802);
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      a((ar)paramList.next(), paramStringBuilder, false);
      if (paramList.hasNext())
        paramStringBuilder.append(", ");
    }
    AppMethodBeat.o(121802);
  }

  private final void c(a.i.b.a.c.b.b paramb, StringBuilder paramStringBuilder)
  {
    AppMethodBeat.i(121795);
    if (!this.BCc.eiW().contains(h.BCn))
      AppMethodBeat.o(121795);
    while (true)
    {
      return;
      if ((this.BCc.eiZ()) && (paramb.dYZ() != b.a.Bej))
      {
        paramStringBuilder = paramStringBuilder.append("/*");
        paramb = paramb.dYZ().name();
        if (paramb == null)
        {
          paramb = new a.v("null cannot be cast to non-null type java.lang.String");
          AppMethodBeat.o(121795);
          throw paramb;
        }
        paramb = paramb.toLowerCase();
        a.f.b.j.o(paramb, "(this as java.lang.String).toLowerCase()");
        paramStringBuilder.append(paramb).append("*/ ");
      }
      AppMethodBeat.o(121795);
    }
  }

  private final void c(StringBuilder paramStringBuilder, a.i.b.a.c.l.w paramw)
  {
    AppMethodBeat.i(121772);
    if (((paramw instanceof bb)) && (this.BCc.eiS()) && (!((bb)paramw).ekf()))
    {
      paramStringBuilder.append("<Not computed yet>");
      AppMethodBeat.o(121772);
    }
    while (true)
    {
      return;
      paramw = paramw.ekn();
      if ((paramw instanceof a.i.b.a.c.l.q))
      {
        paramStringBuilder.append(((a.i.b.a.c.l.q)paramw).a((c)this, (i)this));
        AppMethodBeat.o(121772);
      }
      else
      {
        if ((paramw instanceof a.i.b.a.c.l.ad))
          a(paramStringBuilder, (a.i.b.a.c.l.ad)paramw);
        AppMethodBeat.o(121772);
      }
    }
  }

  private final void d(StringBuilder paramStringBuilder, a.i.b.a.c.l.w paramw)
  {
    AppMethodBeat.i(121777);
    a(paramStringBuilder, (a.i.b.a.c.b.a.a)paramw, null);
    if (a.i.b.a.c.l.y.an(paramw))
      if (((paramw instanceof a.i.b.a.c.l.ay)) && (this.BCc.ejo()))
      {
        paramStringBuilder.append(((a.i.b.a.c.l.ay)paramw).BKg);
        paramStringBuilder.append(fY(paramw.ejt()));
      }
    while (true)
    {
      if (paramw.eci())
        paramStringBuilder.append("?");
      if (ag.ap(paramw))
        paramStringBuilder.append("!!");
      AppMethodBeat.o(121777);
      return;
      paramStringBuilder.append(paramw.ejw().toString());
      break;
      a(this, paramStringBuilder, paramw);
    }
  }

  private final void e(StringBuilder paramStringBuilder, a.i.b.a.c.l.w paramw)
  {
    int i = 1;
    AppMethodBeat.i(121784);
    int j = paramStringBuilder.length();
    eiO().a(paramStringBuilder, (a.i.b.a.c.b.a.a)paramw, null);
    int k;
    boolean bool2;
    int m;
    label75: label94: ap localap;
    if (paramStringBuilder.length() != j)
    {
      k = 1;
      boolean bool1 = a.i.b.a.c.a.f.e(paramw);
      bool2 = paramw.eci();
      localObject = a.i.b.a.c.a.f.h(paramw);
      if ((!bool2) && ((k == 0) || (localObject == null)))
        break label325;
      m = 1;
      if (m != 0)
      {
        if (!bool1)
          break label331;
        paramStringBuilder.insert(j, '(');
      }
      a(paramStringBuilder, bool1, "suspend");
      if (localObject != null)
      {
        if (W((a.i.b.a.c.l.w)localObject))
        {
          k = i;
          if (!((a.i.b.a.c.l.w)localObject).eci());
        }
        else
        {
          if (!X((a.i.b.a.c.l.w)localObject))
            break label433;
          k = i;
        }
        label139: if (k != 0)
          paramStringBuilder.append("(");
        b(paramStringBuilder, (a.i.b.a.c.l.w)localObject);
        if (k != 0)
          paramStringBuilder.append(")");
        paramStringBuilder.append(".");
      }
      paramStringBuilder.append("(");
      Iterator localIterator = ((Iterable)a.i.b.a.c.a.f.j(paramw)).iterator();
      k = 0;
      label205: if (!localIterator.hasNext())
        break label445;
      localap = (ap)localIterator.next();
      if (k > 0)
        paramStringBuilder.append(", ");
      if (!this.BCc.ejn())
        break label439;
      localObject = localap.dZS();
      a.f.b.j.o(localObject, "typeProjection.type");
    }
    label433: label439: for (Object localObject = a.i.b.a.c.a.f.k((a.i.b.a.c.l.w)localObject); ; localObject = null)
    {
      if (localObject != null)
      {
        paramStringBuilder.append(b((a.i.b.a.c.f.f)localObject, false));
        paramStringBuilder.append(": ");
      }
      paramStringBuilder.append(eiP().a(localap));
      k++;
      break label205;
      k = 0;
      break;
      label325: m = 0;
      break label75;
      label331: if (k != 0)
      {
        if (a.k.m.av((CharSequence)paramStringBuilder) == ' ');
        for (k = 1; (aa.AUz) && (k == 0); k = 0)
        {
          paramStringBuilder = (Throwable)new AssertionError("Assertion failed");
          AppMethodBeat.o(121784);
          throw paramStringBuilder;
        }
        if (paramStringBuilder.charAt(a.k.m.at((CharSequence)paramStringBuilder) - 1) != ')')
          paramStringBuilder.insert(a.k.m.at((CharSequence)paramStringBuilder), "()");
      }
      paramStringBuilder.append("(");
      break label94;
      k = 0;
      break label139;
    }
    label445: paramStringBuilder.append(") ").append(eiQ()).append(" ");
    b(paramStringBuilder, a.i.b.a.c.a.f.i(paramw));
    if (m != 0)
      paramStringBuilder.append(")");
    if (bool2)
      paramStringBuilder.append("?");
    AppMethodBeat.o(121784);
  }

  private final e eiO()
  {
    AppMethodBeat.i(121759);
    e locale = (e)this.BCa.getValue();
    AppMethodBeat.o(121759);
    return locale;
  }

  private final c eiP()
  {
    AppMethodBeat.i(121760);
    c localc = (c)this.BCb.getValue();
    AppMethodBeat.o(121760);
    return localc;
  }

  private final String eiQ()
  {
    AppMethodBeat.i(121764);
    Object localObject = this.BCc.ejh();
    switch (g.pEv[localObject.ordinal()])
    {
    default:
      localObject = new a.m();
      AppMethodBeat.o(121764);
      throw ((Throwable)localObject);
    case 1:
      localObject = escape("->");
      AppMethodBeat.o(121764);
    case 2:
    }
    while (true)
    {
      return localObject;
      localObject = "&rarr;";
      AppMethodBeat.o(121764);
    }
  }

  private final String escape(String paramString)
  {
    AppMethodBeat.i(121763);
    paramString = this.BCc.ejh().escape(paramString);
    AppMethodBeat.o(121763);
    return paramString;
  }

  private String fY(List<? extends ap> paramList)
  {
    AppMethodBeat.i(121776);
    a.f.b.j.p(paramList, "typeArguments");
    if (paramList.isEmpty())
    {
      paramList = "";
      AppMethodBeat.o(121776);
    }
    while (true)
    {
      return paramList;
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append(escape("<"));
      a(localStringBuilder, paramList);
      localStringBuilder.append(escape(">"));
      paramList = localStringBuilder.toString();
      a.f.b.j.o(paramList, "StringBuilder().apply(builderAction).toString()");
      AppMethodBeat.o(121776);
    }
  }

  private static void g(StringBuilder paramStringBuilder)
  {
    AppMethodBeat.i(121813);
    int i = paramStringBuilder.length();
    if ((i == 0) || (paramStringBuilder.charAt(i - 1) != ' '))
      paramStringBuilder.append(' ');
    AppMethodBeat.o(121813);
  }

  private static String h(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5)
  {
    AppMethodBeat.i(121814);
    if ((a.k.m.jb(paramString1, paramString2)) && (a.k.m.jb(paramString3, paramString4)))
    {
      int i = paramString2.length();
      if (paramString1 == null)
      {
        paramString1 = new a.v("null cannot be cast to non-null type java.lang.String");
        AppMethodBeat.o(121814);
        throw paramString1;
      }
      paramString2 = paramString1.substring(i);
      a.f.b.j.o(paramString2, "(this as java.lang.String).substring(startIndex)");
      i = paramString4.length();
      if (paramString3 == null)
      {
        paramString1 = new a.v("null cannot be cast to non-null type java.lang.String");
        AppMethodBeat.o(121814);
        throw paramString1;
      }
      paramString3 = paramString3.substring(i);
      a.f.b.j.o(paramString3, "(this as java.lang.String).substring(startIndex)");
      paramString1 = paramString5 + paramString2;
      if (a.f.b.j.j(paramString2, paramString3))
        AppMethodBeat.o(121814);
    }
    while (true)
    {
      return paramString1;
      if (iZ(paramString2, paramString3))
      {
        paramString1 = paramString1 + "!";
        AppMethodBeat.o(121814);
      }
      else
      {
        paramString1 = null;
        AppMethodBeat.o(121814);
      }
    }
  }

  private static boolean iZ(String paramString1, String paramString2)
  {
    boolean bool = false;
    AppMethodBeat.i(121815);
    if ((a.f.b.j.j(paramString1, a.k.m.i(paramString2, "?", "", false))) || ((a.k.m.jc(paramString2, "?")) && (a.f.b.j.j(paramString1 + '?', paramString2))) || (a.f.b.j.j("(" + paramString1 + ")?", paramString2)))
    {
      bool = true;
      AppMethodBeat.o(121815);
    }
    while (true)
    {
      return bool;
      AppMethodBeat.o(121815);
    }
  }

  private final List<String> k(a.i.b.a.c.b.a.c paramc)
  {
    Object localObject1 = null;
    AppMethodBeat.i(121789);
    Object localObject2 = paramc.eah();
    if (((Boolean)this.BCc.BCZ.b(j.eQB[28])).booleanValue());
    for (Object localObject3 = a.i.b.a.c.i.c.a.l(paramc); ; localObject3 = null)
    {
      paramc = (a.i.b.a.c.b.a.c)localObject1;
      if (localObject3 == null)
        break label244;
      localObject3 = ((a.i.b.a.c.b.e)localObject3).dYe();
      paramc = (a.i.b.a.c.b.a.c)localObject1;
      if (localObject3 == null)
        break label244;
      localObject3 = ((a.i.b.a.c.b.d)localObject3).dYV();
      paramc = (a.i.b.a.c.b.a.c)localObject1;
      if (localObject3 == null)
        break label244;
      localObject3 = (Iterable)localObject3;
      paramc = (Collection)new ArrayList();
      localObject3 = ((Iterable)localObject3).iterator();
      while (((Iterator)localObject3).hasNext())
      {
        localObject1 = ((Iterator)localObject3).next();
        if (((au)localObject1).dZU())
          paramc.add(localObject1);
      }
    }
    localObject3 = (Iterable)paramc;
    paramc = (Collection)new ArrayList(a.a.j.d((Iterable)localObject3));
    localObject3 = ((Iterable)localObject3).iterator();
    while (((Iterator)localObject3).hasNext())
    {
      localObject1 = (au)((Iterator)localObject3).next();
      a.f.b.j.o(localObject1, "it");
      paramc.add(((au)localObject1).dZg());
    }
    paramc = (List)paramc;
    label244: localObject3 = paramc;
    if (paramc == null)
      localObject3 = (List)a.a.v.AUP;
    localObject1 = (Iterable)localObject3;
    paramc = (Collection)new ArrayList();
    Object localObject4 = ((Iterable)localObject1).iterator();
    label338: 
    while (((Iterator)localObject4).hasNext())
    {
      localObject1 = ((Iterator)localObject4).next();
      if (!((Map)localObject2).containsKey((a.i.b.a.c.f.f)localObject1));
      for (int i = 1; ; i = 0)
      {
        if (i == 0)
          break label338;
        paramc.add(localObject1);
        break;
      }
    }
    localObject1 = (Iterable)paramc;
    paramc = (Collection)new ArrayList(a.a.j.d((Iterable)localObject1));
    localObject1 = ((Iterable)localObject1).iterator();
    while (((Iterator)localObject1).hasNext())
    {
      localObject4 = (a.i.b.a.c.f.f)((Iterator)localObject1).next();
      paramc.add(((a.i.b.a.c.f.f)localObject4).name + " = ...");
    }
    localObject1 = (List)paramc;
    paramc = (Iterable)((Map)localObject2).entrySet();
    localObject2 = (Collection)new ArrayList(a.a.j.d(paramc));
    localObject4 = paramc.iterator();
    if (((Iterator)localObject4).hasNext())
    {
      Object localObject5 = (Map.Entry)((Iterator)localObject4).next();
      paramc = (a.i.b.a.c.f.f)((Map.Entry)localObject5).getKey();
      a.i.b.a.c.i.b.f localf = (a.i.b.a.c.i.b.f)((Map.Entry)localObject5).getValue();
      localObject5 = new StringBuilder().append(paramc.name).append(" = ");
      if (!((List)localObject3).contains(paramc));
      for (paramc = b(localf); ; paramc = "...")
      {
        ((Collection)localObject2).add(paramc);
        break;
      }
    }
    paramc = (List)localObject2;
    paramc = (Iterable)a.a.j.b((Collection)localObject1, (Iterable)paramc);
    a.f.b.j.p(paramc, "receiver$0");
    if (((Collection)paramc).size() <= 1)
    {
      paramc = a.a.j.m(paramc);
      AppMethodBeat.o(121789);
    }
    while (true)
    {
      return paramc;
      paramc = ((Collection)paramc).toArray(new Comparable[0]);
      if (paramc == null)
      {
        paramc = new a.v("null cannot be cast to non-null type kotlin.Array<T>");
        AppMethodBeat.o(121789);
        throw paramc;
      }
      if (paramc == null)
      {
        paramc = new a.v("null cannot be cast to non-null type kotlin.Array<T>");
        AppMethodBeat.o(121789);
        throw paramc;
      }
      paramc = (Comparable[])paramc;
      if (paramc == null)
      {
        paramc = new a.v("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        AppMethodBeat.o(121789);
        throw paramc;
      }
      localObject3 = (Object[])paramc;
      a.f.b.j.p(localObject3, "receiver$0");
      if (localObject3.length > 1)
        Arrays.sort((Object[])localObject3);
      paramc = a.a.e.asList((Object[])paramc);
      AppMethodBeat.o(121789);
    }
  }

  private static boolean t(a.i.b.a.c.b.b paramb)
  {
    AppMethodBeat.i(121816);
    boolean bool;
    if (!paramb.dYX().isEmpty())
    {
      bool = true;
      AppMethodBeat.o(121816);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(121816);
    }
  }

  public final String a(a.i.b.a.c.b.a.c paramc, a.i.b.a.c.b.a.e parame)
  {
    AppMethodBeat.i(121788);
    a.f.b.j.p(paramc, "annotation");
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append('@');
    if (parame != null)
      localStringBuilder.append(parame.BfB + ":");
    parame = paramc.dZS();
    localStringBuilder.append(b(parame));
    if (i.a.a(this.BCc))
    {
      paramc = k(paramc);
      if (!i.a.b(this.BCc))
        if (((Collection)paramc).isEmpty())
          break label218;
    }
    label218: for (int i = 1; ; i = 0)
    {
      if (i != 0)
        a.a.j.a((Iterable)paramc, (Appendable)localStringBuilder, (CharSequence)", ", (CharSequence)"(", (CharSequence)")", 0, null, null, 112);
      if ((this.BCc.eiZ()) && ((a.i.b.a.c.l.y.an(parame)) || ((parame.ejw().dYs() instanceof aa.b))))
        localStringBuilder.append(" /* annotation class not found */");
      paramc = localStringBuilder.toString();
      a.f.b.j.o(paramc, "StringBuilder().apply(builderAction).toString()");
      AppMethodBeat.o(121788);
      return paramc;
    }
  }

  public final String a(ap paramap)
  {
    AppMethodBeat.i(121782);
    a.f.b.j.p(paramap, "typeProjection");
    StringBuilder localStringBuilder = new StringBuilder();
    a(localStringBuilder, a.a.j.listOf(paramap));
    paramap = localStringBuilder.toString();
    a.f.b.j.o(paramap, "StringBuilder().apply(builderAction).toString()");
    AppMethodBeat.o(121782);
    return paramap;
  }

  public final String a(String paramString1, String paramString2, a.i.b.a.c.a.g paramg)
  {
    AppMethodBeat.i(121775);
    a.f.b.j.p(paramString1, "lowerRendered");
    a.f.b.j.p(paramString2, "upperRendered");
    a.f.b.j.p(paramg, "builtIns");
    if (iZ(paramString1, paramString2))
      if (a.k.m.jb(paramString2, "("))
      {
        paramString1 = "(" + paramString1 + ")!";
        AppMethodBeat.o(121775);
      }
    while (true)
    {
      return paramString1;
      paramString1 = paramString1 + "!";
      AppMethodBeat.o(121775);
      continue;
      Object localObject1 = this.BCc.eiV();
      Object localObject2 = ((g.b)paramg.Bad.invoke()).BbK;
      localObject2 = a.i.b.a.c.a.g.a(a.i.b.a.c.f.f.avX("Collection"), (ab)localObject2);
      a.f.b.j.o(localObject2, "builtIns.collection");
      localObject2 = a.k.m.je(((b)localObject1).a((a.i.b.a.c.b.h)localObject2, (c)this), "Collection");
      localObject1 = h(paramString1, (String)localObject2 + "Mutable", paramString2, (String)localObject2, (String)localObject2 + '(' + "Mutable" + ')');
      if (localObject1 != null)
      {
        AppMethodBeat.o(121775);
        paramString1 = (String)localObject1;
      }
      else
      {
        localObject1 = h(paramString1, (String)localObject2 + "MutableMap.MutableEntry", paramString2, (String)localObject2 + "Map.Entry", (String)localObject2 + "(Mutable)Map.(Mutable)Entry");
        if (localObject1 != null)
        {
          AppMethodBeat.o(121775);
          paramString1 = (String)localObject1;
        }
        else
        {
          localObject1 = this.BCc.eiV();
          paramg = paramg.avB("Array");
          a.f.b.j.o(paramg, "builtIns.array");
          paramg = a.k.m.je(((b)localObject1).a((a.i.b.a.c.b.h)paramg, (c)this), "Array");
          paramg = h(paramString1, paramg + escape("Array<"), paramString2, paramg + escape("Array<out "), paramg + escape("Array<(out) "));
          if (paramg != null)
          {
            AppMethodBeat.o(121775);
            paramString1 = paramg;
          }
          else
          {
            paramString1 = "(" + paramString1 + ".." + paramString2 + ')';
            AppMethodBeat.o(121775);
          }
        }
      }
    }
  }

  public final void a(a parama)
  {
    AppMethodBeat.i(121819);
    a.f.b.j.p(parama, "<set-?>");
    this.BCc.a(parama);
    AppMethodBeat.o(121819);
  }

  public final void a(b paramb)
  {
    AppMethodBeat.i(121820);
    a.f.b.j.p(paramb, "<set-?>");
    this.BCc.a(paramb);
    AppMethodBeat.o(121820);
  }

  public final void a(n paramn)
  {
    AppMethodBeat.i(121827);
    a.f.b.j.p(paramn, "<set-?>");
    this.BCc.a(paramn);
    AppMethodBeat.o(121827);
  }

  public final void a(p paramp)
  {
    AppMethodBeat.i(121831);
    a.f.b.j.p(paramp, "<set-?>");
    this.BCc.a(paramp);
    AppMethodBeat.o(121831);
  }

  public final String b(a.i.b.a.c.f.f paramf, boolean paramBoolean)
  {
    AppMethodBeat.i(121765);
    a.f.b.j.p(paramf, "name");
    paramf = escape(q.y(paramf));
    if ((this.BCc.ejp()) && (this.BCc.ejh() == p.BDH) && (paramBoolean))
    {
      paramf = "<b>" + paramf + "</b>";
      AppMethodBeat.o(121765);
    }
    while (true)
    {
      return paramf;
      AppMethodBeat.o(121765);
    }
  }

  public final String b(a.i.b.a.c.l.w paramw)
  {
    AppMethodBeat.i(121769);
    a.f.b.j.p(paramw, "type");
    StringBuilder localStringBuilder = new StringBuilder();
    b(localStringBuilder, (a.i.b.a.c.l.w)((a.f.a.b)this.BCc.BCP.b(j.eQB[18])).am(paramw));
    paramw = localStringBuilder.toString();
    a.f.b.j.o(paramw, "StringBuilder().apply(builderAction).toString()");
    AppMethodBeat.o(121769);
    return paramw;
  }

  public final a eiR()
  {
    AppMethodBeat.i(121818);
    a locala = this.BCc.eiR();
    AppMethodBeat.o(121818);
    return locala;
  }

  public final boolean eiS()
  {
    AppMethodBeat.i(138680);
    boolean bool = this.BCc.eiS();
    AppMethodBeat.o(138680);
    return bool;
  }

  public final boolean eiT()
  {
    AppMethodBeat.i(121823);
    boolean bool = this.BCc.eiT();
    AppMethodBeat.o(121823);
    return bool;
  }

  public final Set<a.i.b.a.c.f.b> eiU()
  {
    AppMethodBeat.i(138681);
    Set localSet = this.BCc.eiU();
    AppMethodBeat.o(138681);
    return localSet;
  }

  public final String f(a.i.b.a.c.f.c paramc)
  {
    AppMethodBeat.i(121767);
    a.f.b.j.p(paramc, "fqName");
    paramc = paramc.ehM();
    a.f.b.j.o(paramc, "fqName.pathSegments()");
    paramc = escape(q.fZ(paramc));
    AppMethodBeat.o(121767);
    return paramc;
  }

  public final void fN(boolean paramBoolean)
  {
    AppMethodBeat.i(121822);
    this.BCc.fN(paramBoolean);
    AppMethodBeat.o(121822);
  }

  public final String k(l paraml)
  {
    AppMethodBeat.i(121799);
    a.f.b.j.p(paraml, "declarationDescriptor");
    StringBuilder localStringBuilder1 = new StringBuilder();
    paraml.a((a.i.b.a.c.b.n)new e.a(this), localStringBuilder1);
    if ((!((Boolean)this.BCc.BCy.b(j.eQB[1])).booleanValue()) || ((paraml instanceof ab)) || ((paraml instanceof a.i.b.a.c.b.ad)));
    l locall;
    do
    {
      while (true)
      {
        paraml = localStringBuilder1.toString();
        a.f.b.j.o(paraml, "StringBuilder().apply(builderAction).toString()");
        AppMethodBeat.o(121799);
        return paraml;
        if (!(paraml instanceof a.i.b.a.c.b.y))
          break;
        localStringBuilder1.append(" is a module");
      }
      locall = paraml.dXW();
    }
    while ((locall == null) || ((locall instanceof a.i.b.a.c.b.y)));
    StringBuilder localStringBuilder2 = localStringBuilder1.append(" ");
    Object localObject = "defined in";
    a.f.b.j.p("defined in", "message");
    p localp = this.BCc.ejh();
    switch (g.BCe[localp.ordinal()])
    {
    default:
      paraml = new a.m();
      AppMethodBeat.o(121799);
      throw paraml;
    case 2:
      localObject = "<i>" + "defined in" + "</i>";
    case 1:
    }
    localStringBuilder2.append((String)localObject).append(" ");
    localObject = a.i.b.a.c.i.d.n(locall);
    a.f.b.j.o(localObject, "DescriptorUtils.getFqName(containingDeclaration)");
    if (((a.i.b.a.c.f.c)localObject).ByV.isEmpty());
    for (localObject = "root package"; ; localObject = f((a.i.b.a.c.f.c)localObject))
    {
      localStringBuilder1.append((String)localObject);
      if ((!((Boolean)this.BCc.BCz.b(j.eQB[2])).booleanValue()) || (!(locall instanceof ab)) || (!(paraml instanceof a.i.b.a.c.b.o)))
        break;
      paraml = ((a.i.b.a.c.b.o)paraml).dYo();
      a.f.b.j.o(paraml, "descriptor.source");
      a.f.b.j.o(paraml.dXz(), "descriptor.source.containingFile");
      break;
    }
  }

  public final void m(Set<a.i.b.a.c.f.b> paramSet)
  {
    AppMethodBeat.i(121825);
    a.f.b.j.p(paramSet, "<set-?>");
    this.BCc.m(paramSet);
    AppMethodBeat.o(121825);
  }

  public final void n(Set<? extends h> paramSet)
  {
    AppMethodBeat.i(121826);
    a.f.b.j.p(paramSet, "<set-?>");
    this.BCc.n(paramSet);
    AppMethodBeat.o(121826);
  }

  public final void rR(boolean paramBoolean)
  {
    AppMethodBeat.i(121828);
    this.BCc.rR(paramBoolean);
    AppMethodBeat.o(121828);
  }

  public final void rS(boolean paramBoolean)
  {
    AppMethodBeat.i(121829);
    this.BCc.rS(paramBoolean);
    AppMethodBeat.o(121829);
  }

  public final void rT(boolean paramBoolean)
  {
    AppMethodBeat.i(121830);
    this.BCc.rT(paramBoolean);
    AppMethodBeat.o(121830);
  }

  public final void rU(boolean paramBoolean)
  {
    AppMethodBeat.i(121832);
    this.BCc.rU(paramBoolean);
    AppMethodBeat.o(121832);
  }

  public final void rV(boolean paramBoolean)
  {
    AppMethodBeat.i(121833);
    this.BCc.rV(paramBoolean);
    AppMethodBeat.o(121833);
  }

  public final void rW(boolean paramBoolean)
  {
    AppMethodBeat.i(121834);
    this.BCc.rW(paramBoolean);
    AppMethodBeat.o(121834);
  }

  public final void rX(boolean paramBoolean)
  {
    AppMethodBeat.i(121835);
    this.BCc.rX(paramBoolean);
    AppMethodBeat.o(121835);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.h.e
 * JD-Core Version:    0.6.2
 */