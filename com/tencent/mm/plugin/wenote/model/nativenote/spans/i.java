package com.tencent.mm.plugin.wenote.model.nativenote.spans;

import android.text.Layout;
import android.text.Spannable;
import android.text.method.ArrowKeyMovementMethod;
import android.view.MotionEvent;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wenote.model.nativenote.manager.b;

public final class i extends ArrowKeyMovementMethod
{
  private static i uRX;

  public static i dfD()
  {
    AppMethodBeat.i(26943);
    if (uRX == null)
      uRX = new i();
    i locali = uRX;
    AppMethodBeat.o(26943);
    return locali;
  }

  public final boolean onTouchEvent(TextView paramTextView, Spannable paramSpannable, MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(26944);
    int i = paramMotionEvent.getAction();
    if ((i == 1) || (i == 0))
    {
      int j = (int)paramMotionEvent.getX();
      int k = (int)paramMotionEvent.getY();
      int m = paramTextView.getTotalPaddingLeft();
      int n = paramTextView.getTotalPaddingTop();
      m = paramTextView.getScrollX() + (j - m);
      j = paramTextView.getScrollY();
      Object localObject = paramTextView.getLayout();
      n = ((Layout)localObject).getOffsetForHorizontal(((Layout)localObject).getLineForVertical(j + (k - n)), m);
      localObject = (k[])paramSpannable.getSpans(n, n + 1, k.class);
      if ((m < b.del()) && (localObject.length != 0))
      {
        if (i == 0)
          localObject[0].a(paramTextView, paramSpannable, paramMotionEvent, localObject[0]);
        AppMethodBeat.o(26944);
      }
    }
    while (true)
    {
      return false;
      AppMethodBeat.o(26944);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wenote.model.nativenote.spans.i
 * JD-Core Version:    0.6.2
 */