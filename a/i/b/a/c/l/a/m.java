package a.i.b.a.c.l.a;

import a.f.b.j;
import a.i.b.a.c.l.ad;
import a.i.b.a.c.l.ag;
import a.i.b.a.c.l.ap;
import a.i.b.a.c.l.az;
import a.i.b.a.c.l.q;
import a.i.b.a.c.l.w;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Collection;
import java.util.List;

public final class m
{
  public static final m BKC;

  static
  {
    AppMethodBeat.i(122761);
    BKC = new m();
    AppMethodBeat.o(122761);
  }

  public final boolean a(az paramaz1, az paramaz2)
  {
    AppMethodBeat.i(122759);
    j.p(paramaz1, "a");
    j.p(paramaz2, "b");
    boolean bool;
    if (paramaz1 == paramaz2)
    {
      AppMethodBeat.o(122759);
      bool = true;
    }
    while (true)
    {
      return bool;
      if (((paramaz1 instanceof ad)) && ((paramaz2 instanceof ad)))
      {
        bool = c((ad)paramaz1, (ad)paramaz2);
        AppMethodBeat.o(122759);
      }
      else if (((paramaz1 instanceof q)) && ((paramaz2 instanceof q)))
      {
        if ((c(((q)paramaz1).BJx, ((q)paramaz2).BJx)) && (c(((q)paramaz1).BJy, ((q)paramaz2).BJy)))
        {
          AppMethodBeat.o(122759);
          bool = true;
        }
        else
        {
          AppMethodBeat.o(122759);
          bool = false;
        }
      }
      else
      {
        AppMethodBeat.o(122759);
        bool = false;
      }
    }
  }

  public final boolean c(ad paramad1, ad paramad2)
  {
    AppMethodBeat.i(122760);
    j.p(paramad1, "a");
    j.p(paramad2, "b");
    boolean bool;
    if ((paramad1.eci() != paramad2.eci()) || (ag.ap((w)paramad1) != ag.ap((w)paramad2)) || ((j.j(paramad1.ejw(), paramad2.ejw()) ^ true)) || (paramad1.ejt().size() != paramad2.ejt().size()))
    {
      AppMethodBeat.o(122760);
      bool = false;
    }
    while (true)
    {
      return bool;
      if (paramad1.ejt() == paramad2.ejt())
      {
        AppMethodBeat.o(122760);
        bool = true;
      }
      else
      {
        int i = ((Collection)paramad1.ejt()).size();
        for (int j = 0; ; j++)
        {
          if (j >= i)
            break label275;
          ap localap1 = (ap)paramad1.ejt().get(j);
          ap localap2 = (ap)paramad2.ejt().get(j);
          if (localap1.ekp() != localap2.ekp())
          {
            AppMethodBeat.o(122760);
            bool = false;
            break;
          }
          if (!localap1.ekp())
          {
            if (localap1.ekq() != localap2.ekq())
            {
              AppMethodBeat.o(122760);
              bool = false;
              break;
            }
            if (!a(localap1.dZS().ekn(), localap2.dZS().ekn()))
            {
              AppMethodBeat.o(122760);
              bool = false;
              break;
            }
          }
        }
        label275: AppMethodBeat.o(122760);
        bool = true;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.l.a.m
 * JD-Core Version:    0.6.2
 */