package com.tencent.mm.ui.base;

import android.graphics.Matrix;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class MMViewPager$j$1
  implements Runnable
{
  MMViewPager$j$1(MMViewPager.j paramj)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(106917);
    MMViewPager.a(this.yyH.yyC).getImageMatrix().getValues(this.yyH.v);
    float f1 = this.yyH.v[5];
    float f2 = MMViewPager.a(this.yyH.yyC).getScale() * MMViewPager.a(this.yyH.yyC).getImageHeight();
    if (f2 < MMViewPager.d(this.yyH.yyC));
    for (f2 = MMViewPager.d(this.yyH.yyC) / 2.0F - f2 / 2.0F; ; f2 = 0.0F)
    {
      f2 -= f1;
      if ((MMViewPager.a(this.yyH.yyC) instanceof WxImageView))
        f2 = -((WxImageView)MMViewPager.a(this.yyH.yyC)).getTranslationY();
      if (f2 >= 0.0F)
        this.yyH.cco = true;
      while (true)
      {
        MMViewPager.a(this.yyH.yyC).aj(0.0F, f2);
        if ((MMViewPager.a(this.yyH.yyC) instanceof WxImageView))
          ((WxImageView)MMViewPager.a(this.yyH.yyC)).translate(0.0F, f2);
        AppMethodBeat.o(106917);
        return;
        if (Math.abs(f2) <= 5.0F)
          this.yyH.cco = true;
        else
          f2 = -(float)(Math.abs(f2) - Math.pow(Math.sqrt(Math.abs(f2)) - 1.0D, 2.0D)) * 2.0F;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.MMViewPager.j.1
 * JD-Core Version:    0.6.2
 */