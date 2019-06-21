package com.tencent.mm.ui.base;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class MMViewPager$2
  implements View.OnTouchListener
{
  MMViewPager$2(MMViewPager paramMMViewPager)
  {
  }

  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(106898);
    ab.d("MicroMsg.MMViewPager", "alvinluo onTouch getCurrentItem: %d", new Object[] { Integer.valueOf(this.yyC.getCurrentItem()) });
    if (MMViewPager.k(this.yyC) != null);
    for (boolean bool1 = MMViewPager.k(this.yyC).onTouch(paramView, paramMotionEvent); ; bool1 = false)
    {
      paramView = this.yyC.getSelectedImageView();
      if (paramView == null)
      {
        MMViewPager.a(this.yyC, paramMotionEvent);
        MMViewPager.b(this.yyC, null);
        MMViewPager.l(this.yyC).onTouchEvent(paramMotionEvent);
        if ((MMViewPager.m(this.yyC)) || (MMViewPager.n(this.yyC)))
        {
          AppMethodBeat.o(106898);
          bool1 = true;
        }
      }
      while (true)
      {
        return bool1;
        AppMethodBeat.o(106898);
        continue;
        MMViewPager.a(this.yyC, paramView);
        boolean bool2 = MMViewPager.c(this.yyC, paramMotionEvent);
        if (MMViewPager.o(this.yyC) != null)
          MMViewPager.o(this.yyC).recycle();
        MMViewPager.b(this.yyC, MotionEvent.obtainNoHistory(paramMotionEvent));
        MMViewPager.l(this.yyC).onTouchEvent(paramMotionEvent);
        this.yyC.computeScroll();
        if ((bool2) || (bool1))
        {
          AppMethodBeat.o(106898);
          bool1 = true;
        }
        else
        {
          AppMethodBeat.o(106898);
          bool1 = false;
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.MMViewPager.2
 * JD-Core Version:    0.6.2
 */