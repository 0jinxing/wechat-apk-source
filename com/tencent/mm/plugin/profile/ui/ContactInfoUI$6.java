package com.tencent.mm.plugin.profile.ui;

import android.content.Intent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.model.r;
import com.tencent.mm.model.t;
import com.tencent.mm.plugin.profile.b;
import com.tencent.mm.pluginsdk.n;

final class ContactInfoUI$6
  implements MenuItem.OnMenuItemClickListener
{
  ContactInfoUI$6(ContactInfoUI paramContactInfoUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(23352);
    if (((t.no(ContactInfoUI.f(this.plz).field_username)) && (!r.YT())) || ((t.ng(ContactInfoUI.f(this.plz).field_username)) && (!r.YP())) || ((t.ni(ContactInfoUI.f(this.plz).field_username)) && (!r.YY())) || ((t.nc(ContactInfoUI.f(this.plz).field_username)) && (!r.Zb())))
    {
      paramMenuItem = new Intent();
      paramMenuItem.addFlags(67108864);
      b.gkE.p(paramMenuItem, this.plz);
    }
    this.plz.finish();
    AppMethodBeat.o(23352);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.profile.ui.ContactInfoUI.6
 * JD-Core Version:    0.6.2
 */