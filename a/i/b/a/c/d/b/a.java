package a.i.b.a.c.d.b;

import a.i.b.a.c.b.am;
import a.i.b.a.c.e.a.aa;
import a.i.b.a.c.e.a.ae;
import a.i.b.a.c.e.a.ai;
import a.i.b.a.c.e.a.c.b;
import a.i.b.a.c.e.a.k;
import a.i.b.a.c.e.a.o;
import a.i.b.a.c.e.a.u;
import a.i.b.a.c.e.a.b.a;
import a.i.b.a.c.e.a.h;
import a.i.b.a.c.e.b.b.e;
import a.i.b.a.c.g.i.c;
import a.i.b.a.c.g.i.f;
import a.i.b.a.c.j.a.s;
import a.i.b.a.c.j.a.s.a;
import a.i.b.a.c.j.a.s.b;
import a.i.b.a.c.l.w;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public abstract class a<A, C>
  implements a.i.b.a.c.j.a.b<A, C>
{
  private static final Set<a.i.b.a.c.f.a> BqO = a.a.j.o((Iterable)localCollection);
  private static final a.a BqP = new a.a((byte)0);
  private final m BmS;
  private final a.i.b.a.c.k.c<n, a.c<A, C>> BqN;

  static
  {
    Object localObject = (Iterable)a.a.j.listOf(new a.i.b.a.c.f.b[] { a.i.b.a.c.d.a.p.Bll, a.i.b.a.c.d.a.p.Blo, a.i.b.a.c.d.a.p.Blp, new a.i.b.a.c.f.b("java.lang.annotation.Target"), new a.i.b.a.c.f.b("java.lang.annotation.Retention"), new a.i.b.a.c.f.b("java.lang.annotation.Documented") });
    Collection localCollection = (Collection)new ArrayList(a.a.j.d((Iterable)localObject));
    localObject = ((Iterable)localObject).iterator();
    while (((Iterator)localObject).hasNext())
      localCollection.add(a.i.b.a.c.f.a.n((a.i.b.a.c.f.b)((Iterator)localObject).next()));
  }

  public a(a.i.b.a.c.k.i parami, m paramm)
  {
    this.BmS = paramm;
    this.BqN = parami.f((a.f.a.b)new a.f(this));
  }

  private static n a(s.a parama)
  {
    Object localObject1 = null;
    Object localObject2 = parama.Bfq;
    parama = (s.a)localObject2;
    if (!(localObject2 instanceof p))
      parama = null;
    localObject2 = (p)parama;
    parama = localObject1;
    if (localObject2 != null)
      parama = ((p)localObject2).BrH;
    return parama;
  }

  private static n a(s params, n paramn)
  {
    if (paramn != null);
    while (true)
    {
      return paramn;
      if ((params instanceof s.a))
        paramn = a((s.a)params);
      else
        paramn = null;
    }
  }

  private final n a(s params, boolean paramBoolean1, boolean paramBoolean2, Boolean paramBoolean, boolean paramBoolean3)
  {
    if (paramBoolean1)
    {
      if (paramBoolean == null)
        throw ((Throwable)new IllegalStateException(("isConst should not be null for property (container=" + params + ')').toString()));
      if (((params instanceof s.a)) && (((s.a)params).BHv == a.c.b.BtG))
      {
        paramBoolean = this.BmS;
        params = ((s.a)params).BcB.p(a.i.b.a.c.f.f.avX("DefaultImpls"));
        a.f.b.j.o(params, "container.classId.create…EFAULT_IMPLS_CLASS_NAME))");
        params = paramBoolean.b(params);
      }
    }
    while (true)
    {
      return params;
      if ((paramBoolean.booleanValue()) && ((params instanceof s.b)))
      {
        am localam = params.Bfq;
        paramBoolean = localam;
        if (!(localam instanceof i))
          paramBoolean = null;
        paramBoolean = (i)paramBoolean;
        if (paramBoolean != null);
        for (paramBoolean = paramBoolean.Bry; ; paramBoolean = null)
        {
          if (paramBoolean == null)
            break label230;
          params = this.BmS;
          paramBoolean = paramBoolean.BrD;
          a.f.b.j.o(paramBoolean, "facadeClassName.internalName");
          paramBoolean = a.i.b.a.c.f.a.n(new a.i.b.a.c.f.b(a.k.m.a(paramBoolean, '/', '.')));
          a.f.b.j.o(paramBoolean, "ClassId.topLevel(FqName(…lName.replace('/', '.')))");
          params = params.b(paramBoolean);
          break;
        }
      }
      label230: if ((paramBoolean2) && ((params instanceof s.a)) && (((s.a)params).BHv == a.c.b.BtL))
      {
        paramBoolean = ((s.a)params).BHw;
        if ((paramBoolean != null) && ((paramBoolean.BHv == a.c.b.BtF) || (paramBoolean.BHv == a.c.b.BtH) || ((paramBoolean3) && ((paramBoolean.BHv == a.c.b.BtG) || (paramBoolean.BHv == a.c.b.BtJ)))))
          params = a(paramBoolean);
      }
      else if (((params instanceof s.b)) && ((params.Bfq instanceof i)))
      {
        params = params.Bfq;
        if (params == null)
          throw new a.v("null cannot be cast to non-null type org.jetbrains.kotlin.load.kotlin.JvmPackagePartSource");
        paramBoolean = (i)params;
        params = paramBoolean.BrB;
        if (params == null)
          params = this.BmS.b(paramBoolean.dWY());
      }
      else
      {
        params = null;
      }
    }
  }

  private static q a(a.u paramu, a.i.b.a.c.e.a.c paramc, h paramh, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    i.c localc = (i.c)paramu;
    Object localObject = a.i.b.a.c.e.b.b.BxC;
    a.f.b.j.o(localObject, "propertySignature");
    localObject = (b.e)a.i.b.a.c.e.a.f.a(localc, (i.f)localObject);
    if (localObject == null)
      paramu = null;
    while (true)
    {
      return paramu;
      if (paramBoolean1)
      {
        localObject = a.i.b.a.c.e.b.a.j.ByD;
        paramu = a.i.b.a.c.e.b.a.j.a(paramu, paramc, paramh, paramBoolean3);
        if (paramu == null)
        {
          paramu = null;
        }
        else
        {
          paramc = q.BrI;
          paramu = q.a.a((a.i.b.a.c.e.b.a.f)paramu);
        }
      }
      else if ((paramBoolean2) && (((b.e)localObject).egX()))
      {
        paramu = q.BrI;
        paramu = ((b.e)localObject).BxR;
        a.f.b.j.o(paramu, "signature.syntheticMethod");
        paramu = q.a.a(paramc, paramu);
      }
      else
      {
        paramu = null;
      }
    }
  }

  private static q a(a.i.b.a.c.g.q paramq, a.i.b.a.c.e.a.c paramc, h paramh, a.i.b.a.c.j.a.a parama, boolean paramBoolean)
  {
    if ((paramq instanceof a.i.b.a.c.e.a.e))
    {
      parama = q.BrI;
      parama = a.i.b.a.c.e.b.a.j.ByD;
      paramq = a.i.b.a.c.e.b.a.j.a((a.i.b.a.c.e.a.e)paramq, paramc, paramh);
      if (paramq != null)
        paramq = q.a.a((a.i.b.a.c.e.b.a.f)paramq);
    }
    while (true)
    {
      return paramq;
      paramq = null;
      continue;
      if ((paramq instanceof a.o))
      {
        parama = q.BrI;
        parama = a.i.b.a.c.e.b.a.j.ByD;
        paramq = a.i.b.a.c.e.b.a.j.a((a.o)paramq, paramc, paramh);
        if (paramq != null)
          paramq = q.a.a((a.i.b.a.c.e.b.a.f)paramq);
        else
          paramq = null;
      }
      else if ((paramq instanceof a.u))
      {
        Object localObject = (i.c)paramq;
        i.f localf = a.i.b.a.c.e.b.b.BxC;
        a.f.b.j.o(localf, "propertySignature");
        localObject = (b.e)a.i.b.a.c.e.a.f.a((i.c)localObject, localf);
        if (localObject == null)
          paramq = null;
        else
          switch (b.eQZ[parama.ordinal()])
          {
          default:
            paramq = null;
            break;
          case 1:
            if (((b.e)localObject).egY())
            {
              paramq = q.BrI;
              paramq = ((b.e)localObject).BxS;
              a.f.b.j.o(paramq, "signature.getter");
              paramq = q.a.a(paramc, paramq);
              continue;
            }
            paramq = null;
            break;
          case 2:
            if (((b.e)localObject).egZ())
            {
              paramq = q.BrI;
              paramq = ((b.e)localObject).BxT;
              a.f.b.j.o(paramq, "signature.setter");
              paramq = q.a.a(paramc, paramq);
              continue;
            }
            paramq = null;
            break;
          case 3:
            paramq = a((a.u)paramq, paramc, paramh, true, true, paramBoolean);
            break;
          }
      }
      else
      {
        paramq = null;
      }
    }
  }

  private final List<A> a(s params, q paramq, boolean paramBoolean1, boolean paramBoolean2, Boolean paramBoolean, boolean paramBoolean3)
  {
    params = a(params, a(params, paramBoolean1, paramBoolean2, paramBoolean, paramBoolean3));
    if (params == null)
      params = (List)a.a.v.AUP;
    while (true)
    {
      return params;
      paramq = (List)((a.c)this.BqN.am(params)).BqU.get(paramq);
      params = paramq;
      if (paramq == null)
        params = (List)a.a.v.AUP;
    }
  }

  private final List<A> a(s params, a.u paramu, a.b paramb)
  {
    Boolean localBoolean = a.i.b.a.c.e.a.b.BwP.Ug(paramu.BsW);
    a.f.b.j.o(localBoolean, "Flags.IS_CONST.get(proto.flags)");
    boolean bool1 = localBoolean.booleanValue();
    boolean bool2 = a.i.b.a.c.e.b.a.j.f(paramu);
    if (paramb == a.b.BqQ)
    {
      paramu = a(paramu, params.AWq, params.AWr, false, true, false, 40);
      if (paramu == null)
        params = (List)a.a.v.AUP;
    }
    while (true)
    {
      return params;
      params = a(this, params, paramu, true, Boolean.valueOf(bool1), bool2, 8);
      continue;
      paramu = a(paramu, params.AWq, params.AWr, true, false, false, 48);
      if (paramu == null)
      {
        params = (List)a.a.v.AUP;
      }
      else
      {
        boolean bool3 = a.k.m.a((CharSequence)paramu.signature, (CharSequence)"$delegate", false);
        if (paramb == a.b.BqS);
        for (boolean bool4 = true; ; bool4 = false)
        {
          if (bool3 == bool4)
            break label175;
          params = (List)a.a.v.AUP;
          break;
        }
        label175: params = a(params, paramu, true, true, Boolean.valueOf(bool1), bool2);
      }
    }
  }

  protected abstract n.a a(a.i.b.a.c.f.a parama, am paramam, List<A> paramList);

  protected abstract A a(a.i.b.a.c.e.a.a parama, a.i.b.a.c.e.a.c paramc);

  public final C a(s params, a.u paramu, w paramw)
  {
    boolean bool1 = true;
    a.f.b.j.p(params, "container");
    a.f.b.j.p(paramu, "proto");
    a.f.b.j.p(paramw, "expectedType");
    n localn = a(params, a(params, true, true, a.i.b.a.c.e.a.b.BwP.Ug(paramu.BsW), a.i.b.a.c.e.b.a.j.f(paramu)));
    if (localn == null)
      params = null;
    while (true)
    {
      return params;
      a.i.b.a.c.e.b.a.g localg = localn.dXA().Bsd;
      Object localObject = e.Brr;
      localObject = (a.i.b.a.c.e.a.a)e.ecr();
      a.f.b.j.p(localObject, "version");
      int i = ((a.i.b.a.c.e.a.a)localObject).major;
      int j = ((a.i.b.a.c.e.a.a)localObject).minor;
      int k = ((a.i.b.a.c.e.a.a)localObject).Bwp;
      boolean bool2;
      if (localg.major > i)
        bool2 = bool1;
      while (true)
      {
        params = a((a.i.b.a.c.g.q)paramu, params.AWq, params.AWr, a.i.b.a.c.j.a.a.BGz, bool2);
        if (params != null)
          break label212;
        params = null;
        break;
        if (localg.major >= i)
        {
          bool2 = bool1;
          if (localg.minor <= j)
            if (localg.minor >= j)
            {
              bool2 = bool1;
              if (localg.Bwp >= k)
                continue;
            }
        }
        else
        {
          bool2 = false;
        }
      }
      label212: paramu = ((a.c)this.BqN.am(localn)).BqV.get(params);
      if (paramu == null)
      {
        params = null;
      }
      else
      {
        params = a.i.b.a.c.a.m.BcG;
        params = paramu;
        if (a.i.b.a.c.a.m.G(paramw))
          params = dF(paramu);
      }
    }
  }

  public final List<A> a(a.aa paramaa, a.i.b.a.c.e.a.c paramc)
  {
    a.f.b.j.p(paramaa, "proto");
    a.f.b.j.p(paramc, "nameResolver");
    paramaa = paramaa.e(a.i.b.a.c.e.b.b.BxE);
    a.f.b.j.o(paramaa, "proto.getExtension(JvmProtoBuf.typeAnnotation)");
    Object localObject = (Iterable)paramaa;
    paramaa = (Collection)new ArrayList(a.a.j.d((Iterable)localObject));
    Iterator localIterator = ((Iterable)localObject).iterator();
    while (localIterator.hasNext())
    {
      localObject = (a.i.b.a.c.e.a.a)localIterator.next();
      a.f.b.j.o(localObject, "it");
      paramaa.add(a((a.i.b.a.c.e.a.a)localObject, paramc));
    }
    return (List)paramaa;
  }

  public final List<A> a(a.ae paramae, a.i.b.a.c.e.a.c paramc)
  {
    a.f.b.j.p(paramae, "proto");
    a.f.b.j.p(paramc, "nameResolver");
    paramae = paramae.e(a.i.b.a.c.e.b.b.BxG);
    a.f.b.j.o(paramae, "proto.getExtension(JvmPr….typeParameterAnnotation)");
    Object localObject = (Iterable)paramae;
    paramae = (Collection)new ArrayList(a.a.j.d((Iterable)localObject));
    Iterator localIterator = ((Iterable)localObject).iterator();
    while (localIterator.hasNext())
    {
      localObject = (a.i.b.a.c.e.a.a)localIterator.next();
      a.f.b.j.o(localObject, "it");
      paramae.add(a((a.i.b.a.c.e.a.a)localObject, paramc));
    }
    return (List)paramae;
  }

  public final List<A> a(s params, a.k paramk)
  {
    a.f.b.j.p(params, "container");
    a.f.b.j.p(paramk, "proto");
    Object localObject = q.BrI;
    paramk = params.AWq.getString(paramk.Buf);
    localObject = ((s.a)params).BcB.pq();
    a.f.b.j.o(localObject, "(container as ProtoConta…Class).classId.asString()");
    return a(this, params, q.a.iU(paramk, a.i.b.a.c.e.b.a.c.avV((String)localObject)), false, null, false, 60);
  }

  public final List<A> a(s params, a.u paramu)
  {
    a.f.b.j.p(params, "container");
    a.f.b.j.p(paramu, "proto");
    return a(params, paramu, a.b.BqR);
  }

  public final List<A> a(s params, a.i.b.a.c.g.q paramq, a.i.b.a.c.j.a.a parama)
  {
    a.f.b.j.p(params, "container");
    a.f.b.j.p(paramq, "proto");
    a.f.b.j.p(parama, "kind");
    if (parama == a.i.b.a.c.j.a.a.BGz)
      params = a(params, (a.u)paramq, a.b.BqQ);
    while (true)
    {
      return params;
      paramq = a(paramq, params.AWq, params.AWr, parama);
      if (paramq == null)
        params = (List)a.a.v.AUP;
      else
        params = a(this, params, paramq, false, null, false, 60);
    }
  }

  public final List<A> a(s params, a.i.b.a.c.g.q paramq, a.i.b.a.c.j.a.a parama, int paramInt, a.ai paramai)
  {
    a.f.b.j.p(params, "container");
    a.f.b.j.p(paramq, "callableProto");
    a.f.b.j.p(parama, "kind");
    a.f.b.j.p(paramai, "proto");
    parama = a(paramq, params.AWq, params.AWr, parama);
    int i;
    if (parama != null)
      if ((paramq instanceof a.o))
        if (a.i.b.a.c.e.a.g.f((a.o)paramq))
        {
          i = 1;
          paramq = q.BrI;
        }
    for (params = a(this, params, q.a.a(parama, i + paramInt), false, null, false, 60); ; params = (List)a.a.v.AUP)
    {
      return params;
      i = 0;
      break;
      if ((paramq instanceof a.u))
      {
        if (a.i.b.a.c.e.a.g.e((a.u)paramq))
        {
          i = 1;
          break;
        }
        i = 0;
        break;
      }
      if ((paramq instanceof a.i.b.a.c.e.a.e))
      {
        if (params == null)
          throw new a.v("null cannot be cast to non-null type org.jetbrains.kotlin.serialization.deserialization.ProtoContainer.Class");
        if (((s.a)params).BHv == a.c.b.BtH)
        {
          i = 2;
          break;
        }
        if (((s.a)params).BeM)
        {
          i = 1;
          break;
        }
        i = 0;
        break;
      }
      throw ((Throwable)new UnsupportedOperationException("Unsupported message: " + paramq.getClass()));
    }
  }

  public final List<A> b(s.a parama)
  {
    a.f.b.j.p(parama, "container");
    n localn = a(parama);
    if (localn == null)
      throw ((Throwable)new IllegalStateException(("Class for loading annotations is not found: " + parama.ejR()).toString()));
    ArrayList localArrayList = new ArrayList(1);
    parama = (n.c)new a.e(this, localArrayList);
    a.f.b.j.p(localn, "kotlinClass");
    localn.a(parama);
    return (List)localArrayList;
  }

  public final List<A> b(s params, a.u paramu)
  {
    a.f.b.j.p(params, "container");
    a.f.b.j.p(paramu, "proto");
    return a(params, paramu, a.b.BqS);
  }

  public final List<A> b(s params, a.i.b.a.c.g.q paramq, a.i.b.a.c.j.a.a parama)
  {
    a.f.b.j.p(params, "container");
    a.f.b.j.p(paramq, "proto");
    a.f.b.j.p(parama, "kind");
    paramq = a(paramq, params.AWq, params.AWr, parama);
    if (paramq != null)
      parama = q.BrI;
    for (params = a(this, params, q.a.a(paramq, 0), false, null, false, 60); ; params = (List)a.a.v.AUP)
      return params;
  }

  protected abstract C dF(C paramC);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.d.b.a
 * JD-Core Version:    0.6.2
 */