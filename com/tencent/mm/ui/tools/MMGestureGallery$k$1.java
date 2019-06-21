package com.tencent.mm.ui.tools;

import android.graphics.Matrix;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.MultiTouchImageView;

final class MMGestureGallery$k$1
  implements Runnable
{
  MMGestureGallery$k$1(MMGestureGallery.k paramk)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(107674);
    MMGestureGallery.a(this.zFP.zFK).getImageMatrix().getValues(this.zFP.v);
    float f1 = this.zFP.v[5];
    float f2 = MMGestureGallery.a(this.zFP.zFK).getScale() * MMGestureGallery.a(this.zFP.zFK).getImageHeight();
    if (f2 < MMGestureGallery.d(this.zFP.zFK));
    for (f2 = MMGestureGallery.d(this.zFP.zFK) / 2.0F - f2 / 2.0F; ; f2 = 0.0F)
    {
      f2 -= f1;
      if (f2 >= 0.0F)
        this.zFP.cco = true;
      while (true)
      {
        MMGestureGallery.a(this.zFP.zFK).aj(0.0F, f2);
        AppMethodBeat.o(107674);
        return;
        if (Math.abs(f2) <= 5.0F)
          this.zFP.cco = true;
        else
          f2 = -(float)(Math.abs(f2) - Math.pow(Math.sqrt(Math.abs(f2)) - 1.0D, 2.0D)) * 2.0F;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.MMGestureGallery.k.1
 * JD-Core Version:    0.6.2
 */