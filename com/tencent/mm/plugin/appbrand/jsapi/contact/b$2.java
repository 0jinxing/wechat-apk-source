package com.tencent.mm.plugin.appbrand.jsapi.contact;

import android.app.Activity;
import android.content.Intent;
import android.provider.ContactsContract.Contacts;
import android.view.MenuItem;
import com.tencent.luggage.g.e;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.c;
import com.tencent.mm.ui.base.n.d;

final class b$2
  implements n.d
{
  b$2(b paramb, Activity paramActivity, c paramc1, c paramc2, int paramInt)
  {
  }

  public final void onMMMenuItemSelected(MenuItem paramMenuItem, int paramInt)
  {
    AppMethodBeat.i(126263);
    switch (paramInt)
    {
    default:
    case 0:
    case 1:
    }
    while (true)
    {
      AppMethodBeat.o(126263);
      while (true)
      {
        return;
        paramMenuItem = new Intent("android.intent.action.INSERT", ContactsContract.Contacts.CONTENT_URI);
        b.a(this.hIe, paramMenuItem, this.val$activity, this.hIf);
        this.val$activity.startActivity(paramMenuItem);
        e.ax(this.val$activity).a(paramMenuItem, new b.2.1(this));
        AppMethodBeat.o(126263);
      }
      paramMenuItem = new Intent("android.intent.action.INSERT_OR_EDIT", ContactsContract.Contacts.CONTENT_URI);
      paramMenuItem.setType("vnd.android.cursor.item/person");
      b.a(this.hIe, paramMenuItem, this.val$activity, this.hIf);
      e.ax(this.val$activity).a(paramMenuItem, new b.2.2(this));
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.contact.b.2
 * JD-Core Version:    0.6.2
 */