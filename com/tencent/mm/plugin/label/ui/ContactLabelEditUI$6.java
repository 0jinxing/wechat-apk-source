package com.tencent.mm.plugin.label.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class ContactLabelEditUI$6
  implements DialogInterface.OnClickListener
{
  ContactLabelEditUI$6(ContactLabelEditUI paramContactLabelEditUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(22543);
    this.nHW.setResult(0);
    this.nHW.finish();
    AppMethodBeat.o(22543);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.label.ui.ContactLabelEditUI.6
 * JD-Core Version:    0.6.2
 */