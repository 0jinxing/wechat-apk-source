package a.i.b.a.c.n;

import com.tencent.matrix.trace.core.AppMethodBeat;

public enum g
{
  public static final a BNn;
  final String description;

  static
  {
    AppMethodBeat.i(122944);
    g localg1 = new g("IGNORE", 0, "ignore");
    BNj = localg1;
    g localg2 = new g("WARN", 1, "warn");
    BNk = localg2;
    g localg3 = new g("STRICT", 2, "strict");
    BNl = localg3;
    BNm = new g[] { localg1, localg2, localg3 };
    BNn = new a((byte)0);
    AppMethodBeat.o(122944);
  }

  private g(String paramString)
  {
    AppMethodBeat.i(122945);
    this.description = paramString;
    AppMethodBeat.o(122945);
  }

  public final boolean eky()
  {
    if ((g)this == BNk);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final boolean ekz()
  {
    if ((g)this == BNj);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public static final class a
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.n.g
 * JD-Core Version:    0.6.2
 */