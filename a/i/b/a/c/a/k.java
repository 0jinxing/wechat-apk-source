package a.i.b.a.c.a;

import a.aa;
import a.i.b.a.c.b.a.g.a;
import a.i.b.a.c.b.am;
import a.i.b.a.c.b.ay;
import a.i.b.a.c.b.c.ah;
import a.i.b.a.c.b.c.m;
import a.i.b.a.c.b.l;
import a.i.b.a.c.b.y;
import a.i.b.a.c.f.c;
import a.i.b.a.c.i.d;
import a.i.b.a.c.l.ad;
import a.i.b.a.c.l.an;
import a.i.b.a.c.l.ap;
import a.i.b.a.c.l.ba;
import a.i.b.a.c.l.c.a;
import a.i.b.a.c.l.p;
import a.i.b.a.c.l.x;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class k
{
  private static final a.i.b.a.c.b.c.w Bct;
  private static final a.i.b.a.c.b.c.w Bcu;

  static
  {
    AppMethodBeat.i(119114);
    Object localObject1 = p.ekj();
    a.f.b.j.o(localObject1, "ErrorUtils.getErrorModule()");
    Object localObject2 = d.BDT;
    a.f.b.j.o(localObject2, "DescriptorUtils.COROUTIN…KAGE_FQ_NAME_EXPERIMENTAL");
    Object localObject3 = new a.i.b.a.c.b.c.w((l)new m((y)localObject1, (a.i.b.a.c.f.b)localObject2), a.i.b.a.c.b.f.Bes, d.BDV.ByQ.ehK(), am.BeR, a.i.b.a.c.k.b.BIH);
    ((a.i.b.a.c.b.c.w)localObject3).b(a.i.b.a.c.b.w.BeE);
    ((a.i.b.a.c.b.c.w)localObject3).BhQ = ay.Bfa;
    localObject2 = (l)localObject3;
    localObject1 = a.i.b.a.c.b.a.g.BfJ;
    ((a.i.b.a.c.b.c.w)localObject3).fV(a.a.j.listOf(ah.a((l)localObject2, g.a.eai(), ba.BKi, a.i.b.a.c.f.f.avX("T"), 0)));
    ((a.i.b.a.c.b.c.w)localObject3).eaF();
    Bct = (a.i.b.a.c.b.c.w)localObject3;
    localObject1 = p.ekj();
    a.f.b.j.o(localObject1, "ErrorUtils.getErrorModule()");
    localObject2 = d.BDS;
    a.f.b.j.o(localObject2, "DescriptorUtils.COROUTINES_PACKAGE_FQ_NAME_RELEASE");
    localObject2 = new a.i.b.a.c.b.c.w((l)new m((y)localObject1, (a.i.b.a.c.f.b)localObject2), a.i.b.a.c.b.f.Bes, d.BDW.ByQ.ehK(), am.BeR, a.i.b.a.c.k.b.BIH);
    ((a.i.b.a.c.b.c.w)localObject2).b(a.i.b.a.c.b.w.BeE);
    ((a.i.b.a.c.b.c.w)localObject2).BhQ = ay.Bfa;
    localObject1 = (l)localObject2;
    localObject3 = a.i.b.a.c.b.a.g.BfJ;
    ((a.i.b.a.c.b.c.w)localObject2).fV(a.a.j.listOf(ah.a((l)localObject1, g.a.eai(), ba.BKi, a.i.b.a.c.f.f.avX("T"), 0)));
    ((a.i.b.a.c.b.c.w)localObject2).eaF();
    Bcu = (a.i.b.a.c.b.c.w)localObject2;
    AppMethodBeat.o(119114);
  }

  public static final ad F(a.i.b.a.c.l.w paramw)
  {
    AppMethodBeat.i(119112);
    a.f.b.j.p(paramw, "suspendFunType");
    boolean bool = f.e(paramw);
    if ((aa.AUz) && (!bool))
    {
      paramw = (Throwable)new AssertionError("This type should be suspend function type: ".concat(String.valueOf(paramw)));
      AppMethodBeat.o(119112);
      throw paramw;
    }
    g localg = a.aL(paramw);
    a.i.b.a.c.b.a.g localg1 = paramw.dYn();
    a.i.b.a.c.l.w localw = f.h(paramw);
    Object localObject1 = (Iterable)f.j(paramw);
    Object localObject2 = (Collection)new ArrayList(a.a.j.d((Iterable)localObject1));
    localObject1 = ((Iterable)localObject1).iterator();
    while (((Iterator)localObject1).hasNext())
      ((Collection)localObject2).add(((ap)((Iterator)localObject1).next()).dZS());
    localObject2 = (Collection)localObject2;
    localObject1 = a.i.b.a.c.b.a.g.BfJ;
    localObject1 = g.a.eai();
    an localan = Bct.dXY();
    a.f.b.j.o(localan, "if (isReleaseCoroutines)…ERIMENTAL.typeConstructor");
    localObject1 = a.a.j.a((Collection)localObject2, x.c((a.i.b.a.c.b.a.g)localObject1, localan, a.a.j.listOf(a.aM(f.i(paramw))), false));
    localObject2 = a.aL(paramw).dXN();
    a.f.b.j.o(localObject2, "suspendFunType.builtIns.nullableAnyType");
    paramw = f.a(localg, localg1, localw, (List)localObject1, (a.i.b.a.c.l.w)localObject2).rL(paramw.eci());
    AppMethodBeat.o(119112);
    return paramw;
  }

  public static final boolean a(a.i.b.a.c.f.b paramb, boolean paramBoolean)
  {
    AppMethodBeat.i(119113);
    if (paramBoolean)
    {
      paramBoolean = a.f.b.j.j(paramb, d.BDW);
      AppMethodBeat.o(119113);
    }
    while (true)
    {
      return paramBoolean;
      paramBoolean = a.f.b.j.j(paramb, d.BDV);
      AppMethodBeat.o(119113);
    }
  }

  public static final a.i.b.a.c.b.c.w dXU()
  {
    return Bct;
  }

  public static final a.i.b.a.c.b.c.w dXV()
  {
    return Bcu;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.a.k
 * JD-Core Version:    0.6.2
 */