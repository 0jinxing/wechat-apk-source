package a.i.b.a.c.a;

import a.i.b.a.c.f.b;
import a.i.b.a.c.f.f;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Set;

public enum h
{
  public static final Set<h> BbY;
  public final f BbZ;
  public final f Bca;
  public b Bcb;
  private b Bcc;

  static
  {
    AppMethodBeat.i(119106);
    BbQ = new h("BOOLEAN", 0, "Boolean");
    BbR = new h("CHAR", 1, "Char");
    BbS = new h("BYTE", 2, "Byte");
    BbT = new h("SHORT", 3, "Short");
    BbU = new h("INT", 4, "Int");
    BbV = new h("FLOAT", 5, "Float");
    BbW = new h("LONG", 6, "Long");
    BbX = new h("DOUBLE", 7, "Double");
    Bcd = new h[] { BbQ, BbR, BbS, BbT, BbU, BbV, BbW, BbX };
    BbY = Collections.unmodifiableSet(EnumSet.of(BbR, new h[] { BbS, BbT, BbU, BbV, BbW, BbX }));
    AppMethodBeat.o(119106);
  }

  private h(String paramString)
  {
    AppMethodBeat.i(119105);
    this.Bcb = null;
    this.Bcc = null;
    this.BbZ = f.avX(paramString);
    this.Bca = f.avX(paramString + "Array");
    AppMethodBeat.o(119105);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.a.h
 * JD-Core Version:    0.6.2
 */