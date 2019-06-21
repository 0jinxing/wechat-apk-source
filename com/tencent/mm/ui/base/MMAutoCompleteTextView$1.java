package com.tencent.mm.ui.base;

import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class MMAutoCompleteTextView$1
  implements View.OnTouchListener
{
  MMAutoCompleteTextView$1(MMAutoCompleteTextView paramMMAutoCompleteTextView)
  {
  }

  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(106472);
    paramView = this.ytF;
    if (paramView.getCompoundDrawables()[2] == null)
      AppMethodBeat.o(106472);
    while (true)
    {
      return false;
      if (paramMotionEvent.getAction() != 1)
      {
        AppMethodBeat.o(106472);
      }
      else
      {
        if (paramMotionEvent.getX() > paramView.getWidth() - paramView.getPaddingRight() - this.ytF.vhR.getIntrinsicWidth())
        {
          paramView.setText("");
          MMAutoCompleteTextView.a(this.ytF);
        }
        AppMethodBeat.o(106472);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.MMAutoCompleteTextView.1
 * JD-Core Version:    0.6.2
 */