package com.tencent.mm.ui.tools;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ak;

final class PressImageView$2
  implements View.OnTouchListener
{
  PressImageView$2(PressImageView paramPressImageView)
  {
  }

  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    boolean bool = true;
    AppMethodBeat.i(107747);
    switch (paramMotionEvent.getAction())
    {
    case 2:
    default:
      if ((!this.zGI.isClickable()) && (!this.zGI.isLongClickable()))
        AppMethodBeat.o(107747);
      break;
    case 0:
    case 1:
    case 3:
    }
    while (true)
    {
      return bool;
      paramView.setPressed(true);
      paramView.invalidate();
      PressImageView.b(this.zGI).removeCallbacks(PressImageView.a(this.zGI));
      break;
      PressImageView.b(this.zGI).post(PressImageView.a(this.zGI));
      break;
      bool = false;
      AppMethodBeat.o(107747);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.PressImageView.2
 * JD-Core Version:    0.6.2
 */