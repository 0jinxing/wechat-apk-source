package a.i.b.a.c.l.a;

import a.aa;
import a.i.b.a.c.l.ad;
import a.i.b.a.c.l.ag;
import a.i.b.a.c.l.an;
import a.i.b.a.c.l.az;
import a.i.b.a.c.l.t;
import a.i.b.a.c.l.w;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public final class l
{
  public static final l BKB;

  static
  {
    AppMethodBeat.i(122758);
    BKB = new l();
    AppMethodBeat.o(122758);
  }

  private static boolean a(o paramo, ad paramad, o.c paramc)
  {
    boolean bool = false;
    AppMethodBeat.i(122756);
    int i;
    if (((j.c(paramad)) && (!paramad.eci())) || (ag.ap((w)paramad)))
    {
      i = 1;
      if (i == 0)
        break label54;
      AppMethodBeat.o(122756);
      bool = true;
    }
    while (true)
    {
      return bool;
      i = 0;
      break;
      label54: paramo.initialize();
      ArrayDeque localArrayDeque = paramo.BKG;
      if (localArrayDeque == null)
        a.f.b.j.dWJ();
      Set localSet = paramo.BKH;
      if (localSet == null)
        a.f.b.j.dWJ();
      localArrayDeque.push(paramad);
      label387: 
      while (true)
      {
        label92: if (!((Collection)localArrayDeque).isEmpty());
        for (i = 1; ; i = 0)
        {
          if (i == 0)
            break label389;
          if (localSet.size() <= 1000)
            break;
          paramo = (Throwable)new IllegalStateException(("Too many supertypes for type: " + paramad + ". Supertypes = " + a.a.j.a((Iterable)localSet, null, null, null, 0, null, null, 63)).toString());
          AppMethodBeat.o(122756);
          throw paramo;
        }
        Object localObject1 = (ad)localArrayDeque.pop();
        a.f.b.j.o(localObject1, "current");
        if (localSet.add(localObject1))
        {
          o.c localc;
          if (((ad)localObject1).eci())
          {
            localc = (o.c)o.c.c.BKU;
            label238: if (!(a.f.b.j.j(localc, o.c.c.BKU) ^ true))
              break label366;
            label251: if (localc == null)
              break label370;
            localObject1 = ((ad)localObject1).ejw().eap().iterator();
          }
          while (true)
          {
            if (!((Iterator)localObject1).hasNext())
              break label387;
            Object localObject2 = (w)((Iterator)localObject1).next();
            a.f.b.j.o(localObject2, "supertype");
            localObject2 = localc.aJ((w)localObject2);
            if (((j.c((ad)localObject2)) && (!((ad)localObject2).eci())) || (ag.ap((w)localObject2)));
            for (i = 1; ; i = 0)
            {
              if (i == 0)
                break label378;
              paramo.clear();
              AppMethodBeat.o(122756);
              bool = true;
              break;
              localc = paramc;
              break label238;
              label366: localc = null;
              break label251;
              label370: break label92;
            }
            label378: localArrayDeque.add(localObject2);
          }
        }
      }
      label389: paramo.clear();
      AppMethodBeat.o(122756);
    }
  }

  public static boolean c(o paramo, ad paramad1, ad paramad2)
  {
    boolean bool = true;
    AppMethodBeat.i(122754);
    a.f.b.j.p(paramo, "context");
    a.f.b.j.p(paramad1, "subType");
    a.f.b.j.p(paramad2, "superType");
    if ((j.e(paramad1)) || (j.d(paramad1)) || (paramo.e((az)paramad1)));
    for (int i = 1; (aa.AUz) && (i == 0); i = 0)
    {
      paramo = (Throwable)new AssertionError("Not singleClassifierType superType: ".concat(String.valueOf(paramad2)));
      AppMethodBeat.o(122754);
      throw paramo;
    }
    if ((j.d(paramad2)) || (paramo.e((az)paramad2)));
    for (i = 1; (aa.AUz) && (i == 0); i = 0)
    {
      paramo = (Throwable)new AssertionError("Not singleClassifierType superType: ".concat(String.valueOf(paramad2)));
      AppMethodBeat.o(122754);
      throw paramo;
    }
    if (paramad2.eci())
      AppMethodBeat.o(122754);
    while (true)
    {
      return bool;
      if (ag.ap((w)paramad1))
      {
        AppMethodBeat.o(122754);
      }
      else if (a(paramo, paramad1, (o.c)o.c.a.BKT))
      {
        AppMethodBeat.o(122754);
      }
      else if (ag.ap((w)paramad2))
      {
        AppMethodBeat.o(122754);
        bool = false;
      }
      else if (a(paramo, paramad2, (o.c)o.c.d.BKV))
      {
        AppMethodBeat.o(122754);
        bool = false;
      }
      else if (j.c(paramad1))
      {
        AppMethodBeat.o(122754);
        bool = false;
      }
      else
      {
        bool = d(paramo, paramad1, paramad2.ejw());
        AppMethodBeat.o(122754);
      }
    }
  }

  private static boolean d(o paramo, ad paramad, an paraman)
  {
    boolean bool = false;
    AppMethodBeat.i(122757);
    int i;
    if ((!paramad.eci()) && (a.f.b.j.j(paramad.ejw(), paraman)))
    {
      i = 1;
      if (i == 0)
        break label48;
      AppMethodBeat.o(122757);
      bool = true;
    }
    while (true)
    {
      return bool;
      i = 0;
      break;
      label48: paramo.initialize();
      ArrayDeque localArrayDeque = paramo.BKG;
      if (localArrayDeque == null)
        a.f.b.j.dWJ();
      Set localSet = paramo.BKH;
      if (localSet == null)
        a.f.b.j.dWJ();
      localArrayDeque.push(paramad);
      label86: label232: label245: label379: 
      while (true)
      {
        if (!((Collection)localArrayDeque).isEmpty());
        for (i = 1; ; i = 0)
        {
          if (i == 0)
            break label381;
          if (localSet.size() <= 1000)
            break;
          paramo = (Throwable)new IllegalStateException(("Too many supertypes for type: " + paramad + ". Supertypes = " + a.a.j.a((Iterable)localSet, null, null, null, 0, null, null, 63)).toString());
          AppMethodBeat.o(122757);
          throw paramo;
        }
        Object localObject1 = (ad)localArrayDeque.pop();
        a.f.b.j.o(localObject1, "current");
        if (localSet.add(localObject1))
        {
          o.c localc;
          if (((ad)localObject1).eci())
          {
            localc = (o.c)o.c.c.BKU;
            if (!(a.f.b.j.j(localc, o.c.c.BKU) ^ true))
              break label358;
            if (localc == null)
              break label362;
            localObject1 = ((ad)localObject1).ejw().eap().iterator();
          }
          while (true)
          {
            if (!((Iterator)localObject1).hasNext())
              break label379;
            Object localObject2 = (w)((Iterator)localObject1).next();
            a.f.b.j.o(localObject2, "supertype");
            localObject2 = localc.aJ((w)localObject2);
            if ((!((ad)localObject2).eci()) && (a.f.b.j.j(((ad)localObject2).ejw(), paraman)));
            for (i = 1; ; i = 0)
            {
              if (i == 0)
                break label370;
              paramo.clear();
              AppMethodBeat.o(122757);
              bool = true;
              break;
              localc = (o.c)o.c.a.BKT;
              break label232;
              localc = null;
              break label245;
              break label86;
            }
            localArrayDeque.add(localObject2);
          }
        }
      }
      label358: label362: label370: label381: paramo.clear();
      AppMethodBeat.o(122757);
    }
  }

  public static boolean d(az paramaz)
  {
    AppMethodBeat.i(122755);
    a.f.b.j.p(paramaz, "type");
    boolean bool = a(new o(false, (byte)0), t.ak((w)paramaz), (o.c)o.c.a.BKT);
    AppMethodBeat.o(122755);
    return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.l.a.l
 * JD-Core Version:    0.6.2
 */