package com.tencent.mm.ui.tools;

import android.graphics.Matrix;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.MultiTouchImageView;

final class MMGestureGallery$i$1
  implements Runnable
{
  MMGestureGallery$i$1(MMGestureGallery.i parami)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(107668);
    MMGestureGallery.a(this.zFN.zFK).getImageMatrix().getValues(this.zFN.v);
    float f1 = this.zFN.v[2];
    float f2 = MMGestureGallery.a(this.zFN.zFK).getScale() * MMGestureGallery.a(this.zFN.zFK).getImageWidth();
    if (f2 < MMGestureGallery.b(this.zFN.zFK));
    for (f2 = MMGestureGallery.b(this.zFN.zFK) / 2.0F - f2 / 2.0F; ; f2 = 0.0F)
    {
      f2 -= f1;
      if (f2 >= 0.0F)
        this.zFN.cco = true;
      while (true)
      {
        MMGestureGallery.a(this.zFN.zFK).aj(f2, 0.0F);
        AppMethodBeat.o(107668);
        return;
        if (Math.abs(f2) <= 5.0F)
          this.zFN.cco = true;
        else
          f2 = -(float)(Math.abs(f2) - Math.pow(Math.sqrt(Math.abs(f2)) - 1.0D, 2.0D)) * 2.0F;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.MMGestureGallery.i.1
 * JD-Core Version:    0.6.2
 */