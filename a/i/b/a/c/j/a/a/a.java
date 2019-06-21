package a.i.b.a.c.j.a.a;

import a.f.b.j;
import a.f.b.t;
import a.f.b.v;
import a.i.b.a.c.b.a.c;
import a.i.b.a.c.b.a.g;
import a.i.b.a.c.b.a.g.b;
import a.i.b.a.c.f.b;
import a.i.b.a.c.k.f;
import a.i.b.a.c.k.h;
import a.i.b.a.c.k.i;
import a.i.k;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Iterator;
import java.util.List;

public class a
  implements g
{
  private final f BHN;

  static
  {
    AppMethodBeat.i(122333);
    eQB = new k[] { (k)v.a(new t(v.aN(a.class), "annotations", "getAnnotations()Ljava/util/List;")) };
    AppMethodBeat.o(122333);
  }

  public a(i parami, a.f.a.a<? extends List<? extends c>> parama)
  {
    AppMethodBeat.i(122337);
    this.BHN = parami.i(parama);
    AppMethodBeat.o(122337);
  }

  private final List<c> ejT()
  {
    AppMethodBeat.i(122334);
    List localList = (List)h.a(this.BHN, eQB[0]);
    AppMethodBeat.o(122334);
    return localList;
  }

  public final c i(b paramb)
  {
    AppMethodBeat.i(122338);
    j.p(paramb, "fqName");
    paramb = g.b.a(this, paramb);
    AppMethodBeat.o(122338);
    return paramb;
  }

  public boolean isEmpty()
  {
    AppMethodBeat.i(122335);
    boolean bool = ejT().isEmpty();
    AppMethodBeat.o(122335);
    return bool;
  }

  public Iterator<c> iterator()
  {
    AppMethodBeat.i(122336);
    Iterator localIterator = ejT().iterator();
    AppMethodBeat.o(122336);
    return localIterator;
  }

  public final boolean j(b paramb)
  {
    AppMethodBeat.i(122339);
    j.p(paramb, "fqName");
    boolean bool = g.b.b(this, paramb);
    AppMethodBeat.o(122339);
    return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.j.a.a.a
 * JD-Core Version:    0.6.2
 */