package com.tencent.mm.plugin.appbrand.phonenumber;

import a.l;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "it", "Landroid/view/MenuItem;", "kotlin.jvm.PlatformType", "onMenuItemClick"})
final class PhoneNumberManagerUI$d
  implements MenuItem.OnMenuItemClickListener
{
  PhoneNumberManagerUI$d(PhoneNumberManagerUI paramPhoneNumberManagerUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(134862);
    this.iyH.finish();
    this.iyH.overridePendingTransition(2131034130, 2131034130);
    AppMethodBeat.o(134862);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.phonenumber.PhoneNumberManagerUI.d
 * JD-Core Version:    0.6.2
 */