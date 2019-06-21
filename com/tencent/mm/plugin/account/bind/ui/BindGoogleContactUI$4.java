package com.tencent.mm.plugin.account.bind.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.account.friend.a.w;

final class BindGoogleContactUI$4
  implements DialogInterface.OnClickListener
{
  BindGoogleContactUI$4(BindGoogleContactUI paramBindGoogleContactUI, String paramString)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(13351);
    BindGoogleContactUI.a(this.gqC, this.gqD, w.gvL);
    AppMethodBeat.o(13351);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.bind.ui.BindGoogleContactUI.4
 * JD-Core Version:    0.6.2
 */