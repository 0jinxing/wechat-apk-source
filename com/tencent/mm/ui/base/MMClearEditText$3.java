package com.tencent.mm.ui.base;

import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class MMClearEditText$3
  implements View.OnTouchListener
{
  MMClearEditText$3(MMClearEditText paramMMClearEditText)
  {
  }

  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(106506);
    paramView = this.ytW;
    if (paramView.getCompoundDrawables()[2] == null)
      AppMethodBeat.o(106506);
    while (true)
    {
      return false;
      if (paramMotionEvent.getAction() != 1)
      {
        AppMethodBeat.o(106506);
      }
      else
      {
        if (paramMotionEvent.getX() > paramView.getWidth() - paramView.getPaddingRight() - this.ytW.vhR.getIntrinsicWidth())
        {
          paramView.setText("");
          MMClearEditText.c(this.ytW);
        }
        AppMethodBeat.o(106506);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.MMClearEditText.3
 * JD-Core Version:    0.6.2
 */