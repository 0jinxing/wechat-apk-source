package a.i.b.a.c.b.a;

import a.f.b.j;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.List;

public final class g$a
{
  private static final g BfK;

  static
  {
    AppMethodBeat.i(119333);
    BfL = new a();
    BfK = (g)new g.a.a();
    AppMethodBeat.o(119333);
  }

  public static g eai()
  {
    return BfK;
  }

  public static g fS(List<? extends c> paramList)
  {
    AppMethodBeat.i(119332);
    j.p(paramList, "annotations");
    if (paramList.isEmpty())
    {
      paramList = BfK;
      AppMethodBeat.o(119332);
    }
    while (true)
    {
      return paramList;
      paramList = (g)new h(paramList);
      AppMethodBeat.o(119332);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.b.a.g.a
 * JD-Core Version:    0.6.2
 */