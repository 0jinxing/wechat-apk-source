package com.tencent.mm.plugin.sns.ui;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class SnsMsgUI$17
  implements View.OnTouchListener
{
  SnsMsgUI$17(SnsMsgUI paramSnsMsgUI)
  {
  }

  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(39083);
    switch (paramMotionEvent.getAction())
    {
    default:
    case 0:
    }
    while (true)
    {
      AppMethodBeat.o(39083);
      return false;
      this.rub.aqX();
      SnsMsgUI.j(this.rub)[0] = ((int)paramMotionEvent.getRawX());
      SnsMsgUI.j(this.rub)[1] = ((int)paramMotionEvent.getRawY());
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsMsgUI.17
 * JD-Core Version:    0.6.2
 */