package a.i.b.a.c.a;

import a.aa;
import a.i.b.a.c.a.a.a.a;
import a.i.b.a.c.a.a.b.b;
import a.i.b.a.c.b.e;
import a.i.b.a.c.b.l;
import a.i.b.a.c.f.b;
import a.i.b.a.c.i.b.s;
import a.i.b.a.c.l.an;
import a.i.b.a.c.l.ap;
import a.i.b.a.c.l.w;
import a.i.b.a.c.l.x;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class f
{
  private static b.b a(l paraml)
  {
    Object localObject = null;
    AppMethodBeat.i(119084);
    a.f.b.j.p(paraml, "receiver$0");
    if (!(paraml instanceof e))
    {
      AppMethodBeat.o(119084);
      paraml = localObject;
    }
    while (true)
    {
      return paraml;
      if (!g.c(paraml))
      {
        AppMethodBeat.o(119084);
        paraml = localObject;
      }
      else
      {
        paraml = a(a.i.b.a.c.i.c.a.q(paraml));
        AppMethodBeat.o(119084);
      }
    }
  }

  private static final b.b a(a.i.b.a.c.f.c paramc)
  {
    AppMethodBeat.i(119085);
    if ((!paramc.ehH()) || (paramc.ByV.isEmpty()))
    {
      paramc = null;
      AppMethodBeat.o(119085);
    }
    while (true)
    {
      return paramc;
      Object localObject = a.i.b.a.c.a.a.a.BcI;
      localObject = paramc.ehK().name;
      a.f.b.j.o(localObject, "shortName().asString()");
      paramc = paramc.ehI().ehG();
      a.f.b.j.o(paramc, "toSafe().parent()");
      paramc = a.a.b((String)localObject, paramc);
      AppMethodBeat.o(119085);
    }
  }

  public static final a.i.b.a.c.l.ad a(g paramg, a.i.b.a.c.b.a.g paramg1, w paramw1, List<? extends w> paramList, w paramw2, boolean paramBoolean)
  {
    AppMethodBeat.i(119090);
    a.f.b.j.p(paramg, "builtIns");
    a.f.b.j.p(paramg1, "annotations");
    a.f.b.j.p(paramList, "parameterTypes");
    a.f.b.j.p(paramw2, "returnType");
    a.f.b.j.p(paramList, "parameterTypes");
    a.f.b.j.p(paramw2, "returnType");
    a.f.b.j.p(paramg, "builtIns");
    int i = paramList.size();
    ArrayList localArrayList;
    Object localObject1;
    if (paramw1 != null)
    {
      j = 1;
      localArrayList = new ArrayList(j + i + 1);
      localObject1 = (Collection)localArrayList;
      if (paramw1 == null)
        break label180;
    }
    label180: for (Object localObject2 = a.i.b.a.c.l.c.a.aM(paramw1); ; localObject2 = null)
    {
      a.i.b.a.c.n.a.b((Collection)localObject1, localObject2);
      localObject1 = ((Iterable)paramList).iterator();
      for (j = 0; ((Iterator)localObject1).hasNext(); j++)
      {
        Object localObject3 = ((Iterator)localObject1).next();
        localObject2 = (Collection)localArrayList;
        if (j < 0)
          a.a.j.dWs();
        ((Collection)localObject2).add(a.i.b.a.c.l.c.a.aM((w)localObject3));
      }
      j = 0;
      break;
    }
    localArrayList.add(a.i.b.a.c.l.c.a.aM(paramw2));
    localObject2 = (List)localArrayList;
    int j = paramList.size();
    if (paramw1 == null)
    {
      if (!paramBoolean)
        break label289;
      paramList = paramg.SM(j);
      label228: a.f.b.j.o(paramList, "if (suspendFunction) bui…tFunction(parameterCount)");
      paramw2 = paramg1;
      if (paramw1 != null)
      {
        paramw1 = g.Bag.BaN;
        a.f.b.j.o(paramw1, "KotlinBuiltIns.FQ_NAMES.extensionFunctionType");
        if (paramg1.i(paramw1) == null)
          break label302;
      }
    }
    for (paramw2 = paramg1; ; paramw2 = a.i.b.a.c.b.a.g.a.fS(a.a.j.d(paramw1, new a.i.b.a.c.b.a.j(paramg, paramg1, a.a.ad.emptyMap()))))
    {
      paramg = x.a(paramw2, paramList, (List)localObject2);
      AppMethodBeat.o(119090);
      return paramg;
      j++;
      break;
      label289: paramList = paramg.avB(g.SK(j));
      break label228;
      label302: paramw1 = a.i.b.a.c.b.a.g.BfJ;
      paramw1 = (Iterable)paramg1;
      paramg1 = g.Bag.BaN;
      a.f.b.j.o(paramg1, "KotlinBuiltIns.FQ_NAMES.extensionFunctionType");
    }
  }

  public static final boolean d(w paramw)
  {
    AppMethodBeat.i(119080);
    a.f.b.j.p(paramw, "receiver$0");
    paramw = paramw.ejw().dYs();
    boolean bool;
    if (paramw != null)
    {
      paramw = a((l)paramw);
      if (paramw != b.b.BcR)
        break label54;
      bool = true;
      AppMethodBeat.o(119080);
    }
    while (true)
    {
      return bool;
      paramw = null;
      break;
      label54: bool = false;
      AppMethodBeat.o(119080);
    }
  }

  public static final boolean e(w paramw)
  {
    AppMethodBeat.i(119081);
    a.f.b.j.p(paramw, "receiver$0");
    paramw = paramw.ejw().dYs();
    boolean bool;
    if (paramw != null)
    {
      paramw = a((l)paramw);
      if (paramw != b.b.BcS)
        break label54;
      bool = true;
      AppMethodBeat.o(119081);
    }
    while (true)
    {
      return bool;
      paramw = null;
      break;
      label54: bool = false;
      AppMethodBeat.o(119081);
    }
  }

  public static final boolean f(w paramw)
  {
    AppMethodBeat.i(119082);
    a.f.b.j.p(paramw, "receiver$0");
    paramw = paramw.ejw().dYs();
    boolean bool;
    if (paramw != null)
    {
      paramw = a((l)paramw);
      if ((paramw != b.b.BcR) && (paramw != b.b.BcS))
        break label61;
      bool = true;
      AppMethodBeat.o(119082);
    }
    while (true)
    {
      return bool;
      paramw = null;
      break;
      label61: bool = false;
      AppMethodBeat.o(119082);
    }
  }

  private static final boolean g(w paramw)
  {
    AppMethodBeat.i(119083);
    a.i.b.a.c.b.a.g localg = paramw.dYn();
    paramw = g.Bag.BaN;
    a.f.b.j.o(paramw, "KotlinBuiltIns.FQ_NAMES.extensionFunctionType");
    boolean bool;
    if (localg.i(paramw) != null)
    {
      bool = true;
      AppMethodBeat.o(119083);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(119083);
    }
  }

  public static final w h(w paramw)
  {
    AppMethodBeat.i(119086);
    a.f.b.j.p(paramw, "receiver$0");
    boolean bool = f(paramw);
    if ((aa.AUz) && (!bool))
    {
      paramw = (Throwable)new AssertionError("Not a function type: ".concat(String.valueOf(paramw)));
      AppMethodBeat.o(119086);
      throw paramw;
    }
    if (g(paramw))
    {
      paramw = ((ap)a.a.j.fJ(paramw.ejt())).dZS();
      AppMethodBeat.o(119086);
    }
    while (true)
    {
      return paramw;
      paramw = null;
      AppMethodBeat.o(119086);
    }
  }

  public static final w i(w paramw)
  {
    AppMethodBeat.i(119087);
    a.f.b.j.p(paramw, "receiver$0");
    boolean bool = f(paramw);
    if ((aa.AUz) && (!bool))
    {
      paramw = (Throwable)new AssertionError("Not a function type: ".concat(String.valueOf(paramw)));
      AppMethodBeat.o(119087);
      throw paramw;
    }
    paramw = ((ap)a.a.j.fL(paramw.ejt())).dZS();
    a.f.b.j.o(paramw, "arguments.last().type");
    AppMethodBeat.o(119087);
    return paramw;
  }

  public static final List<ap> j(w paramw)
  {
    int i = 1;
    AppMethodBeat.i(119088);
    a.f.b.j.p(paramw, "receiver$0");
    boolean bool = f(paramw);
    if ((aa.AUz) && (!bool))
    {
      paramw = (Throwable)new AssertionError("Not a function type: ".concat(String.valueOf(paramw)));
      AppMethodBeat.o(119088);
      throw paramw;
    }
    List localList = paramw.ejt();
    a.f.b.j.p(paramw, "receiver$0");
    int j;
    label94: int k;
    if ((f(paramw)) && (g(paramw)))
    {
      j = 1;
      if (j == 0)
        break label156;
      j = 1;
      k = localList.size() - 1;
      if (j > k)
        break label162;
    }
    while (true)
    {
      if ((!aa.AUz) || (i != 0))
        break label167;
      paramw = (Throwable)new AssertionError("Not an exact function type: ".concat(String.valueOf(paramw)));
      AppMethodBeat.o(119088);
      throw paramw;
      j = 0;
      break;
      label156: j = 0;
      break label94;
      label162: i = 0;
    }
    label167: paramw = localList.subList(j, k);
    AppMethodBeat.o(119088);
    return paramw;
  }

  public static final a.i.b.a.c.f.f k(w paramw)
  {
    Object localObject1 = null;
    AppMethodBeat.i(119089);
    a.f.b.j.p(paramw, "receiver$0");
    Object localObject2 = paramw.dYn();
    paramw = g.Bag.BaO;
    a.f.b.j.o(paramw, "KotlinBuiltIns.FQ_NAMES.parameterName");
    paramw = ((a.i.b.a.c.b.a.g)localObject2).i(paramw);
    if (paramw == null)
    {
      AppMethodBeat.o(119089);
      paramw = localObject1;
    }
    while (true)
    {
      return paramw;
      localObject2 = a.a.j.i((Iterable)paramw.eah().values());
      paramw = (w)localObject2;
      if (!(localObject2 instanceof s))
        paramw = null;
      paramw = (s)paramw;
      if (paramw != null)
      {
        paramw = (String)paramw.getValue();
        if (paramw != null)
          if (!a.i.b.a.c.f.f.avY(paramw))
            break label127;
      }
      while (true)
      {
        if (paramw != null)
          break label132;
        AppMethodBeat.o(119089);
        paramw = localObject1;
        break;
        label127: paramw = null;
      }
      label132: paramw = a.i.b.a.c.f.f.avX(paramw);
      AppMethodBeat.o(119089);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.a.f
 * JD-Core Version:    0.6.2
 */