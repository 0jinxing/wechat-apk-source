package a.i.b.a.c.i;

import a.i.b.a.c.b.ah;
import a.i.b.a.c.b.aq;
import a.i.b.a.c.b.e;
import a.i.b.a.c.b.k;
import a.i.b.a.c.b.l;
import a.i.b.a.c.b.t;
import a.i.b.a.c.f.f;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Comparator;

public final class g$a
  implements Comparator<l>
{
  public static final a BEk;

  static
  {
    AppMethodBeat.i(121991);
    BEk = new a();
    AppMethodBeat.o(121991);
  }

  private static int E(l paraml)
  {
    AppMethodBeat.i(121987);
    int i;
    if (d.x(paraml))
    {
      i = 8;
      AppMethodBeat.o(121987);
    }
    while (true)
    {
      return i;
      if ((paraml instanceof k))
      {
        i = 7;
        AppMethodBeat.o(121987);
      }
      else if ((paraml instanceof ah))
      {
        if (((ah)paraml).dYQ() == null)
        {
          i = 6;
          AppMethodBeat.o(121987);
        }
        else
        {
          i = 5;
          AppMethodBeat.o(121987);
        }
      }
      else if ((paraml instanceof t))
      {
        if (((t)paraml).dYQ() == null)
        {
          i = 4;
          AppMethodBeat.o(121987);
        }
        else
        {
          i = 3;
          AppMethodBeat.o(121987);
        }
      }
      else if ((paraml instanceof e))
      {
        i = 2;
        AppMethodBeat.o(121987);
      }
      else if ((paraml instanceof aq))
      {
        i = 1;
        AppMethodBeat.o(121987);
      }
      else
      {
        i = 0;
        AppMethodBeat.o(121987);
      }
    }
  }

  private static Integer f(l paraml1, l paraml2)
  {
    AppMethodBeat.i(121988);
    int i = E(paraml2) - E(paraml1);
    if (i != 0)
    {
      paraml1 = Integer.valueOf(i);
      AppMethodBeat.o(121988);
    }
    while (true)
    {
      return paraml1;
      if ((d.x(paraml1)) && (d.x(paraml2)))
      {
        paraml1 = Integer.valueOf(0);
        AppMethodBeat.o(121988);
      }
      else
      {
        i = paraml1.dZg().v(paraml2.dZg());
        if (i != 0)
        {
          paraml1 = Integer.valueOf(i);
          AppMethodBeat.o(121988);
        }
        else
        {
          paraml1 = null;
          AppMethodBeat.o(121988);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.i.g.a
 * JD-Core Version:    0.6.2
 */