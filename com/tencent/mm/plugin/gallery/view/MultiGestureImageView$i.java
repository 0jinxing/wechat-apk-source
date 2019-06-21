package com.tencent.mm.plugin.gallery.view;

import android.graphics.Matrix;
import android.os.Handler;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.MultiTouchImageView;

final class MultiGestureImageView$i extends MultiGestureImageView.a
{
  MultiTouchImageView mSF;
  float[] v;

  public MultiGestureImageView$i(MultiGestureImageView paramMultiGestureImageView, MultiTouchImageView paramMultiTouchImageView)
  {
    super(paramMultiGestureImageView);
    AppMethodBeat.i(21634);
    this.v = new float[9];
    this.mSF = paramMultiTouchImageView;
    AppMethodBeat.o(21634);
  }

  public final void play()
  {
    AppMethodBeat.i(21635);
    MultiGestureImageView.h(this.mSE).getHandler().post(new Runnable()
    {
      public final void run()
      {
        AppMethodBeat.i(21633);
        MultiGestureImageView.i.this.mSF.getImageMatrix().getValues(MultiGestureImageView.i.this.v);
        float f1 = MultiGestureImageView.i.this.v[5];
        float f2 = MultiGestureImageView.i.this.mSF.getScale() * MultiGestureImageView.i.this.mSF.getImageHeight();
        if (f2 < MultiGestureImageView.i(MultiGestureImageView.i.this.mSE));
        for (f2 = MultiGestureImageView.i(MultiGestureImageView.i.this.mSE) / 2.0F - f2 / 2.0F; ; f2 = 0.0F)
        {
          f2 -= f1;
          if (f2 >= 0.0F)
            MultiGestureImageView.i.this.cco = true;
          while (true)
          {
            MultiGestureImageView.i.this.mSF.aj(0.0F, f2);
            AppMethodBeat.o(21633);
            return;
            if (Math.abs(f2) <= 5.0F)
              MultiGestureImageView.i.this.cco = true;
            else
              f2 = -(float)(Math.abs(f2) - Math.pow(Math.sqrt(Math.abs(f2)) - 1.0D, 2.0D)) * 2.0F;
          }
        }
      }
    });
    AppMethodBeat.o(21635);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.gallery.view.MultiGestureImageView.i
 * JD-Core Version:    0.6.2
 */