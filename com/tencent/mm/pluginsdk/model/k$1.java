package com.tencent.mm.pluginsdk.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ak;

final class k$1
  implements Runnable
{
  k$1(k paramk, Object[] paramArrayOfObject)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(79216);
    Object localObject = this.vbk.dv();
    this.vbk.handler.post(new k.1.1(this, localObject));
    AppMethodBeat.o(79216);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.model.k.1
 * JD-Core Version:    0.6.2
 */