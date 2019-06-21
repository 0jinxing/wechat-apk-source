package com.tencent.mm.modelfriend;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.account.a.a.b;
import com.tencent.mm.plugin.account.friend.a.al;
import com.tencent.mm.plugin.account.friend.a.l;
import com.tencent.mm.sdk.platformtools.ab;

final class AddrBookObserver$AddrBookService$1
  implements b
{
  AddrBookObserver$AddrBookService$1(AddrBookObserver.AddrBookService paramAddrBookService)
  {
  }

  public final void cN(boolean paramBoolean)
  {
    AppMethodBeat.i(124498);
    if (!paramBoolean)
    {
      ab.v("MicroMsg.AddrBookObserver", "onSyncEnd not sync succ, do not upload");
      this.fAZ.stopSelf();
      AddrBookObserver.AddrBookService.fAV = false;
      AppMethodBeat.o(124498);
    }
    while (true)
    {
      return;
      System.currentTimeMillis();
      l.apX();
      al localal = new al(l.aqb(), l.aqa());
      g.Rg().a(localal, 0);
      this.fAZ.stopSelf();
      AddrBookObserver.AddrBookService.fAV = false;
      AppMethodBeat.o(124498);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelfriend.AddrBookObserver.AddrBookService.1
 * JD-Core Version:    0.6.2
 */