package com.tencent.mm.plugin.game.ui;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.ListView;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class GameSearchUI$4
  implements View.OnTouchListener
{
  GameSearchUI$4(GameSearchUI paramGameSearchUI)
  {
  }

  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(112191);
    GameSearchUI.e(this.nmW).clearFocus();
    this.nmW.aqX();
    AppMethodBeat.o(112191);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.ui.GameSearchUI.4
 * JD-Core Version:    0.6.2
 */