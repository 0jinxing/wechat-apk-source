package com.tencent.mm.plugin.aa.a.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.vending.g.f;
import com.tencent.mm.vending.h.e;
import com.tencent.mm.vending.j.d;
import java.util.List;

public class b
  implements com.tencent.mm.vending.c.b<a>
{
  protected a gmC;
  public final a gmD;

  public b()
  {
    this(new a());
    AppMethodBeat.i(40679);
    AppMethodBeat.o(40679);
  }

  private b(a parama)
  {
    AppMethodBeat.i(40680);
    this.gmD = new a();
    this.gmC = parama;
    AppMethodBeat.o(40680);
  }

  public final class a
    implements e<d<List, String, Boolean>, com.tencent.mm.vending.j.c<Boolean, Integer>>
  {
    public a()
    {
    }

    public final String HZ()
    {
      return "Vending.ANY";
    }

    public final com.tencent.mm.vending.g.c<d<List, String, Boolean>> g(boolean paramBoolean, int paramInt)
    {
      AppMethodBeat.i(40677);
      com.tencent.mm.vending.g.c localc = f.D(Boolean.valueOf(paramBoolean), Integer.valueOf(paramInt)).c(this);
      AppMethodBeat.o(40677);
      return localc;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.aa.a.c.b
 * JD-Core Version:    0.6.2
 */