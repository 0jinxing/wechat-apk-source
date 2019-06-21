package com.tencent.mm.plugin.fav.ui;

import android.app.Dialog;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.al;
import java.util.List;

final class FavoriteIndexUI$7
  implements Runnable
{
  FavoriteIndexUI$7(FavoriteIndexUI paramFavoriteIndexUI, List paramList, String[] paramArrayOfString, Dialog paramDialog)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(74233);
    FavoriteIndexUI.a(this.mhY, this.mkK);
    al.d(new FavoriteIndexUI.7.1(this));
    AppMethodBeat.o(74233);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.FavoriteIndexUI.7
 * JD-Core Version:    0.6.2
 */