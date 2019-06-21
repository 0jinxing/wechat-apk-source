package a.i.b.a.c.d.a.f;

import a.aa;
import a.i.b.a.c.b.ar;
import a.i.b.a.c.b.e;
import a.i.b.a.c.b.h;
import a.i.b.a.c.d.a.p;
import a.i.b.a.c.l.ad;
import a.i.b.a.c.l.an;
import a.i.b.a.c.l.ap;
import a.i.b.a.c.l.av;
import a.i.b.a.c.l.ax;
import a.i.b.a.c.l.az;
import a.i.b.a.c.l.ba;
import a.i.b.a.c.l.c.a;
import a.i.b.a.c.l.w;
import a.i.b.a.c.l.x;
import a.i.b.a.c.l.y;
import a.m;
import a.v;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class s
{
  private static final b BqL;
  private static final b BqM;

  static
  {
    AppMethodBeat.i(120210);
    a.i.b.a.c.f.b localb = p.Blv;
    a.f.b.j.o(localb, "JvmAnnotationNames.ENHANCED_NULLABILITY_ANNOTATION");
    BqL = new b(localb);
    localb = p.Blw;
    a.f.b.j.o(localb, "JvmAnnotationNames.ENHANCED_MUTABILITY_ANNOTATION");
    BqM = new b(localb);
    AppMethodBeat.o(120210);
  }

  public static final boolean U(w paramw)
  {
    AppMethodBeat.i(120201);
    a.f.b.j.p(paramw, "receiver$0");
    paramw = paramw.dYn();
    a.i.b.a.c.f.b localb = p.Blv;
    a.f.b.j.o(localb, "JvmAnnotationNames.ENHANCED_NULLABILITY_ANNOTATION");
    boolean bool;
    if (paramw.i(localb) != null)
    {
      bool = true;
      AppMethodBeat.o(120201);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(120201);
    }
  }

  private static final c<h> a(h paramh, d paramd, q paramq)
  {
    AppMethodBeat.i(120208);
    if (!a(paramq))
    {
      paramh = dC(paramh);
      AppMethodBeat.o(120208);
    }
    while (true)
    {
      return paramh;
      if (!(paramh instanceof e))
      {
        paramh = dC(paramh);
        AppMethodBeat.o(120208);
      }
      else
      {
        a.i.b.a.c.a.b.c localc = a.i.b.a.c.a.b.c.Bdq;
        paramd = paramd.BpC;
        if (paramd == null);
        do
        {
          do
            while (true)
            {
              paramh = dC(paramh);
              AppMethodBeat.o(120208);
              break;
              switch (t.eQZ[paramd.ordinal()])
              {
              default:
              case 1:
              case 2:
              }
            }
          while ((paramq != q.BqH) || (!a.i.b.a.c.a.b.c.h((e)paramh)));
          paramh = dE(a.i.b.a.c.a.b.c.j((e)paramh));
          AppMethodBeat.o(120208);
          break;
        }
        while ((paramq != q.BqI) || (!a.i.b.a.c.a.b.c.i((e)paramh)));
        paramh = dE(a.i.b.a.c.a.b.c.k((e)paramh));
        AppMethodBeat.o(120208);
      }
    }
  }

  private static final c<Boolean> a(w paramw, d paramd, q paramq)
  {
    AppMethodBeat.i(120209);
    if (!a(paramq))
    {
      paramw = dC(Boolean.valueOf(paramw.eci()));
      AppMethodBeat.o(120209);
    }
    while (true)
    {
      return paramw;
      paramd = paramd.BpB;
      if (paramd == null);
      while (true)
      {
        paramw = dC(Boolean.valueOf(paramw.eci()));
        AppMethodBeat.o(120209);
        break;
        switch (t.pCY[paramd.ordinal()])
        {
        default:
        case 1:
        case 2:
        }
      }
      paramw = dD(Boolean.TRUE);
      AppMethodBeat.o(120209);
      continue;
      paramw = dD(Boolean.FALSE);
      AppMethodBeat.o(120209);
    }
  }

  private static final k a(az paramaz, a.f.a.b<? super Integer, d> paramb, int paramInt)
  {
    boolean bool = false;
    AppMethodBeat.i(120202);
    if (y.an((w)paramaz))
    {
      paramaz = new k((w)paramaz, 1, false);
      AppMethodBeat.o(120202);
      return paramaz;
    }
    o localo1;
    o localo2;
    if ((paramaz instanceof a.i.b.a.c.l.q))
    {
      localo1 = a(((a.i.b.a.c.l.q)paramaz).BJx, paramb, paramInt, q.BqH);
      localo2 = a(((a.i.b.a.c.l.q)paramaz).BJy, paramb, paramInt, q.BqI);
      if (localo1.Bqh == localo2.Bqh);
      for (paramInt = 1; (aa.AUz) && (paramInt == 0); paramInt = 0)
      {
        paramaz = (Throwable)new AssertionError("Different tree sizes of bounds: lower = (" + ((a.i.b.a.c.l.q)paramaz).BJx + ", " + localo1.Bqh + "), upper = (" + ((a.i.b.a.c.l.q)paramaz).BJy + ", " + localo2.Bqh + ')');
        AppMethodBeat.o(120202);
        throw paramaz;
      }
      if ((localo1.Bqi) || (localo2.Bqi))
        bool = true;
      paramb = ax.aG((w)localo1.BqF);
      if (paramb != null)
        break label371;
      paramb = ax.aG((w)localo2.BqF);
    }
    label371: 
    while (true)
    {
      if (!bool)
      {
        paramaz = new k((w)paramaz, localo1.Bqh, bool);
        AppMethodBeat.o(120202);
        break;
      }
      if ((paramaz instanceof a.i.b.a.c.d.a.c.b.g));
      for (paramaz = (az)new a.i.b.a.c.d.a.c.b.g(localo1.BqF, localo2.BqF); ; paramaz = x.a(localo1.BqF, localo2.BqF))
      {
        paramaz = ax.b(paramaz, paramb);
        break;
      }
      if ((paramaz instanceof ad))
      {
        paramaz = (k)a((ad)paramaz, paramb, paramInt, q.BqJ);
        AppMethodBeat.o(120202);
        break;
      }
      paramaz = new m();
      AppMethodBeat.o(120202);
      throw paramaz;
    }
  }

  private static final o a(ad paramad, a.f.a.b<? super Integer, d> paramb, int paramInt, q paramq)
  {
    AppMethodBeat.i(120203);
    if ((!a(paramq)) && (paramad.ejt().isEmpty()))
    {
      paramad = new o(paramad, 1, false);
      AppMethodBeat.o(120203);
    }
    while (true)
    {
      return paramad;
      Object localObject1 = paramad.ejw().dYs();
      if (localObject1 == null)
      {
        paramad = new o(paramad, 1, false);
        AppMethodBeat.o(120203);
      }
      else
      {
        a.f.b.j.o(localObject1, "constructor.declarationD…pleResult(this, 1, false)");
        d locald = (d)paramb.am(Integer.valueOf(paramInt));
        localObject1 = a((h)localObject1, locald, paramq);
        h localh = (h)((c)localObject1).result;
        a.i.b.a.c.b.a.g localg = ((c)localObject1).BpA;
        an localan = localh.dXY();
        a.f.b.j.o(localan, "enhancedClassifier.typeConstructor");
        if (localg != null);
        Collection localCollection;
        int j;
        int k;
        int m;
        Object localObject2;
        for (int i = 1; ; i = 0)
        {
          localObject1 = (Iterable)paramad.ejt();
          localCollection = (Collection)new ArrayList(a.a.j.d((Iterable)localObject1));
          Iterator localIterator = ((Iterable)localObject1).iterator();
          j = 0;
          k = paramInt + 1;
          m = i;
          while (true)
          {
            if (!localIterator.hasNext())
              break label428;
            localObject1 = localIterator.next();
            if (j < 0)
              a.a.j.dWs();
            localObject2 = (ap)localObject1;
            if (!((ap)localObject2).ekp())
              break;
            i = k + 1;
            localObject1 = localh.dXY();
            a.f.b.j.o(localObject1, "enhancedClassifier.typeConstructor");
            localObject1 = av.e((ar)((an)localObject1).getParameters().get(j));
            localCollection.add(localObject1);
            j++;
            k = i;
          }
        }
        localObject1 = a(((ap)localObject2).dZS().ekn(), paramb, k);
        if ((m != 0) || (((k)localObject1).Bqi));
        for (i = 1; ; i = 0)
        {
          k = ((k)localObject1).Bqh + k;
          localObject1 = ((k)localObject1).dZS();
          localObject2 = ((ap)localObject2).ekq();
          a.f.b.j.o(localObject2, "arg.projectionKind");
          localObject1 = a.a((w)localObject1, (ba)localObject2, (ar)localan.getParameters().get(j));
          m = i;
          i = k;
          break;
        }
        label428: paramb = (List)localCollection;
        paramq = a((w)paramad, locald, paramq);
        boolean bool = ((Boolean)paramq.result).booleanValue();
        paramq = paramq.BpA;
        if ((m != 0) || (paramq != null));
        for (i = 1; ; i = 0)
        {
          j = k - paramInt;
          if (i != 0)
            break label512;
          paramad = new o(paramad, j, false);
          AppMethodBeat.o(120203);
          break;
        }
        label512: paramb = x.c(fX(a.a.j.k((Iterable)a.a.j.listOf(new a.i.b.a.c.b.a.g[] { paramad.dYn(), localg, paramq }))), localan, paramb, bool);
        if (locald.BpD)
        {
          paramb = (ad)new f(paramb);
          if ((paramq == null) || (!locald.BpE))
            break label629;
          paramInt = 1;
          label587: if (paramInt == 0)
            break label634;
        }
        label629: label634: for (paramad = ax.b((az)paramad, (w)paramb); ; paramad = (az)paramb)
        {
          if (paramad != null)
            break label642;
          paramad = new v("null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
          AppMethodBeat.o(120203);
          throw paramad;
          break;
          paramInt = 0;
          break label587;
        }
        label642: paramad = new o((ad)paramad, j, true);
        AppMethodBeat.o(120203);
      }
    }
  }

  public static final w a(w paramw, a.f.a.b<? super Integer, d> paramb)
  {
    AppMethodBeat.i(120200);
    a.f.b.j.p(paramw, "receiver$0");
    a.f.b.j.p(paramb, "qualifiers");
    paramb = a(paramw.ekn(), paramb, 0);
    paramw = paramb.dZS();
    if (paramb.Bqi)
      AppMethodBeat.o(120200);
    while (true)
    {
      return paramw;
      paramw = null;
      AppMethodBeat.o(120200);
    }
  }

  private static final boolean a(q paramq)
  {
    if (paramq != q.BqJ);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  private static final <T> c<T> dC(T paramT)
  {
    AppMethodBeat.i(120205);
    paramT = new c(paramT, null);
    AppMethodBeat.o(120205);
    return paramT;
  }

  private static final <T> c<T> dD(T paramT)
  {
    AppMethodBeat.i(120206);
    paramT = new c(paramT, (a.i.b.a.c.b.a.g)BqL);
    AppMethodBeat.o(120206);
    return paramT;
  }

  private static final <T> c<T> dE(T paramT)
  {
    AppMethodBeat.i(120207);
    paramT = new c(paramT, (a.i.b.a.c.b.a.g)BqM);
    AppMethodBeat.o(120207);
    return paramT;
  }

  private static final a.i.b.a.c.b.a.g fX(List<? extends a.i.b.a.c.b.a.g> paramList)
  {
    AppMethodBeat.i(120204);
    switch (paramList.size())
    {
    default:
      paramList = (a.i.b.a.c.b.a.g)new a.i.b.a.c.b.a.k(a.a.j.m((Iterable)paramList));
      AppMethodBeat.o(120204);
    case 0:
    case 1:
    }
    while (true)
    {
      return paramList;
      paramList = (Throwable)new IllegalStateException("At least one Annotations object expected".toString());
      AppMethodBeat.o(120204);
      throw paramList;
      paramList = (a.i.b.a.c.b.a.g)a.a.j.fN(paramList);
      AppMethodBeat.o(120204);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.d.a.f.s
 * JD-Core Version:    0.6.2
 */