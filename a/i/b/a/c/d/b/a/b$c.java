package a.i.b.a.c.d.b.a;

import a.i.b.a.c.d.b.n.a;
import a.i.b.a.c.d.b.n.b;
import a.i.b.a.c.d.b.n.d;
import a.i.b.a.c.e.b.a.d;
import a.i.b.a.c.f.a;
import a.i.b.a.c.f.f;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class b$c
  implements n.a
{
  private b$c(b paramb)
  {
  }

  public final n.a a(f paramf, a parama)
  {
    return null;
  }

  public final void a(f paramf, n.d paramd)
  {
  }

  public final void a(f paramf1, a parama, f paramf2)
  {
  }

  public final void a(f paramf, Object paramObject)
  {
    AppMethodBeat.i(120349);
    if (paramf == null)
      AppMethodBeat.o(120349);
    while (true)
    {
      return;
      paramf = paramf.name;
      if (!"version".equals(paramf))
        break;
      if (!(paramObject instanceof int[]))
        break label117;
      b.a(this.Bsx, (int[])paramObject);
      if (b.a(this.Bsx) != null)
        break label117;
      b.a(this.Bsx, new d((int[])paramObject));
      AppMethodBeat.o(120349);
    }
    b localb;
    if ("multifileClassName".equals(paramf))
    {
      localb = this.Bsx;
      if (!(paramObject instanceof String))
        break label125;
    }
    label117: label125: for (paramf = (String)paramObject; ; paramf = null)
    {
      b.a(localb, paramf);
      AppMethodBeat.o(120349);
      break;
    }
  }

  public final n.b o(f paramf)
  {
    AppMethodBeat.i(120350);
    paramf = paramf.name;
    if (("data".equals(paramf)) || ("filePartClassNames".equals(paramf)))
    {
      paramf = new b.c.1(this);
      AppMethodBeat.o(120350);
    }
    while (true)
    {
      return paramf;
      if ("strings".equals(paramf))
      {
        paramf = new b.c.2(this);
        AppMethodBeat.o(120350);
      }
      else
      {
        paramf = null;
        AppMethodBeat.o(120350);
      }
    }
  }

  public final void zn()
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.d.b.a.b.c
 * JD-Core Version:    0.6.2
 */