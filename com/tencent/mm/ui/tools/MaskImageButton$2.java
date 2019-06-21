package com.tencent.mm.ui.tools;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ak;

final class MaskImageButton$2
  implements View.OnTouchListener
{
  MaskImageButton$2(MaskImageButton paramMaskImageButton)
  {
  }

  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    boolean bool = true;
    AppMethodBeat.i(107742);
    switch (paramMotionEvent.getAction())
    {
    case 2:
    default:
      if ((!this.zGl.isClickable()) && (!this.zGl.isLongClickable()))
        AppMethodBeat.o(107742);
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
      MaskImageButton.b(this.zGl).removeCallbacks(MaskImageButton.a(this.zGl));
      break;
      MaskImageButton.b(this.zGl).post(MaskImageButton.a(this.zGl));
      break;
      bool = false;
      AppMethodBeat.o(107742);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.MaskImageButton.2
 * JD-Core Version:    0.6.2
 */