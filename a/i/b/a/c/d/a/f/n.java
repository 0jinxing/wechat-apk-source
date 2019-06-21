package a.i.b.a.c.d.a.f;

import a.a.aj;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Set;

public final class n
{
  static final d a(g paramg, e parame, boolean paramBoolean1, boolean paramBoolean2)
  {
    AppMethodBeat.i(120187);
    if ((!paramBoolean2) || (paramg != g.BpM))
    {
      paramg = new d(paramg, parame, false, paramBoolean1);
      AppMethodBeat.o(120187);
    }
    while (true)
    {
      return paramg;
      paramg = new d(paramg, parame, true, paramBoolean1);
      AppMethodBeat.o(120187);
    }
  }

  static final g a(Set<? extends g> paramSet, g paramg, boolean paramBoolean)
  {
    AppMethodBeat.i(120189);
    if (paramg == g.BpN)
    {
      paramSet = g.BpN;
      AppMethodBeat.o(120189);
    }
    while (true)
    {
      return paramSet;
      paramSet = (g)a(paramSet, g.BpM, g.BpL, paramg, paramBoolean);
      AppMethodBeat.o(120189);
    }
  }

  static final <T> T a(Set<? extends T> paramSet, T paramT1, T paramT2, T paramT3, boolean paramBoolean)
  {
    Object localObject = null;
    AppMethodBeat.i(120188);
    if (paramBoolean)
    {
      if (paramSet.contains(paramT1))
        paramSet = paramT1;
      while ((a.f.b.j.j(paramSet, paramT1)) && (a.f.b.j.j(paramT3, paramT2)))
      {
        AppMethodBeat.o(120188);
        paramSet = localObject;
        return paramSet;
        if (paramSet.contains(paramT2))
          paramSet = paramT2;
        else
          paramSet = null;
      }
      if (paramT3 != null)
        break label123;
    }
    while (true)
    {
      AppMethodBeat.o(120188);
      break;
      if (paramT3 != null)
      {
        paramT2 = a.a.j.o((Iterable)aj.b(paramSet, paramT3));
        paramT1 = paramT2;
        if (paramT2 != null);
      }
      else
      {
        paramT1 = paramSet;
      }
      paramSet = a.a.j.i((Iterable)paramT1);
      AppMethodBeat.o(120188);
      break;
      label123: paramSet = paramT3;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.d.a.f.n
 * JD-Core Version:    0.6.2
 */