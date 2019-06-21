package com.tencent.mm.plugin.account.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.account.a.a.b;
import com.tencent.mm.plugin.account.friend.a.al;
import com.tencent.mm.plugin.account.friend.a.l;
import com.tencent.mm.sdk.platformtools.ab;

final class ContactsSyncService$1
  implements b
{
  ContactsSyncService$1(ContactsSyncService paramContactsSyncService)
  {
  }

  public final void cN(boolean paramBoolean)
  {
    AppMethodBeat.i(124661);
    ab.i("MicroMsg.ContactsSyncService", "performSync end, succ:%b", new Object[] { Boolean.valueOf(paramBoolean) });
    if (!paramBoolean)
    {
      ContactsSyncService.a(this.gyG);
      AppMethodBeat.o(124661);
    }
    while (true)
    {
      return;
      g.Rg().a(133, this.gyG);
      System.currentTimeMillis();
      l.apX();
      al localal = new al(l.aqb(), l.aqa());
      g.Rg().a(localal, 0);
      AppMethodBeat.o(124661);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.model.ContactsSyncService.1
 * JD-Core Version:    0.6.2
 */