package a.i.b.a.c.l;

import a.f.b.j;
import a.i.b.a.c.b.a.g;
import a.m;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.List;

public final class at
{
  private static ad a(ad paramad, List<? extends ap> paramList, g paramg)
  {
    AppMethodBeat.i(122657);
    j.p(paramad, "receiver$0");
    j.p(paramList, "newArguments");
    j.p(paramg, "newAnnotations");
    if ((paramList.isEmpty()) && (paramg == paramad.dYn()))
      AppMethodBeat.o(122657);
    while (true)
    {
      return paramad;
      if (paramList.isEmpty())
      {
        paramad = paramad.d(paramg);
        AppMethodBeat.o(122657);
      }
      else
      {
        paramad = x.c(paramg, paramad.ejw(), paramList, paramad.eci());
        AppMethodBeat.o(122657);
      }
    }
  }

  public static final w a(w paramw, List<? extends ap> paramList, g paramg)
  {
    AppMethodBeat.i(122656);
    j.p(paramw, "receiver$0");
    j.p(paramList, "newArguments");
    j.p(paramg, "newAnnotations");
    if (((paramList.isEmpty()) || (paramList == paramw.ejt())) && (paramg == paramw.dYn()))
      AppMethodBeat.o(122656);
    while (true)
    {
      return paramw;
      paramw = paramw.ekn();
      if ((paramw instanceof q))
      {
        paramw = (w)x.a(a(((q)paramw).BJx, paramList, paramg), a(((q)paramw).BJy, paramList, paramg));
        AppMethodBeat.o(122656);
      }
      else
      {
        if (!(paramw instanceof ad))
          break;
        paramw = (w)a((ad)paramw, paramList, paramg);
        AppMethodBeat.o(122656);
      }
    }
    paramw = new m();
    AppMethodBeat.o(122656);
    throw paramw;
  }

  public static final ad av(w paramw)
  {
    AppMethodBeat.i(122659);
    j.p(paramw, "receiver$0");
    az localaz = paramw.ekn();
    Object localObject = localaz;
    if (!(localaz instanceof ad))
      localObject = null;
    localObject = (ad)localObject;
    if (localObject == null)
    {
      paramw = (Throwable)new IllegalStateException("This is should be simple type: ".concat(String.valueOf(paramw)).toString());
      AppMethodBeat.o(122659);
      throw paramw;
    }
    AppMethodBeat.o(122659);
    return localObject;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.l.at
 * JD-Core Version:    0.6.2
 */