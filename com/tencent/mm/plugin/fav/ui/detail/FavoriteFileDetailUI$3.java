package com.tencent.mm.plugin.fav.ui.detail;

import android.view.View;
import android.view.View.OnLongClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import com.tencent.mm.ui.widget.b.a;

final class FavoriteFileDetailUI$3
  implements View.OnLongClickListener
{
  FavoriteFileDetailUI$3(FavoriteFileDetailUI paramFavoriteFileDetailUI)
  {
  }

  public final boolean onLongClick(View paramView)
  {
    AppMethodBeat.i(74323);
    ab.d("MicroMsg.FavoriteFileDetailUI", "onLongClick");
    if (FavoriteFileDetailUI.l(this.mlX) == null)
      FavoriteFileDetailUI.a(this.mlX, new a(this.mlX.mController.ylL));
    FavoriteFileDetailUI.l(this.mlX).a(paramView, this.mlX, FavoriteFileDetailUI.m(this.mlX), FavoriteFileDetailUI.n(this.mlX), FavoriteFileDetailUI.o(this.mlX));
    AppMethodBeat.o(74323);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.detail.FavoriteFileDetailUI.3
 * JD-Core Version:    0.6.2
 */