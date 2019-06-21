package com.tencent.mm.plugin.fav.ui.detail;

import android.app.Dialog;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.widget.snackbar.b;

final class FavoriteImgDetailUI$10
  implements Runnable
{
  FavoriteImgDetailUI$10(FavoriteImgDetailUI paramFavoriteImgDetailUI, Dialog paramDialog)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(74390);
    this.mhZ.dismiss();
    b.i(this.mmn, this.mmn.getString(2131299583));
    AppMethodBeat.o(74390);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.detail.FavoriteImgDetailUI.10
 * JD-Core Version:    0.6.2
 */