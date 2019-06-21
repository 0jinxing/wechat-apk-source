package a.i.b.a.c.i.d;

import a.i.b.a.c.a.h;
import a.i.b.a.c.f.b;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public enum c
{
  private static final Set<b> BFm;
  private static final Map<String, c> BFn;
  private static final Map<h, c> BFo;
  private static final Map<String, c> BFp;
  public final h BFq;
  public final b BFr;
  public final String desc;
  public final String name;

  static
  {
    int i = 0;
    AppMethodBeat.i(122167);
    BFe = new c("BOOLEAN", 0, h.BbQ, "boolean", "Z", "java.lang.Boolean");
    BFf = new c("CHAR", 1, h.BbR, "char", "C", "java.lang.Character");
    BFg = new c("BYTE", 2, h.BbS, "byte", "B", "java.lang.Byte");
    BFh = new c("SHORT", 3, h.BbT, "short", "S", "java.lang.Short");
    BFi = new c("INT", 4, h.BbU, "int", "I", "java.lang.Integer");
    BFj = new c("FLOAT", 5, h.BbV, "float", "F", "java.lang.Float");
    BFk = new c("LONG", 6, h.BbW, "long", "J", "java.lang.Long");
    BFl = new c("DOUBLE", 7, h.BbX, "double", "D", "java.lang.Double");
    BFs = new c[] { BFe, BFf, BFg, BFh, BFi, BFj, BFk, BFl };
    BFm = new HashSet();
    BFn = new HashMap();
    BFo = new EnumMap(h.class);
    BFp = new HashMap();
    c[] arrayOfc = values();
    int j = arrayOfc.length;
    while (i < j)
    {
      c localc = arrayOfc[i];
      BFm.add(localc.BFr);
      BFn.put(localc.name, localc);
      BFo.put(localc.BFq, localc);
      BFp.put(localc.desc, localc);
      i++;
    }
    AppMethodBeat.o(122167);
  }

  private c(h paramh, String paramString1, String paramString2, String paramString3)
  {
    AppMethodBeat.i(122166);
    this.BFq = paramh;
    this.name = paramString1;
    this.desc = paramString2;
    this.BFr = new b(paramString3);
    AppMethodBeat.o(122166);
  }

  public static c awk(String paramString)
  {
    AppMethodBeat.i(122164);
    c localc = (c)BFn.get(paramString);
    if (localc == null)
    {
      paramString = new AssertionError("Non-primitive type name passed: ".concat(String.valueOf(paramString)));
      AppMethodBeat.o(122164);
      throw paramString;
    }
    AppMethodBeat.o(122164);
    return localc;
  }

  public static c d(h paramh)
  {
    AppMethodBeat.i(122165);
    paramh = (c)BFo.get(paramh);
    AppMethodBeat.o(122165);
    return paramh;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.i.d.c
 * JD-Core Version:    0.6.2
 */