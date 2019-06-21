package com.tencent.mm.plugin.sns.ui.widget;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class SnsCommentCollapseLayout$1
  implements View.OnTouchListener
{
  SnsCommentCollapseLayout$1(SnsCommentCollapseLayout paramSnsCommentCollapseLayout)
  {
  }

  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(40479);
    if (paramMotionEvent.getAction() == 0)
      paramView.setTag(2131820679, new int[] { (int)paramMotionEvent.getRawX(), (int)paramMotionEvent.getRawY() });
    AppMethodBeat.o(40479);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.widget.SnsCommentCollapseLayout.1
 * JD-Core Version:    0.6.2
 */