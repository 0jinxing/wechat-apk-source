package a.i.b.a.c.m;

import a.f.b.j;
import a.i.b.a.c.b.t;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.List;

public final class l$d extends l
{
  public static final d BMH;

  static
  {
    AppMethodBeat.i(122905);
    BMH = new d();
    AppMethodBeat.o(122905);
  }

  private l$d()
  {
    super("must have a single value parameter", (byte)0);
  }

  public final boolean h(t paramt)
  {
    boolean bool = true;
    AppMethodBeat.i(122904);
    j.p(paramt, "functionDescriptor");
    if (paramt.dYV().size() == 1)
      AppMethodBeat.o(122904);
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(122904);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.m.l.d
 * JD-Core Version:    0.6.2
 */