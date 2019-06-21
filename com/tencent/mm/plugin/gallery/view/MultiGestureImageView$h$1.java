package com.tencent.mm.plugin.gallery.view;

import android.graphics.Matrix;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.MultiTouchImageView;

final class MultiGestureImageView$h$1
  implements Runnable
{
  MultiGestureImageView$h$1(MultiGestureImageView.h paramh)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(21630);
    this.mSJ.mSF.getImageMatrix().getValues(this.mSJ.v);
    float f1 = this.mSJ.mSF.getScale();
    float f2 = this.mSJ.mSF.getImageWidth() * f1;
    float f3 = this.mSJ.v[2];
    f1 = MultiGestureImageView.g(this.mSJ.mSE);
    if (f2 < MultiGestureImageView.g(this.mSJ.mSE))
      f1 = MultiGestureImageView.g(this.mSJ.mSE) / 2.0F + f2 / 2.0F;
    f1 -= f3 + f2;
    if (f1 <= 0.0F)
      this.mSJ.cco = true;
    while (true)
    {
      this.mSJ.mSF.aj(f1, 0.0F);
      AppMethodBeat.o(21630);
      return;
      if (Math.abs(f1) <= 5.0F)
        this.mSJ.cco = true;
      else
        f1 = (float)(Math.abs(f1) - Math.pow(Math.sqrt(Math.abs(f1)) - 1.0D, 2.0D)) * 2.0F;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.gallery.view.MultiGestureImageView.h.1
 * JD-Core Version:    0.6.2
 */