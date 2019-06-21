package com.tencent.mm.plugin.gallery.view;

import android.graphics.Matrix;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.MultiTouchImageView;

final class MultiGestureImageView$e$1
  implements Runnable
{
  MultiGestureImageView$e$1(MultiGestureImageView.e parame)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(21621);
    this.mSG.mSF.getImageMatrix().getValues(this.mSG.v);
    float f1 = this.mSG.mSF.getScale();
    float f2 = this.mSG.mSF.getImageHeight() * f1;
    float f3 = this.mSG.v[5];
    f1 = MultiGestureImageView.i(this.mSG.mSE);
    if (f2 < MultiGestureImageView.i(this.mSG.mSE))
      f1 = MultiGestureImageView.i(this.mSG.mSE) / 2.0F + f2 / 2.0F;
    f1 -= f3 + f2;
    if (f1 <= 0.0F)
      this.mSG.cco = true;
    while (true)
    {
      this.mSG.mSF.aj(0.0F, f1);
      AppMethodBeat.o(21621);
      return;
      if (Math.abs(f1) <= 5.0F)
        this.mSG.cco = true;
      else
        f1 = (float)(Math.abs(f1) - Math.pow(Math.sqrt(Math.abs(f1)) - 1.0D, 2.0D)) * 2.0F;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.gallery.view.MultiGestureImageView.e.1
 * JD-Core Version:    0.6.2
 */