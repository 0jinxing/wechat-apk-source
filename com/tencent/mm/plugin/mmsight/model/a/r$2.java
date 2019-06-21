package com.tencent.mm.plugin.mmsight.model.a;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class r$2
  implements Runnable
{
  r$2(r paramr)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(76671);
    r.a(this.owZ);
    if (this.owZ.owX != null)
    {
      this.owZ.owX.bPP();
      this.owZ.owX = null;
    }
    AppMethodBeat.o(76671);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mmsight.model.a.r.2
 * JD-Core Version:    0.6.2
 */