package a.i.b.a.c.d.a.a;

import a.a.ad;
import a.f.b.j;
import a.i.b.a.c.a.g;
import a.i.b.a.c.a.g.a;
import a.i.b.a.c.d.a.e.d;
import a.i.b.a.c.f.f;
import a.o;
import a.u;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.util.Map;

public final class c
{
  private static final a.i.b.a.c.f.b BlV;
  private static final a.i.b.a.c.f.b BlW;
  private static final a.i.b.a.c.f.b BlX;
  private static final a.i.b.a.c.f.b BlY;
  private static final a.i.b.a.c.f.b BlZ;
  private static final f Bma;
  private static final f Bmb;
  private static final f Bmc;
  private static final Map<a.i.b.a.c.f.b, a.i.b.a.c.f.b> Bmd;
  private static final Map<a.i.b.a.c.f.b, a.i.b.a.c.f.b> Bme;
  public static final c Bmf;

  static
  {
    AppMethodBeat.i(119758);
    Bmf = new c();
    BlV = new a.i.b.a.c.f.b(Target.class.getCanonicalName());
    BlW = new a.i.b.a.c.f.b(Retention.class.getCanonicalName());
    BlX = new a.i.b.a.c.f.b(Deprecated.class.getCanonicalName());
    BlY = new a.i.b.a.c.f.b(Documented.class.getCanonicalName());
    BlZ = new a.i.b.a.c.f.b("java.lang.annotation.Repeatable");
    f localf = f.avX("message");
    j.o(localf, "Name.identifier(\"message\")");
    Bma = localf;
    localf = f.avX("allowedTargets");
    j.o(localf, "Name.identifier(\"allowedTargets\")");
    Bmb = localf;
    localf = f.avX("value");
    j.o(localf, "Name.identifier(\"value\")");
    Bmc = localf;
    Bmd = ad.a(new o[] { u.I(g.Bag.BaQ, BlV), u.I(g.Bag.BaT, BlW), u.I(g.Bag.BaU, BlZ), u.I(g.Bag.BaV, BlY) });
    Bme = ad.a(new o[] { u.I(BlV, g.Bag.BaQ), u.I(BlW, g.Bag.BaT), u.I(BlX, g.Bag.BaK), u.I(BlZ, g.Bag.BaU), u.I(BlY, g.Bag.BaV) });
    AppMethodBeat.o(119758);
  }

  public static a.i.b.a.c.b.a.c a(a.i.b.a.c.d.a.e.a parama, a.i.b.a.c.d.a.c.h paramh)
  {
    AppMethodBeat.i(119756);
    j.p(parama, "annotation");
    j.p(paramh, "c");
    Object localObject = parama.dWY();
    if (j.j(localObject, a.i.b.a.c.f.a.n(BlV)))
    {
      parama = (a.i.b.a.c.b.a.c)new i(parama, paramh);
      AppMethodBeat.o(119756);
    }
    while (true)
    {
      return parama;
      if (j.j(localObject, a.i.b.a.c.f.a.n(BlW)))
      {
        parama = (a.i.b.a.c.b.a.c)new h(parama, paramh);
        AppMethodBeat.o(119756);
      }
      else if (j.j(localObject, a.i.b.a.c.f.a.n(BlZ)))
      {
        localObject = g.Bag.BaU;
        j.o(localObject, "KotlinBuiltIns.FQ_NAMES.repeatable");
        parama = (a.i.b.a.c.b.a.c)new b(paramh, parama, (a.i.b.a.c.f.b)localObject);
        AppMethodBeat.o(119756);
      }
      else if (j.j(localObject, a.i.b.a.c.f.a.n(BlY)))
      {
        localObject = g.Bag.BaV;
        j.o(localObject, "KotlinBuiltIns.FQ_NAMES.mustBeDocumented");
        parama = (a.i.b.a.c.b.a.c)new b(paramh, parama, (a.i.b.a.c.f.b)localObject);
        AppMethodBeat.o(119756);
      }
      else if (j.j(localObject, a.i.b.a.c.f.a.n(BlX)))
      {
        parama = null;
        AppMethodBeat.o(119756);
      }
      else
      {
        parama = (a.i.b.a.c.b.a.c)new a.i.b.a.c.d.a.c.a.e(paramh, parama);
        AppMethodBeat.o(119756);
      }
    }
  }

  public static a.i.b.a.c.b.a.c a(a.i.b.a.c.f.b paramb, d paramd, a.i.b.a.c.d.a.c.h paramh)
  {
    AppMethodBeat.i(119757);
    j.p(paramb, "kotlinName");
    j.p(paramd, "annotationOwner");
    j.p(paramh, "c");
    if (j.j(paramb, g.Bag.BaK))
    {
      a.i.b.a.c.d.a.e.a locala = paramd.m(BlX);
      if (locala != null)
      {
        paramb = (a.i.b.a.c.b.a.c)new e(locala, paramh);
        AppMethodBeat.o(119757);
      }
    }
    while (true)
    {
      return paramb;
      paramb = (a.i.b.a.c.f.b)Bmd.get(paramb);
      if (paramb != null)
      {
        paramb = paramd.m(paramb);
        if (paramb != null)
        {
          paramb = a(paramb, paramh);
          AppMethodBeat.o(119757);
        }
        else
        {
          AppMethodBeat.o(119757);
          paramb = null;
        }
      }
      else
      {
        AppMethodBeat.o(119757);
        paramb = null;
      }
    }
  }

  public static f ebi()
  {
    return Bma;
  }

  public static f ebj()
  {
    return Bmb;
  }

  public static f ebk()
  {
    return Bmc;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.d.a.a.c
 * JD-Core Version:    0.6.2
 */