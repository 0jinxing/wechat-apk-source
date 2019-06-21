package a.i.b.a.c.d.b;

import a.f.b.j;
import a.i.b.a.c.b.am;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

public class a$d$b
  implements n.c
{
  private final ArrayList<A> Bra;
  final q Brb;

  public a$d$b(q paramq)
  {
    AppMethodBeat.i(120220);
    this.Brb = localObject;
    this.Bra = new ArrayList();
    AppMethodBeat.o(120220);
  }

  public final n.a a(a.i.b.a.c.f.a parama, am paramam)
  {
    AppMethodBeat.i(120218);
    j.p(parama, "classId");
    j.p(paramam, "source");
    parama = a.a(this.BqZ.BqW, parama, paramam, (List)this.Bra);
    AppMethodBeat.o(120218);
    return parama;
  }

  public final void zn()
  {
    AppMethodBeat.i(120219);
    if (!((Collection)this.Bra).isEmpty());
    for (int i = 1; ; i = 0)
    {
      if (i != 0)
        ((Map)this.BqZ.BqX).put(this.Brb, this.Bra);
      AppMethodBeat.o(120219);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.d.b.a.d.b
 * JD-Core Version:    0.6.2
 */