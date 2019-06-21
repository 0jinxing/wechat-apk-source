package com.tencent.mm.ui.base;

import android.support.v4.view.ViewPager.OnPageChangeListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class MMViewPager$1
  implements ViewPager.OnPageChangeListener
{
  MMViewPager$1(MMViewPager paramMMViewPager)
  {
  }

  public final void onPageScrollStateChanged(int paramInt)
  {
    AppMethodBeat.i(106897);
    if (MMViewPager.f(this.yyC) != null)
      MMViewPager.f(this.yyC).onPageScrollStateChanged(paramInt);
    if (paramInt == 0)
      MMViewPager.a(this.yyC, 0.0F);
    AppMethodBeat.o(106897);
  }

  public final void onPageScrolled(int paramInt1, float paramFloat, int paramInt2)
  {
    AppMethodBeat.i(106896);
    if (MMViewPager.f(this.yyC) != null)
      MMViewPager.f(this.yyC).onPageScrolled(paramInt1, paramFloat, paramInt2);
    MMViewPager.a(this.yyC, paramFloat);
    if ((paramInt2 == 0) && (MMViewPager.j(this.yyC) != -1))
      MMViewPager.c(this.yyC, MMViewPager.j(this.yyC));
    AppMethodBeat.o(106896);
  }

  public final void onPageSelected(int paramInt)
  {
    AppMethodBeat.i(106895);
    MMViewPager.a(this.yyC, MMViewPager.e(this.yyC));
    MMViewPager.b(this.yyC, paramInt);
    if (MMViewPager.f(this.yyC) != null)
      MMViewPager.f(this.yyC).onPageSelected(paramInt);
    if (MMViewPager.g(this.yyC))
    {
      MMViewPager.h(this.yyC);
      AppMethodBeat.o(106895);
    }
    while (true)
    {
      return;
      MMViewPager.i(this.yyC);
      AppMethodBeat.o(106895);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.MMViewPager.1
 * JD-Core Version:    0.6.2
 */