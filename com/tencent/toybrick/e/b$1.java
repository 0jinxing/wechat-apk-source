package com.tencent.toybrick.e;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.toybrick.d.a.a;
import java.lang.ref.WeakReference;

public final class b$1
  implements Runnable
{
  public b$1(b paramb)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(113228);
    com.tencent.toybrick.b.b localb = (com.tencent.toybrick.b.b)this.AGZ.AGX.get();
    if (localb != null)
      a.dSz().execute(new b.b(this.AGZ, localb.AFT.AGR, localb.AFP, localb.AFO));
    AppMethodBeat.o(113228);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.toybrick.e.b.1
 * JD-Core Version:    0.6.2
 */