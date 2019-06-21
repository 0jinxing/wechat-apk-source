package a.i.b.a.c.d.a.f;

import a.f.a.b;
import a.f.b.j;
import a.o;
import a.y;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Map;

public final class m$a
{
  final String className;

  public m$a(String paramString)
  {
    AppMethodBeat.i(120185);
    this.className = localObject;
    AppMethodBeat.o(120185);
  }

  public final void c(String paramString, b<? super m.a.a, y> paramb)
  {
    AppMethodBeat.i(120184);
    j.p(paramString, "name");
    j.p(paramb, "block");
    Map localMap = this.BqC.BqB;
    paramString = new m.a.a(this, paramString);
    paramb.am(paramString);
    paramString = paramString.eco();
    localMap.put(paramString.first, paramString.second);
    AppMethodBeat.o(120184);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.d.a.f.m.a
 * JD-Core Version:    0.6.2
 */