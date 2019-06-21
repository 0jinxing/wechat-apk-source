package com.tencent.mm.plugin.fav.ui;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fav.ui.widget.FavTagPanel;

final class FavTagEditUI$2
  implements View.OnTouchListener
{
  FavTagEditUI$2(FavTagEditUI paramFavTagEditUI)
  {
  }

  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(74138);
    FavTagEditUI.d(this.mjZ).dAd();
    AppMethodBeat.o(74138);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.FavTagEditUI.2
 * JD-Core Version:    0.6.2
 */