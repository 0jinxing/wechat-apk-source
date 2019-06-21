package com.tencent.mm.plugin.account.bind.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.storage.z;

final class BindGoogleContactUI$5
  implements DialogInterface.OnClickListener
{
  BindGoogleContactUI$5(BindGoogleContactUI paramBindGoogleContactUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(13352);
    g.RP().Ry().set(208905, Boolean.TRUE);
    this.gqC.finish();
    AppMethodBeat.o(13352);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.bind.ui.BindGoogleContactUI.5
 * JD-Core Version:    0.6.2
 */