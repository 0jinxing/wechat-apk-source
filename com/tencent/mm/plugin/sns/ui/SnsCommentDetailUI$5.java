package com.tencent.mm.plugin.sns.ui;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class SnsCommentDetailUI$5
  implements View.OnTouchListener
{
  SnsCommentDetailUI$5(SnsCommentDetailUI paramSnsCommentDetailUI)
  {
  }

  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(38780);
    if (SnsCommentDetailUI.q(this.rqN) != null)
      SnsCommentDetailUI.q(this.rqN).cox();
    AppMethodBeat.o(38780);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.5
 * JD-Core Version:    0.6.2
 */