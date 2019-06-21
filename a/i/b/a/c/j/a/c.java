package a.i.b.a.c.j.a;

import a.a.ad;
import a.i.b.a.c.b.aa;
import a.i.b.a.c.b.am;
import a.i.b.a.c.b.au;
import a.i.b.a.c.b.y;
import a.i.b.a.c.e.a.a;
import a.i.b.a.c.e.a.a.a;
import a.i.b.a.c.e.a.a.a.b;
import a.i.b.a.c.e.a.b;
import a.i.b.a.c.e.a.b.a;
import a.i.b.a.c.i.b.i;
import a.i.b.a.c.i.b.j.a;
import a.i.b.a.c.i.b.k;
import a.i.b.a.c.i.b.t;
import a.i.b.a.c.i.b.u;
import a.i.b.a.c.i.b.v;
import a.i.b.a.c.l.ar;
import a.i.b.a.c.l.ba;
import a.i.b.a.c.l.x;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class c
{
  private final y BcH;
  private final aa Bcm;

  public c(y paramy, aa paramaa)
  {
    AppMethodBeat.i(122247);
    this.BcH = paramy;
    this.Bcm = paramaa;
    AppMethodBeat.o(122247);
  }

  private a.i.b.a.c.i.b.f<?> a(a.i.b.a.c.l.w paramw, a.a.a.b paramb, a.i.b.a.c.e.a.c paramc)
  {
    int i = 1;
    int j = 0;
    AppMethodBeat.i(122245);
    a.f.b.j.p(paramw, "expectedType");
    a.f.b.j.p(paramb, "value");
    a.f.b.j.p(paramc, "nameResolver");
    Object localObject1 = b.Bxd.Ug(paramb.BsW);
    a.f.b.j.o(localObject1, "Flags.IS_UNSIGNED.get(value.flags)");
    boolean bool = ((Boolean)localObject1).booleanValue();
    localObject1 = paramb.BsM;
    if (localObject1 == null);
    while (true)
    {
      paramw = (Throwable)new IllegalStateException(("Unsupported annotation argument type: " + paramb.BsM + " (expected " + paramw + ')').toString());
      AppMethodBeat.o(122245);
      throw paramw;
      switch (d.eQZ[localObject1.ordinal()])
      {
      default:
      case 1:
      case 2:
      case 3:
      case 4:
      case 5:
      case 6:
      case 7:
      case 8:
      case 9:
      case 10:
      case 11:
      case 12:
      case 13:
      }
    }
    byte b = (byte)(int)paramb.BsN;
    if (bool)
    {
      paramc = new t(b);
      paramc = (a.i.b.a.c.i.b.f)paramc;
      label227: if (!a.i.b.a.c.l.c.a.c(paramc.b(this.BcH), paramw))
        break label1502;
      AppMethodBeat.o(122245);
    }
    while (true)
    {
      return paramc;
      paramc = new a.i.b.a.c.i.b.d(b);
      break;
      paramc = (a.i.b.a.c.i.b.f)new a.i.b.a.c.i.b.e((char)(int)paramb.BsN);
      break label227;
      short s = (short)(int)paramb.BsN;
      if (bool);
      for (paramc = new a.i.b.a.c.i.b.w(s); ; paramc = new a.i.b.a.c.i.b.r(s))
      {
        paramc = (a.i.b.a.c.i.b.f)paramc;
        break;
      }
      j = (int)paramb.BsN;
      if (bool);
      for (paramc = new u(j); ; paramc = new a.i.b.a.c.i.b.l(j))
      {
        paramc = (a.i.b.a.c.i.b.f)paramc;
        break;
      }
      long l = paramb.BsN;
      if (bool);
      for (paramc = new v(l); ; paramc = new a.i.b.a.c.i.b.p(l))
      {
        paramc = (a.i.b.a.c.i.b.f)paramc;
        break;
      }
      paramc = (a.i.b.a.c.i.b.f)new k(paramb.BsO);
      break label227;
      paramc = (a.i.b.a.c.i.b.f)new a.i.b.a.c.i.b.h(paramb.BsP);
      break label227;
      if (paramb.BsN != 0L);
      for (bool = true; ; bool = false)
      {
        paramc = (a.i.b.a.c.i.b.f)new a.i.b.a.c.i.b.c(bool);
        break;
      }
      paramc = (a.i.b.a.c.i.b.f)new a.i.b.a.c.i.b.s(paramc.getString(paramb.BsQ));
      break label227;
      paramc = r.a(paramc, paramb.BsR);
      i = paramb.BsV;
      paramc = f(paramc).dZf();
      a.f.b.j.o(paramc, "resolveClass(classId).defaultType");
      paramc = a.i.b.a.c.l.c.a.aN((a.i.b.a.c.l.w)paramc);
      while (j < i)
      {
        paramc = dZD().a(ba.BKh, paramc);
        a.f.b.j.o(paramc, "builtIns.getArrayType(Variance.INVARIANT, type)");
        paramc = (a.i.b.a.c.l.w)paramc;
        j++;
      }
      localObject1 = a.i.b.a.c.f.a.n(a.i.b.a.c.a.g.Bag.Bbo.ehI());
      a.f.b.j.o(localObject1, "ClassId.topLevel(KotlinB…FQ_NAMES.kClass.toSafe())");
      Object localObject2 = f((a.i.b.a.c.f.a)localObject1);
      localObject1 = a.i.b.a.c.b.a.g.BfJ;
      paramc = (a.i.b.a.c.i.b.f)new a.i.b.a.c.i.b.o((a.i.b.a.c.l.w)x.a(a.i.b.a.c.b.a.g.a.eai(), (a.i.b.a.c.b.e)localObject2, a.a.j.listOf(new ar(paramc))));
      break label227;
      paramc = (a.i.b.a.c.i.b.f)new i(r.a(paramc, paramb.BsR), r.b(paramc, paramb.BsS));
      break label227;
      localObject1 = paramb.BsT;
      a.f.b.j.o(localObject1, "value.annotation");
      paramc = (a.i.b.a.c.i.b.f)new a.i.b.a.c.i.b.a(b((a.a)localObject1, paramc));
      break label227;
      Object localObject3;
      label761: Object localObject4;
      if ((a.i.b.a.c.a.g.n(paramw)) || (a.i.b.a.c.a.g.o(paramw)))
      {
        j = 1;
        localObject3 = paramb.BsU;
        a.f.b.j.o(localObject3, "arrayElements");
        if (((Collection)localObject3).isEmpty())
          break label854;
        if (i == 0)
          break label1427;
        localObject1 = a.a.j.fJ((List)localObject3);
        a.f.b.j.o(localObject1, "arrayElements.first()");
        localObject1 = (a.a.a.b)localObject1;
        localObject2 = dZD();
        localObject4 = ((a.a.a.b)localObject1).BsM;
        if (localObject4 != null)
          break label860;
      }
      while (true)
      {
        paramw = (Throwable)new IllegalStateException(("Unknown type: " + ((a.a.a.b)localObject1).BsM).toString());
        AppMethodBeat.o(122245);
        throw paramw;
        j = 0;
        break;
        label854: i = 0;
        break label761;
        label860: switch (d.pCY[localObject4.ordinal()])
        {
        default:
        case 1:
        case 2:
        case 3:
        case 4:
        case 5:
        case 6:
        case 7:
        case 8:
        case 9:
        case 10:
        case 11:
        case 12:
        case 13:
        }
      }
      localObject1 = ((a.i.b.a.c.a.g)localObject2).a(a.i.b.a.c.a.h.BbS);
      a.f.b.j.o(localObject1, "byteType");
      localObject2 = dZD().m((a.i.b.a.c.l.w)localObject1);
      if (localObject2 != null)
      {
        localObject1 = (a.i.b.a.c.l.w)localObject2;
        label983: localObject4 = dZD();
        if (j == 0)
          break label1478;
      }
      label1427: label1478: for (localObject2 = paramw; ; localObject2 = localObject1)
      {
        localObject2 = ((a.i.b.a.c.a.g)localObject4).l((a.i.b.a.c.l.w)localObject2);
        a.f.b.j.o(localObject2, "builtIns.getArrayElement…ype else actualArrayType)");
        localObject4 = a.i.b.a.c.i.b.g.BEO;
        localObject4 = (Iterable)localObject3;
        localObject3 = (Collection)new ArrayList(a.a.j.d((Iterable)localObject4));
        localObject4 = ((Iterable)localObject4).iterator();
        while (((Iterator)localObject4).hasNext())
        {
          a.a.a.b localb = (a.a.a.b)((Iterator)localObject4).next();
          a.f.b.j.o(localb, "it");
          ((Collection)localObject3).add(a((a.i.b.a.c.l.w)localObject2, localb, paramc));
        }
        localObject1 = ((a.i.b.a.c.a.g)localObject2).a(a.i.b.a.c.a.h.BbR);
        a.f.b.j.o(localObject1, "charType");
        break;
        localObject1 = ((a.i.b.a.c.a.g)localObject2).a(a.i.b.a.c.a.h.BbT);
        a.f.b.j.o(localObject1, "shortType");
        break;
        localObject1 = ((a.i.b.a.c.a.g)localObject2).a(a.i.b.a.c.a.h.BbU);
        a.f.b.j.o(localObject1, "intType");
        break;
        localObject1 = ((a.i.b.a.c.a.g)localObject2).a(a.i.b.a.c.a.h.BbW);
        a.f.b.j.o(localObject1, "longType");
        break;
        localObject1 = ((a.i.b.a.c.a.g)localObject2).a(a.i.b.a.c.a.h.BbV);
        a.f.b.j.o(localObject1, "floatType");
        break;
        localObject1 = ((a.i.b.a.c.a.g)localObject2).a(a.i.b.a.c.a.h.BbX);
        a.f.b.j.o(localObject1, "doubleType");
        break;
        localObject1 = ((a.i.b.a.c.a.g)localObject2).a(a.i.b.a.c.a.h.BbQ);
        a.f.b.j.o(localObject1, "booleanType");
        break;
        localObject1 = ((a.i.b.a.c.a.g)localObject2).dXP();
        a.f.b.j.o(localObject1, "stringType");
        break;
        paramw = (Throwable)new IllegalStateException("Arrays of class literals are not supported yet".toString());
        AppMethodBeat.o(122245);
        throw paramw;
        localObject1 = f(r.a(paramc, ((a.a.a.b)localObject1).BsR)).dZf();
        a.f.b.j.o(localObject1, "resolveClass(nameResolve…lue.classId)).defaultType");
        break;
        localObject1 = ((a.a.a.b)localObject1).BsT;
        a.f.b.j.o(localObject1, "value.annotation");
        localObject1 = f(r.a(paramc, ((a.a)localObject1).BsE)).dZf();
        a.f.b.j.o(localObject1, "resolveClass(nameResolve…notation.id)).defaultType");
        break;
        paramw = (Throwable)new IllegalStateException("Array of arrays is impossible".toString());
        AppMethodBeat.o(122245);
        throw paramw;
        localObject1 = dZD().a(ba.BKh, (a.i.b.a.c.l.w)localObject1);
        a.f.b.j.o(localObject1, "builtIns.getArrayType(Va…RIANT, actualElementType)");
        localObject1 = (a.i.b.a.c.l.w)localObject1;
        break label983;
        if (j != 0)
        {
          localObject1 = paramw;
          break label983;
        }
        localObject1 = dZD().a(ba.BKh, (a.i.b.a.c.l.w)dZD().dXM());
        a.f.b.j.o(localObject1, "builtIns.getArrayType(Va…ARIANT, builtIns.anyType)");
        localObject1 = (a.i.b.a.c.l.w)localObject1;
        break label983;
      }
      paramc = (a.i.b.a.c.i.b.f)a.i.b.a.c.i.b.g.a((List)localObject3, (a.i.b.a.c.l.w)localObject1);
      break label227;
      label1502: localObject1 = a.i.b.a.c.i.b.j.BET;
      paramc = (a.i.b.a.c.i.b.f)j.a.awi("Unexpected argument value: type " + paramc.b(this.BcH) + " is not a subtype of " + paramw + " (value.type = " + paramb.BsM + ')');
      AppMethodBeat.o(122245);
    }
  }

  private final a.o<a.i.b.a.c.f.f, a.i.b.a.c.i.b.f<?>> a(a.a.a parama, Map<a.i.b.a.c.f.f, ? extends au> paramMap, a.i.b.a.c.e.a.c paramc)
  {
    AppMethodBeat.i(122244);
    Object localObject = (au)paramMap.get(r.b(paramc, parama.BsJ));
    if (localObject == null)
    {
      parama = null;
      AppMethodBeat.o(122244);
    }
    while (true)
    {
      return parama;
      paramMap = r.b(paramc, parama.BsJ);
      localObject = ((au)localObject).dZS();
      a.f.b.j.o(localObject, "parameter.type");
      parama = parama.BsK;
      a.f.b.j.o(parama, "proto.value");
      parama = new a.o(paramMap, a((a.i.b.a.c.l.w)localObject, parama, paramc));
      AppMethodBeat.o(122244);
    }
  }

  private final a.i.b.a.c.a.g dZD()
  {
    AppMethodBeat.i(122242);
    a.i.b.a.c.a.g localg = this.BcH.dZD();
    AppMethodBeat.o(122242);
    return localg;
  }

  private final a.i.b.a.c.b.e f(a.i.b.a.c.f.a parama)
  {
    AppMethodBeat.i(122246);
    parama = a.i.b.a.c.b.s.a(this.BcH, parama, this.Bcm);
    AppMethodBeat.o(122246);
    return parama;
  }

  public final a.i.b.a.c.b.a.c b(a.a parama, a.i.b.a.c.e.a.c paramc)
  {
    AppMethodBeat.i(122243);
    a.f.b.j.p(parama, "proto");
    a.f.b.j.p(paramc, "nameResolver");
    a.i.b.a.c.b.e locale = f(r.a(paramc, parama.BsE));
    Object localObject1 = ad.emptyMap();
    if ((parama.getArgumentCount() != 0) && (!a.i.b.a.c.l.p.L((a.i.b.a.c.b.l)locale)) && (a.i.b.a.c.i.d.z((a.i.b.a.c.b.l)locale)))
    {
      Object localObject2 = locale.dYb();
      a.f.b.j.o(localObject2, "annotationClass.constructors");
      localObject2 = (a.i.b.a.c.b.d)a.a.j.i((Iterable)localObject2);
      if (localObject2 != null)
      {
        localObject1 = ((a.i.b.a.c.b.d)localObject2).dYV();
        a.f.b.j.o(localObject1, "constructor.valueParameters");
        localObject2 = (Iterable)localObject1;
        localObject1 = (Map)new LinkedHashMap(a.h.e.im(ad.SI(a.a.j.d((Iterable)localObject2)), 16));
        Object localObject3 = ((Iterable)localObject2).iterator();
        while (((Iterator)localObject3).hasNext())
        {
          localObject2 = ((Iterator)localObject3).next();
          au localau = (au)localObject2;
          a.f.b.j.o(localau, "it");
          ((Map)localObject1).put(localau.dZg(), localObject2);
        }
        parama = parama.BsF;
        a.f.b.j.o(parama, "proto.argumentList");
        localObject2 = (Iterable)parama;
        parama = (Collection)new ArrayList();
        localObject2 = ((Iterable)localObject2).iterator();
        while (((Iterator)localObject2).hasNext())
        {
          localObject3 = (a.a.a)((Iterator)localObject2).next();
          a.f.b.j.o(localObject3, "it");
          localObject3 = a((a.a.a)localObject3, (Map)localObject1, paramc);
          if (localObject3 != null)
            parama.add(localObject3);
        }
      }
    }
    for (parama = ad.v((Iterable)parama); ; parama = (a.a)localObject1)
    {
      parama = (a.i.b.a.c.b.a.c)new a.i.b.a.c.b.a.d((a.i.b.a.c.l.w)locale.dZf(), parama, am.BeR);
      AppMethodBeat.o(122243);
      return parama;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.j.a.c
 * JD-Core Version:    0.6.2
 */