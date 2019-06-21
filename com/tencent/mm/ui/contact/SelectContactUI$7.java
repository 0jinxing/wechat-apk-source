package com.tencent.mm.ui.contact;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.roomsdk.a.c.a;

final class SelectContactUI$7
  implements DialogInterface.OnCancelListener
{
  SelectContactUI$7(SelectContactUI paramSelectContactUI, a parama)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(33856);
    SelectContactUI.d(this.zoP, false);
    this.zoT.cancel();
    AppMethodBeat.o(33856);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.SelectContactUI.7
 * JD-Core Version:    0.6.2
 */