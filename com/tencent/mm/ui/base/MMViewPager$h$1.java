package com.tencent.mm.ui.base;

import android.graphics.Matrix;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class MMViewPager$h$1
  implements Runnable
{
  MMViewPager$h$1(MMViewPager.h paramh)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(106911);
    MMViewPager.a(this.yyF.yyC).getImageMatrix().getValues(this.yyF.v);
    float f1 = this.yyF.v[2];
    float f2 = MMViewPager.a(this.yyF.yyC).getScale() * MMViewPager.a(this.yyF.yyC).getImageWidth();
    if (f2 < MMViewPager.b(this.yyF.yyC));
    for (f2 = MMViewPager.b(this.yyF.yyC) / 2.0F - f2 / 2.0F; ; f2 = 0.0F)
    {
      f2 -= f1;
      if ((MMViewPager.a(this.yyF.yyC) instanceof WxImageView))
        f2 = -((WxImageView)MMViewPager.a(this.yyF.yyC)).getTranslationX();
      if (f2 >= 0.0F)
        this.yyF.cco = true;
      while (true)
      {
        MMViewPager.a(this.yyF.yyC).aj(f2, 0.0F);
        if ((MMViewPager.a(this.yyF.yyC) instanceof WxImageView))
          ((WxImageView)MMViewPager.a(this.yyF.yyC)).translate(f2, 0.0F);
        AppMethodBeat.o(106911);
        return;
        if (Math.abs(f2) <= 5.0F)
          this.yyF.cco = true;
        else
          f2 = -(float)(Math.abs(f2) - Math.pow(Math.sqrt(Math.abs(f2)) - 1.0D, 2.0D)) * 2.0F;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.MMViewPager.h.1
 * JD-Core Version:    0.6.2
 */