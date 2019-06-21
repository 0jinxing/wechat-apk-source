package a.i.b.a.c.d.b;

import a.f.b.j;
import a.i.b.a.c.e.a.c;
import a.i.b.a.c.e.b.a.f;
import a.i.b.a.c.e.b.a.f.a;
import a.i.b.a.c.e.b.a.f.b;
import a.i.b.a.c.e.b.b.c;
import a.m;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class q$a
{
  public static q a(q paramq, int paramInt)
  {
    AppMethodBeat.i(120295);
    j.p(paramq, "signature");
    paramq = new q(paramq.signature + "@" + paramInt, (byte)0);
    AppMethodBeat.o(120295);
    return paramq;
  }

  public static q a(c paramc, b.c paramc1)
  {
    AppMethodBeat.i(120291);
    j.p(paramc, "nameResolver");
    j.p(paramc1, "signature");
    paramc = iT(paramc.getString(paramc1.Buf), paramc.getString(paramc1.BxN));
    AppMethodBeat.o(120291);
    return paramc;
  }

  public static q a(f paramf)
  {
    AppMethodBeat.i(120294);
    j.p(paramf, "signature");
    if ((paramf instanceof f.b))
    {
      paramf = iT(paramf.getName(), paramf.ehx());
      AppMethodBeat.o(120294);
    }
    while (true)
    {
      return paramf;
      if (!(paramf instanceof f.a))
        break;
      paramf = iU(paramf.getName(), paramf.ehx());
      AppMethodBeat.o(120294);
    }
    paramf = new m();
    AppMethodBeat.o(120294);
    throw paramf;
  }

  public static q iT(String paramString1, String paramString2)
  {
    AppMethodBeat.i(120292);
    j.p(paramString1, "name");
    j.p(paramString2, "desc");
    paramString1 = new q(paramString1 + paramString2, (byte)0);
    AppMethodBeat.o(120292);
    return paramString1;
  }

  public static q iU(String paramString1, String paramString2)
  {
    AppMethodBeat.i(120293);
    j.p(paramString1, "name");
    j.p(paramString2, "desc");
    paramString1 = new q(paramString1 + "#" + paramString2, (byte)0);
    AppMethodBeat.o(120293);
    return paramString1;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.d.b.q.a
 * JD-Core Version:    0.6.2
 */