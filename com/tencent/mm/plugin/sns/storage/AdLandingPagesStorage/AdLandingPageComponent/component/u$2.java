package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class u$2
  implements Runnable
{
  u$2(u paramu)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(37247);
    int i = this.rbA.cAw.getMeasuredWidth();
    if (i > this.rbA.ieu)
    {
      u localu = this.rbA;
      localu.rbs = ((i - localu.ieu) / 2);
      this.rbA.rbv.scrollBy(this.rbA.rbs, 0);
    }
    AppMethodBeat.o(37247);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.u.2
 * JD-Core Version:    0.6.2
 */