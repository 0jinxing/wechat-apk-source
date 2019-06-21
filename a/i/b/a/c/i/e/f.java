package a.i.b.a.c.i.e;

import a.f.b.j;
import a.i.b.a.c.b.aq;
import a.i.b.a.c.b.e;
import a.i.b.a.c.c.a.a;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Set;

public final class f extends i
{
  private final h BGb;

  public f(h paramh)
  {
    AppMethodBeat.i(122192);
    this.BGb = paramh;
    AppMethodBeat.o(122192);
  }

  public final a.i.b.a.c.b.h c(a.i.b.a.c.f.f paramf, a parama)
  {
    AppMethodBeat.i(122187);
    j.p(paramf, "name");
    j.p(parama, "location");
    paramf = this.BGb.c(paramf, parama);
    if (paramf != null)
      if ((paramf instanceof e))
        break label101;
    label101: for (parama = null; ; parama = paramf)
    {
      parama = (e)parama;
      if (parama != null)
      {
        paramf = (a.i.b.a.c.b.h)parama;
        AppMethodBeat.o(122187);
        return paramf;
      }
      if (!(paramf instanceof aq))
        paramf = null;
      while (true)
      {
        paramf = (a.i.b.a.c.b.h)paramf;
        AppMethodBeat.o(122187);
        break;
        AppMethodBeat.o(122187);
        paramf = null;
        break;
      }
    }
  }

  public final Set<a.i.b.a.c.f.f> eau()
  {
    AppMethodBeat.i(122189);
    Set localSet = this.BGb.eau();
    AppMethodBeat.o(122189);
    return localSet;
  }

  public final Set<a.i.b.a.c.f.f> eav()
  {
    AppMethodBeat.i(122190);
    Set localSet = this.BGb.eav();
    AppMethodBeat.o(122190);
    return localSet;
  }

  public final String toString()
  {
    AppMethodBeat.i(122191);
    String str = "Classes from " + this.BGb;
    AppMethodBeat.o(122191);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.i.e.f
 * JD-Core Version:    0.6.2
 */