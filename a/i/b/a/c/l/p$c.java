package a.i.b.a.c.l;

import a.f.a.b;
import a.i.b.a.c.b.l;
import a.i.b.a.c.c.a.a;
import a.i.b.a.c.f.f;
import a.i.b.a.c.i.e.d;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Collection;
import java.util.Set;

final class p$c
  implements a.i.b.a.c.i.e.h
{
  private final String BEz;

  private p$c(String paramString)
  {
    this.BEz = paramString;
  }

  public final Collection a(f paramf, a parama)
  {
    AppMethodBeat.i(122553);
    paramf = new IllegalStateException(this.BEz + ", required name: " + paramf);
    AppMethodBeat.o(122553);
    throw paramf;
  }

  public final Collection<l> a(d paramd, b<? super f, Boolean> paramb)
  {
    AppMethodBeat.i(122555);
    paramd = new IllegalStateException(this.BEz);
    AppMethodBeat.o(122555);
    throw paramd;
  }

  public final Collection b(f paramf, a parama)
  {
    AppMethodBeat.i(122554);
    paramf = new IllegalStateException(this.BEz + ", required name: " + paramf);
    AppMethodBeat.o(122554);
    throw paramf;
  }

  public final a.i.b.a.c.b.h c(f paramf, a parama)
  {
    AppMethodBeat.i(122552);
    paramf = new IllegalStateException(this.BEz + ", required name: " + paramf);
    AppMethodBeat.o(122552);
    throw paramf;
  }

  public final Set<f> eau()
  {
    AppMethodBeat.i(122556);
    IllegalStateException localIllegalStateException = new IllegalStateException();
    AppMethodBeat.o(122556);
    throw localIllegalStateException;
  }

  public final Set<f> eav()
  {
    AppMethodBeat.i(122557);
    IllegalStateException localIllegalStateException = new IllegalStateException();
    AppMethodBeat.o(122557);
    throw localIllegalStateException;
  }

  public final String toString()
  {
    AppMethodBeat.i(122558);
    String str = "ThrowingScope{" + this.BEz + '}';
    AppMethodBeat.o(122558);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.l.p.c
 * JD-Core Version:    0.6.2
 */