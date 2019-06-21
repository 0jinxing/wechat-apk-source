package com.tencent.mm.plugin.fav.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class FavTipsUI$2
  implements DialogInterface.OnCancelListener
{
  FavTipsUI$2(FavTipsUI paramFavTipsUI)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(74166);
    this.mkb.finish();
    AppMethodBeat.o(74166);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.FavTipsUI.2
 * JD-Core Version:    0.6.2
 */