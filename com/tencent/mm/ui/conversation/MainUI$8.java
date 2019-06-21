package com.tencent.mm.ui.conversation;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class MainUI$8
  implements View.OnTouchListener
{
  MainUI$8(MainUI paramMainUI)
  {
  }

  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(34501);
    switch (paramMotionEvent.getAction())
    {
    default:
    case 0:
    }
    while (true)
    {
      AppMethodBeat.o(34501);
      return false;
      this.zvg.hideVKB();
      MainUI.f(this.zvg)[0] = ((int)paramMotionEvent.getRawX());
      MainUI.f(this.zvg)[1] = ((int)paramMotionEvent.getRawY());
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.conversation.MainUI.8
 * JD-Core Version:    0.6.2
 */