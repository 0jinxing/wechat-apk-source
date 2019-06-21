package a.i.b.a.c.d.a.c.b;

import a.i.b.a.c.d.a.a.l;
import a.i.b.a.c.d.a.c.h;
import a.i.b.a.c.d.a.c.m;
import a.i.b.a.c.d.a.e.u;
import a.i.b.a.c.d.a.e.v;
import a.i.b.a.c.l.ad;
import a.i.b.a.c.l.an;
import a.i.b.a.c.l.ap;
import a.i.b.a.c.l.ba;
import a.i.b.a.c.l.p;
import a.i.b.a.c.l.x;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class c
{
  private final h Bnn;
  private final m Bnw;

  public c(h paramh, m paramm)
  {
    AppMethodBeat.i(120049);
    this.Bnn = paramh;
    this.Bnw = paramm;
    AppMethodBeat.o(120049);
  }

  private final a.i.b.a.c.b.e a(a.i.b.a.c.d.a.e.j paramj, a parama, a.i.b.a.c.f.b paramb)
  {
    AppMethodBeat.i(120044);
    if ((parama.BoY) && (a.f.b.j.j(paramb, d.ebx())))
    {
      paramj = this.Bnn.Bnv.Bnd.dXS();
      AppMethodBeat.o(120044);
    }
    while (true)
    {
      return paramj;
      a.i.b.a.c.a.b.c localc = a.i.b.a.c.a.b.c.Bdq;
      paramb = a.i.b.a.c.a.b.c.a(paramb, this.Bnn.Bnv.BcH.dZD());
      if (paramb == null)
      {
        paramj = null;
        AppMethodBeat.o(120044);
      }
      else if ((a.i.b.a.c.a.b.c.i(paramb)) && ((parama.BoX == b.Bpc) || (parama.BoW == l.Bmv) || (a(paramj, paramb))))
      {
        paramj = a.i.b.a.c.a.b.c.k(paramb);
        AppMethodBeat.o(120044);
      }
      else
      {
        AppMethodBeat.o(120044);
        paramj = paramb;
      }
    }
  }

  private final ad a(a.i.b.a.c.d.a.e.j paramj, a parama, ad paramad)
  {
    an localan = null;
    AppMethodBeat.i(120041);
    Object localObject2;
    if (paramad != null)
    {
      localObject1 = paramad.dYn();
      localObject2 = localObject1;
      if (localObject1 != null);
    }
    else
    {
      localObject2 = (a.i.b.a.c.b.a.g)new a.i.b.a.c.d.a.c.e(this.Bnn, (a.i.b.a.c.d.a.e.d)paramj);
    }
    Object localObject1 = b(paramj, parama);
    if (localObject1 == null)
    {
      AppMethodBeat.o(120041);
      paramj = localan;
    }
    while (true)
    {
      return paramj;
      boolean bool = a(parama);
      if (paramad != null);
      for (localan = paramad.ejw(); ; localan = null)
      {
        if ((!a.f.b.j.j(localan, localObject1)) || (paramj.ebN()) || (!bool))
          break label130;
        paramj = paramad.rL(true);
        AppMethodBeat.o(120041);
        break;
      }
      label130: paramj = x.c((a.i.b.a.c.b.a.g)localObject2, (an)localObject1, a(paramj, parama, (an)localObject1), bool);
      AppMethodBeat.o(120041);
    }
  }

  private final an a(a.i.b.a.c.d.a.e.j paramj)
  {
    AppMethodBeat.i(120043);
    paramj = a.i.b.a.c.f.a.n(new a.i.b.a.c.f.b(paramj.ebO()));
    a.f.b.j.o(paramj, "ClassId.topLevel(FqName(…classifierQualifiedName))");
    paramj = this.Bnn.Bnv.BmT.ecp().Bcm.a(paramj, a.a.j.listOf(Integer.valueOf(0))).dXY();
    a.f.b.j.o(paramj, "c.components.deserialize…istOf(0)).typeConstructor");
    AppMethodBeat.o(120043);
    return paramj;
  }

  private final ap a(v paramv, a parama, a.i.b.a.c.b.ar paramar)
  {
    AppMethodBeat.i(120047);
    v localv;
    if ((paramv instanceof a.i.b.a.c.d.a.e.z))
    {
      localv = ((a.i.b.a.c.d.a.e.z)paramv).ecd();
      if (((a.i.b.a.c.d.a.e.z)paramv).ece())
      {
        paramv = ba.BKj;
        if ((localv != null) && (!a(paramv, paramar)))
          break label72;
        paramv = d.a(paramar, parama);
        AppMethodBeat.o(120047);
      }
    }
    while (true)
    {
      return paramv;
      paramv = ba.BKi;
      break;
      label72: paramv = a.i.b.a.c.l.c.a.a(a(localv, d.a(l.Bmw, false, null, 3)), paramv, paramar);
      AppMethodBeat.o(120047);
      continue;
      paramv = (ap)new a.i.b.a.c.l.ar(ba.BKh, a(paramv, parama));
      AppMethodBeat.o(120047);
    }
  }

  private final a.i.b.a.c.l.w a(a.i.b.a.c.d.a.e.j paramj, a parama)
  {
    AppMethodBeat.i(120040);
    c.c localc = new c.c(paramj);
    int i;
    boolean bool;
    if ((!parama.BoY) && (parama.BoW != l.Bmv))
    {
      i = 1;
      bool = paramj.ebN();
      if ((bool) || (i != 0))
        break label101;
      paramj = a(paramj, parama, null);
      if (paramj == null)
        break label84;
      paramj = (a.i.b.a.c.l.w)paramj;
      AppMethodBeat.o(120040);
    }
    while (true)
    {
      return paramj;
      i = 0;
      break;
      label84: paramj = (a.i.b.a.c.l.w)localc.ebw();
      AppMethodBeat.o(120040);
      continue;
      label101: ad localad = a(paramj, parama.a(b.Bpc), null);
      if (localad == null)
      {
        paramj = (a.i.b.a.c.l.w)localc.ebw();
        AppMethodBeat.o(120040);
      }
      else
      {
        paramj = a(paramj, parama.a(b.Bpb), localad);
        if (paramj == null)
        {
          paramj = (a.i.b.a.c.l.w)localc.ebw();
          AppMethodBeat.o(120040);
        }
        else if (bool)
        {
          paramj = (a.i.b.a.c.l.w)new g(localad, paramj);
          AppMethodBeat.o(120040);
        }
        else
        {
          paramj = (a.i.b.a.c.l.w)x.a(localad, paramj);
          AppMethodBeat.o(120040);
        }
      }
    }
  }

  private final List<ap> a(a.i.b.a.c.d.a.e.j paramj, a parama, an paraman)
  {
    AppMethodBeat.i(120046);
    boolean bool = paramj.ebN();
    int i;
    Object localObject1;
    Object localObject2;
    label101: a.i.b.a.c.b.ar localar;
    Object localObject3;
    if ((bool) || ((paramj.ebM().isEmpty()) && (!paraman.getParameters().isEmpty())))
    {
      i = 1;
      localObject1 = paraman.getParameters();
      a.f.b.j.o(localObject1, "constructor.parameters");
      if (i == 0)
        break label237;
      paramj = (Iterable)localObject1;
      localObject1 = (Collection)new ArrayList(a.a.j.d(paramj));
      localObject2 = paramj.iterator();
      if (!((Iterator)localObject2).hasNext())
        break label217;
      localar = (a.i.b.a.c.b.ar)((Iterator)localObject2).next();
      localObject3 = new a.i.b.a.c.l.z(this.Bnn.Bnv.Baf, (a.f.a.a)new c.b(localar, this, parama, paraman, bool));
      paramj = e.Bpq;
      a.f.b.j.o(localar, "parameter");
      if (!bool)
        break label206;
    }
    label206: for (paramj = parama; ; paramj = parama.a(b.Bpa))
    {
      ((Collection)localObject1).add(e.a(localar, paramj, (a.i.b.a.c.l.w)localObject3));
      break label101;
      i = 0;
      break;
    }
    label217: paramj = a.a.j.m((Iterable)localObject1);
    AppMethodBeat.o(120046);
    while (true)
    {
      return paramj;
      label237: if (((List)localObject1).size() != paramj.ebM().size())
      {
        parama = (Iterable)localObject1;
        paramj = (Collection)new ArrayList(a.a.j.d(parama));
        paraman = parama.iterator();
        while (paraman.hasNext())
        {
          parama = (a.i.b.a.c.b.ar)paraman.next();
          a.f.b.j.o(parama, "p");
          paramj.add(new a.i.b.a.c.l.ar((a.i.b.a.c.l.w)p.awn(parama.dZg().name)));
        }
        paramj = a.a.j.m((Iterable)paramj);
        AppMethodBeat.o(120046);
      }
      else
      {
        parama = a.a.j.p((Iterable)paramj.ebM());
        paramj = (Collection)new ArrayList(a.a.j.d(parama));
        parama = parama.iterator();
        while (parama.hasNext())
        {
          paraman = (a.a.y)parama.next();
          int j = paraman.index;
          localObject3 = (v)paraman.value;
          if (j < ((List)localObject1).size());
          for (i = 1; (a.aa.AUz) && (i == 0); i = 0)
          {
            paramj = (Throwable)new AssertionError("Argument index should be less then type parameters count, but " + j + " > " + ((List)localObject1).size());
            AppMethodBeat.o(120046);
            throw paramj;
          }
          paraman = (a.i.b.a.c.b.ar)((List)localObject1).get(j);
          localObject2 = d.a(l.Bmw, false, null, 3);
          a.f.b.j.o(paraman, "parameter");
          paramj.add(a((v)localObject3, (a)localObject2, paraman));
        }
        paramj = a.a.j.m((Iterable)paramj);
        AppMethodBeat.o(120046);
      }
    }
  }

  private static boolean a(a parama)
  {
    boolean bool1 = false;
    boolean bool2;
    if (parama.BoX == b.Bpc)
      bool2 = bool1;
    while (true)
    {
      return bool2;
      bool2 = bool1;
      if (!parama.BoY)
      {
        bool2 = bool1;
        if (parama.BoW != l.Bmv)
          bool2 = true;
      }
    }
  }

  private static boolean a(a.i.b.a.c.d.a.e.j paramj, a.i.b.a.c.b.e parame)
  {
    AppMethodBeat.i(120045);
    c.a locala = c.a.Bpe;
    boolean bool;
    if (!c.a.a((v)a.a.j.fM(paramj.ebM())))
    {
      AppMethodBeat.o(120045);
      bool = false;
    }
    while (true)
    {
      return bool;
      paramj = a.i.b.a.c.a.b.c.Bdq;
      paramj = a.i.b.a.c.a.b.c.k(parame).dXY();
      a.f.b.j.o(paramj, "JavaToKotlinClassMap.con…         .typeConstructor");
      paramj = paramj.getParameters();
      a.f.b.j.o(paramj, "JavaToKotlinClassMap.con…ypeConstructor.parameters");
      paramj = (a.i.b.a.c.b.ar)a.a.j.fM(paramj);
      if (paramj != null)
      {
        paramj = paramj.dZh();
        if (paramj != null);
      }
      else
      {
        AppMethodBeat.o(120045);
        bool = false;
        continue;
      }
      a.f.b.j.o(paramj, "JavaToKotlinClassMap.con….variance ?: return false");
      if (paramj != ba.BKj)
      {
        bool = true;
        AppMethodBeat.o(120045);
      }
      else
      {
        AppMethodBeat.o(120045);
        bool = false;
      }
    }
  }

  private static boolean a(ba paramba, a.i.b.a.c.b.ar paramar)
  {
    boolean bool = false;
    AppMethodBeat.i(120048);
    if (paramar.dZh() == ba.BKh)
      AppMethodBeat.o(120048);
    while (true)
    {
      return bool;
      if (paramba != paramar.dZh())
      {
        bool = true;
        AppMethodBeat.o(120048);
      }
      else
      {
        AppMethodBeat.o(120048);
      }
    }
  }

  private final an b(a.i.b.a.c.d.a.e.j paramj, a parama)
  {
    AppMethodBeat.i(120042);
    a.i.b.a.c.d.a.e.i locali = paramj.ebL();
    if (locali == null)
    {
      paramj = a(paramj);
      AppMethodBeat.o(120042);
    }
    while (true)
    {
      return paramj;
      if ((locali instanceof a.i.b.a.c.d.a.e.g))
      {
        Object localObject = ((a.i.b.a.c.d.a.e.g)locali).dZF();
        if (localObject == null)
        {
          paramj = (Throwable)new AssertionError("Class type should have a FQ name: ".concat(String.valueOf(locali)));
          AppMethodBeat.o(120042);
          throw paramj;
        }
        localObject = a(paramj, parama, (a.i.b.a.c.f.b)localObject);
        parama = (a)localObject;
        if (localObject == null)
          parama = this.Bnn.Bnv.Bna.b((a.i.b.a.c.d.a.e.g)locali);
        if (parama != null)
        {
          parama = parama.dXY();
          if (parama != null);
        }
        else
        {
          paramj = a(paramj);
          AppMethodBeat.o(120042);
        }
      }
      else if ((locali instanceof a.i.b.a.c.d.a.e.w))
      {
        paramj = this.Bnw.a((a.i.b.a.c.d.a.e.w)locali);
        if (paramj != null)
        {
          paramj = paramj.dXY();
          AppMethodBeat.o(120042);
        }
        else
        {
          paramj = null;
          AppMethodBeat.o(120042);
        }
      }
      else
      {
        paramj = (Throwable)new IllegalStateException("Unknown classifier kind: ".concat(String.valueOf(locali)));
        AppMethodBeat.o(120042);
        throw paramj;
        AppMethodBeat.o(120042);
        paramj = parama;
      }
    }
  }

  public final a.i.b.a.c.l.w a(a.i.b.a.c.d.a.e.f paramf, a parama, boolean paramBoolean)
  {
    AppMethodBeat.i(120039);
    a.f.b.j.p(paramf, "arrayType");
    a.f.b.j.p(parama, "attr");
    Object localObject = paramf.ebE();
    if (!(localObject instanceof u));
    for (paramf = null; ; paramf = (a.i.b.a.c.d.a.e.f)localObject)
    {
      paramf = (u)paramf;
      if (paramf != null)
      {
        paramf = paramf.eca();
        if (paramf == null)
          break label132;
        paramf = this.Bnn.Bnv.BcH.dZD().b(paramf);
        a.f.b.j.o(paramf, "c.module.builtIns.getPri…KotlinType(primitiveType)");
        if (!parama.BoY)
          break label110;
        paramf = (a.i.b.a.c.l.w)paramf;
        AppMethodBeat.o(120039);
      }
      while (true)
      {
        return paramf;
        paramf = null;
        break;
        label110: paramf = (a.i.b.a.c.l.w)x.a(paramf, paramf.rL(true));
        AppMethodBeat.o(120039);
        continue;
        label132: localObject = a((v)localObject, d.a(l.Bmw, parama.BoY, null, 2));
        if (parama.BoY)
        {
          if (paramBoolean);
          for (paramf = ba.BKj; ; paramf = ba.BKh)
          {
            paramf = this.Bnn.Bnv.BcH.dZD().a(paramf, (a.i.b.a.c.l.w)localObject);
            a.f.b.j.o(paramf, "c.module.builtIns.getArr…ctionKind, componentType)");
            paramf = (a.i.b.a.c.l.w)paramf;
            AppMethodBeat.o(120039);
            break;
          }
        }
        paramf = this.Bnn.Bnv.BcH.dZD().a(ba.BKh, (a.i.b.a.c.l.w)localObject);
        a.f.b.j.o(paramf, "c.module.builtIns.getArr…INVARIANT, componentType)");
        paramf = (a.i.b.a.c.l.w)x.a(paramf, this.Bnn.Bnv.BcH.dZD().a(ba.BKj, (a.i.b.a.c.l.w)localObject).rL(true));
        AppMethodBeat.o(120039);
      }
    }
  }

  public final a.i.b.a.c.l.w a(v paramv, a parama)
  {
    AppMethodBeat.i(120038);
    a.f.b.j.p(paramv, "javaType");
    a.f.b.j.p(parama, "attr");
    if ((paramv instanceof u))
    {
      paramv = ((u)paramv).eca();
      if (paramv != null)
      {
        paramv = this.Bnn.Bnv.BcH.dZD().a(paramv);
        a.f.b.j.o(paramv, "if (primitiveType != nul….module.builtIns.unitType");
        paramv = (a.i.b.a.c.l.w)paramv;
        AppMethodBeat.o(120038);
      }
    }
    while (true)
    {
      return paramv;
      paramv = this.Bnn.Bnv.BcH.dZD().dXO();
      break;
      if ((paramv instanceof a.i.b.a.c.d.a.e.j))
      {
        paramv = a((a.i.b.a.c.d.a.e.j)paramv, parama);
        AppMethodBeat.o(120038);
      }
      else if ((paramv instanceof a.i.b.a.c.d.a.e.f))
      {
        paramv = a((a.i.b.a.c.d.a.e.f)paramv, parama, false);
        AppMethodBeat.o(120038);
      }
      else if ((paramv instanceof a.i.b.a.c.d.a.e.z))
      {
        paramv = ((a.i.b.a.c.d.a.e.z)paramv).ecd();
        if (paramv != null)
        {
          paramv = a(paramv, parama);
          if (paramv != null);
        }
        else
        {
          paramv = this.Bnn.Bnv.BcH.dZD().dXN();
          a.f.b.j.o(paramv, "c.module.builtIns.defaultBound");
          paramv = (a.i.b.a.c.l.w)paramv;
          AppMethodBeat.o(120038);
        }
      }
      else
      {
        paramv = (Throwable)new UnsupportedOperationException("Unsupported type: ".concat(String.valueOf(paramv)));
        AppMethodBeat.o(120038);
        throw paramv;
        AppMethodBeat.o(120038);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.d.a.c.b.c
 * JD-Core Version:    0.6.2
 */