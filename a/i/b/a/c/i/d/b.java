package a.i.b.a.c.i.d;

import a.i.b.a.c.f.a;
import a.i.b.a.c.f.c;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class b
{
  private a.i.b.a.c.f.b BfP;
  public final String BrD;

  private b(String paramString)
  {
    this.BrD = paramString;
  }

  public static b awj(String paramString)
  {
    AppMethodBeat.i(122156);
    paramString = new b(paramString);
    AppMethodBeat.o(122156);
    return paramString;
  }

  public static b h(a parama)
  {
    AppMethodBeat.i(122157);
    a.i.b.a.c.f.b localb = parama.BcW;
    parama = parama.ByN.ByQ.ByV.replace('.', '$');
    if (localb.ehF())
    {
      parama = new b(parama);
      AppMethodBeat.o(122157);
    }
    while (true)
    {
      return parama;
      parama = new b(localb.ByQ.ByV.replace('.', '/') + "/" + parama);
      AppMethodBeat.o(122157);
    }
  }

  public static b o(a.i.b.a.c.f.b paramb)
  {
    AppMethodBeat.i(122158);
    b localb = new b(paramb.ByQ.ByV.replace('.', '/'));
    localb.BfP = paramb;
    AppMethodBeat.o(122158);
    return localb;
  }

  public final a.i.b.a.c.f.b ejz()
  {
    AppMethodBeat.i(122159);
    int i = this.BrD.lastIndexOf("/");
    a.i.b.a.c.f.b localb;
    if (i == -1)
    {
      localb = a.i.b.a.c.f.b.ByP;
      AppMethodBeat.o(122159);
    }
    while (true)
    {
      return localb;
      localb = new a.i.b.a.c.f.b(this.BrD.substring(0, i).replace('/', '.'));
      AppMethodBeat.o(122159);
    }
  }

  public final boolean equals(Object paramObject)
  {
    AppMethodBeat.i(122160);
    boolean bool;
    if (this == paramObject)
    {
      bool = true;
      AppMethodBeat.o(122160);
    }
    while (true)
    {
      return bool;
      if ((paramObject == null) || (getClass() != paramObject.getClass()))
      {
        bool = false;
        AppMethodBeat.o(122160);
      }
      else
      {
        bool = this.BrD.equals(((b)paramObject).BrD);
        AppMethodBeat.o(122160);
      }
    }
  }

  public final int hashCode()
  {
    AppMethodBeat.i(122161);
    int i = this.BrD.hashCode();
    AppMethodBeat.o(122161);
    return i;
  }

  public final String toString()
  {
    return this.BrD;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.i.d.b
 * JD-Core Version:    0.6.2
 */