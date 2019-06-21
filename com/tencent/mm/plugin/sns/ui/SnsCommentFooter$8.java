package com.tencent.mm.plugin.sns.ui;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.ImageButton;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class SnsCommentFooter$8
  implements View.OnTouchListener
{
  SnsCommentFooter$8(SnsCommentFooter paramSnsCommentFooter)
  {
  }

  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(38886);
    SnsCommentFooter.l(this.rrD);
    SnsCommentFooter.m(this.rrD);
    SnsCommentFooter.k(this.rrD).setImageResource(2130838298);
    if (SnsCommentFooter.n(this.rrD) != null)
      SnsCommentFooter.n(this.rrD).ctc();
    SnsCommentFooter.a(this.rrD, 0);
    AppMethodBeat.o(38886);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsCommentFooter.8
 * JD-Core Version:    0.6.2
 */