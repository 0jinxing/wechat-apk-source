package a.i.b.a.c.h;

import a.i.b.a.c.b.ag;
import a.i.b.a.c.b.n;
import a.i.b.a.c.b.t;
import a.y;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class e$a
  implements n<y, StringBuilder>
{
  private final void a(ag paramag, StringBuilder paramStringBuilder, String paramString)
  {
    AppMethodBeat.i(121737);
    o localo = this.BCd.BCc.eji();
    switch (f.eQZ[localo.ordinal()])
    {
    default:
    case 1:
    case 2:
    }
    while (true)
    {
      AppMethodBeat.o(121737);
      while (true)
      {
        return;
        e.a(this.BCd, paramag, paramStringBuilder);
        paramStringBuilder.append(paramString + " for ");
        paramString = this.BCd;
        paramag = paramag.dZH();
        a.f.b.j.o(paramag, "descriptor.correspondingProperty");
        e.a(paramString, paramag, paramStringBuilder);
        AppMethodBeat.o(121737);
      }
      b((t)paramag, paramStringBuilder);
    }
  }

  private void b(t paramt, StringBuilder paramStringBuilder)
  {
    AppMethodBeat.i(121738);
    a.f.b.j.p(paramt, "descriptor");
    a.f.b.j.p(paramStringBuilder, "builder");
    e.a(this.BCd, paramt, paramStringBuilder);
    AppMethodBeat.o(121738);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.h.e.a
 * JD-Core Version:    0.6.2
 */