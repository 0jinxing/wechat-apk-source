package a.i.b.a.c.i;

import a.f.a.m;
import a.i.b.a.c.b.a;
import a.i.b.a.c.b.ab;
import a.i.b.a.c.b.ar;
import a.i.b.a.c.b.e;
import a.i.b.a.c.b.l;
import a.i.b.a.c.l.a.c.a;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class b
{
  public static final b BDK;

  static
  {
    AppMethodBeat.i(121926);
    BDK = new b();
    AppMethodBeat.o(121926);
  }

  private final boolean a(ar paramar1, ar paramar2, m<? super l, ? super l, Boolean> paramm)
  {
    AppMethodBeat.i(121924);
    boolean bool;
    if (a.f.b.j.j(paramar1, paramar2))
    {
      AppMethodBeat.o(121924);
      bool = true;
    }
    while (true)
    {
      return bool;
      if (a.f.b.j.j(paramar1.dXW(), paramar2.dXW()))
      {
        AppMethodBeat.o(121924);
        bool = false;
      }
      else if (!a((l)paramar1, (l)paramar2, paramm))
      {
        AppMethodBeat.o(121924);
        bool = false;
      }
      else if (paramar1.getIndex() == paramar2.getIndex())
      {
        AppMethodBeat.o(121924);
        bool = true;
      }
      else
      {
        AppMethodBeat.o(121924);
        bool = false;
      }
    }
  }

  private final boolean a(l paraml1, l paraml2, m<? super l, ? super l, Boolean> paramm)
  {
    AppMethodBeat.i(121925);
    paraml1 = paraml1.dXW();
    paraml2 = paraml2.dXW();
    boolean bool;
    if (((paraml1 instanceof a.i.b.a.c.b.b)) || ((paraml2 instanceof a.i.b.a.c.b.b)))
    {
      bool = ((Boolean)paramm.m(paraml1, paraml2)).booleanValue();
      AppMethodBeat.o(121925);
    }
    while (true)
    {
      return bool;
      bool = d(paraml1, paraml2);
      AppMethodBeat.o(121925);
    }
  }

  public final boolean d(l paraml1, l paraml2)
  {
    AppMethodBeat.i(121923);
    boolean bool;
    if (((paraml1 instanceof e)) && ((paraml2 instanceof e)))
    {
      paraml1 = (e)paraml1;
      paraml2 = (e)paraml2;
      bool = a.f.b.j.j(paraml1.dXY(), paraml2.dXY());
      AppMethodBeat.o(121923);
    }
    while (true)
    {
      return bool;
      if (((paraml1 instanceof ar)) && ((paraml2 instanceof ar)))
      {
        bool = a((ar)paraml1, (ar)paraml2, (m)b.c.BDP);
        AppMethodBeat.o(121923);
      }
      else if (((paraml1 instanceof a)) && ((paraml2 instanceof a)))
      {
        paraml1 = (a)paraml1;
        paraml2 = (a)paraml2;
        a.f.b.j.p(paraml1, "a");
        a.f.b.j.p(paraml2, "b");
        if (a.f.b.j.j(paraml1, paraml2))
        {
          AppMethodBeat.o(121923);
          bool = true;
        }
        else if ((!(a.f.b.j.j(paraml1.dZg(), paraml2.dZg()) ^ true)) && (!a.f.b.j.j(paraml1.dXW(), paraml2.dXW())))
        {
          if ((d.m((l)paraml1)) || (d.m((l)paraml2)))
          {
            AppMethodBeat.o(121923);
            bool = false;
          }
          else if (a((l)paraml1, (l)paraml2, (m)b.a.BDL))
          {
            j localj = j.a((c.a)new b.b(paraml1, paraml2));
            a.f.b.j.o(localj, "OverridingUtil.createWit…= a && y == b})\n        }");
            j.a locala = localj.a(paraml1, paraml2, null, true);
            a.f.b.j.o(locala, "overridingUtil.isOverrid… null, !ignoreReturnType)");
            if (locala.BEy == j.a.a.BEA)
            {
              paraml1 = localj.a(paraml2, paraml1, null, true);
              a.f.b.j.o(paraml1, "overridingUtil.isOverrid… null, !ignoreReturnType)");
              if (paraml1.BEy == j.a.a.BEA)
              {
                AppMethodBeat.o(121923);
                bool = true;
              }
            }
          }
        }
        else
        {
          AppMethodBeat.o(121923);
          bool = false;
        }
      }
      else if (((paraml1 instanceof ab)) && ((paraml2 instanceof ab)))
      {
        bool = a.f.b.j.j(((ab)paraml1).dZF(), ((ab)paraml2).dZF());
        AppMethodBeat.o(121923);
      }
      else
      {
        bool = a.f.b.j.j(paraml1, paraml2);
        AppMethodBeat.o(121923);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.i.b
 * JD-Core Version:    0.6.2
 */