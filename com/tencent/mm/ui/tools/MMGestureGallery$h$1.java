package com.tencent.mm.ui.tools;

import android.graphics.Matrix;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.MultiTouchImageView;

final class MMGestureGallery$h$1
  implements Runnable
{
  MMGestureGallery$h$1(MMGestureGallery.h paramh)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(107665);
    MMGestureGallery.a(this.zFM.zFK).getImageMatrix().getValues(this.zFM.v);
    float f1 = MMGestureGallery.a(this.zFM.zFK).getScale() * MMGestureGallery.a(this.zFM.zFK).getImageWidth();
    float f2 = MMGestureGallery.a(this.zFM.zFK).getScale();
    float f3 = MMGestureGallery.a(this.zFM.zFK).getImageHeight() * f2;
    float f4 = this.zFM.v[2];
    float f5 = this.zFM.v[5];
    float f6 = this.zFM.v[2];
    float f7 = this.zFM.v[5];
    float f8 = 0.0F;
    f2 = MMGestureGallery.d(this.zFM.zFK);
    float f9 = 0.0F;
    float f10 = MMGestureGallery.b(this.zFM.zFK);
    if (f3 < MMGestureGallery.d(this.zFM.zFK))
    {
      f8 = MMGestureGallery.d(this.zFM.zFK) / 2.0F - f3 / 2.0F;
      f2 = MMGestureGallery.d(this.zFM.zFK) / 2.0F + f3 / 2.0F;
    }
    while (true)
    {
      f8 -= f5;
      f2 -= f7 + f3;
      if (f8 < 0.0F)
        f2 = f8;
      while (true)
      {
        if (f1 < MMGestureGallery.b(this.zFM.zFK))
        {
          f10 = MMGestureGallery.b(this.zFM.zFK) / 2.0F;
          f9 = f1 / 2.0F;
          f8 = MMGestureGallery.b(this.zFM.zFK) / 2.0F + f1 / 2.0F;
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
            label329: if ((Math.abs(f8) <= 5.0F) && (Math.abs(f2) <= 5.0F))
              this.zFM.cco = true;
            while (true)
            {
              MMGestureGallery.a(this.zFM.zFK).aj(f8, f2);
              AppMethodBeat.o(107665);
              return;
              if (f2 <= 0.0F)
                break label546;
              break;
              if (f8 <= 0.0F)
                break label533;
              break label329;
              if (f8 >= 0.0F);
              for (f8 = (float)(Math.abs(f8) - Math.pow(Math.sqrt(Math.abs(f8)) - 1.0D, 2.0D)) * 2.0F; ; f8 = -(float)(Math.abs(f8) - Math.pow(Math.sqrt(Math.abs(f8)) - 1.0D, 2.0D)) * 2.0F)
              {
                if (f2 < 0.0F)
                  break label503;
                f2 = (float)(Math.abs(f2) - Math.pow(Math.sqrt(Math.abs(f2)) - 1.0D, 2.0D)) * 2.0F;
                break;
              }
              label503: f2 = -(float)(Math.abs(f2) - Math.pow(Math.sqrt(Math.abs(f2)) - 1.0D, 2.0D)) * 2.0F;
            }
            label533: f8 = 0.0F;
          }
          f8 = f10;
        }
        label546: f2 = 0.0F;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.MMGestureGallery.h.1
 * JD-Core Version:    0.6.2
 */