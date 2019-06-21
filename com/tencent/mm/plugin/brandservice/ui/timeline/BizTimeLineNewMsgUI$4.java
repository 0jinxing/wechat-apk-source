package com.tencent.mm.plugin.brandservice.ui.timeline;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class BizTimeLineNewMsgUI$4
  implements View.OnTouchListener
{
  BizTimeLineNewMsgUI$4(BizTimeLineNewMsgUI paramBizTimeLineNewMsgUI)
  {
  }

  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(14159);
    switch (paramMotionEvent.getAction())
    {
    default:
    case 0:
    }
    while (true)
    {
      AppMethodBeat.o(14159);
      return false;
      BizTimeLineNewMsgUI.a(this.jOc, (int)paramMotionEvent.getRawX());
      BizTimeLineNewMsgUI.b(this.jOc, (int)paramMotionEvent.getRawY());
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.timeline.BizTimeLineNewMsgUI.4
 * JD-Core Version:    0.6.2
 */