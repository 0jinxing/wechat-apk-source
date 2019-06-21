package a.i.b.a.c.i;

import a.i.b.a.c.b.ah;
import a.i.b.a.c.b.au;
import a.i.b.a.c.b.d;
import a.i.b.a.c.b.e;
import a.i.b.a.c.b.l;
import a.i.b.a.c.c.a.a;
import a.i.b.a.c.c.a.c;
import a.i.b.a.c.l.an;
import a.i.b.a.c.l.w;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class f
{
  private static boolean D(l paraml)
  {
    AppMethodBeat.i(121982);
    a.f.b.j.p(paraml, "receiver$0");
    boolean bool;
    if (((paraml instanceof e)) && (((e)paraml).dYj()))
    {
      bool = true;
      AppMethodBeat.o(121982);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(121982);
    }
  }

  private static au aa(w paramw)
  {
    Object localObject = null;
    AppMethodBeat.i(121983);
    a.f.b.j.p(paramw, "receiver$0");
    a.i.b.a.c.b.h localh = paramw.ejw().dYs();
    paramw = localh;
    if (!(localh instanceof e))
      paramw = null;
    paramw = (e)paramw;
    if (paramw != null)
    {
      a.f.b.j.p(paramw, "receiver$0");
      if (!paramw.dYj())
      {
        AppMethodBeat.o(121983);
        paramw = localObject;
      }
    }
    while (true)
    {
      return paramw;
      paramw = paramw.dYe();
      if (paramw != null)
      {
        paramw = paramw.dYV();
        if (paramw != null)
        {
          paramw = (au)a.a.j.fO(paramw);
          AppMethodBeat.o(121983);
        }
      }
      else
      {
        AppMethodBeat.o(121983);
        paramw = localObject;
        continue;
        AppMethodBeat.o(121983);
        paramw = localObject;
      }
    }
  }

  public static final boolean ab(w paramw)
  {
    AppMethodBeat.i(121984);
    a.f.b.j.p(paramw, "receiver$0");
    paramw = paramw.ejw().dYs();
    boolean bool;
    if (paramw != null)
    {
      bool = D((l)paramw);
      AppMethodBeat.o(121984);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(121984);
    }
  }

  public static final w ac(w paramw)
  {
    AppMethodBeat.i(121985);
    a.f.b.j.p(paramw, "receiver$0");
    Object localObject = aa(paramw);
    if (localObject == null)
    {
      AppMethodBeat.o(121985);
      paramw = null;
    }
    while (true)
    {
      return paramw;
      paramw = paramw.dXR();
      localObject = ((au)localObject).dZg();
      a.f.b.j.o(localObject, "parameter.name");
      paramw = (ah)a.a.j.i((Iterable)paramw.a((a.i.b.a.c.f.f)localObject, (a)c.BjQ));
      if (paramw != null)
      {
        paramw = paramw.dZS();
        AppMethodBeat.o(121985);
      }
      else
      {
        AppMethodBeat.o(121985);
        paramw = null;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.i.f
 * JD-Core Version:    0.6.2
 */