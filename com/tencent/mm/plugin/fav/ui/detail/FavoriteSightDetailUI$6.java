package com.tencent.mm.plugin.fav.ui.detail;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.widget.MMPinProgressBtn;

final class FavoriteSightDetailUI$6
  implements Runnable
{
  FavoriteSightDetailUI$6(FavoriteSightDetailUI paramFavoriteSightDetailUI, int paramInt)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(74421);
    FavoriteSightDetailUI.c(this.mmH).setProgress(this.gOm);
    AppMethodBeat.o(74421);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.detail.FavoriteSightDetailUI.6
 * JD-Core Version:    0.6.2
 */