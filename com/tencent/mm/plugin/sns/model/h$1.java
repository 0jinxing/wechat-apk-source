package com.tencent.mm.plugin.sns.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ak;

final class h$1
  implements Runnable
{
  h$1(h paramh, Object[] paramArrayOfObject)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(36230);
    Object localObject = this.qIM.dv();
    this.qIM.handler.post(new h.1.1(this, localObject));
    AppMethodBeat.o(36230);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.model.h.1
 * JD-Core Version:    0.6.2
 */