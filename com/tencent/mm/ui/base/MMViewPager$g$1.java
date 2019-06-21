package com.tencent.mm.ui.base;

import android.graphics.Matrix;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class MMViewPager$g$1
  implements Runnable
{
  MMViewPager$g$1(MMViewPager.g paramg)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(106908);
    MMViewPager.a(this.yyE.yyC).getImageMatrix().getValues(this.yyE.v);
    float f1 = MMViewPager.a(this.yyE.yyC).getScale() * MMViewPager.a(this.yyE.yyC).getImageWidth();
    float f2 = MMViewPager.a(this.yyE.yyC).getScale();
    float f3 = MMViewPager.a(this.yyE.yyC).getImageHeight() * f2;
    float f4 = this.yyE.v[2];
    float f5 = this.yyE.v[5];
    float f6 = this.yyE.v[2];
    float f7 = this.yyE.v[5];
    float f8 = 0.0F;
    f2 = MMViewPager.d(this.yyE.yyC);
    float f9 = 0.0F;
    float f10 = MMViewPager.b(this.yyE.yyC);
    if (f3 < MMViewPager.d(this.yyE.yyC))
    {
      f8 = MMViewPager.d(this.yyE.yyC) / 2.0F - f3 / 2.0F;
      f2 = MMViewPager.d(this.yyE.yyC) / 2.0F + f3 / 2.0F;
    }
    while (true)
    {
      f8 -= f5;
      f2 -= f7 + f3;
      if (f8 < 0.0F)
        f2 = f8;
      while (true)
      {
        if (f1 < MMViewPager.b(this.yyE.yyC))
        {
          f10 = MMViewPager.b(this.yyE.yyC) / 2.0F;
          f9 = f1 / 2.0F;
          f8 = MMViewPager.b(this.yyE.yyC) / 2.0F + f1 / 2.0F;
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
            label339: if ((MMViewPager.a(this.yyE.yyC) instanceof WxImageView))
            {
              f8 = ((WxImageView)MMViewPager.a(this.yyE.yyC)).getTranslationX();
              f2 = ((WxImageView)MMViewPager.a(this.yyE.yyC)).getTranslationY();
            }
            if ((Math.abs(f8) <= 5.0F) && (Math.abs(f2) <= 5.0F))
              this.yyE.cco = true;
            while (true)
            {
              MMViewPager.a(this.yyE.yyC).aj(f8, f2);
              if ((MMViewPager.a(this.yyE.yyC) instanceof WxImageView))
                ((WxImageView)MMViewPager.a(this.yyE.yyC)).translate(-f8, -f2);
              AppMethodBeat.o(106908);
              return;
              if (f2 <= 0.0F)
                break label646;
              break;
              if (f8 <= 0.0F)
                break label633;
              break label339;
              if (f8 >= 0.0F);
              for (f8 = (float)(Math.abs(f8) - Math.pow(Math.sqrt(Math.abs(f8)) - 1.0D, 2.0D)) * 2.0F; ; f8 = -(float)(Math.abs(f8) - Math.pow(Math.sqrt(Math.abs(f8)) - 1.0D, 2.0D)) * 2.0F)
              {
                if (f2 < 0.0F)
                  break label603;
                f2 = (float)(Math.abs(f2) - Math.pow(Math.sqrt(Math.abs(f2)) - 1.0D, 2.0D)) * 2.0F;
                break;
              }
              label603: f2 = -(float)(Math.abs(f2) - Math.pow(Math.sqrt(Math.abs(f2)) - 1.0D, 2.0D)) * 2.0F;
            }
            label633: f8 = 0.0F;
          }
          f8 = f10;
        }
        label646: f2 = 0.0F;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.MMViewPager.g.1
 * JD-Core Version:    0.6.2
 */