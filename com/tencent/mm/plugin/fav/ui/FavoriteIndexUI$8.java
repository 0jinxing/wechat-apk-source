package com.tencent.mm.plugin.fav.ui;

import android.app.Dialog;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.widget.snackbar.b;

final class FavoriteIndexUI$8
  implements Runnable
{
  FavoriteIndexUI$8(FavoriteIndexUI paramFavoriteIndexUI, Dialog paramDialog)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(74234);
    this.mhZ.dismiss();
    b.i(this.mkH, this.mkH.getString(2131299583));
    AppMethodBeat.o(74234);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.FavoriteIndexUI.8
 * JD-Core Version:    0.6.2
 */