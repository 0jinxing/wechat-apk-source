package a.i.b.a.c.l.a;

import a.f.b.j;
import a.i.b.a.c.l.az;
import com.tencent.matrix.trace.core.AppMethodBeat;

 enum s$a
{
  static
  {
    s.a.c localc = new s.a.c("START");
    BLe = localc;
    a locala = new a("ACCEPT_NULL");
    BLf = locala;
    d locald = new d("UNKNOWN");
    BLg = locald;
    s.a.b localb = new s.a.b("NOT_NULL");
  }

  protected static a g(az paramaz)
  {
    j.p(paramaz, "receiver$0");
    if (paramaz.eci())
      paramaz = BLf;
    while (true)
    {
      return paramaz;
      l locall = l.BKB;
      if (l.d(paramaz))
        paramaz = BLh;
      else
        paramaz = BLg;
    }
  }

  public abstract a f(az paramaz);

  public static final class a extends s.a
  {
    a()
    {
      super(1);
    }

    public final s.a f(az paramaz)
    {
      AppMethodBeat.i(122802);
      j.p(paramaz, "nextType");
      paramaz = g(paramaz);
      AppMethodBeat.o(122802);
      return paramaz;
    }
  }

  public static final class d extends s.a
  {
    d()
    {
      super(2);
    }

    public final s.a f(az paramaz)
    {
      AppMethodBeat.i(122805);
      j.p(paramaz, "nextType");
      paramaz = g(paramaz);
      if (paramaz == s.a.BLf)
      {
        paramaz = (s.a)this;
        AppMethodBeat.o(122805);
      }
      while (true)
      {
        return paramaz;
        AppMethodBeat.o(122805);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.l.a.s.a
 * JD-Core Version:    0.6.2
 */