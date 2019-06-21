package com.tencent.mm.plugin.label.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.model.aw;

final class ContactLabelEditUI$3
  implements DialogInterface.OnCancelListener
{
  ContactLabelEditUI$3(ContactLabelEditUI paramContactLabelEditUI)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(22541);
    aw.Rg().cancel(635);
    aw.Rg().cancel(637);
    AppMethodBeat.o(22541);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.label.ui.ContactLabelEditUI.3
 * JD-Core Version:    0.6.2
 */