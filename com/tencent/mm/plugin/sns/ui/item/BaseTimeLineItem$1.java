package com.tencent.mm.plugin.sns.ui.item;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class BaseTimeLineItem$1
  implements View.OnTouchListener
{
  BaseTimeLineItem$1(BaseTimeLineItem paramBaseTimeLineItem)
  {
  }

  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(40115);
    if (paramMotionEvent.getAction() == 0)
      paramView.setTag(2131820679, new int[] { (int)paramMotionEvent.getRawX(), (int)paramMotionEvent.getRawY() });
    AppMethodBeat.o(40115);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.1
 * JD-Core Version:    0.6.2
 */