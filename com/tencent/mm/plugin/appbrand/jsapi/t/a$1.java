package com.tencent.mm.plugin.appbrand.jsapi.t;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.widget.input.u.c;

final class a$1
  implements u.c
{
  private int ict = 0;

  a$1(a parama)
  {
  }

  public final void et(boolean paramBoolean)
  {
    AppMethodBeat.i(131631);
    a.a(this.icu).k(paramBoolean, this.ict);
    AppMethodBeat.o(131631);
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

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.t.a.1
 * JD-Core Version:    0.6.2
 */