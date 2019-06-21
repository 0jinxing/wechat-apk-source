package com.tencent.mm.plugin.ipcall;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.hw;
import com.tencent.mm.sdk.platformtools.ab;

final class a$1
  implements Runnable
{
  a$1(a parama)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(21658);
    ab.d("MicroMsg.IPCallAddressBookUsernameUpdater", "start GetMFriend");
    hw localhw = new hw();
    localhw.cCP.scene = 2;
    com.tencent.mm.sdk.b.a.xxA.m(localhw);
    a.a(this.nuW, System.currentTimeMillis());
    AppMethodBeat.o(21658);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ipcall.a.1
 * JD-Core Version:    0.6.2
 */