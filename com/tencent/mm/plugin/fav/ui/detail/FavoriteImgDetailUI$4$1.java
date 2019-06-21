package com.tencent.mm.plugin.fav.ui.detail;

import android.graphics.Bitmap;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class FavoriteImgDetailUI$4$1
  implements Runnable
{
  FavoriteImgDetailUI$4$1(FavoriteImgDetailUI.4 param4, Bitmap paramBitmap)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(74382);
    FavoriteImgDetailUI.a(this.mmu.mmn, this.mmu.mms, this.mmt);
    AppMethodBeat.o(74382);
  }

  public final String toString()
  {
    AppMethodBeat.i(74383);
    String str = super.toString() + "|renderView";
    AppMethodBeat.o(74383);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.detail.FavoriteImgDetailUI.4.1
 * JD-Core Version:    0.6.2
 */