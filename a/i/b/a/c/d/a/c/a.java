package a.i.b.a.c.d.a.c;

import a.f;
import a.f.b.j;
import a.i.b.a.c.b.a.c;
import a.i.b.a.c.d.a.e.x;
import a.i.b.a.c.n.e;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class a
{
  public static final d a(h paramh, a.i.b.a.c.b.a.g paramg)
  {
    AppMethodBeat.i(119818);
    j.p(paramh, "receiver$0");
    j.p(paramg, "additionalAnnotations");
    if (paramh.Bnv.Bne.Bke)
    {
      paramh = paramh.ebm();
      AppMethodBeat.o(119818);
    }
    while (true)
    {
      return paramh;
      paramg = (Iterable)paramg;
      Object localObject1 = (Collection)new ArrayList();
      Object localObject2 = paramg.iterator();
      Object localObject3;
      label115: int i;
      label205: label226: label231: label362: 
      while (((Iterator)localObject2).hasNext())
      {
        c localc1 = (c)((Iterator)localObject2).next();
        localObject3 = paramh.Bnv.Bne;
        j.p(localc1, "annotationDescriptor");
        if (((a.i.b.a.c.d.a.a)localObject3).Bkf.ekx())
        {
          localObject4 = null;
          paramg = (a.i.b.a.c.b.a.g)localObject4;
          if (localObject4 == null)
          {
            paramg = ((a.i.b.a.c.d.a.a)localObject3).e(localc1);
            if (paramg != null)
              break label260;
            paramg = null;
          }
        }
        while (true)
        {
          if (paramg == null)
            break label362;
          ((Collection)localObject1).add(paramg);
          break;
          paramg = (k)a.i.b.a.c.d.a.b.eaR().get(localc1.dZF());
          if (paramg != null)
          {
            localObject4 = paramg.BnC;
            localObject5 = paramg.BnD;
            paramg = ((a.i.b.a.c.d.a.a)localObject3).f(localc1);
            if (paramg != a.i.b.a.c.n.g.BNj)
            {
              i = 1;
              if (i == 0)
                break label226;
            }
            while (true)
            {
              if (paramg != null)
                break label231;
              localObject4 = null;
              break;
              i = 0;
              break label205;
              paramg = null;
            }
            localObject4 = new k(a.i.b.a.c.d.a.f.h.a((a.i.b.a.c.d.a.f.h)localObject4, paramg.eky()), (Collection)localObject5);
            break label115;
          }
          localObject4 = null;
          break label115;
          c localc2 = paramg.Bkl;
          Object localObject5 = paramg.eaP();
          localObject4 = ((a.i.b.a.c.d.a.a)localObject3).g(localc1);
          paramg = (a.i.b.a.c.b.a.g)localObject4;
          if (localObject4 == null)
            paramg = ((a.i.b.a.c.d.a.a)localObject3).f(localc2);
          if (paramg.ekz())
          {
            paramg = null;
          }
          else
          {
            localObject4 = paramh.Bnv.Bnf.i(localc2);
            if (localObject4 != null)
            {
              paramg = a.i.b.a.c.d.a.f.h.a((a.i.b.a.c.d.a.f.h)localObject4, paramg.eky());
              if (paramg != null);
            }
            else
            {
              paramg = null;
              continue;
            }
            paramg = new k(paramg, (Collection)localObject5);
          }
        }
      }
      label260: Object localObject4 = (List)localObject1;
      if (((List)localObject4).isEmpty())
      {
        paramh = paramh.ebm();
        AppMethodBeat.o(119818);
      }
      else
      {
        paramg = paramh.ebm();
        if (paramg != null)
        {
          paramg = paramg.Bnl;
          if (paramg != null)
          {
            paramg = new EnumMap(paramg);
            localObject4 = ((List)localObject4).iterator();
            i = 0;
          }
        }
        while (true)
        {
          if (!((Iterator)localObject4).hasNext())
            break label523;
          localObject2 = (k)((Iterator)localObject4).next();
          localObject1 = ((k)localObject2).BnC;
          localObject2 = ((k)localObject2).BnD.iterator();
          while (true)
            if (((Iterator)localObject2).hasNext())
            {
              localObject3 = (a.i.b.a.c.d.a.a.a)((Iterator)localObject2).next();
              ((Map)paramg).put(localObject3, localObject1);
              i = 1;
              continue;
              paramg = new EnumMap(a.i.b.a.c.d.a.a.a.class);
              break;
            }
        }
        label523: if (i == 0)
        {
          paramh = paramh.ebm();
          AppMethodBeat.o(119818);
        }
        else
        {
          paramh = new d(paramg);
          AppMethodBeat.o(119818);
        }
      }
    }
  }

  public static final h a(h paramh, a.i.b.a.c.b.l paraml, x paramx, int paramInt)
  {
    AppMethodBeat.i(119820);
    j.p(paramh, "receiver$0");
    j.p(paraml, "containingDeclaration");
    j.p(paramx, "typeParameterOwner");
    paramh = a(paramh, paraml, paramx, paramInt, paramh.Bnx);
    AppMethodBeat.o(119820);
    return paramh;
  }

  private static final h a(h paramh, a.i.b.a.c.b.l paraml, x paramx, int paramInt, f<d> paramf)
  {
    AppMethodBeat.i(119819);
    b localb = paramh.Bnv;
    if (paramx != null);
    for (paramh = (m)new i(paramh, paraml, paramx, paramInt); ; paramh = paramh.Bnw)
    {
      paramh = new h(localb, paramh, paramf);
      AppMethodBeat.o(119819);
      return paramh;
    }
  }

  public static final h b(h paramh, a.i.b.a.c.b.a.g paramg)
  {
    AppMethodBeat.i(119822);
    j.p(paramh, "receiver$0");
    j.p(paramg, "additionalAnnotations");
    if (paramg.isEmpty())
      AppMethodBeat.o(119822);
    while (true)
    {
      return paramh;
      paramh = new h(paramh.Bnv, paramh.Bnw, a.g.a(a.k.AUn, (a.f.a.a)new a.b(paramh, paramg)));
      AppMethodBeat.o(119822);
    }
  }

  static final class a extends a.f.b.k
    implements a.f.a.a<d>
  {
    a(h paramh, a.i.b.a.c.b.g paramg)
    {
      super();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.d.a.c.a
 * JD-Core Version:    0.6.2
 */