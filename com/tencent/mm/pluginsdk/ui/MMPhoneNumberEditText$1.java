package com.tencent.mm.pluginsdk.ui;

import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class MMPhoneNumberEditText$1
  implements View.OnTouchListener
{
  MMPhoneNumberEditText$1(MMPhoneNumberEditText paramMMPhoneNumberEditText)
  {
  }

  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(27491);
    paramView = this.vhV;
    if (paramView.getCompoundDrawables()[2] == null)
    {
      AppMethodBeat.o(27491);
      return false;
    }
    if ((paramMotionEvent.getAction() == 1) && (paramMotionEvent.getX() > paramView.getWidth() - paramView.getPaddingRight() - this.vhV.vhR.getIntrinsicWidth()))
    {
      if (!paramView.isFocused())
        break label91;
      paramView.setText("");
      MMPhoneNumberEditText.a(paramView);
    }
    while (true)
    {
      AppMethodBeat.o(27491);
      break;
      label91: if (MMPhoneNumberEditText.b(this.vhV) != null)
        MMPhoneNumberEditText.b(this.vhV).f(paramView);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.MMPhoneNumberEditText.1
 * JD-Core Version:    0.6.2
 */