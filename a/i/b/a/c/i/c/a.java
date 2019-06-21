package a.i.b.a.c.i.c;

import a.aa;
import a.f.a.m;
import a.f.b.k;
import a.i.b.a.c.a.g;
import a.i.b.a.c.b.ab;
import a.i.b.a.c.b.ag;
import a.i.b.a.c.b.au;
import a.i.b.a.c.b.e;
import a.i.b.a.c.b.l;
import a.i.b.a.c.i.e.j.a;
import a.i.b.a.c.l.an;
import a.i.b.a.c.n.b.b;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;

public final class a
{
  private static final a.i.b.a.c.f.f BEV;

  static
  {
    AppMethodBeat.i(122153);
    a.i.b.a.c.f.f localf = a.i.b.a.c.f.f.avX("value");
    a.f.b.j.o(localf, "Name.identifier(\"value\")");
    BEV = localf;
    AppMethodBeat.o(122153);
  }

  public static final Collection<e> A(e parame)
  {
    AppMethodBeat.i(122150);
    a.f.b.j.p(parame, "sealedClass");
    if (parame.dYd() != a.i.b.a.c.b.w.BeC)
    {
      parame = (Collection)a.a.v.AUP;
      AppMethodBeat.o(122150);
    }
    while (true)
    {
      return parame;
      final LinkedHashSet localLinkedHashSet = new LinkedHashSet();
      a locala = new a(parame, localLinkedHashSet);
      l locall = parame.dXW();
      a.f.b.j.o(locall, "sealedClass.containingDeclaration");
      if ((locall instanceof ab))
        locala.a(((ab)locall).dXR(), false);
      parame = parame.dZk();
      a.f.b.j.o(parame, "sealedClass.unsubstitutedInnerClassesScope");
      locala.a(parame, true);
      parame = (Collection)localLinkedHashSet;
      AppMethodBeat.o(122150);
    }
  }

  public static final a.i.b.a.c.b.y F(l paraml)
  {
    AppMethodBeat.i(122140);
    a.f.b.j.p(paraml, "receiver$0");
    paraml = a.i.b.a.c.i.d.s(paraml);
    a.f.b.j.o(paraml, "DescriptorUtils.getContainingModule(this)");
    AppMethodBeat.o(122140);
    return paraml;
  }

  public static final g G(l paraml)
  {
    AppMethodBeat.i(122144);
    a.f.b.j.p(paraml, "receiver$0");
    paraml = F(paraml).dZD();
    AppMethodBeat.o(122144);
    return paraml;
  }

  public static final a.j.h<l> H(l paraml)
  {
    AppMethodBeat.i(122146);
    a.f.b.j.p(paraml, "receiver$0");
    a.f.b.j.p(paraml, "receiver$0");
    paraml = a.j.i.a(paraml, (a.f.a.b)a.f.BFc);
    a.f.b.j.p(paraml, "receiver$0");
    if ((paraml instanceof a.j.c))
    {
      paraml = ((a.j.c)paraml).ekJ();
      AppMethodBeat.o(122146);
    }
    while (true)
    {
      return paraml;
      paraml = (a.j.h)new a.j.b(paraml, 1);
      AppMethodBeat.o(122146);
    }
  }

  public static final a.i.b.a.c.f.b I(l paraml)
  {
    Object localObject = null;
    AppMethodBeat.i(122148);
    a.f.b.j.p(paraml, "receiver$0");
    paraml = q(paraml);
    if (paraml.ehH())
    {
      if (paraml == null)
        break label46;
      paraml = paraml.ehI();
      AppMethodBeat.o(122148);
    }
    while (true)
    {
      return paraml;
      paraml = null;
      break;
      label46: AppMethodBeat.o(122148);
      paraml = localObject;
    }
  }

  public static final e b(a.i.b.a.c.b.y paramy, a.i.b.a.c.f.b paramb, a.i.b.a.c.c.a.a parama)
  {
    AppMethodBeat.i(122141);
    a.f.b.j.p(paramy, "receiver$0");
    a.f.b.j.p(paramb, "topLevelClassFqName");
    a.f.b.j.p(parama, "location");
    if (!paramb.ehF());
    for (int i = 1; (aa.AUz) && (i == 0); i = 0)
    {
      paramy = (Throwable)new AssertionError("Assertion failed");
      AppMethodBeat.o(122141);
      throw paramy;
    }
    a.i.b.a.c.f.b localb = paramb.ehG();
    a.f.b.j.o(localb, "topLevelClassFqName.parent()");
    paramy = paramy.g(localb).dXR();
    paramb = paramb.ByQ.ehK();
    a.f.b.j.o(paramb, "topLevelClassFqName.shortName()");
    paramb = paramy.c(paramb, parama);
    paramy = paramb;
    if (!(paramb instanceof e))
      paramy = null;
    paramy = (e)paramy;
    AppMethodBeat.o(122141);
    return paramy;
  }

  public static final boolean b(au paramau)
  {
    AppMethodBeat.i(122145);
    a.f.b.j.p(paramau, "receiver$0");
    paramau = a.i.b.a.c.n.b.a((Collection)a.a.j.listOf(paramau), (b.b)a.b.BEY, (a.f.a.b)a.c.BEZ);
    a.f.b.j.o(paramau, "DFS.ifAny(\n        listO…eclaresDefaultValue\n    )");
    boolean bool = paramau.booleanValue();
    AppMethodBeat.o(122145);
    return bool;
  }

  public static final a.i.b.a.c.f.a c(a.i.b.a.c.b.h paramh)
  {
    AppMethodBeat.i(122142);
    Object localObject;
    if (paramh != null)
    {
      localObject = paramh.dXW();
      if (localObject != null)
        if ((localObject instanceof ab))
        {
          paramh = new a.i.b.a.c.f.a(((ab)localObject).dZF(), paramh.dZg());
          AppMethodBeat.o(122142);
        }
    }
    while (true)
    {
      return paramh;
      if ((localObject instanceof a.i.b.a.c.b.i))
      {
        localObject = c((a.i.b.a.c.b.h)localObject);
        if (localObject != null)
        {
          paramh = ((a.i.b.a.c.f.a)localObject).p(paramh.dZg());
          AppMethodBeat.o(122142);
        }
      }
      else
      {
        AppMethodBeat.o(122142);
        paramh = null;
        continue;
        AppMethodBeat.o(122142);
        paramh = null;
      }
    }
  }

  public static final e l(a.i.b.a.c.b.a.c paramc)
  {
    AppMethodBeat.i(122151);
    a.f.b.j.p(paramc, "receiver$0");
    a.i.b.a.c.b.h localh = paramc.dZS().ejw().dYs();
    paramc = localh;
    if (!(localh instanceof e))
      paramc = null;
    paramc = (e)paramc;
    AppMethodBeat.o(122151);
    return paramc;
  }

  public static final a.i.b.a.c.i.b.f<?> m(a.i.b.a.c.b.a.c paramc)
  {
    AppMethodBeat.i(122152);
    a.f.b.j.p(paramc, "receiver$0");
    paramc = (a.i.b.a.c.i.b.f)a.a.j.f((Iterable)paramc.eah().values());
    AppMethodBeat.o(122152);
    return paramc;
  }

  public static final a.i.b.a.c.f.b o(l paraml)
  {
    AppMethodBeat.i(122139);
    a.f.b.j.p(paraml, "receiver$0");
    paraml = a.i.b.a.c.i.d.o(paraml);
    a.f.b.j.o(paraml, "DescriptorUtils.getFqNameSafe(this)");
    AppMethodBeat.o(122139);
    return paraml;
  }

  public static final a.i.b.a.c.f.c q(l paraml)
  {
    AppMethodBeat.i(122138);
    a.f.b.j.p(paraml, "receiver$0");
    paraml = a.i.b.a.c.i.d.n(paraml);
    a.f.b.j.o(paraml, "DescriptorUtils.getFqName(this)");
    AppMethodBeat.o(122138);
    return paraml;
  }

  public static final a.i.b.a.c.b.b x(a.i.b.a.c.b.b paramb)
  {
    AppMethodBeat.i(122147);
    a.f.b.j.p(paramb, "receiver$0");
    if ((paramb instanceof ag))
    {
      paramb = ((ag)paramb).dZH();
      a.f.b.j.o(paramb, "correspondingProperty");
      paramb = (a.i.b.a.c.b.b)paramb;
      AppMethodBeat.o(122147);
    }
    while (true)
    {
      return paramb;
      AppMethodBeat.o(122147);
    }
  }

  public static final e z(e parame)
  {
    AppMethodBeat.i(122143);
    a.f.b.j.p(parame, "receiver$0");
    parame = parame.dZf().ejw().eap().iterator();
    while (parame.hasNext())
    {
      Object localObject = (a.i.b.a.c.l.w)parame.next();
      if (!g.A((a.i.b.a.c.l.w)localObject))
      {
        localObject = ((a.i.b.a.c.l.w)localObject).ejw().dYs();
        if (a.i.b.a.c.i.d.B((l)localObject))
        {
          if (localObject == null)
          {
            parame = new a.v("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
            AppMethodBeat.o(122143);
            throw parame;
          }
          parame = (e)localObject;
          AppMethodBeat.o(122143);
        }
      }
    }
    while (true)
    {
      return parame;
      parame = null;
      AppMethodBeat.o(122143);
    }
  }

  static final class a extends k
    implements m<a.i.b.a.c.i.e.h, Boolean, a.y>
  {
    a(e parame, LinkedHashSet paramLinkedHashSet)
    {
      super();
    }

    public final void a(a.i.b.a.c.i.e.h paramh, boolean paramBoolean)
    {
      AppMethodBeat.i(122127);
      a.f.b.j.p(paramh, "scope");
      paramh = j.a.a(paramh, a.i.b.a.c.i.e.d.BFQ, null, 2).iterator();
      while (paramh.hasNext())
      {
        Object localObject = (l)paramh.next();
        if ((localObject instanceof e))
        {
          if (a.i.b.a.c.i.d.b((e)localObject, this.BEW))
            localLinkedHashSet.add(localObject);
          if (paramBoolean)
          {
            a locala = (a)this;
            localObject = ((e)localObject).dZk();
            a.f.b.j.o(localObject, "descriptor.unsubstitutedInnerClassesScope");
            locala.a((a.i.b.a.c.i.e.h)localObject, paramBoolean);
          }
        }
      }
      AppMethodBeat.o(122127);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.i.c.a
 * JD-Core Version:    0.6.2
 */