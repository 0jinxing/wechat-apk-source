package com.tencent.mm.plugin.profile.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.pluginsdk.b.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.ui.base.preference.f;

final class ContactInfoUI$7
  implements Runnable
{
  ContactInfoUI$7(ContactInfoUI paramContactInfoUI, String paramString)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(23353);
    ab.i("MicroMsg.ContactInfoUI", "onNotifyChange verify:%b, contact.user:%s, notify.user:%s", new Object[] { Boolean.valueOf(ContactInfoUI.g(this.plz)), ContactInfoUI.f(this.plz).field_username, this.fwC });
    if ((ContactInfoUI.f(this.plz) != null) && (!bo.isNullOrNil(ContactInfoUI.f(this.plz).field_username)) && ((ContactInfoUI.f(this.plz).field_username.equals(this.fwC)) || (ContactInfoUI.f(this.plz).field_username.equals(ad.aoC(this.fwC)))))
    {
      if (ContactInfoUI.h(this.plz) != null)
      {
        ContactInfoUI.h(this.plz).biV();
        ContactInfoUI.i(this.plz).removeAll();
      }
      this.plz.initView();
    }
    AppMethodBeat.o(23353);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.profile.ui.ContactInfoUI.7
 * JD-Core Version:    0.6.2
 */