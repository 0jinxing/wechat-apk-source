package com.tencent.mm.ui.base;

import android.graphics.Matrix;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class MMViewPager$i$1
  implements Runnable
{
  MMViewPager$i$1(MMViewPager.i parami)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(106914);
    MMViewPager.a(this.yyG.yyC).getImageMatrix().getValues(this.yyG.v);
    float f1 = MMViewPager.a(this.yyG.yyC).getScale();
    float f2 = MMViewPager.a(this.yyG.yyC).getImageWidth() * f1;
    float f3 = this.yyG.v[2];
    f1 = MMViewPager.b(this.yyG.yyC);
    if (f2 < MMViewPager.b(this.yyG.yyC))
      f1 = MMViewPager.b(this.yyG.yyC) / 2.0F + f2 / 2.0F;
    f1 -= f3 + f2;
    if ((MMViewPager.a(this.yyG.yyC) instanceof WxImageView))
      f1 = -((WxImageView)MMViewPager.a(this.yyG.yyC)).getTranslationX();
    if (f1 <= 0.0F)
      this.yyG.cco = true;
    while (true)
    {
      MMViewPager.a(this.yyG.yyC).aj(f1, 0.0F);
      if ((MMViewPager.a(this.yyG.yyC) instanceof WxImageView))
        ((WxImageView)MMViewPager.a(this.yyG.yyC)).translate(f1, 0.0F);
      AppMethodBeat.o(106914);
      return;
      if (Math.abs(f1) <= 5.0F)
        this.yyG.cco = true;
      else
        f1 = (float)(Math.abs(f1) - Math.pow(Math.sqrt(Math.abs(f1)) - 1.0D, 2.0D)) * 2.0F;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.MMViewPager.i.1
 * JD-Core Version:    0.6.2
 */