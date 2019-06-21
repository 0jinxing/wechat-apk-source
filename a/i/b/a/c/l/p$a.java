package a.i.b.a.c.l;

import a.i.b.a.c.b.a.g;
import a.i.b.a.c.b.a.g.a;
import a.i.b.a.c.b.am;
import a.i.b.a.c.b.ay;
import a.i.b.a.c.b.c.a;
import a.i.b.a.c.b.e;
import a.i.b.a.c.b.w;
import a.i.b.a.c.k.b;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Collections;

final class p$a extends a.i.b.a.c.b.c.h
{
  public p$a(a.i.b.a.c.f.f paramf)
  {
    super(p.ekj(), paramf, w.BeD, a.i.b.a.c.b.f.Ber, Collections.emptyList(), am.BeR, b.BIH);
    AppMethodBeat.i(122543);
    paramf = g.BfJ;
    a.i.b.a.c.b.c.f localf = a.i.b.a.c.b.c.f.a(this, g.a.eai(), am.BeR);
    localf.a(Collections.emptyList(), ay.BeZ);
    paramf = p.awm(this.BgZ.name);
    localf.BhN = new o(p.b("<ERROR>", this), paramf, (byte)0);
    a(paramf, Collections.singleton(localf), localf);
    AppMethodBeat.o(122543);
  }

  public final a.i.b.a.c.i.e.h a(as paramas)
  {
    AppMethodBeat.i(122544);
    paramas = p.awm("Error scope for class " + this.BgZ + " with arguments: " + paramas);
    AppMethodBeat.o(122544);
    return paramas;
  }

  public final e g(au paramau)
  {
    return this;
  }

  public final String toString()
  {
    return this.BgZ.name;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.l.p.a
 * JD-Core Version:    0.6.2
 */