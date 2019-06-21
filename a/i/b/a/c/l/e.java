package a.i.b.a.c.l;

import a.i.b.a.c.b.ap;
import a.i.b.a.c.b.ap.a;
import a.i.b.a.c.b.ar;
import a.i.b.a.c.f.c;
import a.i.b.a.c.i.d;
import a.i.b.a.c.k.i;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public final class e extends b
  implements an
{
  private final a.i.b.a.c.b.e BGx;
  private final Collection<w> BiV;
  private final List<ar> parameters;

  public e(a.i.b.a.c.b.e parame, List<? extends ar> paramList, Collection<w> paramCollection, i parami)
  {
    super(parami);
    AppMethodBeat.i(122497);
    this.BGx = parame;
    this.parameters = Collections.unmodifiableList(new ArrayList(paramList));
    this.BiV = Collections.unmodifiableCollection(paramCollection);
    AppMethodBeat.o(122497);
  }

  protected final Collection<w> dYr()
  {
    return this.BiV;
  }

  public final a.i.b.a.c.b.e dYt()
  {
    return this.BGx;
  }

  public final boolean dYu()
  {
    return true;
  }

  protected final ap dYv()
  {
    return ap.a.BeT;
  }

  public final List<ar> getParameters()
  {
    return this.parameters;
  }

  public final String toString()
  {
    AppMethodBeat.i(122498);
    String str = d.n(this.BGx).ByV;
    AppMethodBeat.o(122498);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.l.e
 * JD-Core Version:    0.6.2
 */