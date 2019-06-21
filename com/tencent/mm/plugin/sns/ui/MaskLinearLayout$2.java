package com.tencent.mm.plugin.sns.ui;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import java.util.Iterator;
import java.util.List;

final class MaskLinearLayout$2
  implements View.OnTouchListener
{
  MaskLinearLayout$2(MaskLinearLayout paramMaskLinearLayout)
  {
  }

  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(38315);
    ab.e("test", "touch: " + paramMotionEvent.getAction());
    if (!MaskLinearLayout.b(this.rkt))
      AppMethodBeat.o(38315);
    while (true)
    {
      return false;
      switch (paramMotionEvent.getAction())
      {
      case 2:
      default:
      case 0:
      case 1:
      case 3:
      }
      while (MaskLinearLayout.e(this.rkt) != null)
      {
        paramView = MaskLinearLayout.e(this.rkt).iterator();
        while (paramView.hasNext())
        {
          MaskImageView localMaskImageView = (MaskImageView)paramView.next();
          localMaskImageView.d(localMaskImageView, paramMotionEvent);
        }
        paramView.setPressed(true);
        MaskLinearLayout.a(this.rkt);
        paramView.invalidate();
        MaskLinearLayout.d(this.rkt).removeCallbacks(MaskLinearLayout.c(this.rkt));
        continue;
        MaskLinearLayout.d(this.rkt).post(MaskLinearLayout.c(this.rkt));
      }
      AppMethodBeat.o(38315);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.MaskLinearLayout.2
 * JD-Core Version:    0.6.2
 */