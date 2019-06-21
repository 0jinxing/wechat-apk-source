package a.i.b.a.c.d.a;

import TT;;
import a.f.b.j;
import a.f.b.k;
import a.i.b.a.c.a.g;
import a.i.b.a.c.b.ag;
import a.i.b.a.c.b.ah;
import a.i.b.a.c.b.al;
import a.i.b.a.c.b.l;
import a.i.b.a.c.f.f;
import a.i.b.a.c.l.a.q;
import a.i.b.a.c.l.w;
import a.v;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.List;
import java.util.Set;

public final class t
{
  static final a.i.b.a.c.f.b a(a.i.b.a.c.f.b paramb, String paramString)
  {
    AppMethodBeat.i(119733);
    paramb = paramb.q(f.avX(paramString));
    j.o(paramb, "child(Name.identifier(name))");
    AppMethodBeat.o(119733);
    return paramb;
  }

  public static final boolean a(a.i.b.a.c.b.e parame, a.i.b.a.c.b.a parama)
  {
    AppMethodBeat.i(119741);
    j.p(parame, "receiver$0");
    j.p(parama, "specialCallableDescriptor");
    parama = parama.dXW();
    if (parama == null)
    {
      parame = new v("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
      AppMethodBeat.o(119741);
      throw parame;
    }
    parama = ((a.i.b.a.c.b.e)parama).dZf();
    j.o(parama, "(specialCallableDescript…ssDescriptor).defaultType");
    parame = a.i.b.a.c.i.d.x(parame);
    int i;
    label98: boolean bool;
    if (parame != null)
      if (!(parame instanceof a.i.b.a.c.d.a.b.d))
        if (q.e((w)parame.dZf(), (w)parama) != null)
        {
          i = 1;
          if (i == 0)
            break label136;
          if (g.b((l)parame))
            break label126;
          AppMethodBeat.o(119741);
          bool = true;
        }
    while (true)
    {
      return bool;
      i = 0;
      break label98;
      label126: AppMethodBeat.o(119741);
      bool = false;
      continue;
      label136: parame = a.i.b.a.c.i.d.x(parame);
      break;
      AppMethodBeat.o(119741);
      bool = false;
    }
  }

  static final a.i.b.a.c.f.b b(a.i.b.a.c.f.c paramc, String paramString)
  {
    AppMethodBeat.i(119734);
    paramc = paramc.t(f.avX(paramString)).ehI();
    j.o(paramc, "child(Name.identifier(name)).toSafe()");
    AppMethodBeat.o(119734);
    return paramc;
  }

  public static final <T extends a.i.b.a.c.b.b> T n(T paramT)
  {
    Object localObject1 = null;
    AppMethodBeat.i(119736);
    j.p(paramT, "receiver$0");
    Object localObject2 = c.Bky;
    if (!c.eaU().contains(paramT.dZg()))
    {
      localObject2 = e.BkZ;
      if (!e.eaW().contains(a.i.b.a.c.i.c.a.x(paramT).dZg()))
      {
        AppMethodBeat.o(119736);
        paramT = localObject1;
      }
    }
    while (true)
    {
      return paramT;
      if (((paramT instanceof ah)) || ((paramT instanceof ag)))
      {
        paramT = a.i.b.a.c.i.c.a.b(paramT, (a.f.a.b)a.BlL);
        AppMethodBeat.o(119736);
      }
      else if ((paramT instanceof al))
      {
        paramT = a.i.b.a.c.i.c.a.b(paramT, (a.f.a.b)t.b.BlM);
        AppMethodBeat.o(119736);
      }
      else
      {
        AppMethodBeat.o(119736);
        paramT = localObject1;
      }
    }
  }

  public static final boolean o(a.i.b.a.c.b.b paramb)
  {
    AppMethodBeat.i(119737);
    j.p(paramb, "receiver$0");
    boolean bool;
    if (n(paramb) != null)
    {
      bool = true;
      AppMethodBeat.o(119737);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(119737);
    }
  }

  public static final <T extends a.i.b.a.c.b.b> T p(T paramT)
  {
    AppMethodBeat.i(119738);
    j.p(paramT, "receiver$0");
    Object localObject = n(paramT);
    if (localObject != null)
    {
      AppMethodBeat.o(119738);
      paramT = (TT)localObject;
    }
    while (true)
    {
      return paramT;
      localObject = d.BkH;
      localObject = paramT.dZg();
      j.o(localObject, "name");
      if (!d.h((f)localObject))
      {
        paramT = null;
        AppMethodBeat.o(119738);
      }
      else
      {
        paramT = a.i.b.a.c.i.c.a.b(paramT, (a.f.a.b)t.c.BlN);
        AppMethodBeat.o(119738);
      }
    }
  }

  public static final String q(a.i.b.a.c.b.b paramb)
  {
    AppMethodBeat.i(119739);
    j.p(paramb, "callableMemberDescriptor");
    paramb = r(paramb);
    if (paramb != null)
    {
      paramb = a.i.b.a.c.i.c.a.x(paramb);
      if (paramb != null);
    }
    else
    {
      AppMethodBeat.o(119739);
      paramb = null;
    }
    while (true)
    {
      return paramb;
      Object localObject;
      if ((paramb instanceof ah))
      {
        localObject = e.BkZ;
        paramb = e.m(paramb);
        AppMethodBeat.o(119739);
      }
      else if ((paramb instanceof al))
      {
        localObject = c.Bky;
        paramb = c.a((al)paramb);
        if (paramb != null)
        {
          paramb = paramb.name;
          AppMethodBeat.o(119739);
        }
      }
      else
      {
        AppMethodBeat.o(119739);
        paramb = null;
      }
    }
  }

  private static final a.i.b.a.c.b.b r(a.i.b.a.c.b.b paramb)
  {
    AppMethodBeat.i(119740);
    if (g.b((l)paramb))
    {
      paramb = n(paramb);
      AppMethodBeat.o(119740);
    }
    while (true)
    {
      return paramb;
      paramb = null;
      AppMethodBeat.o(119740);
    }
  }

  public static final boolean s(a.i.b.a.c.b.b paramb)
  {
    AppMethodBeat.i(119742);
    j.p(paramb, "receiver$0");
    j.p(paramb, "receiver$0");
    boolean bool;
    if (((a.i.b.a.c.i.c.a.x(paramb).dXW() instanceof a.i.b.a.c.d.a.b.d)) || (g.b((l)paramb)))
    {
      bool = true;
      AppMethodBeat.o(119742);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(119742);
    }
  }

  static final r v(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    AppMethodBeat.i(119735);
    f localf = f.avX(paramString2);
    j.o(localf, "Name.identifier(name)");
    a.i.b.a.c.d.b.t localt = a.i.b.a.c.d.b.t.BrJ;
    paramString1 = new r(localf, a.i.b.a.c.d.b.t.iV(paramString1, paramString2 + '(' + paramString3 + ')' + paramString4));
    AppMethodBeat.o(119735);
    return paramString1;
  }

  static final class a extends k
    implements a.f.a.b<a.i.b.a.c.b.b, Boolean>
  {
    public static final a BlL;

    static
    {
      AppMethodBeat.i(119728);
      BlL = new a();
      AppMethodBeat.o(119728);
    }

    a()
    {
      super();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.d.a.t
 * JD-Core Version:    0.6.2
 */