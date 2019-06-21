package com.tencent.mm.ui.base;

import android.view.View;
import android.view.View.OnLongClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class MMViewPager$3
  implements View.OnLongClickListener
{
  MMViewPager$3(MMViewPager paramMMViewPager)
  {
  }

  public final boolean onLongClick(View paramView)
  {
    AppMethodBeat.i(106899);
    if (MMViewPager.p(this.yyC) != null)
      MMViewPager.p(this.yyC).bvE();
    AppMethodBeat.o(106899);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.MMViewPager.3
 * JD-Core Version:    0.6.2
 */