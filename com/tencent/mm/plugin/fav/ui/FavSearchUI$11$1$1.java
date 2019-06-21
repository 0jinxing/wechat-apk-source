package com.tencent.mm.plugin.fav.ui;

import android.app.Dialog;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.ui.widget.snackbar.b;

final class FavSearchUI$11$1$1
  implements Runnable
{
  FavSearchUI$11$1$1(FavSearchUI.11.1 param1, Dialog paramDialog)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(74080);
    if (this.mhZ != null)
      this.mhZ.dismiss();
    b.i(this.mjv.mju.mjo, this.mjv.mju.mjo.getString(2131299583));
    al.n(new FavSearchUI.11.1.1.1(this), 1800L);
    AppMethodBeat.o(74080);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.FavSearchUI.11.1.1
 * JD-Core Version:    0.6.2
 */