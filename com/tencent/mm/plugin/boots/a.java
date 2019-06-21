package com.tencent.mm.plugin.boots;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.boots.a.c;
import com.tencent.mm.plugin.boots.a.d;
import com.tencent.mm.plugin.boots.a.e;
import java.util.List;

public final class a
  implements c
{
  public final List<com.tencent.mm.plugin.boots.a.a> aVJ()
  {
    AppMethodBeat.i(90513);
    List localList = ((d)g.M(d.class)).getTinkerLogic().aVJ();
    AppMethodBeat.o(90513);
    return localList;
  }

  public final void dC(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(90512);
    if (((d)g.M(d.class)).getTinkerLogic() != null)
      ((d)g.M(d.class)).getTinkerLogic().dC(paramInt1, paramInt2);
    AppMethodBeat.o(90512);
  }

  public final void rT(int paramInt)
  {
    AppMethodBeat.i(90511);
    if (((d)g.M(d.class)).getTinkerLogic() != null)
      ((d)g.M(d.class)).getTinkerLogic().rT(paramInt);
    AppMethodBeat.o(90511);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.boots.a
 * JD-Core Version:    0.6.2
 */