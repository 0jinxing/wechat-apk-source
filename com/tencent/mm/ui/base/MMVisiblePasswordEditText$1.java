package com.tencent.mm.ui.base;

import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class MMVisiblePasswordEditText$1
  implements View.OnTouchListener
{
  MMVisiblePasswordEditText$1(MMVisiblePasswordEditText paramMMVisiblePasswordEditText)
  {
  }

  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    boolean bool = true;
    AppMethodBeat.i(106954);
    paramView = this.yyP;
    if (paramView.getCompoundDrawables()[2] == null)
      AppMethodBeat.o(106954);
    while (true)
    {
      return false;
      if (paramMotionEvent.getAction() == 1)
        break;
      AppMethodBeat.o(106954);
    }
    if (paramMotionEvent.getX() > paramView.getWidth() - paramView.getPaddingRight() - this.yyP.yyM.getIntrinsicWidth())
    {
      paramView = this.yyP;
      if (MMVisiblePasswordEditText.a(this.yyP))
        break label109;
    }
    while (true)
    {
      MMVisiblePasswordEditText.a(paramView, bool);
      MMVisiblePasswordEditText.b(this.yyP);
      AppMethodBeat.o(106954);
      break;
      label109: bool = false;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.MMVisiblePasswordEditText.1
 * JD-Core Version:    0.6.2
 */