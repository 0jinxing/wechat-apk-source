package com.tencent.mm.plugin.account.ui;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.platformtools.w.a;

final class ContactsSyncUI$a$1
  implements w.a
{
  ContactsSyncUI$a$1(ContactsSyncUI.a parama)
  {
  }

  public final void o(Bundle paramBundle)
  {
    AppMethodBeat.i(124744);
    ContactsSyncUI localContactsSyncUI = this.gAC.gAz;
    localContactsSyncUI.gAx = paramBundle;
    localContactsSyncUI.finish();
    AppMethodBeat.o(124744);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.ContactsSyncUI.a.1
 * JD-Core Version:    0.6.2
 */