package a.i.b.a.c.i.e;

import a.i.b.a.c.b.b;
import a.i.b.a.c.i.h;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;

public final class e$b extends h
{
  e$b(ArrayList paramArrayList)
  {
  }

  public final void a(b paramb1, b paramb2)
  {
    AppMethodBeat.i(122186);
    a.f.b.j.p(paramb1, "fromSuper");
    a.f.b.j.p(paramb2, "fromCurrent");
    paramb1 = (Throwable)new IllegalStateException(("Conflict in scope of " + this.BGa.BFZ + ": " + paramb1 + " vs " + paramb2).toString());
    AppMethodBeat.o(122186);
    throw paramb1;
  }

  public final void g(b paramb)
  {
    AppMethodBeat.i(122185);
    a.f.b.j.p(paramb, "fakeOverride");
    a.i.b.a.c.i.j.a(paramb, null);
    this.BcP.add(paramb);
    AppMethodBeat.o(122185);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.i.e.e.b
 * JD-Core Version:    0.6.2
 */