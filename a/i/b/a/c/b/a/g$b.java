package a.i.b.a.c.b.a;

import a.f.b.j;
import a.i.b.a.c.f.b;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Iterator;

public final class g$b
{
  public static c a(g paramg, b paramb)
  {
    AppMethodBeat.i(119334);
    j.p(paramb, "fqName");
    Iterator localIterator = ((Iterable)paramg).iterator();
    do
    {
      if (!localIterator.hasNext())
        break;
      paramg = localIterator.next();
    }
    while (!j.j(((c)paramg).dZF(), paramb));
    while (true)
    {
      paramg = (c)paramg;
      AppMethodBeat.o(119334);
      return paramg;
      paramg = null;
    }
  }

  public static boolean b(g paramg, b paramb)
  {
    AppMethodBeat.i(119335);
    j.p(paramb, "fqName");
    boolean bool;
    if (paramg.i(paramb) != null)
    {
      bool = true;
      AppMethodBeat.o(119335);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(119335);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.b.a.g.b
 * JD-Core Version:    0.6.2
 */