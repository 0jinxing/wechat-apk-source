package a.i.b.a.c.a;

import a.i.b.a.c.b.ab;
import a.i.b.a.c.f.a;
import a.i.b.a.c.f.b;
import a.i.b.a.c.f.c;
import a.i.b.a.c.f.f;
import a.i.b.a.c.l.an;
import a.i.b.a.c.l.av;
import a.i.b.a.c.l.w;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public final class m
{
  private static final Set<f> BcC;
  private static final HashMap<a, a> BcD;
  private static final HashMap<a, a> BcE;
  private static final Set<f> BcF;
  public static final m BcG;

  static
  {
    int i = 0;
    AppMethodBeat.i(119123);
    BcG = new m();
    l[] arrayOfl = l.values();
    Object localObject = (Collection)new ArrayList(arrayOfl.length);
    int j = arrayOfl.length;
    for (int k = 0; k < j; k++)
      ((Collection)localObject).add(arrayOfl[k].BbZ);
    BcC = a.a.j.o((Iterable)localObject);
    BcD = new HashMap();
    BcE = new HashMap();
    arrayOfl = l.values();
    localObject = (Collection)new LinkedHashSet();
    j = arrayOfl.length;
    for (k = 0; k < j; k++)
      ((Collection)localObject).add(arrayOfl[k].BcA.ByN.ByQ.ehK());
    BcF = (Set)localObject;
    localObject = l.values();
    j = localObject.length;
    for (k = i; k < j; k++)
    {
      arrayOfl = localObject[k];
      ((Map)BcD).put(arrayOfl.BcA, arrayOfl.BcB);
      ((Map)BcE).put(arrayOfl.BcB, arrayOfl.BcA);
    }
    AppMethodBeat.o(119123);
  }

  public static boolean G(w paramw)
  {
    AppMethodBeat.i(119122);
    a.f.b.j.p(paramw, "type");
    boolean bool;
    if (av.ax(paramw))
    {
      AppMethodBeat.o(119122);
      bool = false;
    }
    while (true)
    {
      return bool;
      paramw = paramw.ejw().dYs();
      if (paramw == null)
      {
        AppMethodBeat.o(119122);
        bool = false;
      }
      else
      {
        a.f.b.j.o(paramw, "type.constructor.declara…escriptor ?: return false");
        paramw = (a.i.b.a.c.b.l)paramw;
        a.f.b.j.p(paramw, "descriptor");
        a.i.b.a.c.b.l locall = paramw.dXW();
        if (((locall instanceof ab)) && (a.f.b.j.j(((ab)locall).dZF(), g.AZV)) && (BcC.contains(paramw.dZg())))
        {
          bool = true;
          AppMethodBeat.o(119122);
        }
        else
        {
          AppMethodBeat.o(119122);
          bool = false;
        }
      }
    }
  }

  public static a c(a parama)
  {
    AppMethodBeat.i(119120);
    a.f.b.j.p(parama, "arrayClassId");
    parama = (a)BcD.get(parama);
    AppMethodBeat.o(119120);
    return parama;
  }

  public static a d(a parama)
  {
    AppMethodBeat.i(119121);
    a.f.b.j.p(parama, "arrayClassId");
    parama = (a)BcE.get(parama);
    AppMethodBeat.o(119121);
    return parama;
  }

  public static boolean d(f paramf)
  {
    AppMethodBeat.i(119119);
    a.f.b.j.p(paramf, "name");
    boolean bool = BcF.contains(paramf);
    AppMethodBeat.o(119119);
    return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.a.m
 * JD-Core Version:    0.6.2
 */