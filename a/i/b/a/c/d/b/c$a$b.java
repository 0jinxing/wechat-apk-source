package a.i.b.a.c.d.b;

import a.i.b.a.c.b.au;
import a.i.b.a.c.i.b.g;
import a.i.b.a.c.i.b.i;
import a.i.b.a.c.i.b.j.a;
import a.i.b.a.c.l.w;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class c$a$b
  implements n.b
{
  private final ArrayList<a.i.b.a.c.i.b.f<?>> Brk;

  c$a$b(a.i.b.a.c.f.f paramf)
  {
    AppMethodBeat.i(120235);
    this.Brk = new ArrayList();
    AppMethodBeat.o(120235);
  }

  public final void a(n.d paramd)
  {
    AppMethodBeat.i(120233);
    a.f.b.j.p(paramd, "classLiteralId");
    ArrayList localArrayList = this.Brk;
    Object localObject = c.a(this.Bri.Bre, paramd);
    if (localObject != null);
    for (paramd = (a.i.b.a.c.i.b.f)localObject; ; paramd = (a.i.b.a.c.i.b.f)j.a.awi("Error array element value of annotation argument: " + this.Beg + ": class " + paramd.BcB.ehE() + " not found"))
    {
      localArrayList.add(paramd);
      AppMethodBeat.o(120233);
      return;
      localObject = a.i.b.a.c.i.b.j.BET;
    }
  }

  public final void a(a.i.b.a.c.f.a parama, a.i.b.a.c.f.f paramf)
  {
    AppMethodBeat.i(120232);
    a.f.b.j.p(parama, "enumClassId");
    a.f.b.j.p(paramf, "enumEntryName");
    this.Brk.add(new i(parama, paramf));
    AppMethodBeat.o(120232);
  }

  public final void dG(Object paramObject)
  {
    AppMethodBeat.i(120231);
    this.Brk.add(c.a.b(this.Beg, paramObject));
    AppMethodBeat.o(120231);
  }

  public final void zn()
  {
    AppMethodBeat.i(120234);
    Object localObject1 = a.i.b.a.c.d.a.a.a.b(this.Beg, this.Bri.Brf);
    if (localObject1 != null)
    {
      Map localMap = (Map)this.Bri.Brd;
      a.i.b.a.c.f.f localf = this.Beg;
      Object localObject2 = g.BEO;
      localObject2 = a.i.b.a.c.n.a.at(this.Brk);
      localObject1 = ((au)localObject1).dZS();
      a.f.b.j.o(localObject1, "parameter.type");
      localMap.put(localf, g.a((List)localObject2, (w)localObject1));
    }
    AppMethodBeat.o(120234);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.d.b.c.a.b
 * JD-Core Version:    0.6.2
 */