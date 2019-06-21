package a.i.b.a.c.d.b;

import a.i.b.a.c.b.a.c;
import a.i.b.a.c.f.f;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class c$a$a
  implements n.a
{
  c$a$a(n.a parama, f paramf, ArrayList paramArrayList)
  {
    this.Brh = paramf;
  }

  public final n.a a(f paramf, a.i.b.a.c.f.a parama)
  {
    AppMethodBeat.i(120227);
    a.f.b.j.p(paramf, "name");
    a.f.b.j.p(parama, "classId");
    paramf = this.Brh.a(paramf, parama);
    AppMethodBeat.o(120227);
    return paramf;
  }

  public final void a(f paramf, n.d paramd)
  {
    AppMethodBeat.i(120229);
    a.f.b.j.p(paramf, "name");
    a.f.b.j.p(paramd, "classLiteralId");
    this.Brh.a(paramf, paramd);
    AppMethodBeat.o(120229);
  }

  public final void a(f paramf1, a.i.b.a.c.f.a parama, f paramf2)
  {
    AppMethodBeat.i(120230);
    a.f.b.j.p(paramf1, "name");
    a.f.b.j.p(parama, "enumClassId");
    a.f.b.j.p(paramf2, "enumEntryName");
    this.Brh.a(paramf1, parama, paramf2);
    AppMethodBeat.o(120230);
  }

  public final void a(f paramf, Object paramObject)
  {
    AppMethodBeat.i(120226);
    this.Brh.a(paramf, paramObject);
    AppMethodBeat.o(120226);
  }

  public final n.b o(f paramf)
  {
    AppMethodBeat.i(120228);
    a.f.b.j.p(paramf, "name");
    paramf = this.Brh.o(paramf);
    AppMethodBeat.o(120228);
    return paramf;
  }

  public final void zn()
  {
    AppMethodBeat.i(120225);
    this.Brj.zn();
    ((Map)this.Bri.Brd).put(this.Beg, new a.i.b.a.c.i.b.a((c)a.a.j.fN((List)this.Bqx)));
    AppMethodBeat.o(120225);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.d.b.c.a.a
 * JD-Core Version:    0.6.2
 */