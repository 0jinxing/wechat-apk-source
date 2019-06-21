package com.tencent.mm.ui.contact;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class SelectContactUI$5
  implements DialogInterface.OnClickListener
{
  SelectContactUI$5(SelectContactUI paramSelectContactUI, String paramString)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(33854);
    ab.i("MicroMsg.SelectContactUI", "return the result");
    paramDialogInterface = new Intent();
    paramDialogInterface.putExtra("Select_Contact", this.zoS);
    paramDialogInterface.putExtra("Select_Conv_User", this.zoS);
    paramDialogInterface.putExtra("Select_Contact", this.zoS);
    this.zoP.setResult(-1, paramDialogInterface);
    this.zoP.finish();
    AppMethodBeat.o(33854);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.SelectContactUI.5
 * JD-Core Version:    0.6.2
 */