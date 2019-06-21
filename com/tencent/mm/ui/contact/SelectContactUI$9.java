package com.tencent.mm.ui.contact;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

final class SelectContactUI$9
  implements DialogInterface.OnClickListener
{
  SelectContactUI$9(SelectContactUI paramSelectContactUI, LinkedList paramLinkedList)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(33857);
    SelectContactUI.a(this.zoP, this.zoU);
    AppMethodBeat.o(33857);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.SelectContactUI.9
 * JD-Core Version:    0.6.2
 */