package com.tencent.mm.plugin.appbrand.widget.input;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class w$5
  implements Runnable
{
  w$5(w paramw, int paramInt, boolean paramBoolean)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(123772);
    int i = w.e(this.jfZ);
    if (!this.jfZ.isShown())
    {
      w.a(this.jfZ, 2);
      if (w.f(this.jfZ) != null)
        break label63;
      AppMethodBeat.o(123772);
    }
    while (true)
    {
      return;
      w.a(this.jfZ, this.jga);
      break;
      label63: if ((i != w.e(this.jfZ)) && (!this.jgb))
        w.f(this.jfZ).nS(w.e(this.jfZ));
      AppMethodBeat.o(123772);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.input.w.5
 * JD-Core Version:    0.6.2
 */