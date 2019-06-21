package a.i.b.a.c.l;

import a.i.b.a.c.a.g.a;
import a.i.b.a.c.b.a.k;
import a.i.b.a.c.l.c.a;
import a.i.b.a.c.l.d.b;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.List;

public class au
{
  public static final au BJW;
  public final as Bik;

  static
  {
    AppMethodBeat.i(122680);
    if (!au.class.desiredAssertionStatus());
    for (boolean bool = true; ; bool = false)
    {
      $assertionsDisabled = bool;
      BJW = d(as.BJU);
      AppMethodBeat.o(122680);
      return;
    }
  }

  private au(as paramas)
  {
    this.Bik = paramas;
  }

  private ap a(ap paramap, int paramInt)
  {
    AppMethodBeat.i(122672);
    a(paramInt, paramap, this.Bik);
    if (paramap.ekp())
      AppMethodBeat.o(122672);
    while (true)
    {
      return paramap;
      Object localObject1 = paramap.dZS();
      Object localObject2;
      Object localObject3;
      if ((localObject1 instanceof aw))
      {
        localObject2 = ((aw)localObject1).ekk();
        localObject3 = ((aw)localObject1).ekl();
        localObject2 = a(new ar(paramap.ekq(), (w)localObject2), paramInt + 1);
        paramap = c((w)localObject3, paramap.ekq());
        paramap = ax.b(((ap)localObject2).dZS().ekn(), paramap);
        paramap = new ar(((ap)localObject2).ekq(), paramap);
        AppMethodBeat.o(122672);
      }
      else if ((n.ag((w)localObject1)) || ((((w)localObject1).ekn() instanceof ac)))
      {
        AppMethodBeat.o(122672);
      }
      else
      {
        ap localap = this.Bik.O((w)localObject1);
        localObject3 = paramap.ekq();
        Object localObject4;
        if ((localap == null) && (t.ai((w)localObject1)) && (!am.aq((w)localObject1)))
        {
          localObject1 = t.aj((w)localObject1);
          localap = a(new ar((ba)localObject3, ((q)localObject1).BJx), paramInt + 1);
          localObject4 = a(new ar((ba)localObject3, ((q)localObject1).BJy), paramInt + 1);
          localObject2 = localap.ekq();
          if ((!$assertionsDisabled) && ((localObject2 != ((ap)localObject4).ekq()) || (localObject3 != ba.BKh)) && (localObject3 != localObject2))
          {
            paramap = new AssertionError("Unexpected substituted projection kind: " + localObject2 + "; original: " + localObject3);
            AppMethodBeat.o(122672);
            throw paramap;
          }
          if ((localap.dZS() == ((q)localObject1).BJx) && (((ap)localObject4).dZS() == ((q)localObject1).BJy))
          {
            AppMethodBeat.o(122672);
          }
          else
          {
            paramap = new ar((ba)localObject2, x.a(at.av(localap.dZS()), at.av(((ap)localObject4).dZS())));
            AppMethodBeat.o(122672);
          }
        }
        else if ((a.i.b.a.c.a.g.y((w)localObject1)) || (y.an((w)localObject1)))
        {
          AppMethodBeat.o(122672);
        }
        else if (localap != null)
        {
          localObject4 = b((ba)localObject3, localap.ekq());
          if (!a.i.b.a.c.i.a.a.c.ae((w)localObject1));
          switch (au.2.BJX[localObject4.ordinal()])
          {
          default:
            paramap = am.ar((w)localObject1);
            if (localap.ekp())
            {
              AppMethodBeat.o(122672);
              paramap = localap;
            }
            break;
          case 1:
            paramap = new au.a("Out-projection in in-position");
            AppMethodBeat.o(122672);
            throw paramap;
          case 2:
            paramap = new ar(ba.BKj, ((w)localObject1).ejw().dZD().dXN());
            AppMethodBeat.o(122672);
            continue;
            if (paramap != null)
            {
              paramap = paramap.R(localap.dZS());
              label584: localObject2 = paramap;
              if (!((w)localObject1).dYn().isEmpty())
              {
                localObject2 = j(this.Bik.h(((w)localObject1).dYn()));
                localObject2 = a.a(paramap, new k(new a.i.b.a.c.b.a.g[] { paramap.dYn(), localObject2 }));
              }
              if (localObject4 != au.b.BJY)
                break label702;
            }
            label702: for (paramap = a((ba)localObject3, localap.ekq()); ; paramap = (ap)localObject3)
            {
              paramap = new ar(paramap, (w)localObject2);
              AppMethodBeat.o(122672);
              break;
              paramap = av.b(localap.dZS(), ((w)localObject1).eci());
              break label584;
            }
          }
        }
        else
        {
          paramap = b(paramap, paramInt);
          AppMethodBeat.o(122672);
        }
      }
    }
  }

  public static ba a(ba paramba, ap paramap)
  {
    AppMethodBeat.i(122676);
    if (paramap.ekp())
    {
      paramba = ba.BKj;
      AppMethodBeat.o(122676);
    }
    while (true)
    {
      return paramba;
      paramba = a(paramba, paramap.ekq());
      AppMethodBeat.o(122676);
    }
  }

  private static ba a(ba paramba1, ba paramba2)
  {
    AppMethodBeat.i(122677);
    if (paramba1 == ba.BKh)
      AppMethodBeat.o(122677);
    while (true)
    {
      return paramba2;
      if (paramba2 == ba.BKh)
      {
        AppMethodBeat.o(122677);
        paramba2 = paramba1;
      }
      else
      {
        if (paramba1 != paramba2)
          break;
        AppMethodBeat.o(122677);
      }
    }
    paramba1 = new AssertionError("Variance conflict: type parameter variance '" + paramba1 + "' and projection kind '" + paramba2 + "' cannot be combined");
    AppMethodBeat.o(122677);
    throw paramba1;
  }

  private static void a(int paramInt, ap paramap, as paramas)
  {
    AppMethodBeat.i(122678);
    if (paramInt > 100)
    {
      paramap = new IllegalStateException("Recursion too deep. Most likely infinite loop while substituting " + dU(paramap) + "; substitution: " + dU(paramas));
      AppMethodBeat.o(122678);
      throw paramap;
    }
    AppMethodBeat.o(122678);
  }

  public static au aw(w paramw)
  {
    AppMethodBeat.i(122667);
    paramw = d(ao.a(paramw.ejw(), paramw.ejt()));
    AppMethodBeat.o(122667);
    return paramw;
  }

  private ap b(ap paramap, int paramInt)
  {
    AppMethodBeat.i(122674);
    Object localObject1 = paramap.dZS();
    ba localba = paramap.ekq();
    if ((((w)localObject1).ejw().dYs() instanceof a.i.b.a.c.b.ar))
      AppMethodBeat.o(122674);
    while (true)
    {
      return paramap;
      paramap = null;
      Object localObject2 = ag.ao((w)localObject1);
      if (localObject2 != null)
        paramap = c((w)localObject2, ba.BKh);
      localObject2 = at.a((w)localObject1, b(((w)localObject1).ejw().getParameters(), ((w)localObject1).ejt(), paramInt), this.Bik.h(((w)localObject1).dYn()));
      localObject1 = localObject2;
      if ((localObject2 instanceof ad))
      {
        localObject1 = localObject2;
        if ((paramap instanceof ad))
          localObject1 = ag.b((ad)localObject2, (ad)paramap);
      }
      paramap = new ar(localba, (w)localObject1);
      AppMethodBeat.o(122674);
    }
  }

  private static au.b b(ba paramba1, ba paramba2)
  {
    if ((paramba1 == ba.BKi) && (paramba2 == ba.BKj))
      paramba1 = au.b.BKa;
    while (true)
    {
      return paramba1;
      if ((paramba1 == ba.BKj) && (paramba2 == ba.BKi))
        paramba1 = au.b.BJZ;
      else
        paramba1 = au.b.BJY;
    }
  }

  public static au b(as paramas1, as paramas2)
  {
    AppMethodBeat.i(122666);
    paramas1 = d(l.a(paramas1, paramas2));
    AppMethodBeat.o(122666);
    return paramas1;
  }

  private List<ap> b(List<a.i.b.a.c.b.ar> paramList, List<ap> paramList1, int paramInt)
  {
    AppMethodBeat.i(122675);
    ArrayList localArrayList = new ArrayList(paramList.size());
    int i = 0;
    int j = 0;
    a.i.b.a.c.b.ar localar;
    Object localObject;
    if (i < paramList.size())
    {
      localar = (a.i.b.a.c.b.ar)paramList.get(i);
      ap localap = (ap)paramList1.get(i);
      localObject = a(localap, paramInt + 1);
      switch (au.2.BJX[b(localar.dZh(), localObject.ekq()).ordinal()])
      {
      default:
        label124: if (localObject != localap)
          j = 1;
        break;
      case 3:
      case 1:
      case 2:
      }
    }
    while (true)
    {
      localArrayList.add(localObject);
      i++;
      break;
      if ((localar.dZh() == ba.BKh) || (((ap)localObject).ekp()))
        break label124;
      localObject = new ar(ba.BKh, ((ap)localObject).dZS());
      break label124;
      localObject = av.e(localar);
      break label124;
      if (j == 0)
        AppMethodBeat.o(122675);
      while (true)
      {
        return paramList1;
        AppMethodBeat.o(122675);
        paramList1 = localArrayList;
      }
    }
  }

  private ap c(ap paramap)
  {
    AppMethodBeat.i(122670);
    paramap = d(paramap);
    if ((!this.Bik.eki()) && (!this.Bik.ejx()))
      AppMethodBeat.o(122670);
    while (true)
    {
      return paramap;
      paramap = b.a(paramap, this.Bik.ejx());
      AppMethodBeat.o(122670);
    }
  }

  public static au d(as paramas)
  {
    AppMethodBeat.i(122665);
    paramas = new au(paramas);
    AppMethodBeat.o(122665);
    return paramas;
  }

  private static String dU(Object paramObject)
  {
    AppMethodBeat.i(122679);
    try
    {
      paramObject = paramObject.toString();
      AppMethodBeat.o(122679);
      return paramObject;
    }
    catch (Throwable paramObject)
    {
      while (true)
      {
        if (a.i.b.a.c.n.c.r(paramObject))
        {
          paramObject = (RuntimeException)paramObject;
          AppMethodBeat.o(122679);
          throw paramObject;
        }
        paramObject = "[Exception while computing toString(): " + paramObject + "]";
        AppMethodBeat.o(122679);
      }
    }
  }

  private static a.i.b.a.c.b.a.g j(a.i.b.a.c.b.a.g paramg)
  {
    AppMethodBeat.i(122673);
    if (!paramg.j(a.i.b.a.c.a.g.Bag.BaW))
      AppMethodBeat.o(122673);
    while (true)
    {
      return paramg;
      paramg = new a.i.b.a.c.b.a.l(paramg, new au.1());
      AppMethodBeat.o(122673);
    }
  }

  public final w b(w paramw, ba paramba)
  {
    AppMethodBeat.i(122668);
    if (this.Bik.isEmpty())
      AppMethodBeat.o(122668);
    while (true)
    {
      return paramw;
      try
      {
        ar localar = new a/i/b/a/c/l/ar;
        localar.<init>(paramba, paramw);
        paramw = a(localar, 0).dZS();
        AppMethodBeat.o(122668);
      }
      catch (au.a paramw)
      {
        paramw = p.awn(paramw.getMessage());
        AppMethodBeat.o(122668);
      }
    }
  }

  public final w c(w paramw, ba paramba)
  {
    AppMethodBeat.i(122669);
    paramw = c(new ar(paramba, this.Bik.a(paramw, paramba)));
    if (paramw == null)
    {
      paramw = null;
      AppMethodBeat.o(122669);
    }
    while (true)
    {
      return paramw;
      paramw = paramw.dZS();
      AppMethodBeat.o(122669);
    }
  }

  public final ap d(ap paramap)
  {
    AppMethodBeat.i(122671);
    if (this.Bik.isEmpty())
      AppMethodBeat.o(122671);
    while (true)
    {
      return paramap;
      try
      {
        paramap = a(paramap, 0);
        AppMethodBeat.o(122671);
      }
      catch (au.a paramap)
      {
        paramap = null;
        AppMethodBeat.o(122671);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.l.au
 * JD-Core Version:    0.6.2
 */