package com.tencent.mm.plugin.music.model.notification;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;

final class MMMusicPlayerService$1
  implements Runnable
{
  MMMusicPlayerService$1(MMMusicPlayerService paramMMMusicPlayerService)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(104991);
    ab.i("MicroMsg.Music.MMMusicPlayerService", "quit");
    al.af(MMMusicPlayerService.a(this.oMU));
    this.oMU.stopSelf();
    AppMethodBeat.o(104991);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.music.model.notification.MMMusicPlayerService.1
 * JD-Core Version:    0.6.2
 */