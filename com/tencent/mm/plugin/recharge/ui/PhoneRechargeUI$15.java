package com.tencent.mm.plugin.recharge.ui;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.provider.ContactsContract.Contacts;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.h;

final class PhoneRechargeUI$15
  implements View.OnClickListener
{
  PhoneRechargeUI$15(PhoneRechargeUI paramPhoneRechargeUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(44269);
    int i;
    if (this.pHs.getPackageManager().checkPermission("android.permission.READ_CONTACTS", ah.getPackageName()) == 0)
    {
      i = 1;
      if (i == 0)
        break label73;
      paramView = new Intent("android.intent.action.PICK", ContactsContract.Contacts.CONTENT_URI);
      if (bo.k(this.pHs, paramView))
        this.pHs.startActivityForResult(paramView, 1);
      AppMethodBeat.o(44269);
    }
    while (true)
    {
      return;
      i = 0;
      break;
      label73: h.b(this.pHs, this.pHs.getString(2131305281), "", true);
      AppMethodBeat.o(44269);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.recharge.ui.PhoneRechargeUI.15
 * JD-Core Version:    0.6.2
 */