package com.tencent.mm.ui.contact;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class SelectContactUI$4
  implements DialogInterface.OnClickListener
{
  SelectContactUI$4(SelectContactUI paramSelectContactUI, String paramString)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(33853);
    ab.i("MicroMsg.SelectContactUI", "return the result,and create new label");
    paramDialogInterface = new Intent();
    paramDialogInterface.putExtra("Select_Contact", this.zoS);
    paramDialogInterface.putExtra("Select_Conv_User", this.zoS);
    paramDialogInterface.putExtra("Select_Contact", this.zoS);
    paramDialogInterface.putExtra("Select_Contacts_To_Create_New_Label", this.zoS);
    this.zoP.setResult(-1, paramDialogInterface);
    this.zoP.finish();
    AppMethodBeat.o(33853);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.SelectContactUI.4
 * JD-Core Version:    0.6.2
 */