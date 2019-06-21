package com.tencent.mm.ui.base;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.tools.f;

final class MMTagPanel$7
  implements View.OnTouchListener
{
  MMTagPanel$7(MMTagPanel paramMMTagPanel, MMTagPanel.c paramc)
  {
  }

  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(106816);
    if (MMTagPanel.g(this.yxC))
    {
      paramMotionEvent = this.yxC.getEditText();
      if (!bo.isNullOrNil(paramMotionEvent))
      {
        paramView = paramMotionEvent;
        if (this.yxD != null)
        {
          paramView = paramMotionEvent;
          if (f.asg(paramMotionEvent) > this.yxD.yxI)
          {
            int i = this.yxD.yxI - f.asi(paramMotionEvent);
            paramView = paramMotionEvent;
            if (i <= paramMotionEvent.length())
              paramView = paramMotionEvent.substring(0, i);
          }
        }
        this.yxC.cc(paramView, true);
        if (MMTagPanel.e(this.yxC) != null)
          MMTagPanel.e(this.yxC).JV(paramView);
        this.yxC.dAb();
      }
    }
    AppMethodBeat.o(106816);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.MMTagPanel.7
 * JD-Core Version:    0.6.2
 */