package a.i.b.a.c.l;

import a.f.b.j;
import a.i.b.a.c.b.ar;
import a.v;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.List;

public final class ai$a extends ao
{
  ai$a(List paramList)
  {
  }

  public final ap c(an paraman)
  {
    AppMethodBeat.i(122635);
    j.p(paraman, "key");
    if (this.BJN.contains(paraman))
    {
      paraman = paraman.dYs();
      if (paraman == null)
      {
        paraman = new v("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.TypeParameterDescriptor");
        AppMethodBeat.o(122635);
        throw paraman;
      }
      paraman = av.e((ar)paraman);
      AppMethodBeat.o(122635);
    }
    while (true)
    {
      return paraman;
      paraman = null;
      AppMethodBeat.o(122635);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.l.ai.a
 * JD-Core Version:    0.6.2
 */