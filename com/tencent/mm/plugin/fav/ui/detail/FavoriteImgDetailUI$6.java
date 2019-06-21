package com.tencent.mm.plugin.fav.ui.detail;

import android.view.View;
import android.view.View.OnLongClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.aar;
import java.util.HashMap;

final class FavoriteImgDetailUI$6
  implements View.OnLongClickListener
{
  FavoriteImgDetailUI$6(FavoriteImgDetailUI paramFavoriteImgDetailUI)
  {
  }

  public final boolean onLongClick(View paramView)
  {
    AppMethodBeat.i(74386);
    paramView = (aar)paramView.getTag();
    paramView = (FavoriteImgDetailUI.a)FavoriteImgDetailUI.c(this.mmn).get(paramView.mnd);
    FavoriteImgDetailUI.a(this.mmn, paramView);
    if (!paramView.mmv)
      FavoriteImgDetailUI.b(paramView);
    AppMethodBeat.o(74386);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.detail.FavoriteImgDetailUI.6
 * JD-Core Version:    0.6.2
 */