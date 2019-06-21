package com.tencent.mm.ui.contact;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.List;

final class SelectContactUI$17
  implements DialogInterface.OnClickListener
{
  SelectContactUI$17(SelectContactUI paramSelectContactUI, List paramList)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(33865);
    SelectContactUI.b(this.zoP, SelectContactUI.a(this.zoP, this.hhK));
    AppMethodBeat.o(33865);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.SelectContactUI.17
 * JD-Core Version:    0.6.2
 */