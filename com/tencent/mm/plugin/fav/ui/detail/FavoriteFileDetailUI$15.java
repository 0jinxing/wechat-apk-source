package com.tencent.mm.plugin.fav.ui.detail;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fav.a.b;
import com.tencent.mm.plugin.fav.a.g;

final class FavoriteFileDetailUI$15
  implements View.OnClickListener
{
  FavoriteFileDetailUI$15(FavoriteFileDetailUI paramFavoriteFileDetailUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(74337);
    if (FavoriteFileDetailUI.b(this.mlX).isDownloading())
    {
      b.d(FavoriteFileDetailUI.a(this.mlX));
      FavoriteFileDetailUI.h(this.mlX).setText(2131299658);
    }
    while (true)
    {
      FavoriteFileDetailUI.i(this.mlX);
      AppMethodBeat.o(74337);
      return;
      b.n(FavoriteFileDetailUI.b(this.mlX));
      FavoriteFileDetailUI.h(this.mlX).setText(2131299659);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.detail.FavoriteFileDetailUI.15
 * JD-Core Version:    0.6.2
 */