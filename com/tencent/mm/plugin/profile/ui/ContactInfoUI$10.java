package com.tencent.mm.plugin.profile.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class ContactInfoUI$10
  implements DialogInterface.OnClickListener
{
  ContactInfoUI$10(ContactInfoUI paramContactInfoUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(23356);
    paramDialogInterface.dismiss();
    AppMethodBeat.o(23356);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.profile.ui.ContactInfoUI.10
 * JD-Core Version:    0.6.2
 */