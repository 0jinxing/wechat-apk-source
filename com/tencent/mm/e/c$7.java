package com.tencent.mm.e;

import android.graphics.Matrix;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cache.a;
import com.tencent.mm.view.b.a.b;

public final class c$7
  implements a.b
{
  public c$7(c paramc)
  {
  }

  public final void CV()
  {
    AppMethodBeat.i(116160);
    this.cjQ.getMainMatrix().set(((a)this.cjQ.CI()).efr);
    this.cjQ.CQ();
    c.a(this.cjQ, 300L, false, false);
    AppMethodBeat.o(116160);
  }

  public final void onStart()
  {
    AppMethodBeat.i(116161);
    c.a(this.cjQ, false);
    AppMethodBeat.o(116161);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.e.c.7
 * JD-Core Version:    0.6.2
 */