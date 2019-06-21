package com.tencent.mm.ui.contact;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class SelectContactUI$15$1
  implements DialogInterface.OnClickListener
{
  SelectContactUI$15$1(SelectContactUI.15 param15)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(33862);
    paramDialogInterface = new Intent();
    paramDialogInterface.putExtra("Select_Contact", this.zoY.zoX);
    paramDialogInterface.putExtra("App_MsgId", "fromSns");
    this.zoY.zoP.setResult(-1, paramDialogInterface);
    this.zoY.zoP.finish();
    AppMethodBeat.o(33862);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.SelectContactUI.15.1
 * JD-Core Version:    0.6.2
 */