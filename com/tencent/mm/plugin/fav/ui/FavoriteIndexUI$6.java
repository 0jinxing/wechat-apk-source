package com.tencent.mm.plugin.fav.ui;

import android.app.Dialog;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fav.a.b;
import com.tencent.mm.sdk.platformtools.al;
import java.util.List;

final class FavoriteIndexUI$6
  implements Runnable
{
  FavoriteIndexUI$6(FavoriteIndexUI paramFavoriteIndexUI, List paramList, Dialog paramDialog)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(74230);
    b.bJ(this.mhY);
    al.d(new FavoriteIndexUI.6.1(this));
    AppMethodBeat.o(74230);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.FavoriteIndexUI.6
 * JD-Core Version:    0.6.2
 */