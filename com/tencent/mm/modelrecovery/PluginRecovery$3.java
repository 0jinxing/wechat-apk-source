package com.tencent.mm.modelrecovery;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class PluginRecovery$3
  implements Runnable
{
  PluginRecovery$3(PluginRecovery paramPluginRecovery)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(16527);
    ab.i("MicroMsg.Recovery.PluginRecovery", "postLog");
    a.aiz();
    AppMethodBeat.o(16527);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelrecovery.PluginRecovery.3
 * JD-Core Version:    0.6.2
 */