package a.i.b.a.c.b.b;

import a.a.v;
import a.f.b.j;
import a.i.b.a.c.b.al;
import a.i.b.a.c.b.d;
import a.i.b.a.c.b.e;
import a.i.b.a.c.f.f;
import a.i.b.a.c.l.w;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Collection;

public abstract interface a
{
  public abstract Collection<al> a(f paramf, e parame);

  public abstract Collection<w> l(e parame);

  public abstract Collection<f> m(e parame);

  public abstract Collection<d> o(e parame);

  public static final class a
    implements a
  {
    public static final a BgV;

    static
    {
      AppMethodBeat.i(119374);
      BgV = new a();
      AppMethodBeat.o(119374);
    }

    public final Collection<al> a(f paramf, e parame)
    {
      AppMethodBeat.i(119371);
      j.p(paramf, "name");
      j.p(parame, "classDescriptor");
      paramf = (Collection)v.AUP;
      AppMethodBeat.o(119371);
      return paramf;
    }

    public final Collection<w> l(e parame)
    {
      AppMethodBeat.i(119370);
      j.p(parame, "classDescriptor");
      parame = (Collection)v.AUP;
      AppMethodBeat.o(119370);
      return parame;
    }

    public final Collection<f> m(e parame)
    {
      AppMethodBeat.i(119372);
      j.p(parame, "classDescriptor");
      parame = (Collection)v.AUP;
      AppMethodBeat.o(119372);
      return parame;
    }

    public final Collection<d> o(e parame)
    {
      AppMethodBeat.i(119373);
      j.p(parame, "classDescriptor");
      parame = (Collection)v.AUP;
      AppMethodBeat.o(119373);
      return parame;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.b.b.a
 * JD-Core Version:    0.6.2
 */