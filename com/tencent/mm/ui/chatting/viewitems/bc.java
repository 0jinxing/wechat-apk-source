package com.tencent.mm.ui.chatting.viewitems;

import android.text.Layout;
import android.text.Selection;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.view.MotionEvent;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.a.a;

final class bc extends LinkMovementMethod
{
  private a ziJ;

  private static a a(TextView paramTextView, Spannable paramSpannable, MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(33453);
    int i = (int)paramMotionEvent.getX();
    int j = (int)paramMotionEvent.getY();
    int k = paramTextView.getTotalPaddingLeft();
    int m = paramTextView.getTotalPaddingTop();
    int n = paramTextView.getScrollX();
    int i1 = paramTextView.getScrollY();
    paramTextView = paramTextView.getLayout();
    i = paramTextView.getOffsetForHorizontal(paramTextView.getLineForVertical(j - m + i1), i - k + n);
    paramTextView = (a[])paramSpannable.getSpans(i, i, a.class);
    if (paramTextView.length > 0);
    for (paramTextView = paramTextView[0]; ; paramTextView = null)
    {
      AppMethodBeat.o(33453);
      return paramTextView;
    }
  }

  public final boolean onTouchEvent(TextView paramTextView, Spannable paramSpannable, MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(33452);
    if (paramMotionEvent.getAction() == 0)
    {
      this.ziJ = a(paramTextView, paramSpannable, paramMotionEvent);
      if (this.ziJ != null)
      {
        this.ziJ.oT(true);
        Selection.setSelection(paramSpannable, paramSpannable.getSpanStart(this.ziJ), paramSpannable.getSpanEnd(this.ziJ));
      }
    }
    while (true)
    {
      AppMethodBeat.o(33452);
      return true;
      if (paramMotionEvent.getAction() == 2)
      {
        paramTextView = a(paramTextView, paramSpannable, paramMotionEvent);
        if ((this.ziJ != null) && (paramTextView != this.ziJ))
        {
          this.ziJ.oT(false);
          this.ziJ = null;
          Selection.removeSelection(paramSpannable);
        }
      }
      else
      {
        if (this.ziJ != null)
        {
          this.ziJ.oT(false);
          super.onTouchEvent(paramTextView, paramSpannable, paramMotionEvent);
        }
        this.ziJ = null;
        Selection.removeSelection(paramSpannable);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.viewitems.bc
 * JD-Core Version:    0.6.2
 */