package com.tencent.mm.ui.base;

import android.graphics.Matrix;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class MMViewPager$f$1
  implements Runnable
{
  MMViewPager$f$1(MMViewPager.f paramf)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(106905);
    MMViewPager.a(this.yyD.yyC).getImageMatrix().getValues(this.yyD.v);
    float f1 = MMViewPager.a(this.yyD.yyC).getScale();
    float f2 = MMViewPager.a(this.yyD.yyC).getImageHeight() * f1;
    float f3 = this.yyD.v[5];
    f1 = MMViewPager.d(this.yyD.yyC);
    if (f2 < MMViewPager.d(this.yyD.yyC))
      f1 = MMViewPager.d(this.yyD.yyC) / 2.0F + f2 / 2.0F;
    f1 -= f3 + f2;
    if ((MMViewPager.a(this.yyD.yyC) instanceof WxImageView))
      f1 = -((WxImageView)MMViewPager.a(this.yyD.yyC)).getTranslationY();
    if (f1 <= 0.0F)
      this.yyD.cco = true;
    while (true)
    {
      MMViewPager.a(this.yyD.yyC).aj(0.0F, f1);
      if ((MMViewPager.a(this.yyD.yyC) instanceof WxImageView))
        ((WxImageView)MMViewPager.a(this.yyD.yyC)).translate(0.0F, f1);
      AppMethodBeat.o(106905);
      return;
      if (Math.abs(f1) <= 5.0F)
        this.yyD.cco = true;
      else
        f1 = (float)(Math.abs(f1) - Math.pow(Math.sqrt(Math.abs(f1)) - 1.0D, 2.0D)) * 2.0F;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.MMViewPager.f.1
 * JD-Core Version:    0.6.2
 */