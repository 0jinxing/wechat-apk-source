package com.tencent.mm.ui.chatting.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.HashMap;
import java.util.LinkedHashMap;

final class ao$3
  implements Runnable
{
  ao$3(ao paramao)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(31785);
    long l = System.currentTimeMillis();
    synchronized (this.yST)
    {
      ao.bTt().clear();
      ao.dFl().clear();
      ab.i("MicroMsg.TransformComponent", "alvinluo unsetTransformFlag cost: %d", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
      AppMethodBeat.o(31785);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.c.ao.3
 * JD-Core Version:    0.6.2
 */