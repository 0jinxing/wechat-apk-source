package a.i.b.a.c.d.a;

import a.i.b.a.c.b.ay;
import a.i.b.a.c.b.az;
import a.i.b.a.c.b.l;
import a.i.b.a.c.b.p;
import a.i.b.a.c.i.e.a.e;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class n$3 extends az
{
  n$3(String paramString)
  {
    super(paramString, true);
  }

  public final boolean b(e parame, p paramp, l paraml)
  {
    AppMethodBeat.i(119704);
    boolean bool = n.c(parame, paramp, paraml);
    AppMethodBeat.o(119704);
    return bool;
  }

  public final Integer c(az paramaz)
  {
    AppMethodBeat.i(119705);
    if (this == paramaz)
    {
      paramaz = Integer.valueOf(0);
      AppMethodBeat.o(119705);
    }
    while (true)
    {
      return paramaz;
      if (paramaz == ay.BeZ)
      {
        paramaz = null;
        AppMethodBeat.o(119705);
      }
      else if (ay.b(paramaz))
      {
        paramaz = Integer.valueOf(1);
        AppMethodBeat.o(119705);
      }
      else
      {
        paramaz = Integer.valueOf(-1);
        AppMethodBeat.o(119705);
      }
    }
  }

  public final az eag()
  {
    return ay.BeY;
  }

  public final String getDisplayName()
  {
    return "protected/*protected and package*/";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.d.a.n.3
 * JD-Core Version:    0.6.2
 */