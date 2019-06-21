package com.tencent.mm.plugin.music.model.notification;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;

final class a$1
  implements Runnable
{
  a$1(a parama)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(104971);
    ab.i("MicroMsg.Music.MMMusicNotification", "close");
    al.af(this.oMO.oMM);
    this.oMO.oMK.stopForeground(true);
    AppMethodBeat.o(104971);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.music.model.notification.a.1
 * JD-Core Version:    0.6.2
 */