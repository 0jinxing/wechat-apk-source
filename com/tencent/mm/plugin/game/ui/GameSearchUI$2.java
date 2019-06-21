package com.tencent.mm.plugin.game.ui;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.ListView;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class GameSearchUI$2
  implements View.OnTouchListener
{
  GameSearchUI$2(GameSearchUI paramGameSearchUI)
  {
  }

  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(112189);
    GameSearchUI.a(this.nmW).clearFocus();
    this.nmW.aqX();
    AppMethodBeat.o(112189);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.ui.GameSearchUI.2
 * JD-Core Version:    0.6.2
 */