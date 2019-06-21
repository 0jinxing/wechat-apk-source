package a.i.b.a.c.d.a.c;

import a.d;
import a.f;
import a.i.b.a.c.b.ac;
import a.i.b.a.c.d.a.e.t;
import a.i.b.a.c.k.i;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.List;

public final class g
  implements ac
{
  final h Bnn;
  private final a.i.b.a.c.k.a<a.i.b.a.c.f.b, a.i.b.a.c.d.a.c.a.h> Bnq;

  public g(b paramb)
  {
    AppMethodBeat.i(119839);
    this.Bnn = new h(paramb, (m)m.a.BnF, (f)new d(null));
    this.Bnq = this.Bnn.Bnv.Baf.eke();
    AppMethodBeat.o(119839);
  }

  private final a.i.b.a.c.d.a.c.a.h l(a.i.b.a.c.f.b paramb)
  {
    AppMethodBeat.i(119836);
    t localt = this.Bnn.Bnv.BmR.a(paramb);
    a.f.b.j.o(localt, "c.components.finder.find…ge(fqName) ?: return null");
    paramb = (a.i.b.a.c.d.a.c.a.h)this.Bnq.b(paramb, (a.f.a.a)new g.a(this, localt));
    AppMethodBeat.o(119836);
    return paramb;
  }

  public final List<a.i.b.a.c.d.a.c.a.h> h(a.i.b.a.c.f.b paramb)
  {
    AppMethodBeat.i(119837);
    a.f.b.j.p(paramb, "fqName");
    paramb = a.a.j.dm(l(paramb));
    AppMethodBeat.o(119837);
    return paramb;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.d.a.c.g
 * JD-Core Version:    0.6.2
 */