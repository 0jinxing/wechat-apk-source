package com.tencent.mm.plugin.appbrand.phonenumber;

import a.f.b.j;
import a.l;
import android.content.Context;
import android.content.Intent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "it", "Landroid/view/MenuItem;", "kotlin.jvm.PlatformType", "onMenuItemClick"})
final class PhoneNumberManagerUI$e
  implements MenuItem.OnMenuItemClickListener
{
  PhoneNumberManagerUI$e(PhoneNumberManagerUI paramPhoneNumberManagerUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(134863);
    paramMenuItem = PhoneNumberManagerUI.iyG;
    paramMenuItem = this.iyH.dxU();
    j.o(paramMenuItem, "context");
    paramMenuItem = (Context)paramMenuItem;
    String str = PhoneNumberManagerUI.a(this.iyH);
    j.p(paramMenuItem, "context");
    j.p(str, "appId");
    Intent localIntent = new Intent(paramMenuItem, PhoneNumberManagerUI.class);
    localIntent.putExtra("APPID", str);
    localIntent.putExtra("SHOW_DELETE", true);
    paramMenuItem.startActivity(localIntent);
    AppMethodBeat.o(134863);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.phonenumber.PhoneNumberManagerUI.e
 * JD-Core Version:    0.6.2
 */