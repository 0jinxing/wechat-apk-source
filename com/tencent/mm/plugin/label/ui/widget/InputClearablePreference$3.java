package com.tencent.mm.plugin.label.ui.widget;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.widget.MMEditText;

final class InputClearablePreference$3
  implements View.OnTouchListener
{
  InputClearablePreference$3(InputClearablePreference paramInputClearablePreference)
  {
  }

  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(22705);
    if (InputClearablePreference.b(this.nJo) != null)
      InputClearablePreference.b(this.nJo).clearFocus();
    AppMethodBeat.o(22705);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.label.ui.widget.InputClearablePreference.3
 * JD-Core Version:    0.6.2
 */