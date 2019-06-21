package com.tencent.mm.plugin.label.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class ContactLabelUI$3
  implements DialogInterface.OnClickListener
{
  ContactLabelUI$3(ContactLabelUI paramContactLabelUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(22660);
    this.nIU.finish();
    AppMethodBeat.o(22660);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.label.ui.ContactLabelUI.3
 * JD-Core Version:    0.6.2
 */