package com.tencent.mm.plugin.fav.ui;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class FavoriteIndexUI$12
  implements View.OnTouchListener
{
  FavoriteIndexUI$12(FavoriteIndexUI paramFavoriteIndexUI)
  {
  }

  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(74238);
    switch (paramMotionEvent.getAction())
    {
    default:
    case 0:
    }
    while (true)
    {
      AppMethodBeat.o(74238);
      return false;
      FavoriteIndexUI.c(this.mkH)[0] = ((int)paramMotionEvent.getRawX());
      FavoriteIndexUI.c(this.mkH)[1] = ((int)paramMotionEvent.getRawY());
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.FavoriteIndexUI.12
 * JD-Core Version:    0.6.2
 */