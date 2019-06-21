package com.tencent.mm.plugin.fav.ui.detail;

import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class FavoriteFileDetailUI$8
  implements Runnable
{
  FavoriteFileDetailUI$8(FavoriteFileDetailUI paramFavoriteFileDetailUI, float paramFloat, String paramString)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(74330);
    FavoriteFileDetailUI.t(this.mlX).setProgress((int)this.mma);
    FavoriteFileDetailUI.u(this.mlX).setText(this.val$tips);
    AppMethodBeat.o(74330);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.detail.FavoriteFileDetailUI.8
 * JD-Core Version:    0.6.2
 */