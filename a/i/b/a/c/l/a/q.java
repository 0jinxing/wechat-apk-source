package a.i.b.a.c.l.a;

import a.i.b.a.c.a.g;
import a.i.b.a.c.b.ar;
import a.i.b.a.c.i.c.a;
import a.i.b.a.c.l.am;
import a.i.b.a.c.l.an;
import a.i.b.a.c.l.ap;
import a.i.b.a.c.l.av;
import a.i.b.a.c.l.ba;
import a.i.b.a.c.l.w;
import a.i.b.a.c.l.y;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.List;

public class q
{
  private final r BKW;

  static
  {
    AppMethodBeat.i(122801);
    if (!q.class.desiredAssertionStatus());
    for (boolean bool = true; ; bool = false)
    {
      $assertionsDisabled = bool;
      AppMethodBeat.o(122801);
      return;
    }
  }

  public q(r paramr)
  {
    this.BKW = paramr;
  }

  private static w a(ar paramar, ap paramap)
  {
    AppMethodBeat.i(122792);
    int i;
    if ((paramap.ekq() == ba.BKi) || (paramar.dZh() == ba.BKi))
    {
      i = 1;
      if (i == 0)
        break label55;
      paramar = a.G(paramar).dXN();
      AppMethodBeat.o(122792);
    }
    while (true)
    {
      return paramar;
      i = 0;
      break;
      label55: paramar = paramap.dZS();
      AppMethodBeat.o(122792);
    }
  }

  private static boolean a(ap paramap1, ap paramap2, ar paramar)
  {
    AppMethodBeat.i(122800);
    if (paramar.dZh() != ba.BKh)
      AppMethodBeat.o(122800);
    while (true)
    {
      return false;
      if ((paramap1.ekq() != ba.BKh) && (paramap2.ekq() == ba.BKh))
      {
        paramap2.dZS();
        AppMethodBeat.o(122800);
      }
      else
      {
        AppMethodBeat.o(122800);
      }
    }
  }

  private static w b(ar paramar, ap paramap)
  {
    AppMethodBeat.i(122793);
    int i;
    if ((paramap.ekq() == ba.BKj) || (paramar.dZh() == ba.BKj))
    {
      i = 1;
      if (i == 0)
        break label55;
      paramar = a.G(paramar).dXL();
      AppMethodBeat.o(122793);
    }
    while (true)
    {
      return paramar;
      i = 0;
      break;
      label55: paramar = paramap.dZS();
      AppMethodBeat.o(122793);
    }
  }

  private static q.a c(ar paramar, ap paramap)
  {
    AppMethodBeat.i(122796);
    paramar = paramar.dZh();
    paramap = paramap.ekq();
    Object localObject;
    if (paramap == ba.BKh)
      localObject = paramap;
    while (true)
    {
      if ((localObject == ba.BKi) && (paramar == ba.BKj))
      {
        paramar = q.a.BLb;
        AppMethodBeat.o(122796);
      }
      while (true)
      {
        return paramar;
        if ((localObject == ba.BKj) && (paramar == ba.BKi))
        {
          paramar = q.a.BLb;
          AppMethodBeat.o(122796);
        }
        else
        {
          paramar = q.a.a(paramar);
          AppMethodBeat.o(122796);
        }
      }
      localObject = paramar;
      paramar = paramap;
    }
  }

  public static w e(w paramw1, w paramw2)
  {
    AppMethodBeat.i(122791);
    paramw1 = t.a(paramw1, paramw2, new p());
    AppMethodBeat.o(122791);
    return paramw1;
  }

  private boolean f(w paramw1, w paramw2)
  {
    AppMethodBeat.i(122795);
    if ((!$assertionsDisabled) && (a.i.b.a.c.l.t.ai(paramw1)))
    {
      paramw1 = new AssertionError("Only inflexible types are allowed here: ".concat(String.valueOf(paramw1)));
      AppMethodBeat.o(122795);
      throw paramw1;
    }
    boolean bool;
    if ((c(a.i.b.a.c.l.t.aj(paramw2).BJx, paramw1)) && (c(paramw1, a.i.b.a.c.l.t.aj(paramw2).BJy)))
    {
      bool = true;
      AppMethodBeat.o(122795);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(122795);
    }
  }

  private boolean g(w paramw1, w paramw2)
  {
    boolean bool = false;
    AppMethodBeat.i(122798);
    if ((y.an(paramw1)) || (y.an(paramw2)))
    {
      AppMethodBeat.o(122798);
      bool = true;
    }
    while (true)
    {
      return bool;
      if ((!paramw2.eci()) && (paramw1.eci()))
      {
        AppMethodBeat.o(122798);
      }
      else if (g.z(paramw1))
      {
        AppMethodBeat.o(122798);
        bool = true;
      }
      else
      {
        paramw1 = t.a(paramw1, paramw2, this.BKW);
        if (paramw1 == null)
        {
          AppMethodBeat.o(122798);
        }
        else if ((!paramw2.eci()) && (paramw1.eci()))
        {
          AppMethodBeat.o(122798);
        }
        else
        {
          bool = h(paramw1, paramw2);
          AppMethodBeat.o(122798);
        }
      }
    }
  }

  private boolean h(w paramw1, w paramw2)
  {
    boolean bool = false;
    AppMethodBeat.i(122799);
    Object localObject1 = paramw1.ejw();
    paramw1 = paramw1.ejt();
    paramw2 = paramw2.ejt();
    if (paramw1.size() != paramw2.size())
      AppMethodBeat.o(122799);
    while (true)
    {
      return bool;
      localObject1 = ((an)localObject1).getParameters();
      label243: label373: for (int i = 0; ; i++)
      {
        if (i >= ((List)localObject1).size())
          break label379;
        Object localObject2 = (ar)((List)localObject1).get(i);
        ap localap1 = (ap)paramw2.get(i);
        ap localap2 = (ap)paramw1.get(i);
        if (!localap1.ekp())
        {
          a(localap2, localap1, (ar)localObject2);
          if ((y.an(localap2.dZS())) || (y.an(localap1.dZS())));
          for (int j = 1; ; j = 0)
          {
            if ((j != 0) || (((ar)localObject2).dZh() != ba.BKh) || (localap2.ekq() != ba.BKh) || (localap1.ekq() != ba.BKh))
              break label243;
            if (this.BKW.a(localap2.dZS(), localap1.dZS(), this))
              break label373;
            AppMethodBeat.o(122799);
            break;
          }
          w localw1 = a((ar)localObject2, localap1);
          w localw2 = a((ar)localObject2, localap2);
          if (!this.BKW.b(localw2, localw1, this))
          {
            AppMethodBeat.o(122799);
            break;
          }
          localw2 = b((ar)localObject2, localap1);
          localObject2 = b((ar)localObject2, localap2);
          if (localap1.ekq() != ba.BKj)
          {
            if (this.BKW.b(localw2, (w)localObject2, this))
              continue;
            AppMethodBeat.o(122799);
            break;
          }
          if ((!$assertionsDisabled) && (!g.y(localw2)))
          {
            paramw1 = new AssertionError("In component must be Nothing for out-projection");
            AppMethodBeat.o(122799);
            throw paramw1;
          }
        }
      }
      label379: AppMethodBeat.o(122799);
      bool = true;
    }
  }

  public final boolean c(w paramw1, w paramw2)
  {
    AppMethodBeat.i(122797);
    boolean bool;
    if (am.b(paramw1, paramw2))
      if ((!paramw1.eci()) || (paramw2.eci()))
      {
        bool = true;
        AppMethodBeat.o(122797);
      }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(122797);
      continue;
      w localw1 = am.as(paramw1);
      w localw2 = am.at(paramw2);
      if ((localw1 != paramw1) || (localw2 != paramw2))
      {
        paramw2 = localw2;
        paramw1 = localw1;
        break;
      }
      bool = g(paramw1, paramw2);
      AppMethodBeat.o(122797);
    }
  }

  public final boolean d(w paramw1, w paramw2)
  {
    boolean bool = false;
    AppMethodBeat.i(122794);
    if (paramw1 == paramw2)
    {
      AppMethodBeat.o(122794);
      bool = true;
    }
    while (true)
    {
      return bool;
      if (a.i.b.a.c.l.t.ai(paramw1))
      {
        if (a.i.b.a.c.l.t.ai(paramw2))
        {
          if ((!y.an(paramw1)) && (!y.an(paramw2)) && (c(paramw1, paramw2)) && (c(paramw2, paramw1)))
          {
            AppMethodBeat.o(122794);
            bool = true;
          }
          else
          {
            AppMethodBeat.o(122794);
          }
        }
        else
        {
          bool = f(paramw2, paramw1);
          AppMethodBeat.o(122794);
        }
      }
      else if (a.i.b.a.c.l.t.ai(paramw2))
      {
        bool = f(paramw1, paramw2);
        AppMethodBeat.o(122794);
      }
      else if (paramw1.eci() != paramw2.eci())
      {
        AppMethodBeat.o(122794);
      }
      else if (paramw1.eci())
      {
        bool = this.BKW.a(av.aA(paramw1), av.aA(paramw2), this);
        AppMethodBeat.o(122794);
      }
      else
      {
        an localan1 = paramw1.ejw();
        an localan2 = paramw2.ejw();
        if (!this.BKW.b(localan1, localan2))
        {
          AppMethodBeat.o(122794);
        }
        else
        {
          paramw1 = paramw1.ejt();
          List localList = paramw2.ejt();
          if (paramw1.size() != localList.size())
          {
            AppMethodBeat.o(122794);
          }
          else
          {
            for (int i = 0; ; i++)
            {
              if (i >= paramw1.size())
                break label416;
              ap localap = (ap)paramw1.get(i);
              paramw2 = (ap)localList.get(i);
              if ((!localap.ekp()) || (!paramw2.ekp()))
              {
                ar localar1 = (ar)localan1.getParameters().get(i);
                ar localar2 = (ar)localan2.getParameters().get(i);
                a(localap, paramw2, localar1);
                if (c(localar1, localap) != c(localar2, paramw2))
                {
                  AppMethodBeat.o(122794);
                  break;
                }
                if (!this.BKW.a(localap.dZS(), paramw2.dZS(), this))
                {
                  AppMethodBeat.o(122794);
                  break;
                }
              }
            }
            label416: AppMethodBeat.o(122794);
            bool = true;
          }
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.l.a.q
 * JD-Core Version:    0.6.2
 */