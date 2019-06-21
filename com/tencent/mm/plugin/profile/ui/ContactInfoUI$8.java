package com.tencent.mm.plugin.profile.ui;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.model.t;
import com.tencent.mm.pluginsdk.b.a;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bv;
import com.tencent.mm.ui.base.preference.f;

final class ContactInfoUI$8
  implements Runnable
{
  ContactInfoUI$8(ContactInfoUI paramContactInfoUI, bv parambv)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(23354);
    if ((ContactInfoUI.f(this.plz) != null) && (this.plA != null) && (!bo.isNullOrNil(ContactInfoUI.f(this.plz).field_username)) && (ContactInfoUI.f(this.plz).field_username.equals(this.plA.field_encryptUsername)) && (!t.nJ(ContactInfoUI.f(this.plz).field_username)))
    {
      ContactInfoUI.f(this.plz).iz(this.plA.field_conRemark);
      this.plz.getIntent().putExtra("Contact_User", ContactInfoUI.f(this.plz).field_username);
      if (ContactInfoUI.h(this.plz) != null)
      {
        ContactInfoUI.h(this.plz).biV();
        ContactInfoUI.i(this.plz).removeAll();
      }
      this.plz.initView();
    }
    AppMethodBeat.o(23354);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.profile.ui.ContactInfoUI.8
 * JD-Core Version:    0.6.2
 */