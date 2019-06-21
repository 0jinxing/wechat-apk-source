package com.tencent.mm.plugin.sns.ui;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class MaskImageView$2
  implements View.OnTouchListener
{
  MaskImageView$2(MaskImageView paramMaskImageView)
  {
  }

  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(38308);
    boolean bool;
    if (!MaskImageView.a(this.rks))
    {
      bool = false;
      AppMethodBeat.o(38308);
    }
    while (true)
    {
      return bool;
      bool = this.rks.d(paramView, paramMotionEvent);
      AppMethodBeat.o(38308);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.MaskImageView.2
 * JD-Core Version:    0.6.2
 */