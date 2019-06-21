package com.tencent.mm.ui.contact;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.b.a.ar;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.story.api.b;
import com.tencent.mm.plugin.story.api.e;
import com.tencent.mm.plugin.story.api.n;
import com.tencent.mm.plugin.story.g.h;
import com.tencent.mm.sdk.platformtools.bo;

final class CategoryTipView$1
  implements View.OnClickListener
{
  CategoryTipView$1(CategoryTipView paramCategoryTipView)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(33549);
    if (bo.az(CategoryTipView.a(this.zll)) < 1000L)
      AppMethodBeat.o(33549);
    while (true)
    {
      return;
      CategoryTipView.a(this.zll, bo.yz());
      if (CategoryTipView.b(this.zll))
      {
        paramView = h.scu;
        h.cAs().fC(CategoryTipView.c(this.zll));
        paramView = h.scu;
        h.cAs().cYQ = 6L;
        n.a(this.zll.getContext(), ((e)g.M(e.class)).getFavourUserChecker().cwT(), null, null);
      }
      AppMethodBeat.o(33549);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.CategoryTipView.1
 * JD-Core Version:    0.6.2
 */