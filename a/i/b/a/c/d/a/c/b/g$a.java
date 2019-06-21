package a.i.b.a.c.d.a.c.b;

import a.f.b.j;
import a.f.b.k;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class g$a extends k
  implements a.f.a.m<String, String, Boolean>
{
  public static final a Bpr;

  static
  {
    AppMethodBeat.i(120065);
    Bpr = new a();
    AppMethodBeat.o(120065);
  }

  g$a()
  {
    super(2);
  }

  public static boolean iR(String paramString1, String paramString2)
  {
    AppMethodBeat.i(120064);
    j.p(paramString1, "first");
    j.p(paramString2, "second");
    boolean bool;
    if ((j.j(paramString1, a.k.m.b(paramString2, (CharSequence)"out "))) || (j.j(paramString2, "*")))
    {
      bool = true;
      AppMethodBeat.o(120064);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(120064);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.d.a.c.b.g.a
 * JD-Core Version:    0.6.2
 */