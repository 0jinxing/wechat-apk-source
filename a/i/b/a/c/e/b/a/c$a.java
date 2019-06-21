package a.i.b.a.c.e.b.a;

import a.f.a.m;
import a.f.b.j;
import a.f.b.k;
import a.y;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Map;

final class c$a extends k
  implements m<String, String, y>
{
  c$a(Map paramMap)
  {
    super(2);
  }

  public final void iW(String paramString1, String paramString2)
  {
    AppMethodBeat.i(121304);
    j.p(paramString1, "kotlinSimpleName");
    j.p(paramString2, "javaInternalName");
    this.Byn.put("kotlin/".concat(String.valueOf(paramString1)), "L" + paramString2 + ';');
    AppMethodBeat.o(121304);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.e.b.a.c.a
 * JD-Core Version:    0.6.2
 */