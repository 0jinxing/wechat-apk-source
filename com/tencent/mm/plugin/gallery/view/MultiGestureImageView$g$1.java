package com.tencent.mm.plugin.gallery.view;

import android.graphics.Matrix;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.MultiTouchImageView;

final class MultiGestureImageView$g$1
  implements Runnable
{
  MultiGestureImageView$g$1(MultiGestureImageView.g paramg)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(21627);
    this.mSI.mSF.getImageMatrix().getValues(this.mSI.v);
    float f1 = this.mSI.v[2];
    float f2 = this.mSI.mSF.getScale() * this.mSI.mSF.getImageWidth();
    if (f2 < MultiGestureImageView.g(this.mSI.mSE));
    for (f2 = MultiGestureImageView.g(this.mSI.mSE) / 2.0F - f2 / 2.0F; ; f2 = 0.0F)
    {
      f2 -= f1;
      if (f2 >= 0.0F)
        this.mSI.cco = true;
      while (true)
      {
        this.mSI.mSF.aj(f2, 0.0F);
        AppMethodBeat.o(21627);
        return;
        if (Math.abs(f2) <= 5.0F)
          this.mSI.cco = true;
        else
          f2 = -(float)(Math.abs(f2) - Math.pow(Math.sqrt(Math.abs(f2)) - 1.0D, 2.0D)) * 2.0F;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.gallery.view.MultiGestureImageView.g.1
 * JD-Core Version:    0.6.2
 */