package com.tencent.mm.plugin.account.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.b.a;

final class RegByEmailUI$4
  implements DialogInterface.OnClickListener
{
  RegByEmailUI$4(RegByEmailUI paramRegByEmailUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(125304);
    this.gFF.finish();
    a.wA("L2_signup");
    paramDialogInterface = new Intent(this.gFF, LoginPasswordUI.class);
    paramDialogInterface.putExtra("email_address", RegByEmailUI.g(this.gFF));
    this.gFF.startActivity(paramDialogInterface);
    AppMethodBeat.o(125304);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.RegByEmailUI.4
 * JD-Core Version:    0.6.2
 */