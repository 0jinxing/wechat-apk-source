package a.i.b.a.c.h;

import a.f.b.j;
import a.k.m;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class p$a extends p
{
  p$a()
  {
    super(str, 1);
  }

  public final String escape(String paramString)
  {
    AppMethodBeat.i(121912);
    j.p(paramString, "string");
    paramString = m.i(m.i(paramString, "<", "&lt;", false), ">", "&gt;", false);
    AppMethodBeat.o(121912);
    return paramString;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.h.p.a
 * JD-Core Version:    0.6.2
 */