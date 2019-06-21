package com.tencent.mm.plugin.account.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.permission.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

final class ContactsSyncUI$1
  implements Runnable
{
  ContactsSyncUI$1(ContactsSyncUI paramContactsSyncUI, String paramString)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(124740);
    ContactsSyncUI localContactsSyncUI = this.gAz;
    if (this.gAy.equals("android.permission.READ_CONTACTS"));
    for (String str = "android.permission.WRITE_CONTACTS"; ; str = "android.permission.READ_CONTACTS")
    {
      boolean bool = b.a(localContactsSyncUI, str, 48, null, null);
      ab.i("MicroMsg.ContactsSyncUI", "summerper checkPermission checkContacts [%b], oldPermission[%s], stack[%s]", new Object[] { Boolean.valueOf(bool), this.gAy, bo.dpG() });
      if (bool)
        this.gAz.initView();
      AppMethodBeat.o(124740);
      return;
    }
  }

  public final String toString()
  {
    AppMethodBeat.i(124741);
    String str = super.toString() + "|checkContacts";
    AppMethodBeat.o(124741);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.ContactsSyncUI.1
 * JD-Core Version:    0.6.2
 */