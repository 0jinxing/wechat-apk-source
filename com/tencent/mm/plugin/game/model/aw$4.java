package com.tencent.mm.plugin.game.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class aw$4
  implements Runnable
{
  aw$4(aw paramaw)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(111466);
    ab.i("MicroMsg.Wepkg.NotifyGameWebviewOperationListener", "interval:%sms, allow enter url:%s", new Object[] { Integer.valueOf(1000), aw.access$300() });
    aw.NW("");
    AppMethodBeat.o(111466);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.model.aw.4
 * JD-Core Version:    0.6.2
 */