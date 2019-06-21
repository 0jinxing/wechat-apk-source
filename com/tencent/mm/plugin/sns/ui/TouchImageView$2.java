package com.tencent.mm.plugin.sns.ui;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ak;

final class TouchImageView$2
  implements View.OnTouchListener
{
  TouchImageView$2(TouchImageView paramTouchImageView)
  {
  }

  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    boolean bool = false;
    AppMethodBeat.i(39896);
    if (!TouchImageView.a(this.rDY))
      AppMethodBeat.o(39896);
    while (true)
    {
      return bool;
      TouchImageView localTouchImageView = this.rDY;
      switch (paramMotionEvent.getAction())
      {
      case 2:
      default:
      case 0:
      case 1:
      case 3:
      }
      while (true)
      {
        if ((localTouchImageView.isClickable()) || (localTouchImageView.isLongClickable()))
          break label132;
        AppMethodBeat.o(39896);
        bool = true;
        break;
        paramView.setPressed(true);
        paramView.invalidate();
        localTouchImageView.rgT.removeCallbacks(localTouchImageView.rgU);
        continue;
        localTouchImageView.rgT.post(localTouchImageView.rgU);
      }
      label132: AppMethodBeat.o(39896);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.TouchImageView.2
 * JD-Core Version:    0.6.2
 */