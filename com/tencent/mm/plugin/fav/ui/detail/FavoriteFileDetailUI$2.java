package com.tencent.mm.plugin.fav.ui.detail;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class FavoriteFileDetailUI$2
  implements View.OnTouchListener
{
  FavoriteFileDetailUI$2(FavoriteFileDetailUI paramFavoriteFileDetailUI)
  {
  }

  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(74322);
    switch (paramMotionEvent.getAction())
    {
    default:
    case 0:
    }
    while (true)
    {
      AppMethodBeat.o(74322);
      return false;
      FavoriteFileDetailUI.a(this.mlX, (int)paramMotionEvent.getRawX());
      FavoriteFileDetailUI.b(this.mlX, (int)paramMotionEvent.getRawY());
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.detail.FavoriteFileDetailUI.2
 * JD-Core Version:    0.6.2
 */