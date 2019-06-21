package com.tencent.mm.plugin.account.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class ContactsSyncUI$3
  implements DialogInterface.OnClickListener
{
  ContactsSyncUI$3(ContactsSyncUI paramContactsSyncUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(124743);
    paramDialogInterface.dismiss();
    this.gAz.finish();
    AppMethodBeat.o(124743);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.ContactsSyncUI.3
 * JD-Core Version:    0.6.2
 */