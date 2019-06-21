package com.tencent.toybrick.e;

import android.support.v7.h.c.b;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.ref.WeakReference;

final class b$b$1
  implements Runnable
{
  b$b$1(b.b paramb, b.a parama)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(113229);
    com.tencent.toybrick.b.b localb = (com.tencent.toybrick.b.b)this.AHg.AGZ.AGX.get();
    if (localb != null)
    {
      localb.AFO = this.AHf.AHb;
      localb.AFQ = this.AHf.AHc;
      this.AHf.AHa.a(localb);
    }
    AppMethodBeat.o(113229);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.toybrick.e.b.b.1
 * JD-Core Version:    0.6.2
 */