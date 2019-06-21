package com.tencent.mm.plugin.sns.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.HashMap;

final class ah$1
  implements Runnable
{
  ah$1(ah paramah)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(36526);
    if (this.qMo.ckP.size() > 50)
      ah.a(this.qMo, 10);
    AppMethodBeat.o(36526);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.model.ah.1
 * JD-Core Version:    0.6.2
 */