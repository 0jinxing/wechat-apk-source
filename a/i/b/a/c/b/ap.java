package a.i.b.a.c.b;

import a.f.a.b;
import a.f.b.j;
import a.i.b.a.c.l.an;
import a.i.b.a.c.l.w;
import a.y;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Collection;

public abstract interface ap
{
  public abstract Collection<w> a(an paraman, Collection<? extends w> paramCollection, b<? super an, ? extends Iterable<? extends w>> paramb, b<? super w, y> paramb1);

  public static final class a
    implements ap
  {
    public static final a BeT;

    static
    {
      AppMethodBeat.i(119294);
      BeT = new a();
      AppMethodBeat.o(119294);
    }

    public final Collection<w> a(an paraman, Collection<? extends w> paramCollection, b<? super an, ? extends Iterable<? extends w>> paramb, b<? super w, y> paramb1)
    {
      AppMethodBeat.i(119293);
      j.p(paraman, "currentTypeConstructor");
      j.p(paramCollection, "superTypes");
      j.p(paramb, "neighbors");
      j.p(paramb1, "reportLoop");
      AppMethodBeat.o(119293);
      return paramCollection;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.b.ap
 * JD-Core Version:    0.6.2
 */