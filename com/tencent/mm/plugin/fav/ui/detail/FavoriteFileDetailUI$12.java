package com.tencent.mm.plugin.fav.ui.detail;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fav.a.b;

final class FavoriteFileDetailUI$12
  implements View.OnClickListener
{
  FavoriteFileDetailUI$12(FavoriteFileDetailUI paramFavoriteFileDetailUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(74334);
    paramView = b.b(FavoriteFileDetailUI.a(this.mlX));
    if (4 == FavoriteFileDetailUI.c(this.mlX))
    {
      FavoriteFileDetailUI.d(this.mlX);
      FavoriteFileDetailUI.e(this.mlX);
      AppMethodBeat.o(74334);
    }
    while (true)
    {
      return;
      FavoriteFileDetailUI.a(this.mlX, paramView);
      AppMethodBeat.o(74334);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.detail.FavoriteFileDetailUI.12
 * JD-Core Version:    0.6.2
 */