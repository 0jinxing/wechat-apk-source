package a.i.b.a.c.l;

import a.f.b.j;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class am
{
  public static final boolean aq(w paramw)
  {
    AppMethodBeat.i(122645);
    j.p(paramw, "receiver$0");
    az localaz = paramw.ekn();
    paramw = localaz;
    if (!(localaz instanceof f))
      paramw = null;
    paramw = (f)paramw;
    boolean bool;
    if (paramw != null)
    {
      bool = paramw.ech();
      AppMethodBeat.o(122645);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(122645);
    }
  }

  public static final f ar(w paramw)
  {
    Object localObject = null;
    AppMethodBeat.i(122646);
    j.p(paramw, "receiver$0");
    az localaz = paramw.ekn();
    paramw = localaz;
    if (!(localaz instanceof f))
      paramw = null;
    paramw = (f)paramw;
    if (paramw != null)
      if (paramw.ech())
        AppMethodBeat.o(122646);
    while (true)
    {
      return paramw;
      AppMethodBeat.o(122646);
      paramw = localObject;
      continue;
      AppMethodBeat.o(122646);
      paramw = localObject;
    }
  }

  public static final w as(w paramw)
  {
    AppMethodBeat.i(122647);
    j.p(paramw, "receiver$0");
    Object localObject1 = paramw.ekn();
    Object localObject2 = localObject1;
    if (!(localObject1 instanceof ak))
      localObject2 = null;
    localObject1 = (ak)localObject2;
    localObject2 = paramw;
    if (localObject1 != null)
    {
      localObject2 = ((ak)localObject1).eju();
      if (localObject2 != null)
        break label58;
      localObject2 = paramw;
    }
    label58: 
    while (true)
    {
      AppMethodBeat.o(122647);
      return localObject2;
    }
  }

  public static final w at(w paramw)
  {
    AppMethodBeat.i(122648);
    j.p(paramw, "receiver$0");
    Object localObject1 = paramw.ekn();
    Object localObject2 = localObject1;
    if (!(localObject1 instanceof ak))
      localObject2 = null;
    localObject1 = (ak)localObject2;
    localObject2 = paramw;
    if (localObject1 != null)
    {
      localObject2 = ((ak)localObject1).ejv();
      if (localObject2 != null)
        break label58;
      localObject2 = paramw;
    }
    label58: 
    while (true)
    {
      AppMethodBeat.o(122648);
      return localObject2;
    }
  }

  public static final boolean b(w paramw1, w paramw2)
  {
    AppMethodBeat.i(122649);
    j.p(paramw1, "first");
    j.p(paramw2, "second");
    az localaz = paramw1.ekn();
    Object localObject = localaz;
    if (!(localaz instanceof ak))
      localObject = null;
    localObject = (ak)localObject;
    boolean bool;
    if (localObject != null)
    {
      bool = ((ak)localObject).ad(paramw2);
      if (!bool)
      {
        localObject = paramw2.ekn();
        paramw2 = (w)localObject;
        if (!(localObject instanceof ak))
          paramw2 = null;
        paramw2 = (ak)paramw2;
        if (paramw2 == null)
          break label112;
        bool = paramw2.ad(paramw1);
        label90: if (!bool)
          break label118;
      }
      bool = true;
      AppMethodBeat.o(122649);
    }
    while (true)
    {
      return bool;
      bool = false;
      break;
      label112: bool = false;
      break label90;
      label118: AppMethodBeat.o(122649);
      bool = false;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.l.am
 * JD-Core Version:    0.6.2
 */