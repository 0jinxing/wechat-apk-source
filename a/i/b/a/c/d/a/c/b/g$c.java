package a.i.b.a.c.d.a.c.b;

import a.f.b.j;
import a.f.b.k;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class g$c extends k
  implements a.f.a.m<String, String, String>
{
  public static final c Bpt;

  static
  {
    AppMethodBeat.i(120070);
    Bpt = new c();
    AppMethodBeat.o(120070);
  }

  g$c()
  {
    super(2);
  }

  public static String iS(String paramString1, String paramString2)
  {
    AppMethodBeat.i(120069);
    j.p(paramString1, "receiver$0");
    j.p(paramString2, "newArgs");
    if (!a.k.m.b((CharSequence)paramString1, '<'))
      AppMethodBeat.o(120069);
    while (true)
    {
      return paramString1;
      paramString1 = a.k.m.jd(paramString1, paramString1) + '<' + paramString2 + '>' + a.k.m.a(paramString1, '>');
      AppMethodBeat.o(120069);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.d.a.c.b.g.c
 * JD-Core Version:    0.6.2
 */