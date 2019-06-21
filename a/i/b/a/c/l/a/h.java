package a.i.b.a.c.l.a;

import a.aa;
import a.i.b.a.c.b.ar;
import a.i.b.a.c.l.ad;
import a.i.b.a.c.l.ag;
import a.i.b.a.c.l.aj;
import a.i.b.a.c.l.an;
import a.i.b.a.c.l.ao;
import a.i.b.a.c.l.ao.a;
import a.i.b.a.c.l.ap;
import a.i.b.a.c.l.as;
import a.i.b.a.c.l.av;
import a.i.b.a.c.l.ax;
import a.i.b.a.c.l.az;
import a.i.b.a.c.l.ba;
import a.i.b.a.c.l.q;
import a.i.b.a.c.l.t;
import a.i.b.a.c.l.w;
import a.i.b.a.c.l.y;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class h
  implements c
{
  public static final h BKA;

  static
  {
    AppMethodBeat.i(122750);
    BKA = new h();
    AppMethodBeat.o(122750);
  }

  private static boolean B(a.i.b.a.c.b.e parame)
  {
    AppMethodBeat.i(122748);
    boolean bool;
    if ((a.i.b.a.c.b.x.p(parame)) && (parame.dYc() != a.i.b.a.c.b.f.Beu) && (parame.dYc() != a.i.b.a.c.b.f.Bev))
    {
      bool = true;
      AppMethodBeat.o(122748);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(122748);
    }
  }

  private final Boolean a(o paramo, ad paramad1, ad paramad2)
  {
    Object localObject1 = null;
    boolean bool = false;
    AppMethodBeat.i(122742);
    if ((y.an((w)paramad1)) || (y.an((w)paramad2)))
      if (paramo.BKI)
      {
        paramo = Boolean.TRUE;
        AppMethodBeat.o(122742);
      }
    while (true)
    {
      return paramo;
      if ((paramad1.eci()) && (!paramad2.eci()))
      {
        paramo = Boolean.FALSE;
        AppMethodBeat.o(122742);
      }
      else
      {
        paramo = Boolean.valueOf(m.BKC.c(paramad1.rL(false), paramad2.rL(false)));
        AppMethodBeat.o(122742);
        continue;
        if (((paramad1 instanceof aj)) || ((paramad2 instanceof aj)))
        {
          paramo = Boolean.TRUE;
          AppMethodBeat.o(122742);
        }
        else
        {
          Object localObject2;
          if (((paramad2 instanceof e)) && (((e)paramad2).BKx != null))
            localObject2 = o.a(paramad1, (e)paramad2);
          switch (i.eQZ[localObject2.ordinal()])
          {
          default:
            label188: an localan = paramad2.ejw();
            localObject2 = localan;
            if (!(localan instanceof a.i.b.a.c.l.v))
              localObject2 = null;
            localObject2 = (a.i.b.a.c.l.v)localObject2;
            if (localObject2 == null)
              break label436;
            if (paramad2.eci())
              break;
          case 1:
          case 2:
          }
          for (int i = 1; ; i = 0)
          {
            if ((!aa.AUz) || (i != 0))
              break label334;
            paramo = (Throwable)new AssertionError("Intersection type should not be marked nullable!: ".concat(String.valueOf(paramad2)));
            AppMethodBeat.o(122742);
            throw paramo;
            paramo = Boolean.valueOf(b(paramo, (az)paramad1, ((e)paramad2).BKx));
            AppMethodBeat.o(122742);
            break;
            if (!b(paramo, (az)paramad1, ((e)paramad2).BKx))
              break label188;
            paramo = Boolean.TRUE;
            AppMethodBeat.o(122742);
            break;
          }
          label334: paramad2 = ((a.i.b.a.c.l.v)localObject2).BJH;
          a.f.b.j.o(paramad2, "it.supertypes");
          paramad2 = (Iterable)paramad2;
          if ((!(paramad2 instanceof Collection)) || (!((Collection)paramad2).isEmpty()))
          {
            paramad2 = paramad2.iterator();
            do
            {
              if (!paramad2.hasNext())
                break;
              localObject2 = (w)paramad2.next();
            }
            while (BKA.b(paramo, (az)paramad1, ((w)localObject2).ekn()));
          }
          while (true)
          {
            paramo = Boolean.valueOf(bool);
            AppMethodBeat.o(122742);
            break;
            bool = true;
          }
          label436: AppMethodBeat.o(122742);
          paramo = localObject1;
        }
      }
    }
  }

  private static List<ad> a(o paramo, ad paramad, an paraman)
  {
    AppMethodBeat.i(122745);
    paramo = c(paramo, paramad, paraman);
    label103: int i;
    if (paramo.size() >= 2)
    {
      paraman = (Iterable)paramo;
      paramad = (Collection)new ArrayList();
      paraman = paraman.iterator();
      label148: label176: label182: 
      while (paraman.hasNext())
      {
        Object localObject1 = paraman.next();
        Object localObject2 = (Iterable)((ad)localObject1).ejt();
        if ((!(localObject2 instanceof Collection)) || (!((Collection)localObject2).isEmpty()))
        {
          Iterator localIterator = ((Iterable)localObject2).iterator();
          if (localIterator.hasNext())
          {
            localObject2 = ((ap)localIterator.next()).dZS();
            a.f.b.j.o(localObject2, "it.type");
            if (!t.ai((w)localObject2))
            {
              i = 1;
              if (i != 0)
                break label176;
            }
          }
        }
        for (i = 0; ; i = 1)
        {
          if (i == 0)
            break label182;
          paramad.add(localObject1);
          break;
          i = 0;
          break label148;
          break label103;
        }
      }
      paramad = (List)paramad;
      if (!((Collection)paramad).isEmpty())
      {
        i = 1;
        if (i == 0)
          break label224;
        AppMethodBeat.o(122745);
        paramo = paramad;
      }
    }
    while (true)
    {
      return paramo;
      i = 0;
      break;
      label224: AppMethodBeat.o(122745);
    }
  }

  private static boolean a(o paramo, ad paramad)
  {
    boolean bool = false;
    AppMethodBeat.i(122743);
    if (a.i.b.a.c.a.g.z((w)paramad))
    {
      AppMethodBeat.o(122743);
      bool = true;
    }
    while (true)
    {
      return bool;
      paramo.initialize();
      ArrayDeque localArrayDeque = paramo.BKG;
      if (localArrayDeque == null)
        a.f.b.j.dWJ();
      Set localSet = paramo.BKH;
      if (localSet == null)
        a.f.b.j.dWJ();
      localArrayDeque.push(paramad);
      label61: label318: label322: label332: 
      while (true)
      {
        if (!((Collection)localArrayDeque).isEmpty());
        for (int i = 1; ; i = 0)
        {
          if (i == 0)
            break label334;
          if (localSet.size() <= 1000)
            break;
          paramo = (Throwable)new IllegalStateException(("Too many supertypes for type: " + paramad + ". Supertypes = " + a.a.j.a((Iterable)localSet, null, null, null, 0, null, null, 63)).toString());
          AppMethodBeat.o(122743);
          throw paramo;
        }
        Object localObject1 = (ad)localArrayDeque.pop();
        a.f.b.j.o(localObject1, "current");
        if (localSet.add(localObject1))
        {
          o.c localc;
          if (j.c((ad)localObject1))
          {
            localc = (o.c)o.c.c.BKU;
            label208: if (!(a.f.b.j.j(localc, o.c.c.BKU) ^ true))
              break label318;
            label221: if (localc == null)
              break label322;
            localObject1 = ((ad)localObject1).ejw().eap().iterator();
          }
          while (true)
          {
            if (!((Iterator)localObject1).hasNext())
              break label332;
            Object localObject2 = (w)((Iterator)localObject1).next();
            a.f.b.j.o(localObject2, "supertype");
            localObject2 = localc.aJ((w)localObject2);
            if (a.i.b.a.c.a.g.z((w)localObject2))
            {
              paramo.clear();
              AppMethodBeat.o(122743);
              bool = true;
              break;
              localc = (o.c)o.c.a.BKT;
              break label208;
              localc = null;
              break label221;
              break label61;
            }
            localArrayDeque.add(localObject2);
          }
        }
      }
      label334: paramo.clear();
      AppMethodBeat.o(122743);
    }
  }

  private boolean a(o paramo, az paramaz1, az paramaz2)
  {
    AppMethodBeat.i(122736);
    a.f.b.j.p(paramo, "receiver$0");
    a.f.b.j.p(paramaz1, "a");
    a.f.b.j.p(paramaz2, "b");
    boolean bool;
    if (paramaz1 == paramaz2)
    {
      AppMethodBeat.o(122736);
      bool = true;
    }
    while (true)
    {
      return bool;
      if ((aI((w)paramaz1)) && (aI((w)paramaz2)))
      {
        if (!o.c(paramaz1.ejw(), paramaz2.ejw()))
        {
          AppMethodBeat.o(122736);
          bool = false;
        }
        else if (paramaz1.ejt().isEmpty())
        {
          if ((aH((w)paramaz1)) || (aH((w)paramaz2)))
          {
            AppMethodBeat.o(122736);
            bool = true;
            continue;
          }
          if (paramaz1.eci() == paramaz2.eci())
          {
            AppMethodBeat.o(122736);
            bool = true;
            continue;
          }
          AppMethodBeat.o(122736);
          bool = false;
        }
      }
      else if ((b(paramo, paramaz1, paramaz2)) && (b(paramo, paramaz2, paramaz1)))
      {
        AppMethodBeat.o(122736);
        bool = true;
      }
      else
      {
        AppMethodBeat.o(122736);
        bool = false;
      }
    }
  }

  private static boolean a(o paramo, List<? extends ap> paramList, ad paramad)
  {
    boolean bool1 = true;
    AppMethodBeat.i(122749);
    boolean bool2;
    if (paramList == paramad.ejt())
    {
      AppMethodBeat.o(122749);
      bool2 = bool1;
    }
    while (true)
    {
      return bool2;
      List localList = paramad.ejw().getParameters();
      a.f.b.j.o(localList, "superType.constructor.parameters");
      int i = ((Collection)localList).size();
      label326: label500: for (int j = 0; ; j++)
      {
        if (j >= i)
          break label506;
        Object localObject1 = (ap)paramad.ejt().get(j);
        if (!((ap)localObject1).ekp())
        {
          az localaz1 = ((ap)localObject1).dZS().ekn();
          Object localObject2 = (ap)paramList.get(j);
          if (((ap)localObject2).ekq() == ba.BKh);
          for (int k = 1; (aa.AUz) && (k == 0); k = 0)
          {
            paramo = (Throwable)new AssertionError("Incorrect sub argument: ".concat(String.valueOf(localObject2)));
            AppMethodBeat.o(122749);
            throw paramo;
          }
          az localaz2 = ((ap)localObject2).dZS().ekn();
          localObject2 = localList.get(j);
          a.f.b.j.o(localObject2, "parameters[index]");
          localObject2 = ((ar)localObject2).dZh();
          a.f.b.j.o(localObject2, "parameters[index].variance");
          localObject1 = ((ap)localObject1).ekq();
          a.f.b.j.o(localObject1, "superProjection.projectionKind");
          a.f.b.j.p(localObject2, "declared");
          a.f.b.j.p(localObject1, "useSite");
          if (localObject2 == ba.BKh);
          for (localObject2 = localObject1; ; localObject2 = null)
            do
            {
              if (localObject2 != null)
                break label326;
              bool2 = paramo.BKI;
              AppMethodBeat.o(122749);
              break;
            }
            while ((localObject1 == ba.BKh) || (localObject2 == localObject1));
          if (paramo.BKE > 100)
          {
            paramo = (Throwable)new IllegalStateException("Arguments depth is too high. Some related argument: ".concat(String.valueOf(localaz2)).toString());
            AppMethodBeat.o(122749);
            throw paramo;
          }
          paramo.BKE += 1;
          switch (i.pEv[localObject2.ordinal()])
          {
          default:
            paramo = new a.m();
            AppMethodBeat.o(122749);
            throw paramo;
          case 1:
            bool2 = BKA.a(paramo, localaz2, localaz1);
          case 2:
          case 3:
          }
          while (true)
          {
            paramo.BKE -= 1;
            if (bool2)
              break label500;
            AppMethodBeat.o(122749);
            bool2 = false;
            break;
            bool2 = BKA.b(paramo, localaz2, localaz1);
            continue;
            bool2 = BKA.b(paramo, localaz1, localaz2);
          }
        }
      }
      label506: AppMethodBeat.o(122749);
      bool2 = bool1;
    }
  }

  private static boolean aH(w paramw)
  {
    AppMethodBeat.i(122737);
    boolean bool;
    if (t.ak(paramw).eci() != t.al(paramw).eci())
    {
      bool = true;
      AppMethodBeat.o(122737);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(122737);
    }
  }

  private static boolean aI(w paramw)
  {
    AppMethodBeat.i(122738);
    boolean bool;
    if ((paramw.ejw().dYu()) && (!a.i.b.a.c.l.n.ag(paramw)) && (!ag.ap(paramw)) && (a.f.b.j.j(t.ak(paramw).ejw(), t.al(paramw).ejw())))
    {
      bool = true;
      AppMethodBeat.o(122738);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(122738);
    }
  }

  private static ad b(ad paramad)
  {
    Object localObject1 = null;
    AppMethodBeat.i(122740);
    a.f.b.j.p(paramad, "type");
    an localan = paramad.ejw();
    Object localObject2;
    Object localObject3;
    if ((localan instanceof a.i.b.a.c.i.a.a.b))
    {
      localObject2 = ((a.i.b.a.c.i.a.a.b)localan).BEG;
      int i;
      if (((ap)localObject2).ekq() == ba.BKi)
      {
        i = 1;
        if (i == 0)
          break label182;
      }
      a.i.b.a.c.i.a.a.b localb;
      while (true)
      {
        localObject3 = localObject1;
        if (localObject2 != null)
        {
          localObject2 = ((ap)localObject2).dZS();
          localObject3 = localObject1;
          if (localObject2 != null)
            localObject3 = ((w)localObject2).ekn();
        }
        if (((a.i.b.a.c.i.a.a.b)localan).BEJ != null)
          break label204;
        localb = (a.i.b.a.c.i.a.a.b)localan;
        localObject2 = ((a.i.b.a.c.i.a.a.b)localan).BEG;
        Object localObject4 = (Iterable)((a.i.b.a.c.i.a.a.b)localan).eap();
        localObject1 = (Collection)new ArrayList(a.a.j.d((Iterable)localObject4));
        localObject4 = ((Iterable)localObject4).iterator();
        while (((Iterator)localObject4).hasNext())
          ((Collection)localObject1).add(((w)((Iterator)localObject4).next()).ekn());
        i = 0;
        break;
        label182: localObject2 = null;
      }
      localb.BEJ = new f((ap)localObject2, (List)localObject1);
      label204: localObject2 = a.BKo;
      localObject1 = ((a.i.b.a.c.i.a.a.b)localan).BEJ;
      if (localObject1 == null)
        a.f.b.j.dWJ();
      paramad = (ad)new e((a)localObject2, (f)localObject1, (az)localObject3, paramad.dYn(), paramad.eci());
      AppMethodBeat.o(122740);
    }
    while (true)
    {
      return paramad;
      if ((localan instanceof a.i.b.a.c.i.b.n))
      {
        localObject2 = (Iterable)((a.i.b.a.c.i.b.n)localan).BEU;
        localObject3 = (Collection)new ArrayList(a.a.j.d((Iterable)localObject2));
        localObject2 = ((Iterable)localObject2).iterator();
        while (((Iterator)localObject2).hasNext())
          ((Collection)localObject3).add(av.a((w)((Iterator)localObject2).next(), paramad.eci()));
        localObject3 = new a.i.b.a.c.l.v((Collection)localObject3);
        paramad = a.i.b.a.c.l.x.a(paramad.dYn(), (an)localObject3, (List)a.a.v.AUP, false, paramad.dXR());
        AppMethodBeat.o(122740);
      }
      else if (((localan instanceof a.i.b.a.c.l.v)) && (paramad.eci()))
      {
        localObject3 = ((a.i.b.a.c.l.v)localan).BJH;
        a.f.b.j.o(localObject3, "constructor.supertypes");
        localObject2 = (Iterable)localObject3;
        localObject3 = (Collection)new ArrayList(a.a.j.d((Iterable)localObject2));
        localObject2 = ((Iterable)localObject2).iterator();
        while (((Iterator)localObject2).hasNext())
        {
          localObject1 = (w)((Iterator)localObject2).next();
          a.f.b.j.o(localObject1, "it");
          ((Collection)localObject3).add(a.i.b.a.c.l.c.a.az((w)localObject1));
        }
        localObject3 = new a.i.b.a.c.l.v((Collection)localObject3);
        paramad = paramad.dYn();
        localObject1 = (an)localObject3;
        localObject2 = (List)a.a.v.AUP;
        localObject3 = ((a.i.b.a.c.l.v)localObject3).ekm();
        a.f.b.j.o(localObject3, "newConstructor.createScopeForKotlinType()");
        paramad = a.i.b.a.c.l.x.a(paramad, (an)localObject1, (List)localObject2, false, (a.i.b.a.c.i.e.h)localObject3);
        AppMethodBeat.o(122740);
      }
      else
      {
        AppMethodBeat.o(122740);
      }
    }
  }

  private static List<ad> b(o paramo, ad paramad, an paraman)
  {
    AppMethodBeat.i(122746);
    a.f.b.j.p(paramo, "receiver$0");
    a.f.b.j.p(paramad, "baseType");
    a.f.b.j.p(paraman, "constructor");
    if (j.c(paramad))
    {
      paramo = a(paramo, paramad, paraman);
      AppMethodBeat.o(122746);
    }
    while (true)
    {
      return paramo;
      if (!(paraman.dYs() instanceof a.i.b.a.c.b.e))
      {
        paramo = c(paramo, paramad, paraman);
        AppMethodBeat.o(122746);
      }
      else
      {
        a.i.b.a.c.n.h localh = new a.i.b.a.c.n.h();
        paramo.initialize();
        ArrayDeque localArrayDeque = paramo.BKG;
        if (localArrayDeque == null)
          a.f.b.j.dWJ();
        Object localObject1 = paramo.BKH;
        if (localObject1 == null)
          a.f.b.j.dWJ();
        localArrayDeque.push(paramad);
        label280: label372: label376: 
        while (true)
        {
          if (!((Collection)localArrayDeque).isEmpty());
          for (int i = 1; ; i = 0)
          {
            if (i == 0)
              break label378;
            if (((Set)localObject1).size() <= 1000)
              break;
            paramo = (Throwable)new IllegalStateException(("Too many supertypes for type: " + paramad + ". Supertypes = " + a.a.j.a((Iterable)localObject1, null, null, null, 0, null, null, 63)).toString());
            AppMethodBeat.o(122746);
            throw paramo;
          }
          Object localObject2 = (ad)localArrayDeque.pop();
          a.f.b.j.o(localObject2, "current");
          if (((Set)localObject1).add(localObject2))
          {
            if (j.c((ad)localObject2))
            {
              localh.add(localObject2);
              localObject3 = (o.c)o.c.c.BKU;
              if (!(a.f.b.j.j(localObject3, o.c.c.BKU) ^ true))
                break label372;
            }
            while (true)
            {
              if (localObject3 == null)
                break label376;
              Iterator localIterator = ((ad)localObject2).ejw().eap().iterator();
              while (localIterator.hasNext())
              {
                localObject2 = (w)localIterator.next();
                a.f.b.j.o(localObject2, "supertype");
                localArrayDeque.add(((o.c)localObject3).aJ((w)localObject2));
              }
              break;
              localObject3 = (o.c)o.c.a.BKT;
              break label280;
              localObject3 = null;
            }
          }
        }
        label378: paramo.clear();
        Object localObject3 = (Iterable)localh;
        paramad = (Collection)new ArrayList();
        localObject1 = ((Iterable)localObject3).iterator();
        while (((Iterator)localObject1).hasNext())
        {
          localObject3 = (ad)((Iterator)localObject1).next();
          a.f.b.j.o(localObject3, "it");
          a.a.j.a(paramad, (Iterable)a(paramo, (ad)localObject3, paraman));
        }
        paramo = (List)paramad;
        AppMethodBeat.o(122746);
      }
    }
  }

  private static boolean b(o paramo, ad paramad1, ad paramad2)
  {
    AppMethodBeat.i(122744);
    if ((j.d(paramad1)) || (j.e(paramad1)) || (paramo.e((az)paramad1)));
    for (int i = 1; (aa.AUz) && (i == 0); i = 0)
    {
      paramo = (Throwable)new AssertionError("Not singleClassifierType and not intersection subType: ".concat(String.valueOf(paramad1)));
      AppMethodBeat.o(122744);
      throw paramo;
    }
    if ((j.d(paramad2)) || (paramo.e((az)paramad2)));
    for (i = 1; (aa.AUz) && (i == 0); i = 0)
    {
      paramo = (Throwable)new AssertionError("Not singleClassifierType superType: ".concat(String.valueOf(paramad2)));
      AppMethodBeat.o(122744);
      throw paramo;
    }
    Object localObject1 = l.BKB;
    boolean bool;
    if (!l.c(paramo, paramad1, paramad2))
    {
      bool = false;
      AppMethodBeat.o(122744);
    }
    while (true)
    {
      return bool;
      localObject1 = paramad2.ejw();
      if ((a.f.b.j.j(paramad1.ejw(), localObject1)) && (((an)localObject1).getParameters().isEmpty()))
      {
        bool = true;
        AppMethodBeat.o(122744);
      }
      else if (a.i.b.a.c.l.c.a.A((w)paramad2))
      {
        bool = true;
        AppMethodBeat.o(122744);
      }
      else
      {
        List localList = b(paramo, paramad1, (an)localObject1);
        Object localObject2;
        label316: Iterator localIterator1;
        switch (localList.size())
        {
        default:
          localObject2 = o.b.BKR;
          switch (i.pCY[localObject2.ordinal()])
          {
          default:
            localObject2 = o.b.BKR;
            localObject1 = ((an)localObject1).getParameters();
            a.f.b.j.o(localObject1, "superConstructor.parameters");
            localObject1 = (Iterable)localObject1;
            localObject2 = (Collection)new ArrayList(a.a.j.d((Iterable)localObject1));
            localIterator1 = ((Iterable)localObject1).iterator();
          case 1:
          case 2:
          case 3:
          case 4:
          }
          break;
        case 0:
        case 1:
        }
        for (i = 0; ; i++)
        {
          if (!localIterator1.hasNext())
            break label810;
          localIterator1.next();
          if (i < 0)
            a.a.j.dWs();
          localObject1 = (Iterable)localList;
          Collection localCollection = (Collection)new ArrayList(a.a.j.d((Iterable)localObject1));
          Iterator localIterator2 = ((Iterable)localObject1).iterator();
          while (true)
          {
            if (!localIterator2.hasNext())
              break label782;
            ad localad = (ad)localIterator2.next();
            localObject1 = (ap)a.a.j.x(localad.ejt(), i);
            int j;
            if (localObject1 != null)
            {
              if (((ap)localObject1).ekq() != ba.BKh)
                break label757;
              j = 1;
              label488: if (j == 0)
                break label763;
            }
            while (true)
            {
              if (localObject1 != null)
              {
                localObject1 = ((ap)localObject1).dZS();
                if (localObject1 != null)
                {
                  localObject1 = ((w)localObject1).ekn();
                  if (localObject1 != null)
                    break label769;
                }
              }
              paramo = (Throwable)new IllegalStateException(("Incorrect type: " + localad + ", subType: " + paramad1 + ", superType: " + paramad2).toString());
              AppMethodBeat.o(122744);
              throw paramo;
              bool = a(paramo, paramad1);
              AppMethodBeat.o(122744);
              break;
              bool = a(paramo, ((ad)a.a.j.fJ(localList)).ejt(), paramad2);
              AppMethodBeat.o(122744);
              break;
              bool = false;
              AppMethodBeat.o(122744);
              break;
              bool = a(paramo, ((ad)a.a.j.fJ(localList)).ejt(), paramad2);
              AppMethodBeat.o(122744);
              break;
              localObject2 = (Iterable)localList;
              if ((!(localObject2 instanceof Collection)) || (!((Collection)localObject2).isEmpty()))
              {
                localObject2 = ((Iterable)localObject2).iterator();
                do
                  if (!((Iterator)localObject2).hasNext())
                    break;
                while (!a(paramo, ((ad)((Iterator)localObject2).next()).ejt(), paramad2));
              }
              for (i = 1; ; i = 0)
              {
                if (i == 0)
                  break label755;
                bool = true;
                AppMethodBeat.o(122744);
                break;
              }
              label755: break label316;
              label757: j = 0;
              break label488;
              label763: localObject1 = null;
            }
            label769: localCollection.add(localObject1);
          }
          label782: ((Collection)localObject2).add(a.i.b.a.c.l.c.a.aM((w)b.gb((List)localCollection)));
        }
        label810: bool = a(paramo, (List)localObject2, paramad2);
        AppMethodBeat.o(122744);
      }
    }
  }

  private boolean b(o paramo, az paramaz1, az paramaz2)
  {
    AppMethodBeat.i(122739);
    a.f.b.j.p(paramo, "receiver$0");
    a.f.b.j.p(paramaz1, "subType");
    a.f.b.j.p(paramaz2, "superType");
    boolean bool;
    if (paramaz1 == paramaz2)
    {
      bool = true;
      AppMethodBeat.o(122739);
    }
    while (true)
    {
      return bool;
      paramaz1 = c(paramaz1);
      paramaz2 = c(paramaz2);
      Boolean localBoolean = a(paramo, t.ak((w)paramaz1), t.al((w)paramaz2));
      if (localBoolean != null)
      {
        bool = localBoolean.booleanValue();
        o.b(paramaz1, paramaz2);
        AppMethodBeat.o(122739);
      }
      else
      {
        o.b(paramaz1, paramaz2);
        bool = b(paramo, t.ak((w)paramaz1), t.al((w)paramaz2));
        AppMethodBeat.o(122739);
      }
    }
  }

  public static az c(az paramaz)
  {
    AppMethodBeat.i(122741);
    a.f.b.j.p(paramaz, "type");
    Object localObject;
    if ((paramaz instanceof ad))
      localObject = (az)b((ad)paramaz);
    while (true)
    {
      paramaz = ax.a((az)localObject, (w)paramaz);
      AppMethodBeat.o(122741);
      return paramaz;
      if (!(paramaz instanceof q))
        break;
      ad localad = b(((q)paramaz).BJx);
      localObject = b(((q)paramaz).BJy);
      if ((localad != ((q)paramaz).BJx) || (localObject != ((q)paramaz).BJy))
        localObject = a.i.b.a.c.l.x.a(localad, (ad)localObject);
      else
        localObject = paramaz;
    }
    paramaz = new a.m();
    AppMethodBeat.o(122741);
    throw paramaz;
  }

  private static List<ad> c(o paramo, ad paramad, an paraman)
  {
    AppMethodBeat.i(122747);
    Object localObject1 = paraman.dYs();
    Object localObject2 = localObject1;
    if (!(localObject1 instanceof a.i.b.a.c.b.e))
      localObject2 = null;
    localObject2 = (a.i.b.a.c.b.e)localObject2;
    if ((localObject2 != null) && (B((a.i.b.a.c.b.e)localObject2) == true))
      if (o.c(paramad.ejw(), paraman))
      {
        paramo = g.a(paramad, a.BKo);
        if (paramo != null)
          break label491;
      }
    while (true)
    {
      paramo = a.a.j.listOf(paramad);
      AppMethodBeat.o(122747);
      while (true)
      {
        return paramo;
        paramo = (List)a.a.v.AUP;
        AppMethodBeat.o(122747);
        continue;
        localObject1 = (List)new a.i.b.a.c.n.h();
        paramo.initialize();
        ArrayDeque localArrayDeque = paramo.BKG;
        if (localArrayDeque == null)
          a.f.b.j.dWJ();
        Set localSet = paramo.BKH;
        if (localSet == null)
          a.f.b.j.dWJ();
        localArrayDeque.push(paramad);
        label334: label470: label474: 
        while (true)
        {
          if (!((Collection)localArrayDeque).isEmpty());
          for (int i = 1; ; i = 0)
          {
            if (i == 0)
              break label476;
            if (localSet.size() <= 1000)
              break;
            paramo = (Throwable)new IllegalStateException(("Too many supertypes for type: " + paramad + ". Supertypes = " + a.a.j.a((Iterable)localSet, null, null, null, 0, null, null, 63)).toString());
            AppMethodBeat.o(122747);
            throw paramo;
          }
          Object localObject3 = (ad)localArrayDeque.pop();
          a.f.b.j.o(localObject3, "current");
          if (localSet.add(localObject3))
          {
            Object localObject4 = g.a((ad)localObject3, a.BKo);
            localObject2 = localObject4;
            if (localObject4 == null)
              localObject2 = localObject3;
            if (o.c(((ad)localObject2).ejw(), paraman))
            {
              ((List)localObject1).add(localObject2);
              localObject2 = (o.c)o.c.c.BKU;
              if (!(a.f.b.j.j(localObject2, o.c.c.BKU) ^ true))
                break label470;
            }
            while (true)
            {
              if (localObject2 == null)
                break label474;
              localObject3 = ((ad)localObject3).ejw().eap().iterator();
              while (((Iterator)localObject3).hasNext())
              {
                localObject4 = (w)((Iterator)localObject3).next();
                a.f.b.j.o(localObject4, "supertype");
                localArrayDeque.add(((o.c)localObject2).aJ((w)localObject4));
              }
              break;
              if (((ad)localObject2).ejt().isEmpty())
              {
                localObject2 = (o.c)o.c.a.BKT;
                break label334;
              }
              localObject4 = ao.BJQ;
              localObject2 = (o.c)new o.c.b(ao.a.au((w)localObject2).ekr());
              break label334;
              localObject2 = null;
            }
          }
        }
        label476: paramo.clear();
        AppMethodBeat.o(122747);
        paramo = (o)localObject1;
      }
      label491: paramad = paramo;
    }
  }

  public final boolean c(w paramw1, w paramw2)
  {
    AppMethodBeat.i(122734);
    a.f.b.j.p(paramw1, "subtype");
    a.f.b.j.p(paramw2, "supertype");
    boolean bool = b(new o(true, (byte)0), paramw1.ekn(), paramw2.ekn());
    AppMethodBeat.o(122734);
    return bool;
  }

  public final boolean d(w paramw1, w paramw2)
  {
    AppMethodBeat.i(122735);
    a.f.b.j.p(paramw1, "a");
    a.f.b.j.p(paramw2, "b");
    boolean bool = a(new o(false, (byte)0), paramw1.ekn(), paramw2.ekn());
    AppMethodBeat.o(122735);
    return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.l.a.h
 * JD-Core Version:    0.6.2
 */