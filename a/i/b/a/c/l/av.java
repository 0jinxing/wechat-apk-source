package a.i.b.a.c.l;

import a.a.j;
import a.f.a.b;
import a.i.b.a.c.b.a.g.a;
import a.i.b.a.c.b.e;
import a.i.b.a.c.l.a.k;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class av
{
  public static final ad BKc;
  public static final ad BKd;
  public static final ad BKe;
  public static final ad BKf;

  static
  {
    AppMethodBeat.i(122700);
    if (!av.class.desiredAssertionStatus());
    for (boolean bool = true; ; bool = false)
    {
      $assertionsDisabled = bool;
      BKc = p.awo("DONT_CARE");
      BKd = p.awn("Cannot be inferred");
      BKe = new av.a("NO_EXPECTED_TYPE");
      BKf = new av.a("UNIT_EXPECTED_TYPE");
      AppMethodBeat.o(122700);
      return;
    }
  }

  public static ad a(a.i.b.a.c.b.h paramh, a.i.b.a.c.i.e.h paramh1)
  {
    AppMethodBeat.i(122691);
    if (p.L(paramh))
    {
      paramh = p.awn("Unsubstituted type for ".concat(String.valueOf(paramh)));
      AppMethodBeat.o(122691);
    }
    while (true)
    {
      return paramh;
      paramh = paramh.dXY();
      List localList = ga(paramh.getParameters());
      g.a locala = a.i.b.a.c.b.a.g.BfJ;
      paramh = x.a(g.a.eai(), paramh, localList, false, paramh1);
      AppMethodBeat.o(122691);
    }
  }

  public static w a(w paramw, boolean paramBoolean)
  {
    AppMethodBeat.i(122689);
    paramw = paramw.ekn().rK(paramBoolean);
    AppMethodBeat.o(122689);
    return paramw;
  }

  public static w aA(w paramw)
  {
    AppMethodBeat.i(122688);
    paramw = a(paramw, false);
    AppMethodBeat.o(122688);
    return paramw;
  }

  public static boolean aB(w paramw)
  {
    AppMethodBeat.i(122693);
    boolean bool;
    if (paramw.eci())
    {
      AppMethodBeat.o(122693);
      bool = true;
    }
    while (true)
    {
      return bool;
      if ((t.ai(paramw)) && (aB(t.aj(paramw).BJy)))
      {
        AppMethodBeat.o(122693);
        bool = true;
      }
      else if (aE(paramw))
      {
        if (!(paramw.ejw().dYs() instanceof e))
        {
          au localau = au.aw(paramw);
          Object localObject = paramw.ejw().eap();
          ArrayList localArrayList = new ArrayList(((Collection)localObject).size());
          Iterator localIterator = ((Collection)localObject).iterator();
          label171: 
          while (localIterator.hasNext())
          {
            localObject = localau.c((w)localIterator.next(), ba.BKh);
            if (localObject != null);
            for (localObject = b((w)localObject, paramw.eci()); ; localObject = null)
            {
              if (localObject == null)
                break label171;
              localArrayList.add(localObject);
              break;
            }
          }
          paramw = localArrayList.iterator();
          while (true)
            if (paramw.hasNext())
              if (aB((w)paramw.next()))
              {
                AppMethodBeat.o(122693);
                bool = true;
                break;
              }
        }
        AppMethodBeat.o(122693);
        bool = false;
      }
      else
      {
        paramw = paramw.ejw();
        if ((paramw instanceof v))
        {
          paramw = paramw.eap().iterator();
          while (true)
            if (paramw.hasNext())
              if (aB((w)paramw.next()))
              {
                AppMethodBeat.o(122693);
                bool = true;
                break;
              }
        }
        AppMethodBeat.o(122693);
        bool = false;
      }
    }
  }

  public static boolean aC(w paramw)
  {
    boolean bool = true;
    AppMethodBeat.i(122694);
    if (paramw.eci())
      AppMethodBeat.o(122694);
    while (true)
    {
      return bool;
      if ((t.ai(paramw)) && (aC(t.aj(paramw).BJy)))
      {
        AppMethodBeat.o(122694);
      }
      else
      {
        bool = false;
        AppMethodBeat.o(122694);
      }
    }
  }

  public static e aD(w paramw)
  {
    AppMethodBeat.i(122695);
    paramw = paramw.ejw().dYs();
    if ((paramw instanceof e))
    {
      paramw = (e)paramw;
      AppMethodBeat.o(122695);
    }
    while (true)
    {
      return paramw;
      paramw = null;
      AppMethodBeat.o(122695);
    }
  }

  public static boolean aE(w paramw)
  {
    AppMethodBeat.i(122698);
    boolean bool;
    if ((aF(paramw) != null) || ((paramw.ejw() instanceof k)))
    {
      bool = true;
      AppMethodBeat.o(122698);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(122698);
    }
  }

  private static a.i.b.a.c.b.ar aF(w paramw)
  {
    AppMethodBeat.i(122699);
    if ((paramw.ejw().dYs() instanceof a.i.b.a.c.b.ar))
    {
      paramw = (a.i.b.a.c.b.ar)paramw.ejw().dYs();
      AppMethodBeat.o(122699);
    }
    while (true)
    {
      return paramw;
      paramw = null;
      AppMethodBeat.o(122699);
    }
  }

  public static boolean ax(w paramw)
  {
    if ((paramw == BKe) || (paramw == BKf));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public static boolean ay(w paramw)
  {
    AppMethodBeat.i(122686);
    boolean bool;
    if ((paramw != null) && (paramw.ejw() == BKc.ejw()))
    {
      bool = true;
      AppMethodBeat.o(122686);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(122686);
    }
  }

  public static w az(w paramw)
  {
    AppMethodBeat.i(122687);
    paramw = a(paramw, true);
    AppMethodBeat.o(122687);
    return paramw;
  }

  public static w b(w paramw, boolean paramBoolean)
  {
    AppMethodBeat.i(122690);
    if (paramBoolean)
    {
      paramw = a(paramw, true);
      AppMethodBeat.o(122690);
    }
    while (true)
    {
      return paramw;
      AppMethodBeat.o(122690);
    }
  }

  public static boolean b(w paramw, b<az, Boolean> paramb)
  {
    AppMethodBeat.i(122696);
    boolean bool;
    if (paramw == null)
    {
      AppMethodBeat.o(122696);
      bool = false;
    }
    while (true)
    {
      return bool;
      az localaz = paramw.ekn();
      if (((Boolean)paramb.am(localaz)).booleanValue())
      {
        AppMethodBeat.o(122696);
        bool = true;
      }
      else
      {
        if ((localaz instanceof q));
        for (Object localObject = (q)localaz; ; localObject = null)
        {
          if ((localObject == null) || ((!b(((q)localObject).BJx, paramb)) && (!b(((q)localObject).BJy, paramb))))
            break label107;
          AppMethodBeat.o(122696);
          bool = true;
          break;
        }
        label107: if (((localaz instanceof g)) && (b(((g)localaz).BJh, paramb)))
        {
          AppMethodBeat.o(122696);
          bool = true;
        }
        else
        {
          localObject = paramw.ejw();
          if ((localObject instanceof v))
          {
            paramw = ((v)localObject).BJH.iterator();
            while (true)
              if (paramw.hasNext())
                if (b((w)paramw.next(), paramb))
                {
                  AppMethodBeat.o(122696);
                  bool = true;
                  break;
                }
            AppMethodBeat.o(122696);
            bool = false;
          }
          else
          {
            paramw = paramw.ejt().iterator();
            while (true)
              if (paramw.hasNext())
              {
                localObject = (ap)paramw.next();
                if ((!((ap)localObject).ekp()) && (b(((ap)localObject).dZS(), paramb)))
                {
                  AppMethodBeat.o(122696);
                  bool = true;
                  break;
                }
              }
            AppMethodBeat.o(122696);
            bool = false;
          }
        }
      }
    }
  }

  public static ap e(a.i.b.a.c.b.ar paramar)
  {
    AppMethodBeat.i(122697);
    paramar = new ah(paramar);
    AppMethodBeat.o(122697);
    return paramar;
  }

  public static List<ap> ga(List<a.i.b.a.c.b.ar> paramList)
  {
    AppMethodBeat.i(122692);
    ArrayList localArrayList = new ArrayList(paramList.size());
    paramList = paramList.iterator();
    while (paramList.hasNext())
      localArrayList.add(new ar(((a.i.b.a.c.b.ar)paramList.next()).dZf()));
    paramList = j.m(localArrayList);
    AppMethodBeat.o(122692);
    return paramList;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.l.av
 * JD-Core Version:    0.6.2
 */