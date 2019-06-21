package com.tencent.mm.plugin.recharge.ui;

import android.content.Intent;
import android.provider.ContactsContract.Contacts;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class RechargeUI$13
  implements View.OnClickListener
{
  RechargeUI$13(RechargeUI paramRechargeUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(44319);
    if (RechargeUI.e(this.pHV).pGu)
    {
      RechargeUI.e(this.pHV).setInput(null);
      AppMethodBeat.o(44319);
    }
    while (true)
    {
      return;
      paramView = new Intent("android.intent.action.PICK", ContactsContract.Contacts.CONTENT_URI);
      this.pHV.startActivityForResult(paramView, 1);
      AppMethodBeat.o(44319);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.recharge.ui.RechargeUI.13
 * JD-Core Version:    0.6.2
 */