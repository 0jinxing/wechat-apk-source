package com.tencent.mm.plugin.account.bind.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class BindMobileUI$1
  implements DialogInterface.OnClickListener
{
  BindMobileUI$1(BindMobileUI paramBindMobileUI, String paramString)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(13509);
    BindMobileUI.a(this.gsp, this.gso);
    AppMethodBeat.o(13509);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.bind.ui.BindMobileUI.1
 * JD-Core Version:    0.6.2
 */