package com.tencent.mm.plugin.label.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.storage.af;

final class ContactLabelManagerUI$2
  implements DialogInterface.OnClickListener
{
  ContactLabelManagerUI$2(ContactLabelManagerUI paramContactLabelManagerUI, af paramaf)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(22585);
    if (this.nIi != null)
      if (this.nIi.field_isTemporary)
      {
        ContactLabelManagerUI.a(this.nIh, this.nIi.field_labelID);
        AppMethodBeat.o(22585);
      }
    while (true)
    {
      return;
      ContactLabelManagerUI.a(this.nIh, this.nIi);
      AppMethodBeat.o(22585);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.label.ui.ContactLabelManagerUI.2
 * JD-Core Version:    0.6.2
 */