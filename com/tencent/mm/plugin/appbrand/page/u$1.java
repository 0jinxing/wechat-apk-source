package com.tencent.mm.plugin.appbrand.page;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.v;
import com.tencent.mm.plugin.appbrand.widget.input.u.c;

final class u$1
  implements u.c
{
  private int ict;
  private final v isZ;

  u$1(u paramu)
  {
    AppMethodBeat.i(87157);
    this.isZ = new v();
    this.ict = 0;
    AppMethodBeat.o(87157);
  }

  public final void et(boolean paramBoolean)
  {
    AppMethodBeat.i(87158);
    v localv = this.isZ;
    if (paramBoolean);
    for (int i = this.ict; ; i = 0)
    {
      localv.a(i, this.ita.xT(), this.ita, null);
      AppMethodBeat.o(87158);
      return;
    }
  }

  public final int getHeight()
  {
    return this.ict;
  }

  public final void oD(int paramInt)
  {
    this.ict = paramInt;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.page.u.1
 * JD-Core Version:    0.6.2
 */