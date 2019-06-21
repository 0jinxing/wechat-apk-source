package a.i.b.a.c.l;

import a.f.b.j;
import a.m;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class ax
{
  public static final az a(az paramaz, w paramw)
  {
    AppMethodBeat.i(122702);
    j.p(paramaz, "receiver$0");
    j.p(paramw, "origin");
    paramaz = b(paramaz, aG(paramw));
    AppMethodBeat.o(122702);
    return paramaz;
  }

  public static final w aG(w paramw)
  {
    AppMethodBeat.i(122701);
    j.p(paramw, "receiver$0");
    if ((paramw instanceof aw))
    {
      paramw = ((aw)paramw).ekl();
      AppMethodBeat.o(122701);
    }
    while (true)
    {
      return paramw;
      paramw = null;
      AppMethodBeat.o(122701);
    }
  }

  public static final az b(az paramaz, w paramw)
  {
    AppMethodBeat.i(122703);
    j.p(paramaz, "receiver$0");
    if (paramw == null)
      AppMethodBeat.o(122703);
    while (true)
    {
      return paramaz;
      if ((paramaz instanceof ad))
      {
        paramaz = (az)new af((ad)paramaz, paramw);
        AppMethodBeat.o(122703);
      }
      else
      {
        if (!(paramaz instanceof q))
          break;
        paramaz = (az)new s((q)paramaz, paramw);
        AppMethodBeat.o(122703);
      }
    }
    paramaz = new m();
    AppMethodBeat.o(122703);
    throw paramaz;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.l.ax
 * JD-Core Version:    0.6.2
 */