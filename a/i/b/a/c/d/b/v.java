package a.i.b.a.c.d.b;

import a.i.b.a.c.b.e;
import a.i.b.a.c.l.w;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Collection;

public final class v
  implements u<j>
{
  public static final v BrL;

  static
  {
    AppMethodBeat.i(120325);
    BrL = new v();
    AppMethodBeat.o(120325);
  }

  public final void a(w paramw, e parame)
  {
    AppMethodBeat.i(120324);
    a.f.b.j.p(paramw, "kotlinType");
    a.f.b.j.p(parame, "descriptor");
    AppMethodBeat.o(120324);
  }

  public final w m(Collection<? extends w> paramCollection)
  {
    AppMethodBeat.i(120321);
    a.f.b.j.p(paramCollection, "types");
    paramCollection = (Throwable)new AssertionError("There should be no intersection type in existing descriptors, but found: " + a.a.j.a((Iterable)paramCollection, null, null, null, 0, null, null, 63));
    AppMethodBeat.o(120321);
    throw paramCollection;
  }

  public final String u(e parame)
  {
    AppMethodBeat.i(120323);
    a.f.b.j.p(parame, "classDescriptor");
    AppMethodBeat.o(120323);
    return null;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.d.b.v
 * JD-Core Version:    0.6.2
 */