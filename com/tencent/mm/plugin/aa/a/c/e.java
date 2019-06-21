package com.tencent.mm.plugin.aa.a.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.vending.c.b;
import com.tencent.mm.vending.j.c;
import java.util.Map;

public class e
  implements b<d>
{
  protected d gmI;
  public final b gmJ;
  public final e.c gmK;
  public final e.a gmL;

  public e()
  {
    this(new d());
    AppMethodBeat.i(40690);
    AppMethodBeat.o(40690);
  }

  private e(d paramd)
  {
    AppMethodBeat.i(40691);
    this.gmJ = new b();
    this.gmK = new e.c(this);
    this.gmL = new e.a(this);
    this.gmI = paramd;
    AppMethodBeat.o(40691);
  }

  public final class b
    implements com.tencent.mm.vending.h.e<Boolean, c<Integer, Map<String, Object>>>
  {
    public b()
    {
    }

    public final String HZ()
    {
      return "Vending.LOGIC";
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.aa.a.c.e
 * JD-Core Version:    0.6.2
 */