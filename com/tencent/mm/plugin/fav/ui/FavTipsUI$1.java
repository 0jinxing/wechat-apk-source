package com.tencent.mm.plugin.fav.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class FavTipsUI$1
  implements DialogInterface.OnClickListener
{
  FavTipsUI$1(FavTipsUI paramFavTipsUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(74165);
    this.mkb.finish();
    AppMethodBeat.o(74165);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.FavTipsUI.1
 * JD-Core Version:    0.6.2
 */