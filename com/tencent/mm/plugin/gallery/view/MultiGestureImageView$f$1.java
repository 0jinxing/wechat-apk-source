package com.tencent.mm.plugin.gallery.view;

import android.graphics.Matrix;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.MultiTouchImageView;

final class MultiGestureImageView$f$1
  implements Runnable
{
  MultiGestureImageView$f$1(MultiGestureImageView.f paramf)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(21624);
    this.mSH.mSF.getImageMatrix().getValues(this.mSH.v);
    float f1 = this.mSH.mSF.getScale() * this.mSH.mSF.getImageWidth();
    float f2 = this.mSH.mSF.getScale();
    float f3 = this.mSH.mSF.getImageHeight() * f2;
    float f4 = this.mSH.v[2];
    float f5 = this.mSH.v[5];
    float f6 = this.mSH.v[2];
    float f7 = this.mSH.v[5];
    float f8 = 0.0F;
    f2 = MultiGestureImageView.i(this.mSH.mSE);
    float f9 = 0.0F;
    float f10 = MultiGestureImageView.g(this.mSH.mSE);
    if (f3 < MultiGestureImageView.i(this.mSH.mSE))
    {
      f8 = MultiGestureImageView.i(this.mSH.mSE) / 2.0F - f3 / 2.0F;
      f2 = MultiGestureImageView.i(this.mSH.mSE) / 2.0F + f3 / 2.0F;
    }
    while (true)
    {
      f8 -= f5;
      f2 -= f7 + f3;
      if (f8 < 0.0F)
        f2 = f8;
      while (true)
      {
        if (f1 < MultiGestureImageView.g(this.mSH.mSE))
        {
          f10 = MultiGestureImageView.g(this.mSH.mSE) / 2.0F;
          f9 = f1 / 2.0F;
          f8 = MultiGestureImageView.g(this.mSH.mSE) / 2.0F + f1 / 2.0F;
          f9 = f10 - f9;
        }
        while (true)
        {
          f9 -= f4;
          f8 -= f6 + f1;
          if (f9 < 0.0F)
            f8 = f9;
          while (true)
          {
            label315: if ((Math.abs(f8) <= 5.0F) && (Math.abs(f2) <= 5.0F))
              this.mSH.cco = true;
            while (true)
            {
              this.mSH.mSF.aj(f8, f2);
              AppMethodBeat.o(21624);
              return;
              if (f2 <= 0.0F)
                break label530;
              break;
              if (f8 <= 0.0F)
                break label517;
              break label315;
              if (f8 >= 0.0F);
              for (f8 = (float)(Math.abs(f8) - Math.pow(Math.sqrt(Math.abs(f8)) - 1.0D, 2.0D)) * 2.0F; ; f8 = -(float)(Math.abs(f8) - Math.pow(Math.sqrt(Math.abs(f8)) - 1.0D, 2.0D)) * 2.0F)
              {
                if (f2 < 0.0F)
                  break label487;
                f2 = (float)(Math.abs(f2) - Math.pow(Math.sqrt(Math.abs(f2)) - 1.0D, 2.0D)) * 2.0F;
                break;
              }
              label487: f2 = -(float)(Math.abs(f2) - Math.pow(Math.sqrt(Math.abs(f2)) - 1.0D, 2.0D)) * 2.0F;
            }
            label517: f8 = 0.0F;
          }
          f8 = f10;
        }
        label530: f2 = 0.0F;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.gallery.view.MultiGestureImageView.f.1
 * JD-Core Version:    0.6.2
 */