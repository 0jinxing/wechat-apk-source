package a.i.b.a.c.m;

import a.f.b.j;
import a.i.b.a.c.b.t;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.List;

public final class l$b extends l
{
  private final int n = 2;

  public l$b()
  {
    super("must have exactly 2 value parameters", (byte)0);
  }

  public final boolean h(t paramt)
  {
    AppMethodBeat.i(122901);
    j.p(paramt, "functionDescriptor");
    boolean bool;
    if (paramt.dYV().size() == this.n)
    {
      bool = true;
      AppMethodBeat.o(122901);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(122901);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.m.l.b
 * JD-Core Version:    0.6.2
 */