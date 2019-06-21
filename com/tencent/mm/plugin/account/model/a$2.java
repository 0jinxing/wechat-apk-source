package com.tencent.mm.plugin.account.model;

import android.os.Message;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;

final class a$2 extends ak
{
  a$2(a parama)
  {
  }

  public final void handleMessage(Message paramMessage)
  {
    AppMethodBeat.i(124655);
    switch (paramMessage.what)
    {
    default:
    case 0:
    }
    while (true)
    {
      AppMethodBeat.o(124655);
      return;
      this.gyC.fPO = true;
      boolean bool = com.tencent.mm.platformtools.a.syncAddrBook(this.gyC.fAY);
      if (!bool)
        this.gyC.fPO = false;
      ab.i("MicroMsg.ContactsAutoSyncLogic ", "sync result %b", new Object[] { Boolean.valueOf(bool) });
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.model.a.2
 * JD-Core Version:    0.6.2
 */