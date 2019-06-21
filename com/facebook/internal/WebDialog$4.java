package com.facebook.internal;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

class WebDialog$4
  implements View.OnTouchListener
{
  WebDialog$4(WebDialog paramWebDialog)
  {
  }

  public boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(96658);
    if (!paramView.hasFocus())
      paramView.requestFocus();
    AppMethodBeat.o(96658);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.facebook.internal.WebDialog.4
 * JD-Core Version:    0.6.2
 */