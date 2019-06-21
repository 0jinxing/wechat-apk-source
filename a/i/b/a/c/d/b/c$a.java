package a.i.b.a.c.d.b;

import a.i.b.a.c.b.a.d;
import a.i.b.a.c.b.am;
import a.i.b.a.c.b.e;
import a.i.b.a.c.f.a;
import a.i.b.a.c.i.b.g;
import a.i.b.a.c.i.b.i;
import a.i.b.a.c.i.b.j.a;
import a.i.b.a.c.l.w;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class c$a
  implements n.a
{
  final HashMap<a.i.b.a.c.f.f, a.i.b.a.c.i.b.f<?>> Brd;

  c$a(e parame, List paramList, am paramam)
  {
    AppMethodBeat.i(120243);
    this.Brd = new HashMap();
    AppMethodBeat.o(120243);
  }

  static a.i.b.a.c.i.b.f<?> b(a.i.b.a.c.f.f paramf, Object paramObject)
  {
    AppMethodBeat.i(120242);
    a.i.b.a.c.i.b.f localf = g.BEO.dQ(paramObject);
    paramObject = localf;
    if (localf == null)
    {
      paramObject = a.i.b.a.c.i.b.j.BET;
      paramObject = (a.i.b.a.c.i.b.f)j.a.awi("Unsupported annotation argument: ".concat(String.valueOf(paramf)));
    }
    AppMethodBeat.o(120242);
    return paramObject;
  }

  public final n.a a(a.i.b.a.c.f.f paramf, a parama)
  {
    AppMethodBeat.i(120240);
    a.f.b.j.p(paramf, "name");
    a.f.b.j.p(parama, "classId");
    ArrayList localArrayList = new ArrayList();
    c localc = this.Bre;
    am localam = am.BeR;
    a.f.b.j.o(localam, "SourceElement.NO_SOURCE");
    paramf = (n.a)new c.a.a(this, localc.a(parama, localam, (List)localArrayList), paramf, localArrayList);
    AppMethodBeat.o(120240);
    return paramf;
  }

  public final void a(a.i.b.a.c.f.f paramf, n.d paramd)
  {
    AppMethodBeat.i(120237);
    a.f.b.j.p(paramf, "name");
    a.f.b.j.p(paramd, "classLiteralId");
    Map localMap = (Map)this.Brd;
    Object localObject = c.a(this.Bre, paramd);
    if (localObject != null);
    for (paramd = (a.i.b.a.c.i.b.f)localObject; ; paramd = (a.i.b.a.c.i.b.f)j.a.awi("Error value of annotation argument: " + paramf + ": class " + paramd.BcB.ehE() + " not found"))
    {
      localMap.put(paramf, paramd);
      AppMethodBeat.o(120237);
      return;
      localObject = a.i.b.a.c.i.b.j.BET;
    }
  }

  public final void a(a.i.b.a.c.f.f paramf1, a parama, a.i.b.a.c.f.f paramf2)
  {
    AppMethodBeat.i(120238);
    a.f.b.j.p(paramf1, "name");
    a.f.b.j.p(parama, "enumClassId");
    a.f.b.j.p(paramf2, "enumEntryName");
    ((Map)this.Brd).put(paramf1, new i(parama, paramf2));
    AppMethodBeat.o(120238);
  }

  public final void a(a.i.b.a.c.f.f paramf, Object paramObject)
  {
    AppMethodBeat.i(120236);
    if (paramf != null)
      ((Map)this.Brd).put(paramf, b(paramf, paramObject));
    AppMethodBeat.o(120236);
  }

  public final n.b o(a.i.b.a.c.f.f paramf)
  {
    AppMethodBeat.i(120239);
    a.f.b.j.p(paramf, "name");
    paramf = (n.b)new c.a.b(this, paramf);
    AppMethodBeat.o(120239);
    return paramf;
  }

  public final void zn()
  {
    AppMethodBeat.i(120241);
    this.rYn.add(new d((w)this.Brf.dZf(), (Map)this.Brd, this.Brg));
    AppMethodBeat.o(120241);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.d.b.c.a
 * JD-Core Version:    0.6.2
 */