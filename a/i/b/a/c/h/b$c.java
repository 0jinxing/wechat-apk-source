package a.i.b.a.c.h;

import a.f.b.j;
import a.i.b.a.c.b.ab;
import a.i.b.a.c.b.ar;
import a.i.b.a.c.b.e;
import a.i.b.a.c.b.h;
import a.i.b.a.c.b.l;
import a.i.b.a.c.f.f;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class b$c
  implements b
{
  public static final c BBF;

  static
  {
    AppMethodBeat.i(121706);
    BBF = new c();
    AppMethodBeat.o(121706);
  }

  private final String a(h paramh)
  {
    AppMethodBeat.i(121704);
    Object localObject = paramh.dZg();
    j.o(localObject, "descriptor.name");
    localObject = q.y((f)localObject);
    if ((paramh instanceof ar))
    {
      AppMethodBeat.o(121704);
      paramh = (h)localObject;
    }
    while (true)
    {
      return paramh;
      paramh = paramh.dXW();
      j.o(paramh, "descriptor.containingDeclaration");
      paramh = j(paramh);
      if ((paramh != null) && ((j.j(paramh, "") ^ true)))
      {
        paramh = paramh + "." + (String)localObject;
        AppMethodBeat.o(121704);
      }
      else
      {
        AppMethodBeat.o(121704);
        paramh = (h)localObject;
      }
    }
  }

  private final String j(l paraml)
  {
    AppMethodBeat.i(121705);
    if ((paraml instanceof e))
    {
      paraml = a((h)paraml);
      AppMethodBeat.o(121705);
    }
    while (true)
    {
      return paraml;
      if ((paraml instanceof ab))
      {
        paraml = ((ab)paraml).dZF().ByQ;
        j.o(paraml, "descriptor.fqName.toUnsafe()");
        paraml = q.g(paraml);
        AppMethodBeat.o(121705);
      }
      else
      {
        paraml = null;
        AppMethodBeat.o(121705);
      }
    }
  }

  public final String a(h paramh, c paramc)
  {
    AppMethodBeat.i(121703);
    j.p(paramh, "classifier");
    j.p(paramc, "renderer");
    paramh = a(paramh);
    AppMethodBeat.o(121703);
    return paramh;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.h.b.c
 * JD-Core Version:    0.6.2
 */