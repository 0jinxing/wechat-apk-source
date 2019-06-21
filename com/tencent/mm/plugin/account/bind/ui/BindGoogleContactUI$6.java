package com.tencent.mm.plugin.account.bind.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.account.friend.a.w;

final class BindGoogleContactUI$6
  implements DialogInterface.OnClickListener
{
  BindGoogleContactUI$6(BindGoogleContactUI paramBindGoogleContactUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(13353);
    BindGoogleContactUI.a(this.gqC, w.gvM);
    AppMethodBeat.o(13353);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.bind.ui.BindGoogleContactUI.6
 * JD-Core Version:    0.6.2
 */