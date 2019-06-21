package a.i.b.a.c.g;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class g
{
  private static final g BzB;
  private static volatile boolean Bzz;
  final Map<g.a, i.f<?, ?>> BzA;

  static
  {
    AppMethodBeat.i(121496);
    Bzz = false;
    BzB = new g((byte)0);
    AppMethodBeat.o(121496);
  }

  g()
  {
    AppMethodBeat.i(121494);
    this.BzA = new HashMap();
    AppMethodBeat.o(121494);
  }

  private g(byte paramByte)
  {
    AppMethodBeat.i(121495);
    this.BzA = Collections.emptyMap();
    AppMethodBeat.o(121495);
  }

  public static g eie()
  {
    AppMethodBeat.i(121492);
    g localg = new g();
    AppMethodBeat.o(121492);
    return localg;
  }

  public static g eif()
  {
    return BzB;
  }

  public final void a(i.f<?, ?> paramf)
  {
    AppMethodBeat.i(121493);
    this.BzA.put(new g.a(paramf.BzS, paramf.BzU.number), paramf);
    AppMethodBeat.o(121493);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.g.g
 * JD-Core Version:    0.6.2
 */